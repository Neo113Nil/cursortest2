package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9616a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f9617b;

    public C0729c(int i7, Method method) {
        this.f9616a = i7;
        this.f9617b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0729c)) {
            return false;
        }
        C0729c c0729c = (C0729c) obj;
        return this.f9616a == c0729c.f9616a && this.f9617b.getName().equals(c0729c.f9617b.getName());
    }

    public final int hashCode() {
        return this.f9617b.getName().hashCode() + (this.f9616a * 31);
    }
}
