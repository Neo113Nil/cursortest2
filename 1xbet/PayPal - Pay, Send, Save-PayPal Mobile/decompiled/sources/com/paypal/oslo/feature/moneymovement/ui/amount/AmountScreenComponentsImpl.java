package com.paypal.oslo.feature.moneymovement.ui.amount;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J/\u0010(\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\t\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020'2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020/2\u0006\u0010\t\u001a\u0002002\u0006\u0010\u000b\u001a\u0002012\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u00103J/\u00107\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u0002042\u0006\u0010\t\u001a\u0002052\u0006\u0010\u000b\u001a\u0002062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R3\u0010<\u001a\r\u0012\u0004\u0012\u00020;0\u000e¢\u0006\u0002\b\u00108\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010C\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/amount/AmountScreenComponentsImpl;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;", "actionButtonGroup", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "footerSlots", "ActionButtonGroup", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "AmountKeyboard", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;", "AmountInput", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/amountinput/AmountInputCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "text", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;", "CurrencyExchangeAction", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencyexchangeaction/CurrencyExchangeActionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "ExchangeRateInfo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;", "CurrencyPicker", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "CrossBorderHeroCurrency", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "HeroCurrencySection", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionData;Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;", "AmountScreen", "(Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenData;Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/moneymovement/ui/amount/component/actionbuttongroup/ActionButtonGroup;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "formatterFactory", "Lkotlin/jvm/functions/Function2;", "getFormatterFactory$money_movement_prodRelease", "()Lkotlin/jvm/functions/Function2;", "setFormatterFactory$money_movement_prodRelease", "(Lkotlin/jvm/functions/Function2;)V", "getFormatterFactory$money_movement_prodRelease$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountScreenComponentsImpl implements com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> formatterFactory;
    private final com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup getHighSpeedVideoSizes;

    public static /* synthetic */ void getFormatterFactory$money_movement_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public AmountScreenComponentsImpl(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroup, "");
        this.getHighSpeedVideoSizes = actionButtonGroup;
        this.formatterFactory = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.$r8$lambda$jGBvAYVkxzpdVdroO31jRF6oCH0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        };
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getFormatterFactory$money_movement_prodRelease() {
        return this.formatterFactory;
    }

    public final void setFormatterFactory$money_movement_prodRelease(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.formatterFactory = function2;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void ActionButtonGroup(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig actionButtonGroupConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData, com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks actionButtonGroupCallbacks, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButtonGroupCallbacks, "");
        composer.startReplaceGroup(-1056047382);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1056047382, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.ActionButtonGroup (AmountScreenComponentsImpl.kt:85)");
        }
        this.getHighSpeedVideoSizes.Content(actionButtonGroupConfig, actionButtonGroupData, actionButtonGroupCallbacks, modifier, function2, composer, i & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void AmountKeyboard(final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardCallbacks, "");
        composer.startReplaceGroup(162204233);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(162204233, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.AmountKeyboard (AmountScreenComponentsImpl.kt:109)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.getLocalMoneyAmountFormatter().provides(this.formatterFactory.invoke(composer, 0)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1564724617, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.$r8$lambda$t8lEnZ7nLI01_K7xYkU8ZdZkQl0(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.this, keyboardData, keyboardCallbacks, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void AmountInput(com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputConfig amountInputConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputData amountInputData, com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks amountInputCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputCallbacks, "");
        composer.startReplaceGroup(93092253);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(93092253, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.AmountInput (AmountScreenComponentsImpl.kt:135)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt.AmountInput(amountInputConfig, amountInputData, amountInputCallbacks, modifier, null, composer, i & 8190, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void CurrencyExchangeAction(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks currencyExchangeActionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyExchangeActionCallbacks, "");
        composer.startReplaceGroup(-1989007858);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1989007858, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.CurrencyExchangeAction (AmountScreenComponentsImpl.kt:156)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.currencyexchangeaction.CurrencyExchangeActionKt.CurrencyExchangeAction(str, currencyExchangeActionCallbacks, modifier, composer, i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void ExchangeRateInfo(java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        composer.startReplaceGroup(908484399);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(908484399, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.ExchangeRateInfo (AmountScreenComponentsImpl.kt:174)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.exchangerateinfo.ExchangeRateInfoKt.ExchangeRateInfo(str, modifier, composer, i & 126, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void CurrencyPicker(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerConfig currencyPickerConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerData currencyPickerData, com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks currencyPickerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerCallbacks, "");
        composer.startReplaceGroup(-1229152687);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1229152687, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.CurrencyPicker (AmountScreenComponentsImpl.kt:195)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.currencypicker.CurrencyPickerComponentKt.CurrencyPickerComponent(currencyPickerConfig, currencyPickerData, currencyPickerCallbacks, modifier, composer, i & 8190, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void CrossBorderHeroCurrency(com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyConfig crossBorderHeroCurrencyConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyData crossBorderHeroCurrencyData, com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks crossBorderHeroCurrencyCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderHeroCurrencyConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderHeroCurrencyData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderHeroCurrencyCallbacks, "");
        composer.startReplaceGroup(-2049173751);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2049173751, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.CrossBorderHeroCurrency (AmountScreenComponentsImpl.kt:218)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyKt.CrossBorderHeroCurrency(crossBorderHeroCurrencyConfig, crossBorderHeroCurrencyData, crossBorderHeroCurrencyCallbacks, modifier, null, null, composer, i & 8190, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void HeroCurrencySection(com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionConfig heroCurrencySectionConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionData heroCurrencySectionData, com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks heroCurrencySectionCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heroCurrencySectionCallbacks, "");
        composer.startReplaceGroup(970071037);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(970071037, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.HeroCurrencySection (AmountScreenComponentsImpl.kt:241)");
        }
        com.paypal.oslo.feature.moneymovement.ui.amount.component.herocurrencysection.HeroCurrencySectionKt.HeroCurrencySection(heroCurrencySectionConfig, heroCurrencySectionData, heroCurrencySectionCallbacks, modifier, null, null, null, composer, i & 8190, 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents
    public final void AmountScreen(final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, final com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks amountScreenCallbacks, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenCallbacks, "");
        composer.startReplaceGroup(-871952495);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-871952495, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.AmountScreen (AmountScreenComponentsImpl.kt:264)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.getLocalMoneyAmountFormatter().provides(this.formatterFactory.invoke(composer, 0)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-285949231, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.$r8$lambda$_fyR0hudSM1EWZdsS8RlOcAfjXo(com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.this, amountScreenConfig, amountScreenData, amountScreenCallbacks, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_fyR0hudSM1EWZdsS8RlOcAfjXo(com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl amountScreenComponentsImpl, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig amountScreenConfig, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData amountScreenData, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks amountScreenCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-285949231, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.AmountScreen.<anonymous> (AmountScreenComponentsImpl.kt:267)");
            }
            com.paypal.oslo.feature.moneymovement.ui.amount.screen.MMPAmountScreenKt.MMPAmountScreen(amountScreenConfig, amountScreenData, amountScreenCallbacks, amountScreenComponentsImpl.getHighSpeedVideoSizes, modifier, composer, com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenConfig.$stable | (com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenData.$stable << 3), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter $r8$lambda$jGBvAYVkxzpdVdroO31jRF6oCH0(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        composer.startReplaceGroup(638569478);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(638569478, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.formatterFactory.<anonymous> (AmountScreenComponentsImpl.kt:66)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter formatter = ((com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0)).getFormatter();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return formatter;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t8lEnZ7nLI01_K7xYkU8ZdZkQl0(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardData keyboardData, com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1564724617, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl.AmountKeyboard.<anonymous> (AmountScreenComponentsImpl.kt:112)");
            }
            com.paypal.oslo.feature.moneymovement.ui.amount.component.keyboard.MMPAmountKeyboardKt.MMPAmountKeyboard(keyboardConfig, keyboardData, keyboardCallbacks, modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
