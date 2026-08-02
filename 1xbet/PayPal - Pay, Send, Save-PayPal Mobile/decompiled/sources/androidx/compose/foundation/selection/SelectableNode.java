package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/selection/SelectableNode;", "Landroidx/compose/foundation/ClickableNode;", "", "p0", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p1", "Landroidx/compose/foundation/IndicationNodeFactory;", "p2", "p3", "p4", "Landroidx/compose/ui/semantics/Role;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectableNode extends androidx.compose.foundation.ClickableNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    private SelectableNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, function0, null);
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final void getHighSpeedVideoSizes(boolean p0, androidx.compose.foundation.interaction.MutableInteractionSource p1, androidx.compose.foundation.IndicationNodeFactory p2, boolean p3, boolean p4, androidx.compose.ui.semantics.Role p5, kotlin.jvm.functions.Function0<kotlin.Unit> p6) {
        if (this.getHighSpeedVideoFpsRanges != p0) {
            this.getHighSpeedVideoFpsRanges = p0;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m1333updateO2vRcR0(p1, p2, p3, p4, null, p5, p6);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.getHighSpeedVideoFpsRanges);
    }

    public /* synthetic */ SelectableNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, function0);
    }
}
