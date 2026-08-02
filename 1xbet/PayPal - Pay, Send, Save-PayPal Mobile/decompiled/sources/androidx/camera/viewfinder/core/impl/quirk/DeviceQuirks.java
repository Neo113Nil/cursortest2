package androidx.camera.viewfinder.core.impl.quirk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u00020\b\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/viewfinder/core/impl/quirk/DeviceQuirks;", "", "<init>", "()V", "Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "T", "get", "()Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "", "contains", "()Z", "", "reload", "Landroidx/camera/viewfinder/core/impl/quirk/Quirks;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/core/impl/quirk/Quirks;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceQuirks {
    public static final androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks INSTANCE = new androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final androidx.camera.viewfinder.core.impl.quirk.Quirks getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.viewfinder.core.impl.quirk.Quirks(androidx.camera.viewfinder.core.impl.quirk.DeviceQuirksLoader.loadQuirks());

    private DeviceQuirks() {
    }

    public final /* synthetic */ <T extends androidx.camera.viewfinder.core.impl.quirk.Quirk> T get() {
        java.lang.Object obj;
        java.util.Iterator it = getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.Class<?> cls = ((androidx.camera.viewfinder.core.impl.quirk.Quirk) obj).getClass();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            if (cls == androidx.camera.viewfinder.core.impl.quirk.Quirk.class) {
                break;
            }
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        return (T) obj;
    }

    public final /* synthetic */ <T extends androidx.camera.viewfinder.core.impl.quirk.Quirk> boolean contains() {
        java.util.List<androidx.camera.viewfinder.core.impl.quirk.Quirk> list = getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (androidx.camera.viewfinder.core.impl.quirk.Quirk quirk : list) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (quirk instanceof androidx.camera.viewfinder.core.impl.quirk.Quirk) {
                return true;
            }
        }
        return false;
    }

    public final void reload() {
        getHighResolutionOutputSizeshNQ4ISI.reset(androidx.camera.viewfinder.core.impl.quirk.DeviceQuirksLoader.loadQuirks());
    }
}
