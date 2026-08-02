package Wg0;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    static final class a extends AbstractC7737t implements Function0<e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Mg0.b> f33865b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Vg0.a f33866c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Vg0.a aVar, Function0 function0) {
            super(0);
            this.f33865b = function0;
            this.f33866c = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            if (Pg0.b.f22527m == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Mg0.b invoke = this.f33865b.invoke();
            Context requireContext = this.f33866c.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Pg0.b bVar = Pg0.b.f22527m;
            if (bVar != null) {
                return new d(requireContext, invoke, bVar.m());
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @NotNull
    public static final InterfaceC4008j<e> a(@NotNull Vg0.a aVar, @NotNull Function0<? extends Mg0.b> controllerProducer) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(controllerProducer, "controllerProducer");
        return k.a(n.NONE, new a(aVar, controllerProducer));
    }
}
