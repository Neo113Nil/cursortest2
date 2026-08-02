package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/viewfinder/core/ViewfinderDefaults;", "", "<init>", "()V", "Landroidx/camera/viewfinder/core/ImplementationMode;", "getImplementationMode", "()Landroidx/camera/viewfinder/core/ImplementationMode;", "getImplementationMode$annotations", "implementationMode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderDefaults {
    public static final androidx.camera.viewfinder.core.ViewfinderDefaults INSTANCE = new androidx.camera.viewfinder.core.ViewfinderDefaults();

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getImplementationMode$annotations() {
    }

    private ViewfinderDefaults() {
    }

    public static final androidx.camera.viewfinder.core.ImplementationMode getImplementationMode() {
        return androidx.camera.viewfinder.core.impl.ImplementationModeCompat.INSTANCE.chooseCompatibleMode();
    }
}
