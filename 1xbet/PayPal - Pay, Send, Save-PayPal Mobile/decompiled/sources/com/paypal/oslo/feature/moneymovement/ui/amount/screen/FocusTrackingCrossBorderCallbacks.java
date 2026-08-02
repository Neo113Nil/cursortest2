package com.paypal.oslo.feature.moneymovement.ui.amount.screen;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/screen/FocusTrackingCrossBorderCallbacks;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "Lkotlin/Function0;", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "onPrimaryAmountChange", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "onSecondaryAmountChange", "onPrimaryCurrencyClick", "()V", "onSecondaryCurrencyClick", "onPrimaryRowClick", "onSecondaryRowClick", "onSwapClick", "Landroidx/compose/ui/text/input/TextFieldValue;", "onPrimaryTextFieldValueChange", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "onSecondaryTextFieldValueChange", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FocusTrackingCrossBorderCallbacks implements com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusTrackingCrossBorderCallbacks(kotlin.jvm.functions.Function0<? extends com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks> function0, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onPrimaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.invoke().onPrimaryAmountChange(p0);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onSecondaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.invoke().onSecondaryAmountChange(p0);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onPrimaryCurrencyClick() {
        this.getHighSpeedVideoFpsRangesFor.invoke().onPrimaryCurrencyClick();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onSecondaryCurrencyClick() {
        this.getHighSpeedVideoFpsRangesFor.invoke().onSecondaryCurrencyClick();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onPrimaryRowClick() {
        this.getHighSpeedVideoFpsRangesFor.invoke().onPrimaryRowClick();
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Boolean.TRUE);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onSecondaryRowClick() {
        this.getHighSpeedVideoFpsRangesFor.invoke().onSecondaryRowClick();
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Boolean.FALSE);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onSwapClick() {
        this.getHighSpeedVideoFpsRangesFor.invoke().onSwapClick();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onPrimaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.invoke().onPrimaryTextFieldValueChange(p0);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
    public final void onSecondaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.invoke().onSecondaryTextFieldValueChange(p0);
    }
}
