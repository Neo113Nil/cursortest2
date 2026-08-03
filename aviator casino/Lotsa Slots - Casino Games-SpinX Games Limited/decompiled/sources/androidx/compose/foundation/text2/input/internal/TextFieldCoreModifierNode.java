package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldCoreModifier.kt */
@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BE\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016JF\u0010/\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\"\u00100\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u00010\u001e2\u0006\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020'H\u0002J\f\u00104\u001a\u00020,*\u000205H\u0016J\f\u00106\u001a\u00020,*\u000207H\u0016J\f\u00108\u001a\u00020,*\u000209H\u0002J&\u0010:\u001a\u00020,*\u0002092\u0006\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020=H\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0014\u0010@\u001a\u00020,*\u0002092\u0006\u0010<\u001a\u00020=H\u0002J&\u0010A\u001a\u00020B*\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ&\u0010J\u001a\u00020B*\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010IJ&\u0010L\u001a\u00020B*\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010IR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "isFocused", "", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "writeable", "scrollState", "Landroidx/compose/foundation/ScrollState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(ZLandroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "changeObserverJob", "Lkotlinx/coroutines/Job;", "cursorAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "showCursor", "getShowCursor", "()Z", "textFieldMagnifierNode", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "calculateOffsetToFollow", "", "currSelection", "calculateOffsetToFollow-5zc-tL8", "(J)I", "onGloballyPositioned", "", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "updateNode", "updateScrollState", "cursorRect", "containerSize", "textFieldSize", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawCursor", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawSelection", "selection", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawSelection-Sb-Bc2M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/text/TextLayoutResult;)V", "drawText", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureHorizontalScroll", "measureHorizontalScroll-3p2s80s", "measureVerticalScroll", "measureVerticalScroll-3p2s80s", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private kotlinx.coroutines.Job changeObserverJob;
    private androidx.compose.ui.graphics.Brush cursorBrush;
    private boolean isFocused;
    private androidx.compose.foundation.gestures.Orientation orientation;
    private androidx.compose.ui.text.TextRange previousSelection;
    private androidx.compose.foundation.ScrollState scrollState;
    private final androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode textFieldMagnifierNode;
    private androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
    private boolean writeable;
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> cursorAlpha = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private androidx.compose.ui.geometry.Rect previousCursorRect = new androidx.compose.ui.geometry.Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxHeight$ui_release;
        maxHeight$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxHeight$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxWidth$ui_release;
        maxWidth$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxWidth$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minHeight$ui_release;
        minHeight$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minHeight$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minWidth$ui_release;
        minWidth$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minWidth$ui_release;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public TextFieldCoreModifierNode(boolean z, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush brush, boolean z2, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation) {
        this.isFocused = z;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z2;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode) delegate(androidx.compose.foundation.text2.input.internal.selection.AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused));
    }

    private final boolean getShowCursor() {
        boolean isSpecified;
        if (this.writeable && this.isFocused) {
            isSpecified = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
            if (isSpecified) {
                return true;
            }
        }
        return false;
    }

    public final void updateNode(boolean isFocused, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.graphics.Brush cursorBrush, boolean writeable, androidx.compose.foundation.ScrollState scrollState, androidx.compose.foundation.gestures.Orientation orientation) {
        kotlinx.coroutines.Job launch$default;
        boolean showCursor = getShowCursor();
        boolean z = this.isFocused;
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2 = this.textLayoutState;
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        androidx.compose.foundation.ScrollState scrollState2 = this.scrollState;
        this.isFocused = isFocused;
        this.textLayoutState = textLayoutState;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = cursorBrush;
        this.writeable = writeable;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(textFieldState, textFieldSelectionState, textLayoutState, isFocused);
        if (!getShowCursor()) {
            kotlinx.coroutines.Job job = this.changeObserverJob;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.changeObserverJob = null;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$1(this, null), 3, null);
        } else if (!z || !kotlin.jvm.internal.Intrinsics.areEqual(transformedTextFieldState, textFieldState) || !showCursor) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateNode$2(textFieldState, this, null), 3, null);
            this.changeObserverJob = launch$default;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(transformedTextFieldState, textFieldState) && kotlin.jvm.internal.Intrinsics.areEqual(textLayoutState2, textLayoutState) && kotlin.jvm.internal.Intrinsics.areEqual(textFieldSelectionState2, textFieldSelectionState) && kotlin.jvm.internal.Intrinsics.areEqual(scrollState2, scrollState)) {
            return;
        }
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        if (this.orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            return m1143measureVerticalScroll3p2s80s(measureScope, measurable, j);
        }
        return m1142measureHorizontalScroll3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = this.textFieldState.getText();
        androidx.compose.ui.text.TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(text.getSelectionInChars())) {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            drawText(contentDrawScope2, layoutResult);
            drawCursor(contentDrawScope2);
        } else {
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope3 = contentDrawScope;
            m1141drawSelectionSbBc2M(contentDrawScope3, text.getSelectionInChars(), layoutResult);
            drawText(contentDrawScope3, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final androidx.compose.ui.layout.MeasureResult m1143measureVerticalScroll3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = java.lang.Math.min(mo3402measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), min, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$measureVerticalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                int m1140calculateOffsetToFollow5zctL8;
                androidx.compose.ui.geometry.Rect rect;
                boolean z;
                androidx.compose.foundation.ScrollState scrollState;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.textFieldState;
                long selectionInChars = transformedTextFieldState.getText().getSelectionInChars();
                m1140calculateOffsetToFollow5zctL8 = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.m1140calculateOffsetToFollow5zctL8(selectionInChars);
                if (m1140calculateOffsetToFollow5zctL8 >= 0) {
                    androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                    textLayoutState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.textLayoutState;
                    rect = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.getCursorRectInScroller(measureScope2, m1140calculateOffsetToFollow5zctL8, textLayoutState.getLayoutResult(), measureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl, mo3402measureBRTryo0.getWidth());
                } else {
                    rect = null;
                }
                androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.updateScrollState(rect, min, mo3402measureBRTryo0.getHeight());
                z = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.isFocused;
                if (z) {
                    androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.previousSelection = androidx.compose.ui.text.TextRange.m3952boximpl(selectionInChars);
                }
                androidx.compose.ui.layout.Placeable placeable = mo3402measureBRTryo0;
                scrollState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.scrollState;
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, -scrollState.getValue(), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final androidx.compose.ui.layout.MeasureResult m1142measureHorizontalScroll3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j)) < androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) ? j : androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int min = java.lang.Math.min(mo3402measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j));
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, min, mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$measureHorizontalScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState;
                int m1140calculateOffsetToFollow5zctL8;
                androidx.compose.ui.geometry.Rect rect;
                boolean z;
                androidx.compose.foundation.ScrollState scrollState;
                androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;
                transformedTextFieldState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.textFieldState;
                long selectionInChars = transformedTextFieldState.getText().getSelectionInChars();
                m1140calculateOffsetToFollow5zctL8 = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.m1140calculateOffsetToFollow5zctL8(selectionInChars);
                if (m1140calculateOffsetToFollow5zctL8 >= 0) {
                    androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                    textLayoutState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.textLayoutState;
                    rect = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.getCursorRectInScroller(measureScope2, m1140calculateOffsetToFollow5zctL8, textLayoutState.getLayoutResult(), measureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl, mo3402measureBRTryo0.getWidth());
                } else {
                    rect = null;
                }
                androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.updateScrollState(rect, min, mo3402measureBRTryo0.getWidth());
                z = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.isFocused;
                if (z) {
                    androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.previousSelection = androidx.compose.ui.text.TextRange.m3952boximpl(selectionInChars);
                }
                androidx.compose.ui.layout.Placeable placeable = mo3402measureBRTryo0;
                scrollState = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode.this.scrollState;
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, -scrollState.getValue(), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1140calculateOffsetToFollow5zctL8(long currSelection) {
        androidx.compose.ui.text.TextRange textRange = this.previousSelection;
        if (textRange == null || androidx.compose.ui.text.TextRange.m3959getEndimpl(currSelection) != androidx.compose.ui.text.TextRange.m3959getEndimpl(textRange.getPackedValue())) {
            return androidx.compose.ui.text.TextRange.m3959getEndimpl(currSelection);
        }
        androidx.compose.ui.text.TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || androidx.compose.ui.text.TextRange.m3964getStartimpl(currSelection) != androidx.compose.ui.text.TextRange.m3964getStartimpl(textRange2.getPackedValue())) {
            return androidx.compose.ui.text.TextRange.m3964getStartimpl(currSelection);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollState(androidx.compose.ui.geometry.Rect cursorRect, int containerSize, int textFieldSize) {
        float f;
        this.scrollState.setMaxValue$foundation_release(textFieldSize - containerSize);
        if (!getShowCursor() || cursorRect == null) {
            return;
        }
        if (cursorRect.getLeft() == this.previousCursorRect.getLeft() && cursorRect.getTop() == this.previousCursorRect.getTop()) {
            return;
        }
        boolean z = this.orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
        float top = z ? cursorRect.getTop() : cursorRect.getLeft();
        float bottom = z ? cursorRect.getBottom() : cursorRect.getRight();
        int value = this.scrollState.getValue();
        float f2 = value + containerSize;
        if (bottom <= f2) {
            float f3 = value;
            if (top >= f3 || bottom - top <= containerSize) {
                f = (top >= f3 || bottom - top > ((float) containerSize)) ? 0.0f : top - f3;
                this.previousCursorRect = cursorRect;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateScrollState$1(this, f, null), 1, null);
            }
        }
        f = bottom - f2;
        this.previousCursorRect = cursorRect;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateScrollState$1(this, f, null), 1, null);
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1141drawSelectionSbBc2M(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(j);
        int m3961getMaximpl = androidx.compose.ui.text.TextRange.m3961getMaximpl(j);
        if (m3962getMinimpl != m3961getMaximpl) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2668drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(m3962getMinimpl, m3961getMaximpl), ((androidx.compose.foundation.text.selection.TextSelectionColors) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawCursor(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        if (this.cursorAlpha.getValue().floatValue() <= 0.0f || !getShowCursor()) {
            return;
        }
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(this.cursorAlpha.getValue().floatValue(), 0.0f, 1.0f);
        if (coerceIn == 0.0f) {
            return;
        }
        androidx.compose.ui.geometry.Rect cursorRect = this.textFieldSelectionState.getCursorRect();
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2663drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m1905getTopCenterF1C5BW0(), cursorRect.m1898getBottomCenterF1C5BW0(), cursorRect.getWidth(), 0, null, coerceIn, null, 0, 432, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.textLayoutState.setCoreNodeCoordinates(coordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    private final void drawText(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        androidx.compose.ui.text.TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }
}
