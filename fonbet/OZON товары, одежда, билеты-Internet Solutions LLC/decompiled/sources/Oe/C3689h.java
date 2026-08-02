package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3689h implements InterfaceC3583a<Byte> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3689h f20296a = new C3689h();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20297b = new T("kotlin.Byte", e.b.f17908a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20297b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.a(byteValue);
    }
}
