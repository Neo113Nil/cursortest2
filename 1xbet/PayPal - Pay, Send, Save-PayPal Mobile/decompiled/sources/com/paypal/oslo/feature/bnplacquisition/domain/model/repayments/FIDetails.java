package com.paypal.oslo.feature.bnplacquisition.domain.model.repayments;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/FIDetails;", "", "", "uniqueId", "primaryText", "secondaryText", "iconUrl", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/FIDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUniqueId", "getPrimaryText", "getSecondaryText", "getIconUrl", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FIDetails {
    public static final int $stable = 0;
    private final java.lang.String iconUrl;
    private final java.lang.String primaryText;
    private final java.lang.String secondaryText;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType type;
    private final java.lang.String uniqueId;

    public FIDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentInstrumentType, "");
        this.uniqueId = str;
        this.primaryText = str2;
        this.secondaryText = str3;
        this.iconUrl = str4;
        this.type = paymentInstrumentType;
    }

    public final java.lang.String getUniqueId() {
        return this.uniqueId;
    }

    public final java.lang.String getPrimaryText() {
        return this.primaryText;
    }

    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    public /* synthetic */ FIDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType.UNKNOWN : paymentInstrumentType);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.uniqueId;
        java.lang.String str2 = this.primaryText;
        java.lang.String str3 = this.secondaryText;
        java.lang.String str4 = this.iconUrl;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FIDetails(uniqueId=");
        sb.append(str);
        sb.append(", primaryText=");
        sb.append(str2);
        sb.append(", secondaryText=");
        sb.append(str3);
        sb.append(", iconUrl=");
        sb.append(str4);
        sb.append(", type=");
        sb.append(paymentInstrumentType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.uniqueId.hashCode();
        int hashCode2 = this.primaryText.hashCode();
        int hashCode3 = this.secondaryText.hashCode();
        java.lang.String str = this.iconUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails fIDetails = (com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uniqueId, fIDetails.uniqueId) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryText, fIDetails.primaryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryText, fIDetails.secondaryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconUrl, fIDetails.iconUrl) && this.type == fIDetails.type;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails copy(java.lang.String uniqueId, java.lang.String primaryText, java.lang.String secondaryText, java.lang.String iconUrl, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uniqueId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails(uniqueId, primaryText, secondaryText, iconUrl, type);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUniqueId() {
        return this.uniqueId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.FIDetails fIDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fIDetails.uniqueId;
        }
        if ((i & 2) != 0) {
            str2 = fIDetails.primaryText;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = fIDetails.secondaryText;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = fIDetails.iconUrl;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            paymentInstrumentType = fIDetails.type;
        }
        return fIDetails.copy(str, str5, str6, str7, paymentInstrumentType);
    }
}
