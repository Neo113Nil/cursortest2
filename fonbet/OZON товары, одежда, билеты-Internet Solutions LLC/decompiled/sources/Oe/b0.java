package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.C7723e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b0 implements InterfaceC3583a<Sc.y> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f20282a = new b0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3699s f20283b;

    static {
        Intrinsics.checkNotNullParameter(C7723e.f71803a, "<this>");
        f20283b = C3701u.a("kotlin.UByte", C3689h.f20296a);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20283b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        byte f26119a = ((Sc.y) obj).getF26119a();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.c(f20283b).a(f26119a);
    }
}
