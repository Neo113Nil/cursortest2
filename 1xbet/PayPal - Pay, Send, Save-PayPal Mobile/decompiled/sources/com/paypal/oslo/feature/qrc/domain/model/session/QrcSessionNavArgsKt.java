package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "toQrcSessionNavArgs", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSession;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcSessionNavArgsKt {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs toQrcSessionNavArgs(com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSession, "");
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs(qrcSession.getSessionId(), qrcSession.getMode(), qrcSession.getQrCodeType(), qrcSession.getPointOfInitiationMethod(), qrcSession.getProductFlow(), qrcSession.getRequiredAction(), qrcSession.getTransactionDetails(), qrcSession.getParticipants(), qrcSession.getTipDetails(), qrcSession.getPaypalWorldDetails(), qrcSession.getPayment(), qrcSession.getPaymentOptions());
    }
}
