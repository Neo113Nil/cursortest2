package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u000e*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableNode;", "Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/ui/state/ToggleableState;", "p0", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p1", "Landroidx/compose/foundation/IndicationNodeFactory;", "p2", "", "p3", "p4", "Landroidx/compose/ui/semantics/Role;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/state/ToggleableState;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TriStateToggleableNode extends androidx.compose.foundation.ClickableNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.state.ToggleableState getHighSpeedVideoFpsRanges;

    private TriStateToggleableNode(androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(mutableInteractionSource, indicationNodeFactory, z, z2, null, role, function0, null);
        this.getHighSpeedVideoFpsRanges = toggleableState;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.ui.state.ToggleableState p0, androidx.compose.foundation.interaction.MutableInteractionSource p1, androidx.compose.foundation.IndicationNodeFactory p2, boolean p3, boolean p4, androidx.compose.ui.semantics.Role p5, kotlin.jvm.functions.Function0<kotlin.Unit> p6) {
        if (this.getHighSpeedVideoFpsRanges != p0) {
            this.getHighSpeedVideoFpsRanges = p0;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m1333updateO2vRcR0(p1, p2, p3, p4, null, p5, p6);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.getHighSpeedVideoFpsRanges);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.INSTANCE.getToggle());
        androidx.compose.ui.autofill.FillableData createFromBoolean = androidx.compose.ui.autofill.FillableData_androidKt.createFromBoolean(androidx.compose.ui.autofill.FillableData.INSTANCE, this.getHighSpeedVideoFpsRanges != androidx.compose.ui.state.ToggleableState.Indeterminate);
        if (createFromBoolean != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromBoolean);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.selection.TriStateToggleableNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.selection.TriStateToggleableNode.getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver.this, (androidx.compose.ui.autofill.FillableData) obj);
                return java.lang.Boolean.valueOf(highSpeedVideoSizes);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.autofill.FillableData fillableData) {
        java.lang.Boolean booleanValue = fillableData.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(booleanValue.booleanValue()));
        return true;
    }

    public /* synthetic */ TriStateToggleableNode(androidx.compose.ui.state.ToggleableState toggleableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z, z2, role, function0);
    }
}
