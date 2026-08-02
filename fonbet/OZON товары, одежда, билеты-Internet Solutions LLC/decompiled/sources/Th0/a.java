package Th0;

import Py.b;
import Ty.C4050a;
import Vh0.a;
import Zg0.d;
import Zg0.g;
import Zg0.i;
import android.app.Application;
import dh0.C6200a;
import gh0.AbstractC6735a;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yl0.C10923h;

/* loaded from: classes7.dex */
public final class a extends AbstractC6735a {

    /* renamed from: Th0.a$a, reason: collision with other inner class name */
    static final class C0548a extends AbstractC7737t implements Function1<Vh0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<Boolean> f27180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0548a(CompletableFuture<Boolean> completableFuture) {
            super(1);
            this.f27180b = completableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Vh0.a aVar) {
            Vh0.a state = aVar;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof a.b) {
                int i11 = C6200a.f61627d;
                Throwable a11 = ((a.b) state).a();
                d b11 = C6200a.b();
                if (b11 instanceof d.b) {
                    C6200a.c().a(C6200a.a("RuStore isn't available, see exception for details."), a11);
                    ((d.b) b11).getClass();
                }
            }
            this.f27180b.complete(Boolean.valueOf(state instanceof a.C0584a));
            return Unit.f71690a;
        }
    }

    @Override // gh0.AbstractC6735a
    @NotNull
    public final CompletableFuture<Boolean> c(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        Dl0.a aVar = Dl0.a.f6752a;
        C0548a resultCallback = new C0548a(completableFuture);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        C10923h a11 = Dl0.a.a();
        a11.h(new b(resultCallback, 2));
        a11.i(new C4050a(resultCallback));
        return completableFuture;
    }

    @Override // gh0.AbstractC6735a
    public final boolean d(@NotNull g configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.l() instanceof i.b;
    }
}
