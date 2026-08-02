package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "T", "", "<init>", "()V", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "at", "(Ljava/lang/Object;F)V", "", "anchors", "Ljava/util/Map;", "getAnchors$material3", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final java.util.Map<T, java.lang.Float> anchors = new java.util.LinkedHashMap();

    public final java.util.Map<T, java.lang.Float> getAnchors$material3() {
        return this.anchors;
    }

    public final void at(T t, float f) {
        this.anchors.put(t, java.lang.Float.valueOf(f));
    }
}
