package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\t\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(III)I", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(int i) {
        return (i >> 16) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(int i) {
        return (i >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoSizes(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }
}
