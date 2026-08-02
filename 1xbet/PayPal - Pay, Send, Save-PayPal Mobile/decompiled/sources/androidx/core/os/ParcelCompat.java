package androidx.core.os;

/* loaded from: classes7.dex */
public final class ParcelCompat {
    public static boolean readBoolean(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.ParcelCompat.Api29Impl.Camera2StreamConfigurationMap(parcel, z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
    }

    public static <T> void readList(android.os.Parcel parcel, java.util.List<? super T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.os.ParcelCompat.Api33Impl.Camera2StreamConfigurationMap(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    public static <T> java.lang.Object[] readArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getHighSpeedVideoFpsRanges(parcel, classLoader, cls);
        }
        return parcel.readArray(classLoader);
    }

    public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getInputSizeshNQ4ISI(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    public static <K, V> void readMap(android.os.Parcel parcel, java.util.Map<? super K, ? super V> map, java.lang.ClassLoader classLoader, java.lang.Class<K> cls, java.lang.Class<V> cls2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.os.ParcelCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    public static <K, V> java.util.HashMap<K, V> readHashMap(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends K> cls, java.lang.Class<? extends V> cls2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    public static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.core.os.ParcelCompat.Api33Impl.getHighSpeedVideoSizes(parcel, classLoader, cls);
        }
        T t = (T) parcel.readParcelable(classLoader);
        if (t == null || cls.isInstance(t)) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parcelable ");
        sb.append(t.getClass());
        sb.append(" is not a subclass of required class ");
        sb.append(cls.getName());
        sb.append(" provided in the parameter");
        throw new android.os.BadParcelableException(sb.toString());
    }

    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getHighSpeedVideoFpsRangesFor(parcel, classLoader, cls);
        }
        return (android.os.Parcelable.Creator<T>) androidx.core.os.ParcelCompat.Api30Impl.getHighSpeedVideoFpsRanges(parcel, classLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public static <T> T[] readParcelableArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (T[]) androidx.core.os.ParcelCompat.Api33Impl.Camera2StreamConfigurationMap(parcel, classLoader, cls);
        }
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(android.os.Parcelable.class)) {
            return (T[]) readParcelableArray;
        }
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, readParcelableArray.length));
        for (int i = 0; i < readParcelableArray.length; i++) {
            try {
                tArr[i] = cls.cast(readParcelableArray[i]);
            } catch (java.lang.ClassCastException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parcelable at index ");
                sb.append(i);
                sb.append(" is not a subclass of required class ");
                sb.append(cls.getName());
                sb.append(" provided in the parameter");
                throw new android.os.BadParcelableException(sb.toString());
            }
        }
        return tArr;
    }

    public static <T> android.os.Parcelable[] readParcelableArrayTyped(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return (android.os.Parcelable[]) androidx.core.os.ParcelCompat.Api33Impl.Camera2StreamConfigurationMap(parcel, classLoader, cls);
        }
        return parcel.readParcelableArray(classLoader);
    }

    public static <T> java.util.List<T> readParcelableList(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.os.ParcelCompat.Api33Impl.getHighSpeedVideoFpsRanges(parcel, list, classLoader, cls);
        }
        return androidx.core.os.ParcelCompat.Api29Impl.Camera2StreamConfigurationMap(parcel, list, classLoader);
    }

    public static <T extends java.io.Serializable> T readSerializable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return (T) androidx.core.os.ParcelCompat.Api33Impl.getInputFormats(parcel, classLoader, cls);
        }
        return (T) parcel.readSerializable();
    }

    private ParcelCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static <T extends android.os.Parcelable> java.util.List<T> Camera2StreamConfigurationMap(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }

        static void Camera2StreamConfigurationMap(android.os.Parcel parcel, boolean z) {
            parcel.writeBoolean(z);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.os.Parcelable.Creator<?> getHighSpeedVideoFpsRanges(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T extends java.io.Serializable> T getInputFormats(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        static <T extends android.os.Parcelable> T getHighSpeedVideoSizes(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        static <T> android.os.Parcelable.Creator<T> getHighSpeedVideoFpsRangesFor(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        static <T> T[] Camera2StreamConfigurationMap(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        static <T> java.util.List<T> getHighSpeedVideoFpsRanges(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        static <T> void Camera2StreamConfigurationMap(android.os.Parcel parcel, java.util.List<? super T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        static <T> java.util.ArrayList<T> getHighResolutionOutputSizeshNQ4ISI(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        static <T> T[] getHighSpeedVideoFpsRanges(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        static <T> android.util.SparseArray<T> getInputSizeshNQ4ISI(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }

        static <K, V> void getHighResolutionOutputSizeshNQ4ISI(android.os.Parcel parcel, java.util.Map<? super K, ? super V> map, java.lang.ClassLoader classLoader, java.lang.Class<K> cls, java.lang.Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        static <V, K> java.util.HashMap<K, V> getHighResolutionOutputSizeshNQ4ISI(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends K> cls, java.lang.Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }
    }
}
