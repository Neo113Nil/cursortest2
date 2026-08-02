package androidx.compose.ui.input.indirect;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.Companion INSTANCE = new androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.Companion(null);
    private static final int None = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private final int getHighSpeedVideoSizes;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6756equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-nZO2Niw", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "getX-nZO2Niw", "Y", "getY-nZO2Niw"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m6760getNonenZO2Niw() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m6761getXnZO2Niw() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m6762getYnZO2Niw() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m6758toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m6757hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m6755equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6758toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndirectPointerEventPrimaryDirectionalMotionAxis(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6757hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6755equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis) && i == ((androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis m6754boximpl(int i) {
        return new androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis(i);
    }
}
