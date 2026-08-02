package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015\u0088\u0001\u0017\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "", "p0", "getHighSpeedVideoFpsRangesFor", "([I)[I", "Landroidx/compose/ui/node/IntStack;", "", "getHighResolutionOutputSizeshNQ4ISI", "([ILandroidx/compose/ui/node/IntStack;)V", "", "getHighSpeedVideoSizes", "([I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "[I", "getHighSpeedVideoFpsRanges", "([I)Z", "Camera2StreamConfigurationMap", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class Snake {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoFpsRanges;

    public static int[] getHighSpeedVideoFpsRangesFor(int[] iArr) {
        return iArr;
    }

    private static java.lang.String getHighSpeedVideoSizes(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(iArr[1]);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(iArr[2]);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(iArr[3]);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(iArr[4] != 0);
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    private static final boolean Camera2StreamConfigurationMap(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static final void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, androidx.compose.ui.node.IntStack intStack) {
        int i;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (getHighResolutionOutputSizeshNQ4ISI(iArr)) {
            i = java.lang.Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i2 += ((iArr[4] != 0 ? 1 : 0) | (Camera2StreamConfigurationMap(iArr) ? 1 : 0)) ^ 1;
            i3 += ((!Camera2StreamConfigurationMap(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            i = iArr[2] - iArr[0];
        }
        intStack.getHighSpeedVideoFpsRanges(i2, i3, i);
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    private /* synthetic */ int[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, p0);
    }

    private static int getHighSpeedVideoFpsRanges(int[] iArr) {
        return java.util.Arrays.hashCode(iArr);
    }

    private static boolean getHighSpeedVideoFpsRanges(int[] iArr, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.node.Snake) && kotlin.jvm.internal.Intrinsics.areEqual(iArr, ((androidx.compose.ui.node.Snake) obj).getGetHighSpeedVideoFpsRanges());
    }
}
