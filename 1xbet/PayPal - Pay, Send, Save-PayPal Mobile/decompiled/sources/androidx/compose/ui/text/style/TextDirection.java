package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextDirection.Companion INSTANCE = new androidx.compose.ui.text.style.TextDirection.Companion(null);
    private static final int Ltr = m8454constructorimpl(1);
    private static final int Rtl = m8454constructorimpl(2);
    private static final int Content = m8454constructorimpl(3);
    private static final int ContentOrLtr = m8454constructorimpl(4);
    private static final int ContentOrRtl = m8454constructorimpl(5);
    private static final int Unspecified = m8454constructorimpl(0);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8454constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8456equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8458toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8458toStringimpl(int i) {
        return m8456equalsimpl0(i, Ltr) ? "Ltr" : m8456equalsimpl0(i, Rtl) ? "Rtl" : m8456equalsimpl0(i, Content) ? "Content" : m8456equalsimpl0(i, ContentOrLtr) ? "ContentOrLtr" : m8456equalsimpl0(i, ContentOrRtl) ? "ContentOrRtl" : m8456equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/style/TextDirection;", "valueOf-E8nx0Ws", "(I)I", "valueOf", "Ltr", com.visa.cbp.getEncExpo.warmup, "getLtr-s_7X-co", "()I", "Rtl", "getRtl-s_7X-co", "Content", "getContent-s_7X-co", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Unspecified", "getUnspecified-s_7X-co"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m8463getLtrs_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m8464getRtls_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.Rtl;
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m8460getContents_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m8461getContentOrLtrs_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m8462getContentOrRtls_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.ContentOrRtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m8465getUnspecifieds_7Xco() {
            return androidx.compose.ui.text.style.TextDirection.Unspecified;
        }

        /* renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m8466valueOfE8nx0Ws(int value) {
            if (value < 0 || value >= 6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given value=");
                sb.append(value);
                sb.append(" is not recognized by TextDirection.");
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.text.style.TextDirection.m8454constructorimpl(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8459unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8457hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8455equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8457hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8455equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.TextDirection) && i == ((androidx.compose.ui.text.style.TextDirection) obj).m8459unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.TextDirection m8453boximpl(int i) {
        return new androidx.compose.ui.text.style.TextDirection(i);
    }
}
