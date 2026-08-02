package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/AppGuidProviderImpl;", "Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;", "Lcom/paypal/oslo/core/appidentity/data/AppGUID;", "appGuid", "<init>", "(Lcom/paypal/oslo/core/appidentity/data/AppGUID;)V", "", "getAppGuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/data/AppGUID;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppGuidProviderImpl implements com.paypal.oslo.core.di.appguid.AppGuidProvider {
    private final com.paypal.oslo.core.appidentity.data.AppGUID getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AppGuidProviderImpl(com.paypal.oslo.core.appidentity.data.AppGUID appGUID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appGUID, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appGUID;
    }

    @Override // com.paypal.oslo.core.di.appguid.AppGuidProvider
    public final java.lang.Object getAppGuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue(continuation);
    }
}
