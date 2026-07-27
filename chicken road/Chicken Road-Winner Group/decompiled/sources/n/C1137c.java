package n;

import java.util.Map;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10117a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10118b;

    /* renamed from: c, reason: collision with root package name */
    public C1137c f10119c;

    /* renamed from: d, reason: collision with root package name */
    public C1137c f10120d;

    public C1137c(Object obj, Object obj2) {
        this.f10117a = obj;
        this.f10118b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1137c)) {
            return false;
        }
        C1137c c1137c = (C1137c) obj;
        return this.f10117a.equals(c1137c.f10117a) && this.f10118b.equals(c1137c.f10118b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10117a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10118b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f10117a.hashCode() ^ this.f10118b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f10117a + "=" + this.f10118b;
    }
}
