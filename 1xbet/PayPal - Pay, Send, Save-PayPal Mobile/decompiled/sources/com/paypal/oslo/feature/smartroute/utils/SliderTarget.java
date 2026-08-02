package com.paypal.oslo.feature.smartroute.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "maxValue", "", "id", "", "stepSize", "<init>", "(IILjava/lang/String;F)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()F", "copy", "(IILjava/lang/String;F)Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "getMaxValue", "Ljava/lang/String;", "getId", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStepSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SliderTarget {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final int maxValue;
    private final float stepSize;
    private final int value;

    public SliderTarget(int i, int i2, java.lang.String str, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = i;
        this.maxValue = i2;
        this.id = str;
        this.stepSize = f;
    }

    public /* synthetic */ SliderTarget(int i, int i2, java.lang.String str, float f, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? 1.0f : f);
    }

    public final int getValue() {
        return this.value;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final float getStepSize() {
        return this.stepSize;
    }

    public final java.lang.String toString() {
        int i = this.value;
        int i2 = this.maxValue;
        java.lang.String str = this.id;
        float f = this.stepSize;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SliderTarget(value=");
        sb.append(i);
        sb.append(", maxValue=");
        sb.append(i2);
        sb.append(", id=");
        sb.append(str);
        sb.append(", stepSize=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.value) * 31) + java.lang.Integer.hashCode(this.maxValue)) * 31) + this.id.hashCode()) * 31) + java.lang.Float.hashCode(this.stepSize);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.utils.SliderTarget)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget = (com.paypal.oslo.feature.smartroute.utils.SliderTarget) other;
        return this.value == sliderTarget.value && this.maxValue == sliderTarget.maxValue && kotlin.jvm.internal.Intrinsics.areEqual(this.id, sliderTarget.id) && java.lang.Float.compare(this.stepSize, sliderTarget.stepSize) == 0;
    }

    public final com.paypal.oslo.feature.smartroute.utils.SliderTarget copy(int value, int maxValue, java.lang.String id, float stepSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.smartroute.utils.SliderTarget(value, maxValue, id, stepSize);
    }

    /* renamed from: component4, reason: from getter */
    public final float getStepSize() {
        return this.stepSize;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.utils.SliderTarget copy$default(com.paypal.oslo.feature.smartroute.utils.SliderTarget sliderTarget, int i, int i2, java.lang.String str, float f, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = sliderTarget.value;
        }
        if ((i3 & 2) != 0) {
            i2 = sliderTarget.maxValue;
        }
        if ((i3 & 4) != 0) {
            str = sliderTarget.id;
        }
        if ((i3 & 8) != 0) {
            f = sliderTarget.stepSize;
        }
        return sliderTarget.copy(i, i2, str, f);
    }
}
