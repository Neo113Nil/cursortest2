package com.datadog.android.internal.telemetry;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/datadog/android/internal/telemetry/TracingHeaderTypesSet;", "", "", "Lcom/datadog/android/internal/telemetry/TracingHeaderType;", "types", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/datadog/android/internal/telemetry/TracingHeaderTypesSet;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getTypes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TracingHeaderTypesSet {
    private final java.util.Set<com.datadog.android.internal.telemetry.TracingHeaderType> types;

    /* JADX WARN: Multi-variable type inference failed */
    public TracingHeaderTypesSet(java.util.Set<? extends com.datadog.android.internal.telemetry.TracingHeaderType> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.types = set;
    }

    public final java.util.Set<com.datadog.android.internal.telemetry.TracingHeaderType> getTypes() {
        return this.types;
    }

    public final java.lang.String toString() {
        java.util.Set<com.datadog.android.internal.telemetry.TracingHeaderType> set = this.types;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TracingHeaderTypesSet(types=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.types.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.internal.telemetry.TracingHeaderTypesSet) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, ((com.datadog.android.internal.telemetry.TracingHeaderTypesSet) other).types);
    }

    public final com.datadog.android.internal.telemetry.TracingHeaderTypesSet copy(java.util.Set<? extends com.datadog.android.internal.telemetry.TracingHeaderType> types) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
        return new com.datadog.android.internal.telemetry.TracingHeaderTypesSet(types);
    }

    public final java.util.Set<com.datadog.android.internal.telemetry.TracingHeaderType> component1() {
        return this.types;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.internal.telemetry.TracingHeaderTypesSet copy$default(com.datadog.android.internal.telemetry.TracingHeaderTypesSet tracingHeaderTypesSet, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = tracingHeaderTypesSet.types;
        }
        return tracingHeaderTypesSet.copy(set);
    }
}
