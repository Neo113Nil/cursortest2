package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "isWeightOn-impl$ui_text", "(I)Z", "isWeightOn", "isStyleOn-impl$ui_text", "isStyleOn", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontSynthesis.Companion INSTANCE = new androidx.compose.ui.text.font.FontSynthesis.Companion(null);
    private static final int None = m8161constructorimpl(0);
    private static final int Weight = m8161constructorimpl(1);
    private static final int Style = m8161constructorimpl(2);
    private static final int All = m8161constructorimpl(65535);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8161constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8163equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isStyleOn-impl$ui_text, reason: not valid java name */
    public static final boolean m8165isStyleOnimpl$ui_text(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text, reason: not valid java name */
    public static final boolean m8166isWeightOnimpl$ui_text(int i) {
        return (i & 1) != 0;
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8167toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8167toStringimpl(int i) {
        return m8163equalsimpl0(i, None) ? com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE : m8163equalsimpl0(i, Weight) ? com.daon.dmds.recognizers.IDMDSResultCreatorFields.Weight : m8163equalsimpl0(i, Style) ? "Style" : m8163equalsimpl0(i, All) ? "All" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/font/FontSynthesis;", "valueOf-9CiegCU", "(I)I", "valueOf", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-GVVA2EU", "()I", com.daon.dmds.recognizers.IDMDSResultCreatorFields.Weight, "getWeight-GVVA2EU", "Style", "getStyle-GVVA2EU", "All", "getAll-GVVA2EU"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m8170getNoneGVVA2EU() {
            return androidx.compose.ui.text.font.FontSynthesis.None;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m8172getWeightGVVA2EU() {
            return androidx.compose.ui.text.font.FontSynthesis.Weight;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m8171getStyleGVVA2EU() {
            return androidx.compose.ui.text.font.FontSynthesis.Style;
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m8169getAllGVVA2EU() {
            return androidx.compose.ui.text.font.FontSynthesis.All;
        }

        /* renamed from: valueOf-9CiegCU, reason: not valid java name */
        public final int m8173valueOf9CiegCU(int value) {
            if (value != 0 && value != 1 && value != 2 && value != 65535) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given value=");
                sb.append(value);
                sb.append(" is not recognized by FontSynthesis.");
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.text.font.FontSynthesis.m8161constructorimpl(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8168unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8164hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8162equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8164hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8162equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.font.FontSynthesis) && i == ((androidx.compose.ui.text.font.FontSynthesis) obj).m8168unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.FontSynthesis m8160boximpl(int i) {
        return new androidx.compose.ui.text.font.FontSynthesis(i);
    }
}
