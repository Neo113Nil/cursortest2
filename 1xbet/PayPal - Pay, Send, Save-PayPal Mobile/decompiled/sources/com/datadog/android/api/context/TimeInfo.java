package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/datadog/android/api/context/TimeInfo;", "", "", "deviceTimeNs", "serverTimeNs", "serverTimeOffsetNs", "serverTimeOffsetMs", "<init>", "(JJJJ)V", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/datadog/android/api/context/TimeInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDeviceTimeNs", "getServerTimeNs", "getServerTimeOffsetMs", "getServerTimeOffsetNs", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimeInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.context.TimeInfo.Companion INSTANCE = new com.datadog.android.api.context.TimeInfo.Companion(null);
    private static final com.datadog.android.api.context.TimeInfo EMPTY = new com.datadog.android.api.context.TimeInfo(0, 0, 0, 0);
    private final long deviceTimeNs;
    private final long serverTimeNs;
    private final long serverTimeOffsetMs;
    private final long serverTimeOffsetNs;

    public TimeInfo(long j, long j2, long j3, long j4) {
        this.deviceTimeNs = j;
        this.serverTimeNs = j2;
        this.serverTimeOffsetNs = j3;
        this.serverTimeOffsetMs = j4;
    }

    public final long getDeviceTimeNs() {
        return this.deviceTimeNs;
    }

    public final long getServerTimeNs() {
        return this.serverTimeNs;
    }

    public final long getServerTimeOffsetNs() {
        return this.serverTimeOffsetNs;
    }

    public final long getServerTimeOffsetMs() {
        return this.serverTimeOffsetMs;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/context/TimeInfo$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/context/TimeInfo;", "EMPTY", "Lcom/datadog/android/api/context/TimeInfo;", "getEMPTY$dd_sdk_android_core_release", "()Lcom/datadog/android/api/context/TimeInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.api.context.TimeInfo getEMPTY$dd_sdk_android_core_release() {
            return com.datadog.android.api.context.TimeInfo.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        long j = this.deviceTimeNs;
        long j2 = this.serverTimeNs;
        long j3 = this.serverTimeOffsetNs;
        long j4 = this.serverTimeOffsetMs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeInfo(deviceTimeNs=");
        sb.append(j);
        sb.append(", serverTimeNs=");
        sb.append(j2);
        sb.append(", serverTimeOffsetNs=");
        sb.append(j3);
        sb.append(", serverTimeOffsetMs=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Long.hashCode(this.deviceTimeNs) * 31) + java.lang.Long.hashCode(this.serverTimeNs)) * 31) + java.lang.Long.hashCode(this.serverTimeOffsetNs)) * 31) + java.lang.Long.hashCode(this.serverTimeOffsetMs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.TimeInfo)) {
            return false;
        }
        com.datadog.android.api.context.TimeInfo timeInfo = (com.datadog.android.api.context.TimeInfo) other;
        return this.deviceTimeNs == timeInfo.deviceTimeNs && this.serverTimeNs == timeInfo.serverTimeNs && this.serverTimeOffsetNs == timeInfo.serverTimeOffsetNs && this.serverTimeOffsetMs == timeInfo.serverTimeOffsetMs;
    }

    public final com.datadog.android.api.context.TimeInfo copy(long deviceTimeNs, long serverTimeNs, long serverTimeOffsetNs, long serverTimeOffsetMs) {
        return new com.datadog.android.api.context.TimeInfo(deviceTimeNs, serverTimeNs, serverTimeOffsetNs, serverTimeOffsetMs);
    }

    /* renamed from: component4, reason: from getter */
    public final long getServerTimeOffsetMs() {
        return this.serverTimeOffsetMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getServerTimeOffsetNs() {
        return this.serverTimeOffsetNs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getServerTimeNs() {
        return this.serverTimeNs;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDeviceTimeNs() {
        return this.deviceTimeNs;
    }
}
