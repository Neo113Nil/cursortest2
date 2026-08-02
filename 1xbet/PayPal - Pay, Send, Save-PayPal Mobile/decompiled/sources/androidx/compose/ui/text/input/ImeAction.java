package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ImeAction {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.ImeAction.Companion INSTANCE = new androidx.compose.ui.text.input.ImeAction.Companion(null);
    private static final int Unspecified = getHighSpeedVideoFpsRanges(-1);
    private static final int Default = getHighSpeedVideoFpsRanges(1);
    private static final int None = getHighSpeedVideoFpsRanges(0);
    private static final int Go = getHighSpeedVideoFpsRanges(2);
    private static final int Search = getHighSpeedVideoFpsRanges(3);
    private static final int Send = getHighSpeedVideoFpsRanges(4);
    private static final int Previous = getHighSpeedVideoFpsRanges(5);
    private static final int Next = getHighSpeedVideoFpsRanges(6);
    private static final int Done = getHighSpeedVideoFpsRanges(7);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8200equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        return i;
    }

    private /* synthetic */ ImeAction(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m8202toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8202toStringimpl(int i) {
        return m8200equalsimpl0(i, Unspecified) ? "Unspecified" : m8200equalsimpl0(i, None) ? com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE : m8200equalsimpl0(i, Default) ? "Default" : m8200equalsimpl0(i, Go) ? "Go" : m8200equalsimpl0(i, Search) ? "Search" : m8200equalsimpl0(i, Send) ? com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME : m8200equalsimpl0(i, Previous) ? "Previous" : m8200equalsimpl0(i, Next) ? "Next" : m8200equalsimpl0(i, Done) ? "Done" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/ImeAction;", "Unspecified", com.visa.cbp.getEncExpo.warmup, "getUnspecified-eUduSuo", "()I", "getUnspecified-eUduSuo$annotations", "Default", "getDefault-eUduSuo", "getDefault-eUduSuo$annotations", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-eUduSuo", "getNone-eUduSuo$annotations", "Go", "getGo-eUduSuo", "getGo-eUduSuo$annotations", "Search", "getSearch-eUduSuo", "getSearch-eUduSuo$annotations", com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, "getSend-eUduSuo", "getSend-eUduSuo$annotations", "Previous", "getPrevious-eUduSuo", "getPrevious-eUduSuo$annotations", "Next", "getNext-eUduSuo", "getNext-eUduSuo$annotations", "Done", "getDone-eUduSuo", "getDone-eUduSuo$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8204getDefaulteUduSuo$annotations() {
        }

        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8205getDoneeUduSuo$annotations() {
        }

        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8206getGoeUduSuo$annotations() {
        }

        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8207getNexteUduSuo$annotations() {
        }

        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8208getNoneeUduSuo$annotations() {
        }

        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8209getPreviouseUduSuo$annotations() {
        }

        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8210getSearcheUduSuo$annotations() {
        }

        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8211getSendeUduSuo$annotations() {
        }

        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m8212getUnspecifiedeUduSuo$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m8221getUnspecifiedeUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Unspecified;
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m8213getDefaulteUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Default;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m8217getNoneeUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.None;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m8215getGoeUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Go;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m8219getSearcheUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m8220getSendeUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Send;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m8218getPreviouseUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Previous;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m8216getNexteUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Next;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m8214getDoneeUduSuo() {
            return androidx.compose.ui.text.input.ImeAction.Done;
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
        return m8201hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m8199equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8201hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8199equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.input.ImeAction) && i == ((androidx.compose.ui.text.input.ImeAction) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.input.ImeAction m8198boximpl(int i) {
        return new androidx.compose.ui.text.input.ImeAction(i);
    }
}
