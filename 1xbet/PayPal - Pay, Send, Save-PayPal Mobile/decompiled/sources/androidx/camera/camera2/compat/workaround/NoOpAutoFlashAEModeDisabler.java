package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/compat/workaround/NoOpAutoFlashAEModeDisabler;", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "<init>", "()V", "", "aeMode", "getCorrectedAeMode", "(I)I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpAutoFlashAEModeDisabler implements androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler {
    public static final androidx.camera.camera2.compat.workaround.NoOpAutoFlashAEModeDisabler INSTANCE = new androidx.camera.camera2.compat.workaround.NoOpAutoFlashAEModeDisabler();

    @Override // androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler
    public final int getCorrectedAeMode(int aeMode) {
        return aeMode;
    }

    private NoOpAutoFlashAEModeDisabler() {
    }
}
