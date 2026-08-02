package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15520b;

    /* renamed from: c, reason: collision with root package name */
    public C1485c f15521c;

    /* renamed from: d, reason: collision with root package name */
    public C1485c f15522d;

    public C1485c(Object obj, Object obj2) {
        this.f15519a = obj;
        this.f15520b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1485c)) {
            return false;
        }
        C1485c c1485c = (C1485c) obj;
        return this.f15519a.equals(c1485c.f15519a) && this.f15520b.equals(c1485c.f15520b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15519a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15520b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15519a.hashCode() ^ this.f15520b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15519a + "=" + this.f15520b;
    }
}
