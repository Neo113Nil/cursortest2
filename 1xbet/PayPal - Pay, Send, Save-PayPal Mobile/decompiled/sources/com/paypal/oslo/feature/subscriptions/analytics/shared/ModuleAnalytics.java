package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getModule", "Ljava/util/List;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModuleAnalytics {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module;

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleAnalytics(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.module = module;
        this.contexts = list;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getModule() {
        return this.module;
    }

    public /* synthetic */ ModuleAnalytics(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(module, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return this.contexts;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module = this.module;
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ModuleAnalytics(module=");
        sb.append(module);
        sb.append(", contexts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.module.hashCode() * 31) + this.contexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.module, moduleAnalytics.module) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, moduleAnalytics.contexts);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics(module, contexts);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component2() {
        return this.contexts;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getModule() {
        return this.module;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics copy$default(com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            module = moduleAnalytics.module;
        }
        if ((i & 2) != 0) {
            list = moduleAnalytics.contexts;
        }
        return moduleAnalytics.copy(module, list);
    }
}
