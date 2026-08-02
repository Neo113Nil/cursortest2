package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/material/FabPosition;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FabPosition {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.FabPosition.Companion INSTANCE = new androidx.compose.material.FabPosition.Companion(null);
    private static final int Start = m2627constructorimpl(0);
    private static final int Center = m2627constructorimpl(1);
    private static final int End = m2627constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2627constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2629equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/material/FabPosition$Companion;", "", "<init>", "()V", "Landroidx/compose/material/FabPosition;", "Start", com.visa.cbp.getEncExpo.warmup, "getStart-5ygKITE", "()I", "Center", "getCenter-5ygKITE", "End", "getEnd-5ygKITE"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getStart-5ygKITE, reason: not valid java name */
        public final int m2635getStart5ygKITE() {
            return androidx.compose.material.FabPosition.Start;
        }

        /* renamed from: getCenter-5ygKITE, reason: not valid java name */
        public final int m2633getCenter5ygKITE() {
            return androidx.compose.material.FabPosition.Center;
        }

        /* renamed from: getEnd-5ygKITE, reason: not valid java name */
        public final int m2634getEnd5ygKITE() {
            return androidx.compose.material.FabPosition.End;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m2631toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2631toStringimpl(int i) {
        return m2629equalsimpl0(i, Start) ? "FabPosition.Start" : m2629equalsimpl0(i, Center) ? "FabPosition.Center" : "FabPosition.End";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m2630hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m2628equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2630hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2628equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material.FabPosition) && i == ((androidx.compose.material.FabPosition) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material.FabPosition m2626boximpl(int i) {
        return new androidx.compose.material.FabPosition(i);
    }
}
