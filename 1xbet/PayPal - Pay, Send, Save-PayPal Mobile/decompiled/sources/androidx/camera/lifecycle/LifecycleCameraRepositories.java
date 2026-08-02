package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u0003R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/lifecycle/LifecycleCameraRepositories;", "", "<init>", "()V", "", "deviceId", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "getInstance$camera_lifecycle", "(I)Landroidx/camera/lifecycle/LifecycleCameraRepository;", "", "clear$camera_lifecycle", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleCameraRepositories {
    public static final androidx.camera.lifecycle.LifecycleCameraRepositories INSTANCE = new androidx.camera.lifecycle.LifecycleCameraRepositories();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.Integer, androidx.camera.lifecycle.LifecycleCameraRepository> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

    private LifecycleCameraRepositories() {
    }

    public static /* synthetic */ androidx.camera.lifecycle.LifecycleCameraRepository getInstance$camera_lifecycle$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.camera.core.impl.utils.ContextUtil.getDefaultDeviceId();
        }
        return getInstance$camera_lifecycle(i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.lifecycle.LifecycleCameraRepository getInstance$camera_lifecycle(int deviceId) {
        androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository;
        java.util.Map<java.lang.Integer, androidx.camera.lifecycle.LifecycleCameraRepository> map = getHighSpeedVideoFpsRangesFor;
        synchronized (map) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(deviceId);
            androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository2 = map.get(valueOf);
            if (lifecycleCameraRepository2 == null) {
                lifecycleCameraRepository2 = new androidx.camera.lifecycle.LifecycleCameraRepository(deviceId);
                map.put(valueOf, lifecycleCameraRepository2);
            }
            lifecycleCameraRepository = lifecycleCameraRepository2;
        }
        return lifecycleCameraRepository;
    }

    public final void clear$camera_lifecycle() {
        java.util.Map<java.lang.Integer, androidx.camera.lifecycle.LifecycleCameraRepository> map = getHighSpeedVideoFpsRangesFor;
        synchronized (map) {
            map.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
