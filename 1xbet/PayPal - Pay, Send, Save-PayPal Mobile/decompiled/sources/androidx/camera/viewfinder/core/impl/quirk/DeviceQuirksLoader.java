package androidx.camera.viewfinder.core.impl.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/camera/viewfinder/core/impl/quirk/DeviceQuirksLoader;", "", "<init>", "()V", "", "Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "loadQuirks", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceQuirksLoader {
    public static final androidx.camera.viewfinder.core.impl.quirk.DeviceQuirksLoader INSTANCE = new androidx.camera.viewfinder.core.impl.quirk.DeviceQuirksLoader();

    private DeviceQuirksLoader() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<androidx.camera.viewfinder.core.impl.quirk.Quirk> loadQuirks() {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk.load()) {
            createListBuilder.add(androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk.INSTANCE);
        }
        if (androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk.load()) {
            createListBuilder.add(androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk.INSTANCE);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
