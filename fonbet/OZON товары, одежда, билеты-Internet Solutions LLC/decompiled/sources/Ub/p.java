package Ub;

import C.o0;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f27515a;

    p(@NonNull String str) {
        this.f27515a = str;
    }

    @NonNull
    public static <T> p<T> c(@NonNull String str) {
        return new p<>(str);
    }

    public final T a(@NonNull r rVar) {
        return (T) ((s) rVar).a(this);
    }

    @NonNull
    public final Object b(@NonNull r rVar) {
        return ((s) rVar).b(this);
    }

    @NonNull
    public final T d(@NonNull r rVar) {
        T t2 = (T) ((s) rVar).a(this);
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(this.f27515a);
    }

    public final void e(@NonNull r rVar, T t2) {
        ((s) rVar).c(this, t2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return this.f27515a.equals(((p) obj).f27515a);
    }

    public final int hashCode() {
        return this.f27515a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("Prop{name='"), this.f27515a, "'}");
    }
}
