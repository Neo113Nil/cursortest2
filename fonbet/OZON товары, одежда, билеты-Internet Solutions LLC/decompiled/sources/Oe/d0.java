package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d0 implements InterfaceC3583a<Sc.A> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f20286a = new d0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3699s f20287b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.r.f71817a, "<this>");
        f20287b = C3701u.a("kotlin.UInt", C3703w.f20319a);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20287b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        int a11 = ((Sc.A) obj).a();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(f20287b).m(a11);
    }
}
