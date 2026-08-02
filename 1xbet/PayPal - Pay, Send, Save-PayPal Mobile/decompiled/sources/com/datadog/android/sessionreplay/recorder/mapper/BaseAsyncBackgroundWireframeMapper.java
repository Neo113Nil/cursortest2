package com.datadog.android.sessionreplay.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 +*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/BaseAsyncBackgroundWireframeMapper;", "Landroid/view/View;", "T", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseWireframeMapper;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "Lcom/datadog/android/sessionreplay/utils/GlobalBounds;", "bounds", "", "width", "height", "resolveBackgroundAsImageWireframe", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IILcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "shapeStyle", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "resolveBackgroundAsShapeWireframe", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/utils/GlobalBounds;IILcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe$ShapeWireframe;", "resolveViewBackground", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Lcom/datadog/android/sessionreplay/utils/DefaultViewIdentifierResolver;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/utils/DefaultViewIdentifierResolver;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseAsyncBackgroundWireframeMapper<T extends android.view.View> extends com.datadog.android.sessionreplay.recorder.mapper.BaseWireframeMapper<T> {
    public static final java.lang.String PREFIX_BACKGROUND_DRAWABLE = "backgroundDrawable";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAsyncBackgroundWireframeMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        this.getHighSpeedVideoFpsRangesFor = com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver.INSTANCE;
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(T view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe resolveViewBackground = resolveViewBackground(view, mappingContext, asyncJobStatusCallback, internalLogger);
        return (resolveViewBackground == null || (listOf = kotlin.collections.CollectionsKt.listOf(resolveViewBackground)) == null) ? kotlin.collections.CollectionsKt.emptyList() : listOf;
    }

    protected com.datadog.android.sessionreplay.model.MobileSegment.Wireframe resolveViewBackground(android.view.View view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        android.graphics.drawable.Drawable background = view.getBackground();
        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle resolveShapeStyle = background != null ? resolveShapeStyle(background, view.getAlpha(), internalLogger) : null;
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(view, mappingContext.getSystemInformation().getScreenDensity());
        int width = view.getWidth();
        int height = view.getHeight();
        if (resolveShapeStyle == null) {
            return resolveBackgroundAsImageWireframe(view, resolveViewGlobalBounds, width, height, mappingContext, asyncJobStatusCallback);
        }
        return resolveBackgroundAsShapeWireframe(view, resolveViewGlobalBounds, width, height, resolveShapeStyle);
    }

    protected com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe resolveBackgroundAsShapeWireframe(android.view.View view, com.datadog.android.sessionreplay.utils.GlobalBounds bounds, int width, int height, com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        java.lang.Long resolveChildUniqueIdentifier = this.getHighSpeedVideoFpsRangesFor.resolveChildUniqueIdentifier(view, PREFIX_BACKGROUND_DRAWABLE);
        if (resolveChildUniqueIdentifier == null) {
            return null;
        }
        long longValue = resolveChildUniqueIdentifier.longValue();
        float f = view.getResources().getDisplayMetrics().density;
        return new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(longValue, bounds.getX(), bounds.getY(), com.datadog.android.internal.utils.IntExtKt.densityNormalized(width, f), com.datadog.android.internal.utils.IntExtKt.densityNormalized(height, f), null, shapeStyle, null, 32, null);
    }

    protected com.datadog.android.sessionreplay.model.MobileSegment.Wireframe resolveBackgroundAsImageWireframe(android.view.View view, com.datadog.android.sessionreplay.utils.GlobalBounds bounds, int width, int height, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background == null) {
            return null;
        }
        return com.datadog.android.sessionreplay.utils.ImageWireframeHelper.DefaultImpls.createImageWireframeByDrawable$default(mappingContext.getImageWireframeHelper(), view, mappingContext.getImagePrivacy(), 0, bounds.getX(), bounds.getY(), width, height, false, background, null, asyncJobStatusCallback, new com.datadog.android.sessionreplay.model.MobileSegment.WireframeClip(null, null, null, null, 15, null), null, null, PREFIX_BACKGROUND_DRAWABLE, null, 512, null);
    }
}
