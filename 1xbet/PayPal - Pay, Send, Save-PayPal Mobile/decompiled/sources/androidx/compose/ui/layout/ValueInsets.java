package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0017\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0012\u0010\u0019\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0012\u0010\u001b\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0012\u0010\u001d\u001a\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/layout/ValueInsets;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "J", "getPackedValue", "()J", "getLeft-impl", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "getTop-impl", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getRight-impl", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "getBottom-impl", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ValueInsets {
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7476constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7478equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m7479getBottomimpl(long j) {
        return (int) (j & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getLeft-impl, reason: not valid java name */
    public static final int m7480getLeftimpl(long j) {
        return (int) ((j >>> 48) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getRight-impl, reason: not valid java name */
    public static final int m7481getRightimpl(long j) {
        return (int) ((j >>> 16) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m7482getTopimpl(long j) {
        return (int) ((j >>> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public final java.lang.String toString() {
        return m7484toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7484toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) (j & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7485unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m7483hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object obj) {
        return m7477equalsimpl(this.packedValue, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7483hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7477equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.layout.ValueInsets) && j == ((androidx.compose.ui.layout.ValueInsets) obj).m7485unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.layout.ValueInsets m7475boximpl(long j) {
        return new androidx.compose.ui.layout.ValueInsets(j);
    }
}
