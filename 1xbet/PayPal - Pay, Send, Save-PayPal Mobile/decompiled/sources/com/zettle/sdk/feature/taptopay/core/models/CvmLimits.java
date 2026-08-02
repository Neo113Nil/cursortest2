package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "", "", "Lcom/zettle/sdk/feature/taptopay/core/models/CardScheme;", "", "limits", "defaultLimitValue", "<init>", "(Ljava/util/Map;J)V", "component1", "()Ljava/util/Map;", "component2", "()J", "copy", "(Ljava/util/Map;J)Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimits;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDefaultLimitValue", "Ljava/util/Map;", "getLimits"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvmLimits {
    private final long defaultLimitValue;
    private final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> limits;

    public CvmLimits(java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> map, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.limits = map;
        this.defaultLimitValue = j;
    }

    public final long getDefaultLimitValue() {
        return this.defaultLimitValue;
    }

    public final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> getLimits() {
        return this.limits;
    }

    public final java.lang.String toString() {
        java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> map = this.limits;
        long j = this.defaultLimitValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CvmLimits(limits=");
        sb.append(map);
        sb.append(", defaultLimitValue=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.limits.hashCode() * 31) + java.lang.Long.hashCode(this.defaultLimitValue);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.models.CvmLimits)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits = (com.zettle.sdk.feature.taptopay.core.models.CvmLimits) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.limits, cvmLimits.limits) && this.defaultLimitValue == cvmLimits.defaultLimitValue;
    }

    public final com.zettle.sdk.feature.taptopay.core.models.CvmLimits copy(java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> limits, long defaultLimitValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limits, "");
        return new com.zettle.sdk.feature.taptopay.core.models.CvmLimits(limits, defaultLimitValue);
    }

    /* renamed from: component2, reason: from getter */
    public final long getDefaultLimitValue() {
        return this.defaultLimitValue;
    }

    public final java.util.Map<com.zettle.sdk.feature.taptopay.core.models.CardScheme, java.lang.Long> component1() {
        return this.limits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.CvmLimits copy$default(com.zettle.sdk.feature.taptopay.core.models.CvmLimits cvmLimits, java.util.Map map, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = cvmLimits.limits;
        }
        if ((i & 2) != 0) {
            j = cvmLimits.defaultLimitValue;
        }
        return cvmLimits.copy(map, j);
    }
}
