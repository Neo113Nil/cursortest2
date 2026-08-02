package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0017*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0094\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010:\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010?\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010=\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010@R\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010BR\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010;R\u001c\u00102\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010D"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "isPassword", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "stylusHandwritingTrigger", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "node", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getOutputSizes", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getHighSpeedVideoFpsRangesFor", "getOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getHighSpeedVideoSizes", "getOutputFormats", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/InputTransformation;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Z", "getInputFormats", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/text/KeyboardOptions;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/flow/MutableSharedFlow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.MutableInteractionSource getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.KeyboardActionHandler getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.InputTransformation getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.KeyboardOptions getInputSizeshNQ4ISI;
    private final boolean getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TransformedTextFieldState getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.TextLayoutState getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public TextFieldDecoratorModifier(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.InputTransformation inputTransformation, boolean z, boolean z2, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, boolean z3, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z4, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow) {
        this.getHighSpeedVideoFpsRangesFor = transformedTextFieldState;
        this.getHighSpeedVideoSizes = textLayoutState;
        this.getHighSpeedVideoFpsRanges = textFieldSelectionState;
        this.getHighResolutionOutputSizeshNQ4ISI = inputTransformation;
        this.Camera2StreamConfigurationMap = z;
        this.getInputFormats = z2;
        this.getInputSizeshNQ4ISI = keyboardOptions;
        this.getHighSpeedVideoSizesFor = keyboardActionHandler;
        this.getOutputFormats = z3;
        this.getOutputMinFrameDuration = mutableInteractionSource;
        this.getOutputStallDurationlomOqCM = z4;
        this.getOutputSizeshNQ4ISI = mutableSharedFlow;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode node) {
        node.updateNode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputMinFrameDuration, this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextFieldDecoratorModifier(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getInputFormats=");
        sb.append(this.getInputFormats);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizesFor=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", getOutputFormats=");
        sb.append(this.getOutputFormats);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getOutputStallDurationlomOqCM=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", getOutputSizeshNQ4ISI=");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode4 = inputTransformation == null ? 0 : inputTransformation.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode6 = java.lang.Boolean.hashCode(this.getInputFormats);
        int hashCode7 = this.getInputSizeshNQ4ISI.hashCode();
        androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler = this.getHighSpeedVideoSizesFor;
        int hashCode8 = keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode();
        int hashCode9 = java.lang.Boolean.hashCode(this.getOutputFormats);
        int hashCode10 = this.getOutputMinFrameDuration.hashCode();
        int hashCode11 = java.lang.Boolean.hashCode(this.getOutputStallDurationlomOqCM);
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow = this.getOutputSizeshNQ4ISI;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (mutableSharedFlow != null ? mutableSharedFlow.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier textFieldDecoratorModifier = (androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, textFieldDecoratorModifier.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, textFieldDecoratorModifier.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, textFieldDecoratorModifier.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, textFieldDecoratorModifier.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == textFieldDecoratorModifier.Camera2StreamConfigurationMap && this.getInputFormats == textFieldDecoratorModifier.getInputFormats && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, textFieldDecoratorModifier.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, textFieldDecoratorModifier.getHighSpeedVideoSizesFor) && this.getOutputFormats == textFieldDecoratorModifier.getOutputFormats && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, textFieldDecoratorModifier.getOutputMinFrameDuration) && this.getOutputStallDurationlomOqCM == textFieldDecoratorModifier.getOutputStallDurationlomOqCM && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputSizeshNQ4ISI, textFieldDecoratorModifier.getOutputSizeshNQ4ISI);
    }

    public final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier copy(androidx.compose.foundation.text.input.internal.TransformedTextFieldState textFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.input.InputTransformation filter, boolean enabled, boolean readOnly, androidx.compose.foundation.text.KeyboardOptions keyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler keyboardActionHandler, boolean singleLine, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean isPassword, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> stylusHandwritingTrigger) {
        return new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier(textFieldState, textLayoutState, textFieldSelectionState, filter, enabled, readOnly, keyboardOptions, keyboardActionHandler, singleLine, interactionSource, isPassword, stylusHandwritingTrigger);
    }
}
