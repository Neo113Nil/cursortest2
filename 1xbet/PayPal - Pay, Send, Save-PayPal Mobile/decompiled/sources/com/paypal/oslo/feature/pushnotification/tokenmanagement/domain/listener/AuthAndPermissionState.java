package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/AuthAndPermissionState;", "", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "p0", "", "p1", "<init>", "(Lcom/paypal/oslo/core/identity/UserAccessTokenState;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class AuthAndPermissionState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;
    final com.paypal.oslo.core.identity.UserAccessTokenState getHighSpeedVideoFpsRanges;

    public AuthAndPermissionState(com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenState, "");
        this.getHighSpeedVideoFpsRanges = userAccessTokenState;
        this.getHighSpeedVideoSizes = z;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState = this.getHighSpeedVideoFpsRanges;
        boolean z = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthAndPermissionState(getHighSpeedVideoFpsRanges=");
        sb.append(userAccessTokenState);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState authAndPermissionState = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, authAndPermissionState.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes == authAndPermissionState.getHighSpeedVideoSizes;
    }
}
