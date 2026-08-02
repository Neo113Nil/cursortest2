package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class W0 {
    W0() {
    }

    @NonNull
    public static W0 a(@NonNull Size size, @NonNull Map<Integer, Size> map, @NonNull Size size2, @NonNull Map<Integer, Size> map2, @NonNull Size size3, @NonNull Map<Integer, Size> map3, @NonNull Map<Integer, Size> map4) {
        return new C5109o(size, map, size2, map2, size3, map3, map4);
    }

    @NonNull
    public abstract Size b();

    @NonNull
    public abstract Map<Integer, Size> c();

    @NonNull
    public abstract Size d();

    @NonNull
    public abstract Size e();

    @NonNull
    public abstract Map<Integer, Size> f();

    @NonNull
    public abstract Map<Integer, Size> g();

    @NonNull
    public abstract Map<Integer, Size> h();
}
