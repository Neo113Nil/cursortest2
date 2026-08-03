package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class l implements com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.external.InneractiveAdRequest f3707a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.m b;

    public l(com.fyber.inneractive.sdk.flow.m mVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        this.b = mVar;
        this.f3707a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, boolean z, java.lang.Exception exc) {
        com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(this);
        if (z) {
            this.b.c(this.f3707a);
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(exc instanceof com.fyber.inneractive.sdk.network.b ? com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR : com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE, exc);
        com.fyber.inneractive.sdk.flow.m mVar = this.b;
        mVar.a(this.f3707a, mVar.c(), inneractiveInfrastructureError);
    }
}
