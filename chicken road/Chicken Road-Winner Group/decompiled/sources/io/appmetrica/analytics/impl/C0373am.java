package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373am {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7004b;

    /* renamed from: c, reason: collision with root package name */
    public final Xl f7005c;

    /* renamed from: d, reason: collision with root package name */
    public List f7006d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7007e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7008g;

    /* renamed from: h, reason: collision with root package name */
    public long f7009h;

    /* renamed from: i, reason: collision with root package name */
    public final C0366af f7010i;

    /* renamed from: j, reason: collision with root package name */
    public final P f7011j;

    /* renamed from: k, reason: collision with root package name */
    public final K3 f7012k;

    /* renamed from: l, reason: collision with root package name */
    public final E6 f7013l;

    /* renamed from: m, reason: collision with root package name */
    public final C0361aa f7014m;

    /* renamed from: n, reason: collision with root package name */
    public final Z9 f7015n;

    /* renamed from: o, reason: collision with root package name */
    public final C0814ro f7016o;

    public C0373am(Context context, C0366af c0366af) {
        this(c0366af, new P(), new K3(), C0587j4.l().a(context), new E6(), new C0361aa(), new Z9(), new C0814ro());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8.f7008g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z3;
        boolean z4;
        try {
            Set other = AbstractC0528gm.f7390a;
            kotlin.jvm.internal.j.e(list, "<this>");
            kotlin.jvm.internal.j.e(other, "other");
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            linkedHashSet.retainAll(other);
            boolean a3 = a(linkedHashSet);
            Iterator it = list.iterator();
            while (true) {
                z3 = false;
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (this.f7003a.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            boolean z5 = AbstractC0528gm.f7391b.currentTimeSeconds() > this.f7009h;
            if (a3 && !z4 && !z5) {
            }
            z3 = true;
        } finally {
        }
        return z3;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f7004b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C0814ro c0814ro = this.f7016o;
            String str = identifiersResult.id;
            c0814ro.getClass();
            if (C0814ro.a(str)) {
                this.f7004b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C0413ca c0413ca;
        C0366af d3 = this.f7010i.i((IdentifiersResult) this.f7004b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f7004b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f7004b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f7004b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f7004b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult) this.f7004b.get("appmetrica_clids")).j(Jm.a((Map) this.f7007e)).f((IdentifiersResult) this.f7004b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f7004b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f7004b.get("appmetrica_yandex_adv_id")).b(this.f7008g).c(this.f7013l.f5899d).d(this.f7009h);
        C0361aa c0361aa = this.f7014m;
        synchronized (c0361aa) {
            c0413ca = c0361aa.f6961b;
        }
        d3.a(c0413ca).b();
    }

    public C0373am(C0366af c0366af, P p3, K3 k3, Cd cd, E6 e6, C0361aa c0361aa, Z9 z9, C0814ro c0814ro) {
        HashSet hashSet = new HashSet();
        this.f7003a = hashSet;
        this.f7004b = new HashMap();
        this.f7005c = new Xl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f7010i = c0366af;
        this.f7011j = p3;
        this.f7012k = k3;
        this.f7013l = e6;
        this.f7014m = c0361aa;
        this.f7015n = z9;
        this.f7016o = c0814ro;
        c(cd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c0366af.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c0366af.i());
        a("appmetrica_get_ad_url", c0366af.d());
        a("appmetrica_report_ad_url", c0366af.e());
        b(c0366af.o());
        a("appmetrica_google_adv_id", c0366af.l());
        a("appmetrica_huawei_oaid", c0366af.m());
        a("appmetrica_yandex_adv_id", c0366af.r());
        e6.a(c0366af.h());
        c0361aa.a(c0366af.k());
        this.f7006d = c0366af.g();
        String i3 = c0366af.i((String) null);
        this.f7007e = i3 != null ? Jm.a(i3) : null;
        this.f7008g = c0366af.a(true);
        this.f = c0366af.b(0L);
        this.f7009h = c0366af.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7004b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC0711no.a((Map) this.f7007e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.f7004b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f7004b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f7013l.f5898c.get(str2);
                }
                if (identifiersResult == null) {
                    C0413ca c0413ca = this.f7014m.f6961b;
                    if (!kotlin.jvm.internal.j.a(str2, "appmetrica_lib_ssl_enabled") || (bool = c0413ca.f7100a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c0413ca.f7101b;
                        String str3 = c0413ca.f7102c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new T0.b();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f7008g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0711no.a((Map) this.f7007e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
