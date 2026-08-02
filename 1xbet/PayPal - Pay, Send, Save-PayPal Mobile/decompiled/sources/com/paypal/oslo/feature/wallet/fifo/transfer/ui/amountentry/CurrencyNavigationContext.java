package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/CurrencyNavigationContext;", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "config", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/SelectedCurrency;", "", "onCurrencySelect", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "component2", "()Lcom/paypal/oslo/core/navigation/AppNavigator;", "component3", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/CurrencyNavigationContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "getConfig", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getNavigator", "Lkotlin/jvm/functions/Function1;", "getOnCurrencySelect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CurrencyNavigationContext {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig config;
    private final com.paypal.oslo.core.navigation.AppNavigator navigator;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> onCurrencySelect;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyNavigationContext(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySelectorConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.config = currencySelectorConfig;
        this.navigator = appNavigator;
        this.onCurrencySelect = function1;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getConfig() {
        return this.config;
    }

    public final com.paypal.oslo.core.navigation.AppNavigator getNavigator() {
        return this.navigator;
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> getOnCurrencySelect() {
        return this.onCurrencySelect;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = this.config;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.navigator;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> function1 = this.onCurrencySelect;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyNavigationContext(config=");
        sb.append(currencySelectorConfig);
        sb.append(", navigator=");
        sb.append(appNavigator);
        sb.append(", onCurrencySelect=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.config.hashCode() * 31) + this.navigator.hashCode()) * 31) + this.onCurrencySelect.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext currencyNavigationContext = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.config, currencyNavigationContext.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigator, currencyNavigationContext.navigator) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCurrencySelect, currencyNavigationContext.onCurrencySelect);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig config, com.paypal.oslo.core.navigation.AppNavigator navigator, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> onCurrencySelect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCurrencySelect, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext(config, navigator, onCurrencySelect);
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency, kotlin.Unit> component3() {
        return this.onCurrencySelect;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.navigation.AppNavigator getNavigator() {
        return this.navigator;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext currencyNavigationContext, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencySelectorConfig = currencyNavigationContext.config;
        }
        if ((i & 2) != 0) {
            appNavigator = currencyNavigationContext.navigator;
        }
        if ((i & 4) != 0) {
            function1 = currencyNavigationContext.onCurrencySelect;
        }
        return currencyNavigationContext.copy(currencySelectorConfig, appNavigator, function1);
    }
}
