package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/NoOpActionButtonGroupCallbacks;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "<init>", "()V", "Lkotlin/Function0;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getOnPrimaryClick", "()Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getOnSecondaryClick", "getHighSpeedVideoSizes", "getOnTertiaryClick", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getOnPrimaryLongClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class NoOpActionButtonGroupCallbacks implements com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks {
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = null;
    public static final com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.screen.NoOpActionButtonGroupCallbacks$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    private NoOpActionButtonGroupCallbacks() {
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
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryClick() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryClick() {
        return Camera2StreamConfigurationMap;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryLongClick() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
