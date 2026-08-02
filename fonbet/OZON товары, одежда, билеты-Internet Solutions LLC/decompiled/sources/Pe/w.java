package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Me.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w implements InterfaceC3583a<v> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f22310a = new w();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Me.h f22311b = Me.l.a("kotlinx.serialization.json.JsonPrimitive", e.i.f17915a, new Me.f[0], new Me.k(0));

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22311b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        v value = (v) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        if (value instanceof r) {
            encoder.r(s.f22303a, r.INSTANCE);
        } else {
            encoder.r(q.f22300a, (p) value);
        }
    }
}
