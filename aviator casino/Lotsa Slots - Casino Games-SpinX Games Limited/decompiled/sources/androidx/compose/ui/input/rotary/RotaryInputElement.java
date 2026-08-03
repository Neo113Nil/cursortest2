package androidx.compose.ui.input.rotary;

/* compiled from: RotaryInputModifier.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\f\u0010\u001a\u001a\u00020\u0018*\u00020\u001bH\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputNode;", "onRotaryScrollEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onPreRotaryScrollEvent", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnPreRotaryScrollEvent", "()Lkotlin/jvm/functions/Function1;", "getOnRotaryScrollEvent", "component1", "component2", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.rotary.RotaryInputNode> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> onPreRotaryScrollEvent;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> onRotaryScrollEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.input.rotary.RotaryInputElement copy$default(androidx.compose.ui.input.rotary.RotaryInputElement rotaryInputElement, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i & 2) != 0) {
            function12 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(function1, function12);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> component1() {
        return this.onRotaryScrollEvent;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> component2() {
        return this.onPreRotaryScrollEvent;
    }

    public final androidx.compose.ui.input.rotary.RotaryInputElement copy(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> onRotaryScrollEvent, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> onPreRotaryScrollEvent) {
        return new androidx.compose.ui.input.rotary.RotaryInputElement(onRotaryScrollEvent, onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.input.rotary.RotaryInputElement)) {
            return false;
        }
        androidx.compose.ui.input.rotary.RotaryInputElement rotaryInputElement = (androidx.compose.ui.input.rotary.RotaryInputElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1 = this.onRotaryScrollEvent;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12 = this.onPreRotaryScrollEvent;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12) {
        this.onRotaryScrollEvent = function1;
        this.onPreRotaryScrollEvent = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.ui.input.rotary.RotaryInputNode create() {
        return new androidx.compose.ui.input.rotary.RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.ui.input.rotary.RotaryInputNode node) {
        node.setOnEvent(this.onRotaryScrollEvent);
        node.setOnPreEvent(this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function1 = this.onRotaryScrollEvent;
        if (function1 != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", function1);
        }
        kotlin.jvm.functions.Function1<androidx.compose.ui.input.rotary.RotaryScrollEvent, java.lang.Boolean> function12 = this.onPreRotaryScrollEvent;
        if (function12 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", function12);
        }
    }
}
