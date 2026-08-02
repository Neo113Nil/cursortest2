package D1;

import B1.AbstractC2531a;
import B1.C2533b;
import B1.C2551u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2789a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B1.m0 f5411a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5413c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5414d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5415e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5416f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5417g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2791b f5418h;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5412b = true;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final HashMap f5419i = new HashMap();

    /* renamed from: D1.a$a, reason: collision with other inner class name */
    static final class C0125a extends AbstractC7737t implements Function1<InterfaceC2791b, Unit> {
        C0125a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2791b interfaceC2791b) {
            AbstractC2789a abstractC2789a;
            InterfaceC2791b interfaceC2791b2 = interfaceC2791b;
            if (interfaceC2791b2.N()) {
                if (interfaceC2791b2.s().f()) {
                    interfaceC2791b2.M();
                }
                Iterator it = interfaceC2791b2.s().f5419i.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    abstractC2789a = AbstractC2789a.this;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AbstractC2789a.a(abstractC2789a, (AbstractC2531a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2791b2.P());
                }
                AbstractC2810k0 g22 = interfaceC2791b2.P().g2();
                Intrinsics.f(g22);
                while (!g22.equals(abstractC2789a.e().P())) {
                    for (AbstractC2531a abstractC2531a : abstractC2789a.d(g22).keySet()) {
                        AbstractC2789a.a(abstractC2789a, abstractC2531a, abstractC2789a.h(g22, abstractC2531a), g22);
                    }
                    g22 = g22.g2();
                    Intrinsics.f(g22);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2789a(InterfaceC2791b interfaceC2791b) {
        this.f5411a = (B1.m0) interfaceC2791b;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [B1.m0, D1.b] */
    public static final void a(AbstractC2789a abstractC2789a, AbstractC2531a abstractC2531a, int i11, AbstractC2810k0 abstractC2810k0) {
        abstractC2789a.getClass();
        float f7 = i11;
        long a11 = P9.a.a(f7, f7);
        while (true) {
            a11 = abstractC2789a.c(abstractC2810k0, a11);
            abstractC2810k0 = abstractC2810k0.g2();
            Intrinsics.f(abstractC2810k0);
            if (abstractC2810k0.equals(abstractC2789a.f5411a.P())) {
                break;
            } else if (abstractC2789a.d(abstractC2810k0).containsKey(abstractC2531a)) {
                float h11 = abstractC2789a.h(abstractC2810k0, abstractC2531a);
                a11 = P9.a.a(h11, h11);
            }
        }
        int round = Math.round(abstractC2531a instanceof C2551u ? C7459e.h(a11) : C7459e.g(a11));
        HashMap hashMap = abstractC2789a.f5419i;
        if (hashMap.containsKey(abstractC2531a)) {
            int intValue = ((Number) kotlin.collections.U.e(hashMap, abstractC2531a)).intValue();
            int i12 = C2533b.f2097c;
            round = abstractC2531a.a().invoke(Integer.valueOf(intValue), Integer.valueOf(round)).intValue();
        }
        hashMap.put(abstractC2531a, Integer.valueOf(round));
    }

    protected abstract long c(@NotNull AbstractC2810k0 abstractC2810k0, long j11);

    @NotNull
    protected abstract Map<AbstractC2531a, Integer> d(@NotNull AbstractC2810k0 abstractC2810k0);

    /* JADX WARN: Type inference failed for: r0v0, types: [B1.m0, D1.b] */
    @NotNull
    public final InterfaceC2791b e() {
        return this.f5411a;
    }

    public final boolean f() {
        return this.f5412b;
    }

    @NotNull
    public final HashMap g() {
        return this.f5419i;
    }

    protected abstract int h(@NotNull AbstractC2810k0 abstractC2810k0, @NotNull AbstractC2531a abstractC2531a);

    public final boolean i() {
        return this.f5413c || this.f5415e || this.f5416f || this.f5417g;
    }

    public final boolean j() {
        n();
        return this.f5418h != null;
    }

    public final boolean k() {
        return this.f5414d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [B1.m0, D1.b] */
    public final void l() {
        this.f5412b = true;
        ?? r02 = this.f5411a;
        InterfaceC2791b G11 = r02.G();
        if (G11 == null) {
            return;
        }
        if (this.f5413c) {
            G11.A();
        } else if (this.f5415e || this.f5414d) {
            G11.requestLayout();
        }
        if (this.f5416f) {
            r02.A();
        }
        if (this.f5417g) {
            r02.requestLayout();
        }
        G11.s().l();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [B1.m0, D1.b] */
    public final void m() {
        HashMap hashMap = this.f5419i;
        hashMap.clear();
        C0125a c0125a = new C0125a();
        ?? r22 = this.f5411a;
        r22.b0(c0125a);
        hashMap.putAll(d(r22.P()));
        this.f5412b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [B1.m0, D1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        AbstractC2789a s11;
        AbstractC2789a s12;
        boolean i11 = i();
        ?? r12 = this.f5411a;
        InterfaceC2791b interfaceC2791b = r12;
        if (!i11) {
            InterfaceC2791b G11 = r12.G();
            if (G11 == null) {
                return;
            }
            InterfaceC2791b interfaceC2791b2 = G11.s().f5418h;
            if (interfaceC2791b2 != null) {
                boolean i12 = interfaceC2791b2.s().i();
                interfaceC2791b = interfaceC2791b2;
            }
            InterfaceC2791b interfaceC2791b3 = this.f5418h;
            if (interfaceC2791b3 == null || interfaceC2791b3.s().i()) {
                return;
            }
            InterfaceC2791b G12 = interfaceC2791b3.G();
            if (G12 != null && (s12 = G12.s()) != null) {
                s12.n();
            }
            InterfaceC2791b G13 = interfaceC2791b3.G();
            interfaceC2791b = (G13 == null || (s11 = G13.s()) == null) ? null : s11.f5418h;
        }
        this.f5418h = interfaceC2791b;
    }

    public final void o() {
        this.f5412b = true;
        this.f5413c = false;
        this.f5415e = false;
        this.f5414d = false;
        this.f5416f = false;
        this.f5417g = false;
        this.f5418h = null;
    }

    public final void p(boolean z11) {
        this.f5415e = z11;
    }

    public final void q(boolean z11) {
        this.f5417g = z11;
    }

    public final void r(boolean z11) {
        this.f5416f = z11;
    }

    public final void s(boolean z11) {
        this.f5414d = z11;
    }

    public final void t(boolean z11) {
        this.f5413c = z11;
    }
}
