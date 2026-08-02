package com.ingo.sdk.kotlin.common.features.transaction_status;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0013\u001a\u00020\u00108CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/model/TransactionStatusResponse;", "", "", "pollingInterval", "<init>", "(J)V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoFpsRangesFor", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionStatusUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse, java.lang.String> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ TransactionStatusUseCase(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j);
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((java.lang.String) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse>>) continuation);
    }

    public TransactionStatusUseCase(long j) {
        super(0L, 1, null);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase.$r8$lambda$XTOfZPZq3OogEyskhUyP6VjB4ic();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r0) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$run$1 transactionStatusUseCase$run$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$run$1) {
            transactionStatusUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$run$1) continuation;
            if ((transactionStatusUseCase$run$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                transactionStatusUseCase$run$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = transactionStatusUseCase$run$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionStatusUseCase$run$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                    long j = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Running TransactionStatusUseCase ");
                    sb.append(str);
                    sb.append(" delaying ");
                    sb.append(j);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
                    long j2 = this.getHighSpeedVideoFpsRangesFor;
                    transactionStatusUseCase$run$1.getHighSpeedVideoFpsRangesFor = str;
                    transactionStatusUseCase$run$1.getHighSpeedVideoSizes = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    str = (java.lang.String) transactionStatusUseCase$run$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Running TransactionStatusUseCase ");
                sb2.append(str);
                sb2.append(" delay complete");
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, sb2.toString(), null, 2, null);
                com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository transactionStatusRepository = (com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository) this.getHighSpeedVideoSizes.getValue();
                transactionStatusUseCase$run$1.getHighSpeedVideoFpsRangesFor = null;
                transactionStatusUseCase$run$1.getHighSpeedVideoSizes = 2;
                java.lang.Object transactionStatus = transactionStatusRepository.getTransactionStatus(str, transactionStatusUseCase$run$1);
                return transactionStatus != coroutine_suspended ? coroutine_suspended : transactionStatus;
            }
        }
        transactionStatusUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$run$1(this, continuation);
        java.lang.Object obj2 = transactionStatusUseCase$run$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionStatusUseCase$run$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging22 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Running TransactionStatusUseCase ");
        sb22.append(str);
        sb22.append(" delay complete");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging22, sb22.toString(), null, 2, null);
        com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository transactionStatusRepository2 = (com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository) this.getHighSpeedVideoSizes.getValue();
        transactionStatusUseCase$run$1.getHighSpeedVideoFpsRangesFor = null;
        transactionStatusUseCase$run$1.getHighSpeedVideoSizes = 2;
        java.lang.Object transactionStatus2 = transactionStatusRepository2.getTransactionStatus(str, transactionStatusUseCase$run$1);
        if (transactionStatus2 != coroutine_suspended2) {
        }
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository $r8$lambda$XTOfZPZq3OogEyskhUyP6VjB4ic() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository");
    }

    public TransactionStatusUseCase() {
        this(0L, 1, null);
    }
}
