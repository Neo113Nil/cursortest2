package p;

import java.util.Map;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237c implements Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public final Object f18677k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18678l;

    /* renamed from: m, reason: collision with root package name */
    public C2237c f18679m;

    /* renamed from: n, reason: collision with root package name */
    public C2237c f18680n;

    public C2237c(Object obj, Object obj2) {
        this.f18677k = obj;
        this.f18678l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237c)) {
            return false;
        }
        C2237c c2237c = (C2237c) obj;
        return this.f18677k.equals(c2237c.f18677k) && this.f18678l.equals(c2237c.f18678l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18677k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18678l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18677k.hashCode() ^ this.f18678l.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f18677k + "=" + this.f18678l;
    }
}
