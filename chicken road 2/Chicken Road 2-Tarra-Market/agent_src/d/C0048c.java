package d;

import java.util.Map;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f877a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f878b;

    /* renamed from: c, reason: collision with root package name */
    public C0048c f879c;

    /* renamed from: d, reason: collision with root package name */
    public C0048c f880d;

    public C0048c(Object obj, Object obj2) {
        this.f877a = obj;
        this.f878b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0048c)) {
            return false;
        }
        C0048c c0048c = (C0048c) obj;
        return this.f877a.equals(c0048c.f877a) && this.f878b.equals(c0048c.f878b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f877a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f878b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f877a.hashCode() ^ this.f878b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f877a + "=" + this.f878b;
    }
}
