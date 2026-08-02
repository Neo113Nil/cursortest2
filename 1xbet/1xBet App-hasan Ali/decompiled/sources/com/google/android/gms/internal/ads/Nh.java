package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* loaded from: classes.dex */
public final /* synthetic */ class Nh implements Ei {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10802k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0387u0 f10803l;

    public /* synthetic */ Nh(int i, C0387u0 c0387u0) {
        this.f10802k = i;
        this.f10803l = c0387u0;
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public final void mo13k(Object obj) {
        switch (this.f10802k) {
            case 0:
                ((Ph) obj).l0(this.f10803l);
                break;
            default:
                ((Th) obj).q(this.f10803l);
                break;
        }
    }
}
