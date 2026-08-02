package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0018\u0010\u001d\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0017\u0010(\u001a\u00020'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "<init>", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "updateTextLayout", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "updateGlobalPosition", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionController implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.text.selection.Selectable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.text.modifiers.StaticTextSelectionParams Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.SelectionRegistrar getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.Modifier modifier;

    private SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = selectionRegistrar;
        this.getHighSpeedVideoSizes = j2;
        this.Camera2StreamConfigurationMap = staticTextSelectionParams;
        this.modifier = androidx.compose.ui.input.pointer.PointerIconKt.pointerHoverIcon$default(androidx.compose.foundation.text.modifiers.SelectionController_androidKt.makeSelectionModifier(selectionRegistrar, j, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.layout.LayoutCoordinates highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.modifiers.SelectionController.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.modifiers.SelectionController.this);
                return highSpeedVideoFpsRangesFor;
            }
        }), androidx.compose.ui.input.pointer.PointerIcon.INSTANCE.getText(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, selectionRegistrar, j2, (i & 8) != 0 ? androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.INSTANCE.getEmpty() : staticTextSelectionParams, null);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.modifiers.SelectionController selectionController) {
        return selectionController.Camera2StreamConfigurationMap.getLayoutCoordinates();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.subscribe(new androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate(this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.layout.LayoutCoordinates highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.text.modifiers.SelectionController.getHighSpeedVideoSizes(androidx.compose.foundation.text.modifiers.SelectionController.this);
                return highSpeedVideoSizes;
            }
        }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.text.TextLayoutResult Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.modifiers.SelectionController.Camera2StreamConfigurationMap(androidx.compose.foundation.text.modifiers.SelectionController.this);
                return Camera2StreamConfigurationMap;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoSizes(androidx.compose.foundation.text.modifiers.SelectionController selectionController) {
        return selectionController.Camera2StreamConfigurationMap.getLayoutCoordinates();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.TextLayoutResult Camera2StreamConfigurationMap(androidx.compose.foundation.text.modifiers.SelectionController selectionController) {
        return selectionController.Camera2StreamConfigurationMap.getTextLayoutResult();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        androidx.compose.foundation.text.selection.Selectable selectable = this.getHighSpeedVideoFpsRangesFor;
        if (selectable != null) {
            this.getHighSpeedVideoFpsRanges.unsubscribe(selectable);
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        androidx.compose.foundation.text.selection.Selectable selectable = this.getHighSpeedVideoFpsRangesFor;
        if (selectable != null) {
            this.getHighSpeedVideoFpsRanges.unsubscribe(selectable);
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    public final void updateTextLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.Camera2StreamConfigurationMap.getTextLayoutResult();
        if (textLayoutResult2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.getHighSpeedVideoFpsRanges.notifySelectableChange(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.Camera2StreamConfigurationMap = androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.copy$default(this.Camera2StreamConfigurationMap, null, textLayoutResult, 1, null);
    }

    public final void updateGlobalPosition(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.Camera2StreamConfigurationMap = androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.copy$default(this.Camera2StreamConfigurationMap, coordinates, null, 2, null);
        this.getHighSpeedVideoFpsRanges.notifyPositionChange(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void draw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        int offset;
        int offset2;
        androidx.compose.foundation.text.selection.Selection selection = this.getHighSpeedVideoFpsRanges.getSubselections().get(this.getHighResolutionOutputSizeshNQ4ISI);
        if (selection != null) {
            if (!selection.getHandlesCrossed()) {
                offset = selection.getStart().getOffset();
            } else {
                offset = selection.getEnd().getOffset();
            }
            if (!selection.getHandlesCrossed()) {
                offset2 = selection.getEnd().getOffset();
            } else {
                offset2 = selection.getStart().getOffset();
            }
            if (offset != offset2) {
                androidx.compose.foundation.text.selection.Selectable selectable = this.getHighSpeedVideoFpsRangesFor;
                int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
                androidx.compose.ui.graphics.Path pathForRange = this.Camera2StreamConfigurationMap.getPathForRange(kotlin.ranges.RangesKt.coerceAtMost(offset, lastVisibleOffset), kotlin.ranges.RangesKt.coerceAtMost(offset2, lastVisibleOffset));
                if (pathForRange == null) {
                    return;
                }
                if (!this.Camera2StreamConfigurationMap.getShouldClip()) {
                    androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, pathForRange, this.getHighSpeedVideoSizes, 0.0f, null, null, 0, 60, null);
                    return;
                }
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
                int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
                long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo6456clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, m5985getIntersectrtfAjoo);
                    androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, pathForRange, this.getHighSpeedVideoSizes, 0.0f, null, null, 0, 60, null);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                }
            }
        }
    }

    public /* synthetic */ SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, selectionRegistrar, j2, staticTextSelectionParams);
    }
}
