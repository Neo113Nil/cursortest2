package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.C7738u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f0 implements InterfaceC3583a<Sc.C> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f20292a = new f0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3699s f20293b;

    static {
        Intrinsics.checkNotNullParameter(C7738u.f71818a, "<this>");
        f20293b = C3701u.a("kotlin.ULong", B.f20236a);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20293b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        long f26092a = ((Sc.C) obj).getF26092a();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(f20293b).v(f26092a);
    }
}
