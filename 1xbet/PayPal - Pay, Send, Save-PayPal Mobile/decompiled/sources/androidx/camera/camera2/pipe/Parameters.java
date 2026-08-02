package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦\u0002¢\u0006\u0004\b\u0005\u0010\bJ2\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0010\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0015\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00142\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/Parameters;", "", "T", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "get", "(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/Metadata$Key;", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)V", "", "newParameters", "setAll", "(Ljava/util/Map;)V", "clear", "()V", "", "remove", "(Landroid/hardware/camera2/CaptureRequest$Key;)Z", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Z", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "removeAll", "(Ljava/util/Set;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Parameters {
    void clear();

    <T> T get(android.hardware.camera2.CaptureRequest.Key<T> key);

    <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key);

    <T> boolean remove(android.hardware.camera2.CaptureRequest.Key<T> key);

    <T> boolean remove(androidx.camera.camera2.pipe.Metadata.Key<T> key);

    boolean removeAll(java.util.Set<?> keys);

    <T> void set(android.hardware.camera2.CaptureRequest.Key<T> key, T value);

    <T> void set(androidx.camera.camera2.pipe.Metadata.Key<T> key, T value);

    void setAll(java.util.Map<java.lang.Object, ? extends java.lang.Object> newParameters);
}
