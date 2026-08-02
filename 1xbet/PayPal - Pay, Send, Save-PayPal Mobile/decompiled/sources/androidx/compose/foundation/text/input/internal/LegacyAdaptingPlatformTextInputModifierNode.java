package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010 \u001a\u0004\u0018\u00010\u001f2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018¢\u0006\u0002\b\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\b8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00105\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0017R\u0016\u00109\u001a\u0004\u0018\u0001068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "serviceAdapter", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "", "setServiceAdapter", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launchTextInputSession", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setLegacyTextFieldState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setTextFieldSelectionManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "<set-?>", "layoutCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "layoutCoordinates", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.platform.PlatformTextInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: layoutCoordinates$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState layoutCoordinates = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState;
    private androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifierNode(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.getHighResolutionOutputSizeshNQ4ISI = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final androidx.compose.foundation.text.LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final void setLegacyTextFieldState(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState) {
        this.legacyTextFieldState = legacyTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final androidx.compose.foundation.text.selection.TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final void setTextFieldSelectionManager(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    private void setLayoutCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final androidx.compose.ui.platform.SoftwareKeyboardController getSoftwareKeyboardController() {
        return (androidx.compose.ui.platform.SoftwareKeyboardController) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
    }

    public final void setServiceAdapter(androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter serviceAdapter) {
        if (getIsAttached()) {
            this.getHighResolutionOutputSizeshNQ4ISI.stopInput();
            this.getHighResolutionOutputSizeshNQ4ISI.unregisterModifier(this);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = serviceAdapter;
        if (getIsAttached()) {
            this.getHighResolutionOutputSizeshNQ4ISI.registerModifier(this);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return (androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.getHighResolutionOutputSizeshNQ4ISI.registerModifier(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighResolutionOutputSizeshNQ4ISI.unregisterModifier(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        setLayoutCoordinates(coordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode
    public final kotlinx.coroutines.Job launchTextInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSession, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> block) {
        kotlinx.coroutines.Job launch$default;
        if (!getIsAttached()) {
            return null;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this, block, null), 1, null);
        return launch$default;
    }
}
