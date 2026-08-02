package D4;

import Ae.M0;
import B4.C2581j;
import B4.InterfaceC2575d;
import B4.b0;
import S0.InterfaceC3967k;
import a1.C4912a;
import d2.C6030G;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

@b0.a("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LD4/o;", "LB4/b0;", "LD4/o$a;", "<init>", "()V", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2840o extends b0<a> {

    /* renamed from: D4.o$a */
    public static final class a extends B4.H implements InterfaceC2575d {

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final C6030G f5921l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final C4912a f5922m;

        public a() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2840o c2840o) {
            super(c2840o);
            C4912a c4912a = C2828c.f5885a;
            C6030G c6030g = new C6030G(true);
            this.f5921l = c6030g;
            this.f5922m = c4912a;
        }

        @NotNull
        public final InterfaceC6511n<C2581j, InterfaceC3967k, Integer, Unit> A() {
            return this.f5922m;
        }

        @NotNull
        public final C6030G B() {
            return this.f5921l;
        }
    }

    @Override // B4.b0
    public final a a() {
        C4912a c4912a = C2828c.f5885a;
        return new a(this);
    }

    @Override // B4.b0
    public final void e(@NotNull List list, B4.S s11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().k((C2581j) it.next());
        }
    }

    @Override // B4.b0
    public final void j(@NotNull C2581j c2581j, boolean z11) {
        b().i(c2581j, z11);
        int R11 = C7714v.R(b().c().getValue(), c2581j);
        int i11 = 0;
        for (Object obj : b().c().getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C2581j c2581j2 = (C2581j) obj;
            if (i11 > R11) {
                n(c2581j2);
            }
            i11 = i12;
        }
    }

    @NotNull
    public final M0<List<C2581j>> l() {
        return b().b();
    }

    @NotNull
    public final M0<Set<C2581j>> m() {
        return b().c();
    }

    public final void n(@NotNull C2581j c2581j) {
        b().e(c2581j);
    }
}
