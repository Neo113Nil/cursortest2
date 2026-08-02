package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "", "", "sampleCount", "", "minValue", "maxValue", "meanValue", "<init>", "(IDDD)V", "component1", "()I", "component2", "()D", "component3", "component4", "copy", "(IDDD)Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "D", "getMaxValue", "getMeanValue", "getMinValue", com.visa.cbp.getEncExpo.warmup, "getSampleCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VitalInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.vitals.VitalInfo.Companion INSTANCE = new com.datadog.android.rum.internal.vitals.VitalInfo.Companion(null);
    private static final com.datadog.android.rum.internal.vitals.VitalInfo EMPTY = new com.datadog.android.rum.internal.vitals.VitalInfo(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);
    private final double maxValue;
    private final double meanValue;
    private final double minValue;
    private final int sampleCount;

    public VitalInfo(int i, double d, double d2, double d3) {
        this.sampleCount = i;
        this.minValue = d;
        this.maxValue = d2;
        this.meanValue = d3;
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    public final double getMinValue() {
        return this.minValue;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    public final double getMeanValue() {
        return this.meanValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/VitalInfo$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "EMPTY", "Lcom/datadog/android/rum/internal/vitals/VitalInfo;", "getEMPTY", "()Lcom/datadog/android/rum/internal/vitals/VitalInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.internal.vitals.VitalInfo getEMPTY() {
            return com.datadog.android.rum.internal.vitals.VitalInfo.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        int i = this.sampleCount;
        double d = this.minValue;
        double d2 = this.maxValue;
        double d3 = this.meanValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VitalInfo(sampleCount=");
        sb.append(i);
        sb.append(", minValue=");
        sb.append(d);
        sb.append(", maxValue=");
        sb.append(d2);
        sb.append(", meanValue=");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.sampleCount) * 31) + java.lang.Double.hashCode(this.minValue)) * 31) + java.lang.Double.hashCode(this.maxValue)) * 31) + java.lang.Double.hashCode(this.meanValue);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.vitals.VitalInfo)) {
            return false;
        }
        com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo = (com.datadog.android.rum.internal.vitals.VitalInfo) other;
        return this.sampleCount == vitalInfo.sampleCount && java.lang.Double.compare(this.minValue, vitalInfo.minValue) == 0 && java.lang.Double.compare(this.maxValue, vitalInfo.maxValue) == 0 && java.lang.Double.compare(this.meanValue, vitalInfo.meanValue) == 0;
    }

    public final com.datadog.android.rum.internal.vitals.VitalInfo copy(int sampleCount, double minValue, double maxValue, double meanValue) {
        return new com.datadog.android.rum.internal.vitals.VitalInfo(sampleCount, minValue, maxValue, meanValue);
    }

    /* renamed from: component4, reason: from getter */
    public final double getMeanValue() {
        return this.meanValue;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMinValue() {
        return this.minValue;
    }

    /* renamed from: component1, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.vitals.VitalInfo copy$default(com.datadog.android.rum.internal.vitals.VitalInfo vitalInfo, int i, double d, double d2, double d3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = vitalInfo.sampleCount;
        }
        if ((i2 & 2) != 0) {
            d = vitalInfo.minValue;
        }
        double d4 = d;
        if ((i2 & 4) != 0) {
            d2 = vitalInfo.maxValue;
        }
        double d5 = d2;
        if ((i2 & 8) != 0) {
            d3 = vitalInfo.meanValue;
        }
        return vitalInfo.copy(i, d4, d5, d3);
    }
}
