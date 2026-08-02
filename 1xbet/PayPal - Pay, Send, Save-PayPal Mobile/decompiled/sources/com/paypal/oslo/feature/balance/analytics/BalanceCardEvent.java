package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;)Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BalanceCardEvent {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

    public BalanceCardEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        this.uiContext = uIContext;
        this.userIntent = userIntentContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = this.uiContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceCardEvent(uiContext=");
        sb.append(uIContext);
        sb.append(", userIntent=");
        sb.append(userIntentContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.uiContext.hashCode() * 31) + this.userIntent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.analytics.BalanceCardEvent)) {
            return false;
        }
        com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent = (com.paypal.oslo.feature.balance.analytics.BalanceCardEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uiContext, balanceCardEvent.uiContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, balanceCardEvent.userIntent);
    }

    public final com.paypal.oslo.feature.balance.analytics.BalanceCardEvent copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        return new com.paypal.oslo.feature.balance.analytics.BalanceCardEvent(uiContext, userIntent);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.analytics.BalanceCardEvent copy$default(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uIContext = balanceCardEvent.uiContext;
        }
        if ((i & 2) != 0) {
            userIntentContext = balanceCardEvent.userIntent;
        }
        return balanceCardEvent.copy(uIContext, userIntentContext);
    }
}
