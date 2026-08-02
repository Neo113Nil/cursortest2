package H3;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Type f2310k;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f2310k = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2310k;
    }

    public final int hashCode() {
        return this.f2310k.hashCode();
    }

    public final String toString() {
        return d.k(this.f2310k) + "[]";
    }
}
