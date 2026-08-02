package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3695n implements InterfaceC3583a<Double> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3695n f20309a = new C3695n();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20310b = new T("kotlin.Double", e.d.f17910a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20310b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.s(doubleValue);
    }
}
