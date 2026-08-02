package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class MutableStateObservable<T> extends androidx.camera.core.impl.StateObservable<T> {
    private MutableStateObservable(java.lang.Object obj, boolean z) {
        super(obj, z);
    }

    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialState(T t) {
        return new androidx.camera.core.impl.MutableStateObservable<>(t, false);
    }

    public static <T> androidx.camera.core.impl.MutableStateObservable<T> withInitialError(java.lang.Throwable th) {
        return new androidx.camera.core.impl.MutableStateObservable<>(th, true);
    }

    public void setState(T t) {
        Camera2StreamConfigurationMap((androidx.camera.core.impl.MutableStateObservable<T>) t);
    }

    public void setError(java.lang.Throwable th) {
        Camera2StreamConfigurationMap(th);
    }
}
