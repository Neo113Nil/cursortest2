package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1662um implements InterfaceC1434pi {

    /* renamed from: k, reason: collision with root package name */
    public final Context f15898k;

    /* renamed from: l, reason: collision with root package name */
    public final C1204kd f15899l;

    public C1662um(Context context, C1204kd c1204kd) {
        this.f15898k = context;
        this.f15899l = c1204kd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        if (TextUtils.isEmpty(((Nq) sq.f11596b.f13762m).f10826e)) {
            return;
        }
        C1204kd c1204kd = this.f15899l;
        Context context = this.f15898k;
        c1204kd.getClass();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8890r0)).booleanValue() && c1204kd.e(context) && C1204kd.g(context)) {
            synchronized (c1204kd.i) {
            }
        }
        this.f15899l.k(this.f15898k, "_aq", ((Nq) sq.f11596b.f13762m).f10826e, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
    }
}
