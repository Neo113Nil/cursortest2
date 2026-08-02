package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class CompositingStrategy {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.layer.CompositingStrategy.Companion INSTANCE = new androidx.compose.ui.graphics.layer.CompositingStrategy.Companion(null);
    private static final int Auto = m6605constructorimpl(0);
    private static final int Offscreen = m6605constructorimpl(1);
    private static final int ModulateAlpha = m6605constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6605constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6607equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ CompositingStrategy(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/CompositingStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "Auto", com.visa.cbp.getEncExpo.warmup, "getAuto-ke2Ky5w", "()I", "Offscreen", "getOffscreen-ke2Ky5w", "ModulateAlpha", "getModulateAlpha-ke2Ky5w"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m6611getAutoke2Ky5w() {
            return androidx.compose.ui.graphics.layer.CompositingStrategy.Auto;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m6613getOffscreenke2Ky5w() {
            return androidx.compose.ui.graphics.layer.CompositingStrategy.Offscreen;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m6612getModulateAlphake2Ky5w() {
            return androidx.compose.ui.graphics.layer.CompositingStrategy.ModulateAlpha;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return m6609toStringimpl(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return m6608hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m6606equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6609toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompositingStrategy(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6608hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6606equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.layer.CompositingStrategy) && i == ((androidx.compose.ui.graphics.layer.CompositingStrategy) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.layer.CompositingStrategy m6604boximpl(int i) {
        return new androidx.compose.ui.graphics.layer.CompositingStrategy(i);
    }
}
