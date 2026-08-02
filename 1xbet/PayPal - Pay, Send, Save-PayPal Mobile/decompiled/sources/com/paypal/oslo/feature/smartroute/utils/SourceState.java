package com.paypal.oslo.feature.smartroute.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "", "", "maxValue", "minValue", "remainValue", "", "Lcom/paypal/oslo/feature/smartroute/utils/SliderTarget;", "listSliderTargets", "<init>", "(IIILjava/util/List;)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(IIILjava/util/List;)Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxValue", "getMinValue", "getRemainValue", "Ljava/util/List;", "getListSliderTargets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SourceState {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> listSliderTargets;
    private final int maxValue;
    private final int minValue;
    private final int remainValue;

    public SourceState(int i, int i2, int i3, java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.maxValue = i;
        this.minValue = i2;
        this.remainValue = i3;
        this.listSliderTargets = list;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getRemainValue() {
        return this.remainValue;
    }

    public final java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> getListSliderTargets() {
        return this.listSliderTargets;
    }

    public final java.lang.String toString() {
        int i = this.maxValue;
        int i2 = this.minValue;
        int i3 = this.remainValue;
        java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> list = this.listSliderTargets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SourceState(maxValue=");
        sb.append(i);
        sb.append(", minValue=");
        sb.append(i2);
        sb.append(", remainValue=");
        sb.append(i3);
        sb.append(", listSliderTargets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.maxValue) * 31) + java.lang.Integer.hashCode(this.minValue)) * 31) + java.lang.Integer.hashCode(this.remainValue)) * 31) + this.listSliderTargets.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.utils.SourceState)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.utils.SourceState sourceState = (com.paypal.oslo.feature.smartroute.utils.SourceState) other;
        return this.maxValue == sourceState.maxValue && this.minValue == sourceState.minValue && this.remainValue == sourceState.remainValue && kotlin.jvm.internal.Intrinsics.areEqual(this.listSliderTargets, sourceState.listSliderTargets);
    }

    public final com.paypal.oslo.feature.smartroute.utils.SourceState copy(int maxValue, int minValue, int remainValue, java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> listSliderTargets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listSliderTargets, "");
        return new com.paypal.oslo.feature.smartroute.utils.SourceState(maxValue, minValue, remainValue, listSliderTargets);
    }

    public final java.util.List<com.paypal.oslo.feature.smartroute.utils.SliderTarget> component4() {
        return this.listSliderTargets;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRemainValue() {
        return this.remainValue;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.smartroute.utils.SourceState copy$default(com.paypal.oslo.feature.smartroute.utils.SourceState sourceState, int i, int i2, int i3, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = sourceState.maxValue;
        }
        if ((i4 & 2) != 0) {
            i2 = sourceState.minValue;
        }
        if ((i4 & 4) != 0) {
            i3 = sourceState.remainValue;
        }
        if ((i4 & 8) != 0) {
            list = sourceState.listSliderTargets;
        }
        return sourceState.copy(i, i2, i3, list);
    }
}
