package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0708c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f9617b;

    public C0708c(int i7, Method method) {
        this.f9616a = i7;
        this.f9617b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0708c)) {
            return false;
        }
        C0708c c0708c = (C0708c) obj;
        return this.f9616a == c0708c.f9616a && this.f9617b.getName().equals(c0708c.f9617b.getName());
    }

    public final int hashCode() {
        return this.f9617b.getName().hashCode() + (this.f9616a * 31);
    }
}
