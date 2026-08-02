package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.FilterQuality.Companion INSTANCE = new androidx.compose.ui.graphics.FilterQuality.Companion(null);
    private static final int None = m6084constructorimpl(0);
    private static final int Low = m6084constructorimpl(1);
    private static final int Medium = m6084constructorimpl(2);
    private static final int High = m6084constructorimpl(3);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6084constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6086equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/FilterQuality$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/FilterQuality;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-f-v9h1I", "()I", "Low", "getLow-f-v9h1I", "Medium", "getMedium-f-v9h1I", "High", "getHigh-f-v9h1I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m6093getNonefv9h1I() {
            return androidx.compose.ui.graphics.FilterQuality.None;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m6091getLowfv9h1I() {
            return androidx.compose.ui.graphics.FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m6092getMediumfv9h1I() {
            return androidx.compose.ui.graphics.FilterQuality.Medium;
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m6090getHighfv9h1I() {
            return androidx.compose.ui.graphics.FilterQuality.High;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m6088toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6088toStringimpl(int i) {
        return m6086equalsimpl0(i, None) ? com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE : m6086equalsimpl0(i, Low) ? "Low" : m6086equalsimpl0(i, Medium) ? "Medium" : m6086equalsimpl0(i, High) ? "High" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6089unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m6087hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m6085equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6087hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6085equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.FilterQuality) && i == ((androidx.compose.ui.graphics.FilterQuality) obj).m6089unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.FilterQuality m6083boximpl(int i) {
        return new androidx.compose.ui.graphics.FilterQuality(i);
    }
}
