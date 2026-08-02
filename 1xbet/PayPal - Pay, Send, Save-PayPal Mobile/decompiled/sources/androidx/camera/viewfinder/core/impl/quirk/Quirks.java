package androidx.camera.viewfinder.core.impl.quirk;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/viewfinder/core/impl/quirk/Quirks;", "", "", "Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "quirks", "<init>", "(Ljava/util/List;)V", "T", "get", "()Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "", "contains", "()Z", "", "reset", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Quirks {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.viewfinder.core.impl.quirk.Quirk> Camera2StreamConfigurationMap;

    public Quirks(java.util.List<? extends androidx.camera.viewfinder.core.impl.quirk.Quirk> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
    }

    public final /* synthetic */ <T extends androidx.camera.viewfinder.core.impl.quirk.Quirk> T get() {
        java.lang.Object obj;
        java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
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
        java.util.List<androidx.camera.viewfinder.core.impl.quirk.Quirk> list = this.Camera2StreamConfigurationMap;
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

    public final void reset(java.util.List<? extends androidx.camera.viewfinder.core.impl.quirk.Quirk> quirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quirks, "");
        this.Camera2StreamConfigurationMap.clear();
        this.Camera2StreamConfigurationMap.addAll(quirks);
    }
}
