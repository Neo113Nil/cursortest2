package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/animation/core/ArcMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ArcMode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.animation.core.ArcMode.Companion INSTANCE = new androidx.compose.animation.core.ArcMode.Companion(null);
    private static final int ArcAbove = m1189constructorimpl(5);
    private static final int ArcBelow = m1189constructorimpl(4);
    private static final int ArcLinear = m1189constructorimpl(0);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1189constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1191equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ ArcMode(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/animation/core/ArcMode$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/ArcMode;", "ArcAbove", com.visa.cbp.getEncExpo.warmup, "getArcAbove--9T-Mq4", "()I", "ArcBelow", "getArcBelow--9T-Mq4", "ArcLinear", "getArcLinear--9T-Mq4"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getArcAbove--9T-Mq4, reason: not valid java name */
        public final int m1195getArcAbove9TMq4() {
            return androidx.compose.animation.core.ArcMode.ArcAbove;
        }

        /* renamed from: getArcBelow--9T-Mq4, reason: not valid java name */
        public final int m1196getArcBelow9TMq4() {
            return androidx.compose.animation.core.ArcMode.ArcBelow;
        }

        /* renamed from: getArcLinear--9T-Mq4, reason: not valid java name */
        public final int m1197getArcLinear9TMq4() {
            return androidx.compose.animation.core.ArcMode.ArcLinear;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m1193toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m1192hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m1190equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1193toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArcMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1192hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1190equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.core.ArcMode) && i == ((androidx.compose.animation.core.ArcMode) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.ArcMode m1188boximpl(int i) {
        return new androidx.compose.animation.core.ArcMode(i);
    }
}
