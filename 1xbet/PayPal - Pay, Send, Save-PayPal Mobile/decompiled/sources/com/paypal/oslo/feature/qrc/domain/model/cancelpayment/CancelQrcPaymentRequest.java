package com.paypal.oslo.feature.qrc.domain.model.cancelpayment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/CancelQrcPaymentRequest;", "", "", "sessionId", "qrCodeReferenceId", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;)Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/CancelQrcPaymentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSessionId", "getQrCodeReferenceId", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CancelQrcPaymentRequest {
    public static final int $stable = 0;
    private final java.lang.String qrCodeReferenceId;
    private final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason reason;
    private final java.lang.String sessionId;

    public CancelQrcPaymentRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.qrCodeReferenceId = str2;
        this.reason = qrcPaymentCancellationReason;
    }

    public /* synthetic */ CancelQrcPaymentRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : qrcPaymentCancellationReason);
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getQrCodeReferenceId() {
        return this.qrCodeReferenceId;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sessionId;
        java.lang.String str2 = this.qrCodeReferenceId;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelQrcPaymentRequest(sessionId=");
        sb.append(str);
        sb.append(", qrCodeReferenceId=");
        sb.append(str2);
        sb.append(", reason=");
        sb.append(qrcPaymentCancellationReason);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sessionId.hashCode();
        int hashCode2 = this.qrCodeReferenceId.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason = this.reason;
        return (((hashCode * 31) + hashCode2) * 31) + (qrcPaymentCancellationReason == null ? 0 : qrcPaymentCancellationReason.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest cancelQrcPaymentRequest = (com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, cancelQrcPaymentRequest.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeReferenceId, cancelQrcPaymentRequest.qrCodeReferenceId) && this.reason == cancelQrcPaymentRequest.reason;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest copy(java.lang.String sessionId, java.lang.String qrCodeReferenceId, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeReferenceId, "");
        return new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest(sessionId, qrCodeReferenceId, reason);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQrCodeReferenceId() {
        return this.qrCodeReferenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest copy$default(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.CancelQrcPaymentRequest cancelQrcPaymentRequest, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cancelQrcPaymentRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = cancelQrcPaymentRequest.qrCodeReferenceId;
        }
        if ((i & 4) != 0) {
            qrcPaymentCancellationReason = cancelQrcPaymentRequest.reason;
        }
        return cancelQrcPaymentRequest.copy(str, str2, qrcPaymentCancellationReason);
    }
}
