package H3;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Type f2311k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f2312l;

    /* renamed from: m, reason: collision with root package name */
    public final Type[] f2313m;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for " + type2);
            }
        }
        this.f2311k = type == null ? null : d.a(type);
        this.f2312l = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f2313m = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f2313m[i]);
            d.c(this.f2313m[i]);
            Type[] typeArr3 = this.f2313m;
            typeArr3[i] = d.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f2313m.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2311k;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f2312l;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f2313m) ^ this.f2312l.hashCode();
        Type type = this.f2311k;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f2313m;
        int length = typeArr.length;
        Type type = this.f2312l;
        if (length == 0) {
            return d.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.k(type));
        sb.append("<");
        sb.append(d.k(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(d.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
