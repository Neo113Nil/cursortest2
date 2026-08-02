package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroid/view/Surface;", "surface", "", "addSurface", "(Landroid/view/Surface;)V", "removeSurface", "getSurface", "()Landroid/view/Surface;", "", "getSurfaces", "()Ljava/util/List;", "surfaces", "Landroidx/camera/camera2/pipe/CameraId;", "getPhysicalCameraId-1LO98Z0", "()Ljava/lang/String;", "physicalCameraId", "", "getSurfaceSharing", "()Z", "surfaceSharing", "", "getMaxSharedSurfaceCount", "()I", "maxSharedSurfaceCount", "getSurfaceGroupId", "surfaceGroupId", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OutputConfigurationWrapper extends androidx.camera.camera2.pipe.UnsafeWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper.Companion INSTANCE = androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper.Companion.getHighSpeedVideoFpsRangesFor;
    public static final int SURFACE_GROUP_ID_NONE = -1;

    void addSurface(android.view.Surface surface);

    int getMaxSharedSurfaceCount();

    /* renamed from: getPhysicalCameraId-1LO98Z0 */
    java.lang.String mo770getPhysicalCameraId1LO98Z0();

    android.view.Surface getSurface();

    int getSurfaceGroupId();

    boolean getSurfaceSharing();

    java.util.List<android.view.Surface> getSurfaces();

    void removeSurface(android.view.Surface surface);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper$Companion;", "", "<init>", "()V", "", "SURFACE_GROUP_ID_NONE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final int SURFACE_GROUP_ID_NONE = -1;
        static final /* synthetic */ androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper.Companion getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper.Companion();

        private Companion() {
        }
    }
}
