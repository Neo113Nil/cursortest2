package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextObfuscationMode {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.TextObfuscationMode.Companion INSTANCE = new androidx.compose.foundation.text.input.TextObfuscationMode.Companion(null);
    private static final int Visible = m2195constructorimpl(0);
    private static final int RevealLastTyped = m2195constructorimpl(1);
    private static final int Hidden = m2195constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2195constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2197equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, com.visa.cbp.getEncExpo.warmup, "getVisible-vTwcZD0", "()I", "RevealLastTyped", "getRevealLastTyped-vTwcZD0", "Hidden", "getHidden-vTwcZD0"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getVisible-vTwcZD0, reason: not valid java name */
        public final int m2203getVisiblevTwcZD0() {
            return androidx.compose.foundation.text.input.TextObfuscationMode.Visible;
        }

        /* renamed from: getRevealLastTyped-vTwcZD0, reason: not valid java name */
        public final int m2202getRevealLastTypedvTwcZD0() {
            return androidx.compose.foundation.text.input.TextObfuscationMode.RevealLastTyped;
        }

        /* renamed from: getHidden-vTwcZD0, reason: not valid java name */
        public final int m2201getHiddenvTwcZD0() {
            return androidx.compose.foundation.text.input.TextObfuscationMode.Hidden;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TextObfuscationMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2200unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m2199toStringimpl(this.value);
    }

    public final int hashCode() {
        return m2198hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m2196equalsimpl(this.value, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2199toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextObfuscationMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2198hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2196equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.input.TextObfuscationMode) && i == ((androidx.compose.foundation.text.input.TextObfuscationMode) obj).m2200unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.input.TextObfuscationMode m2194boximpl(int i) {
        return new androidx.compose.foundation.text.input.TextObfuscationMode(i);
    }
}
