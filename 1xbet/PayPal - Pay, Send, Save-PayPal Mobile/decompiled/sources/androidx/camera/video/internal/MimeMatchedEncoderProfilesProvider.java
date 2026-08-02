package androidx.camera.video.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/video/internal/MimeMatchedEncoderProfilesProvider;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "baseProvider", "", "videoMime", "audioMime", "<init>", "(Landroidx/camera/core/impl/EncoderProfilesProvider;Ljava/lang/String;Ljava/lang/String;)V", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "hasProfile", "(I)Z", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getAll", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MimeMatchedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.EncoderProfilesProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public MimeMatchedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderProfilesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = encoderProfilesProvider;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    public /* synthetic */ MimeMatchedEncoderProfilesProvider(androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(encoderProfilesProvider, (i & 2) != 0 ? androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED : str, (i & 4) != 0 ? androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED : str2);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int quality) {
        return getAll(quality) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final androidx.camera.core.impl.EncoderProfilesProxy getAll(int quality) {
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy;
        synchronized (this.Camera2StreamConfigurationMap) {
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> map = this.Camera2StreamConfigurationMap;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(quality);
            androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy2 = map.get(valueOf);
            if (encoderProfilesProxy2 == null) {
                androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy all = this.getHighSpeedVideoFpsRanges.getAll(quality);
                encoderProfilesProxy2 = null;
                if (all != null) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED) || !kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED)) {
                        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles = all.getVideoProfiles();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(videoProfiles, "");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : videoProfiles) {
                            androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) obj;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED) || kotlin.jvm.internal.Intrinsics.areEqual(videoProfileProxy.getMediaType(), this.getHighSpeedVideoFpsRangesFor)) {
                                arrayList.add(obj);
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> audioProfiles = all.getAudioProfiles();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(audioProfiles, "");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : audioProfiles) {
                            androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy) obj2;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED) || kotlin.jvm.internal.Intrinsics.areEqual(audioProfileProxy.getMediaType(), this.getHighSpeedVideoSizes)) {
                                arrayList3.add(obj2);
                            }
                        }
                        java.util.ArrayList arrayList4 = arrayList3;
                        if (arrayList2.size() != all.getVideoProfiles().size() || arrayList4.size() != all.getAudioProfiles().size()) {
                            all = (arrayList2.isEmpty() && arrayList4.isEmpty()) ? null : androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all.getDefaultDurationSeconds(), all.getRecommendedFileFormat(), arrayList4, arrayList2);
                        }
                    }
                    encoderProfilesProxy2 = all;
                }
                map.put(valueOf, encoderProfilesProxy2);
            }
            encoderProfilesProxy = encoderProfilesProxy2;
        }
        return encoderProfilesProxy;
    }
}
