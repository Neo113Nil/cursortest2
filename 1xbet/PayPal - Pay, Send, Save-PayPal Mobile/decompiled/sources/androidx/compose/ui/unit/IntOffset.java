package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\bR\u0017\u0010\r\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "x", "y", "copy-iSbpLlY", "(JII)J", "copy", "other", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "unaryMinus", "", "operand", "times-Bjo55l4", "(JF)J", "times", "div-Bjo55l4", "div", "rem-Bjo55l4", "(JI)J", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "getPackedValue", "()J", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class IntOffset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.IntOffset.Companion INSTANCE = new androidx.compose.ui.unit.IntOffset.Companion(null);
    private static final long Zero = m8723constructorimpl(0);
    private static final long Max = m8723constructorimpl(9223372034707292159L);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8723constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8728equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m8729getXimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m8730getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m8721component1impl(long j) {
        return m8729getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m8722component2impl(long j) {
        return m8730getYimpl(j);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m8725copyiSbpLlY$default(long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m8724copyiSbpLlY(j, i, i2);
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m8724copyiSbpLlY(long j, int i, int i2) {
        return m8723constructorimpl((i << 32) | (i2 & 4294967295L));
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m8732minusqkQi6aY(long j, long j2) {
        int i = (int) (j2 & 4294967295L);
        return m8723constructorimpl(((((int) (j & 4294967295L)) - i) & 4294967295L) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32));
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m8733plusqkQi6aY(long j, long j2) {
        int i = (int) (j2 & 4294967295L);
        return m8723constructorimpl(((((int) (j & 4294967295L)) + i) & 4294967295L) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32));
    }

    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m8737unaryMinusnOccac(long j) {
        return m8723constructorimpl(((-((int) (j & 4294967295L))) & 4294967295L) | ((-((int) (j >> 32))) << 32));
    }

    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m8734remBjo55l4(long j, int i) {
        int i2 = (int) (j >> 32);
        return m8723constructorimpl(((((int) (j & 4294967295L)) % i) & 4294967295L) | ((i2 % i) << 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8736toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(m8729getXimpl(j));
        sb.append(", ");
        sb.append(m8730getYimpl(j));
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m8736toStringimpl(this.packedValue);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "Zero", "J", "getZero-nOcc-ac", "()J", "Max", "getMax-nOcc-ac"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m8740getZeronOccac() {
            return androidx.compose.ui.unit.IntOffset.Zero;
        }

        /* renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m8739getMaxnOccac() {
            return androidx.compose.ui.unit.IntOffset.Max;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m8735timesBjo55l4(long j, float f) {
        return m8723constructorimpl((java.lang.Math.round(((int) (j >> 32)) * f) << 32) | (java.lang.Math.round(((int) (j & 4294967295L)) * f) & 4294967295L));
    }

    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m8726divBjo55l4(long j, float f) {
        return m8723constructorimpl((java.lang.Math.round(((int) (j >> 32)) / f) << 32) | (java.lang.Math.round(((int) (j & 4294967295L)) / f) & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8738unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m8731hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m8727equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8731hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8727equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.IntOffset) && j == ((androidx.compose.ui.unit.IntOffset) obj).m8738unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.IntOffset m8720boximpl(long j) {
        return new androidx.compose.ui.unit.IntOffset(j);
    }
}
