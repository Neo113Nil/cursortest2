package com.vungle.ads.internal.presenter;

import com.vungle.ads.NetworkUnreachable;

/* loaded from: classes7.dex */
public final class h implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12090a;

    public h(r rVar) {
        this.f12090a = rVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI success");
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "send RI Failure");
        new NetworkUnreachable(com.iab.omid.library.vungle.internal.l.a("Error RI API calls: ").append(th != null ? th.getLocalizedMessage() : null).toString()).setLogEntry$vungle_ads_release(this.f12090a.b()).logErrorNoReturnValue$vungle_ads_release();
    }
}
