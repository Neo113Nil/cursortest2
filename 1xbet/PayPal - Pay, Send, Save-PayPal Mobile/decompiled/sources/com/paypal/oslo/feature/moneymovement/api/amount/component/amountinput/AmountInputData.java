package com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "amount", "", "errorMessage", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component2", "()Ljava/lang/String;", "component3", "()Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getAmount", "Ljava/lang/String;", "getErrorMessage", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountInputData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount;
    private final java.lang.String errorMessage;
    private final androidx.compose.ui.text.input.TextFieldValue textFieldValue;

    public AmountInputData(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        this.amount = moneyAmount;
        this.errorMessage = str;
        this.textFieldValue = textFieldValue;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getTextFieldValue() {
        return this.textFieldValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AmountInputData(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(moneyAmount, str, textFieldValue);
        java.lang.String quantity;
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i2 = com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
            if (i2 == 1) {
                quantity = moneyAmount.requireFiat().getQuantity();
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                quantity = moneyAmount.requireCrypto().getQuantity();
            }
            java.lang.String str2 = quantity;
            textFieldValue = new androidx.compose.ui.text.input.TextFieldValue(str2, androidx.compose.ui.text.TextRangeKt.TextRange(str2.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.amount;
        java.lang.String str = this.errorMessage;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.textFieldValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountInputData(amount=");
        sb.append(moneyAmount);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", textFieldValue=");
        sb.append(textFieldValue);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amount.hashCode();
        java.lang.String str = this.errorMessage;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.textFieldValue.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData = (com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountInputData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, amountInputData.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldValue, amountInputData.textFieldValue);
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData copy(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount, java.lang.String errorMessage, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        return new com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData(amount, errorMessage, textFieldValue);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.text.input.TextFieldValue getTextFieldValue() {
        return this.textFieldValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData copy$default(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyAmount = amountInputData.amount;
        }
        if ((i & 2) != 0) {
            str = amountInputData.errorMessage;
        }
        if ((i & 4) != 0) {
            textFieldValue = amountInputData.textFieldValue;
        }
        return amountInputData.copy(moneyAmount, str, textFieldValue);
    }
}
