package Oe;

import Le.InterfaceC3583a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i0 implements InterfaceC3583a<Unit> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final i0 f20300b = new i0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I<Unit> f20301a = new I<>(Unit.f71690a);

    private i0() {
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return this.f20301a.b();
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20301a.c(encoder, value);
    }
}
