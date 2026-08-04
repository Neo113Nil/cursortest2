package com.google.ads.mediation;

import B2.g;
import B2.h;
import B2.i;
import L2.o;
import p167y2.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p167y2.d implements i, h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f10511b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
        this.f10510a = abstractAdViewAdapter;
        this.f10511b = oVar;
    }

    @Override // p167y2.d
    public final void onAdClicked() {
        this.f10511b.onAdClicked(this.f10510a);
    }

    @Override // p167y2.d
    public final void onAdClosed() {
        this.f10511b.onAdClosed(this.f10510a);
    }

    @Override // p167y2.d
    public final void onAdFailedToLoad(n nVar) {
        this.f10511b.onAdFailedToLoad(this.f10510a, nVar);
    }

    @Override // p167y2.d
    public final void onAdImpression() {
        this.f10511b.onAdImpression(this.f10510a);
    }

    @Override // p167y2.d
    public final void onAdLoaded() {
    }

    @Override // p167y2.d
    public final void onAdOpened() {
        this.f10511b.onAdOpened(this.f10510a);
    }
}
