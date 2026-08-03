package androidx.compose.ui.geometry;

/* compiled from: Size.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000bJ'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.Size.Companion INSTANCE = new androidx.compose.ui.geometry.Size.Companion(null);
    private static final long Zero = androidx.compose.ui.geometry.SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = androidx.compose.ui.geometry.SizeKt.Size(Float.NaN, Float.NaN);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.geometry.Size m1928boximpl(long j) {
        return new androidx.compose.ui.geometry.Size(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1931constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1935equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.geometry.Size) && j == ((androidx.compose.ui.geometry.Size) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1936equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    public static /* synthetic */ void getMinDimension$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1941hashCodeimpl(long j) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(j);
    }

    public boolean equals(java.lang.Object obj) {
        return m1935equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1941hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m1940getWidthimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("Size is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m1937getHeightimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("Size is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m1929component1impl(long j) {
        return m1940getWidthimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m1930component2impl(long j) {
        return m1937getHeightimpl(j);
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m1932copyxjbvk4A(long j, float f, float f2) {
        return androidx.compose.ui.geometry.SizeKt.Size(f, f2);
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m1933copyxjbvk4A$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m1940getWidthimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m1937getHeightimpl(j);
        }
        return m1932copyxjbvk4A(j, f, f2);
    }

    /* compiled from: Size.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1946getUnspecifiedNHjbRc$annotations() {
        }

        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1947getZeroNHjbRc$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m1949getZeroNHjbRc() {
            return androidx.compose.ui.geometry.Size.Zero;
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m1948getUnspecifiedNHjbRc() {
            return androidx.compose.ui.geometry.Size.Unspecified;
        }
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m1942isEmptyimpl(long j) {
        return m1940getWidthimpl(j) <= 0.0f || m1937getHeightimpl(j) <= 0.0f;
    }

    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m1943times7Ah8Wj8(long j, float f) {
        return androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl(j) * f, m1937getHeightimpl(j) * f);
    }

    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m1934div7Ah8Wj8(long j, float f) {
        return androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl(j) / f, m1937getHeightimpl(j) / f);
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m1939getMinDimensionimpl(long j) {
        return java.lang.Math.min(java.lang.Math.abs(m1940getWidthimpl(j)), java.lang.Math.abs(m1937getHeightimpl(j)));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m1938getMaxDimensionimpl(long j) {
        return java.lang.Math.max(java.lang.Math.abs(m1940getWidthimpl(j)), java.lang.Math.abs(m1937getHeightimpl(j)));
    }

    public java.lang.String toString() {
        return m1944toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1944toStringimpl(long j) {
        if (j != INSTANCE.m1948getUnspecifiedNHjbRc()) {
            return "Size(" + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(m1940getWidthimpl(j), 1) + ", " + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(m1937getHeightimpl(j), 1) + ')';
        }
        return "Size.Unspecified";
    }
}
