package Qe;

import Le.InterfaceC3583a;
import Me.m;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p {
    @NotNull
    public static final Me.f a(@NotNull Me.f descriptor, @NotNull Re.c module) {
        Me.f a11;
        InterfaceC3583a a12;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.d(descriptor.getKind(), m.a.f17933a)) {
            return descriptor.isInline() ? a(descriptor.c(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.reflect.d<?> a13 = Me.b.a(descriptor);
        Me.f fVar = null;
        if (a13 != null && (a12 = module.a(a13, K.f71697a)) != null) {
            fVar = a12.b();
        }
        return (fVar == null || (a11 = a(fVar, module)) == null) ? descriptor : a11;
    }
}
