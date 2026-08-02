package I0;

import B0.EnumC2468e1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8371L;
import org.jetbrains.annotations.NotNull;
import q0.C8957l;
import q0.C8960o;

/* loaded from: classes.dex */
public final class c1 {

    static final class a extends AbstractC7737t implements Function1<C8957l, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W0 f11473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8960o f11474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W0 w02, C8960o c8960o) {
            super(1);
            this.f11473b = w02;
            this.f11474c = c8960o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8957l c8957l) {
            androidx.compose.ui.platform.I0 v11;
            C8957l c8957l2 = c8957l;
            W0 w02 = this.f11473b;
            boolean e11 = K1.Q.e(w02.K().e());
            EnumC2468e1 enumC2468e1 = EnumC2468e1.Cut;
            boolean z11 = !e11 && w02.z();
            B0.K k11 = new B0.K(enumC2468e1);
            C8960o c8960o = this.f11474c;
            C8957l.c(c8957l2, k11, z11, new Y0(w02, c8960o));
            C8957l.c(c8957l2, new B0.K(EnumC2468e1.Copy), !e11, new Z0(w02, c8960o));
            C8957l.c(c8957l2, new B0.K(EnumC2468e1.Paste), w02.z() && (v11 = w02.v()) != null && v11.b(), new a1(w02, c8960o));
            C8957l.c(c8957l2, new B0.K(EnumC2468e1.SelectAll), K1.Q.f(w02.K().e()) != w02.K().f().length(), new b1(w02, c8960o));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final Function1<C8957l, Unit> a(@NotNull W0 w02, @NotNull C8960o c8960o) {
        return new a(w02, c8960o);
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull e.a aVar, @NotNull W0 w02) {
        androidx.compose.ui.e b11;
        if (!C8371L.b()) {
            return aVar;
        }
        b11 = androidx.compose.ui.c.b(aVar, C5236c1.a(), new h1(w02));
        return b11;
    }
}
