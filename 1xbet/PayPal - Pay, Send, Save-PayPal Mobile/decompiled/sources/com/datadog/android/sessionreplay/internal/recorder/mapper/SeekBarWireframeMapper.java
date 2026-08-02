package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJU\u0010 \u001a\u00020\u001f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/SeekBarWireframeMapper;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ProgressBarWireframeMapper;", "Landroid/widget/SeekBar;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "wireframes", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "trackBounds", "", "trackColor", "", "normalizedProgress", "", "mapDeterminate", "(Ljava/util/List;Landroid/widget/SeekBar;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IF)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class SeekBarWireframeMapper extends com.datadog.android.sessionreplay.internal.recorder.mapper.ProgressBarWireframeMapper<android.widget.SeekBar> {
    public static final java.lang.String ACTIVE_TRACK_KEY_NAME = "seekbar_active_track";
    public static final int DAY_MODE_COLOR = 0;
    public static final int NIGHT_MODE_COLOR = 16777215;
    public static final java.lang.String NON_ACTIVE_TRACK_KEY_NAME = "seekbar_non_active_track";
    public static final java.lang.String THUMB_KEY_NAME = "seekbar_thumb";
    public static final int THUMB_SHAPE_CORNER_RADIUS = 10;
    public static final long TRACK_HEIGHT_IN_PX = 8;

    @Override // com.datadog.android.sessionreplay.internal.recorder.mapper.ProgressBarWireframeMapper
    public /* bridge */ /* synthetic */ void mapDeterminate(java.util.List list, android.widget.SeekBar seekBar, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds, int i, float f) {
        mapDeterminate2((java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe>) list, seekBar, mappingContext, asyncJobStatusCallback, internalLogger, globalBounds, i, f);
    }

    public /* synthetic */ SeekBarWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper, (i & 16) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper, false, buildSdkVersionProvider);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
    }

    /* renamed from: mapDeterminate, reason: avoid collision after fix types in other method */
    protected void mapDeterminate2(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes, android.widget.SeekBar view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.utils.GlobalBounds trackBounds, int trackColor, float normalizedProgress) {
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackBounds, "");
        android.widget.SeekBar seekBar = view;
        super.mapDeterminate(wireframes, (java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe>) seekBar, mappingContext, asyncJobStatusCallback, internalLogger, trackBounds, trackColor, normalizedProgress);
        if (mappingContext.getTextAndInputPrivacy() == com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS) {
            float screenDensity = mappingContext.getSystemInformation().getScreenDensity();
            long densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized(8L, screenDensity);
            android.content.res.ColorStateList thumbTintList = view.getThumbTintList();
            int[] drawableState = view.getDrawableState();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawableState, "");
            java.lang.Integer color = getColor(thumbTintList, drawableState);
            int intValue = color != null ? color.intValue() : getDefaultColor(seekBar);
            java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(view, "seekbar_thumb");
            if (resolveChildUniqueIdentifier != null) {
                long longValue = resolveChildUniqueIdentifier.longValue();
                java.lang.String formatColorAndAlphaAsHexString = getColorStringFormatter().formatColorAndAlphaAsHexString(intValue, 255);
                long densityNormalized2 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getThumb().getBounds().width(), screenDensity);
                long densityNormalized3 = com.datadog.android.internal.utils.IntExtKt.densityNormalized(view.getThumb().getBounds().height(), screenDensity);
                long j = densityNormalized2 / 2;
                long j2 = densityNormalized3 / 2;
                shapeWireframe = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(longValue, (trackBounds.getX() + ((long) (trackBounds.getWidth() * normalizedProgress))) - j, (trackBounds.getY() + (densityNormalized / 2)) - j2, densityNormalized2, densityNormalized3, null, new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(formatColorAndAlphaAsHexString, java.lang.Float.valueOf(view.getAlpha()), java.lang.Long.valueOf(java.lang.Math.max(j, j2))), null, 160, null);
            } else {
                shapeWireframe = null;
            }
            if (shapeWireframe != null) {
                wireframes.add(shapeWireframe);
            }
        }
    }
}
