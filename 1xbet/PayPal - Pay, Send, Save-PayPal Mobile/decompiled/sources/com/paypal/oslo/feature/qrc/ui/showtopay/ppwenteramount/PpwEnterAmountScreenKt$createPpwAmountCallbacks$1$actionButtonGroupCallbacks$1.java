package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "Lkotlin/Function0;", "", "onPrimaryClick", "Lkotlin/jvm/functions/Function0;", "getOnPrimaryClick", "()Lkotlin/jvm/functions/Function0;", "onSecondaryClick", "getOnSecondaryClick", "onTertiaryClick", "getOnTertiaryClick", "onPrimaryLongClick", "getOnPrimaryLongClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1 implements com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryLongClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryClick = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryClick = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onPrimaryClick = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$createPpwAmountCallbacks$1$actionButtonGroupCallbacks$1.$r8$lambda$QIvRCwxHmESccjmv0wXBL2yKv1g(kotlin.jvm.functions.Function0.this);
            }
        };
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final /* bridge */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnDisclaimerLinkClick() {
        return super.getOnDisclaimerLinkClick();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final /* bridge */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFooterNoteLinkClick() {
        return super.getOnFooterNoteLinkClick();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryClick() {
        return this.onPrimaryClick;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryClick() {
        return this.onSecondaryClick;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryClick() {
        return this.onTertiaryClick;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryLongClick() {
        return this.onPrimaryLongClick;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QIvRCwxHmESccjmv0wXBL2yKv1g(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
