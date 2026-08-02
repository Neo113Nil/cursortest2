package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474c {

    /* renamed from: a, reason: collision with root package name */
    public final int f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f7047b;

    public C0474c(Method method, int i) {
        this.f7046a = i;
        this.f7047b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474c)) {
            return false;
        }
        C0474c c0474c = (C0474c) obj;
        return this.f7046a == c0474c.f7046a && this.f7047b.getName().equals(c0474c.f7047b.getName());
    }

    public final int hashCode() {
        return this.f7047b.getName().hashCode() + (this.f7046a * 31);
    }
}
