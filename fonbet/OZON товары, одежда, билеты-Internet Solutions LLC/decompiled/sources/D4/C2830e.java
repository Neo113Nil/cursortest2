package D4;

import Ae.M0;
import B4.C2581j;
import B4.b0;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.n1;
import a1.C4912a;
import fd.InterfaceC6512o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import l0.InterfaceC7772p;
import org.jetbrains.annotations.NotNull;

@b0.a("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LD4/e;", "LB4/b0;", "LD4/e$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2830e extends b0<a> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f5887c;

    /* renamed from: D4.e$a */
    public static final class a extends B4.H {

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final C4912a f5888l;

        public a(@NotNull C2830e c2830e, @NotNull C4912a c4912a) {
            super(c2830e);
            this.f5888l = c4912a;
        }

        @NotNull
        public final InterfaceC6512o<InterfaceC7772p, C2581j, InterfaceC3967k, Integer, Unit> A() {
            return this.f5888l;
        }
    }

    public C2830e() {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f5887c = f7;
    }

    @Override // B4.b0
    public final a a() {
        return new a(this, C2827b.f5883a);
    }

    @Override // B4.b0
    public final void e(@NotNull List list, B4.S s11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().l((C2581j) it.next());
        }
        this.f5887c.setValue(Boolean.FALSE);
    }

    @Override // B4.b0
    public final void j(@NotNull C2581j c2581j, boolean z11) {
        b().i(c2581j, z11);
        this.f5887c.setValue(Boolean.TRUE);
    }

    @NotNull
    public final M0<List<C2581j>> l() {
        return b().b();
    }

    @NotNull
    /* renamed from: m, reason: from getter */
    public final C3991w0 getF5887c() {
        return this.f5887c;
    }

    public final void n(@NotNull C2581j c2581j) {
        b().e(c2581j);
    }

    public final void o(@NotNull C2581j c2581j) {
        b().j(c2581j);
    }
}
