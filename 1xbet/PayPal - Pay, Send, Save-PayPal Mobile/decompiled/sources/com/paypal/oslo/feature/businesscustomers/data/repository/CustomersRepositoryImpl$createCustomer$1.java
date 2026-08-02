package com.paypal.oslo.feature.businesscustomers.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl", f = "CustomersRepositoryImpl.kt", i = {0, 0}, l = {145}, m = "createCustomer", n = {"customer", "mutation"}, nl = {146}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class CustomersRepositoryImpl$createCustomer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.createCustomer(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomersRepositoryImpl$createCustomer$1(com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl customersRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = customersRepositoryImpl;
    }
}
