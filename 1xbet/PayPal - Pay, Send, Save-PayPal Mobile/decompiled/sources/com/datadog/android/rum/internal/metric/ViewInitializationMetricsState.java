package com.datadog.android.rum.internal.metric;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "", "", "initializationTime", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;", "config", "Lcom/datadog/android/rum/internal/metric/NoValueReason;", "noValueReason", "<init>", "(Ljava/lang/Long;Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;Lcom/datadog/android/rum/internal/metric/NoValueReason;)V", "component1", "()Ljava/lang/Long;", "component2", "()Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;", "component3", "()Lcom/datadog/android/rum/internal/metric/NoValueReason;", "copy", "(Ljava/lang/Long;Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;Lcom/datadog/android/rum/internal/metric/NoValueReason;)Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsConfig;", "getConfig", "Ljava/lang/Long;", "getInitializationTime", "Lcom/datadog/android/rum/internal/metric/NoValueReason;", "getNoValueReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ViewInitializationMetricsState {
    private final com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig config;
    private final java.lang.Long initializationTime;
    private final com.datadog.android.rum.internal.metric.NoValueReason noValueReason;

    public ViewInitializationMetricsState(java.lang.Long l, com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig viewInitializationMetricsConfig, com.datadog.android.rum.internal.metric.NoValueReason noValueReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInitializationMetricsConfig, "");
        this.initializationTime = l;
        this.config = viewInitializationMetricsConfig;
        this.noValueReason = noValueReason;
    }

    public final java.lang.Long getInitializationTime() {
        return this.initializationTime;
    }

    public final com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig getConfig() {
        return this.config;
    }

    public final com.datadog.android.rum.internal.metric.NoValueReason getNoValueReason() {
        return this.noValueReason;
    }

    public final java.lang.String toString() {
        java.lang.Long l = this.initializationTime;
        com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig viewInitializationMetricsConfig = this.config;
        com.datadog.android.rum.internal.metric.NoValueReason noValueReason = this.noValueReason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewInitializationMetricsState(initializationTime=");
        sb.append(l);
        sb.append(", config=");
        sb.append(viewInitializationMetricsConfig);
        sb.append(", noValueReason=");
        sb.append(noValueReason);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Long l = this.initializationTime;
        int hashCode = l == null ? 0 : l.hashCode();
        int hashCode2 = this.config.hashCode();
        com.datadog.android.rum.internal.metric.NoValueReason noValueReason = this.noValueReason;
        return (((hashCode * 31) + hashCode2) * 31) + (noValueReason != null ? noValueReason.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.metric.ViewInitializationMetricsState)) {
            return false;
        }
        com.datadog.android.rum.internal.metric.ViewInitializationMetricsState viewInitializationMetricsState = (com.datadog.android.rum.internal.metric.ViewInitializationMetricsState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.initializationTime, viewInitializationMetricsState.initializationTime) && this.config == viewInitializationMetricsState.config && kotlin.jvm.internal.Intrinsics.areEqual(this.noValueReason, viewInitializationMetricsState.noValueReason);
    }

    public final com.datadog.android.rum.internal.metric.ViewInitializationMetricsState copy(java.lang.Long initializationTime, com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig config, com.datadog.android.rum.internal.metric.NoValueReason noValueReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new com.datadog.android.rum.internal.metric.ViewInitializationMetricsState(initializationTime, config, noValueReason);
    }

    /* renamed from: component3, reason: from getter */
    public final com.datadog.android.rum.internal.metric.NoValueReason getNoValueReason() {
        return this.noValueReason;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig getConfig() {
        return this.config;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getInitializationTime() {
        return this.initializationTime;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.metric.ViewInitializationMetricsState copy$default(com.datadog.android.rum.internal.metric.ViewInitializationMetricsState viewInitializationMetricsState, java.lang.Long l, com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig viewInitializationMetricsConfig, com.datadog.android.rum.internal.metric.NoValueReason noValueReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = viewInitializationMetricsState.initializationTime;
        }
        if ((i & 2) != 0) {
            viewInitializationMetricsConfig = viewInitializationMetricsState.config;
        }
        if ((i & 4) != 0) {
            noValueReason = viewInitializationMetricsState.noValueReason;
        }
        return viewInitializationMetricsState.copy(l, viewInitializationMetricsConfig, noValueReason);
    }
}
