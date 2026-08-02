package com.google.ads.mediation;

import L2.m;
import y2.n;

/* loaded from: classes.dex */
public final class c extends K2.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10506a;

    /* renamed from: b, reason: collision with root package name */
    public final m f10507b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f10506a = abstractAdViewAdapter;
        this.f10507b = mVar;
    }

    @Override // y2.e
    public final void onAdFailedToLoad(n nVar) {
        this.f10507b.onAdFailedToLoad(this.f10506a, nVar);
    }

    @Override // y2.e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        K2.a aVar = (K2.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f10506a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        m mVar = this.f10507b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, mVar));
        mVar.onAdLoaded(abstractAdViewAdapter);
    }
}
