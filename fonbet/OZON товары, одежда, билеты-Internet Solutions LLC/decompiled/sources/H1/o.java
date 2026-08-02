package H1;

import B1.B;
import B1.C;
import H1.d;
import I1.t;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.function.Consumer;
import k1.C7460f;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import l1.x0;
import org.jetbrains.annotations.NotNull;
import xe.N;

/* loaded from: classes8.dex */
public final class o implements d.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f10494a;

    /* synthetic */ class a extends C7719a implements Function1<p, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p pVar) {
            ((U0.b) this.receiver).b(pVar);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<p, Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f10495b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Comparable<?> invoke(p pVar) {
            return Integer.valueOf(pVar.b());
        }
    }

    static final class c extends AbstractC7737t implements Function1<p, Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f10496b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Comparable<?> invoke(p pVar) {
            return Integer.valueOf(pVar.d().d());
        }
    }

    public o() {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f10494a = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f10494a.getValue()).booleanValue();
    }

    public final void b(@NotNull View view, @NotNull t tVar, @NotNull CoroutineContext coroutineContext, @NotNull Consumer<ScrollCaptureTarget> consumer) {
        U0.b bVar = new U0.b(new p[16]);
        q.a(tVar.a(), 0, new a(1, bVar, U0.b.class, ProductAction.ACTION_ADD, "add(Ljava/lang/Object;)Z", 8));
        bVar.z(Vc.a.a(b.f10495b, c.f10496b));
        p pVar = (p) (bVar.o() ? null : bVar.l()[bVar.m() - 1]);
        if (pVar == null) {
            return;
        }
        d dVar = new d(pVar.c(), pVar.d(), N.a(coroutineContext), this);
        B a11 = pVar.a();
        C7460f K11 = C.c(a11).K(a11, true);
        long h11 = pVar.d().h();
        ScrollCaptureTarget b11 = n.b(view, x0.a(Z1.p.b(K11)), new Point((int) (h11 >> 32), (int) (h11 & 4294967295L)), dVar);
        b11.setScrollBounds(x0.a(pVar.d()));
        consumer.accept(b11);
    }

    public final void c() {
        this.f10494a.setValue(Boolean.FALSE);
    }

    public final void d() {
        this.f10494a.setValue(Boolean.TRUE);
    }
}
