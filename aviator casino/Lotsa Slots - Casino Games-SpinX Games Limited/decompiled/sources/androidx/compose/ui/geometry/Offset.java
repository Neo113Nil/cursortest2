package androidx.compose.ui.geometry;

/* compiled from: Offset.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010,J\u001e\u0010/\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010\u0019J\u001e\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.geometry.Offset.Companion INSTANCE = new androidx.compose.ui.geometry.Offset.Companion(null);
    private static final long Zero = androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = androidx.compose.ui.geometry.OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = androidx.compose.ui.geometry.OffsetKt.Offset(Float.NaN, Float.NaN);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.geometry.Offset m1860boximpl(long j) {
        return new androidx.compose.ui.geometry.Offset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1863constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1867equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.geometry.Offset) && j == ((androidx.compose.ui.geometry.Offset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1868equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1873hashCodeimpl(long j) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(j);
    }

    public boolean equals(java.lang.Object obj) {
        return m1867equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1873hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ Offset(long j) {
        this.packedValue = j;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m1871getXimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("Offset is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m1872getYimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("Offset is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m1861component1impl(long j) {
        return m1871getXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m1862component2impl(long j) {
        return m1872getYimpl(j);
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m1864copydBAh8RU(long j, float f, float f2) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(f, f2);
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m1865copydBAh8RU$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m1871getXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m1872getYimpl(j);
        }
        return m1864copydBAh8RU(j, f, f2);
    }

    /* compiled from: Offset.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1882getInfiniteF1C5BW0$annotations() {
        }

        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1883getUnspecifiedF1C5BW0$annotations() {
        }

        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m1884getZeroF1C5BW0$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m1887getZeroF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Zero;
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m1885getInfiniteF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m1886getUnspecifiedF1C5BW0() {
            return androidx.compose.ui.geometry.Offset.Unspecified;
        }
    }

    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m1874isValidimpl(long j) {
        if (java.lang.Float.isNaN(m1871getXimpl(j)) || java.lang.Float.isNaN(m1872getYimpl(j))) {
            throw new java.lang.IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        return true;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m1869getDistanceimpl(long j) {
        return (float) java.lang.Math.sqrt((m1871getXimpl(j) * m1871getXimpl(j)) + (m1872getYimpl(j) * m1872getYimpl(j)));
    }

    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m1870getDistanceSquaredimpl(long j) {
        return (m1871getXimpl(j) * m1871getXimpl(j)) + (m1872getYimpl(j) * m1872getYimpl(j));
    }

    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m1880unaryMinusF1C5BW0(long j) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(-m1871getXimpl(j), -m1872getYimpl(j));
    }

    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m1875minusMKHz9U(long j, long j2) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(m1871getXimpl(j) - m1871getXimpl(j2), m1872getYimpl(j) - m1872getYimpl(j2));
    }

    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m1876plusMKHz9U(long j, long j2) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(m1871getXimpl(j) + m1871getXimpl(j2), m1872getYimpl(j) + m1872getYimpl(j2));
    }

    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m1878timestuRUvjQ(long j, float f) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(m1871getXimpl(j) * f, m1872getYimpl(j) * f);
    }

    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m1866divtuRUvjQ(long j, float f) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(m1871getXimpl(j) / f, m1872getYimpl(j) / f);
    }

    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m1877remtuRUvjQ(long j, float f) {
        return androidx.compose.ui.geometry.OffsetKt.Offset(m1871getXimpl(j) % f, m1872getYimpl(j) % f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1879toStringimpl(long j) {
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(j)) {
            return "Offset(" + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(m1871getXimpl(j), 1) + ", " + androidx.compose.ui.geometry.GeometryUtilsKt.toStringAsFixed(m1872getYimpl(j), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public java.lang.String toString() {
        return m1879toStringimpl(this.packedValue);
    }
}
