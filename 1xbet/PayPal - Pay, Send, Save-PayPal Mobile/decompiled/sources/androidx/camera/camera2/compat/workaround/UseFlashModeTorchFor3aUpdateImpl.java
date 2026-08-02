package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdateImpl;", "Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;", "<init>", "()V", "", "shouldUseFlashModeTorch", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UseFlashModeTorchFor3aUpdateImpl implements androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate {
    public static final androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdateImpl INSTANCE = new androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdateImpl();

    @Override // androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate
    public final boolean shouldUseFlashModeTorch() {
        return true;
    }

    private UseFlashModeTorchFor3aUpdateImpl() {
    }
}
