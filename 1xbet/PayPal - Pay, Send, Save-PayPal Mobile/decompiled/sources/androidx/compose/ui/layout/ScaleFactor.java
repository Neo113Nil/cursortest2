package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\f\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\bR\u0018\u0010\r\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "scaleX", "scaleY", "copy-8GGzs04", "(JFF)J", "copy", "operand", "times-44nBxM0", "(JF)J", "times", "div-44nBxM0", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "getScaleX-impl", "getScaleX$annotations", "()V", "getScaleY-impl", "getScaleY$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ScaleFactor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.layout.ScaleFactor.Companion INSTANCE = new androidx.compose.ui.layout.ScaleFactor.Companion(null);
    private static final long Unspecified = m7452constructorimpl((java.lang.Float.floatToRawIntBits(Float.NaN) << 32) | (java.lang.Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7452constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7457equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getScaleX$annotations() {
    }

    public static /* synthetic */ void getScaleY$annotations() {
    }

    private /* synthetic */ ScaleFactor(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7462toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScaleFactor(");
        sb.append(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m7462toStringimpl(this.packedValue);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ScaleFactor;", "Unspecified", "J", "getUnspecified-_hLwfpc", "()J", "getUnspecified-_hLwfpc$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7464getUnspecified_hLwfpc$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m7465getUnspecified_hLwfpc() {
            return androidx.compose.ui.layout.ScaleFactor.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m7458getScaleXimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m7459getScaleYimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m7450component1impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m7451component2impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m7453copy8GGzs04(long j, float f, float f2) {
        return m7452constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m7454copy8GGzs04$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m7453copy8GGzs04(j, f, f2);
    }

    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m7461times44nBxM0(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return m7452constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 * f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * f) << 32));
    }

    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m7455div44nBxM0(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m7452constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7463unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m7460hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m7456equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7460hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7456equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.layout.ScaleFactor) && j == ((androidx.compose.ui.layout.ScaleFactor) obj).m7463unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.layout.ScaleFactor m7449boximpl(long j) {
        return new androidx.compose.ui.layout.ScaleFactor(j);
    }
}
