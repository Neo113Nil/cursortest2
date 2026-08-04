package p101o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f15527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15528d;

    public c(Object obj, Object obj2) {
        this.f15525a = obj;
        this.f15526b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15525a.equals(cVar.f15525a) && this.f15526b.equals(cVar.f15526b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15525a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15526b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15525a.hashCode() ^ this.f15526b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15525a + "=" + this.f15526b;
    }
}
