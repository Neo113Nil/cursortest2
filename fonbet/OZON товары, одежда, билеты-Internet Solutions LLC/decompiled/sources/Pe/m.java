package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Me.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m implements InterfaceC3583a<g> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f22295a = new m();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Me.h f22296b = Me.l.a("kotlinx.serialization.json.JsonElement", d.a.f17906a, new Me.f[0], new i());

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22296b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        g value = (g) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        if (value instanceof v) {
            encoder.r(w.f22310a, value);
        } else if (value instanceof t) {
            encoder.r(u.f22305a, value);
        } else {
            if (!(value instanceof c)) {
                throw new Sc.o();
            }
            encoder.r(d.f22283a, value);
        }
    }
}
