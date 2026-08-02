package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "", "p0", "Camera2StreamConfigurationMap", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "node", "", "canFocus-impl$ui", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "canFocus", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Focusability {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.focus.Focusability.Companion INSTANCE = new androidx.compose.ui.focus.Focusability.Companion(null);
    private static final int Always = Camera2StreamConfigurationMap(1);
    private static final int SystemDefined = Camera2StreamConfigurationMap(0);
    private static final int Never = Camera2StreamConfigurationMap(2);

    private static int Camera2StreamConfigurationMap(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5688equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/Focusability;", "Always", com.visa.cbp.getEncExpo.warmup, "getAlways-LCbbffg", "()I", "SystemDefined", "getSystemDefined-LCbbffg", "Never", "getNever-LCbbffg"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m5692getAlwaysLCbbffg() {
            return androidx.compose.ui.focus.Focusability.Always;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m5694getSystemDefinedLCbbffg() {
            return androidx.compose.ui.focus.Focusability.SystemDefined;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m5693getNeverLCbbffg() {
            return androidx.compose.ui.focus.Focusability.Never;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Focusability(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String toString() {
        return m5690toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5690toStringimpl(int i) {
        if (m5688equalsimpl0(i, Always)) {
            return "Always";
        }
        if (m5688equalsimpl0(i, SystemDefined)) {
            return "SystemDefined";
        }
        if (m5688equalsimpl0(i, Never)) {
            return "Never";
        }
        throw new java.lang.IllegalStateException("Unknown Focusability".toString());
    }

    /* renamed from: canFocus-impl$ui, reason: not valid java name */
    public static final boolean m5686canFocusimpl$ui(int i, androidx.compose.ui.node.CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m5688equalsimpl0(i, Always)) {
            return true;
        }
        if (m5688equalsimpl0(i, SystemDefined)) {
            return !androidx.compose.ui.input.InputMode.m6741equalsimpl0(((androidx.compose.ui.input.InputModeManager) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalInputModeManager())).mo6747getInputModeaOaMEAU(), androidx.compose.ui.input.InputMode.INSTANCE.m6746getTouchaOaMEAU());
        }
        if (m5688equalsimpl0(i, Never)) {
            return false;
        }
        throw new java.lang.IllegalStateException("Unknown Focusability".toString());
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m5689hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m5687equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5689hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5687equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.focus.Focusability) && i == ((androidx.compose.ui.focus.Focusability) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.focus.Focusability m5685boximpl(int i) {
        return new androidx.compose.ui.focus.Focusability(i);
    }
}
