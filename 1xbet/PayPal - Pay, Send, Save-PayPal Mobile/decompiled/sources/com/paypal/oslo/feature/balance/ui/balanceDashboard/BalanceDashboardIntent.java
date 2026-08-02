package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_REFRESH_SCREEN, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_RETRY_BALANCE_LOAD, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_ACTIVITY_WIDGET_VIEW_ALL, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_SHOW_VIEW_CURRENCIES, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_VIEW_CURRENCIES, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_NBA, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_SHOW_TOAST, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_BALANCE_LOADED, com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_CURRENCIES_LOADED, "Error", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$BalanceLoaded;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$CurrenciesLoaded;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$DismissNba;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$DismissViewCurrenciesBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$Error;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$RefreshScreen;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$RetryBalanceLoad;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ShowToastMessage;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ShowViewCurrenciesBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ViewAllActivities;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BalanceDashboardIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize();

        public final int hashCode() {
            return -437446645;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    private BalanceDashboardIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$RefreshScreen;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshScreen extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen();

        public final int hashCode() {
            return 979340492;
        }

        private RefreshScreen() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_REFRESH_SCREEN, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_REFRESH_SCREEN;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$RetryBalanceLoad;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryBalanceLoad extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RetryBalanceLoad INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RetryBalanceLoad();

        public final int hashCode() {
            return -1890096555;
        }

        private RetryBalanceLoad() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_RETRY_BALANCE_LOAD, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_RETRY_BALANCE_LOAD;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RetryBalanceLoad)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ViewAllActivities;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewAllActivities extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ViewAllActivities INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ViewAllActivities();

        public final int hashCode() {
            return -1312118546;
        }

        private ViewAllActivities() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_ACTIVITY_WIDGET_VIEW_ALL, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_ACTIVITY_WIDGET_VIEW_ALL;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ViewAllActivities)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ShowViewCurrenciesBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowViewCurrenciesBottomSheet extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowViewCurrenciesBottomSheet INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowViewCurrenciesBottomSheet();

        public final int hashCode() {
            return 530550664;
        }

        private ShowViewCurrenciesBottomSheet() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_SHOW_VIEW_CURRENCIES, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_SHOW_VIEW_CURRENCIES;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowViewCurrenciesBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$DismissViewCurrenciesBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissViewCurrenciesBottomSheet extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissViewCurrenciesBottomSheet INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissViewCurrenciesBottomSheet();

        public final int hashCode() {
            return -98297039;
        }

        private DismissViewCurrenciesBottomSheet() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_VIEW_CURRENCIES, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_VIEW_CURRENCIES;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissViewCurrenciesBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$DismissNba;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissNba extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissNba INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissNba();

        public final int hashCode() {
            return -660060482;
        }

        private DismissNba() {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_NBA, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_DISMISS_NBA;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissNba)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ShowToastMessage;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$ShowToastMessage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToastMessage extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToastMessage(java.lang.String str) {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_SHOW_TOAST, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToastMessage(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) other).message);
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage copy$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage showToastMessage, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showToastMessage.message;
            }
            return showToastMessage.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$BalanceLoaded;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "balanceUiModel", "", "Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "currencies", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "autoReloadInfo", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "nbaRecommendations", "", "isAccountRoutingEligible", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "taxHoldPolicy", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;Ljava/util/List;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$BalanceLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "getBalanceUiModel", "Ljava/util/List;", "getCurrencies", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "getAutoReloadInfo", "getNbaRecommendations", "Ljava/lang/Boolean;", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "getTaxHoldPolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceLoaded extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo;
        private final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies;
        private final java.lang.Boolean isAccountRoutingEligible;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations;
        private final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceLoaded(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2, java.lang.Boolean bool, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy) {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_BALANCE_LOADED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.balanceUiModel = balanceUiModel;
            this.currencies = list;
            this.autoReloadInfo = autoReloadInfo;
            this.nbaRecommendations = list2;
            this.isAccountRoutingEligible = bool;
            this.taxHoldPolicy = taxHoldPolicy;
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel getBalanceUiModel() {
            return this.balanceUiModel;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> getCurrencies() {
            return this.currencies;
        }

        public final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo getAutoReloadInfo() {
            return this.autoReloadInfo;
        }

        public /* synthetic */ BalanceLoaded(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, java.util.List list, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List list2, java.lang.Boolean bool, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(balanceUiModel, list, (i & 4) != 0 ? null : autoReloadInfo, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : taxHoldPolicy);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> getNbaRecommendations() {
            return this.nbaRecommendations;
        }

        public final java.lang.Boolean isAccountRoutingEligible() {
            return this.isAccountRoutingEligible;
        }

        public final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy getTaxHoldPolicy() {
            return this.taxHoldPolicy;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel = this.balanceUiModel;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list = this.currencies;
            com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo = this.autoReloadInfo;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2 = this.nbaRecommendations;
            java.lang.Boolean bool = this.isAccountRoutingEligible;
            com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy = this.taxHoldPolicy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceLoaded(balanceUiModel=");
            sb.append(balanceUiModel);
            sb.append(", currencies=");
            sb.append(list);
            sb.append(", autoReloadInfo=");
            sb.append(autoReloadInfo);
            sb.append(", nbaRecommendations=");
            sb.append(list2);
            sb.append(", isAccountRoutingEligible=");
            sb.append(bool);
            sb.append(", taxHoldPolicy=");
            sb.append(taxHoldPolicy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.balanceUiModel.hashCode();
            int hashCode2 = this.currencies.hashCode();
            com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo = this.autoReloadInfo;
            int hashCode3 = autoReloadInfo == null ? 0 : autoReloadInfo.hashCode();
            int hashCode4 = this.nbaRecommendations.hashCode();
            java.lang.Boolean bool = this.isAccountRoutingEligible;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy = this.taxHoldPolicy;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (taxHoldPolicy != null ? taxHoldPolicy.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded balanceLoaded = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceUiModel, balanceLoaded.balanceUiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, balanceLoaded.currencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadInfo, balanceLoaded.autoReloadInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.nbaRecommendations, balanceLoaded.nbaRecommendations) && kotlin.jvm.internal.Intrinsics.areEqual(this.isAccountRoutingEligible, balanceLoaded.isAccountRoutingEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxHoldPolicy, balanceLoaded.taxHoldPolicy);
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded copy(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations, java.lang.Boolean isAccountRoutingEligible, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRecommendations, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded(balanceUiModel, currencies, autoReloadInfo, nbaRecommendations, isAccountRoutingEligible, taxHoldPolicy);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy getTaxHoldPolicy() {
            return this.taxHoldPolicy;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getIsAccountRoutingEligible() {
            return this.isAccountRoutingEligible;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> component4() {
            return this.nbaRecommendations;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo getAutoReloadInfo() {
            return this.autoReloadInfo;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> component2() {
            return this.currencies;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel getBalanceUiModel() {
            return this.balanceUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded copy$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded balanceLoaded, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, java.util.List list, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List list2, java.lang.Boolean bool, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceUiModel = balanceLoaded.balanceUiModel;
            }
            if ((i & 2) != 0) {
                list = balanceLoaded.currencies;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                autoReloadInfo = balanceLoaded.autoReloadInfo;
            }
            com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo2 = autoReloadInfo;
            if ((i & 8) != 0) {
                list2 = balanceLoaded.nbaRecommendations;
            }
            java.util.List list4 = list2;
            if ((i & 16) != 0) {
                bool = balanceLoaded.isAccountRoutingEligible;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 32) != 0) {
                taxHoldPolicy = balanceLoaded.taxHoldPolicy;
            }
            return balanceLoaded.copy(balanceUiModel, list3, autoReloadInfo2, list4, bool2, taxHoldPolicy);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$CurrenciesLoaded;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "", "Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "currencies", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$CurrenciesLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrenciesLoaded extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrenciesLoaded(java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list) {
            super(com.paypal.oslo.feature.balance.common.BalanceConstants.IntentNames.INTENT_CURRENCIES_LOADED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.currencies = list;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> getCurrencies() {
            return this.currencies;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list = this.currencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrenciesLoaded(currencies=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currencies.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencies, ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded) other).currencies);
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded copy(java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded(currencies);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> component1() {
            return this.currencies;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded copy$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded currenciesLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = currenciesLoaded.currencies;
            }
            return currenciesLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$Error;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "", "errorMessage", "", "errorCode", "errorType", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "nbaRecommendations", "", "isPrepaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Integer;", "getErrorCode", "getErrorType", "Ljava/util/List;", "getNbaRecommendations", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent {
        public static final int $stable = 8;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorMessage;
        private final java.lang.String errorType;
        private final boolean isPrepaidError;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorMessage = str;
            this.errorCode = num;
            this.errorType = str2;
            this.nbaRecommendations = list;
            this.isPrepaidError = z;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) == 0 ? str2 : null, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> getNbaRecommendations() {
            return this.nbaRecommendations;
        }

        public final boolean isPrepaidError() {
            return this.isPrepaidError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.Integer num = this.errorCode;
            java.lang.String str2 = this.errorType;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list = this.nbaRecommendations;
            boolean z = this.isPrepaidError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(", errorType=");
            sb.append(str2);
            sb.append(", nbaRecommendations=");
            sb.append(list);
            sb.append(", isPrepaidError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.errorCode;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.String str2 = this.errorType;
            return (((((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.nbaRecommendations.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isPrepaidError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error error = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.nbaRecommendations, error.nbaRecommendations) && this.isPrepaidError == error.isPrepaidError;
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error copy(java.lang.String errorMessage, java.lang.Integer errorCode, java.lang.String errorType, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations, boolean isPrepaidError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRecommendations, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error(errorMessage, errorCode, errorType, nbaRecommendations, isPrepaidError);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPrepaidError() {
            return this.isPrepaidError;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> component4() {
            return this.nbaRecommendations;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error copy$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error error, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i & 2) != 0) {
                num = error.errorCode;
            }
            java.lang.Integer num2 = num;
            if ((i & 4) != 0) {
                str2 = error.errorType;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                list = error.nbaRecommendations;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                z = error.isPrepaidError;
            }
            return error.copy(str, num2, str3, list2, z);
        }

        public Error() {
            this(null, null, null, null, false, 31, null);
        }
    }

    public /* synthetic */ BalanceDashboardIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
