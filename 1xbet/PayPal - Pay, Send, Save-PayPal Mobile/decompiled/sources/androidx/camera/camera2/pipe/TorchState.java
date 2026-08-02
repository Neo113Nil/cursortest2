package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/TorchState;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TorchState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.TorchState.Companion INSTANCE = new androidx.camera.camera2.pipe.TorchState.Companion(null);
    private static final androidx.camera.camera2.pipe.TorchState ON = new androidx.camera.camera2.pipe.TorchState();
    private static final androidx.camera.camera2.pipe.TorchState OFF = new androidx.camera.camera2.pipe.TorchState();

    private TorchState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/TorchState$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/TorchState;", "ON", "Landroidx/camera/camera2/pipe/TorchState;", "getON", "()Landroidx/camera/camera2/pipe/TorchState;", "OFF", "getOFF"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.pipe.TorchState getON() {
            return androidx.camera.camera2.pipe.TorchState.ON;
        }

        public final androidx.camera.camera2.pipe.TorchState getOFF() {
            return androidx.camera.camera2.pipe.TorchState.OFF;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
