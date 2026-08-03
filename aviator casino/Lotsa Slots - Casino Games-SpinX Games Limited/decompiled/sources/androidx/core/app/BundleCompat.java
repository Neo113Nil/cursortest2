package androidx.core.app;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class BundleCompat {
    private BundleCompat() {
    }

    public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
        return bundle.getBinder(str);
    }

    public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
