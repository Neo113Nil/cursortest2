package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getItem", "Ljava/util/List;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ItemAnalytics {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemAnalytics(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.userIntentContext = userIntentContext;
        this.item = item;
        this.contexts = list;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
        return this.userIntentContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getItem() {
        return this.item;
    }

    public /* synthetic */ ItemAnalytics(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userIntentContext, item, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return this.contexts;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntentContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = this.item;
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemAnalytics(userIntentContext=");
        sb.append(userIntentContext);
        sb.append(", item=");
        sb.append(item);
        sb.append(", contexts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.userIntentContext.hashCode() * 31) + this.item.hashCode()) * 31) + this.contexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics itemAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userIntentContext, itemAnalytics.userIntentContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, itemAnalytics.item) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, itemAnalytics.contexts);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(userIntentContext, item, contexts);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component3() {
        return this.contexts;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getItem() {
        return this.item;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
        return this.userIntentContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics copy$default(com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics itemAnalytics, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userIntentContext = itemAnalytics.userIntentContext;
        }
        if ((i & 2) != 0) {
            item = itemAnalytics.item;
        }
        if ((i & 4) != 0) {
            list = itemAnalytics.contexts;
        }
        return itemAnalytics.copy(userIntentContext, item, list);
    }
}
