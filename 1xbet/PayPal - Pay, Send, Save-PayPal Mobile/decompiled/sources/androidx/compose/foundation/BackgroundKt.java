package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "background-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackgroundKt {
    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1286backgroundbw27NRU$default(androidx.compose.ui.Modifier modifier, long j, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        return m1285backgroundbw27NRU(modifier, j, shape);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier background$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.Shape shape, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return background(modifier, brush, shape, f);
    }

    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1285backgroundbw27NRU(androidx.compose.ui.Modifier modifier, final long j, final androidx.compose.ui.graphics.Shape shape) {
        return modifier.then(new androidx.compose.foundation.BackgroundElement(j, null, 1.0f, shape, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY);
                inspectorInfo.setValue(androidx.compose.ui.graphics.Color.m5986boximpl(j));
                inspectorInfo.getProperties().set(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, androidx.compose.ui.graphics.Color.m5986boximpl(j));
                inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, shape);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 2, null));
    }

    public static final androidx.compose.ui.Modifier background(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.graphics.Brush brush, final androidx.compose.ui.graphics.Shape shape, final float f) {
        return modifier.then(new androidx.compose.foundation.BackgroundElement(0L, brush, f, shape, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY);
                inspectorInfo.getProperties().set("alpha", java.lang.Float.valueOf(f));
                inspectorInfo.getProperties().set("brush", brush);
                inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, shape);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 1, null));
    }
}
