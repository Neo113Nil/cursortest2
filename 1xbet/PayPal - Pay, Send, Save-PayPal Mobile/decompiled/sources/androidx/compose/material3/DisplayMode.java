package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/material3/DisplayMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class DisplayMode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.DisplayMode.Companion INSTANCE = new androidx.compose.material3.DisplayMode.Companion(null);
    private static final int Picker = m3232constructorimpl(0);
    private static final int Input = m3232constructorimpl(1);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3232constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3234equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ DisplayMode(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/material3/DisplayMode$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/DisplayMode;", "Picker", com.visa.cbp.getEncExpo.warmup, "getPicker-jFl-4v0", "()I", "Input", "getInput-jFl-4v0"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getPicker-jFl-4v0, reason: not valid java name */
        public final int m3239getPickerjFl4v0() {
            return androidx.compose.material3.DisplayMode.Picker;
        }

        /* renamed from: getInput-jFl-4v0, reason: not valid java name */
        public final int m3238getInputjFl4v0() {
            return androidx.compose.material3.DisplayMode.Input;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m3236toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m3236toStringimpl(int i) {
        return m3234equalsimpl0(i, Picker) ? "Picker" : m3234equalsimpl0(i, Input) ? "Input" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m3235hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m3233equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3235hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3233equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.DisplayMode) && i == ((androidx.compose.material3.DisplayMode) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.DisplayMode m3231boximpl(int i) {
        return new androidx.compose.material3.DisplayMode(i);
    }
}
