package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0010\u0018\u0000 6*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00016B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%JU\u0010.\u001a\u00020-2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ProgressBarWireframeMapper;", "Landroid/widget/ProgressBar;", "P", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseAsyncBackgroundWireframeMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "", "showProgressWhenMaskUserInput", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;ZLcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/content/res/ColorStateList;", "colorStateList", "", "state", "", "getColor", "(Landroid/content/res/ColorStateList;[I)Ljava/lang/Integer;", "view", "getDefaultColor", "(Landroid/widget/ProgressBar;)I", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/widget/ProgressBar;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "", "wireframes", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "trackBounds", "trackColor", "", "normalizedProgress", "", "mapDeterminate", "(Ljava/util/List;Landroid/widget/ProgressBar;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IF)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoSizes", "Z", "getShowProgressWhenMaskUserInput", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ProgressBarWireframeMapper<P extends android.widget.ProgressBar> extends com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper<P> {
    public static final java.lang.String ACTIVE_TRACK_KEY_NAME = "seekbar_active_track";
    public static final int DAY_MODE_COLOR = 0;
    public static final int NIGHT_MODE_COLOR = 16777215;
    public static final java.lang.String NON_ACTIVE_TRACK_KEY_NAME = "seekbar_non_active_track";
    public static final java.lang.String THUMB_KEY_NAME = "seekbar_thumb";
    public static final int THUMB_SHAPE_CORNER_RADIUS = 10;
    public static final long TRACK_HEIGHT_IN_PX = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoSizes;
    private final boolean showProgressWhenMaskUserInput;

    public final boolean getShowProgressWhenMaskUserInput() {
        return this.showProgressWhenMaskUserInput;
    }

    public /* synthetic */ ProgressBarWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, boolean z, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper, z, (i & 32) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, boolean z, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.showProgressWhenMaskUserInput = z;
        this.getHighSpeedVideoSizes = buildSdkVersionProvider;
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(P view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        float max;
        int progress;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        P p = view;
        arrayList.addAll(super.map((com.datadog.android.sessionreplay.internal.recorder.mapper.ProgressBarWireframeMapper<P>) p, mappingContext, asyncJobStatusCallback, internalLogger));
        float screenDensity = mappingContext.getSystemInformation().getScreenDensity();
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewPaddedBounds = getViewBoundsResolver().resolveViewPaddedBounds(p, screenDensity);
        long densityNormalized = com.datadog.android.internal.utils.LongExtKt.densityNormalized(8L, screenDensity);
        com.datadog.android.sessionreplay.utils.GlobalBounds globalBounds = new com.datadog.android.sessionreplay.utils.GlobalBounds(resolveViewPaddedBounds.getX(), ((resolveViewPaddedBounds.getHeight() - densityNormalized) / 2) + resolveViewPaddedBounds.getY(), resolveViewPaddedBounds.getWidth(), densityNormalized);
        int defaultColor = getDefaultColor(view);
        android.content.res.ColorStateList progressTintList = view.getProgressTintList();
        int[] drawableState = view.getDrawableState();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawableState, "");
        java.lang.Integer color = getColor(progressTintList, drawableState);
        if (color != null) {
            defaultColor = color.intValue();
        }
        java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(p, "seekbar_non_active_track");
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe = resolveChildUniqueIdentifier != null ? new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(resolveChildUniqueIdentifier.longValue(), globalBounds.getX(), globalBounds.getY(), globalBounds.getWidth(), globalBounds.getHeight(), null, new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(getColorStringFormatter().formatColorAndAlphaAsHexString(defaultColor, 64), java.lang.Float.valueOf(view.getAlpha()), null, 4, null), null, 160, null) : null;
        if (shapeWireframe != null) {
            arrayList.add(shapeWireframe);
        }
        boolean isIndeterminate = view.isIndeterminate();
        boolean z = mappingContext.getTextAndInputPrivacy() == com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_SENSITIVE_INPUTS || (mappingContext.getTextAndInputPrivacy() == com.datadog.android.sessionreplay.TextAndInputPrivacy.MASK_ALL_INPUTS && this.showProgressWhenMaskUserInput);
        if (!isIndeterminate && z) {
            float f = 0.0f;
            if (this.getHighSpeedVideoSizes.getIsAtLeastO()) {
                max = view.getMax() - view.getMin();
                if (max != 0.0f) {
                    progress = view.getProgress() - view.getMin();
                    f = progress / max;
                }
                mapDeterminate(arrayList, view, mappingContext, asyncJobStatusCallback, internalLogger, globalBounds, defaultColor, f);
            } else {
                max = view.getMax();
                if (view.getMax() != 0) {
                    progress = view.getProgress();
                    f = progress / max;
                }
                mapDeterminate(arrayList, view, mappingContext, asyncJobStatusCallback, internalLogger, globalBounds, defaultColor, f);
            }
        }
        return arrayList;
    }

    protected final java.lang.Integer getColor(android.content.res.ColorStateList colorStateList, int[] state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (colorStateList != null) {
            return java.lang.Integer.valueOf(colorStateList.getColorForState(state, colorStateList.getDefaultColor()));
        }
        return null;
    }

    protected final int getDefaultColor(P view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return (view.getResources().getConfiguration().uiMode & 48) == 32 ? 16777215 : 0;
    }

    protected void mapDeterminate(java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> wireframes, P view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.utils.GlobalBounds trackBounds, int trackColor, float normalizedProgress) {
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe shapeWireframe;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackBounds, "");
        java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(view, "seekbar_active_track");
        if (resolveChildUniqueIdentifier != null) {
            shapeWireframe = new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(resolveChildUniqueIdentifier.longValue(), trackBounds.getX(), trackBounds.getY(), (long) (trackBounds.getWidth() * normalizedProgress), trackBounds.getHeight(), null, new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(getColorStringFormatter().formatColorAndAlphaAsHexString(trackColor, 255), java.lang.Float.valueOf(view.getAlpha()), null, 4, null), null, 160, null);
        } else {
            shapeWireframe = null;
        }
        if (shapeWireframe != null) {
            wireframes.add(shapeWireframe);
        }
    }
}
