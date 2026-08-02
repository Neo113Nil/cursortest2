package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization;", "", "", "p0", "getHighSpeedVideoFpsRangesFor", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class KeyboardCapitalization {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.KeyboardCapitalization.Companion INSTANCE = new androidx.compose.ui.text.input.KeyboardCapitalization.Companion(null);
    private static final int Unspecified = getHighSpeedVideoFpsRangesFor(-1);
    private static final int None = getHighSpeedVideoFpsRangesFor(0);
    private static final int Characters = getHighSpeedVideoFpsRangesFor(1);
    private static final int Words = getHighSpeedVideoFpsRangesFor(2);
    private static final int Sentences = getHighSpeedVideoFpsRangesFor(3);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8235equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        return i;
    }

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m8237toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8237toStringimpl(int i) {
        return m8235equalsimpl0(i, Unspecified) ? "Unspecified" : m8235equalsimpl0(i, None) ? com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE : m8235equalsimpl0(i, Characters) ? "Characters" : m8235equalsimpl0(i, Words) ? "Words" : m8235equalsimpl0(i, Sentences) ? "Sentences" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "Unspecified", com.visa.cbp.getEncExpo.warmup, "getUnspecified-IUNYP9k", "()I", "getUnspecified-IUNYP9k$annotations", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-IUNYP9k", "getNone-IUNYP9k$annotations", "Characters", "getCharacters-IUNYP9k", "getCharacters-IUNYP9k$annotations", "Words", "getWords-IUNYP9k", "getWords-IUNYP9k$annotations", "Sentences", "getSentences-IUNYP9k", "getSentences-IUNYP9k$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8239getCharactersIUNYP9k$annotations() {
        }

        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8240getNoneIUNYP9k$annotations() {
        }

        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8241getSentencesIUNYP9k$annotations() {
        }

        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8242getUnspecifiedIUNYP9k$annotations() {
        }

        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m8243getWordsIUNYP9k$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m8247getUnspecifiedIUNYP9k() {
            return androidx.compose.ui.text.input.KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m8245getNoneIUNYP9k() {
            return androidx.compose.ui.text.input.KeyboardCapitalization.None;
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m8244getCharactersIUNYP9k() {
            return androidx.compose.ui.text.input.KeyboardCapitalization.Characters;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m8248getWordsIUNYP9k() {
            return androidx.compose.ui.text.input.KeyboardCapitalization.Words;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m8246getSentencesIUNYP9k() {
            return androidx.compose.ui.text.input.KeyboardCapitalization.Sentences;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m8236hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m8234equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8236hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8234equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.input.KeyboardCapitalization) && i == ((androidx.compose.ui.text.input.KeyboardCapitalization) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.input.KeyboardCapitalization m8233boximpl(int i) {
        return new androidx.compose.ui.text.input.KeyboardCapitalization(i);
    }
}
