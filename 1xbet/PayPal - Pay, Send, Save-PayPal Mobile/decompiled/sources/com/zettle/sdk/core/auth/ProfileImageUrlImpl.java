package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/auth/ProfileImageUrlImpl;", "Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getLarge", "getHighSpeedVideoFpsRangesFor", "getMedium", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getSmall", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class ProfileImageUrlImpl implements com.zettle.sdk.core.auth.User.ProfileImageUrl {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public ProfileImageUrlImpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.text.StringsKt.replace(str, "[size]", "l", false);
        this.getHighSpeedVideoFpsRanges = kotlin.text.StringsKt.replace(str, "[size]", "m", false);
        this.Camera2StreamConfigurationMap = kotlin.text.StringsKt.replace(str, "[size]", lib.android.paypal.com.magnessdk.g.n2, false);
    }

    @Override // com.zettle.sdk.core.auth.User.ProfileImageUrl
    /* renamed from: getLarge, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.core.auth.User.ProfileImageUrl
    /* renamed from: getMedium, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.zettle.sdk.core.auth.User.ProfileImageUrl
    /* renamed from: getSmall, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileImageUrlImpl(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof com.zettle.sdk.core.auth.ProfileImageUrlImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((com.zettle.sdk.core.auth.ProfileImageUrlImpl) p0).getHighSpeedVideoFpsRangesFor);
    }
}
