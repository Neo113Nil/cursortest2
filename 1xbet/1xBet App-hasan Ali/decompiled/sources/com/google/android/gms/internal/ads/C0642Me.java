package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642Me extends AbstractC0690Td {

    /* renamed from: m, reason: collision with root package name */
    public final C0848ce f10636m;

    /* renamed from: n, reason: collision with root package name */
    public U4 f10637n;

    /* renamed from: o, reason: collision with root package name */
    public C0711Wd f10638o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10639p;

    /* renamed from: q, reason: collision with root package name */
    public int f10640q;

    public C0642Me(Context context, C0848ce c0848ce) {
        super(context);
        this.f10640q = 1;
        this.f10639p = false;
        this.f10636m = c0848ce;
        c0848ce.a(this);
    }

    public final boolean E() {
        int i = this.f10640q;
        return (i == 1 || i == 2 || this.f10637n == null) ? false : true;
    }

    public final void F(int i) {
        C0937ee c0937ee = this.f11653l;
        C0848ce c0848ce = this.f10636m;
        if (i == 4) {
            c0848ce.b();
            c0937ee.f13320d = true;
            c0937ee.a();
        } else if (this.f10640q == 4) {
            c0848ce.f13016m = false;
            c0937ee.f13320d = false;
            c0937ee.a();
        }
        this.f10640q = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int j() {
        return E() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int k() {
        return E() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0893de
    public final void m() {
        if (this.f10637n != null) {
            this.f11653l.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long o() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long p() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final String r() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void s() {
        T2.G.m("AdImmersivePlayerView pause");
        if (E() && ((AtomicBoolean) this.f10637n.f11722l).get()) {
            ((AtomicBoolean) this.f10637n.f11722l).set(false);
            F(5);
            T2.L.f5672l.post(new RunnableC0635Le(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void t() {
        T2.G.m("AdImmersivePlayerView play");
        if (E()) {
            ((AtomicBoolean) this.f10637n.f11722l).set(true);
            F(4);
            this.f11652k.f12348c = true;
            T2.L.f5672l.post(new RunnableC0635Le(this, 1));
        }
    }

    @Override // android.view.View
    public final String toString() {
        return AbstractC0467k.v(C0642Me.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void u(int i) {
        T2.G.m("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void v(C0711Wd c0711Wd) {
        this.f10638o = c0711Wd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void w(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f10637n = new U4(11);
            F(3);
            T2.L.f5672l.post(new RunnableC0635Le(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void x() {
        T2.G.m("AdImmersivePlayerView stop");
        U4 u42 = this.f10637n;
        if (u42 != null) {
            ((AtomicBoolean) u42.f11722l).set(false);
            this.f10637n = null;
            F(1);
        }
        this.f10636m.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0690Td
    public final void z(float f, float f5) {
    }
}
