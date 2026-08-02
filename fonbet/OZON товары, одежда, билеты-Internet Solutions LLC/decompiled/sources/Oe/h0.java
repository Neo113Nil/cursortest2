package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h0 implements InterfaceC3583a<Sc.F> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h0 f20298a = new h0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3699s f20299b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.Q.f71790a, "<this>");
        f20299b = C3701u.a("kotlin.UShort", Y.f20277a);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20299b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        short a11 = ((Sc.F) obj).a();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(f20299b).g(a11);
    }
}
