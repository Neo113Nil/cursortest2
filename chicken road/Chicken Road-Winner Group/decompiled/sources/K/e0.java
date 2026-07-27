package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.C1240t;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class e0 extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public L f837e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D0.a f838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(D0.a aVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f838g = aVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new e0(this.f838g, interfaceC0319c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r3 != y2.d.f10613n) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        r13 = w2.AbstractC1242v.d(F2.b.y(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        r3 = r8.A(r9, r10, r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        if (r3 != r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r13.a(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015e, code lost:
    
        r3 = r13.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016a, code lost:
    
        if (r3 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (r3 != r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dc, code lost:
    
        if (r11 >= r8.p()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        r3 = (y2.j) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r8.r(r14.get(r8), true) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        r11 = r15.getAndIncrement(r8);
        r6 = y2.d.f10602b;
        r9 = r11 / r6;
        r6 = (int) (r11 % r6);
        r18 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r3.f181c == r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r4 = r8.k(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (r4 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        r3 = r8.A(r9, r6, r11, r13);
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012c, code lost:
    
        if (r3 != y2.d.f10612m) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r3 != y2.d.f10614o) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
    
        if (r11 >= r8.p()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
    
        r5 = r18;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        if (r3 == y2.d.f10613n) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0149, code lost:
    
        r4.a();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
    
        r13.A(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        throw new java.lang.IllegalStateException(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012e, code lost:
    
        r13.a(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x011d, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0123, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f6, code lost:
    
        r13.e(X0.a.n(r8.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0159, code lost:
    
        r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0163, code lost:
    
        r13.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0166, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0167, code lost:
    
        r9.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0189  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0179 -> B:6:0x017b). Please report as a decompilation issue!!! */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        D0.a aVar;
        Object obj2;
        L l3;
        D0.a aVar2;
        w2.P p3;
        y2.b bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object obj3 = EnumC0326a.f4994a;
        int i3 = this.f;
        boolean z3 = true;
        D0.a aVar3 = this.f838g;
        if (i3 == 0) {
            X0.a.L(obj);
            if (((AtomicInteger) ((J1.i) aVar3.f264d).f729b).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            p3 = (w2.P) ((InterfaceC1241u) aVar3.f261a).d().k(C1240t.f10525b);
            if (p3 == null) {
            }
            l3 = (L) aVar3.f262b;
            bVar = (y2.b) aVar3.f263c;
            this.f837e = l3;
            this.f = z3 ? 1 : 0;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.b.f10595g;
            y2.j jVar = (y2.j) atomicReferenceFieldUpdater.get(bVar);
            while (true) {
                atomicLongFieldUpdater = y2.b.f10591b;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), z3)) {
                }
                aVar3 = aVar;
                z3 = true;
            }
        } else {
            if (i3 == 1) {
                l3 = this.f837e;
                X0.a.L(obj);
                obj2 = obj;
                aVar = aVar3;
                this.f837e = null;
                this.f = 2;
                if (l3.invoke(obj2, this) != obj3) {
                    aVar2 = aVar;
                    if (((AtomicInteger) ((J1.i) aVar2.f264d).f729b).decrementAndGet() != 0) {
                    }
                }
                return obj3;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            aVar2 = aVar3;
            if (((AtomicInteger) ((J1.i) aVar2.f264d).f729b).decrementAndGet() != 0) {
                return C0279i.f4852a;
            }
            aVar3 = aVar2;
            z3 = true;
            p3 = (w2.P) ((InterfaceC1241u) aVar3.f261a).d().k(C1240t.f10525b);
            if (p3 == null && !p3.a()) {
                throw ((w2.Z) p3).y();
            }
            l3 = (L) aVar3.f262b;
            bVar = (y2.b) aVar3.f263c;
            this.f837e = l3;
            this.f = z3 ? 1 : 0;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y2.b.f10595g;
            y2.j jVar2 = (y2.j) atomicReferenceFieldUpdater2.get(bVar);
            while (true) {
                atomicLongFieldUpdater = y2.b.f10591b;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), z3)) {
                    Throwable n3 = bVar.n();
                    int i4 = B2.u.f182a;
                    throw n3;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = y2.b.f10592c;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar);
                aVar = aVar3;
                long j3 = y2.d.f10602b;
                long j4 = andIncrement / j3;
                int i5 = (int) (andIncrement % j3);
                if (jVar2.f181c != j4) {
                    y2.j k3 = bVar.k(j4, jVar2);
                    if (k3 == null) {
                        continue;
                        aVar3 = aVar;
                        z3 = true;
                    } else {
                        jVar2 = k3;
                    }
                }
                obj2 = bVar.A(jVar2, i5, andIncrement, null);
                Object obj4 = y2.d.f10612m;
                String str = "unexpected";
                if (obj2 == obj4) {
                    throw new IllegalStateException("unexpected");
                }
                Object obj5 = y2.d.f10614o;
                if (obj2 != obj5) {
                    break;
                }
                if (andIncrement < bVar.p()) {
                    jVar2.a();
                }
                aVar3 = aVar;
                z3 = true;
            }
        }
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
