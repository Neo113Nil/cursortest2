package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0016\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerConfig;", "", "Lcom/paypal/pds/components/BannerStyle;", "p0", "", "p1", "", "p2", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;", "p3", "<init>", "(Lcom/paypal/pds/components/BannerStyle;Ljava/lang/String;ZLcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/pds/components/BannerStyle;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Z", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/BannerLinkConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class BannerConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.pds.components.BannerStyle getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig getHighResolutionOutputSizeshNQ4ISI;

    public BannerConfig(com.paypal.pds.components.BannerStyle bannerStyle, java.lang.String str, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = bannerStyle;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = bannerLinkConfig;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.BannerStyle bannerStyle = this.getHighSpeedVideoSizes;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BannerConfig(getHighSpeedVideoSizes=");
        sb.append(bannerStyle);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(z);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(bannerLinkConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bannerLinkConfig == null ? 0 : bannerLinkConfig.hashCode());
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig bannerConfig = (com.paypal.oslo.feature.consumerprivacy.ui.components.BannerConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, bannerConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, bannerConfig.getHighSpeedVideoFpsRangesFor) && this.Camera2StreamConfigurationMap == bannerConfig.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, bannerConfig.getHighResolutionOutputSizeshNQ4ISI);
    }
}
