package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0081@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b\u0088\u0001\u001e\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "", "p0", "getHighSpeedVideoSizes", "(J)J", "", "density", "fontScale", "constructor-impl", "(FF)J", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "J", "getDensity-impl", "(J)F", "getFontScale-impl", "Companion", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class InlineDensity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.modifiers.InlineDensity.Companion INSTANCE = new androidx.compose.foundation.text.modifiers.InlineDensity.Companion(null);
    private static final long Unspecified = m2321constructorimpl(Float.NaN, Float.NaN);
    private final long Camera2StreamConfigurationMap;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2324equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private static long getHighSpeedVideoSizes(long j) {
        return j;
    }

    private /* synthetic */ InlineDensity(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2322constructorimpl(androidx.compose.ui.unit.Density density) {
        return m2321constructorimpl(density.getGetHighResolutionOutputSizeshNQ4ISI(), density.getGetHighSpeedVideoFpsRangesFor());
    }

    public final java.lang.String toString() {
        return m2328toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2328toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InlineDensity(density=");
        sb.append(m2325getDensityimpl(j));
        sb.append(", fontScale=");
        sb.append(m2326getFontScaleimpl(j));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "Unspecified", "J", "getUnspecified-L26CHvs", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m2330getUnspecifiedL26CHvs() {
            return androidx.compose.foundation.text.modifiers.InlineDensity.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2321constructorimpl(float f, float f2) {
        return getHighSpeedVideoSizes((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m2325getDensityimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m2326getFontScaleimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m2327hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m2323equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2327hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2323equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.modifiers.InlineDensity) && j == ((androidx.compose.foundation.text.modifiers.InlineDensity) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.modifiers.InlineDensity m2320boximpl(long j) {
        return new androidx.compose.foundation.text.modifiers.InlineDensity(j);
    }
}
