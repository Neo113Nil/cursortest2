package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.Hyphens.Companion INSTANCE = new androidx.compose.ui.text.style.Hyphens.Companion(null);
    private static final int None = m8329constructorimpl(1);
    private static final int Auto = m8329constructorimpl(2);
    private static final int Unspecified = m8329constructorimpl(0);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8329constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8331equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/style/Hyphens;", "valueOf-kPa1_AA", "(I)I", "valueOf", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-vmbZdU8", "()I", "Auto", "getAuto-vmbZdU8", "Unspecified", "getUnspecified-vmbZdU8"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m8336getNonevmbZdU8() {
            return androidx.compose.ui.text.style.Hyphens.None;
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m8335getAutovmbZdU8() {
            return androidx.compose.ui.text.style.Hyphens.Auto;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m8337getUnspecifiedvmbZdU8() {
            return androidx.compose.ui.text.style.Hyphens.Unspecified;
        }

        /* renamed from: valueOf-kPa1_AA, reason: not valid java name */
        public final int m8338valueOfkPa1_AA(int value) {
            if (value < 0 || value >= 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The given value=");
                sb.append(value);
                sb.append(" is not recognized by Hyphens.");
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.text.style.Hyphens.m8329constructorimpl(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Hyphens(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8333toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8333toStringimpl(int i) {
        return m8331equalsimpl0(i, None) ? "Hyphens.None" : m8331equalsimpl0(i, Auto) ? "Hyphens.Auto" : m8331equalsimpl0(i, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8334unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8332hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8330equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8332hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8330equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.Hyphens) && i == ((androidx.compose.ui.text.style.Hyphens) obj).m8334unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.Hyphens m8328boximpl(int i) {
        return new androidx.compose.ui.text.style.Hyphens(i);
    }
}
