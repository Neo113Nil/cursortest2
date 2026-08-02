package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontStyle.Companion INSTANCE = new androidx.compose.ui.text.font.FontStyle.Companion(null);
    private static final int Normal = m8150constructorimpl(0);
    private static final int Italic = m8150constructorimpl(1);

    @kotlin.Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.ReplaceWith(expression = "FontStyle.", imports = {}))
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8150constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8152equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.ReplaceWith(expression = "FontStyle.", imports = {}))
    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8154toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8154toStringimpl(int i) {
        return m8152equalsimpl0(i, Normal) ? "Normal" : m8152equalsimpl0(i, Italic) ? "Italic" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/FontStyle;", "values", "()Ljava/util/List;", "Normal", com.visa.cbp.getEncExpo.warmup, "getNormal-_-LCdwA", "()I", "getNormal-_-LCdwA$annotations", "Italic", "getItalic-_-LCdwA", "getItalic-_-LCdwA$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m8156getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m8157getNormal_LCdwA$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m8159getNormal_LCdwA() {
            return androidx.compose.ui.text.font.FontStyle.Normal;
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m8158getItalic_LCdwA() {
            return androidx.compose.ui.text.font.FontStyle.Italic;
        }

        public final java.util.List<androidx.compose.ui.text.font.FontStyle> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.font.FontStyle[]{androidx.compose.ui.text.font.FontStyle.m8149boximpl(m8159getNormal_LCdwA()), androidx.compose.ui.text.font.FontStyle.m8149boximpl(m8158getItalic_LCdwA())});
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8155unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8153hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8151equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8153hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8151equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.font.FontStyle) && i == ((androidx.compose.ui.text.font.FontStyle) obj).m8155unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.font.FontStyle m8149boximpl(int i) {
        return new androidx.compose.ui.text.font.FontStyle(i);
    }
}
