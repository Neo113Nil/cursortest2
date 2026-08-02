package com.google.ads.mediation;

import F2.InterfaceC0217a;
import L2.i;
import y2.n;

/* loaded from: classes.dex */
public final class b extends y2.d implements z2.e, InterfaceC0217a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10505b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f10504a = abstractAdViewAdapter;
        this.f10505b = iVar;
    }

    @Override // y2.d
    public final void onAdClicked() {
        this.f10505b.onAdClicked(this.f10504a);
    }

    @Override // y2.d
    public final void onAdClosed() {
        this.f10505b.onAdClosed(this.f10504a);
    }

    @Override // y2.d
    public final void onAdFailedToLoad(n nVar) {
        this.f10505b.onAdFailedToLoad(this.f10504a, nVar);
    }

    @Override // y2.d
    public final void onAdLoaded() {
        this.f10505b.onAdLoaded(this.f10504a);
    }

    @Override // y2.d
    public final void onAdOpened() {
        this.f10505b.onAdOpened(this.f10504a);
    }

    @Override // z2.e
    public final void onAppEvent(String str, String str2) {
        this.f10505b.zzb(this.f10504a, str, str2);
    }
}
