package com.paypal.oslo.feature.consumerprivacy.data.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl", f = "AccountVisibilityLabelProviderImpl.kt", i = {}, l = {22}, m = "isAccountDiscoverable", n = {}, nl = {30}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.isAccountDiscoverable(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1(com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl accountVisibilityLabelProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = accountVisibilityLabelProviderImpl;
    }
}
