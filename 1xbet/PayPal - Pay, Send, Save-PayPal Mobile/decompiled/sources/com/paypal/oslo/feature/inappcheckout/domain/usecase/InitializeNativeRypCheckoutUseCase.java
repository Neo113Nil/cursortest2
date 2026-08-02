package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/InitializeNativeRypCheckoutUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "repository", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;", "formatSmartAuthAmountUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSmartAuthAmountUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InitializeNativeRypCheckoutUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository initializeNativeRypCheckoutRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeNativeRypCheckoutRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatSmartAuthAmountUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = initializeNativeRypCheckoutRepository;
        this.getHighSpeedVideoSizes = formatSmartAuthAmountUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r12 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase$invoke$1 initializeNativeRypCheckoutUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase$invoke$1) {
            initializeNativeRypCheckoutUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase$invoke$1) continuation;
            if ((initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository initializeNativeRypCheckoutRepository = this.getHighSpeedVideoFpsRangesFor;
                    initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    initializeNativeRypCheckoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = initializeNativeRypCheckoutRepository.executeDirectCall(str, str2, initializeNativeRypCheckoutUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        initializeNativeRypCheckoutResponseEntity = initializeNativeRypCheckoutResponseEntity2;
                        return arrow.core.EitherKt.right(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity.copy$default(initializeNativeRypCheckoutResponseEntity, null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) obj, null, 5, null));
                    }
                    str2 = (java.lang.String) initializeNativeRypCheckoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return either;
                }
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) ((arrow.core.Either.Right) either).getValue();
                com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelection = initializeNativeRypCheckoutResponseEntity3.getFundingSelection();
                initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                initializeNativeRypCheckoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoSizes = initializeNativeRypCheckoutResponseEntity3;
                initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap = 2;
                obj = formatSmartAuthAmountUseCase.invoke(fundingSelection, initializeNativeRypCheckoutUseCase$invoke$1);
                if (obj != coroutine_suspended) {
                    initializeNativeRypCheckoutResponseEntity = initializeNativeRypCheckoutResponseEntity3;
                    return arrow.core.EitherKt.right(com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity.copy$default(initializeNativeRypCheckoutResponseEntity, null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity) obj, null, 5, null));
                }
                return coroutine_suspended;
            }
        }
        initializeNativeRypCheckoutUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = initializeNativeRypCheckoutUseCase$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeNativeRypCheckoutUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase initializeNativeRypCheckoutUseCase, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "BILLING_TOKEN";
        }
        return initializeNativeRypCheckoutUseCase.invoke(str, str2, continuation);
    }
}
