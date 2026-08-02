package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class Edge<T> implements androidx.core.util.Consumer<T> {
    private androidx.core.util.Consumer<T> Camera2StreamConfigurationMap;

    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this.Camera2StreamConfigurationMap, "");
        this.Camera2StreamConfigurationMap.accept(t);
    }

    public void setListener(androidx.core.util.Consumer<T> consumer) {
        this.Camera2StreamConfigurationMap = consumer;
    }
}
