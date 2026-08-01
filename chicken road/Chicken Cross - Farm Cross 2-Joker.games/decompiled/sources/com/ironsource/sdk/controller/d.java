package com.ironsource.sdk.controller;

import com.ironsource.C4349c5;
import com.ironsource.C4430ge;
import com.ironsource.C4491k4;
import com.ironsource.C4567o8;
import com.ironsource.C4656t8;
import com.ironsource.C4710w8;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";

    /* renamed from: a, reason: collision with root package name */
    private long f8546a;
    private int b;
    private c c;
    private EnumC1336d d = EnumC1336d.NONE;
    private String e;
    private String f;
    private C4349c5 g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(U3.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8548a;

        static {
            int[] iArr = new int[c.values().length];
            f8548a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8548a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8548a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC1336d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a, reason: collision with root package name */
        private int f8550a;

        EnumC1336d(int i) {
            this.f8550a = i;
        }

        public int b() {
            return this.f8550a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, C4349c5 c4349c5) {
        int optInt = jSONObject.optInt(U3.a.j, -1);
        this.b = optInt;
        this.c = a(optInt);
        this.e = str;
        this.f = str2;
        this.g = c4349c5;
    }

    private c a(int i2) {
        return i2 != 1 ? i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C4710w8 g = g();
            if (g.exists()) {
                C4710w8 h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                IronSourceStorageUtils.renameFile(g.getPath(), h2.getPath());
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C4710w8 h() {
        return new C4710w8(this.e, "fallback_mobileController.html");
    }

    private C4710w8 i() {
        return new C4710w8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C4567o8 a2 = new C4567o8().a(C4761z5.y, Integer.valueOf(this.b));
        if (this.f8546a > 0) {
            a2.a(C4761z5.B, Long.valueOf(System.currentTimeMillis() - this.f8546a));
        }
        C4656t8.a(C4430ge.x, a2.a());
    }

    JSONObject f() throws JSONException {
        return new a();
    }

    C4710w8 g() {
        return new C4710w8(this.e, U3.f);
    }

    boolean k() {
        int i2 = b.f8548a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new C4710w8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new C4710w8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                C4710w8 g = g();
                C4710w8 i3 = i();
                if (!i3.exists() && !g.exists()) {
                    a(new C4710w8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!i3.exists() && g.exists()) {
                    EnumC1336d enumC1336d = EnumC1336d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC1336d;
                    a(enumC1336d);
                    a(new C4710w8(this.e, i3.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC1336d enumC1336d2 = EnumC1336d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC1336d2;
                    a(enumC1336d2);
                    d();
                    a(new C4710w8(this.e, i3.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C4710w8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC1336d enumC1336d3 = EnumC1336d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC1336d3;
                a(enumC1336d3);
                a(new C4710w8(this.e, i3.getName()));
                return true;
            } catch (Exception e) {
                C4491k4.d().a(e);
            }
        }
        return false;
    }

    boolean m() {
        return this.d != EnumC1336d.NONE;
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC1336d enumC1336d = EnumC1336d.CONTROLLER_FROM_SERVER;
        this.d = enumC1336d;
        a(enumC1336d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC1336d enumC1336d = EnumC1336d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC1336d;
            a(enumC1336d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C4710w8 c4710w8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c4710w8, this.f);
    }

    void a(C4567o8 c4567o8) {
        c4567o8.a(C4761z5.y, Integer.valueOf(this.b));
        C4656t8.a(C4430ge.v, c4567o8.a());
        this.f8546a = System.currentTimeMillis();
    }

    private void a(EnumC1336d enumC1336d) {
        C4567o8 a2 = new C4567o8().a(C4761z5.y, Integer.valueOf(this.b)).a(C4761z5.z, Integer.valueOf(enumC1336d.b()));
        if (this.f8546a > 0) {
            a2.a(C4761z5.B, Long.valueOf(System.currentTimeMillis() - this.f8546a));
        }
        C4656t8.a(C4430ge.w, a2.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C4491k4.d().a(e);
            return false;
        }
    }
}
