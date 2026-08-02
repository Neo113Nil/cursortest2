package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "toQrcSessionResultActionError", "(Lcom/paypal/oslo/feature/qrc/domain/error/QrcDataResultError;)Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScanQrCodeUseCaseKt {
    public static final com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error toQrcSessionResultActionError(com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError qrcDataResultError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcDataResultError, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(qrcDataResultError, com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.AcquisitionDataError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(qrcDataResultError, com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.Unknown.INSTANCE) || (qrcDataResultError instanceof com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.HttpError)) {
            return com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.GenericError.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(qrcDataResultError, com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.NoInternet.INSTANCE)) {
            return com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(qrcDataResultError, com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.RiskDecline.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(qrcDataResultError, com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError.InternalServerError.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.GenericError.INSTANCE;
    }
}
