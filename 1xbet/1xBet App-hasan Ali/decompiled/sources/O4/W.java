package O4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class W implements GenericArrayType {

    /* renamed from: k, reason: collision with root package name */
    public final Type f4193k;

    public W(Type type) {
        this.f4193k = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && Z.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4193k;
    }

    public final int hashCode() {
        return this.f4193k.hashCode();
    }

    public final String toString() {
        return Z.t(this.f4193k) + "[]";
    }
}
