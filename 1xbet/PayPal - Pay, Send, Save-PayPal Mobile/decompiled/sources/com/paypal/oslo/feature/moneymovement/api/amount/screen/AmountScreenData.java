package com.paypal.oslo.feature.moneymovement.api.amount.screen;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "heroCurrencySectionData", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "keyboardData", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", "actionButtonGroupData", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;)Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "getHeroCurrencySectionData", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "getKeyboardData", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", "getActionButtonGroupData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountScreenData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData;
    private final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData;
    private final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData;

    public AmountScreenData(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupData, "");
        this.heroCurrencySectionData = heroCurrencySectionData;
        this.keyboardData = keyboardData;
        this.actionButtonGroupData = actionButtonGroupData;
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData getHeroCurrencySectionData() {
        return this.heroCurrencySectionData;
    }

    public /* synthetic */ AmountScreenData(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(heroCurrencySectionData, (i & 2) != 0 ? new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData(null, false, null, null, null, null, 63, null) : keyboardData, actionButtonGroupData);
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData getKeyboardData() {
        return this.keyboardData;
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData getActionButtonGroupData() {
        return this.actionButtonGroupData;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData = this.heroCurrencySectionData;
        com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData = this.keyboardData;
        com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData = this.actionButtonGroupData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountScreenData(heroCurrencySectionData=");
        sb.append(heroCurrencySectionData);
        sb.append(", keyboardData=");
        sb.append(keyboardData);
        sb.append(", actionButtonGroupData=");
        sb.append(actionButtonGroupData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.heroCurrencySectionData.hashCode() * 31) + this.keyboardData.hashCode()) * 31) + this.actionButtonGroupData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData = (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.heroCurrencySectionData, amountScreenData.heroCurrencySectionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyboardData, amountScreenData.keyboardData) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionButtonGroupData, amountScreenData.actionButtonGroupData);
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData copy(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupData, "");
        return new com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData(heroCurrencySectionData, keyboardData, actionButtonGroupData);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData getActionButtonGroupData() {
        return this.actionButtonGroupData;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData getKeyboardData() {
        return this.keyboardData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData getHeroCurrencySectionData() {
        return this.heroCurrencySectionData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData copy$default(com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            heroCurrencySectionData = amountScreenData.heroCurrencySectionData;
        }
        if ((i & 2) != 0) {
            keyboardData = amountScreenData.keyboardData;
        }
        if ((i & 4) != 0) {
            actionButtonGroupData = amountScreenData.actionButtonGroupData;
        }
        return amountScreenData.copy(heroCurrencySectionData, keyboardData, actionButtonGroupData);
    }
}
