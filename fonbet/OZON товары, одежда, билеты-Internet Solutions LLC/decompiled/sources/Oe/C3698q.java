package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3698q implements InterfaceC3583a<Float> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3698q f20314a = new C3698q();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20315b = new T("kotlin.Float", e.C0348e.f17911a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20315b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.i(floatValue);
    }
}
