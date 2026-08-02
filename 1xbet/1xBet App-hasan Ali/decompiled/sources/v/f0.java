package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p4.InterfaceC2280u;
import x.C2594n;
import x.C2598p;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public x4.a f20233k;

    /* renamed from: l, reason: collision with root package name */
    public Object f20234l;

    /* renamed from: m, reason: collision with root package name */
    public C2598p f20235m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f20236n;

    /* renamed from: o, reason: collision with root package name */
    public int f20237o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20238p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d0 f20239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g0 f20240r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2594n f20241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2598p f20242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var, g0 g0Var, C2594n c2594n, C2598p c2598p, a4.c cVar) {
        super(2, cVar);
        this.f20239q = d0Var;
        this.f20240r = g0Var;
        this.f20241s = c2594n;
        this.f20242t = c2598p;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        f0 f0Var = new f0(this.f20239q, this.f20240r, this.f20241s, this.f20242t, cVar);
        f0Var.f20238p = obj;
        return f0Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        C2598p c2598p;
        e0 e0Var;
        x4.a aVar;
        i4.e eVar;
        g0 g0Var2;
        Throwable th;
        e0 e0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        ?? r1 = this.f20237o;
        try {
            try {
                if (r1 == 0) {
                    G4.l.N(obj);
                    a4.f l5 = ((InterfaceC2280u) this.f20238p).i().l(p4.r.f18819l);
                    kotlin.jvm.internal.l.c(l5);
                    e0 e0Var3 = new e0(this.f20239q, (p4.U) l5);
                    while (true) {
                        g0Var = this.f20240r;
                        AtomicReference atomicReference3 = g0Var.f20244a;
                        e0 e0Var4 = (e0) atomicReference3.get();
                        if (e0Var4 != null && e0Var3.f20228a.compareTo(e0Var4.f20228a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(e0Var4, e0Var3)) {
                            if (atomicReference3.get() != e0Var4) {
                                break;
                            }
                        }
                        if (e0Var4 != null) {
                            e0Var4.f20229b.d(new t4.o("Mutation interrupted", 2));
                        }
                        this.f20238p = e0Var3;
                        x4.c cVar = g0Var.f20245b;
                        this.f20233k = cVar;
                        C2594n c2594n = this.f20241s;
                        this.f20234l = c2594n;
                        C2598p c2598p2 = this.f20242t;
                        this.f20235m = c2598p2;
                        this.f20236n = g0Var;
                        this.f20237o = 1;
                        if (cVar.c(this) != enumC0510a) {
                            c2598p = c2598p2;
                            e0Var = e0Var3;
                            aVar = cVar;
                            eVar = c2594n;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g0Var2 = (g0) this.f20234l;
                        aVar = this.f20233k;
                        e0Var2 = (e0) this.f20238p;
                        try {
                            G4.l.N(obj);
                            atomicReference2 = g0Var2.f20244a;
                            while (!atomicReference2.compareAndSet(e0Var2, null) && atomicReference2.get() == e0Var2) {
                            }
                            ((x4.c) aVar).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = g0Var2.f20244a;
                            while (!atomicReference.compareAndSet(e0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    g0 g0Var3 = this.f20236n;
                    c2598p = this.f20235m;
                    eVar = (i4.e) this.f20234l;
                    x4.a aVar2 = this.f20233k;
                    e0Var = (e0) this.f20238p;
                    G4.l.N(obj);
                    g0Var = g0Var3;
                    aVar = aVar2;
                }
                this.f20238p = e0Var;
                this.f20233k = aVar;
                this.f20234l = g0Var;
                this.f20235m = null;
                this.f20236n = null;
                this.f20237o = 2;
                Object invoke = eVar.invoke(c2598p, this);
                if (invoke != enumC0510a) {
                    g0Var2 = g0Var;
                    obj = invoke;
                    e0Var2 = e0Var;
                    atomicReference2 = g0Var2.f20244a;
                    while (!atomicReference2.compareAndSet(e0Var2, null)) {
                    }
                    ((x4.c) aVar).d(null);
                    return obj;
                }
                return enumC0510a;
            } catch (Throwable th3) {
                g0Var2 = g0Var;
                th = th3;
                e0Var2 = e0Var;
                atomicReference = g0Var2.f20244a;
                while (!atomicReference.compareAndSet(e0Var2, null) && atomicReference.get() == e0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((x4.c) r1).d(null);
            throw th4;
        }
    }
}
