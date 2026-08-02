package F;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0547h;
import h0.C1988b;
import java.util.List;
import t0.E;
import t0.j;
import t0.k;
import t0.r;
import t0.s;
import x.Q0;

/* loaded from: classes.dex */
public final class a extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public s f1503l;

    /* renamed from: m, reason: collision with root package name */
    public k f1504m;

    /* renamed from: n, reason: collision with root package name */
    public int f1505n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1506o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f1507p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, a4.c cVar) {
        super(cVar);
        this.f1507p = dVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        a aVar = new a(this.f1507p, cVar);
        aVar.f1506o = obj;
        return aVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x014d, code lost:
    
        if (r6 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0056, code lost:
    
        if (r11 == r1) goto L67;
     */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014d -> B:7:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00bc -> B:28:0x00c0). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        E e3;
        Object b3;
        E e5;
        k kVar;
        s sVar;
        Object b5;
        E e6;
        Object obj2;
        E e7;
        s sVar2;
        Object b6;
        Object obj3;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1505n;
        d dVar = this.f1507p;
        o oVar = o.f6046a;
        k kVar2 = k.f19489k;
        int i5 = 2;
        if (i == 0) {
            l.N(obj);
            e3 = (E) this.f1506o;
            this.f1506o = e3;
            this.f1505n = 1;
            b3 = Q0.b(e3, true, kVar2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = this.f1503l;
                    e7 = (E) this.f1506o;
                    l.N(obj);
                    b6 = obj;
                    ?? r6 = ((j) b6).f19485a;
                    int size = r6.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            obj3 = null;
                            break;
                        }
                        obj3 = r6.get(i6);
                        s sVar3 = (s) obj3;
                        if (!sVar3.b()) {
                            if (r.a(sVar3.f19500a, sVar2.f19500a) && sVar3.f19503d) {
                                break;
                            }
                        }
                        i6++;
                    }
                    s sVar4 = (s) obj3;
                    if (sVar4 != null) {
                        sVar4.a();
                        this.f1506o = e7;
                        this.f1503l = sVar2;
                        this.f1504m = null;
                        this.f1505n = 3;
                        b6 = e7.b(kVar2, this);
                    }
                    return oVar;
                }
                kVar = this.f1504m;
                sVar = this.f1503l;
                e5 = (E) this.f1506o;
                l.N(obj);
                b5 = obj;
                ?? r8 = ((j) b5).f19485a;
                int size2 = r8.size();
                int i7 = 0;
                List list = r8;
                while (true) {
                    if (i7 >= size2) {
                        e6 = e5;
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i7);
                    s sVar5 = (s) obj2;
                    List list2 = list;
                    if (!sVar5.b()) {
                        e6 = e5;
                        if (r.a(sVar5.f19500a, sVar.f19500a) && sVar5.f19503d) {
                            break;
                        }
                    } else {
                        e6 = e5;
                    }
                    i7++;
                    e5 = e6;
                    list = list2;
                }
                s sVar6 = (s) obj2;
                if (sVar6 != null) {
                    if (sVar6.f19501b - sVar.f19501b < e6.f().c()) {
                        if (C1988b.c(C1988b.g(sVar6.f19502c, sVar.f19502c)) <= e6.f().e()) {
                            e5 = e6;
                            i5 = 2;
                            this.f1506o = e5;
                            this.f1503l = sVar;
                            this.f1504m = kVar;
                            this.f1505n = i5;
                            b5 = e5.b(kVar, this);
                        }
                        if (sVar6 != null && ((Boolean) dVar.f1515A.invoke()).booleanValue()) {
                            sVar6.a();
                            e7 = e6;
                            sVar2 = sVar;
                            this.f1506o = e7;
                            this.f1503l = sVar2;
                            this.f1504m = null;
                            this.f1505n = 3;
                            b6 = e7.b(kVar2, this);
                        }
                        return oVar;
                    }
                }
                sVar6 = null;
                if (sVar6 != null) {
                    sVar6.a();
                    e7 = e6;
                    sVar2 = sVar;
                    this.f1506o = e7;
                    this.f1503l = sVar2;
                    this.f1504m = null;
                    this.f1505n = 3;
                    b6 = e7.b(kVar2, this);
                }
                return oVar;
            }
            e3 = (E) this.f1506o;
            l.N(obj);
            b3 = obj;
        }
        s sVar7 = (s) b3;
        int i8 = sVar7.i;
        if (i8 == 3 || i8 == 4) {
            long j5 = sVar7.f19502c;
            e5 = e3;
            kVar = (dVar.f1516B || ((C1988b.d(j5) > 0.0f ? 1 : (C1988b.d(j5) == 0.0f ? 0 : -1)) >= 0 && (C1988b.d(j5) > ((float) ((int) (e3.f19444p.f19457I >> 32))) ? 1 : (C1988b.d(j5) == ((float) ((int) (e3.f19444p.f19457I >> 32))) ? 0 : -1)) < 0 && (C1988b.e(j5) > 0.0f ? 1 : (C1988b.e(j5) == 0.0f ? 0 : -1)) >= 0 && (C1988b.e(j5) > ((float) ((int) (e3.f19444p.f19457I & 4294967295L))) ? 1 : (C1988b.e(j5) == ((float) ((int) (e3.f19444p.f19457I & 4294967295L))) ? 0 : -1)) < 0)) ? kVar2 : k.f19490l;
            sVar = sVar7;
            this.f1506o = e5;
            this.f1503l = sVar;
            this.f1504m = kVar;
            this.f1505n = i5;
            b5 = e5.b(kVar, this);
        }
        return oVar;
    }
}
