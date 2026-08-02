package com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/replenishment/payair/PayairReplenishPaymentKeysUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;", "paymentManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "networkTokenReference", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/replenishment/ReplenishPaymentKeysError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payair/PayairPaymentManagerRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairReplenishPaymentKeysUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayairReplenishPaymentKeysUseCase(com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository payairPaymentManagerRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairPaymentManagerRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = payairPaymentManagerRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public /* synthetic */ PayairReplenishPaymentKeysUseCase(com.paypal.oslo.feature.taptopay.domain.repository.payair.PayairPaymentManagerRepository payairPaymentManagerRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(payairPaymentManagerRepository, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.replenishment.ReplenishPaymentKeysError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$1 payairReplenishPaymentKeysUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$1) {
            payairReplenishPaymentKeysUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$1) continuation;
            if ((payairReplenishPaymentKeysUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                payairReplenishPaymentKeysUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = payairReplenishPaymentKeysUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairReplenishPaymentKeysUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$2$1 payairReplenishPaymentKeysUseCase$invoke$2$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$2$1(this, str, defaultRaise3, null);
                        payairReplenishPaymentKeysUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise;
                        payairReplenishPaymentKeysUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        payairReplenishPaymentKeysUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        payairReplenishPaymentKeysUseCase$invoke$1.getInputFormats = 1;
                        if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, payairReplenishPaymentKeysUseCase$invoke$2$1, payairReplenishPaymentKeysUseCase$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = payairReplenishPaymentKeysUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i5 = payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) payairReplenishPaymentKeysUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        defaultRaise = defaultRaise2;
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        defaultRaise = defaultRaise2;
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise2.complete();
                return new arrow.core.Either.Right(unit);
            }
        }
        payairReplenishPaymentKeysUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payairReplenishPaymentKeysUseCase$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairReplenishPaymentKeysUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise2.complete();
        return new arrow.core.Either.Right(unit2);
    }
}
