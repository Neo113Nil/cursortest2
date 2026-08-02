package x;

import E.C0110o;
import b4.EnumC0510a;
import c4.AbstractC0547h;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class N0 extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public Object f20676l;

    /* renamed from: m, reason: collision with root package name */
    public Object f20677m;

    /* renamed from: n, reason: collision with root package name */
    public kotlin.jvm.internal.w f20678n;

    /* renamed from: o, reason: collision with root package name */
    public long f20679o;

    /* renamed from: p, reason: collision with root package name */
    public int f20680p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f20681q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f20682r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i4.f f20683s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0110o f20684t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ T f20685u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(InterfaceC2280u interfaceC2280u, i4.f fVar, C0110o c0110o, T t5, a4.c cVar) {
        super(cVar);
        this.f20682r = interfaceC2280u;
        this.f20683s = fVar;
        this.f20684t = c0110o;
        this.f20685u = t5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        N0 n02 = new N0(this.f20682r, this.f20683s, this.f20684t, this.f20685u, cVar);
        n02.f20681q = obj;
        return n02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (x.Q0.a(r2, r14) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r1.h(r12, r2, r14) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124 A[Catch: l -> 0x013c, TryCatch #3 {l -> 0x013c, blocks: (B:36:0x00be, B:37:0x011e, B:39:0x0124, B:40:0x012d), top: B:35:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d A[Catch: l -> 0x013c, TRY_LEAVE, TryCatch #3 {l -> 0x013c, blocks: (B:36:0x00be, B:37:0x011e, B:39:0x0124, B:40:0x012d), top: B:35:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b3;
        t0.E e3;
        t0.s sVar;
        kotlin.jvm.internal.w wVar;
        long j5;
        kotlin.jvm.internal.w wVar2;
        kotlin.jvm.internal.w wVar3;
        Object obj2;
        Object obj3;
        t0.E e5;
        kotlin.jvm.internal.w wVar4;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20680p;
        C0110o c0110o = this.f20684t;
        T t5 = this.f20685u;
        InterfaceC2280u interfaceC2280u = this.f20682r;
        i4.f fVar = this.f20683s;
        I.O o5 = c0110o.f1243m;
        switch (i) {
            case 0:
                G4.l.N(obj);
                t0.E e6 = (t0.E) this.f20681q;
                this.f20681q = e6;
                this.f20680p = 1;
                b3 = Q0.b(e6, (r3 & 1) != 0, t0.k.f19490l, this);
                if (b3 != enumC0510a) {
                    e3 = e6;
                    obj = b3;
                    sVar = (t0.s) obj;
                    sVar.a();
                    AbstractC2282w.p(interfaceC2280u, null, new C0(t5, null), 3);
                    if (fVar != Q0.f20706a) {
                        AbstractC2282w.p(interfaceC2280u, null, new D0(fVar, t5, sVar, null), 3);
                    }
                    wVar = new kotlin.jvm.internal.w();
                    j5 = 4611686018427387903L;
                    try {
                        E0 e02 = new E0(null);
                        this.f20681q = e3;
                        this.f20676l = sVar;
                        this.f20677m = wVar;
                        this.f20678n = wVar;
                        this.f20679o = 4611686018427387903L;
                        this.f20680p = 2;
                        obj = e3.h(4611686018427387903L, e02, this);
                    } catch (t0.l unused) {
                        wVar2 = wVar;
                        this.f20681q = e3;
                        this.f20676l = wVar2;
                        this.f20677m = null;
                        this.f20678n = null;
                        this.f20679o = j5;
                        this.f20680p = 3;
                        if (Q0.a(e3, this) != enumC0510a) {
                            wVar3 = wVar2;
                            AbstractC2282w.p(interfaceC2280u, null, new H0(t5, null), 3);
                            wVar2 = wVar3;
                            obj3 = wVar2.f17624k;
                            if (obj3 != null) {
                            }
                            return W3.o.f6046a;
                        }
                        return enumC0510a;
                    }
                    if (obj != enumC0510a) {
                        wVar2 = wVar;
                        wVar.f17624k = obj;
                        obj2 = wVar2.f17624k;
                        if (obj2 != null) {
                            AbstractC2282w.p(interfaceC2280u, null, new F0(t5, null), 3);
                        } else {
                            ((t0.s) obj2).a();
                            AbstractC2282w.p(interfaceC2280u, null, new G0(t5, null), 3);
                        }
                        obj3 = wVar2.f17624k;
                        if (obj3 != null) {
                            o5.o();
                        }
                        return W3.o.f6046a;
                    }
                }
                return enumC0510a;
            case 1:
                t0.E e7 = (t0.E) this.f20681q;
                G4.l.N(obj);
                e3 = e7;
                sVar = (t0.s) obj;
                sVar.a();
                AbstractC2282w.p(interfaceC2280u, null, new C0(t5, null), 3);
                if (fVar != Q0.f20706a) {
                }
                wVar = new kotlin.jvm.internal.w();
                j5 = 4611686018427387903L;
                E0 e022 = new E0(null);
                this.f20681q = e3;
                this.f20676l = sVar;
                this.f20677m = wVar;
                this.f20678n = wVar;
                this.f20679o = 4611686018427387903L;
                this.f20680p = 2;
                obj = e3.h(4611686018427387903L, e022, this);
                if (obj != enumC0510a) {
                }
                return enumC0510a;
            case 2:
                j5 = this.f20679o;
                wVar = this.f20678n;
                wVar2 = (kotlin.jvm.internal.w) this.f20677m;
                e3 = (t0.E) this.f20681q;
                try {
                    G4.l.N(obj);
                    wVar.f17624k = obj;
                    obj2 = wVar2.f17624k;
                    if (obj2 != null) {
                    }
                } catch (t0.l unused2) {
                    this.f20681q = e3;
                    this.f20676l = wVar2;
                    this.f20677m = null;
                    this.f20678n = null;
                    this.f20679o = j5;
                    this.f20680p = 3;
                    if (Q0.a(e3, this) != enumC0510a) {
                    }
                    return enumC0510a;
                }
                obj3 = wVar2.f17624k;
                if (obj3 != null) {
                }
                return W3.o.f6046a;
            case 3:
                wVar3 = (kotlin.jvm.internal.w) this.f20676l;
                G4.l.N(obj);
                AbstractC2282w.p(interfaceC2280u, null, new H0(t5, null), 3);
                wVar2 = wVar3;
                obj3 = wVar2.f17624k;
                if (obj3 != null) {
                }
                return W3.o.f6046a;
            case 4:
                long j6 = this.f20679o;
                kotlin.jvm.internal.w wVar5 = (kotlin.jvm.internal.w) this.f20676l;
                t0.E e8 = (t0.E) this.f20681q;
                G4.l.N(obj);
                t0.s sVar2 = (t0.s) obj;
                if (sVar2 != null) {
                    AbstractC2282w.p(interfaceC2280u, null, new I0(t5, null), 3);
                    if (fVar != Q0.f20706a) {
                        AbstractC2282w.p(interfaceC2280u, null, new J0(fVar, t5, sVar2, null), 3);
                    }
                    try {
                        M0 m02 = new M0(this.f20682r, c0110o, wVar5, t5, null);
                        this.f20681q = e8;
                        this.f20676l = wVar5;
                        this.f20677m = sVar2;
                        this.f20680p = 5;
                        break;
                    } catch (t0.l unused3) {
                        e5 = e8;
                        wVar4 = wVar5;
                        long j7 = ((t0.s) wVar4.f17624k).f19502c;
                        o5.o();
                        this.f20681q = null;
                        this.f20676l = null;
                        this.f20677m = null;
                        this.f20680p = 6;
                        break;
                    }
                } else {
                    long j8 = ((t0.s) wVar5.f17624k).f19502c;
                    o5.o();
                }
                return W3.o.f6046a;
            case 5:
                wVar4 = (kotlin.jvm.internal.w) this.f20676l;
                e5 = (t0.E) this.f20681q;
                try {
                    G4.l.N(obj);
                } catch (t0.l unused4) {
                    long j72 = ((t0.s) wVar4.f17624k).f19502c;
                    o5.o();
                    this.f20681q = null;
                    this.f20676l = null;
                    this.f20677m = null;
                    this.f20680p = 6;
                    break;
                }
                return W3.o.f6046a;
            case 6:
                G4.l.N(obj);
                AbstractC2282w.p(interfaceC2280u, null, new B0(t5, null), 3);
                return W3.o.f6046a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
