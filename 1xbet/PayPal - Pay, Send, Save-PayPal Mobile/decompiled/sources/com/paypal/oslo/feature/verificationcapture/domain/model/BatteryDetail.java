package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "", "", "current", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "", "temperature", "<init>", "(IIF)V", "component1", "()I", "component2", "component3", "()F", "copy", "(IIF)Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCurrent", "getMax", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTemperature"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BatteryDetail {
    public static final int $stable = 0;
    private final int current;
    private final int max;
    private final float temperature;

    public BatteryDetail(int i, int i2, float f) {
        this.current = i;
        this.max = i2;
        this.temperature = f;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public final java.lang.String toString() {
        int i = this.current;
        int i2 = this.max;
        float f = this.temperature;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatteryDetail(current=");
        sb.append(i);
        sb.append(", max=");
        sb.append(i2);
        sb.append(", temperature=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.current) * 31) + java.lang.Integer.hashCode(this.max)) * 31) + java.lang.Float.hashCode(this.temperature);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail batteryDetail = (com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail) other;
        return this.current == batteryDetail.current && this.max == batteryDetail.max && java.lang.Float.compare(this.temperature, batteryDetail.temperature) == 0;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail copy(int current, int max, float temperature) {
        return new com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail(current, max, temperature);
    }

    /* renamed from: component3, reason: from getter */
    public final float getTemperature() {
        return this.temperature;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail batteryDetail, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = batteryDetail.current;
        }
        if ((i3 & 2) != 0) {
            i2 = batteryDetail.max;
        }
        if ((i3 & 4) != 0) {
            f = batteryDetail.temperature;
        }
        return batteryDetail.copy(i, i2, f);
    }
}
