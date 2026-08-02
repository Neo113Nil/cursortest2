package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B¡\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00122\u0010\u0014\u001a.\b\u0001\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f¢\u0006\u0002\b\u0013\u00122\u0010\u0016\u001a.\b\u0001\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f¢\u0006\u0002\b\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u0011*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R@\u00104\u001a.\b\u0001\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R@\u00105\u001a.\b\u0001\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00103R\u0014\u00106\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010."}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "create", "()Landroidx/compose/foundation/gestures/DraggableNode;", "node", "update", "(Landroidx/compose/foundation/gestures/DraggableNode;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getInputFormats", "Landroidx/compose/foundation/gestures/DraggableState;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/gestures/Orientation;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function3;", "getInputSizeshNQ4ISI", "getOutputFormats", "getHighSpeedVideoSizesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DraggableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.gestures.DraggableNode> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getInputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.DraggableState getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.DraggableElement.Companion INSTANCE = new androidx.compose.foundation.gestures.DraggableElement.Companion(null);
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> CanDrag = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DraggableElement$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.DraggableElement.$r8$lambda$LVEjdXHkfWX6UNO01fK_af33D6E((androidx.compose.ui.input.pointer.PointerType) obj));
        }
    };

    public static /* synthetic */ boolean $r8$lambda$LVEjdXHkfWX6UNO01fK_af33D6E(androidx.compose.ui.input.pointer.PointerType pointerType) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32, boolean z3) {
        this.getHighSpeedVideoSizes = draggableState;
        this.getHighSpeedVideoFpsRangesFor = orientation;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
        this.Camera2StreamConfigurationMap = z2;
        this.getInputSizeshNQ4ISI = function3;
        this.getOutputFormats = function32;
        this.getHighSpeedVideoSizesFor = z3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.gestures.DraggableNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.gestures.DraggableNode(this.getHighSpeedVideoSizes, CanDrag, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.gestures.DraggableNode node) {
        node.update(this.getHighSpeedVideoSizes, CanDrag, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.foundation.gestures.DraggableElement draggableElement = (androidx.compose.foundation.gestures.DraggableElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, draggableElement.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRangesFor == draggableElement.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == draggableElement.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, draggableElement.getHighResolutionOutputSizeshNQ4ISI) && this.Camera2StreamConfigurationMap == draggableElement.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, draggableElement.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, draggableElement.getOutputFormats) && this.getHighSpeedVideoSizesFor == draggableElement.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode4 = mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getInputSizeshNQ4ISI.hashCode()) * 31) + this.getOutputFormats.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("orientation", this.getHighSpeedVideoFpsRangesFor);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
        inspectorInfo.getProperties().set("reverseDirection", java.lang.Boolean.valueOf(this.getHighSpeedVideoSizesFor));
        inspectorInfo.getProperties().set("interactionSource", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("startDragImmediately", java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap));
        inspectorInfo.getProperties().set("onDragStarted", this.getInputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("onDragStopped", this.getOutputFormats);
        inspectorInfo.getProperties().set("state", this.getHighSpeedVideoSizes);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerType;", "", "CanDrag", "Lkotlin/jvm/functions/Function1;", "getCanDrag", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> getCanDrag() {
            return androidx.compose.foundation.gestures.DraggableElement.CanDrag;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
