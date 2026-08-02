package com.paypal.oslo.feature.businesscustomers.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl", f = "CustomersRepositoryImpl.kt", i = {0, 0, 0}, l = {111}, m = "searchCustomers", n = {"query", "searchQuery", "pageNumber"}, nl = {113}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CustomersRepositoryImpl$searchCustomers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.searchCustomers(null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomersRepositoryImpl$searchCustomers$1(com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl customersRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$searchCustomers$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = customersRepositoryImpl;
    }
}
