package Y9;

import com.squareup.moshi.D;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f34865a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f34866b;

    public static final class a {
        @NotNull
        public static d a(@NotNull Type[] upperBounds, @NotNull Type[] lowerBounds) {
            Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
            Intrinsics.checkNotNullParameter(lowerBounds, "lowerBounds");
            if (lowerBounds.length > 1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (upperBounds.length != 1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (lowerBounds.length != 1) {
                c.b(upperBounds[0]);
                return new d(c.a(upperBounds[0]), null);
            }
            c.b(lowerBounds[0]);
            if (upperBounds[0] == Object.class) {
                return new d(Object.class, c.a(lowerBounds[0]));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public d(Type type, Type type2) {
        this.f34865a = type;
        this.f34866b = type2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && D.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public final Type[] getLowerBounds() {
        Type type = this.f34866b;
        return type != null ? new Type[]{type} : c.f34862b;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public final Type[] getUpperBounds() {
        return new Type[]{this.f34865a};
    }

    public final int hashCode() {
        Type type = this.f34866b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f34865a.hashCode() + 31);
    }

    @NotNull
    public final String toString() {
        Type type = this.f34866b;
        if (type != null) {
            return "? super " + c.p(type);
        }
        Type type2 = this.f34865a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + c.p(type2);
    }
}
