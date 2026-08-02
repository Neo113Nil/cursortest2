package com.zettle.sdk.common.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/common/ui/text/OttoAmount;", "", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "currencyPosition", "", "amountString", "currencySymbol", "", "isNegative", "<init>", "(Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zettle/sdk/common/ui/text/OttoAmount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmountString", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "getCurrencyPosition", "getCurrencySymbol", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class OttoAmount {
    private final java.lang.String amountString;
    private final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition currencyPosition;
    private final java.lang.String currencySymbol;
    private final boolean isNegative;

    public OttoAmount(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition ottoTotalAmountCurrencyPosition, java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoTotalAmountCurrencyPosition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.currencyPosition = ottoTotalAmountCurrencyPosition;
        this.amountString = str;
        this.currencySymbol = str2;
        this.isNegative = z;
    }

    public final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition getCurrencyPosition() {
        return this.currencyPosition;
    }

    public final java.lang.String getAmountString() {
        return this.amountString;
    }

    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final boolean isNegative() {
        return this.isNegative;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition ottoTotalAmountCurrencyPosition = this.currencyPosition;
        java.lang.String str = this.amountString;
        java.lang.String str2 = this.currencySymbol;
        boolean z = this.isNegative;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OttoAmount(currencyPosition=");
        sb.append(ottoTotalAmountCurrencyPosition);
        sb.append(", amountString=");
        sb.append(str);
        sb.append(", currencySymbol=");
        sb.append(str2);
        sb.append(", isNegative=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.currencyPosition.hashCode();
        int hashCode2 = this.amountString.hashCode();
        int hashCode3 = this.currencySymbol.hashCode();
        boolean z = this.isNegative;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.common.ui.text.OttoAmount)) {
            return false;
        }
        com.zettle.sdk.common.ui.text.OttoAmount ottoAmount = (com.zettle.sdk.common.ui.text.OttoAmount) other;
        return this.currencyPosition == ottoAmount.currencyPosition && kotlin.jvm.internal.Intrinsics.areEqual(this.amountString, ottoAmount.amountString) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySymbol, ottoAmount.currencySymbol) && this.isNegative == ottoAmount.isNegative;
    }

    public final com.zettle.sdk.common.ui.text.OttoAmount copy(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition currencyPosition, java.lang.String amountString, java.lang.String currencySymbol, boolean isNegative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPosition, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySymbol, "");
        return new com.zettle.sdk.common.ui.text.OttoAmount(currencyPosition, amountString, currencySymbol, isNegative);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNegative() {
        return this.isNegative;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmountString() {
        return this.amountString;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition getCurrencyPosition() {
        return this.currencyPosition;
    }

    public static /* synthetic */ com.zettle.sdk.common.ui.text.OttoAmount copy$default(com.zettle.sdk.common.ui.text.OttoAmount ottoAmount, com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition ottoTotalAmountCurrencyPosition, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ottoTotalAmountCurrencyPosition = ottoAmount.currencyPosition;
        }
        if ((i & 2) != 0) {
            str = ottoAmount.amountString;
        }
        if ((i & 4) != 0) {
            str2 = ottoAmount.currencySymbol;
        }
        if ((i & 8) != 0) {
            z = ottoAmount.isNegative;
        }
        return ottoAmount.copy(ottoTotalAmountCurrencyPosition, str, str2, z);
    }
}
