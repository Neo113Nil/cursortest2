package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/usecase/ScanQrCodeUseCase;", "", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "sessionRepository", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;", "qrcSessionResultResolver", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;", "scannedData", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;", "invoke", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/domain/repository/SessionRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/session/resolver/QrcSessionResultResolver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScanQrCodeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.repository.SessionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ScanQrCodeUseCase(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionResultResolver, "");
        this.getHighSpeedVideoFpsRanges = sessionRepository;
        this.getHighSpeedVideoSizes = qrcSessionResultResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r7 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>> continuation) {
        com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase$invoke$1 scanQrCodeUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase$invoke$1) {
            scanQrCodeUseCase$invoke$1 = (com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase$invoke$1) continuation;
            if ((scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = scanQrCodeUseCase$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository = this.getHighSpeedVideoFpsRanges;
                    scanQrCodeUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(scannedData);
                    scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                    obj = sessionRepository.scanQrCode(scannedData, scanQrCodeUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = scanQrCodeUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i3 = scanQrCodeUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either2 = ((arrow.core.Ior) obj).toEither();
                        if (either2 instanceof arrow.core.Either.Right) {
                            return arrow.core.IorKt.rightIor((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either2).getValue());
                        }
                        if (either2 instanceof arrow.core.Either.Left) {
                            return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either2).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    scannedData = (com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData) scanQrCodeUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSession) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver = this.getHighSpeedVideoSizes;
                    scanQrCodeUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(scannedData);
                    scanQrCodeUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    scanQrCodeUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(qrcSession);
                    scanQrCodeUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    scanQrCodeUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI = 2;
                    obj = qrcSessionResultResolver.resolve(qrcSession, scanQrCodeUseCase$invoke$1);
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCaseKt.toQrcSessionResultActionError((com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError) ((arrow.core.Either.Left) either).getValue()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        scanQrCodeUseCase$invoke$1 = new com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = scanQrCodeUseCase$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scanQrCodeUseCase$invoke$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
