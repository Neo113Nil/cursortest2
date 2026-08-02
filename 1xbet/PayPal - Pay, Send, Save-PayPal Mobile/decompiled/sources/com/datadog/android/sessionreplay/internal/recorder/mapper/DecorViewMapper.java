package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/DecorViewMapper;", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "Landroid/view/View;", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ViewWireframeMapper;", "viewWireframeMapper", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "viewIdentifierResolver", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ViewWireframeMapper;Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "asyncJobStatusCallback", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/ViewWireframeMapper;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DecorViewMapper implements com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> {
    public static final java.lang.String POP_UP_DECOR_VIEW_CLASS_NAME_SUFFIX = "popupdecorview";
    public static final java.lang.String WINDOW_KEY_NAME = "window";
    public static final java.lang.String WINDOW_WIREFRAME_COLOR = "#000000FF";
    public static final float WINDOW_WIREFRAME_OPACITY = 0.6f;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.utils.ViewIdentifierResolver getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.sessionreplay.internal.recorder.mapper.ViewWireframeMapper getHighSpeedVideoFpsRanges;

    public DecorViewMapper(com.datadog.android.sessionreplay.internal.recorder.mapper.ViewWireframeMapper viewWireframeMapper, com.datadog.android.sessionreplay.utils.ViewIdentifierResolver viewIdentifierResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewWireframeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewIdentifierResolver, "");
        this.getHighSpeedVideoFpsRanges = viewWireframeMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = viewIdentifierResolver;
    }

    public /* synthetic */ DecorViewMapper(com.datadog.android.sessionreplay.internal.recorder.mapper.ViewWireframeMapper viewWireframeMapper, com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver defaultViewIdentifierResolver, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(viewWireframeMapper, (i & 2) != 0 ? com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver.INSTANCE : defaultViewIdentifierResolver);
    }

    @Override // com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper
    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.view.View view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback, com.datadog.android.api.InternalLogger internalLogger) {
        java.lang.Long resolveChildUniqueIdentifier;
        java.lang.Object obj;
        com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncJobStatusCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighSpeedVideoFpsRanges.map(view, mappingContext, new com.datadog.android.sessionreplay.utils.NoOpAsyncJobStatusCallback(), internalLogger));
        if (mappingContext.getSystemInformation().getThemeColor() != null) {
            java.lang.String themeColor = mappingContext.getSystemInformation().getThemeColor();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : mutableList) {
                if (obj2 instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) obj).getShapeStyle() != null) {
                    break;
                }
            }
            if (((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) obj) == null) {
                com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle = new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(themeColor, java.lang.Float.valueOf(view.getAlpha()), null, 4, null);
                int size = mutableList.size();
                for (int i = 0; i < size; i++) {
                    com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe = mutableList.get(i);
                    if (wireframe instanceof com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) {
                        copy = r11.copy((r28 & 1) != 0 ? r11.id : 0L, (r28 & 2) != 0 ? r11.x : 0L, (r28 & 4) != 0 ? r11.y : 0L, (r28 & 8) != 0 ? r11.width : 0L, (r28 & 16) != 0 ? r11.height : 0L, (r28 & 32) != 0 ? r11.clip : null, (r28 & 64) != 0 ? r11.shapeStyle : shapeStyle, (r28 & 128) != 0 ? ((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe) wireframe).border : null);
                        mutableList.set(i, copy);
                    }
                }
            }
        }
        java.lang.String name2 = view.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.util.Locale locale = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = name2.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!kotlin.text.StringsKt.endsWith$default(lowerCase, POP_UP_DECOR_VIEW_CLASS_NAME_SUFFIX, false, 2, (java.lang.Object) null) && (resolveChildUniqueIdentifier = this.getHighResolutionOutputSizeshNQ4ISI.resolveChildUniqueIdentifier(view, WINDOW_KEY_NAME)) != null) {
            mutableList.add(0, new com.datadog.android.sessionreplay.model.MobileSegment.Wireframe.ShapeWireframe(resolveChildUniqueIdentifier.longValue(), 0L, 0L, mappingContext.getSystemInformation().getScreenBounds().getWidth(), mappingContext.getSystemInformation().getScreenBounds().getHeight(), null, new com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle(WINDOW_WIREFRAME_COLOR, java.lang.Float.valueOf(0.6f), null, 4, null), null, 160, null));
        }
        return mutableList;
    }
}
