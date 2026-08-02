package com.datadog.android.rum.internal.startup;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "", "durationNs", "", "wasForwarded", "<init>", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;JZ)V", "component1", "()Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "component2", "()J", "component3", "()Z", "copy", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;JZ)Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDurationNs", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", "getScenario", "Z", "getWasForwarded"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumTTIDInfo {
    private final long durationNs;
    private final com.datadog.android.rum.internal.startup.RumStartupScenario scenario;
    private final boolean wasForwarded;

    public RumTTIDInfo(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumStartupScenario, "");
        this.scenario = rumStartupScenario;
        this.durationNs = j;
        this.wasForwarded = z;
    }

    public /* synthetic */ RumTTIDInfo(com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rumStartupScenario, j, (i & 4) != 0 ? false : z);
    }

    public final com.datadog.android.rum.internal.startup.RumStartupScenario getScenario() {
        return this.scenario;
    }

    public final long getDurationNs() {
        return this.durationNs;
    }

    public final boolean getWasForwarded() {
        return this.wasForwarded;
    }

    public final java.lang.String toString() {
        com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario = this.scenario;
        long j = this.durationNs;
        boolean z = this.wasForwarded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumTTIDInfo(scenario=");
        sb.append(rumStartupScenario);
        sb.append(", durationNs=");
        sb.append(j);
        sb.append(", wasForwarded=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.scenario.hashCode() * 31) + java.lang.Long.hashCode(this.durationNs)) * 31) + java.lang.Boolean.hashCode(this.wasForwarded);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.startup.RumTTIDInfo)) {
            return false;
        }
        com.datadog.android.rum.internal.startup.RumTTIDInfo rumTTIDInfo = (com.datadog.android.rum.internal.startup.RumTTIDInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.scenario, rumTTIDInfo.scenario) && this.durationNs == rumTTIDInfo.durationNs && this.wasForwarded == rumTTIDInfo.wasForwarded;
    }

    public final com.datadog.android.rum.internal.startup.RumTTIDInfo copy(com.datadog.android.rum.internal.startup.RumStartupScenario scenario, long durationNs, boolean wasForwarded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
        return new com.datadog.android.rum.internal.startup.RumTTIDInfo(scenario, durationNs, wasForwarded);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWasForwarded() {
        return this.wasForwarded;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDurationNs() {
        return this.durationNs;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.rum.internal.startup.RumStartupScenario getScenario() {
        return this.scenario;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.startup.RumTTIDInfo copy$default(com.datadog.android.rum.internal.startup.RumTTIDInfo rumTTIDInfo, com.datadog.android.rum.internal.startup.RumStartupScenario rumStartupScenario, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rumStartupScenario = rumTTIDInfo.scenario;
        }
        if ((i & 2) != 0) {
            j = rumTTIDInfo.durationNs;
        }
        if ((i & 4) != 0) {
            z = rumTTIDInfo.wasForwarded;
        }
        return rumTTIDInfo.copy(rumStartupScenario, j, z);
    }
}
