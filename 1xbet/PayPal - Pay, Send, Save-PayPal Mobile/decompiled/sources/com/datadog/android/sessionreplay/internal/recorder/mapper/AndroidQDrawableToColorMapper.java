package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/AndroidQDrawableToColorMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/AndroidMDrawableToColorMapper;", "", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "extensionMappers", "<init>", "(Ljava/util/List;)V", "Landroid/graphics/drawable/GradientDrawable;", "drawable", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "resolveGradientDrawable", "(Landroid/graphics/drawable/GradientDrawable;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Integer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class AndroidQDrawableToColorMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper.Companion(null);
    private static final java.util.List<android.graphics.BlendMode> blendModesReturningBlendColor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.graphics.BlendMode[]{android.graphics.BlendMode.SRC, android.graphics.BlendMode.SRC_ATOP, android.graphics.BlendMode.SRC_IN, android.graphics.BlendMode.SRC_OUT, android.graphics.BlendMode.SRC_OVER});
    private static final java.util.List<android.graphics.BlendMode> blendModesReturningOriginalColor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new android.graphics.BlendMode[]{android.graphics.BlendMode.DST, android.graphics.BlendMode.DST_ATOP, android.graphics.BlendMode.DST_IN, android.graphics.BlendMode.DST_OUT, android.graphics.BlendMode.DST_OVER});

    public /* synthetic */ AndroidQDrawableToColorMapper(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidQDrawableToColorMapper(java.util.List<? extends com.datadog.android.sessionreplay.utils.DrawableToColorMapper> list) {
        super(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.lang.Integer resolveGradientDrawable(android.graphics.drawable.GradientDrawable drawable, com.datadog.android.api.InternalLogger internalLogger) {
        android.graphics.Paint paint;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            java.lang.reflect.Field fillPaintField$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidMDrawableToColorMapper.INSTANCE.getFillPaintField$dd_sdk_android_session_replay_release();
            obj = fillPaintField$dd_sdk_android_session_replay_release != null ? fillPaintField$dd_sdk_android_session_replay_release.get(drawable) : null;
        } catch (java.lang.ExceptionInInitializerError | java.lang.IllegalAccessException | java.lang.IllegalArgumentException unused) {
        }
        if (obj instanceof android.graphics.Paint) {
            paint = (android.graphics.Paint) obj;
            if (paint != null) {
                return null;
            }
            final android.graphics.ColorFilter colorFilter = paint.getColorFilter();
            int color = paint.getColor();
            int alpha = (paint.getAlpha() * drawable.getAlpha()) / 255;
            if (alpha == 0) {
                return null;
            }
            if (colorFilter != null) {
                if (colorFilter instanceof android.graphics.BlendModeColorFilter) {
                    android.graphics.BlendModeColorFilter blendModeColorFilter = (android.graphics.BlendModeColorFilter) colorFilter;
                    android.graphics.BlendMode mode = blendModeColorFilter.getMode();
                    if (blendModesReturningBlendColor.contains(mode)) {
                        color = blendModeColorFilter.getColor();
                    } else if (!blendModesReturningOriginalColor.contains(mode)) {
                        internalLogger.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.TELEMETRY, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper$resolveBlendModeColorFilter$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return "No mapper found for gradient blend mode ".concat(java.lang.String.valueOf(((android.graphics.BlendModeColorFilter) colorFilter).getMode()));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        }, (java.lang.Throwable) null, true, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("replay.gradient.blend_mode", blendModeColorFilter.getMode())));
                    }
                } else {
                    internalLogger.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.TELEMETRY, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper$resolveBlendModeColorFilter$2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "No mapper found for gradient color filter ".concat(java.lang.String.valueOf(colorFilter.getClass()));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, true, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("replay.gradient.filter_type", colorFilter.getClass().getCanonicalName())));
                }
            }
            return java.lang.Integer.valueOf(mergeColorAndAlpha(color, alpha));
        }
        paint = null;
        if (paint != null) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/AndroidQDrawableToColorMapper$Companion;", "", "<init>", "()V", "", "Landroid/graphics/BlendMode;", "blendModesReturningBlendColor", "Ljava/util/List;", "getBlendModesReturningBlendColor$dd_sdk_android_session_replay_release", "()Ljava/util/List;", "blendModesReturningOriginalColor", "getBlendModesReturningOriginalColor$dd_sdk_android_session_replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<android.graphics.BlendMode> getBlendModesReturningBlendColor$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper.blendModesReturningBlendColor;
        }

        public final java.util.List<android.graphics.BlendMode> getBlendModesReturningOriginalColor$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.mapper.AndroidQDrawableToColorMapper.blendModesReturningOriginalColor;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidQDrawableToColorMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
