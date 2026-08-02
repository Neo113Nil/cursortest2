package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ!\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0011\u0010\r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b!\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "pivotFractionX", "pivotFractionY", "copy-zey9I6w", "(JFF)J", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "J", "getPackedValue$annotations", "()V", "getHighSpeedVideoFpsRanges", "getPivotFractionX-impl", "getPivotFractionY-impl", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TransformOrigin {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.TransformOrigin.Companion INSTANCE = new androidx.compose.ui.graphics.TransformOrigin.Companion(null);
    private static final long Center = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6368constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6372equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    private /* synthetic */ TransformOrigin(long j) {
        this.getHighSpeedVideoFpsRanges = j;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m6366component1impl(long j) {
        return m6373getPivotFractionXimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m6367component2impl(long j) {
        return m6374getPivotFractionYimpl(j);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m6370copyzey9I6w$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m6373getPivotFractionXimpl(j);
        }
        if ((i & 2) != 0) {
            f2 = m6374getPivotFractionYimpl(j);
        }
        return m6369copyzey9I6w(j, f, f2);
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m6369copyzey9I6w(long j, float f, float f2) {
        return androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(f, f2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/TransformOrigin;", "Center", "J", "getCenter-SzJe1aQ", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m6378getCenterSzJe1aQ() {
            return androidx.compose.ui.graphics.TransformOrigin.Center;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m6373getPivotFractionXimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m6374getPivotFractionYimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m6376toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m6375hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m6371equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6376toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6375hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6371equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.TransformOrigin) && j == ((androidx.compose.ui.graphics.TransformOrigin) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.TransformOrigin m6365boximpl(long j) {
        return new androidx.compose.ui.graphics.TransformOrigin(j);
    }
}
