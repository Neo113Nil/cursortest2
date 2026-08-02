package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ActionBarContainerMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/BaseViewGroupMapper;", "Landroidx/appcompat/widget/ActionBarContainer;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;", "colorStringFormatter", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;", "drawableToColorMapper", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ColorStringFormatter;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;Lcom/datadog/android/sessionreplay/utils/DrawableToColorMapper;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroidx/appcompat/widget/ActionBarContainer;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ActionBarContainerMapper extends com.datadog.android.sessionreplay.recorder.mapper.BaseViewGroupMapper<androidx.appcompat.widget.ActionBarContainer> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarContainerMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ColorStringFormatter colorStringFormatter, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver, com.datadog.android.sessionreplay.utils.DrawableToColorMapper drawableToColorMapper) {
        super(viewIdentifierResolver, colorStringFormatter, viewBoundsResolver, drawableToColorMapper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorStringFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableToColorMapper, "");
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(androidx.appcompat.widget.ActionBarContainer view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        android.graphics.drawable.Drawable backgroundDrawable = new androidx.appcompat.widget.DatadogActionBarContainerAccessor(view).getBackgroundDrawable();
        com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle resolveShapeStyle = backgroundDrawable != null ? resolveShapeStyle(backgroundDrawable, view.getAlpha(), internalLogger) : null;
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = view;
        java.lang.Long resolveChildUniqueIdentifier = getViewIdentifierResolver().resolveChildUniqueIdentifier(actionBarContainer, com.datadog.android.sessionreplay.recorder.mapper.BaseAsyncBackgroundWireframeMapper.PREFIX_BACKGROUND_DRAWABLE);
        if (resolveShapeStyle != null && resolveChildUniqueIdentifier != null) {
            com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = getViewBoundsResolver().resolveViewGlobalBounds(actionBarContainer, mappingContext.getSystemInformation().getScreenDensity());
            return kotlin.collections.CollectionsKt.listOf(new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(resolveChildUniqueIdentifier.longValue(), resolveViewGlobalBounds.getX(), resolveViewGlobalBounds.getY(), resolveViewGlobalBounds.getWidth(), resolveViewGlobalBounds.getHeight(), null, resolveShapeStyle, null, 32, null));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
