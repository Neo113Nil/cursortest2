package O4;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class Y implements WildcardType {

    /* renamed from: k, reason: collision with root package name */
    public final Type f4197k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f4198l;

    public Y(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            Z.d(typeArr[0]);
            this.f4198l = null;
            this.f4197k = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        Z.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f4198l = typeArr2[0];
        this.f4197k = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && Z.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f4198l;
        return type != null ? new Type[]{type} : Z.f4199a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f4197k};
    }

    public final int hashCode() {
        Type type = this.f4198l;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4197k.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f4198l;
        if (type != null) {
            return "? super " + Z.t(type);
        }
        Type type2 = this.f4197k;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + Z.t(type2);
    }
}
