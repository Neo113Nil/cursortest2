package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0002J(\u0010#\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010$\u001a\u00020\u001e*\u00020%H\u0016J\f\u0010&\u001a\u00020\u001e*\u00020'H\u0016R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNodeImpl28;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "isFocused", "", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Z)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/animation/core/AnimationVector2D;", "animationJob", "Lkotlinx/coroutines/Job;", "magnifierNode", "Landroidx/compose/foundation/MagnifierNode;", "<set-?>", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "getMagnifierSize-YbymL2g", "()J", "setMagnifierSize-ozmzZPI", "(J)V", "magnifierSize$delegate", "Landroidx/compose/runtime/MutableState;", "onAttach", "", "onGloballyPositioned", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "restartAnimationJob", "update", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animatable;
    private kotlinx.coroutines.Job animationJob;
    private boolean isFocused;
    private androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
    private androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState;
    private androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState;

    /* renamed from: magnifierSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState magnifierSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()), null, 2, null);
    private final androidx.compose.foundation.MagnifierNode magnifierNode = (androidx.compose.foundation.MagnifierNode) delegate(new androidx.compose.foundation.MagnifierNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.ui.unit.Density density) {
            return androidx.compose.ui.geometry.Offset.m1860boximpl(m1187invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1187invoketuRUvjQ(androidx.compose.ui.unit.Density density) {
            androidx.compose.animation.core.Animatable animatable;
            animatable = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this.animatable;
            return ((androidx.compose.ui.geometry.Offset) animatable.getValue()).getPackedValue();
        }
    }, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$2
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.DpSize dpSize) {
            m1188invokeEaSLcWc(dpSize.getPackedValue());
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m1188invokeEaSLcWc(long j) {
            androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28.this;
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            textFieldMagnifierNodeImpl28.m1186setMagnifierSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(density.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j)), density.mo309roundToPx0680j_4(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j))));
        }
    }, 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    public TextFieldMagnifierNodeImpl28(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, boolean z) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.isFocused = z;
        this.animatable = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierKt.m1182calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m1185getMagnifierSizeYbymL2g())), androidx.compose.foundation.text.selection.SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.foundation.text.selection.SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m1185getMagnifierSizeYbymL2g() {
        return ((androidx.compose.ui.unit.IntSize) this.magnifierSize.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m1186setMagnifierSizeozmzZPI(long j) {
        this.magnifierSize.setValue(androidx.compose.ui.unit.IntSize.m4644boximpl(j));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode
    public void update(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState, boolean isFocused) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        androidx.compose.foundation.text2.input.internal.TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z = this.isFocused;
        this.textFieldState = textFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.isFocused = isFocused;
        if (kotlin.jvm.internal.Intrinsics.areEqual(textFieldState, transformedTextFieldState) && kotlin.jvm.internal.Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2) && kotlin.jvm.internal.Intrinsics.areEqual(textLayoutState, textLayoutState2) && isFocused == z) {
            return;
        }
        restartAnimationJob();
    }

    private final void restartAnimationJob() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.animationJob;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.animationJob = null;
        if (this.isFocused && androidx.compose.foundation.Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3, null);
            this.animationJob = launch$default;
        }
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.magnifierNode.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }
}
