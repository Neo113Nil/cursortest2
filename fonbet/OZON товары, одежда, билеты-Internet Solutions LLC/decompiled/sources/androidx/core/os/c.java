package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes8.dex */
    static class a {
        static <T> T a(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> T[] b(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        static <T> ArrayList<T> c(@NonNull Bundle bundle, String str, @NonNull Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        static <T extends Serializable> T d(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        static <T> SparseArray<T> e(@NonNull Bundle bundle, String str, @NonNull Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    public static <T> T a(@NonNull Bundle bundle, String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t2 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }

    public static Serializable b(@NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.d(bundle, "params", Serializable.class);
        }
        Serializable serializable = bundle.getSerializable("params");
        if (Serializable.class.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }
}
