package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentDetailRow;", "", "", "titleDisplayText", "", "titleResId", "valueDisplayText", "", "isAmountReversed", "displayStyle", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentDetailRow;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitleDisplayText", "Ljava/lang/Integer;", "getTitleResId", "getValueDisplayText", "Z", "getDisplayStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PaymentDetailRow {
    public static final int $stable = 0;
    private final java.lang.String displayStyle;
    private final boolean isAmountReversed;
    private final java.lang.String titleDisplayText;
    private final java.lang.Integer titleResId;
    private final java.lang.String valueDisplayText;

    public PaymentDetailRow(java.lang.String str, java.lang.Integer num, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.titleDisplayText = str;
        this.titleResId = num;
        this.valueDisplayText = str2;
        this.isAmountReversed = z;
        this.displayStyle = str3;
    }

    public /* synthetic */ PaymentDetailRow(java.lang.String str, java.lang.Integer num, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "DEFAULT" : str3);
    }

    public final java.lang.String getTitleDisplayText() {
        return this.titleDisplayText;
    }

    public final java.lang.Integer getTitleResId() {
        return this.titleResId;
    }

    public final java.lang.String getValueDisplayText() {
        return this.valueDisplayText;
    }

    public final boolean isAmountReversed() {
        return this.isAmountReversed;
    }

    public final java.lang.String getDisplayStyle() {
        return this.displayStyle;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.titleDisplayText;
        java.lang.Integer num = this.titleResId;
        java.lang.String str2 = this.valueDisplayText;
        boolean z = this.isAmountReversed;
        java.lang.String str3 = this.displayStyle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentDetailRow(titleDisplayText=");
        sb.append(str);
        sb.append(", titleResId=");
        sb.append(num);
        sb.append(", valueDisplayText=");
        sb.append(str2);
        sb.append(", isAmountReversed=");
        sb.append(z);
        sb.append(", displayStyle=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.titleDisplayText.hashCode();
        java.lang.Integer num = this.titleResId;
        return (((((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.valueDisplayText.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAmountReversed)) * 31) + this.displayStyle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow = (com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.titleDisplayText, paymentDetailRow.titleDisplayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleResId, paymentDetailRow.titleResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.valueDisplayText, paymentDetailRow.valueDisplayText) && this.isAmountReversed == paymentDetailRow.isAmountReversed && kotlin.jvm.internal.Intrinsics.areEqual(this.displayStyle, paymentDetailRow.displayStyle);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow copy(java.lang.String titleDisplayText, java.lang.Integer titleResId, java.lang.String valueDisplayText, boolean isAmountReversed, java.lang.String displayStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titleDisplayText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueDisplayText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayStyle, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow(titleDisplayText, titleResId, valueDisplayText, isAmountReversed, displayStyle);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDisplayStyle() {
        return this.displayStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAmountReversed() {
        return this.isAmountReversed;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValueDisplayText() {
        return this.valueDisplayText;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getTitleResId() {
        return this.titleResId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitleDisplayText() {
        return this.titleDisplayText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow copy$default(com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow, java.lang.String str, java.lang.Integer num, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentDetailRow.titleDisplayText;
        }
        if ((i & 2) != 0) {
            num = paymentDetailRow.titleResId;
        }
        java.lang.Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = paymentDetailRow.valueDisplayText;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            z = paymentDetailRow.isAmountReversed;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = paymentDetailRow.displayStyle;
        }
        return paymentDetailRow.copy(str, num2, str4, z2, str3);
    }
}
