package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/adapter/EncoderProfilesProviderAdapter;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "", "cameraIdString", "Landroidx/camera/core/impl/Quirks;", "cameraQuirks", "<init>", "(Ljava/lang/String;Landroidx/camera/core/impl/Quirks;)V", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "hasProfile", "(I)Z", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getAll", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "p0", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/Quirks;", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "", "Ljava/util/Map;", "Companion", "Api31Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncoderProfilesProviderAdapter implements androidx.camera.core.impl.EncoderProfilesProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.core.impl.Quirks Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public EncoderProfilesProviderAdapter(java.lang.String str, androidx.camera.core.impl.Quirks quirks) {
        boolean z;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = quirks;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        try {
            i = java.lang.Integer.parseInt(str);
            z = true;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera id is not an integer:  ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", unable to create EncoderProfilesProviderAdapter.");
            androidx.camera.core.Logger.w("EncoderProfilesProviderAdapter", sb.toString());
            z = false;
            i = -1;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int quality) {
        return this.getHighResolutionOutputSizeshNQ4ISI && getAll(quality) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final androidx.camera.core.impl.EncoderProfilesProxy getAll(int quality) {
        androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk;
        androidx.camera.core.impl.EncoderProfilesProxy all;
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = null;
        if (!this.getHighResolutionOutputSizeshNQ4ISI || !android.media.CamcorderProfile.hasProfile(this.getHighSpeedVideoSizes, quality)) {
            return null;
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(java.lang.Integer.valueOf(quality))) {
            return this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(quality));
        }
        androidx.camera.core.impl.EncoderProfilesProxy Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(quality);
        if (Camera2StreamConfigurationMap != null && (camcorderProfileResolutionQuirk = (androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk) this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.class)) != null) {
            java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles = Camera2StreamConfigurationMap.getVideoProfiles();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(videoProfiles, "");
            if (!videoProfiles.isEmpty()) {
                if (!camcorderProfileResolutionQuirk.getSupportedResolutions().contains(videoProfiles.get(0).getResolution())) {
                    if (quality != 0) {
                        if (quality == 1) {
                            for (java.lang.Integer num : androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                                all = getAll(num.intValue());
                                if (all != null) {
                                    encoderProfilesProxy = all;
                                    break;
                                }
                            }
                        }
                        Camera2StreamConfigurationMap = encoderProfilesProxy;
                    } else {
                        java.util.List<java.lang.Integer> list = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
                        for (int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list); lastIndex >= 0; lastIndex--) {
                            java.lang.Integer num2 = androidx.camera.core.impl.EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.get(lastIndex);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num2, "");
                            all = getAll(num2.intValue());
                            if (all != null) {
                                encoderProfilesProxy = all;
                                break;
                            }
                        }
                        Camera2StreamConfigurationMap = encoderProfilesProxy;
                    }
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(quality), Camera2StreamConfigurationMap);
        return Camera2StreamConfigurationMap;
    }

    private final androidx.camera.core.impl.EncoderProfilesProxy Camera2StreamConfigurationMap(int p0) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.media.EncoderProfiles all = androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter.Api31Impl.INSTANCE.getAll(this.getHighSpeedVideoFpsRanges, p0);
            if (all == null) {
                return null;
            }
            if (androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class) != null) {
                androidx.camera.core.Logger.d("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(all);
                } catch (java.lang.NullPointerException e) {
                    androidx.camera.core.Logger.w("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e);
                }
            }
        }
        return getHighSpeedVideoSizes(p0);
    }

    private final androidx.camera.core.impl.EncoderProfilesProxy getHighSpeedVideoSizes(int p0) {
        android.media.CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = android.media.CamcorderProfile.get(this.getHighSpeedVideoSizes, p0);
        } catch (java.lang.RuntimeException e) {
            androidx.camera.core.Logger.w("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: ".concat(java.lang.String.valueOf(p0)), e);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/adapter/EncoderProfilesProviderAdapter$Api31Impl;", "", "<init>", "()V", "", "cameraId", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "Landroid/media/EncoderProfiles;", "getAll", "(Ljava/lang/String;I)Landroid/media/EncoderProfiles;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api31Impl {
        public static final androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter.Api31Impl INSTANCE = new androidx.camera.camera2.adapter.EncoderProfilesProviderAdapter.Api31Impl();

        private Api31Impl() {
        }

        public final android.media.EncoderProfiles getAll(java.lang.String cameraId, int quality) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
            return android.media.CamcorderProfile.getAll(cameraId, quality);
        }
    }
}
