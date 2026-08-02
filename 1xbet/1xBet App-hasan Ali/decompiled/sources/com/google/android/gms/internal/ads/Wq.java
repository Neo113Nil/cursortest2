package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Wq {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.V0 f12095a;

    /* renamed from: b, reason: collision with root package name */
    public final X9 f12096b;

    /* renamed from: c, reason: collision with root package name */
    public final Eo f12097c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.X0 f12098d;

    /* renamed from: e, reason: collision with root package name */
    public final Q2.a1 f12099e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12100g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12101h;
    public final B8 i;

    /* renamed from: j, reason: collision with root package name */
    public final Q2.d1 f12102j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12103k;

    /* renamed from: l, reason: collision with root package name */
    public final M2.a f12104l;

    /* renamed from: m, reason: collision with root package name */
    public final M2.d f12105m;

    /* renamed from: n, reason: collision with root package name */
    public final Q2.Q f12106n;

    /* renamed from: o, reason: collision with root package name */
    public final f2.m f12107o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12108p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12109q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12110r;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f12111s;

    /* renamed from: t, reason: collision with root package name */
    public final Q2.U f12112t;

    public Wq(Vq vq) {
        this.f12099e = vq.f11944b;
        this.f = vq.f11945c;
        this.f12112t = vq.f11961u;
        Q2.X0 x02 = vq.f11943a;
        int i = x02.f4957k;
        boolean z3 = true;
        if (!x02.f4964r && !vq.f11947e) {
            z3 = false;
        }
        boolean z5 = z3;
        int t5 = T2.L.t(x02.f4954G);
        Q2.X0 x03 = vq.f11943a;
        this.f12098d = new Q2.X0(i, x02.f4958l, x02.f4959m, x02.f4960n, x02.f4961o, x02.f4962p, x02.f4963q, z5, x02.f4965s, x02.f4966t, x02.f4967u, x02.f4968v, x02.f4969w, x02.f4970x, x02.f4971y, x02.f4972z, x02.f4948A, x02.f4949B, x02.f4950C, x02.f4951D, x02.f4952E, x02.f4953F, t5, x03.f4955H, x03.f4956I, x03.J);
        Q2.V0 v02 = vq.f11946d;
        B8 b8 = null;
        if (v02 == null) {
            B8 b82 = vq.f11949h;
            v02 = b82 != null ? b82.f7775p : null;
        }
        this.f12095a = v02;
        ArrayList arrayList = vq.f;
        this.f12100g = arrayList;
        this.f12101h = vq.f11948g;
        if (arrayList != null && (b8 = vq.f11949h) == null) {
            b8 = new B8(new M2.c(new M2.c()));
        }
        this.i = b8;
        this.f12102j = vq.i;
        this.f12103k = vq.f11953m;
        this.f12104l = vq.f11950j;
        this.f12105m = vq.f11951k;
        this.f12106n = vq.f11952l;
        this.f12096b = vq.f11954n;
        this.f12107o = new f2.m(vq.f11955o);
        this.f12108p = vq.f11956p;
        this.f12109q = vq.f11957q;
        this.f12097c = vq.f11958r;
        this.f12110r = vq.f11959s;
        this.f12111s = vq.f11960t;
    }

    public final InterfaceC1059h9 a() {
        M2.a aVar = this.f12104l;
        M2.d dVar = this.f12105m;
        if (dVar == null && aVar == null) {
            return null;
        }
        if (dVar != null) {
            IBinder iBinder = dVar.f3614m;
            if (iBinder == null) {
                return null;
            }
            int i = AbstractBinderC1014g9.f13570k;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
            return queryLocalInterface instanceof InterfaceC1059h9 ? (InterfaceC1059h9) queryLocalInterface : new C0969f9(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener", 0);
        }
        IBinder iBinder2 = aVar.f3605l;
        if (iBinder2 == null) {
            return null;
        }
        int i5 = AbstractBinderC1014g9.f13570k;
        IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface2 instanceof InterfaceC1059h9 ? (InterfaceC1059h9) queryLocalInterface2 : new C0969f9(iBinder2, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener", 0);
    }

    public final boolean b() {
        return this.f.matches((String) Q2.r.f5053d.f5056c.a(F7.e3));
    }
}
