package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/HiddenViewMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "Landroid/view/View;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "viewBoundsResolver", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "getViewBoundsResolver", "()Lcom/datadog/android/sessionreplay/utils/ViewBoundsResolver;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "getViewIdentifierResolver", "()Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HiddenViewMapper implements com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> {
    public static final java.lang.String HIDDEN_VIEW_PLACEHOLDER_TEXT = "Hidden";
    private final com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver;
    private final com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver;

    public HiddenViewMapper(com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver, com.datadog.android.sessionreplay.utils.ViewBoundsResolver viewBoundsResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBoundsResolver, "");
        this.viewIdentifierResolver = viewIdentifierResolver;
        this.viewBoundsResolver = viewBoundsResolver;
    }

    public final com.datadog.android.sessionreplay.utils.ViewIdentifierResolver getViewIdentifierResolver() {
        return this.viewIdentifierResolver;
    }

    public final com.datadog.android.sessionreplay.utils.ViewBoundsResolver getViewBoundsResolver() {
        return this.viewBoundsResolver;
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.view.View view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.lang.Long resolveChildUniqueIdentifier = this.viewIdentifierResolver.resolveChildUniqueIdentifier(view, "hidden");
        if (resolveChildUniqueIdentifier == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        long longValue = resolveChildUniqueIdentifier.longValue();
        com.datadog.android.sessionreplay.utils.GlobalBounds resolveViewGlobalBounds = this.viewBoundsResolver.resolveViewGlobalBounds(view, mappingContext.getSystemInformation().getScreenDensity());
        return kotlin.collections.CollectionsKt.listOf(new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.PlaceholderWireframe(longValue, resolveViewGlobalBounds.getX(), resolveViewGlobalBounds.getY(), resolveViewGlobalBounds.getWidth(), resolveViewGlobalBounds.getHeight(), null, "Hidden", 32, null));
    }
}
