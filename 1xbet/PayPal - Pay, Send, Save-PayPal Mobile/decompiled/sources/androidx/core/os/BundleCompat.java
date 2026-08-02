package androidx.core.os;

/* loaded from: classes3.dex */
public final class BundleCompat {
    private BundleCompat() {
    }

    public static <T> T getParcelable(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.core.os.BundleCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static android.os.Parcelable[] getParcelableArray(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends android.os.Parcelable> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (android.os.Parcelable[]) androidx.core.os.BundleCompat.Api33Impl.Camera2StreamConfigurationMap(bundle, str, cls);
        }
        return bundle.getParcelableArray(str);
    }

    public static <T> java.util.ArrayList<T> getParcelableArrayList(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.BundleCompat.Api33Impl.getHighSpeedVideoFpsRangesFor(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    public static <T> android.util.SparseArray<T> getSparseParcelableArray(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.BundleCompat.Api33Impl.getHighSpeedVideoFpsRanges(bundle, str, cls);
        }
        return bundle.getSparseParcelableArray(str);
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

    public static <T extends java.io.Serializable> T getSerializable(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.core.os.BundleCompat.Api33Impl.getHighSpeedVideoSizes(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T> T getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> T[] Camera2StreamConfigurationMap(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        static <T> java.util.ArrayList<T> getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        static <T> android.util.SparseArray<T> getHighSpeedVideoFpsRanges(android.os.Bundle bundle, java.lang.String str, java.lang.Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }

        static <T extends java.io.Serializable> T getHighSpeedVideoSizes(android.os.Bundle bundle, java.lang.String str, java.lang.Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }
    }
}
