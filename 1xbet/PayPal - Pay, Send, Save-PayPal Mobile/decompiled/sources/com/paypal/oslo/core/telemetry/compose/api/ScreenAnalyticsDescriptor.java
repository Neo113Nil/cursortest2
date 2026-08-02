package com.paypal.oslo.core.telemetry.compose.api;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "", "", "id", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/Set;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component3", "()Ljava/util/Set;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/Set;)Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Ljava/util/Set;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ScreenAnalyticsDescriptor {
    public static final int $stable = 8;
    private final java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
    private final java.lang.String id;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenAnalyticsDescriptor(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.Set<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.id = str;
        this.userIntent = userIntentContext;
        this.contexts = set;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    public /* synthetic */ ScreenAnalyticsDescriptor(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userIntentContext, (i & 4) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
    }

    public final java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return this.contexts;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
        java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> set = this.contexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenAnalyticsDescriptor(id=");
        sb.append(str);
        sb.append(", userIntent=");
        sb.append(userIntentContext);
        sb.append(", contexts=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.userIntent.hashCode()) * 31) + this.contexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor screenAnalyticsDescriptor = (com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, screenAnalyticsDescriptor.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, screenAnalyticsDescriptor.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, screenAnalyticsDescriptor.contexts);
    }

    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor copy(java.lang.String id, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, java.util.Set<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(id, userIntent, contexts);
    }

    public final java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component3() {
        return this.contexts;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor copy$default(com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor screenAnalyticsDescriptor, java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = screenAnalyticsDescriptor.id;
        }
        if ((i & 2) != 0) {
            userIntentContext = screenAnalyticsDescriptor.userIntent;
        }
        if ((i & 4) != 0) {
            set = screenAnalyticsDescriptor.contexts;
        }
        return screenAnalyticsDescriptor.copy(str, userIntentContext, set);
    }
}
