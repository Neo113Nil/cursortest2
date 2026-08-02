package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5105m;

/* loaded from: classes8.dex */
public abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f38211a = new Range<>(0, 0);

    public static abstract class a {
        @NonNull
        public abstract T0 a();

        @NonNull
        public abstract a b(@NonNull C.A a11);

        @NonNull
        public abstract a c(@NonNull Range<Integer> range);

        @NonNull
        public abstract a d(@NonNull T t2);

        @NonNull
        public abstract a e(@NonNull Size size);

        @NonNull
        public abstract a f(boolean z11);
    }

    @NonNull
    public static a a(@NonNull Size size) {
        C5105m.a aVar = new C5105m.a();
        aVar.e(size);
        aVar.c(f38211a);
        aVar.b(C.A.f4076d);
        aVar.f(false);
        return aVar;
    }

    @NonNull
    public abstract C.A b();

    @NonNull
    public abstract Range<Integer> c();

    public abstract T d();

    @NonNull
    public abstract Size e();

    public abstract boolean f();

    @NonNull
    public abstract a g();
}
