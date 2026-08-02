package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u0010\u0092\u0001\u00020\n"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class MarqueeAnimationMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.MarqueeAnimationMode.Companion INSTANCE = new androidx.compose.foundation.MarqueeAnimationMode.Companion(null);
    private static final int Immediately = 0;
    private static final int WhileFocused = 1;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1352equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ MarqueeAnimationMode(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m1354toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1354toStringimpl(int i) {
        if (m1352equalsimpl0(i, Immediately)) {
            return "Immediately";
        }
        if (m1352equalsimpl0(i, WhileFocused)) {
            return "WhileFocused";
        }
        throw new java.lang.IllegalStateException("invalid value: ".concat(java.lang.String.valueOf(i)).toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/MarqueeAnimationMode;", "Immediately", com.visa.cbp.getEncExpo.warmup, "getImmediately-ZbEOnfQ", "()I", "WhileFocused", "getWhileFocused-ZbEOnfQ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m1356getImmediatelyZbEOnfQ() {
            return androidx.compose.foundation.MarqueeAnimationMode.Immediately;
        }

        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m1357getWhileFocusedZbEOnfQ() {
            return androidx.compose.foundation.MarqueeAnimationMode.WhileFocused;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m1353hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m1351equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1353hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1351equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.MarqueeAnimationMode) && i == ((androidx.compose.foundation.MarqueeAnimationMode) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.MarqueeAnimationMode m1350boximpl(int i) {
        return new androidx.compose.foundation.MarqueeAnimationMode(i);
    }
}
