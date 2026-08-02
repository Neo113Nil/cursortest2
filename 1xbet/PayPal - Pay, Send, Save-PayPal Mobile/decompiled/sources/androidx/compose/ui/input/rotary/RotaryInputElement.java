package androidx.compose.ui.input.rotary;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0019"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/input/rotary/RotaryInputNode;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/rotary/RotaryInputNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RotaryInputElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.rotary.RotaryInputNode> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.Camera2StreamConfigurationMap = function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.input.rotary.RotaryInputNode create() {
        return new androidx.compose.ui.input.rotary.RotaryInputNode(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.input.rotary.RotaryInputNode p0) {
        p0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
        p0.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", function1);
        }
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12 = this.Camera2StreamConfigurationMap;
        if (function12 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", function12);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.input.rotary.RotaryInputElement)) {
            return false;
        }
        androidx.compose.ui.input.rotary.RotaryInputElement rotaryInputElement = (androidx.compose.ui.input.rotary.RotaryInputElement) p0;
        return this.getHighSpeedVideoFpsRangesFor == rotaryInputElement.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == rotaryInputElement.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1 = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = function1 != null ? function1.hashCode() : 0;
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12 = this.Camera2StreamConfigurationMap;
        return (hashCode * 31) + (function12 != null ? function12.hashCode() : 0);
    }
}
