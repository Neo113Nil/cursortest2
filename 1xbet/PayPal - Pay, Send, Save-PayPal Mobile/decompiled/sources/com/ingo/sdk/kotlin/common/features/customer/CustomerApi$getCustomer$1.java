package com.ingo.sdk.kotlin.common.features.customer;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.customer.CustomerApi", f = "CustomerApi.kt", i = {0, 1, 1}, l = {65, 37}, m = "getCustomer", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class CustomerApi$getCustomer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.customer.CustomerApi Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getCustomer(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerApi$getCustomer$1(com.ingo.sdk.kotlin.common.features.customer.CustomerApi customerApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.customer.CustomerApi$getCustomer$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = customerApi;
    }
}
