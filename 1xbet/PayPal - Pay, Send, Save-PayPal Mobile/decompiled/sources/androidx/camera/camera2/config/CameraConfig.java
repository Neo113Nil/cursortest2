package androidx.camera.camera2.config;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/config/CameraConfig;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "provideCameraConfig", "()Landroidx/camera/camera2/config/CameraConfig;", "Ljava/lang/String;", "getCameraId-Dz_R5H8", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public final class CameraConfig {
    private final java.lang.String cameraId;

    @dagger.Provides
    public final androidx.camera.camera2.config.CameraConfig provideCameraConfig() {
        return this;
    }

    private CameraConfig(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.cameraId = str;
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public final java.lang.String getCameraId() {
        return this.cameraId;
    }

    public /* synthetic */ CameraConfig(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
