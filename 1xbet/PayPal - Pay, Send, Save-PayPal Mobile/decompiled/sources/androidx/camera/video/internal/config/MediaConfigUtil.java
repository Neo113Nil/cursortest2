package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!"}, d2 = {"Landroidx/camera/video/internal/config/MediaConfigUtil;", "", "<init>", "()V", "", "", "videoMimes", "audioMimes", "", "setSupportedEncoderMimeTypes", "(Ljava/util/List;Ljava/util/List;)V", "Landroidx/camera/video/MediaSpec;", "mediaSpec", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "encoderProfiles", "Landroidx/camera/video/internal/config/MediaInfo;", "resolveMediaInfo", "(Landroidx/camera/video/MediaSpec;Landroidx/camera/core/DynamicRange;Landroidx/camera/core/impl/EncoderProfilesProxy;)Landroidx/camera/video/internal/config/MediaInfo;", "p0", "p1", "", "p2", "p3", "p4", "Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;", "getHighSpeedVideoSizes", "(Landroidx/camera/core/impl/EncoderProfilesProxy;Landroidx/camera/core/DynamicRange;ILjava/lang/String;Ljava/lang/String;)Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;", "outputFormat", "outputFormatToMuxerFormat", "(I)I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "CompatibleProfiles"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaConfigUtil {
    public static final androidx.camera.video.internal.config.MediaConfigUtil INSTANCE = new androidx.camera.video.internal.config.MediaConfigUtil();
    private static java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public static final /* synthetic */ int access$mediaRecorderFormatToOutputFormat(androidx.camera.video.internal.config.MediaConfigUtil mediaConfigUtil, int i) {
        if (i == 1 || i == 2) {
            return 0;
        }
        return i != 9 ? -1 : 1;
    }

    @kotlin.jvm.JvmStatic
    public static final int outputFormatToMuxerFormat(int outputFormat) {
        return outputFormat == 1 ? 1 : 0;
    }

    private MediaConfigUtil() {
    }

    public final void setSupportedEncoderMimeTypes(java.util.List<java.lang.String> videoMimes, java.util.List<java.lang.String> audioMimes) {
        getHighResolutionOutputSizeshNQ4ISI = videoMimes;
        getHighSpeedVideoFpsRangesFor = audioMimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.camera.video.internal.config.MediaInfo resolveMediaInfo(androidx.camera.video.MediaSpec mediaSpec, androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.impl.EncoderProfilesProxy encoderProfiles) {
        androidx.camera.video.internal.config.MediaInfo inputFormats;
        java.lang.Object obj;
        androidx.camera.video.internal.config.FormatCombo formatCombo;
        androidx.camera.video.internal.config.FormatCombo formatCombo2;
        androidx.camera.video.internal.config.MediaInfo mediaInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Resolving MediaInfo for MediaSpec: ");
        sb.append(mediaSpec);
        sb.append(", DynamicRange: ");
        sb.append(dynamicRange);
        sb.append(", EncoderProfiles: ");
        sb.append(encoderProfiles);
        androidx.camera.core.Logger.d("MediaConfigUtil", sb.toString());
        int outputFormat = mediaSpec.getOutputFormat();
        java.lang.String mimeType = mediaSpec.getVideoSpec().getMimeType();
        java.lang.String mimeType2 = mediaSpec.getAudioSpec().getMimeType();
        androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles highSpeedVideoSizes = getHighSpeedVideoSizes(encoderProfiles, dynamicRange, outputFormat, mimeType, mimeType2);
        androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved CompatibleProfiles: ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
        if (!highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor()) {
            highSpeedVideoSizes = null;
        }
        if (highSpeedVideoSizes == null) {
            inputFormats = null;
        } else {
            inputFormats = highSpeedVideoSizes.getInputFormats();
            androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved MediaInfo by CompatibleProfiles: ".concat(java.lang.String.valueOf(inputFormats)));
        }
        if (inputFormats != null) {
            return inputFormats;
        }
        java.util.List<java.lang.String> list = getHighResolutionOutputSizeshNQ4ISI;
        if (list == null) {
            list = androidx.camera.video.internal.utils.CodecUtil.getVideoEncoderMimeTypes();
        }
        java.util.List<java.lang.String> list2 = getHighSpeedVideoFpsRangesFor;
        if (list2 == null) {
            list2 = androidx.camera.video.internal.utils.CodecUtil.getAudioEncoderMimeTypes();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("resolveFormatCombo - supportedVideoEncoderMimes: ");
        sb2.append(list);
        sb2.append(", supportedAudioEncoderMimes: ");
        sb2.append(list2);
        androidx.camera.core.Logger.d("MediaConfigUtil", sb2.toString());
        androidx.camera.video.internal.config.FormatComboRegistry registry = androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.INSTANCE.getRegistry(dynamicRange);
        if (registry != null) {
            java.util.List<androidx.camera.video.internal.config.FormatCombo> combos = registry.getCombos(outputFormat, mimeType, mimeType2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : combos) {
                if (((androidx.camera.video.internal.config.FormatCombo) obj2).getVideoMime() != null) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            androidx.camera.core.Logger.d("MediaConfigUtil", "eligibleFormatCombos: ".concat(java.lang.String.valueOf(arrayList2)));
            if (!arrayList2.isEmpty()) {
                java.util.ArrayList arrayList3 = arrayList2;
                java.util.Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    androidx.camera.video.internal.config.FormatCombo formatCombo3 = (androidx.camera.video.internal.config.FormatCombo) obj;
                    if (kotlin.collections.CollectionsKt.contains(list, formatCombo3.getVideoMime()) && kotlin.collections.CollectionsKt.contains(list2, formatCombo3.getAudioMime())) {
                        break;
                    }
                }
                formatCombo = (androidx.camera.video.internal.config.FormatCombo) obj;
                if (formatCombo == null) {
                    java.util.Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            formatCombo2 = 0;
                            break;
                        }
                        formatCombo2 = it2.next();
                        androidx.camera.video.internal.config.FormatCombo formatCombo4 = (androidx.camera.video.internal.config.FormatCombo) formatCombo2;
                        if (kotlin.collections.CollectionsKt.contains(list, formatCombo4.getVideoMime()) && formatCombo4.getAudioMime() == null) {
                            break;
                        }
                    }
                    formatCombo = formatCombo2;
                    if (formatCombo == null) {
                        formatCombo = (androidx.camera.video.internal.config.FormatCombo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
                    }
                }
                androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved FormatCombo: ".concat(java.lang.String.valueOf(formatCombo)));
                if (formatCombo != null) {
                    mediaInfo = null;
                } else {
                    int container = formatCombo.getContainer();
                    java.lang.String videoMime = formatCombo.getVideoMime();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(videoMime);
                    java.lang.String audioMime = formatCombo.getAudioMime();
                    if (audioMime == null) {
                        audioMime = androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED;
                    }
                    androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles highSpeedVideoSizes2 = getHighSpeedVideoSizes(encoderProfiles, dynamicRange, container, videoMime, audioMime);
                    androidx.camera.video.internal.config.ContainerInfo containerInfo = new androidx.camera.video.internal.config.ContainerInfo(formatCombo.getContainer(), highSpeedVideoSizes2.getGetHighResolutionOutputSizeshNQ4ISI());
                    androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo = new androidx.camera.video.internal.config.VideoMimeInfo(formatCombo.getVideoMime(), 0, highSpeedVideoSizes2.getGetHighSpeedVideoFpsRangesFor(), 2, null);
                    java.lang.String audioMime2 = formatCombo.getAudioMime();
                    mediaInfo = new androidx.camera.video.internal.config.MediaInfo(containerInfo, videoMimeInfo, audioMime2 != null ? new androidx.camera.video.internal.config.AudioMimeInfo(audioMime2, androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.audioMimeToAudioProfile(audioMime2), highSpeedVideoSizes2.getGetHighSpeedVideoFpsRanges()) : null);
                    androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved MediaInfo by FormatCombo: ".concat(java.lang.String.valueOf(mediaInfo)));
                }
                if (mediaInfo == null) {
                    return mediaInfo;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(outputFormat);
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mimeType, androidx.camera.video.VideoSpec.MIME_TYPE_UNSPECIFIED)) {
                    mimeType = null;
                }
                if (mimeType == null && (mimeType = androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.getDynamicRangeDefaultMime(dynamicRange)) == null) {
                    mimeType = androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE.outputFormatToVideoMime(outputFormat);
                }
                java.lang.String str = mimeType;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mimeType2, androidx.camera.video.AudioSpec.MIME_TYPE_UNSPECIFIED)) {
                    mimeType2 = null;
                }
                if (mimeType2 == null) {
                    mimeType2 = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.outputFormatToAudioMime(outputFormat);
                }
                androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles highSpeedVideoSizes3 = getHighSpeedVideoSizes(encoderProfiles, dynamicRange, intValue, str, mimeType2);
                androidx.camera.video.internal.config.MediaInfo mediaInfo2 = new androidx.camera.video.internal.config.MediaInfo(new androidx.camera.video.internal.config.ContainerInfo(intValue, highSpeedVideoSizes3.getGetHighResolutionOutputSizeshNQ4ISI()), new androidx.camera.video.internal.config.VideoMimeInfo(str, 0, highSpeedVideoSizes3.getGetHighSpeedVideoFpsRangesFor(), 2, null), new androidx.camera.video.internal.config.AudioMimeInfo(mimeType2, androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE.audioMimeToAudioProfile(mimeType2), highSpeedVideoSizes3.getGetHighSpeedVideoFpsRanges()));
                androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved MediaInfo by Default: ".concat(java.lang.String.valueOf(mediaInfo2)));
                return mediaInfo2;
            }
        }
        formatCombo = null;
        androidx.camera.core.Logger.d("MediaConfigUtil", "Resolved FormatCombo: ".concat(java.lang.String.valueOf(formatCombo)));
        if (formatCombo != null) {
        }
        if (mediaInfo == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r7 != r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles getHighSpeedVideoSizes(androidx.camera.core.impl.EncoderProfilesProxy p0, androidx.camera.core.DynamicRange p1, int p2, java.lang.String p3, java.lang.String p4) {
        if (p0 == null) {
            return androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles.INSTANCE.getEMPTY();
        }
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = null;
        if (p0 != null) {
            int i = -1;
            if (p2 != -1) {
                int recommendedFileFormat = p0.getRecommendedFileFormat();
                if (recommendedFileFormat == 1 || recommendedFileFormat == 2) {
                    i = 0;
                } else if (recommendedFileFormat == 9) {
                    i = 1;
                }
            }
            encoderProfilesProxy = p0;
        }
        androidx.camera.video.internal.config.VideoConfigUtil videoConfigUtil = androidx.camera.video.internal.config.VideoConfigUtil.INSTANCE;
        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> videoProfiles = p0.getVideoProfiles();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(videoProfiles, "");
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy resolveCompatibleVideoProfile = videoConfigUtil.resolveCompatibleVideoProfile(p3, p1, videoProfiles);
        androidx.camera.video.internal.config.AudioConfigUtil audioConfigUtil = androidx.camera.video.internal.config.AudioConfigUtil.INSTANCE;
        java.util.List<androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy> audioProfiles = p0.getAudioProfiles();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(audioProfiles, "");
        return new androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles(encoderProfilesProxy, resolveCompatibleVideoProfile, audioConfigUtil.resolveCompatibleAudioProfile(p4, audioProfiles));
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010!"}, d2 = {"Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;", "", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "p0", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "p1", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "p2", "<init>", "(Landroidx/camera/core/impl/EncoderProfilesProxy;Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;)V", "Landroidx/camera/video/internal/config/MediaInfo;", "getInputFormats", "()Landroidx/camera/video/internal/config/MediaInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "Camera2StreamConfigurationMap", "()Landroidx/camera/core/impl/EncoderProfilesProxy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "()Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "()Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class CompatibleProfiles {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles.Companion INSTANCE = new androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles.Companion(null);
        private static final androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles EMPTY = new androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles(null, null, null, 7, null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.camera.core.impl.EncoderProfilesProxy getHighResolutionOutputSizeshNQ4ISI;

        public CompatibleProfiles(androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.getHighResolutionOutputSizeshNQ4ISI = encoderProfilesProxy;
            this.getHighSpeedVideoFpsRangesFor = videoProfileProxy;
            this.getHighSpeedVideoFpsRanges = audioProfileProxy;
        }

        public /* synthetic */ CompatibleProfiles(androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : encoderProfilesProxy, (i & 2) != 0 ? null : videoProfileProxy, (i & 4) != 0 ? null : audioProfileProxy);
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final androidx.camera.core.impl.EncoderProfilesProxy getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles$Companion;", "", "<init>", "()V", "Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;", "EMPTY", "Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;", "getEMPTY", "()Landroidx/camera/video/internal/config/MediaConfigUtil$CompatibleProfiles;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles getEMPTY() {
                return androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles.EMPTY;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final boolean getHighSpeedVideoFpsRangesFor() {
            return (this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges == null) ? false : true;
        }

        public final androidx.camera.video.internal.config.MediaInfo getInputFormats() {
            if (!getHighSpeedVideoFpsRangesFor()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            androidx.camera.video.internal.config.MediaConfigUtil mediaConfigUtil = androidx.camera.video.internal.config.MediaConfigUtil.INSTANCE;
            androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(encoderProfilesProxy);
            androidx.camera.video.internal.config.ContainerInfo containerInfo = new androidx.camera.video.internal.config.ContainerInfo(androidx.camera.video.internal.config.MediaConfigUtil.access$mediaRecorderFormatToOutputFormat(mediaConfigUtil, encoderProfilesProxy.getRecommendedFileFormat()), this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(videoProfileProxy);
            java.lang.String mediaType = videoProfileProxy.getMediaType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediaType, "");
            androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo = new androidx.camera.video.internal.config.VideoMimeInfo(mediaType, 0, this.getHighSpeedVideoFpsRangesFor, 2, null);
            androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(audioProfileProxy);
            java.lang.String mediaType2 = audioProfileProxy.getMediaType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediaType2, "");
            return new androidx.camera.video.internal.config.MediaInfo(containerInfo, videoMimeInfo, new androidx.camera.video.internal.config.AudioMimeInfo(mediaType2, this.getHighSpeedVideoFpsRanges.getProfile(), this.getHighSpeedVideoFpsRanges));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CompatibleProfiles(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode = encoderProfilesProxy == null ? 0 : encoderProfilesProxy.hashCode();
            androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.getHighSpeedVideoFpsRangesFor;
            int hashCode2 = videoProfileProxy == null ? 0 : videoProfileProxy.hashCode();
            androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.getHighSpeedVideoFpsRanges;
            return (((hashCode * 31) + hashCode2) * 31) + (audioProfileProxy != null ? audioProfileProxy.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles)) {
                return false;
            }
            androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles compatibleProfiles = (androidx.camera.video.internal.config.MediaConfigUtil.CompatibleProfiles) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, compatibleProfiles.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, compatibleProfiles.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, compatibleProfiles.getHighSpeedVideoFpsRanges);
        }

        public CompatibleProfiles() {
            this(null, null, null, 7, null);
        }
    }
}
