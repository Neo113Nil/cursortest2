package com.datadog.android.sessionreplay.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0011J5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/mapper/ImageViewMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseAsyncBackgroundWireframeMapper;", "Landroid/widget/ImageView;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "Lcom/datadog/android/sessionreplay/recorder/resources/DrawableCopier;", "drawableCopier", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;Lcom/datadog/android/sessionreplay/recorder/resources/DrawableCopier;)V", "Lcom/datadog/android/internal/utils/ImageViewUtils;", "imageViewUtils", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;Lcom/datadog/android/internal/utils/ImageViewUtils;Lcom/datadog/android/sessionreplay/recorder/resources/DrawableCopier;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/widget/ImageView;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/recorder/resources/DrawableCopier;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/datadog/android/internal/utils/ImageViewUtils;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ImageViewMapper extends com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper<android.widget.ImageView> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.resources.DrawableCopier getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.internal.utils.ImageViewUtils getHighSpeedVideoSizes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.sessionreplay.recorder.resources.DrawableCopier drawableCopier) {
        this(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper, com.datadog.android.internal.utils.ImageViewUtils.INSTANCE, drawableCopier);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableCopier, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper, com.datadog.android.internal.utils.ImageViewUtils imageViewUtils, com.datadog.android.sessionreplay.recorder.resources.DrawableCopier drawableCopier) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageViewUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableCopier, "");
        this.getHighSpeedVideoSizes = imageViewUtils;
        this.getHighResolutionOutputSizeshNQ4ISI = drawableCopier;
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.widget.ImageView view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        android.graphics.drawable.Drawable current;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.widget.ImageView imageView = view;
        arrayList.addAll(super.map((com.datadog.android.sessionreplay.recorder.mapper.ImageViewMapper) imageView, mappingContext, asyncJobStatusCallback, internalLogger));
        android.graphics.drawable.Drawable drawable = view.getDrawable();
        if (drawable == null || (current = drawable.getCurrent()) == null) {
            return arrayList;
        }
        android.graphics.Rect resolveParentRectAbsPosition = this.getHighSpeedVideoSizes.resolveParentRectAbsPosition(imageView, view.getCropToPadding());
        android.graphics.Rect resolveContentRectWithScaling$default = com.datadog.android.internal.utils.ImageViewUtils.resolveContentRectWithScaling$default(this.getHighSpeedVideoSizes, view, current, null, 4, null);
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe createImageWireframeByDrawable = mappingContext.getImageWireframeHelper().createImageWireframeByDrawable(imageView, mappingContext.getImagePrivacy(), arrayList.size(), com.datadog.android.internal.utils.IntExtKt.densityNormalized(resolveContentRectWithScaling$default.left, r2), com.datadog.android.internal.utils.IntExtKt.densityNormalized(resolveContentRectWithScaling$default.top, r2), resolveContentRectWithScaling$default.width(), resolveContentRectWithScaling$default.height(), true, current, this.getHighResolutionOutputSizeshNQ4ISI, asyncJobStatusCallback, com.datadog.android.sessionreplay.internal.utils.RectExtKt.toWireframeClip(this.getHighSpeedVideoSizes.calculateClipping(resolveParentRectAbsPosition, resolveContentRectWithScaling$default, view.getResources().getDisplayMetrics().density)), null, null, "drawable", null);
        if (createImageWireframeByDrawable == null) {
            return arrayList;
        }
        arrayList.add(createImageWireframeByDrawable);
        return arrayList;
    }
}
