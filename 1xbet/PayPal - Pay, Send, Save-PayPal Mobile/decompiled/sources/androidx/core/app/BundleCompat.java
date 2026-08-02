package androidx.core.app;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class BundleCompat {
    private BundleCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.getBinder(key)")
    @java.lang.Deprecated
    public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
        return bundle.getBinder(str);
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.putBinder(key, binder)")
    @java.lang.Deprecated
    public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
