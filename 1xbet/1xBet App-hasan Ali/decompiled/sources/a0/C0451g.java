package a0;

import kotlin.jvm.internal.l;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451g {

    /* renamed from: a, reason: collision with root package name */
    public final int f6368a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f6369b;

    public C0451g(int i, Integer num) {
        this.f6368a = i;
        this.f6369b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0451g)) {
            return false;
        }
        C0451g c0451g = (C0451g) obj;
        return this.f6368a == c0451g.f6368a && l.a(this.f6369b, c0451g.f6369b);
    }

    public final int hashCode() {
        int i = this.f6368a * 31;
        Integer num = this.f6369b;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f6368a + ", dataOffset=" + this.f6369b + ')';
    }
}
