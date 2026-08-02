package Y9;

import E0.C2942q;
import com.squareup.moshi.D;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    private final Type f34858a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Type f34859b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Type[] f34860c;

    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.d(com.squareup.moshi.D.c(r3), r0) != false) goto L16;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static b a(Type type, @NotNull Type rawType, @NotNull Type... typeArguments) {
            Intrinsics.checkNotNullParameter(rawType, "rawType");
            Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
            if (rawType instanceof Class) {
                Class<?> enclosingClass = ((Class) rawType).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass != null) {
                        Intrinsics.checkNotNullParameter(type, "<this>");
                    }
                    throw new IllegalArgumentException(("unexpected owner type for " + rawType + ": " + type).toString());
                }
                if (enclosingClass != null) {
                    throw new IllegalArgumentException(("unexpected owner type for " + rawType + ": null").toString());
                }
            }
            Object clone = typeArguments.clone();
            Intrinsics.g(clone, "null cannot be cast to non-null type kotlin.Array<java.lang.reflect.Type>");
            Type[] typeArr = (Type[]) clone;
            int length = typeArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                c.b(typeArr[i11]);
                typeArr[i11] = c.a(typeArr[i11]);
            }
            return new b(type != null ? c.a(type) : null, c.a(rawType), typeArr);
        }
    }

    public b(Type type, Type type2, Type[] typeArr) {
        this.f34858a = type;
        this.f34859b = type2;
        this.f34860c = typeArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && D.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f34860c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f34858a;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public final Type getRawType() {
        return this.f34859b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f34860c) ^ this.f34859b.hashCode();
        M m11 = c.f34861a;
        Type type = this.f34858a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Type[] typeArr = this.f34860c;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(c.p(this.f34859b));
        if (typeArr.length == 0) {
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "result.toString()");
            return sb3;
        }
        sb2.append("<");
        sb2.append(c.p(typeArr[0]));
        int length = typeArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            sb2.append(", ");
            sb2.append(c.p(typeArr[i11]));
        }
        return C2942q.c(sb2, ">", "result.append(\">\").toString()");
    }
}
