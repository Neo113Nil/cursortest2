package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00168CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00198CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Landroidx/camera/video/internal/config/DynamicRangeFormatComboRegistry;", "", "<init>", "()V", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroidx/camera/video/internal/config/FormatComboRegistry;", "getRegistry", "(Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/internal/config/FormatComboRegistry;", "", "videoMime", "", "getDynamicRangesForVideoMime", "(Ljava/lang/String;)Ljava/util/Set;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getOutputFormats", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "", "getInputSizeshNQ4ISI", "Lkotlin/Lazy;", "", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeFormatComboRegistry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    public static final androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry INSTANCE = new androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private static final kotlin.Lazy getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final kotlin.Lazy getOutputFormats;
    private static final kotlin.Lazy getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoSizes;

    private DynamicRangeFormatComboRegistry() {
    }

    public final java.util.Set<androidx.camera.core.DynamicRange> getDynamicRangesForVideoMime(java.lang.String videoMime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMime, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry : ((java.util.Map) getInputSizeshNQ4ISI.getValue()).entrySet()) {
            androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) entry.getKey();
            if (!((androidx.camera.video.internal.config.FormatComboRegistry) entry.getValue()).getCombosForVideo(videoMime).isEmpty()) {
                linkedHashSet.add(dynamicRange);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: $r8$lambda$-FouBuXi9U7zUgh_5Y-GjbobpoI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1027$r8$lambda$FouBuXi9U7zUgh_5YGjbobpoI(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull(getHighSpeedVideoSizes), (java.util.List) getInputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5AuNRZElpaoKdjsvAkCtbe5nOQU(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{androidx.media3.common.MimeTypes.VIDEO_VP8, getHighSpeedVideoSizes}), (java.util.List) getInputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G0yMqjXFD2pLCq0hOkiF5VP_Rlg(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges, getHighSpeedVideoSizesFor}), (java.util.List) getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ce7-Z-Ngs72UK9UJGwFjM6AlR04, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1028$r8$lambda$ce7ZNgs72UK9UJGwFjM6AlR04(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges, getHighSpeedVideoSizesFor}), (java.util.List) getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gO-liYEZvgXRStXGSsEm7KAwCmk, reason: not valid java name */
    public static /* synthetic */ java.util.Map m1029$r8$lambda$gOliYEZvgXRStXGSsEm7KAwCmk() {
        androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$h6JXUeNMoe4Q3j7kklRNxfNHrdk((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        builder.container(1, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$5AuNRZElpaoKdjsvAkCtbe5nOQU((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        kotlin.Pair pair = kotlin.TuplesKt.to(dynamicRange, builder.build());
        androidx.camera.core.DynamicRange dynamicRange2 = androidx.camera.core.DynamicRange.HLG_10_BIT;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder2 = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder2.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.m1028$r8$lambda$ce7ZNgs72UK9UJGwFjM6AlR04((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        kotlin.Pair pair2 = kotlin.TuplesKt.to(dynamicRange2, builder2.build());
        androidx.camera.core.DynamicRange dynamicRange3 = androidx.camera.core.DynamicRange.HDR10_10_BIT;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder3 = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder3.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$G0yMqjXFD2pLCq0hOkiF5VP_Rlg((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        builder3.container(1, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.m1027$r8$lambda$FouBuXi9U7zUgh_5YGjbobpoI((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        kotlin.Pair pair3 = kotlin.TuplesKt.to(dynamicRange3, builder3.build());
        androidx.camera.core.DynamicRange dynamicRange4 = androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder4 = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder4.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$uFoYrz4xN65dtgic6lOWz9Cj80o((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        kotlin.Pair pair4 = kotlin.TuplesKt.to(dynamicRange4, builder4.build());
        androidx.camera.core.DynamicRange dynamicRange5 = androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder5 = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder5.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$kfbEw1BiMiDgLTaqEGAa0Ukj6OY((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        kotlin.Pair pair5 = kotlin.TuplesKt.to(dynamicRange5, builder5.build());
        androidx.camera.core.DynamicRange dynamicRange6 = androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT;
        androidx.camera.video.internal.config.FormatComboRegistry.Builder builder6 = new androidx.camera.video.internal.config.FormatComboRegistry.Builder();
        builder6.container(0, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.$r8$lambda$kfbEw1BiMiDgLTaqEGAa0Ukj6OY((androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return kotlin.collections.MapsKt.mutableMapOf(pair, pair2, pair3, pair4, pair5, kotlin.TuplesKt.to(dynamicRange6, builder6.build()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h6JXUeNMoe4Q3j7kklRNxfNHrdk(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{"video/avc", androidx.media3.common.MimeTypes.VIDEO_MP4V, androidx.media3.common.MimeTypes.VIDEO_H263, Camera2StreamConfigurationMap, getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRanges, getHighSpeedVideoSizesFor}), (java.util.List) getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kfbEw1BiMiDgLTaqEGAa0Ukj6OY(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull(getHighResolutionOutputSizeshNQ4ISI), (java.util.List) getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uFoYrz4xN65dtgic6lOWz9Cj80o(androidx.camera.video.internal.config.FormatComboRegistry.Builder.ContainerScope containerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerScope, "");
        containerScope.support(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges}), (java.util.List) getOutputFormats.getValue());
        return kotlin.Unit.INSTANCE;
    }

    static {
        Camera2StreamConfigurationMap = android.os.Build.VERSION.SDK_INT >= 24 ? androidx.media3.common.MimeTypes.VIDEO_H265 : null;
        getHighSpeedVideoSizes = android.os.Build.VERSION.SDK_INT >= 24 ? androidx.media3.common.MimeTypes.VIDEO_VP9 : null;
        getHighSpeedVideoFpsRangesFor = android.os.Build.VERSION.SDK_INT >= 29 ? androidx.media3.common.MimeTypes.AUDIO_OPUS : null;
        getHighResolutionOutputSizeshNQ4ISI = android.os.Build.VERSION.SDK_INT >= 33 ? androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION : null;
        getHighSpeedVideoFpsRanges = android.os.Build.VERSION.SDK_INT >= 34 ? androidx.media3.common.MimeTypes.VIDEO_AV1 : null;
        getHighSpeedVideoSizesFor = android.os.Build.VERSION.SDK_INT >= 36 ? androidx.media3.common.MimeTypes.VIDEO_APV : null;
        getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.m1029$r8$lambda$gOliYEZvgXRStXGSsEm7KAwCmk();
            }
        });
        getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.List listOfNotNull;
                listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{"audio/mp4a-latm", androidx.media3.common.MimeTypes.AUDIO_AMR_NB, androidx.media3.common.MimeTypes.AUDIO_AMR_WB});
                return listOfNotNull;
            }
        });
        getInputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.List listOfNotNull;
                listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{androidx.media3.common.MimeTypes.AUDIO_VORBIS, androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry.getHighSpeedVideoFpsRangesFor});
                return listOfNotNull;
            }
        });
    }

    public final androidx.camera.video.internal.config.FormatComboRegistry getRegistry(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        return (androidx.camera.video.internal.config.FormatComboRegistry) ((java.util.Map) getInputSizeshNQ4ISI.getValue()).get(dynamicRange);
    }
}
