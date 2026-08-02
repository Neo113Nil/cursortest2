package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/TransitionContext;", "", "Lcom/paypal/oslo/core/navigation/NavigationTransitionType;", "p0", "", "p1", "<init>", "(Lcom/paypal/oslo/core/navigation/NavigationTransitionType;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/navigation/NavigationTransitionType;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class TransitionContext {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.oslo.core.navigation.NavigationTransitionType Camera2StreamConfigurationMap;

    public TransitionContext(com.paypal.oslo.core.navigation.NavigationTransitionType navigationTransitionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationTransitionType, "");
        this.Camera2StreamConfigurationMap = navigationTransitionType;
        this.getHighSpeedVideoFpsRangesFor = 400;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.navigation.NavigationTransitionType navigationTransitionType = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionContext(Camera2StreamConfigurationMap=");
        sb.append(navigationTransitionType);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.core.navigation.ui.TransitionContext)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.TransitionContext transitionContext = (com.paypal.oslo.core.navigation.ui.TransitionContext) p0;
        return this.Camera2StreamConfigurationMap == transitionContext.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == transitionContext.getHighSpeedVideoFpsRangesFor;
    }
}
