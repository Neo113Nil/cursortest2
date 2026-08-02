package com.paypal.oslo.feature.businesscustomers.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl", f = "CustomersRepositoryImpl.kt", i = {0, 0}, l = {68}, m = "getCustomers", n = {"query", "pageNumber"}, nl = {70}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CustomersRepositoryImpl$getCustomers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getCustomers(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomersRepositoryImpl$getCustomers$1(com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl customersRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$getCustomers$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = customersRepositoryImpl;
    }
}
