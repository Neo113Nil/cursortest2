package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerButtons;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "packedValue", "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class PointerButtons {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7166constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7168equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ PointerButtons(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m7170toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m7169hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m7167equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7170toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerButtons(packedValue=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7169hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7167equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.pointer.PointerButtons) && i == ((androidx.compose.ui.input.pointer.PointerButtons) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.pointer.PointerButtons m7165boximpl(int i) {
        return new androidx.compose.ui.input.pointer.PointerButtons(i);
    }
}
