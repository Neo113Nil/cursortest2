package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3692k implements InterfaceC3583a<Character> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3692k f20305a = new C3692k();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20306b = new T("kotlin.Char", e.c.f17909a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20306b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.A(charValue);
    }
}
