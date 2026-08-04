package com.google.ads.mediation;

import L2.m;
import p167y2.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends K2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10507b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f10506a = abstractAdViewAdapter;
        this.f10507b = mVar;
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(n nVar) {
        this.f10507b.onAdFailedToLoad(this.f10506a, nVar);
    }

    @Override // p167y2.e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        K2.a aVar = (K2.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f10506a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        m mVar = this.f10507b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, mVar));
        mVar.onAdLoaded(abstractAdViewAdapter);
    }
}
