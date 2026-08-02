package H3;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Type f2314k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f2315l;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f2315l = null;
            this.f2314k = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f2315l = d.a(typeArr2[0]);
        this.f2314k = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2315l;
        return type != null ? new Type[]{type} : d.f2316a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2314k};
    }

    public final int hashCode() {
        Type type = this.f2315l;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2314k.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f2315l;
        if (type != null) {
            return "? super " + d.k(type);
        }
        Type type2 = this.f2314k;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.k(type2);
    }
}
