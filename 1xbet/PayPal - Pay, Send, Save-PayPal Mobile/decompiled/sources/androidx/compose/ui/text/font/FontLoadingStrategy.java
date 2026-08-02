package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy;", "", "", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontLoadingStrategy.Companion INSTANCE = new androidx.compose.ui.text.font.FontLoadingStrategy.Companion(null);
    private static final int Blocking = getHighSpeedVideoFpsRanges(0);
    private static final int OptionalLocal = getHighSpeedVideoFpsRanges(1);
    private static final int Async = getHighSpeedVideoFpsRanges(2);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8139equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        return i;
    }

    private /* synthetic */ FontLoadingStrategy(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8141toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8141toStringimpl(int i) {
        if (m8139equalsimpl0(i, Blocking)) {
            return "Blocking";
        }
        if (m8139equalsimpl0(i, OptionalLocal)) {
            return "Optional";
        }
        if (m8139equalsimpl0(i, Async)) {
            return "Async";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Blocking", com.visa.cbp.getEncExpo.warmup, "getBlocking-PKNRLFQ", "()I", "OptionalLocal", "getOptionalLocal-PKNRLFQ", "Async", "getAsync-PKNRLFQ"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m8144getBlockingPKNRLFQ() {
            return androidx.compose.ui.text.font.FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m8145getOptionalLocalPKNRLFQ() {
            return androidx.compose.ui.text.font.FontLoadingStrategy.OptionalLocal;
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m8143getAsyncPKNRLFQ() {
            return androidx.compose.ui.text.font.FontLoadingStrategy.Async;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8142unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8140hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8138equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8140hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8138equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.font.FontLoadingStrategy) && i == ((androidx.compose.ui.text.font.FontLoadingStrategy) obj).m8142unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.FontLoadingStrategy m8137boximpl(int i) {
        return new androidx.compose.ui.text.font.FontLoadingStrategy(i);
    }
}
