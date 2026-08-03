package androidx.compose.foundation;

/* compiled from: Background.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {com.helpshift.proactive.InAppViewConstants.BACKGROUND, "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "background-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackgroundKt {
    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m212backgroundbw27NRU$default(androidx.compose.ui.Modifier modifier, long j, androidx.compose.ui.graphics.Shape shape, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        return m211backgroundbw27NRU(modifier, j, shape);
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

    public static final androidx.compose.ui.Modifier background(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.graphics.Brush brush, final androidx.compose.ui.graphics.Shape shape, final float f) {
        return modifier.then(new androidx.compose.foundation.BackgroundElement(0L, brush, f, shape, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.BACKGROUND);
                inspectorInfo.getProperties().set("alpha", java.lang.Float.valueOf(f));
                inspectorInfo.getProperties().set("brush", brush);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 1, null));
    }

    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m211backgroundbw27NRU(androidx.compose.ui.Modifier modifier, final long j, final androidx.compose.ui.graphics.Shape shape) {
        return modifier.then(new androidx.compose.foundation.BackgroundElement(j, null, 1.0f, shape, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.BACKGROUND);
                inspectorInfo.setValue(androidx.compose.ui.graphics.Color.m2103boximpl(j));
                inspectorInfo.getProperties().set("color", androidx.compose.ui.graphics.Color.m2103boximpl(j));
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), 2, null));
    }
}
