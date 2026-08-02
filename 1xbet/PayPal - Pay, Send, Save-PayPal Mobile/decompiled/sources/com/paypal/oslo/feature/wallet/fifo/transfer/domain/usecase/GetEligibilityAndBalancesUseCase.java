package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/GetEligibilityAndBalancesUseCase;", "", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/repository/FIFORepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/repository/FIFORepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/usecase/EligibilityAndBalancesError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EligibilityAndBalancesResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/repository/FIFORepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetEligibilityAndBalancesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetEligibilityAndBalancesUseCase(com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository fIFORepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fIFORepository, "");
        this.getHighSpeedVideoFpsRangesFor = fIFORepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0044, B:12:0x00a4, B:14:0x00b3, B:17:0x00bb), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0044, B:12:0x00a4, B:14:0x00b3, B:17:0x00bb), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult>> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$1 getEligibilityAndBalancesUseCase$invoke$1;
        int i;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        kotlin.jvm.functions.Function2 function2;
        arrow.core.raise.RaiseCancellationException e;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$1) {
            getEligibilityAndBalancesUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$1) continuation;
            if ((getEligibilityAndBalancesUseCase$invoke$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                getEligibilityAndBalancesUseCase$invoke$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = getEligibilityAndBalancesUseCase$invoke$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getEligibilityAndBalancesUseCase$invoke$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlin.jvm.functions.Function2 function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase.m21303$r8$lambda$x5FgrCnHLroU9YePZ3SBwNav20((com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError) obj3, (com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise = new arrow.core.raise.IorRaise(function22, atomicReference, defaultRaise3);
                        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1 getEligibilityAndBalancesUseCase$invoke$3$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1(iorRaise, this, null);
                        getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoSizesFor = function22;
                        getEligibilityAndBalancesUseCase$invoke$1.getOutputFormats = atomicReference;
                        getEligibilityAndBalancesUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                        getEligibilityAndBalancesUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        getEligibilityAndBalancesUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iorRaise);
                        getEligibilityAndBalancesUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getEligibilityAndBalancesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getEligibilityAndBalancesUseCase$invoke$1.getOutputSizes = 1;
                        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(getEligibilityAndBalancesUseCase$invoke$3$1, getEligibilityAndBalancesUseCase$invoke$1);
                        if (coroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj2 = coroutineScope;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        function2 = function22;
                        e = e2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = getEligibilityAndBalancesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i5 = getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i6 = getEligibilityAndBalancesUseCase$invoke$1.Camera2StreamConfigurationMap;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) getEligibilityAndBalancesUseCase$invoke$1.getInputSizeshNQ4ISI;
                    atomicReference = (java.util.concurrent.atomic.AtomicReference) getEligibilityAndBalancesUseCase$invoke$1.getOutputFormats;
                    function2 = (kotlin.jvm.functions.Function2) getEligibilityAndBalancesUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult eligibilityAndBalancesResult = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult) obj2;
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference.get();
                return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(eligibilityAndBalancesResult) : new arrow.core.Ior.Both(obj3, eligibilityAndBalancesResult);
            }
        }
        getEligibilityAndBalancesUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$1(this, continuation);
        java.lang.Object obj22 = getEligibilityAndBalancesUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getEligibilityAndBalancesUseCase$invoke$1.getOutputSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult eligibilityAndBalancesResult2 = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult) obj22;
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj32 = atomicReference.get();
        if (obj32 != arrow.core.EmptyValue.INSTANCE) {
        }
    }

    /* renamed from: $r8$lambda$x-5FgrCnHLroU9YePZ3SBwNav20, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError m21303$r8$lambda$x5FgrCnHLroU9YePZ3SBwNav20(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError eligibilityAndBalancesError, com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError eligibilityAndBalancesError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityAndBalancesError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityAndBalancesError2, "");
        return eligibilityAndBalancesError;
    }
}
