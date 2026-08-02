package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/repository/EnrollmentRepositoryImpl;", "Lcom/paypal/oslo/feature/qrc/domain/repository/EnrollmentRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibility;", "checkEligibility", "(Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentResult;", "enroll", "(Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrollmentRepositoryImpl implements com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public EnrollmentRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: ApolloException -> 0x00a6, TryCatch #0 {ApolloException -> 0x00a6, blocks: (B:11:0x002a, B:12:0x005b, B:14:0x0065, B:16:0x0075, B:18:0x007b, B:20:0x0081, B:24:0x0088, B:26:0x008f, B:28:0x0093, B:30:0x00a0, B:31:0x00a5, B:35:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: ApolloException -> 0x00a6, TryCatch #0 {ApolloException -> 0x00a6, blocks: (B:11:0x002a, B:12:0x005b, B:14:0x0065, B:16:0x0075, B:18:0x007b, B:20:0x0081, B:24:0x0088, B:26:0x008f, B:28:0x0093, B:30:0x00a0, B:31:0x00a5, B:35:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkEligibility(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest qrcEligibilityRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$checkEligibility$1 enrollmentRepositoryImpl$checkEligibility$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility qrcEligibility;
        arrow.core.Ior rightIor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$checkEligibility$1) {
                enrollmentRepositoryImpl$checkEligibility$1 = (com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$checkEligibility$1) continuation;
                if ((enrollmentRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    enrollmentRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = enrollmentRepositoryImpl$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = enrollmentRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall query = this.getHighSpeedVideoFpsRanges.query(new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery(com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(qrcEligibilityRequest)));
                        enrollmentRepositoryImpl$checkEligibility$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcEligibilityRequest);
                        enrollmentRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, enrollmentRepositoryImpl$checkEligibility$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = ((arrow.core.Ior) obj).toEither();
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data data = (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) either).getValue()).getData();
                        return (data == null || (consumerPresentedQrCodeEligibility = data.getConsumerPresentedQrCodeEligibility()) == null || (qrcEligibility = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.toQrcEligibility(consumerPresentedQrCodeEligibility)) == null || (rightIor = arrow.core.IorKt.rightIor(qrcEligibility)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor;
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to check QR code eligibility", e);
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        enrollmentRepositoryImpl$checkEligibility$1 = new com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = enrollmentRepositoryImpl$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enrollmentRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: ApolloException -> 0x00a6, TryCatch #0 {ApolloException -> 0x00a6, blocks: (B:11:0x002a, B:12:0x005b, B:14:0x0065, B:16:0x0075, B:18:0x007b, B:20:0x0081, B:24:0x0088, B:26:0x008f, B:28:0x0093, B:30:0x00a0, B:31:0x00a5, B:35:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: ApolloException -> 0x00a6, TryCatch #0 {ApolloException -> 0x00a6, blocks: (B:11:0x002a, B:12:0x005b, B:14:0x0065, B:16:0x0075, B:18:0x007b, B:20:0x0081, B:24:0x0088, B:26:0x008f, B:28:0x0093, B:30:0x00a0, B:31:0x00a5, B:35:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object enroll(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest qrcEnrollmentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentResult>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$enroll$1 enrollmentRepositoryImpl$enroll$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentResult qrcEnrollmentResult;
        arrow.core.Ior rightIor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$enroll$1) {
                enrollmentRepositoryImpl$enroll$1 = (com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$enroll$1) continuation;
                if ((enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = enrollmentRepositoryImpl$enroll$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall mutation = this.getHighSpeedVideoFpsRanges.mutation(new com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation(com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(qrcEnrollmentRequest)));
                        enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcEnrollmentRequest);
                        enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoFpsRanges = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(mutation, null, enrollmentRepositoryImpl$enroll$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = ((arrow.core.Ior) obj).toEither();
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data data = (com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) either).getValue()).getData();
                        return (data == null || (enrollConsumerPresentedQrCode = data.getEnrollConsumerPresentedQrCode()) == null || (qrcEnrollmentResult = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.toQrcEnrollmentResult(enrollConsumerPresentedQrCode)) == null || (rightIor = arrow.core.IorKt.rightIor(qrcEnrollmentResult)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor;
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to enroll consumer QR code", e);
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        enrollmentRepositoryImpl$enroll$1 = new com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl$enroll$1(this, continuation);
        java.lang.Object obj2 = enrollmentRepositoryImpl$enroll$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enrollmentRepositoryImpl$enroll$1.getHighSpeedVideoFpsRanges;
    }
}
