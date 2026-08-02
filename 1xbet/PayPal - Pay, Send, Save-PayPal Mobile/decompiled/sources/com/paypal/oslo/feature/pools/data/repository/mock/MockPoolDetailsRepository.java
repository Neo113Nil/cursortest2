package com.paypal.oslo.feature.pools.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/mock/MockPoolDetailsRepository;", "Lcom/paypal/oslo/feature/pools/domain/repository/PoolDetailsRepository;", "<init>", "()V", "", "id", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPool", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockPoolDetailsRepository implements com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPoolDetailsRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPool(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, com.paypal.oslo.feature.pools.domain.models.Pool>> continuation) {
        com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository$getPool$1 mockPoolDetailsRepository$getPool$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository$getPool$1) {
            mockPoolDetailsRepository$getPool$1 = (com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository$getPool$1) continuation;
            if ((mockPoolDetailsRepository$getPool$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPoolDetailsRepository$getPool$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPoolDetailsRepository$getPool$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPoolDetailsRepository$getPool$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPoolDetailsRepository$getPool$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockPoolDetailsRepository$getPool$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPoolDetailsRepository$getPool$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData.INSTANCE.getBirthdayTripPool());
            }
        }
        mockPoolDetailsRepository$getPool$1 = new com.paypal.oslo.feature.pools.data.repository.mock.MockPoolDetailsRepository$getPool$1(this, continuation);
        java.lang.Object obj2 = mockPoolDetailsRepository$getPool$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPoolDetailsRepository$getPool$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(com.paypal.oslo.feature.pools.data.repository.mock.MockPoolData.INSTANCE.getBirthdayTripPool());
    }
}
