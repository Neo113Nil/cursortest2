package androidx.camera.viewfinder.core.impl.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/viewfinder/core/impl/quirk/SurfaceViewNotCroppedByParentQuirk;", "Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "<init>", "()V", "", "load", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurfaceViewNotCroppedByParentQuirk implements androidx.camera.viewfinder.core.impl.quirk.Quirk {
    public static final androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk INSTANCE = new androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk();

    private SurfaceViewNotCroppedByParentQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return kotlin.text.StringsKt.equals("XIAOMI", android.os.Build.MANUFACTURER, true) && kotlin.text.StringsKt.equals("M2101K7AG", android.os.Build.MODEL, true);
    }
}
