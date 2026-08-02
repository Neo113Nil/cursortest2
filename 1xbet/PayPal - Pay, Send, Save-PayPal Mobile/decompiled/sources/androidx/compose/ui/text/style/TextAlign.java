package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextAlign.Companion INSTANCE = new androidx.compose.ui.text.style.TextAlign.Companion(null);
    private static final int Left = m8437constructorimpl(1);
    private static final int Right = m8437constructorimpl(2);
    private static final int Center = m8437constructorimpl(3);
    private static final int Justify = m8437constructorimpl(4);
    private static final int Start = m8437constructorimpl(5);
    private static final int End = m8437constructorimpl(6);
    private static final int Unspecified = m8437constructorimpl(0);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8437constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8439equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8441toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8441toStringimpl(int i) {
        return m8439equalsimpl0(i, Left) ? "Left" : m8439equalsimpl0(i, Right) ? "Right" : m8439equalsimpl0(i, Center) ? "Center" : m8439equalsimpl0(i, Justify) ? "Justify" : m8439equalsimpl0(i, Start) ? "Start" : m8439equalsimpl0(i, End) ? "End" : m8439equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/style/TextAlign;", "values", "()Ljava/util/List;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueOf-IgVj0fw", "(I)I", "valueOf", "Left", com.visa.cbp.getEncExpo.warmup, "getLeft-e0LSkKk", "()I", "Right", "getRight-e0LSkKk", "Center", "getCenter-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Start", "getStart-e0LSkKk", "End", "getEnd-e0LSkKk", "Unspecified", "getUnspecified-e0LSkKk"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m8446getLefte0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m8447getRighte0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Right;
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m8443getCentere0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Center;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m8445getJustifye0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Justify;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m8448getStarte0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Start;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m8444getEnde0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.End;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m8449getUnspecifiede0LSkKk() {
            return androidx.compose.ui.text.style.TextAlign.Unspecified;
        }

        public final java.util.List<androidx.compose.ui.text.style.TextAlign> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.style.TextAlign[]{androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8446getLefte0LSkKk()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8447getRighte0LSkKk()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8445getJustifye0LSkKk()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk()), androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8444getEnde0LSkKk())});
        }

        /* renamed from: valueOf-IgVj0fw, reason: not valid java name */
        public final int m8450valueOfIgVj0fw(int value) {
            if (value < 0 || value >= 7) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given value=");
                sb.append(value);
                sb.append(" is not recognized by TextAlign.");
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.text.style.TextAlign.m8437constructorimpl(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8442unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8440hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8438equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8440hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8438equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.TextAlign) && i == ((androidx.compose.ui.text.style.TextAlign) obj).m8442unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.TextAlign m8436boximpl(int i) {
        return new androidx.compose.ui.text.style.TextAlign(i);
    }
}
