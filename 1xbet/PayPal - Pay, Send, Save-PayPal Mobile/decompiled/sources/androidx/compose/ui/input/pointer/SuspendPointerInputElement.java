package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR&\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "", "key1", "key2", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "create", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "node", "update", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "getKey2", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl> {
    public static final int $stable = 0;
    private final java.lang.Object key1;
    private final java.lang.Object key2;
    private final java.lang.Object[] keys;
    private final androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler;

    public SuspendPointerInputElement(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputEventHandler = pointerInputEventHandler;
    }

    public /* synthetic */ SuspendPointerInputElement(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    public final java.lang.Object getKey1() {
        return this.key1;
    }

    public final java.lang.Object getKey2() {
        return this.key2;
    }

    public final java.lang.Object[] getKeys() {
        return this.keys;
    }

    public final androidx.compose.ui.input.pointer.PointerInputEventHandler getPointerInputEventHandler() {
        return this.pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.key1);
        inspectorInfo.getProperties().set("key2", this.key2);
        inspectorInfo.getProperties().set(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, this.keys);
        inspectorInfo.getProperties().set("pointerInputEventHandler", this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl node) {
        node.update$ui(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement)) {
            return false;
        }
        androidx.compose.ui.input.pointer.SuspendPointerInputElement suspendPointerInputElement = (androidx.compose.ui.input.pointer.SuspendPointerInputElement) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.key1, suspendPointerInputElement.key1) || !kotlin.jvm.internal.Intrinsics.areEqual(this.key2, suspendPointerInputElement.key2)) {
            return false;
        }
        java.lang.Object[] objArr = this.keys;
        if (objArr != null) {
            java.lang.Object[] objArr2 = suspendPointerInputElement.keys;
            if (objArr2 == null || !java.util.Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.keys != null) {
            return false;
        }
        return this.pointerInputEventHandler == suspendPointerInputElement.pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        java.lang.Object obj = this.key1;
        int hashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.key2;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        java.lang.Object[] objArr = this.keys;
        return (((((hashCode * 31) + hashCode2) * 31) + (objArr != null ? java.util.Arrays.hashCode(objArr) : 0)) * 31) + this.pointerInputEventHandler.hashCode();
    }
}
