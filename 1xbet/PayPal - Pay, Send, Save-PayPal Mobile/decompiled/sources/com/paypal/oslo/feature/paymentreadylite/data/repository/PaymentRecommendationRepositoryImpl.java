package com.paypal.oslo.feature.paymentreadylite.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\bH\u0096@¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/repository/PaymentRecommendationRepositoryImpl;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/repository/PaymentRecommendationRepository;", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationRemoteDataSource;", "remoteDataSource", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationLocalDataSource;", "localDataSource", "<init>", "(Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationRemoteDataSource;Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationLocalDataSource;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/error/PaymentRecommendationApiError;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendation;", "fetchPaymentRecommendation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/error/PaymentRecommendationDatabaseError;", "getLatestPaymentRecommendation", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;", "snapshot", "", "savePaymentRecommendationApiStatus", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentRecommendationData", "deleteAllPaymentRecommendation", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationRemoteDataSource;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationLocalDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationRepositoryImpl implements com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PaymentRecommendationRepositoryImpl(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource paymentRecommendationRemoteDataSource, com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource paymentRecommendationLocalDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationRemoteDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationLocalDataSource, "");
        this.getHighSpeedVideoSizes = paymentRecommendationRemoteDataSource;
        this.getHighSpeedVideoFpsRanges = paymentRecommendationLocalDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationApiError, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1 paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1) {
            paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1 = (com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1) continuation;
            if ((paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationRemoteDataSource paymentRecommendationRemoteDataSource = this.getHighSpeedVideoSizes;
                    paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = paymentRecommendationRemoteDataSource.fetchPaymentRecommendation(paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Either.Right(com.paypal.oslo.feature.paymentreadylite.data.mapper.PaymentRecommendationMapperKt.toDomain((com.paypal.oslo.feature.paymentreadylite.data.model.PaymentRecommendationResponse) ((arrow.core.Either.Right) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1 = new com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationRepositoryImpl$fetchPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLatestPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendation>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1 paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1) {
            paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1 = (com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1) continuation;
            if ((paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource paymentRecommendationLocalDataSource = this.getHighSpeedVideoFpsRanges;
                    paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = paymentRecommendationLocalDataSource.getLatestPaymentRecommendation(paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity paymentReadyRecommendationEntity = (com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity) ((arrow.core.Either.Right) either).getValue();
                    return new arrow.core.Either.Right(paymentReadyRecommendationEntity != null ? com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentReadyEntityMapperKt.toDomain(paymentReadyRecommendationEntity) : null);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1 = new com.paypal.oslo.feature.paymentreadylite.data.repository.PaymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationRepositoryImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @Override // com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository
    public final java.lang.Object savePaymentRecommendationApiStatus(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRanges.savePaymentRecommendationApiStatus(paymentRecommendationSnapshot, continuation);
    }

    @Override // com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository
    public final java.lang.Object savePaymentRecommendationData(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRanges.savePaymentRecommendationData(paymentRecommendationSnapshot, continuation);
    }

    @Override // com.paypal.oslo.feature.paymentreadylite.domain.repository.PaymentRecommendationRepository
    public final java.lang.Object deleteAllPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRanges.deleteAllPaymentRecommendation(continuation);
    }
}
