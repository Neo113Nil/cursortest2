package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/animation/core/StartOffsetType;", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class StartOffsetType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.animation.core.StartOffsetType.Companion INSTANCE = new androidx.compose.animation.core.StartOffsetType.Companion(null);
    private static final int Delay = getHighResolutionOutputSizeshNQ4ISI(-1);
    private static final int FastForward = getHighResolutionOutputSizeshNQ4ISI(1);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1229equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/animation/core/StartOffsetType$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/StartOffsetType;", "Delay", com.visa.cbp.getEncExpo.warmup, "getDelay-Eo1U57Q", "()I", "FastForward", "getFastForward-Eo1U57Q"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m1233getDelayEo1U57Q() {
            return androidx.compose.animation.core.StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m1234getFastForwardEo1U57Q() {
            return androidx.compose.animation.core.StartOffsetType.FastForward;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ StartOffsetType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return m1231toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return m1230hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m1228equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1231toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StartOffsetType(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1230hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1228equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.core.StartOffsetType) && i == ((androidx.compose.animation.core.StartOffsetType) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.StartOffsetType m1227boximpl(int i) {
        return new androidx.compose.animation.core.StartOffsetType(i);
    }
}
