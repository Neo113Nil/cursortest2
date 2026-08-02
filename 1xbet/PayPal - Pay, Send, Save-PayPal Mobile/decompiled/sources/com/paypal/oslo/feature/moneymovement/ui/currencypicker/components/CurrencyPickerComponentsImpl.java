package com.paypal.oslo.feature.moneymovement.ui.currencypicker.components;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/components/CurrencyPickerComponentsImpl;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/CurrencyPickerComponents;", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;", "config", "Landroidx/compose/ui/Modifier;", "modifier", "", "SearchCurrency", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;", "Landroidx/compose/animation/SharedTransitionScope;", "sharedTransitionScope", "Landroidx/compose/animation/AnimatedContentScope;", "animatedContentScope", "CurrencyTabSelector", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/CurrencyTabSelectorCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerComponentsImpl implements com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CurrencyPickerComponentsImpl() {
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents
    public final void SearchCurrency(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyConfig, "");
        composer.startReplaceGroup(851151946);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(851151946, i, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.components.CurrencyPickerComponentsImpl.SearchCurrency (CurrencyPickerComponentsImpl.kt:47)");
        }
        com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.SearchCurrency(searchCurrencyData, searchCurrencyCallbacks, modifier, searchCurrencyConfig, composer, (i & 126) | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents
    public final void CurrencyTabSelector(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorData currencyTabSelectorData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.CurrencyTabSelectorCallbacks currencyTabSelectorCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.animation.SharedTransitionScope sharedTransitionScope, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyTabSelectorCallbacks, "");
        composer.startReplaceGroup(929186807);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(929186807, i, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.components.CurrencyPickerComponentsImpl.CurrencyTabSelector (CurrencyPickerComponentsImpl.kt:67)");
        }
        com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyTabSelectorKt.CurrencyTabSelector(currencyTabSelectorData, currencyTabSelectorCallbacks, modifier, sharedTransitionScope, animatedContentScope, composer, i & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
