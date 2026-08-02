package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Oe.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3703w implements InterfaceC3583a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3703w f20319a = new C3703w();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20320b = new T("kotlin.Int", e.f.f17912a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20320b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.m(intValue);
    }
}
