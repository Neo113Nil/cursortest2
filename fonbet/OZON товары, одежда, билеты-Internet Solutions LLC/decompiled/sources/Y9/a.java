package Y9;

import com.squareup.moshi.D;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f34857a;

    /* renamed from: Y9.a$a, reason: collision with other inner class name */
    public static final class C0642a {
        @NotNull
        public static a a(@NotNull Type componentType) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            return new a(c.a(componentType));
        }
    }

    public a(Type type) {
        this.f34857a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && D.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public final Type getGenericComponentType() {
        return this.f34857a;
    }

    public final int hashCode() {
        return this.f34857a.hashCode();
    }

    @NotNull
    public final String toString() {
        return c.p(this.f34857a) + "[]";
    }
}
