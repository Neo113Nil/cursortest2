package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3696o implements InterfaceC3583a<kotlin.time.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3696o f20311a = new C3696o();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20312b = new T("kotlin.time.Duration", e.i.f17915a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20312b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        long f71985a = ((kotlin.time.b) obj).getF71985a();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.q(kotlin.time.b.n(f71985a));
    }
}
