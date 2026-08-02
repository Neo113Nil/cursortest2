package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType;", "", "", "p0", "getHighSpeedVideoSizes", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class PointerType {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.pointer.PointerType.Companion INSTANCE = new androidx.compose.ui.input.pointer.PointerType.Companion(null);
    private static final int Unknown = getHighSpeedVideoSizes(0);
    private static final int Touch = getHighSpeedVideoSizes(1);
    private static final int Mouse = getHighSpeedVideoSizes(2);
    private static final int Stylus = getHighSpeedVideoSizes(3);
    private static final int Eraser = getHighSpeedVideoSizes(4);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7299equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighSpeedVideoSizes(int i) {
        return i;
    }

    private /* synthetic */ PointerType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m7301toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7301toStringimpl(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i == 3) {
            return "Stylus";
        }
        if (i == 4) {
            return "Eraser";
        }
        return "Unknown";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerType;", "Unknown", com.visa.cbp.getEncExpo.warmup, "getUnknown-T8wyACA", "()I", "Touch", "getTouch-T8wyACA", "Mouse", "getMouse-T8wyACA", "Stylus", "getStylus-T8wyACA", "Eraser", "getEraser-T8wyACA"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m7307getUnknownT8wyACA() {
            return androidx.compose.ui.input.pointer.PointerType.Unknown;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m7306getTouchT8wyACA() {
            return androidx.compose.ui.input.pointer.PointerType.Touch;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m7304getMouseT8wyACA() {
            return androidx.compose.ui.input.pointer.PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m7305getStylusT8wyACA() {
            return androidx.compose.ui.input.pointer.PointerType.Stylus;
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m7303getEraserT8wyACA() {
            return androidx.compose.ui.input.pointer.PointerType.Eraser;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m7300hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m7298equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7300hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7298equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.pointer.PointerType) && i == ((androidx.compose.ui.input.pointer.PointerType) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.pointer.PointerType m7297boximpl(int i) {
        return new androidx.compose.ui.input.pointer.PointerType(i);
    }
}
