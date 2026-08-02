package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/GroupKind;", "", "", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class GroupKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.GroupKind.Companion INSTANCE = new androidx.compose.runtime.GroupKind.Companion(null);
    private static final int Group = getHighSpeedVideoFpsRanges(0);
    private static final int Node = getHighSpeedVideoFpsRanges(1);
    private static final int ReusableNode = getHighSpeedVideoFpsRanges(2);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    private static int getHighSpeedVideoFpsRanges(int i) {
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/GroupKind;", "Group", com.visa.cbp.getEncExpo.warmup, "getGroup-ULZAiWs", "()I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m5243getGroupULZAiWs() {
            return androidx.compose.runtime.GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m5244getNodeULZAiWs() {
            return androidx.compose.runtime.GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m5245getReusableNodeULZAiWs() {
            return androidx.compose.runtime.GroupKind.ReusableNode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    private /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        return getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, p0);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupKind(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        return java.lang.Integer.hashCode(i);
    }

    private static boolean getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.GroupKind) && i == ((androidx.compose.runtime.GroupKind) obj).getCamera2StreamConfigurationMap();
    }
}
