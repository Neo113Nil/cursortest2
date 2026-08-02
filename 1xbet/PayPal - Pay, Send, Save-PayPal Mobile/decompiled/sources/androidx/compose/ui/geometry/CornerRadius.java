package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0018\u0010\f\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\bR\u0018\u0010\r\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-OHQCggk", "(JFF)J", "copy", "", "isZero-impl", "(J)Z", "isZero", "isCircular-impl", "isCircular", "unaryMinus-kKHJgLs", "unaryMinus", "other", "minus-vF7b-mM", "(JJ)J", "minus", "plus-vF7b-mM", "plus", "operand", "times-Bz7bX_o", "(JF)J", "times", "div-Bz7bX_o", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class CornerRadius {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.CornerRadius.Companion INSTANCE = new androidx.compose.ui.geometry.CornerRadius.Companion(null);
    private static final long Zero = m5706constructorimpl(0);
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5706constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5711equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m5715isCircularimpl(long j) {
        return (j >>> 32) == (j & 4294967295L);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m5716isZeroimpl(long j) {
        long j2 = j & 9223372034707292159L;
        return (((j2 - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (~j2)) & (-9223372034707292160L)) != 0;
    }

    private /* synthetic */ CornerRadius(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/CornerRadius;", "Zero", "J", "getZero-kKHJgLs", "()J", "getZero-kKHJgLs$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m5723getZerokKHJgLs$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m5724getZerokKHJgLs() {
            return androidx.compose.ui.geometry.CornerRadius.Zero;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m5721unaryMinuskKHJgLs(long j) {
        return m5706constructorimpl(j ^ (-9223372034707292160L));
    }

    public final java.lang.String toString() {
        return m5720toStringimpl(this.packedValue);
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m5712getXimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m5713getYimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5704component1impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5705component2impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m5707copyOHQCggk(long j, float f, float f2) {
        return m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m5708copyOHQCggk$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m5707copyOHQCggk(j, f, f2);
    }

    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m5717minusvF7bmM(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 - intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - intBitsToFloat2) << 32));
    }

    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m5718plusvF7bmM(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 + intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + intBitsToFloat2) << 32));
    }

    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m5719timesBz7bX_o(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 * f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * f) << 32));
    }

    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m5709divBz7bX_o(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m5706constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5720toStringimpl(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == java.lang.Float.intBitsToFloat(i2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CornerRadius.circular(");
            sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i), 1));
            sb.append(')');
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CornerRadius.elliptical(");
        sb2.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i), 1));
        sb2.append(", ");
        sb2.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat(i2), 1));
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5722unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m5714hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m5710equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5714hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5710equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.geometry.CornerRadius) && j == ((androidx.compose.ui.geometry.CornerRadius) obj).m5722unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.geometry.CornerRadius m5703boximpl(long j) {
        return new androidx.compose.ui.geometry.CornerRadius(j);
    }
}
