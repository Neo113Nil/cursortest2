package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/repository/PaymentRepositoryImpl;", "Lcom/paypal/oslo/feature/qrc/domain/repository/PaymentRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentPlanningRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "getQrcSession", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentPlanningRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/qrc/domain/model/confirmpayment/ConfirmQrcPaymentRequest;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "confirmQrcodePayment", "(Lcom/paypal/oslo/feature/qrc/domain/model/confirmpayment/ConfirmQrcPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/CancelQrcPaymentRequest;", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/CancelQrcPaymentResponse;", "cancelQrcodePayment", "(Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/CancelQrcPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentRepositoryImpl implements com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PaymentRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: Exception -> 0x0124, TRY_LEAVE, TryCatch #0 {Exception -> 0x0124, blocks: (B:11:0x002f, B:12:0x0076, B:14:0x007c, B:19:0x008d, B:21:0x009d, B:23:0x00a3, B:25:0x00a9, B:28:0x00b0, B:32:0x00bb, B:34:0x00cc, B:35:0x00d2, B:37:0x00de, B:39:0x00e7, B:41:0x00ee, B:43:0x00f2, B:46:0x00fd, B:48:0x0103, B:51:0x010c, B:53:0x0112, B:56:0x0119, B:59:0x011e, B:60:0x0123, B:64:0x003e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getQrcSession(com.paypal.oslo.feature.qrc.domain.model.review.PaymentPlanningRequest paymentPlanningRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.QrcSession>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$getQrcSession$1 paymentRepositoryImpl$getQrcSession$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession;
        arrow.core.Ior rightIor;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession2;
        arrow.core.Ior rightIor2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$getQrcSession$1) {
                paymentRepositoryImpl$getQrcSession$1 = (com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$getQrcSession$1) continuation;
                if ((paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionInput qRCodeSessionInput = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionInput(paymentPlanningRequest.getQrCodeReferenceId(), null, 2, null);
                        com.apollographql.apollo.ApolloCall query = this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery(qRCodeSessionInput, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toQRCodePaymentOptionsInput(paymentPlanningRequest))));
                        paymentRepositoryImpl$getQrcSession$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlanningRequest);
                        paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qRCodeSessionInput);
                        paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRanges = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(query, null, paymentRepositoryImpl$getQrcSession$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        return com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data data = (com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.QrCodeSession qrCodeSession = data != null ? data.getQrCodeSession() : null;
                        return (qrCodeSession == null || (qrcSession2 = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.toQrcSession(qrCodeSession)) == null || (rightIor2 = arrow.core.IorKt.rightIor(qrcSession2)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor2;
                    }
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data data2 = (com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                    com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.QrCodeSession qrCodeSession2 = data2 != null ? data2.getQrCodeSession() : null;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                    if ((callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) && com.paypal.oslo.feature.qrc.data.repository.UtilsKt.isRiskDecline((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError)) {
                        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline.INSTANCE);
                    }
                    if ((callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) && com.paypal.oslo.feature.qrc.data.repository.UtilsKt.isInternalServerError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError)) {
                        if ((qrCodeSession2 != null ? qrCodeSession2.getPaymentOptions() : null) == null) {
                            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError.INSTANCE);
                        }
                    }
                    return (qrCodeSession2 == null || (qrcSession = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.toQrcSession(qrCodeSession2)) == null || (rightIor = arrow.core.IorKt.rightIor(qrcSession)) == null) ? com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError(callError) : rightIor;
                }
            }
            if (i != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (java.lang.Exception unused) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        paymentRepositoryImpl$getQrcSession$1 = new com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$getQrcSession$1(this, continuation);
        java.lang.Object obj2 = paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRepositoryImpl$getQrcSession$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ff A[Catch: Exception -> 0x0159, TRY_LEAVE, TryCatch #0 {Exception -> 0x0159, blocks: (B:11:0x003a, B:13:0x00f9, B:15:0x00ff, B:20:0x0110, B:22:0x0120, B:24:0x0128, B:26:0x012e, B:29:0x0135, B:34:0x0140, B:36:0x014d, B:37:0x0152, B:41:0x004b, B:43:0x0053, B:44:0x005f, B:46:0x0065, B:48:0x006c, B:50:0x008d, B:51:0x0093, B:53:0x00ad, B:54:0x00b3, B:62:0x0153, B:63:0x0158), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object confirmQrcodePayment(com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest confirmQrcPaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$confirmQrcodePayment$1 paymentRepositoryImpl$confirmQrcodePayment$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;
        arrow.core.Ior rightIor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$confirmQrcodePayment$1) {
                paymentRepositoryImpl$confirmQrcodePayment$1 = (com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$confirmQrcodePayment$1) continuation;
                if ((paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId = confirmQrcPaymentRequest.getCaptureReferenceId();
                        if (captureReferenceId instanceof com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId) {
                            str = ((com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId) captureReferenceId).getSessionId();
                        } else {
                            if (!(captureReferenceId instanceof com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.QrCodeReferenceId)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            str = null;
                        }
                        java.lang.String fundingOptionId = confirmQrcPaymentRequest.getFundingOptionId();
                        if (fundingOptionId == null) {
                            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
                        }
                        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str);
                        com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                        com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRPaymentMethod = com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toQRPaymentMethod(confirmQrcPaymentRequest.getPaymentMethod());
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount = confirmQrcPaymentRequest.getPaymentAmount();
                        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion.presentIfNotNull(paymentAmount != null ? com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(paymentAmount) : null);
                        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(confirmQrcPaymentRequest.getTotalAmount()));
                        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney tipAmount = confirmQrcPaymentRequest.getTipAmount();
                        com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput confirmQRCodePaymentInput = new com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput(presentIfNotNull, absent, qRPaymentMethod, presentIfNotNull2, presentIfNotNull3, companion2.presentIfNotNull(tipAmount != null ? com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(tipAmount) : null), fundingOptionId, null, 128, null);
                        com.apollographql.apollo.ApolloCall mutation = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation(confirmQRCodePaymentInput));
                        paymentRepositoryImpl$confirmQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmQrcPaymentRequest);
                        paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        paymentRepositoryImpl$confirmQrcodePayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionId);
                        paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmQRCodePaymentInput);
                        paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRanges = 1;
                        confirmQrCodePayment = null;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(mutation, null, paymentRepositoryImpl$confirmQrcodePayment$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        confirmQrCodePayment = null;
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        return com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data data = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment2 = data != null ? data.getConfirmQrCodePayment() : confirmQrCodePayment;
                        return (confirmQrCodePayment2 == null || (paymentResponse = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.toPaymentResponse(confirmQrCodePayment2)) == null || (rightIor = arrow.core.IorKt.rightIor(paymentResponse)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor;
                    }
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.feature.qrc.data.repository.UtilsKt.parseError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue());
                }
            }
            if (i != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (java.lang.Exception unused) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        paymentRepositoryImpl$confirmQrcodePayment$1 = new com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$confirmQrcodePayment$1(this, continuation);
        java.lang.Object obj2 = paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRepositoryImpl$confirmQrcodePayment$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:11:0x002e, B:12:0x008a, B:14:0x0094, B:17:0x00a3, B:19:0x00a7, B:21:0x00b6, B:22:0x00bb, B:26:0x003d, B:28:0x005a, B:29:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3 A[Catch: Exception -> 0x00bc, TryCatch #0 {Exception -> 0x00bc, blocks: (B:11:0x002e, B:12:0x008a, B:14:0x0094, B:17:0x00a3, B:19:0x00a7, B:21:0x00b6, B:22:0x00bb, B:26:0x003d, B:28:0x005a, B:29:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelQrcodePayment(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest cancelQrcPaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentResponse>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$cancelQrcodePayment$1 paymentRepositoryImpl$cancelQrcodePayment$1;
        int i;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$cancelQrcodePayment$1) {
                paymentRepositoryImpl$cancelQrcodePayment$1 = (com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$cancelQrcodePayment$1) continuation;
                if ((paymentRepositoryImpl$cancelQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    paymentRepositoryImpl$cancelQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = paymentRepositoryImpl$cancelQrcodePayment$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = paymentRepositoryImpl$cancelQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cancelQrcPaymentRequest.getSessionId());
                        com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason reason = cancelQrcPaymentRequest.getReason();
                        com.paypal.oslo.feature.qrc.graphql.type.CancelQRCodePaymentInput cancelQRCodePaymentInput = new com.paypal.oslo.feature.qrc.graphql.type.CancelQRCodePaymentInput(presentIfNotNull, absent, companion.presentIfNotNull(reason != null ? com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toGraphQL(reason) : null));
                        com.apollographql.apollo.ApolloCall mutation = this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.qrc.graphql.CancelQrCodePaymentMutation(cancelQRCodePaymentInput));
                        paymentRepositoryImpl$cancelQrcodePayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelQrcPaymentRequest);
                        paymentRepositoryImpl$cancelQrcodePayment$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelQRCodePaymentInput);
                        paymentRepositoryImpl$cancelQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(mutation, null, paymentRepositoryImpl$cancelQrcodePayment$1, 2, null);
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
                        return arrow.core.IorKt.rightIor(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentResponse.INSTANCE);
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.IorKt.rightIor(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentResponse.INSTANCE);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (java.lang.Exception unused) {
            return arrow.core.IorKt.rightIor(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentResponse.INSTANCE);
        }
        paymentRepositoryImpl$cancelQrcodePayment$1 = new com.paypal.oslo.feature.qrc.data.repository.PaymentRepositoryImpl$cancelQrcodePayment$1(this, continuation);
        java.lang.Object obj2 = paymentRepositoryImpl$cancelQrcodePayment$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentRepositoryImpl$cancelQrcodePayment$1.getHighResolutionOutputSizeshNQ4ISI;
    }
}
