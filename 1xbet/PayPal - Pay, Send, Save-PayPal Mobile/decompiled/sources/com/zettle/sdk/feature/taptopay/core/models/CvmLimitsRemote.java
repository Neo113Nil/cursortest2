package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/CvmLimitsRemote;", "", "", "", "", "limits", "defaultLimitValue", "<init>", "(Ljava/util/Map;J)V", "J", "getDefaultLimitValue", "()J", "Ljava/util/Map;", "getLimits", "()Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvmLimitsRemote {
    private final long defaultLimitValue;
    private final java.util.Map<java.lang.String, java.lang.Long> limits;

    public CvmLimitsRemote(java.util.Map<java.lang.String, java.lang.Long> map, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.limits = map;
        this.defaultLimitValue = j;
    }

    public final long getDefaultLimitValue() {
        return this.defaultLimitValue;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getLimits() {
        return this.limits;
    }
}
