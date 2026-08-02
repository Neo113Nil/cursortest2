package com.paypal.oslo.core.telemetry.analytics.schema.event;

@kotlin.Deprecated(message = "Will replaced by new event schema")
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ModuleAppearedEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ModuleAppearedEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Ljava/util/List;", "getDomainContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ModuleAppearedEvent {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> domainContexts;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleAppearedEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.uiContext = uIContext;
        this.userIntent = userIntentContext;
        this.domainContexts = list;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    public /* synthetic */ ModuleAppearedEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uIContext, userIntentContext, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getDomainContexts() {
        return this.domainContexts;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = this.uiContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.domainContexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ModuleAppearedEvent(uiContext=");
        sb.append(uIContext);
        sb.append(", userIntent=");
        sb.append(userIntentContext);
        sb.append(", domainContexts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.uiContext.hashCode() * 31) + this.userIntent.hashCode()) * 31) + this.domainContexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent moduleAppearedEvent = (com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uiContext, moduleAppearedEvent.uiContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, moduleAppearedEvent.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.domainContexts, moduleAppearedEvent.domainContexts);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> domainContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainContexts, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent(uiContext, userIntent, domainContexts);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component3() {
        return this.domainContexts;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent copy$default(com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent moduleAppearedEvent, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uIContext = moduleAppearedEvent.uiContext;
        }
        if ((i & 2) != 0) {
            userIntentContext = moduleAppearedEvent.userIntent;
        }
        if ((i & 4) != 0) {
            list = moduleAppearedEvent.domainContexts;
        }
        return moduleAppearedEvent.copy(uIContext, userIntentContext, list);
    }
}
