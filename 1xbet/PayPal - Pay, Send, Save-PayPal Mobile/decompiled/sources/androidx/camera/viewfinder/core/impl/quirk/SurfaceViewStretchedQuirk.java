package androidx.camera.viewfinder.core.impl.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/viewfinder/core/impl/quirk/SurfaceViewStretchedQuirk;", "Landroidx/camera/viewfinder/core/impl/quirk/Quirk;", "<init>", "()V", "", "load", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurfaceViewStretchedQuirk implements androidx.camera.viewfinder.core.impl.quirk.Quirk {
    public static final androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk INSTANCE = new androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk();

    private SurfaceViewStretchedQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return (kotlin.text.StringsKt.equals("SAMSUNG", android.os.Build.MANUFACTURER, true) && (kotlin.text.StringsKt.equals("F2Q", android.os.Build.DEVICE, true) || kotlin.text.StringsKt.equals("Q2Q", android.os.Build.DEVICE, true))) || (kotlin.text.StringsKt.equals("OPPO", android.os.Build.MANUFACTURER, true) && kotlin.text.StringsKt.equals("OP4E75L1", android.os.Build.DEVICE, true)) || (kotlin.text.StringsKt.equals("LENOVO", android.os.Build.MANUFACTURER, true) && kotlin.text.StringsKt.equals("Q706F", android.os.Build.DEVICE, true));
        }
        return false;
    }
}
