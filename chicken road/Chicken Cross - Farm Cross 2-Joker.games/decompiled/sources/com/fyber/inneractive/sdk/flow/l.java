package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class l implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdRequest f5360a;
    public final /* synthetic */ m b;

    public l(m mVar, InneractiveAdRequest inneractiveAdRequest) {
        this.b = mVar;
        this.f5360a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        m mVar = this.b;
        InneractiveAdRequest inneractiveAdRequest = this.f5360a;
        mVar.getClass();
        if (IAConfigManager.c()) {
            IAConfigManager.e();
            mVar.a(inneractiveAdRequest, mVar.c(), new InneractiveInfrastructureError(InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED, i.PURPOSE_1_DISABLED));
            m mVar2 = this.b;
            mVar2.getClass();
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(mVar2));
            return;
        }
        if (z) {
            this.b.c(this.f5360a);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(exc instanceof com.fyber.inneractive.sdk.network.b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR, i.NO_APP_CONFIG_AVAILABLE, exc);
        m mVar3 = this.b;
        mVar3.a(this.f5360a, mVar3.c(), inneractiveInfrastructureError);
    }
}
