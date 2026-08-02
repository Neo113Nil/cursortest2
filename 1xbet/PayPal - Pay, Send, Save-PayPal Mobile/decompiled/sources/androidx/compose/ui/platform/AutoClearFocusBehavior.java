package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0013\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/compose/ui/platform/AutoClearFocusBehavior;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class AutoClearFocusBehavior {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.AutoClearFocusBehavior.Companion INSTANCE = new androidx.compose.ui.platform.AutoClearFocusBehavior.Companion(null);
    private static final int None = 0;
    private static final int CursorBased = 1;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7723equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/AutoClearFocusBehavior$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AutoClearFocusBehavior;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-4UtRPd4", "()I", "CursorBased", "getCursorBased-4UtRPd4", "getDefault-4UtRPd4", "Default"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-4UtRPd4, reason: not valid java name */
        public final int m7729getNone4UtRPd4() {
            return androidx.compose.ui.platform.AutoClearFocusBehavior.None;
        }

        /* renamed from: getCursorBased-4UtRPd4, reason: not valid java name */
        public final int m7727getCursorBased4UtRPd4() {
            return androidx.compose.ui.platform.AutoClearFocusBehavior.CursorBased;
        }

        /* renamed from: getDefault-4UtRPd4, reason: not valid java name */
        public final int m7728getDefault4UtRPd4() {
            return m7727getCursorBased4UtRPd4();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ AutoClearFocusBehavior(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m7725toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m7724hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        return m7722equalsimpl(this.getHighSpeedVideoFpsRanges, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7725toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoClearFocusBehavior(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7724hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7722equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.platform.AutoClearFocusBehavior) && i == ((androidx.compose.ui.platform.AutoClearFocusBehavior) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.platform.AutoClearFocusBehavior m7721boximpl(int i) {
        return new androidx.compose.ui.platform.AutoClearFocusBehavior(i);
    }
}
