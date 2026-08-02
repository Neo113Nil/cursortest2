package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/VertexMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class VertexMode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.VertexMode.Companion INSTANCE = new androidx.compose.ui.graphics.VertexMode.Companion(null);
    private static final int Triangles = m6381constructorimpl(0);
    private static final int TriangleStrip = m6381constructorimpl(1);
    private static final int TriangleFan = m6381constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6381constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6383equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ VertexMode(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/VertexMode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/VertexMode;", "Triangles", com.visa.cbp.getEncExpo.warmup, "getTriangles-c2xauaI", "()I", "TriangleStrip", "getTriangleStrip-c2xauaI", "TriangleFan", "getTriangleFan-c2xauaI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m6389getTrianglesc2xauaI() {
            return androidx.compose.ui.graphics.VertexMode.Triangles;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m6388getTriangleStripc2xauaI() {
            return androidx.compose.ui.graphics.VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m6387getTriangleFanc2xauaI() {
            return androidx.compose.ui.graphics.VertexMode.TriangleFan;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m6385toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6385toStringimpl(int i) {
        return m6383equalsimpl0(i, Triangles) ? "Triangles" : m6383equalsimpl0(i, TriangleStrip) ? "TriangleStrip" : m6383equalsimpl0(i, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m6384hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m6382equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6384hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6382equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.VertexMode) && i == ((androidx.compose.ui.graphics.VertexMode) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.VertexMode m6380boximpl(int i) {
        return new androidx.compose.ui.graphics.VertexMode(i);
    }
}
