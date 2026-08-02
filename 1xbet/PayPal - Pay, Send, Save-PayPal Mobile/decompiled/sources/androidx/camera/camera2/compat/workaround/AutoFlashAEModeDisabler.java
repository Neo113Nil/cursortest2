package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "", "", "aeMode", "getCorrectedAeMode", "(I)I", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutoFlashAEModeDisabler {
    int getCorrectedAeMode(int aeMode);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler$Bindings;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler.Bindings.Companion INSTANCE = new androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler.Bindings.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler$Bindings$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;", "provideAEModeDisabler", "(Landroidx/camera/camera2/compat/quirk/CameraQuirks;)Landroidx/camera/camera2/compat/workaround/AutoFlashAEModeDisabler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @dagger.Provides
            public final androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler provideAEModeDisabler(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
                boolean contains = cameraQuirks.getQuirks().contains(androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class);
                if (androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null || contains) {
                    return androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisablerImpl.INSTANCE;
                }
                return androidx.camera.camera2.compat.workaround.NoOpAutoFlashAEModeDisabler.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
