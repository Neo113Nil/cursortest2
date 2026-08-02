package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Me.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class s implements InterfaceC3583a<r> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f22303a = new s();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Me.h f22304b = Me.l.a("kotlinx.serialization.json.JsonNull", m.b.f17934a, new Me.f[0], new Me.k(0));

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22304b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        r value = (r) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        encoder.x();
    }
}
