package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391ok {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14829a;

    /* renamed from: b, reason: collision with root package name */
    public final C1033gk f14830b;

    /* renamed from: c, reason: collision with root package name */
    public final Q4 f14831c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.a f14832d;

    /* renamed from: e, reason: collision with root package name */
    public final G.v f14833e;
    public final C1773x6 f;

    /* renamed from: g, reason: collision with root package name */
    public final Qw f14834g;

    /* renamed from: h, reason: collision with root package name */
    public final B8 f14835h;
    public final C1750wk i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f14836j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f14837k;

    /* renamed from: l, reason: collision with root package name */
    public final Nk f14838l;

    /* renamed from: m, reason: collision with root package name */
    public final C1482ql f14839m;

    /* renamed from: n, reason: collision with root package name */
    public final C1041gs f14840n;

    /* renamed from: o, reason: collision with root package name */
    public final Xm f14841o;

    /* renamed from: p, reason: collision with root package name */
    public final BinderC0857cn f14842p;

    /* renamed from: q, reason: collision with root package name */
    public final Xq f14843q;

    public C1391ok(Context context, C1033gk c1033gk, Q4 q42, U2.a aVar, G.v vVar, C1773x6 c1773x6, Qw qw, Wq wq, C1750wk c1750wk, Wk wk, ScheduledExecutorService scheduledExecutorService, C1482ql c1482ql, C1041gs c1041gs, Xm xm, Nk nk, BinderC0857cn binderC0857cn, Xq xq) {
        this.f14829a = context;
        this.f14830b = c1033gk;
        this.f14831c = q42;
        this.f14832d = aVar;
        this.f14833e = vVar;
        this.f = c1773x6;
        this.f14834g = qw;
        this.f14835h = wq.i;
        this.i = c1750wk;
        this.f14836j = wk;
        this.f14837k = scheduledExecutorService;
        this.f14839m = c1482ql;
        this.f14840n = c1041gs;
        this.f14841o = xm;
        this.f14838l = nk;
        this.f14842p = binderC0857cn;
        this.f14843q = xq;
    }

    public static Integer d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final Q2.H0 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new Q2.H0(optString, optString2);
    }

    public final E3.a a(JSONObject jSONObject, boolean z3) {
        if (jSONObject == null) {
            return Mw.f10750l;
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return Mw.f10750l;
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z3) {
            return AbstractC1400ot.c0(new BinderC1865z8(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        final C1033gk c1033gk = this.f14830b;
        c1033gk.f13639a.getClass();
        C0634Ld c0634Ld = new C0634Ld();
        T2.v.f5749a.g(new T2.u(optString, c0634Ld));
        C1582sw h02 = AbstractC1400ot.h0(AbstractC1400ot.h0(c0634Ld, new InterfaceC1311mu() { // from class: com.google.android.gms.internal.ads.fk
            @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
            public final Object apply(Object obj) {
                C1033gk c1033gk2 = C1033gk.this;
                c1033gk2.getClass();
                byte[] bArr = ((C1815y3) obj).f16387b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (optDouble * 160.0d);
                if (!optBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                A7 a7 = F7.M5;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    c1033gk2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i = options.outWidth * options.outHeight;
                    if (i > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) rVar.f5056c.a(F7.N5)).intValue())) / 2);
                    }
                }
                return c1033gk2.a(bArr, options);
            }
        }, c1033gk.f13641c), new InterfaceC1311mu() { // from class: com.google.android.gms.internal.ads.lk
            @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
            public final Object apply(Object obj) {
                return new BinderC1865z8(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.f14834g);
        return jSONObject.optBoolean("require") ? AbstractC1400ot.j0(h02, new N9(5, h02), AbstractC0613Id.f9544g) : AbstractC1400ot.X(h02, Exception.class, new C0727Yf(1), AbstractC0613Id.f9544g);
    }

    public final E3.a b(JSONArray jSONArray, boolean z3, boolean z5) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return AbstractC1400ot.c0(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z5 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(a(jSONArray.optJSONObject(i), z3));
        }
        return AbstractC1400ot.h0(new Aw(AbstractC1044gv.l(arrayList), true), new C1364o1(7), this.f14834g);
    }

    public final C1537rw c(JSONObject jSONObject, Lq lq, Nq nq) {
        Q2.a1 a1Var;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString("html");
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i = optInt;
        } else if (optInt2 == 0) {
            a1Var = Q2.a1.b();
            C1750wk c1750wk = this.i;
            c1750wk.getClass();
            C1537rw j02 = AbstractC1400ot.j0(Mw.f10750l, new C1346nk(c1750wk, a1Var, lq, nq, optString, optString2, 1), c1750wk.f16145b);
            return AbstractC1400ot.j0(j02, new C1301mk(j02, 0), AbstractC0613Id.f9544g);
        }
        a1Var = new Q2.a1(this.f14829a, new J2.i(i, optInt2));
        C1750wk c1750wk2 = this.i;
        c1750wk2.getClass();
        C1537rw j022 = AbstractC1400ot.j0(Mw.f10750l, new C1346nk(c1750wk2, a1Var, lq, nq, optString, optString2, 1), c1750wk2.f16145b);
        return AbstractC1400ot.j0(j022, new C1301mk(j022, 0), AbstractC0613Id.f9544g);
    }
}
