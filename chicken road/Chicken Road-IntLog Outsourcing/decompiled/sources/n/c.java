package n;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11266a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11267b;

    /* renamed from: c, reason: collision with root package name */
    public c f11268c;

    /* renamed from: d, reason: collision with root package name */
    public c f11269d;

    public c(Object obj, Object obj2) {
        this.f11266a = obj;
        this.f11267b = obj2;
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
        return this.f11266a.equals(cVar.f11266a) && this.f11267b.equals(cVar.f11267b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11266a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11267b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11266a.hashCode() ^ this.f11267b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11266a + "=" + this.f11267b;
    }
}
