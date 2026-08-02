package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.c1;
import java.util.List;
import u.C9887a;

/* renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5081a {
    AbstractC5081a() {
    }

    @NonNull
    public static AbstractC5081a a(@NonNull V0 v02, int i11, @NonNull Size size, @NonNull C.A a11, @NonNull List<c1.b> list, T t2, Range<Integer> range) {
        return new C5083b(v02, i11, size, a11, list, t2, range);
    }

    @NonNull
    public abstract List<c1.b> b();

    @NonNull
    public abstract C.A c();

    public abstract int d();

    public abstract T e();

    @NonNull
    public abstract Size f();

    @NonNull
    public abstract V0 g();

    public abstract Range<Integer> h();

    @NonNull
    public final T0 i(@NonNull C9887a c9887a) {
        T0.a a11 = T0.a(f());
        a11.b(c());
        a11.d(c9887a);
        if (h() != null) {
            a11.c(h());
        }
        return a11.a();
    }
}
