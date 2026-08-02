package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class PlaceholderVerticalAlign {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.PlaceholderVerticalAlign.Companion INSTANCE = new androidx.compose.ui.text.PlaceholderVerticalAlign.Companion(null);
    private static final int AboveBaseline = m7933constructorimpl(1);
    private static final int Top = m7933constructorimpl(2);
    private static final int Bottom = m7933constructorimpl(3);
    private static final int Center = m7933constructorimpl(4);
    private static final int TextTop = m7933constructorimpl(5);
    private static final int TextBottom = m7933constructorimpl(6);
    private static final int TextCenter = m7933constructorimpl(7);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7933constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7935equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String toString() {
        return m7937toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7937toStringimpl(int i) {
        return m7935equalsimpl0(i, AboveBaseline) ? "AboveBaseline" : m7935equalsimpl0(i, Top) ? "Top" : m7935equalsimpl0(i, Bottom) ? "Bottom" : m7935equalsimpl0(i, Center) ? "Center" : m7935equalsimpl0(i, TextTop) ? "TextTop" : m7935equalsimpl0(i, TextBottom) ? "TextBottom" : m7935equalsimpl0(i, TextCenter) ? "TextCenter" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "AboveBaseline", com.visa.cbp.getEncExpo.warmup, "getAboveBaseline-J6kI3mc", "()I", "Top", "getTop-J6kI3mc", "Bottom", "getBottom-J6kI3mc", "Center", "getCenter-J6kI3mc", "TextTop", "getTextTop-J6kI3mc", "TextBottom", "getTextBottom-J6kI3mc", "TextCenter", "getTextCenter-J6kI3mc"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m7939getAboveBaselineJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m7945getTopJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.Top;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m7940getBottomJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m7941getCenterJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m7944getTextTopJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m7942getTextBottomJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m7943getTextCenterJ6kI3mc() {
            return androidx.compose.ui.text.PlaceholderVerticalAlign.TextCenter;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m7936hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m7934equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7936hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7934equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.PlaceholderVerticalAlign) && i == ((androidx.compose.ui.text.PlaceholderVerticalAlign) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.PlaceholderVerticalAlign m7932boximpl(int i) {
        return new androidx.compose.ui.text.PlaceholderVerticalAlign(i);
    }
}
