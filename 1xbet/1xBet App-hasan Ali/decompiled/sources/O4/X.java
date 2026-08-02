package O4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X implements ParameterizedType {

    /* renamed from: k, reason: collision with root package name */
    public final Type f4194k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f4195l;

    /* renamed from: m, reason: collision with root package name */
    public final Type[] f4196m;

    public X(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            Z.d(type3);
        }
        this.f4194k = type;
        this.f4195l = type2;
        this.f4196m = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && Z.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f4196m.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4194k;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4195l;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4196m) ^ this.f4195l.hashCode();
        Type type = this.f4194k;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f4196m;
        int length = typeArr.length;
        Type type = this.f4195l;
        if (length == 0) {
            return Z.t(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(Z.t(type));
        sb.append("<");
        sb.append(Z.t(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(Z.t(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
