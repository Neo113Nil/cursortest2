package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextOverflow;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextOverflow {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextOverflow.Companion INSTANCE = new androidx.compose.ui.text.style.TextOverflow.Companion(null);
    private static final int Clip = m8489constructorimpl(1);
    private static final int Ellipsis = m8489constructorimpl(2);
    private static final int Visible = m8489constructorimpl(3);
    private static final int StartEllipsis = m8489constructorimpl(4);
    private static final int MiddleEllipsis = m8489constructorimpl(5);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8489constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8491equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ TextOverflow(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String toString() {
        return m8493toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8493toStringimpl(int i) {
        return m8491equalsimpl0(i, Clip) ? "Clip" : m8491equalsimpl0(i, Ellipsis) ? "Ellipsis" : m8491equalsimpl0(i, MiddleEllipsis) ? "MiddleEllipsis" : m8491equalsimpl0(i, Visible) ? com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE : m8491equalsimpl0(i, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/TextOverflow$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextOverflow;", "Clip", com.visa.cbp.getEncExpo.warmup, "getClip-gIe3tQ8", "()I", "getClip-gIe3tQ8$annotations", "Ellipsis", "getEllipsis-gIe3tQ8", "getEllipsis-gIe3tQ8$annotations", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "getVisible-gIe3tQ8", "getVisible-gIe3tQ8$annotations", "StartEllipsis", "getStartEllipsis-gIe3tQ8", "getStartEllipsis-gIe3tQ8$annotations", "MiddleEllipsis", "getMiddleEllipsis-gIe3tQ8", "getMiddleEllipsis-gIe3tQ8$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m8495getClipgIe3tQ8$annotations() {
        }

        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m8496getEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m8497getMiddleEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m8498getStartEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m8499getVisiblegIe3tQ8$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m8500getClipgIe3tQ8() {
            return androidx.compose.ui.text.style.TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m8501getEllipsisgIe3tQ8() {
            return androidx.compose.ui.text.style.TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m8504getVisiblegIe3tQ8() {
            return androidx.compose.ui.text.style.TextOverflow.Visible;
        }

        /* renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m8503getStartEllipsisgIe3tQ8() {
            return androidx.compose.ui.text.style.TextOverflow.StartEllipsis;
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m8502getMiddleEllipsisgIe3tQ8() {
            return androidx.compose.ui.text.style.TextOverflow.MiddleEllipsis;
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
        return m8492hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m8490equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8492hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8490equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.TextOverflow) && i == ((androidx.compose.ui.text.style.TextOverflow) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.TextOverflow m8488boximpl(int i) {
        return new androidx.compose.ui.text.style.TextOverflow(i);
    }
}
