package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Landroidx/metrics/performance/StateInfo;", "", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getKey", "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StateInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.metrics.performance.StateInfo.Companion INSTANCE = new androidx.metrics.performance.StateInfo.Companion(null);
    private static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, androidx.metrics.performance.StateInfo>> pool = new java.util.LinkedHashMap();
    private final java.lang.String key;
    private final java.lang.String value;

    public StateInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.metrics.performance.StateInfo stateInfo = (androidx.metrics.performance.StateInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.key, stateInfo.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, stateInfo.value);
    }

    public final int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.key);
        sb.append(": ");
        sb.append(this.value);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR/\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n0\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/metrics/performance/StateInfo$Companion;", "", "<init>", "()V", "", "stateName", "state", "Landroidx/metrics/performance/StateInfo;", "getStateInfo", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/metrics/performance/StateInfo;", "", "pool", "Ljava/util/Map;", "getPool", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, androidx.metrics.performance.StateInfo>> getPool() {
            return androidx.metrics.performance.StateInfo.pool;
        }

        public final androidx.metrics.performance.StateInfo getStateInfo(java.lang.String stateName, java.lang.String state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            synchronized (getPool()) {
                java.util.Map<java.lang.String, androidx.metrics.performance.StateInfo> map = androidx.metrics.performance.StateInfo.INSTANCE.getPool().get(stateName);
                androidx.metrics.performance.StateInfo stateInfo = map != null ? map.get(state) : null;
                if (stateInfo != null) {
                    return stateInfo;
                }
                androidx.metrics.performance.StateInfo stateInfo2 = new androidx.metrics.performance.StateInfo(stateName, state);
                if (map != null) {
                    map.put(state, stateInfo2);
                } else {
                    androidx.metrics.performance.StateInfo.INSTANCE.getPool().put(stateName, kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(state, stateInfo2)));
                }
                return stateInfo2;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
