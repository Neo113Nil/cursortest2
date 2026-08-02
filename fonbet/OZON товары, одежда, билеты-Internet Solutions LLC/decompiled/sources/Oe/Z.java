package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Z implements InterfaceC3583a<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Z f20279a = new Z();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20280b = new T("kotlin.String", e.i.f17915a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20280b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.q(value);
    }
}
