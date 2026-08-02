package I0;

import I0.C3215w0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.collection.AbstractC5149s;
import androidx.collection.C5150t;
import b1.C5516s;
import b1.C5517t;
import b1.InterfaceC5518u;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import k1.C7459e;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class M0 implements K0 {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C5517t f11336m = C5516s.a(a.f11349b, b.f11350b);

    /* renamed from: a, reason: collision with root package name */
    private boolean f11337a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f11338b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.F<InterfaceC3216x> f11339c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AtomicLong f11340d;

    /* renamed from: e, reason: collision with root package name */
    private Function1<? super Long, Unit> f11341e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6512o<? super Boolean, ? super B1.B, ? super C7459e, ? super F, Unit> f11342f;

    /* renamed from: g, reason: collision with root package name */
    private Function2<? super Boolean, ? super Long, Unit> f11343g;

    /* renamed from: h, reason: collision with root package name */
    private fd.q<? super Boolean, ? super B1.B, ? super C7459e, ? super C7459e, ? super Boolean, ? super F, Boolean> f11344h;

    /* renamed from: i, reason: collision with root package name */
    private Function0<Unit> f11345i;

    /* renamed from: j, reason: collision with root package name */
    private Function1<? super Long, Unit> f11346j;

    /* renamed from: k, reason: collision with root package name */
    private Function1<? super Long, Unit> f11347k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11348l;

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, M0, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11349b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(InterfaceC5518u interfaceC5518u, M0 m02) {
            return Long.valueOf(m02.f11340d.get());
        }
    }

    static final class b extends AbstractC7737t implements Function1<Long, M0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11350b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final M0 invoke(Long l11) {
            return new M0(l11.longValue(), 0);
        }
    }

    public /* synthetic */ M0(long j11, int i11) {
        this(j11);
    }

    @Override // I0.K0
    public final void a(long j11) {
        this.f11337a = false;
        Function1<? super Long, Unit> function1 = this.f11341e;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j11));
        }
    }

    @Override // I0.K0
    public final boolean b(@NotNull B1.B b11, long j11, long j12, @NotNull F f7, boolean z11) {
        fd.q<? super Boolean, ? super B1.B, ? super C7459e, ? super C7459e, ? super Boolean, ? super F, Boolean> qVar = this.f11344h;
        if (qVar == null) {
            return true;
        }
        return ((Boolean) ((C3215w0.d) qVar).invoke(Boolean.valueOf(z11), b11, C7459e.a(j11), C7459e.a(j12), Boolean.FALSE, f7)).booleanValue();
    }

    @Override // I0.K0
    public final void c(@NotNull InterfaceC3216x interfaceC3216x) {
        long h11 = interfaceC3216x.h();
        androidx.collection.F<InterfaceC3216x> f7 = this.f11339c;
        if (f7.b(h11)) {
            this.f11338b.remove(interfaceC3216x);
            f7.i(interfaceC3216x.h());
            Function1<? super Long, Unit> function1 = this.f11347k;
            if (function1 != null) {
                ((C3215w0.g) function1).invoke(Long.valueOf(interfaceC3216x.h()));
            }
        }
    }

    @Override // I0.K0
    public final void d() {
        Function0<Unit> function0 = this.f11345i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // I0.K0
    public final long e() {
        AtomicLong atomicLong = this.f11340d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I0.K0
    @NotNull
    public final AbstractC5149s<C3220z> f() {
        return (AbstractC5149s) this.f11348l.getValue();
    }

    @Override // I0.K0
    public final void g(long j11) {
        Function1<? super Long, Unit> function1 = this.f11346j;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j11));
        }
    }

    @Override // I0.K0
    public final void h(@NotNull B1.B b11, long j11, @NotNull F f7, boolean z11) {
        InterfaceC6512o<? super Boolean, ? super B1.B, ? super C7459e, ? super F, Unit> interfaceC6512o = this.f11342f;
        if (interfaceC6512o != null) {
            ((C3215w0.b) interfaceC6512o).invoke(Boolean.valueOf(z11), b11, C7459e.a(j11), f7);
        }
    }

    @Override // I0.K0
    @NotNull
    public final InterfaceC3216x i(@NotNull C3210u c3210u) {
        if (c3210u.h() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + c3210u.h()).toString());
        }
        long h11 = c3210u.h();
        androidx.collection.F<InterfaceC3216x> f7 = this.f11339c;
        if (f7.b(h11)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + c3210u + ".selectableId has already subscribed.").toString());
        }
        f7.j(c3210u.h(), c3210u);
        this.f11338b.add(c3210u);
        this.f11337a = false;
        return c3210u;
    }

    @NotNull
    public final androidx.collection.F l() {
        return this.f11339c;
    }

    @NotNull
    public final ArrayList m() {
        return this.f11338b;
    }

    public final void n(Function1<? super Long, Unit> function1) {
        this.f11347k = function1;
    }

    public final void o(Function1<? super Long, Unit> function1) {
        this.f11341e = function1;
    }

    public final void p(Function1<? super Long, Unit> function1) {
        this.f11346j = function1;
    }

    public final void q(fd.q<? super Boolean, ? super B1.B, ? super C7459e, ? super C7459e, ? super Boolean, ? super F, Boolean> qVar) {
        this.f11344h = qVar;
    }

    public final void r(Function0<Unit> function0) {
        this.f11345i = function0;
    }

    public final void s(Function2<? super Boolean, ? super Long, Unit> function2) {
        this.f11343g = function2;
    }

    public final void t(InterfaceC6512o<? super Boolean, ? super B1.B, ? super C7459e, ? super F, Unit> interfaceC6512o) {
        this.f11342f = interfaceC6512o;
    }

    public final void u(@NotNull AbstractC5149s<C3220z> abstractC5149s) {
        this.f11348l.setValue(abstractC5149s);
    }

    @NotNull
    public final ArrayList v(@NotNull B1.B b11) {
        boolean z11 = this.f11337a;
        ArrayList arrayList = this.f11338b;
        if (!z11) {
            final N0 n02 = new N0(b11);
            C7714v.G0(new Comparator() { // from class: I0.L0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) Function2.this.invoke(obj, obj2)).intValue();
                }
            }, arrayList);
            this.f11337a = true;
        }
        return arrayList;
    }

    private M0(long j11) {
        C3991w0 f7;
        this.f11338b = new ArrayList();
        int i11 = C5150t.f38742b;
        this.f11339c = new androidx.collection.F<>((Object) null);
        this.f11340d = new AtomicLong(j11);
        f7 = n1.f(C5150t.a(), D1.f25195a);
        this.f11348l = f7;
    }

    public M0() {
        this(1L);
    }
}
