package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0016R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/core/auth/UserInfoImpl;", "Lcom/zettle/sdk/core/auth/User$Info;", "", "p0", "p1", "Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "p2", "p3", "Lcom/zettle/sdk/core/user/CountryCode;", "p4", "Lcom/zettle/sdk/core/user/CurrencyCode;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;Ljava/lang/String;Lcom/zettle/sdk/core/user/CountryCode;Lcom/zettle/sdk/core/user/CurrencyCode;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/user/CountryCode;", "getCountry", "()Lcom/zettle/sdk/core/user/CountryCode;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/user/CurrencyCode;", "getCurrency", "()Lcom/zettle/sdk/core/user/CurrencyCode;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "getImageUrl", "()Lcom/zettle/sdk/core/auth/User$ProfileImageUrl;", "Ljava/lang/String;", "getOrganizationId", "getHighSpeedVideoFpsRangesFor", "getPublicName", "getHighSpeedVideoSizesFor", "getUserId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class UserInfoImpl implements com.zettle.sdk.core.auth.User.Info {
    private final com.zettle.sdk.core.user.CountryCode Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.CurrencyCode getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.core.auth.User.ProfileImageUrl getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;

    public UserInfoImpl(java.lang.String str, java.lang.String str2, com.zettle.sdk.core.auth.User.ProfileImageUrl profileImageUrl, java.lang.String str3, com.zettle.sdk.core.user.CountryCode countryCode, com.zettle.sdk.core.user.CurrencyCode currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        this.getHighSpeedVideoSizesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = profileImageUrl;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.Camera2StreamConfigurationMap = countryCode;
        this.getHighSpeedVideoFpsRanges = currencyCode;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getUserId, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getPublicName, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getImageUrl, reason: from getter */
    public final com.zettle.sdk.core.auth.User.ProfileImageUrl getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getOrganizationId, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getCountry, reason: from getter */
    public final com.zettle.sdk.core.user.CountryCode getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.zettle.sdk.core.auth.User.Info
    /* renamed from: getCurrency, reason: from getter */
    public final com.zettle.sdk.core.user.CurrencyCode getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.String getHighSpeedVideoSizesFor = getGetHighSpeedVideoSizesFor();
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        com.zettle.sdk.core.auth.User.ProfileImageUrl getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        java.lang.String getHighSpeedVideoFpsRangesFor = getGetHighSpeedVideoFpsRangesFor();
        com.zettle.sdk.core.user.CountryCode camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
        com.zettle.sdk.core.user.CurrencyCode getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfoImpl(getHighSpeedVideoSizesFor=");
        sb.append(getHighSpeedVideoSizesFor);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(getHighSpeedVideoFpsRangesFor);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(getHighSpeedVideoFpsRanges);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = getGetHighSpeedVideoSizesFor() == null ? 0 : getGetHighSpeedVideoSizesFor().hashCode();
        int hashCode2 = getGetHighResolutionOutputSizeshNQ4ISI() == null ? 0 : getGetHighResolutionOutputSizeshNQ4ISI().hashCode();
        int hashCode3 = getGetHighSpeedVideoSizes() == null ? 0 : getGetHighSpeedVideoSizes().hashCode();
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (getGetHighSpeedVideoFpsRangesFor() == null ? 0 : getGetHighSpeedVideoFpsRangesFor().hashCode())) * 31) + (getCamera2StreamConfigurationMap() != null ? getCamera2StreamConfigurationMap().hashCode() : 0)) * 31) + getGetHighSpeedVideoFpsRanges().hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.zettle.sdk.core.auth.UserInfoImpl)) {
            return false;
        }
        com.zettle.sdk.core.auth.UserInfoImpl userInfoImpl = (com.zettle.sdk.core.auth.UserInfoImpl) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizesFor(), userInfoImpl.getGetHighSpeedVideoSizesFor()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighResolutionOutputSizeshNQ4ISI(), userInfoImpl.getGetHighResolutionOutputSizeshNQ4ISI()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizes(), userInfoImpl.getGetHighSpeedVideoSizes()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRangesFor(), userInfoImpl.getGetHighSpeedVideoFpsRangesFor()) && getCamera2StreamConfigurationMap() == userInfoImpl.getCamera2StreamConfigurationMap() && getGetHighSpeedVideoFpsRanges() == userInfoImpl.getGetHighSpeedVideoFpsRanges();
    }
}
