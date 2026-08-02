package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "toErrorIssue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorIssue;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;", "toErrorReason", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionErrorReason;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcSessionErrorReasonKt {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue toErrorIssue(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "COUNTRY_CODE_MISMATCH") ? com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue.COUNTRY_CODE_MISMATCH : kotlin.jvm.internal.Intrinsics.areEqual(str, "INVALID_QR_CODE") ? com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue.INVALID_QR_CODE : com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorIssue.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason toErrorReason(java.lang.String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1627922717) {
                if (hashCode != -445064594) {
                    if (hashCode == 1141576252 && str.equals(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED)) {
                        return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.SESSION_EXPIRED;
                    }
                } else if (str.equals("UNSUPPORTED_QR_TYPE")) {
                    return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.UNSUPPORTED_QR_TYPE;
                }
            } else if (str.equals("INVALID_QR_CODE")) {
                return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.INVALID_QR_CODE;
            }
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionErrorReason.UNKNOWN;
    }
}
