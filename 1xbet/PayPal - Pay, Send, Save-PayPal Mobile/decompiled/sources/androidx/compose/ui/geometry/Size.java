package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010\f\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\bR\u0018\u0010\r\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\bR\u0017\u0010/\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\bR\u0017\u00102\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "width", "height", "copy-xjbvk4A", "(JFF)J", "copy", "", "isEmpty-impl", "(J)Z", "isEmpty", "operand", "times-7Ah8Wj8", "(JF)J", "times", "div-7Ah8Wj8", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "getWidth-impl", "getWidth$annotations", "()V", "getHeight-impl", "getHeight$annotations", "getMinDimension-impl", "getMinDimension$annotations", "minDimension", "getMaxDimension-impl", "getMaxDimension$annotations", "maxDimension", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.Size.Companion INSTANCE = new androidx.compose.ui.geometry.Size.Companion(null);
    private static final long Zero = m5812constructorimpl(0);
    private static final long Unspecified = m5812constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5812constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5817equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "Zero", "J", "getZero-NH-jbRc", "()J", "getZero-NH-jbRc$annotations", "Unspecified", "getUnspecified-NH-jbRc", "getUnspecified-NH-jbRc$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5827getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5828getZeroNHjbRc$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m5830getZeroNHjbRc() {
            return androidx.compose.ui.geometry.Size.Zero;
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m5829getUnspecifiedNHjbRc() {
            return androidx.compose.ui.geometry.Size.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m5825toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5825toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(");
            sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat((int) (j >> 32)), 1));
            sb.append(", ");
            sb.append(androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), 1));
            sb.append(')');
            return sb.toString();
        }
        return "Size.Unspecified";
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m5821getWidthimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m5818getHeightimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5810component1impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5811component2impl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m5813copyxjbvk4A(long j, float f, float f2) {
        return m5812constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m5814copyxjbvk4A$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m5813copyxjbvk4A(j, f, f2);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5823isEmptyimpl(long j) {
        return (j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) | (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m5824times7Ah8Wj8(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat2 * f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat * f) << 32));
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m5815div7Ah8Wj8(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m5820getMinDimensionimpl(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & androidx.collection.SieveCacheKt.NodeLinkMask)), java.lang.Float.intBitsToFloat((int) (j & androidx.collection.SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m5819getMaxDimensionimpl(long j) {
        return java.lang.Math.max(java.lang.Float.intBitsToFloat((int) ((j >> 32) & androidx.collection.SieveCacheKt.NodeLinkMask)), java.lang.Float.intBitsToFloat((int) (j & androidx.collection.SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5826unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m5822hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m5816equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5822hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5816equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.geometry.Size) && j == ((androidx.compose.ui.geometry.Size) obj).m5826unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.geometry.Size m5809boximpl(long j) {
        return new androidx.compose.ui.geometry.Size(j);
    }
}
