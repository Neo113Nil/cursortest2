package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0019\u0010\u0005J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b%\u0010#J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b'\u0010#J\u000f\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0018\u0010\f\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\bR\u0018\u0010\r\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "x", "y", "copy-dBAh8RU", "(JFF)J", "copy", "", "isValid-impl", "(J)Z", "isValid", "getDistance-impl", "getDistance", "getDistanceSquared-impl", "getDistanceSquared", "unaryMinus-F1C5BW0", "unaryMinus", "other", "minus-MK-Hz9U", "(JJ)J", "minus", "plus-MK-Hz9U", "plus", "operand", "times-tuRUvjQ", "(JF)J", "times", "div-tuRUvjQ", "div", "rem-tuRUvjQ", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "getX-impl", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.Offset.Companion INSTANCE = new androidx.compose.ui.geometry.Offset.Companion(null);
    private static final long Zero = m5744constructorimpl(0);
    private static final long Infinite = m5744constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase);
    private static final long Unspecified = m5744constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5744constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5749equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m5755isValidimpl(long j) {
        return (((j & 9223372034707292159L) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0;
    }

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "Zero", "J", "getZero-F1C5BW0", "()J", "getZero-F1C5BW0$annotations", "Infinite", "getInfinite-F1C5BW0", "getInfinite-F1C5BW0$annotations", "Unspecified", "getUnspecified-F1C5BW0", "getUnspecified-F1C5BW0$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m5763getInfiniteF1C5BW0$annotations() {
        }

        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m5764getUnspecifiedF1C5BW0$annotations() {
        }

        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m5765getZeroF1C5BW0$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m5768getZeroF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Zero;
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m5766getInfiniteF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m5767getUnspecifiedF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m5761unaryMinusF1C5BW0(long j) {
        return m5744constructorimpl(j ^ (-9223372034707292160L));
    }

    public final java.lang.String toString() {
        return m5760toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5760toStringimpl(long j) {
        if ((9223372034707292159L & j) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offset(");
            sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat((int) (j >> 32)), 1));
            sb.append(", ");
            sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), 1));
            sb.append(')');
            return sb.toString();
        }
        return "Offset.Unspecified";
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m5752getXimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m5753getYimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5742component1impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5743component2impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m5745copydBAh8RU(long j, float f, float f2) {
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m5746copydBAh8RU$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m5745copydBAh8RU(j, f, f2);
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m5750getDistanceimpl(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2));
    }

    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m5751getDistanceSquaredimpl(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
    }

    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m5756minusMKHz9U(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 - intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat - intBitsToFloat2) << 32));
    }

    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m5757plusMKHz9U(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 + intBitsToFloat4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + intBitsToFloat2) << 32));
    }

    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m5759timestuRUvjQ(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 * f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * f) << 32));
    }

    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m5747divtuRUvjQ(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m5758remtuRUvjQ(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 % f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat % f) << 32));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5762unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m5754hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m5748equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5754hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5748equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.geometry.Offset) && j == ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.geometry.Offset m5741boximpl(long j) {
        return new androidx.compose.ui.geometry.Offset(j);
    }
}
