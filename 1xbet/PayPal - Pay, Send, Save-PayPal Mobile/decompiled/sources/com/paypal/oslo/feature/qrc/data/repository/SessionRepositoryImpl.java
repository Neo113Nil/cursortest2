package com.paypal.oslo.feature.qrc.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/repository/SessionRepositoryImpl;", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "scanQrCode", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;", "sessionInfo", "", "isLastPollCall", "pollForSession", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PollingSessionInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SessionRepositoryImpl implements com.paypal.oslo.feature.qrc.domain.repository.SessionRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SessionRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3 A[Catch: ApolloException -> 0x0124, TryCatch #0 {ApolloException -> 0x0124, blocks: (B:11:0x0037, B:12:0x00d9, B:14:0x00e3, B:16:0x00f3, B:18:0x00f9, B:20:0x00ff, B:24:0x0106, B:26:0x010d, B:28:0x0111, B:30:0x011e, B:31:0x0123, B:35:0x0047), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010d A[Catch: ApolloException -> 0x0124, TryCatch #0 {ApolloException -> 0x0124, blocks: (B:11:0x0037, B:12:0x00d9, B:14:0x00e3, B:16:0x00f3, B:18:0x00f9, B:20:0x00ff, B:24:0x0106, B:26:0x010d, B:28:0x0111, B:30:0x011e, B:31:0x0123, B:35:0x0047), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object scanQrCode(com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.QrcSession>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$scanQrCode$1 sessionRepositoryImpl$scanQrCode$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession;
        arrow.core.Ior rightIor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$scanQrCode$1) {
                sessionRepositoryImpl$scanQrCode$1 = (com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$scanQrCode$1) continuation;
                if ((sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata = new com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata(null, null, null, null, null, null, null, null, null, null, scannedData.getGeoCountry(), null, 2559, null);
                        java.lang.String encodeToBase64 = com.paypal.oslo.feature.qrc.data.repository.UtilsKt.encodeToBase64(scannedData.getQrCode());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToBase64, "");
                        com.paypal.oslo.feature.qrc.graphql.type.ScanQRCodeInput scanQRCodeInput = new com.paypal.oslo.feature.qrc.graphql.type.ScanQRCodeInput(encodeToBase64, com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.paypal.oslo.feature.qrc.data.repository.UtilsKt.getSupportedActions(), com.paypal.oslo.feature.qrc.data.repository.UtilsKt.getSupportedWalletOperations(), com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.toInput(deviceMetadata), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(4)));
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.mutation(new com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation(scanQRCodeInput, com.apollographql.apollo.api.Optional.INSTANCE.absent())), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        sessionRepositoryImpl$scanQrCode$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(scannedData);
                        sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceMetadata);
                        sessionRepositoryImpl$scanQrCode$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(scanQRCodeInput);
                        sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoSizes = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, sessionRepositoryImpl$scanQrCode$1, 2, null);
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
                        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Data data = (com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) either).getValue()).getData();
                        com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.ScanQrCode scanQrCode = data != null ? data.getScanQrCode() : null;
                        return (scanQrCode == null || (qrcSession = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.toQrcSession(scanQrCode)) == null || (rightIor = arrow.core.IorKt.rightIor(qrcSession)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor;
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
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to scan QR code", e);
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        sessionRepositoryImpl$scanQrCode$1 = new com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$scanQrCode$1(this, continuation);
        java.lang.Object obj2 = sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepositoryImpl$scanQrCode$1.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: ApolloException -> 0x00e8, TryCatch #0 {ApolloException -> 0x00e8, blocks: (B:11:0x0035, B:12:0x009d, B:14:0x00a7, B:16:0x00b7, B:18:0x00bd, B:20:0x00c3, B:24:0x00ca, B:26:0x00d1, B:28:0x00d5, B:30:0x00e2, B:31:0x00e7, B:36:0x0046, B:38:0x004c, B:39:0x005f, B:42:0x0057), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1 A[Catch: ApolloException -> 0x00e8, TryCatch #0 {ApolloException -> 0x00e8, blocks: (B:11:0x0035, B:12:0x009d, B:14:0x00a7, B:16:0x00b7, B:18:0x00bd, B:20:0x00c3, B:24:0x00ca, B:26:0x00d1, B:28:0x00d5, B:30:0x00e2, B:31:0x00e7, B:36:0x0046, B:38:0x004c, B:39:0x005f, B:42:0x0057), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.qrc.domain.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object pollForSession(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError, com.paypal.oslo.feature.qrc.domain.model.session.QrcSession>> continuation) {
        com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$pollForSession$1 sessionRepositoryImpl$pollForSession$1;
        int i;
        com.apollographql.apollo.api.Optional.Absent absent;
        arrow.core.Either either;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession;
        arrow.core.Ior rightIor;
        try {
            if (continuation instanceof com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$pollForSession$1) {
                sessionRepositoryImpl$pollForSession$1 = (com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$pollForSession$1) continuation;
                if ((sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = sessionRepositoryImpl$pollForSession$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object[] objArr = 0;
                    java.lang.Object[] objArr2 = 0;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (z && pollingSessionInfo.isPayPalWorld()) {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeStatusResolution.TXN_LOOKUP);
                        } else {
                            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
                        }
                        com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionInput qRCodeSessionInput = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionInput(pollingSessionInfo.getSessionId(), absent);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.query(new com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery(qRCodeSessionInput, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pollingSessionInfo);
                        sessionRepositoryImpl$pollForSession$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(absent);
                        sessionRepositoryImpl$pollForSession$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qRCodeSessionInput);
                        sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRangesFor = z;
                        sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRanges = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, sessionRepositoryImpl$pollForSession$1, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = ((arrow.core.Ior) obj).toEither();
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data data = (com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) either).getValue()).getData();
                        com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.QrCodeSession qrCodeSession = data != null ? data.getQrCodeSession() : null;
                        return (qrCodeSession == null || (qrcSession = com.paypal.oslo.feature.qrc.data.mapper.QrcSessionMapperKt.toQrcSession(qrCodeSession)) == null || (rightIor = arrow.core.IorKt.rightIor(qrcSession)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) : rightIor;
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
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to poll for session", e);
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE);
        }
        sessionRepositoryImpl$pollForSession$1 = new com.paypal.oslo.feature.qrc.data.repository.SessionRepositoryImpl$pollForSession$1(this, continuation);
        java.lang.Object obj2 = sessionRepositoryImpl$pollForSession$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionRepositoryImpl$pollForSession$1.getHighSpeedVideoFpsRanges;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr22 = 0;
    }
}
