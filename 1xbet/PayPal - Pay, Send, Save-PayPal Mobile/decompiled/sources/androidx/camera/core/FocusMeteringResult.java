package androidx.camera.core;

/* loaded from: classes6.dex */
public final class FocusMeteringResult {
    private boolean getHighSpeedVideoSizes;

    public static androidx.camera.core.FocusMeteringResult emptyInstance() {
        return new androidx.camera.core.FocusMeteringResult(false);
    }

    public static androidx.camera.core.FocusMeteringResult create(boolean z) {
        return new androidx.camera.core.FocusMeteringResult(z);
    }

    private FocusMeteringResult(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public final boolean isFocusSuccessful() {
        return this.getHighSpeedVideoSizes;
    }
}
