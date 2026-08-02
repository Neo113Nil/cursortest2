package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3687f implements InterfaceC3583a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3687f f20290a = new C3687f();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20291b = new T("kotlin.Boolean", e.a.f17907a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20291b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(booleanValue);
    }
}
