package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0004*\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "Camera2StreamConfigurationMap", "([F)I", "", "toInt", "(Z)I", "Landroidx/compose/ui/unit/IntOffset;", "(J)Z", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectManagerKt {
    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(long j) {
        return !androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(j, androidx.compose.ui.unit.IntOffset.INSTANCE.m8739getMaxnOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }
}
