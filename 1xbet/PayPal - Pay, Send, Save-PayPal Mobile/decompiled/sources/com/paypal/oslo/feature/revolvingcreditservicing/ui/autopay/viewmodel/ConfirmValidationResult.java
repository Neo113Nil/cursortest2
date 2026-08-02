package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/ConfirmValidationResult;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "paymentAmountError", "customAmountError", "paymentMethodError", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/ConfirmValidationResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getPaymentAmountError", "getCustomAmountError", "getPaymentMethodError", "getHasErrors", "()Z", "hasErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ConfirmValidationResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString customAmountError;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentAmountError;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodError;

    public ConfirmValidationResult(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3) {
        this.paymentAmountError = uiString;
        this.customAmountError = uiString2;
        this.paymentMethodError = uiString3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPaymentAmountError() {
        return this.paymentAmountError;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCustomAmountError() {
        return this.customAmountError;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPaymentMethodError() {
        return this.paymentMethodError;
    }

    public final boolean getHasErrors() {
        return (this.paymentAmountError == null && this.customAmountError == null && this.paymentMethodError == null) ? false : true;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.paymentAmountError;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.customAmountError;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.paymentMethodError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmValidationResult(paymentAmountError=");
        sb.append(uiString);
        sb.append(", customAmountError=");
        sb.append(uiString2);
        sb.append(", paymentMethodError=");
        sb.append(uiString3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.paymentAmountError;
        int hashCode = uiString == null ? 0 : uiString.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.customAmountError;
        int hashCode2 = uiString2 == null ? 0 : uiString2.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.paymentMethodError;
        return (((hashCode * 31) + hashCode2) * 31) + (uiString3 != null ? uiString3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult confirmValidationResult = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmountError, confirmValidationResult.paymentAmountError) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmountError, confirmValidationResult.customAmountError) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethodError, confirmValidationResult.paymentMethodError);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentAmountError, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString customAmountError, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodError) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult(paymentAmountError, customAmountError, paymentMethodError);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPaymentMethodError() {
        return this.paymentMethodError;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCustomAmountError() {
        return this.customAmountError;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getPaymentAmountError() {
        return this.paymentAmountError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult confirmValidationResult, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = confirmValidationResult.paymentAmountError;
        }
        if ((i & 2) != 0) {
            uiString2 = confirmValidationResult.customAmountError;
        }
        if ((i & 4) != 0) {
            uiString3 = confirmValidationResult.paymentMethodError;
        }
        return confirmValidationResult.copy(uiString, uiString2, uiString3);
    }
}
