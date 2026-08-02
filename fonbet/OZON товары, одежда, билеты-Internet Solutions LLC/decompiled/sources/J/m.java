package J;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.T;

/* loaded from: classes8.dex */
public interface m<T> extends J0 {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public static final T.a<String> f12651b = T.a.a(String.class, "camerax.core.target.name");

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final T.a<Class<?>> f12652c = T.a.a(Class.class, "camerax.core.target.class");

    @NonNull
    default String A() {
        return (String) a(f12651b);
    }

    default String l(String str) {
        return (String) c(f12651b, str);
    }
}
