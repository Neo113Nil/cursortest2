package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/CompositingStrategy;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class CompositingStrategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.CompositingStrategy.Companion INSTANCE = new androidx.compose.ui.graphics.CompositingStrategy.Companion(null);
    private static final int Auto = m6074constructorimpl(0);
    private static final int Offscreen = m6074constructorimpl(1);
    private static final int ModulateAlpha = m6074constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6074constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6076equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ CompositingStrategy(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/CompositingStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/CompositingStrategy;", "Auto", com.visa.cbp.getEncExpo.warmup, "getAuto--NrFUSI", "()I", "Offscreen", "getOffscreen--NrFUSI", "ModulateAlpha", "getModulateAlpha--NrFUSI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m6080getAutoNrFUSI() {
            return androidx.compose.ui.graphics.CompositingStrategy.Auto;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m6082getOffscreenNrFUSI() {
            return androidx.compose.ui.graphics.CompositingStrategy.Offscreen;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m6081getModulateAlphaNrFUSI() {
            return androidx.compose.ui.graphics.CompositingStrategy.ModulateAlpha;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m6078toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m6077hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m6075equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6078toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompositingStrategy(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6077hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6075equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.CompositingStrategy) && i == ((androidx.compose.ui.graphics.CompositingStrategy) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.CompositingStrategy m6073boximpl(int i) {
        return new androidx.compose.ui.graphics.CompositingStrategy(i);
    }
}
