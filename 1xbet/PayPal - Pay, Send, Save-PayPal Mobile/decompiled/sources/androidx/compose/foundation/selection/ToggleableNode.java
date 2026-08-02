package androidx.compose.foundation.selection;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableNode;", "Landroidx/compose/foundation/ClickableNode;", "", "p0", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p1", "Landroidx/compose/foundation/IndicationNodeFactory;", "p2", "p3", "p4", "Landroidx/compose/ui/semantics/Role;", "p5", "Lkotlin/Function1;", "", "p6", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoSizes", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ToggleableNode extends androidx.compose.foundation.ClickableNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    private ToggleableNode(final boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, null, role, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.selection.ToggleableNode.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1.this, z);
                return highSpeedVideoFpsRangesFor;
            }
        }, null);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.selection.ToggleableNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.selection.ToggleableNode.this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.selection.ToggleableNode toggleableNode) {
        toggleableNode.getHighSpeedVideoSizes.invoke(java.lang.Boolean.valueOf(!toggleableNode.getHighResolutionOutputSizeshNQ4ISI));
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoSizes(boolean p0, androidx.compose.foundation.interaction.MutableInteractionSource p1, androidx.compose.foundation.IndicationNodeFactory p2, boolean p3, boolean p4, androidx.compose.ui.semantics.Role p5, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p6) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != p0) {
            this.getHighResolutionOutputSizeshNQ4ISI = p0;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.getHighSpeedVideoSizes = p6;
        super.m1333updateO2vRcR0(p1, p2, p3, p4, null, p5, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(final androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(this.getHighResolutionOutputSizeshNQ4ISI));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.INSTANCE.getToggle());
        androidx.compose.ui.autofill.FillableData createFromBoolean = androidx.compose.ui.autofill.FillableData_androidKt.createFromBoolean(androidx.compose.ui.autofill.FillableData.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI);
        if (createFromBoolean != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromBoolean);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.selection.ToggleableNode.Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver.this, (androidx.compose.ui.autofill.FillableData) obj);
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.autofill.FillableData fillableData) {
        java.lang.Boolean booleanValue = fillableData.getBooleanValue();
        if (booleanValue == null) {
            return false;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(booleanValue.booleanValue()));
        return true;
    }

    public /* synthetic */ ToggleableNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mutableInteractionSource, indicationNodeFactory, z2, z3, role, function1);
    }
}
