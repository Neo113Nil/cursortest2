package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentFundingInstrument;", "", "", "instrumentName", "instrumentDescription", "instrumentImageUrl", "instrumentAmount", "", "backupDisplayTextRestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentName", "getInstrumentDescription", "getInstrumentImageUrl", "getInstrumentAmount", "Ljava/lang/Integer;", "getBackupDisplayTextRestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PaymentFundingInstrument {
    public static final int $stable = 0;
    private final java.lang.Integer backupDisplayTextRestId;
    private final java.lang.String instrumentAmount;
    private final java.lang.String instrumentDescription;
    private final java.lang.String instrumentImageUrl;
    private final java.lang.String instrumentName;

    public PaymentFundingInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.instrumentName = str;
        this.instrumentDescription = str2;
        this.instrumentImageUrl = str3;
        this.instrumentAmount = str4;
        this.backupDisplayTextRestId = num;
    }

    public final java.lang.String getInstrumentName() {
        return this.instrumentName;
    }

    public final java.lang.String getInstrumentDescription() {
        return this.instrumentDescription;
    }

    public /* synthetic */ PaymentFundingInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num);
    }

    public final java.lang.String getInstrumentImageUrl() {
        return this.instrumentImageUrl;
    }

    public final java.lang.String getInstrumentAmount() {
        return this.instrumentAmount;
    }

    public final java.lang.Integer getBackupDisplayTextRestId() {
        return this.backupDisplayTextRestId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentName;
        java.lang.String str2 = this.instrumentDescription;
        java.lang.String str3 = this.instrumentImageUrl;
        java.lang.String str4 = this.instrumentAmount;
        java.lang.Integer num = this.backupDisplayTextRestId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument(instrumentName=");
        sb.append(str);
        sb.append(", instrumentDescription=");
        sb.append(str2);
        sb.append(", instrumentImageUrl=");
        sb.append(str3);
        sb.append(", instrumentAmount=");
        sb.append(str4);
        sb.append(", backupDisplayTextRestId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instrumentName.hashCode();
        java.lang.String str = this.instrumentDescription;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.instrumentImageUrl.hashCode();
        java.lang.String str2 = this.instrumentAmount;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.backupDisplayTextRestId;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentName, paymentFundingInstrument.instrumentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentDescription, paymentFundingInstrument.instrumentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentImageUrl, paymentFundingInstrument.instrumentImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentAmount, paymentFundingInstrument.instrumentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupDisplayTextRestId, paymentFundingInstrument.backupDisplayTextRestId);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument copy(java.lang.String instrumentName, java.lang.String instrumentDescription, java.lang.String instrumentImageUrl, java.lang.String instrumentAmount, java.lang.Integer backupDisplayTextRestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentImageUrl, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument(instrumentName, instrumentDescription, instrumentImageUrl, instrumentAmount, backupDisplayTextRestId);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getBackupDisplayTextRestId() {
        return this.backupDisplayTextRestId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getInstrumentAmount() {
        return this.instrumentAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getInstrumentImageUrl() {
        return this.instrumentImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstrumentDescription() {
        return this.instrumentDescription;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentName() {
        return this.instrumentName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentFundingInstrument.instrumentName;
        }
        if ((i & 2) != 0) {
            str2 = paymentFundingInstrument.instrumentDescription;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = paymentFundingInstrument.instrumentImageUrl;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = paymentFundingInstrument.instrumentAmount;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            num = paymentFundingInstrument.backupDisplayTextRestId;
        }
        return paymentFundingInstrument.copy(str, str5, str6, str7, num);
    }
}
