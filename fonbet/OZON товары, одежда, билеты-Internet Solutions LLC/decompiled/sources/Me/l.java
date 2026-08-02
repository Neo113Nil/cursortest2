package Me;

import Me.n;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l {
    @NotNull
    public static final h a(@NotNull String serialName, @NotNull m kind, @NotNull f[] typeParameters, @NotNull Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (kotlin.text.h.K(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.d(kind, n.a.f17935a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C3618a c3618a = new C3618a(serialName);
        builder.invoke(c3618a);
        return new h(serialName, kind, c3618a.e().size(), C7705l.f0(typeParameters), c3618a);
    }
}
