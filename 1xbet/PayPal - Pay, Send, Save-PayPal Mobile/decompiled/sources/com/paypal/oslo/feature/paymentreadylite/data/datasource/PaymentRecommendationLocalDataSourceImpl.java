package com.paypal.oslo.feature.paymentreadylite.data.datasource;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\bH\u0096@¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationLocalDataSourceImpl;", "Lcom/paypal/oslo/feature/paymentreadylite/data/datasource/PaymentRecommendationLocalDataSource;", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyRecommendationDao;", "dao", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyApiStatusDao;", "apiStatusDao", "<init>", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyRecommendationDao;Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyApiStatusDao;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/error/PaymentRecommendationDatabaseError;", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;", "getLatestPaymentRecommendation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;", "snapshot", "", "savePaymentRecommendationApiStatus", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentRecommendationData", "deleteAllPaymentRecommendation", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyRecommendationDao;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyApiStatusDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationLocalDataSourceImpl implements com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PaymentRecommendationLocalDataSourceImpl(com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao, com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao paymentReadyApiStatusDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReadyRecommendationDao, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReadyApiStatusDao, "");
        this.getHighSpeedVideoFpsRanges = paymentReadyRecommendationDao;
        this.getHighSpeedVideoFpsRangesFor = paymentReadyApiStatusDao;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(2:16|17)(2:19|(2:21|22)(2:23|24))))|34|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r0 = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLatestPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1 paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1) {
            paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1 = (com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1) continuation;
            if ((paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao = this.getHighSpeedVideoFpsRanges;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor = 0;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoSizes = 0;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.Camera2StreamConfigurationMap = 0;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoFpsRanges = 0;
                    paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getOutputMinFrameDuration = 1;
                    obj = paymentReadyRecommendationDao.getLatestRecommendation(paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoFpsRanges;
                    int i3 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.Camera2StreamConfigurationMap;
                    int i4 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoSizes;
                    int i6 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                arrow.core.Either left = new arrow.core.Either.Right((com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity) obj);
                either = left;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImplKt.access$toDatabaseError((java.lang.Throwable) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1 = new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationLocalDataSourceImpl$getLatestPaymentRecommendation$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        arrow.core.Either left2 = new arrow.core.Either.Right((com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity) obj2);
        either = left2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(2:16|17)(2:19|(2:21|22)(2:23|24))))|34|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r7 = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object savePaymentRecommendationApiStatus(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1 paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1) {
            paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1 = (com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1) continuation;
            if ((paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputFormats -= 2147483648;
                java.lang.Object obj = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao paymentReadyApiStatusDao = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity apiStatusEntity = com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentReadyEntityMapperKt.toApiStatusEntity(paymentRecommendationSnapshot);
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRecommendationSnapshot);
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoFpsRangesFor = 0;
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.Camera2StreamConfigurationMap = 0;
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoSizes = 0;
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoFpsRanges = 0;
                    paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputFormats = 1;
                    if (paymentReadyApiStatusDao.save(apiStatusEntity, paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoFpsRanges;
                    int i3 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoSizes;
                    int i4 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.Camera2StreamConfigurationMap;
                    int i5 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighSpeedVideoFpsRangesFor;
                    int i6 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                arrow.core.Either left = new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
                either = left;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImplKt.access$toDatabaseError((java.lang.Throwable) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1 = new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationApiStatus$1.getInputFormats;
        if (i != 0) {
        }
        arrow.core.Either left2 = new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
        either = left2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(2:31|(1:33)))|12|13|14|(2:16|17)(2:19|(2:21|22)(2:23|24))))|36|6|7|(0)(0)|12|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r7 = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object savePaymentRecommendationData(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationSnapshot paymentRecommendationSnapshot, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1 paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1) {
            paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1 = (com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1) continuation;
            if ((paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity entity = com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentReadyEntityMapperKt.toEntity(paymentRecommendationSnapshot);
                    if (entity != null) {
                        com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao = this.getHighSpeedVideoFpsRanges;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRecommendationSnapshot);
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(entity);
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.Camera2StreamConfigurationMap = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoSizes = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoFpsRanges = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputFormats = 0;
                        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputMinFrameDuration = 1;
                        if (paymentReadyRecommendationDao.save(entity, paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputFormats;
                    int i3 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoFpsRanges;
                    int i4 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighSpeedVideoSizes;
                    int i6 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.Camera2StreamConfigurationMap;
                    int i7 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                arrow.core.Either left = new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
                either = left;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImplKt.access$toDatabaseError((java.lang.Throwable) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1 = new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationLocalDataSourceImpl$savePaymentRecommendationData$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        arrow.core.Either left2 = new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
        either = left2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|14|15|(2:17|18)(2:20|(2:22|23)(2:24|25)))(2:27|28))(2:29|30))(3:34|35|(2:37|33)(1:38))|31))|41|6|7|(0)(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r10.deleteAll(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        r0 = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteAllPaymentRecommendation(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentreadylite.domain.model.error.PaymentRecommendationDatabaseError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1 paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1;
        int i;
        arrow.core.Either.Companion companion;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (continuation instanceof com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1) {
            paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1 = (com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1) continuation;
            if ((paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    companion = arrow.core.Either.INSTANCE;
                    com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyApiStatusDao paymentReadyApiStatusDao = this.getHighSpeedVideoFpsRangesFor;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
                    i2 = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRanges = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.Camera2StreamConfigurationMap = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizes = 0;
                    paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats = 1;
                    if (paymentReadyApiStatusDao.deleteAll(paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizes;
                        int i8 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.Camera2StreamConfigurationMap;
                        int i9 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i10 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRanges;
                        int i11 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either left = new arrow.core.Either.Right(kotlin.Unit.INSTANCE);
                        arrow.core.Either either = left;
                        if (either instanceof arrow.core.Either.Left) {
                            return new arrow.core.Either.Left(com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImplKt.access$toDatabaseError((java.lang.Throwable) ((arrow.core.Either.Left) either).getValue()));
                        }
                        if (either instanceof arrow.core.Either.Right) {
                            return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i2 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizes;
                    i3 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.Camera2StreamConfigurationMap;
                    i4 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI;
                    i5 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRanges;
                    i6 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor;
                    companion = (arrow.core.Either.Companion) paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao = this.getHighSpeedVideoFpsRanges;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor = i6;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRanges = i5;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.Camera2StreamConfigurationMap = i3;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizes = i2;
                paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats = 2;
            }
        }
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1 = new com.paypal.oslo.feature.paymentreadylite.data.datasource.PaymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1(this, continuation);
        java.lang.Object obj2 = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.paymentreadylite.data.db.dao.PaymentReadyRecommendationDao paymentReadyRecommendationDao2 = this.getHighSpeedVideoFpsRanges;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(companion);
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRangesFor = i6;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoFpsRanges = i5;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighResolutionOutputSizeshNQ4ISI = i4;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.Camera2StreamConfigurationMap = i3;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getHighSpeedVideoSizes = i2;
        paymentRecommendationLocalDataSourceImpl$deleteAllPaymentRecommendation$1.getOutputFormats = 2;
    }
}
