package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Y implements InterfaceC3583a<Short> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Y f20277a = new Y();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20278b = new T("kotlin.Short", e.h.f17914a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20278b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(shortValue);
    }
}
