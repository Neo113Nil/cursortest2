package androidx.compose.ui.input.key;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/InterceptedKeyInputNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SoftKeyboardInterceptionElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.key.InterceptedKeyInputNode> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function12) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.ui.input.key.InterceptedKeyInputNode interceptedKeyInputNode) {
        androidx.compose.ui.input.key.InterceptedKeyInputNode interceptedKeyInputNode2 = interceptedKeyInputNode;
        interceptedKeyInputNode2.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
        interceptedKeyInputNode2.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1 = this.Camera2StreamConfigurationMap;
        if (function1 != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", function1);
        }
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function12 = this.getHighSpeedVideoSizes;
        if (function12 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", function12);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionElement)) {
            return false;
        }
        androidx.compose.ui.input.key.SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (androidx.compose.ui.input.key.SoftKeyboardInterceptionElement) p0;
        return this.Camera2StreamConfigurationMap == softKeyboardInterceptionElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == softKeyboardInterceptionElement.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function1 = this.Camera2StreamConfigurationMap;
        int hashCode = function1 != null ? function1.hashCode() : 0;
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> function12 = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (function12 != null ? function12.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.ui.input.key.InterceptedKeyInputNode create() {
        return new androidx.compose.ui.input.key.InterceptedKeyInputNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }
}
