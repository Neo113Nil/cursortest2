package Ld;

import fe.C6530i;
import fe.InterfaceC6531j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r implements InterfaceC6531j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final yd.g f16807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f16808b;

    public r(@NotNull q deserializedDescriptorResolver, @NotNull yd.g kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f16807a = kotlinClassFinder;
        this.f16808b = deserializedDescriptorResolver;
    }

    @Override // fe.InterfaceC6531j
    public final C6530i a(@NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        q qVar = this.f16808b;
        y a11 = x.a(this.f16807a, classId, te.c.a(qVar.c().g()));
        if (a11 == null) {
            return null;
        }
        ((yd.f) a11).b().equals(classId);
        return qVar.f(a11);
    }
}
