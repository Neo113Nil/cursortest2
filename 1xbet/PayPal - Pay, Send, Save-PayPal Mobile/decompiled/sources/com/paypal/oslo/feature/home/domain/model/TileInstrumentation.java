package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "", "", "componentName", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "context", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "component3", "()I", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;I)Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getComponentName", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "getContext", com.visa.cbp.getEncExpo.warmup, "getPosition"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TileInstrumentation {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable;
    private final java.lang.String componentName;
    private final com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext context;
    private final int position;

    public TileInstrumentation(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        this.componentName = str;
        this.context = analyticsContext;
        this.position = i;
    }

    public final java.lang.String getComponentName() {
        return this.componentName;
    }

    public final com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext getContext() {
        return this.context;
    }

    public final int getPosition() {
        return this.position;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentName;
        com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext = this.context;
        int i = this.position;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TileInstrumentation(componentName=");
        sb.append(str);
        sb.append(", context=");
        sb.append(analyticsContext);
        sb.append(", position=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.componentName.hashCode() * 31) + this.context.hashCode()) * 31) + java.lang.Integer.hashCode(this.position);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.domain.model.TileInstrumentation)) {
            return false;
        }
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = (com.paypal.oslo.feature.home.domain.model.TileInstrumentation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentName, tileInstrumentation.componentName) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, tileInstrumentation.context) && this.position == tileInstrumentation.position;
    }

    public final com.paypal.oslo.feature.home.domain.model.TileInstrumentation copy(java.lang.String componentName, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext context, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.home.domain.model.TileInstrumentation(componentName, context, position);
    }

    /* renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext getContext() {
        return this.context;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentName() {
        return this.componentName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.TileInstrumentation copy$default(com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation, java.lang.String str, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext analyticsContext, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = tileInstrumentation.componentName;
        }
        if ((i2 & 2) != 0) {
            analyticsContext = tileInstrumentation.context;
        }
        if ((i2 & 4) != 0) {
            i = tileInstrumentation.position;
        }
        return tileInstrumentation.copy(str, analyticsContext, i);
    }
}
