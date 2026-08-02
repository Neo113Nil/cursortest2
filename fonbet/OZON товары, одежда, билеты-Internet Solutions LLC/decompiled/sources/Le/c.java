package Le;

import N3.C3660k;
import Oe.AbstractC3683b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {
    @NotNull
    public static final f a(@NotNull AbstractC3683b abstractC3683b, @NotNull Ne.a encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(abstractC3683b, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f d11 = abstractC3683b.d(encoder, value);
        if (d11 != null) {
            return d11;
        }
        kotlin.reflect.d subClass = N.b(value.getClass());
        kotlin.reflect.d baseClass = abstractC3683b.e();
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String B11 = subClass.B();
        if (B11 == null) {
            B11 = String.valueOf(subClass);
        }
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        StringBuilder d12 = C3660k.d("Serializer for subclass '", B11, "' is not found ", "in the polymorphic scope of '" + baseClass.B() + '\'', ".\nCheck if class with serial name '");
        Nh.a.h(d12, B11, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", B11, "' has to be '@Serializable', and the base class '");
        d12.append(baseClass.B());
        d12.append("' has to be sealed and '@Serializable'.");
        throw new e(d12.toString());
    }
}
