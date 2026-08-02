package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B implements InterfaceC3583a<Long> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final B f20236a = new B();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20237b = new T("kotlin.Long", e.g.f17913a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20237b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.v(longValue);
    }
}
