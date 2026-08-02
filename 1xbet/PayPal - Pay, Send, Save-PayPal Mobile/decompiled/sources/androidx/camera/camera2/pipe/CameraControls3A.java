package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001Jo\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¢\u0006\u0004\b\u000f\u0010\u0010Jo\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraControls3A;", "", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "update3A", "submit3A-ydBZfZg", "submit3A", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraControls3A {
    /* renamed from: setTorchOff-NqN7i0k, reason: not valid java name */
    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo277setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode);

    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn();

    /* renamed from: submit3A-ydBZfZg, reason: not valid java name */
    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo278submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions);

    /* renamed from: update3A-ydBZfZg, reason: not valid java name */
    kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo279update3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: update3A-ydBZfZg$default, reason: not valid java name */
    static /* synthetic */ kotlinx.coroutines.Deferred m276update3AydBZfZg$default(androidx.camera.camera2.pipe.CameraControls3A cameraControls3A, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update3A-ydBZfZg");
        }
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = null;
        }
        return cameraControls3A.mo279update3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: submit3A-ydBZfZg$default, reason: not valid java name */
    static /* synthetic */ kotlinx.coroutines.Deferred m275submit3AydBZfZg$default(androidx.camera.camera2.pipe.CameraControls3A cameraControls3A, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit3A-ydBZfZg");
        }
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = null;
        }
        return cameraControls3A.mo278submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    /* renamed from: setTorchOff-NqN7i0k$default, reason: not valid java name */
    static /* synthetic */ kotlinx.coroutines.Deferred m274setTorchOffNqN7i0k$default(androidx.camera.camera2.pipe.CameraControls3A cameraControls3A, androidx.camera.camera2.pipe.AeMode aeMode, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTorchOff-NqN7i0k");
        }
        if ((i & 1) != 0) {
            aeMode = null;
        }
        return cameraControls3A.mo277setTorchOffNqN7i0k(aeMode);
    }
}
