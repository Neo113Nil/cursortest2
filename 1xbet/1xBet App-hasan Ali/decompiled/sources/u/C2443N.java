package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p4.InterfaceC2280u;

/* renamed from: u.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2443N extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public x4.a f19689k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19690l;

    /* renamed from: m, reason: collision with root package name */
    public C2444O f19691m;

    /* renamed from: n, reason: collision with root package name */
    public int f19692n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f19693o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2444O f19694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f19695q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2443N(C2444O c2444o, i4.c cVar, a4.c cVar2) {
        super(2, cVar2);
        this.f19694p = c2444o;
        this.f19695q = (AbstractC0548i) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c4.i, i4.c] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2443N c2443n = new C2443N(this.f19694p, this.f19695q, cVar);
        c2443n.f19693o = obj;
        return c2443n;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2443N) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [i4.c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [x4.a] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        C2444O c2444o;
        ?? r22;
        C2442M c2442m;
        x4.c cVar;
        x4.a aVar;
        C2444O c2444o2;
        Throwable th;
        C2442M c2442m2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        ?? r1 = this.f19692n;
        try {
            try {
                if (r1 == 0) {
                    G4.l.N(obj);
                    a4.f l5 = ((InterfaceC2280u) this.f19693o).i().l(p4.r.f18819l);
                    kotlin.jvm.internal.l.c(l5);
                    C2442M c2442m3 = new C2442M((p4.U) l5);
                    while (true) {
                        c2444o = this.f19694p;
                        AtomicReference atomicReference3 = c2444o.f19696a;
                        C2442M c2442m4 = (C2442M) atomicReference3.get();
                        if (c2442m4 != null && 1 - 1 < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c2442m4, c2442m3)) {
                            if (atomicReference3.get() != c2442m4) {
                                break;
                            }
                        }
                        if (c2442m4 != null) {
                            c2442m4.f19688a.d(new t4.o("Mutation interrupted", 1));
                        }
                        this.f19693o = c2442m3;
                        x4.c cVar2 = c2444o.f19697b;
                        this.f19689k = cVar2;
                        AbstractC0548i abstractC0548i = this.f19695q;
                        this.f19690l = abstractC0548i;
                        this.f19691m = c2444o;
                        this.f19692n = 1;
                        if (cVar2.c(this) != enumC0510a) {
                            r22 = abstractC0548i;
                            c2442m = c2442m3;
                            cVar = cVar2;
                        }
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2444o2 = (C2444O) this.f19690l;
                        aVar = this.f19689k;
                        c2442m2 = (C2442M) this.f19693o;
                        try {
                            G4.l.N(obj);
                            atomicReference2 = c2444o2.f19696a;
                            while (!atomicReference2.compareAndSet(c2442m2, null) && atomicReference2.get() == c2442m2) {
                            }
                            ((x4.c) aVar).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = c2444o2.f19696a;
                            while (!atomicReference.compareAndSet(c2442m2, null)) {
                            }
                            throw th;
                        }
                    }
                    C2444O c2444o3 = this.f19691m;
                    i4.c cVar3 = (i4.c) this.f19690l;
                    ?? r5 = this.f19689k;
                    c2442m = (C2442M) this.f19693o;
                    G4.l.N(obj);
                    c2444o = c2444o3;
                    r22 = cVar3;
                    cVar = r5;
                }
                this.f19693o = c2442m;
                this.f19689k = aVar;
                this.f19690l = c2444o;
                this.f19691m = null;
                this.f19692n = 2;
                Object c5 = r22.c(this);
                if (c5 != enumC0510a) {
                    c2444o2 = c2444o;
                    obj = c5;
                    c2442m2 = c2442m;
                    atomicReference2 = c2444o2.f19696a;
                    while (!atomicReference2.compareAndSet(c2442m2, null)) {
                    }
                    ((x4.c) aVar).d(null);
                    return obj;
                }
                return enumC0510a;
            } catch (Throwable th3) {
                c2444o2 = c2444o;
                th = th3;
                c2442m2 = c2442m;
                atomicReference = c2444o2.f19696a;
                while (!atomicReference.compareAndSet(c2442m2, null) && atomicReference.get() == c2442m2) {
                }
                throw th;
            }
            aVar = cVar;
        } catch (Throwable th4) {
            ((x4.c) r1).d(null);
            throw th4;
        }
    }
}
