package Oe;

import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we.C10541a;

/* loaded from: classes10.dex */
public final class j0 implements InterfaceC3583a<C10541a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f20303a = new j0();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f20304b = new T("kotlin.uuid.Uuid", e.i.f17915a);

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f20304b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        C10541a value = (C10541a) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.q(value.toString());
    }
}
