package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable th);

    void onSuccess(V v);
}
