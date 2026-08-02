package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureFailureAdapter;", "Landroidx/camera/core/impl/CameraCaptureFailure;", "Landroidx/camera/camera2/pipe/RequestFailure;", "requestFailure", "<init>", "(Landroidx/camera/camera2/pipe/RequestFailure;)V", "Landroid/hardware/camera2/CaptureFailure;", "getCaptureFailure", "()Landroid/hardware/camera2/CaptureFailure;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/RequestFailure;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureFailureAdapter extends androidx.camera.core.impl.CameraCaptureFailure {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.RequestFailure getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFailureAdapter(androidx.camera.camera2.pipe.RequestFailure requestFailure) {
        super(androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
        this.getHighSpeedVideoSizes = requestFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    public final android.hardware.camera2.CaptureFailure getCaptureFailure() {
        androidx.camera.camera2.pipe.RequestFailure requestFailure = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(requestFailure, "");
        java.lang.Object unwrapAs = ((androidx.camera.camera2.pipe.compat.AndroidCaptureFailure) requestFailure).unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.CaptureFailure.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(unwrapAs);
        return (android.hardware.camera2.CaptureFailure) unwrapAs;
    }
}
