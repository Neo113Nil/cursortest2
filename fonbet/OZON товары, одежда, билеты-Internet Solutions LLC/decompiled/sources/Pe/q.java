package Pe;

import Cf0.O;
import Le.InterfaceC3583a;
import Me.e;
import Oe.T;
import Oe.U;
import Oe.f0;
import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.B;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class q implements InterfaceC3583a<p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f22300a = new q();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final T f22301b;

    static {
        e.i kind = e.i.f17915a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kotlin.text.h.K("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        f22301b = U.a(kind);
    }

    @Override // Le.f
    @NotNull
    public final Me.f b() {
        return f22301b;
    }

    @Override // Le.f
    public final void c(Ne.a encoder, Object obj) {
        p value = (p) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        O.c(encoder);
        if (value.c()) {
            encoder.q(value.b());
            return;
        }
        Long y02 = kotlin.text.h.y0(value.b());
        if (y02 != null) {
            encoder.v(y02.longValue());
            return;
        }
        C b11 = B.b(value.b());
        if (b11 != null) {
            long f26092a = b11.getF26092a();
            Intrinsics.checkNotNullParameter(C.INSTANCE, "<this>");
            encoder.c(f0.f20292a.b()).v(f26092a);
            return;
        }
        Double u02 = kotlin.text.h.u0(value.b());
        if (u02 != null) {
            encoder.s(u02.doubleValue());
            return;
        }
        Boolean t02 = kotlin.text.h.t0(value.b());
        if (t02 != null) {
            encoder.h(t02.booleanValue());
        } else {
            encoder.q(value.b());
        }
    }
}
