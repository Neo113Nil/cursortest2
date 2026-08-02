package x;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* renamed from: x.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610y extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public t0.j f20896l;

    /* renamed from: m, reason: collision with root package name */
    public int f20897m;

    /* renamed from: n, reason: collision with root package name */
    public int f20898n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f20900p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f20901q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2610y(kotlin.jvm.internal.w wVar, kotlin.jvm.internal.w wVar2, a4.c cVar) {
        super(cVar);
        this.f20900p = wVar;
        this.f20901q = wVar2;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2610y c2610y = new C2610y(this.f20900p, this.f20901q, cVar);
        c2610y.f20899o = obj;
        return c2610y;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2610y) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[EDGE_INSN: B:67:0x00c3->B:13:0x00c3 BREAK  A[LOOP:0: B:7:0x00b0->B:10:0x00c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a4 -> B:6:0x00a7). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        int i;
        Object obj2;
        Object b3;
        t0.E e5;
        t0.j jVar;
        int size;
        int i5;
        boolean d5;
        Object obj3;
        Object obj4;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i6 = this.f20898n;
        int i7 = 1;
        int i8 = 2;
        t0.j jVar2 = null;
        if (i6 == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f20899o;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i6 == 1) {
                i = this.f20897m;
                e3 = (t0.E) this.f20899o;
                G4.l.N(obj);
                obj2 = obj;
                t0.j jVar3 = (t0.j) obj2;
                ?? r9 = jVar3.f19485a;
                int size2 = r9.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        i = i7;
                        break;
                    }
                    if (!t0.q.c((t0.s) r9.get(i9))) {
                        break;
                    }
                    i9++;
                }
                ?? r92 = jVar3.f19485a;
                int size3 = r92.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    t0.s sVar = (t0.s) r92.get(i10);
                    if (sVar.b() || t0.q.d(sVar, e3.f19444p.f19457I, e3.e())) {
                        break;
                    }
                }
                t0.k kVar = t0.k.f19491m;
                this.f20899o = e3;
                this.f20896l = jVar3;
                this.f20897m = i;
                this.f20898n = i8;
                b3 = e3.b(kVar, this);
                if (b3 != enumC0510a) {
                    e5 = e3;
                    jVar = jVar3;
                    ?? r5 = ((t0.j) b3).f19485a;
                    size = r5.size();
                    i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                        }
                        i5++;
                    }
                    kotlin.jvm.internal.w wVar = this.f20900p;
                    d5 = AbstractC2557C.d(jVar, ((t0.s) wVar.f17624k).f19500a);
                    kotlin.jvm.internal.w wVar2 = this.f20901q;
                    ?? r7 = jVar.f19485a;
                    if (d5) {
                    }
                    e3 = e5;
                    i7 = 1;
                    i8 = 2;
                    jVar2 = null;
                    if (i == 0) {
                    }
                }
                return enumC0510a;
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f20897m;
            jVar = this.f20896l;
            e5 = (t0.E) this.f20899o;
            G4.l.N(obj);
            b3 = obj;
            ?? r52 = ((t0.j) b3).f19485a;
            size = r52.size();
            i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                if (((t0.s) r52.get(i5)).b()) {
                    i = i7;
                    break;
                }
                i5++;
            }
            kotlin.jvm.internal.w wVar3 = this.f20900p;
            d5 = AbstractC2557C.d(jVar, ((t0.s) wVar3.f17624k).f19500a);
            kotlin.jvm.internal.w wVar22 = this.f20901q;
            ?? r72 = jVar.f19485a;
            if (d5) {
                int size4 = r72.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r72.get(i11);
                    if (t0.r.a(((t0.s) obj3).f19500a, ((t0.s) wVar3.f17624k).f19500a)) {
                        break;
                    }
                    i11++;
                }
                wVar22.f17624k = obj3;
            } else {
                int size5 = r72.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = r72.get(i12);
                    if (((t0.s) obj4).f19503d) {
                        break;
                    }
                    i12++;
                }
                t0.s sVar2 = (t0.s) obj4;
                if (sVar2 != null) {
                    wVar3.f17624k = sVar2;
                    wVar22.f17624k = sVar2;
                } else {
                    i = i7;
                    e3 = e5;
                    jVar2 = null;
                    if (i == 0) {
                        return W3.o.f6046a;
                    }
                    t0.k kVar2 = t0.k.f19490l;
                    this.f20899o = e3;
                    this.f20896l = jVar2;
                    this.f20897m = i;
                    this.f20898n = i7;
                    obj2 = e3.b(kVar2, this);
                }
            }
            e3 = e5;
            i7 = 1;
            i8 = 2;
            jVar2 = null;
            if (i == 0) {
            }
        }
    }
}
