package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\f¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "", com.daon.sdk.face.license.License.FEATURE_MASK, "constructor-impl", "(I)I", "other", "or-H91voCI", "(II)I", "or", "or-impl", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMask"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m7621constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7623equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m7625orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m7626orimpl(int i, int i2) {
        return i | i2;
    }

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    public final int getMask() {
        return this.mask;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7628unboximpl() {
        return this.mask;
    }

    public final java.lang.String toString() {
        return m7627toStringimpl(this.mask);
    }

    public final int hashCode() {
        return m7624hashCodeimpl(this.mask);
    }

    public final boolean equals(java.lang.Object other) {
        return m7622equalsimpl(this.mask, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7627toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NodeKind(mask=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7624hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7622equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.node.NodeKind) && i == ((androidx.compose.ui.node.NodeKind) obj).m7628unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.node.NodeKind m7620boximpl(int i) {
        return new androidx.compose.ui.node.NodeKind(i);
    }
}
