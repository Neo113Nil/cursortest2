package com.paypal.oslo.feature.qrc.domain.model.confirmpayment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/confirmpayment/ConfirmQrcPaymentRequest;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "captureReferenceId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "paymentMethod", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "paymentAmount", "tipAmount", "totalAmount", "", "isEnrollmentRequired", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Z)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "component5", "component6", "component7", "()Z", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;Z)Lcom/paypal/oslo/feature/qrc/domain/model/confirmpayment/ConfirmQrcPaymentRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CaptureReferenceId;", "getCaptureReferenceId", "Ljava/lang/String;", "getFundingOptionId", "getPaymentMethod", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "getPaymentAmount", "getTipAmount", "getTotalAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ConfirmQrcPaymentRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId;
    private final java.lang.String fundingOptionId;
    private final boolean isEnrollmentRequired;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount;
    private final java.lang.String paymentMethod;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney tipAmount;
    private final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount;

    public ConfirmQrcPaymentRequest(com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcMoney3, "");
        this.captureReferenceId = captureReferenceId;
        this.fundingOptionId = str;
        this.paymentMethod = str2;
        this.paymentAmount = qrcMoney;
        this.tipAmount = qrcMoney2;
        this.totalAmount = qrcMoney3;
        this.isEnrollmentRequired = z;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId getCaptureReferenceId() {
        return this.captureReferenceId;
    }

    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final java.lang.String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getPaymentAmount() {
        return this.paymentAmount;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getTipAmount() {
        return this.tipAmount;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean isEnrollmentRequired() {
        return this.isEnrollmentRequired;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId = this.captureReferenceId;
        java.lang.String str = this.fundingOptionId;
        java.lang.String str2 = this.paymentMethod;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.paymentAmount;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = this.tipAmount;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3 = this.totalAmount;
        boolean z = this.isEnrollmentRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmQrcPaymentRequest(captureReferenceId=");
        sb.append(captureReferenceId);
        sb.append(", fundingOptionId=");
        sb.append(str);
        sb.append(", paymentMethod=");
        sb.append(str2);
        sb.append(", paymentAmount=");
        sb.append(qrcMoney);
        sb.append(", tipAmount=");
        sb.append(qrcMoney2);
        sb.append(", totalAmount=");
        sb.append(qrcMoney3);
        sb.append(", isEnrollmentRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.captureReferenceId.hashCode();
        java.lang.String str = this.fundingOptionId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.paymentMethod.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = this.paymentAmount;
        int hashCode4 = qrcMoney == null ? 0 : qrcMoney.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = this.tipAmount;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (qrcMoney2 != null ? qrcMoney2.hashCode() : 0)) * 31) + this.totalAmount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isEnrollmentRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest confirmQrcPaymentRequest = (com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.captureReferenceId, confirmQrcPaymentRequest.captureReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, confirmQrcPaymentRequest.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethod, confirmQrcPaymentRequest.paymentMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmount, confirmQrcPaymentRequest.paymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.tipAmount, confirmQrcPaymentRequest.tipAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, confirmQrcPaymentRequest.totalAmount) && this.isEnrollmentRequired == confirmQrcPaymentRequest.isEnrollmentRequired;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest copy(com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId, java.lang.String fundingOptionId, java.lang.String paymentMethod, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney tipAmount, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount, boolean isEnrollmentRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        return new com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest(captureReferenceId, fundingOptionId, paymentMethod, paymentAmount, tipAmount, totalAmount, isEnrollmentRequired);
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEnrollmentRequired() {
        return this.isEnrollmentRequired;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getPaymentAmount() {
        return this.paymentAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId getCaptureReferenceId() {
        return this.captureReferenceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest copy$default(com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest confirmQrcPaymentRequest, com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId captureReferenceId, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            captureReferenceId = confirmQrcPaymentRequest.captureReferenceId;
        }
        if ((i & 2) != 0) {
            str = confirmQrcPaymentRequest.fundingOptionId;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = confirmQrcPaymentRequest.paymentMethod;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            qrcMoney = confirmQrcPaymentRequest.paymentAmount;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney4 = qrcMoney;
        if ((i & 16) != 0) {
            qrcMoney2 = confirmQrcPaymentRequest.tipAmount;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney5 = qrcMoney2;
        if ((i & 32) != 0) {
            qrcMoney3 = confirmQrcPaymentRequest.totalAmount;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney6 = qrcMoney3;
        if ((i & 64) != 0) {
            z = confirmQrcPaymentRequest.isEnrollmentRequired;
        }
        return confirmQrcPaymentRequest.copy(captureReferenceId, str3, str4, qrcMoney4, qrcMoney5, qrcMoney6, z);
    }
}
