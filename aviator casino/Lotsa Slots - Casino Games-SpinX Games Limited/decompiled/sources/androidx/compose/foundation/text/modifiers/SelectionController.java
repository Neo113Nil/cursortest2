package androidx.compose.foundation.text.modifiers;

/* compiled from: SelectionController.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "selectableId", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "backgroundSelectionColor", "Landroidx/compose/ui/graphics/Color;", "params", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "draw", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onAbandoned", "onForgotten", "onRemembered", "updateGlobalPosition", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "updateTextLayout", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionController implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final androidx.compose.ui.Modifier modifier;
    private androidx.compose.foundation.text.modifiers.StaticTextSelectionParams params;
    private androidx.compose.foundation.text.selection.Selectable selectable;
    private final long selectableId;
    private final androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, selectionRegistrar, j2, staticTextSelectionParams);
    }

    private SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams) {
        androidx.compose.ui.Modifier makeSelectionModifier;
        this.selectableId = j;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j2;
        this.params = staticTextSelectionParams;
        makeSelectionModifier = androidx.compose.foundation.text.modifiers.SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j, new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.layout.LayoutCoordinates invoke() {
                androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams2;
                staticTextSelectionParams2 = androidx.compose.foundation.text.modifiers.SelectionController.this.params;
                return staticTextSelectionParams2.getLayoutCoordinates();
            }
        });
        this.modifier = androidx.compose.foundation.text.BasicText_androidKt.textPointerHoverIcon(makeSelectionModifier, selectionRegistrar);
    }

    public /* synthetic */ SelectionController(long j, androidx.compose.foundation.text.selection.SelectionRegistrar selectionRegistrar, long j2, androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, selectionRegistrar, j2, (i & 8) != 0 ? androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.INSTANCE.getEmpty() : staticTextSelectionParams, null);
    }

    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate(this.selectableId, new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.layout.LayoutCoordinates invoke() {
                androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = androidx.compose.foundation.text.modifiers.SelectionController.this.params;
                return staticTextSelectionParams.getLayoutCoordinates();
            }
        }, new kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.text.TextLayoutResult invoke() {
                androidx.compose.foundation.text.modifiers.StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = androidx.compose.foundation.text.modifiers.SelectionController.this.params;
                return staticTextSelectionParams.getTextLayoutResult();
            }
        }));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        androidx.compose.foundation.text.selection.Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        androidx.compose.foundation.text.selection.Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    public final void updateTextLayout(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.params = androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public final void updateGlobalPosition(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.params = androidx.compose.foundation.text.modifiers.StaticTextSelectionParams.copy$default(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void draw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        int offset;
        int offset2;
        androidx.compose.foundation.text.selection.Selection selection = this.selectionRegistrar.getSubselections().get(java.lang.Long.valueOf(this.selectableId));
        if (selection == null) {
            return;
        }
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
        if (offset == offset2) {
            return;
        }
        androidx.compose.foundation.text.selection.Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        androidx.compose.ui.graphics.Path pathForRange = this.params.getPathForRange(kotlin.ranges.RangesKt.coerceAtMost(offset, lastVisibleOffset), kotlin.ranges.RangesKt.coerceAtMost(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2668drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc());
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc());
        int m2102getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2601clipRectN_I0leg(0.0f, 0.0f, m1940getWidthimpl, m1937getHeightimpl, m2102getIntersectrtfAjoo);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2668drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
    }
}
