package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "", "p0", "Camera2StreamConfigurationMap", "([I)[I", "", "getHighSpeedVideoFpsRangesFor", "([II)I", "p1", "", "([III)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "[I", "getHighSpeedVideoSizes", "([I)I", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class CenteredArray {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int[] Camera2StreamConfigurationMap;

    public static int[] Camera2StreamConfigurationMap(int[] iArr) {
        return iArr;
    }

    private static final int getHighSpeedVideoSizes(int[] iArr) {
        return iArr.length / 2;
    }

    public static final int getHighSpeedVideoFpsRangesFor(int[] iArr, int i) {
        return iArr[i + getHighSpeedVideoSizes(iArr)];
    }

    public static final void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, int i2) {
        iArr[i + getHighSpeedVideoSizes(iArr)] = i2;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    private /* synthetic */ int[] getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object p0) {
        return getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, p0);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CenteredArray(data=");
        sb.append(java.util.Arrays.toString(iArr));
        sb.append(')');
        return sb.toString();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
        return java.util.Arrays.hashCode(iArr);
    }

    private static boolean getHighSpeedVideoSizes(int[] iArr, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.node.CenteredArray) && kotlin.jvm.internal.Intrinsics.areEqual(iArr, ((androidx.compose.ui.node.CenteredArray) obj).getCamera2StreamConfigurationMap());
    }
}
