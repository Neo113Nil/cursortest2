package Oe;

import Le.InterfaceC3583a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class F implements InterfaceC3583a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final F f20245a = new F();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final E f20246b = E.f20242a;

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20246b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new Le.e("'kotlin.Nothing' cannot be serialized");
    }
}
