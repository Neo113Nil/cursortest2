package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SdkAuthorizationFragment$onCreate$1$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Fragment got customer: ".concat(java.lang.String.valueOf(customerResponse)), null, 2, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse) {
        getHighResolutionOutputSizeshNQ4ISI(customerResponse);
        return kotlin.Unit.INSTANCE;
    }

    SdkAuthorizationFragment$onCreate$1$3(java.lang.Object obj) {
        super(1, obj, com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.class, "onCustomerResponse", "onCustomerResponse(Lcom/ingo/sdk/kotlin/common/features/customer/model/CustomerResponse;)V", 0);
    }
}
