package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\"\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isAcceptableType", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateHandleImpl_androidKt {
    private static final java.util.List<java.lang.Class<? extends java.lang.Object>> getHighSpeedVideoFpsRanges = kotlin.collections.ArraysKt.filterNotNull(new java.lang.Class[]{java.lang.Boolean.TYPE, boolean[].class, java.lang.Double.TYPE, double[].class, java.lang.Integer.TYPE, int[].class, java.lang.Long.TYPE, long[].class, java.lang.String.class, java.lang.String[].class, android.os.Binder.class, android.os.Bundle.class, java.lang.Byte.TYPE, byte[].class, java.lang.Character.TYPE, char[].class, java.lang.CharSequence.class, java.lang.CharSequence[].class, java.util.ArrayList.class, java.lang.Float.TYPE, float[].class, android.os.Parcelable.class, android.os.Parcelable[].class, java.io.Serializable.class, java.lang.Short.TYPE, short[].class, android.util.SparseArray.class, android.util.Size.class, android.util.SizeF.class});

    public static final boolean isAcceptableType(java.lang.Object obj) {
        if (obj == null) {
            return true;
        }
        java.util.List<java.lang.Class<? extends java.lang.Object>> list = getHighSpeedVideoFpsRanges;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.Class) it.next()).isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
