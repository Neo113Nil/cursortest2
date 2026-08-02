package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/analytics/BalanceCardAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;", "createAccountRoutingClickedEvent", "()Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;", "createAutoReloadClickedEvent", "createTransferClickedEvent", "createAddMoneyClickedEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceCardAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.analytics.BalanceCardAnalytics INSTANCE = new com.paypal.oslo.feature.balance.analytics.BalanceCardAnalytics();

    private BalanceCardAnalytics() {
    }

    public final com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent createAccountRoutingClickedEvent() {
        return new com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("balance_dashboard"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagBalanceCard, 0, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("account_routing_navigation", 0), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", "account_routing", "viewed_account_details"));
    }

    public final com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent createAutoReloadClickedEvent() {
        return new com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("balance_dashboard"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagBalanceCard, 0, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("auto_reload_navigation", 1), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.AutoReload.FEATURE, "configured_auto_reload"));
    }

    public final com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent createTransferClickedEvent() {
        return new com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("balance_dashboard"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagBalanceCard, 0, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("transfer_button", 0), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", "transfer", "initiated_transfer"));
    }

    public final com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent createAddMoneyClickedEvent() {
        return new com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("balance_dashboard"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagBalanceCard, 0, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_money_button", 1), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_ADD_MONEY, "added_funds"));
    }
}
