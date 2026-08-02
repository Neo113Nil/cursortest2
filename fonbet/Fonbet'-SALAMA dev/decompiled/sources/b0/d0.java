package b0;

import F2.W0;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class d0 extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public L f10023a;

    /* renamed from: b, reason: collision with root package name */
    public int f10024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1.g f10025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k1.g gVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10025c = gVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new d0(this.f10025c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r6 != F6.d.f2812n) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r6 = D6.E.j(P6.b.v(r21));
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r8 = r7.z(r5, r10, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        if (r8 != r13) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        r6.a(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0172, code lost:
    
        r2 = r6.r();
        r3 = j6.a.f14642a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0183, code lost:
    
        if (r2 != r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0185, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        r3 = r20;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        r2 = r7.f2798b;
        r13 = r6.f1858e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        if (r8 != r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if (r16 >= r7.o()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
    
        r4 = (F6.j) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r7.q(r15.get(r7), true) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        r16 = r13.getAndIncrement(r7);
        r8 = F6.d.f2801b;
        r10 = r16 / r8;
        r5 = (int) (r16 % r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r4.f3759c == r10) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        r8 = r7.k(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r8 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r14 = r13;
        r8 = r7.z(r4, r5, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if (r8 != F6.d.f2811m) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        if (r8 != F6.d.f2813o) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
    
        if (r16 >= r7.o()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014a, code lost:
    
        if (r8 == F6.d.f2812n) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
    
        if (r2 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0151, code lost:
    
        r3 = new I6.p(r2, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0158, code lost:
    
        r6.d(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0163, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        r6.a(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fd, code lost:
    
        r6.resumeWith(a.AbstractC0603a.h(r7.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0164, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0168, code lost:
    
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016a, code lost:
    
        r3 = new I6.p(r2, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0170, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0179, code lost:
    
        r6.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017d, code lost:
    
        r20 = r2;
        r5.a();
        r2 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01a5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0195 -> B:6:0x0197). Please report as a decompilation issue!!! */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k1.g gVar;
        k1.g gVar2;
        F6.b bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        F6.j jVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10024b;
        ?? r42 = 1;
        k1.g gVar3 = this.f10025c;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            if (((AtomicInteger) ((C1719l1) gVar3.f14677d).f17771a).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            D6.E.f(((D6.C) gVar3.f14674a).c());
            L l7 = (L) gVar3.f14675b;
            this.f10023a = l7;
            this.f10024b = r42;
            bVar = (F6.b) gVar3.f14676c;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F6.b.f2795y;
            F6.j jVar2 = (F6.j) atomicReferenceFieldUpdater.get(bVar);
            while (true) {
                atomicLongFieldUpdater = F6.b.f2790c;
                if (!bVar.q(atomicLongFieldUpdater.get(bVar), r42)) {
                }
                gVar3 = gVar;
            }
        } else if (i7 == 1) {
            L l8 = this.f10023a;
            AbstractC0603a.p0(obj);
            L l9 = l8;
            gVar = gVar3;
            L l10 = null;
            Object obj2 = obj;
            this.f10023a = l10;
            this.f10024b = 2;
            if (l9.invoke(obj2, this) == aVar) {
                return aVar;
            }
            gVar2 = gVar;
            if (((AtomicInteger) ((C1719l1) gVar2.f14677d).f17771a).decrementAndGet() != 0) {
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
            gVar2 = gVar3;
            if (((AtomicInteger) ((C1719l1) gVar2.f14677d).f17771a).decrementAndGet() != 0) {
                return C1116i.f13008a;
            }
            gVar3 = gVar2;
            r42 = 1;
            D6.E.f(((D6.C) gVar3.f14674a).c());
            L l72 = (L) gVar3.f14675b;
            this.f10023a = l72;
            this.f10024b = r42;
            bVar = (F6.b) gVar3.f14676c;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F6.b.f2795y;
            F6.j jVar22 = (F6.j) atomicReferenceFieldUpdater2.get(bVar);
            while (true) {
                atomicLongFieldUpdater = F6.b.f2790c;
                if (!bVar.q(atomicLongFieldUpdater.get(bVar), r42)) {
                    Throwable m7 = bVar.m();
                    int i8 = I6.v.f3760a;
                    throw m7;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = F6.b.f2791d;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar);
                long j = F6.d.f2801b;
                long j3 = andIncrement / j;
                int i9 = (int) (andIncrement % j);
                gVar = gVar3;
                if (jVar22.f3759c == j3) {
                    jVar = jVar22;
                } else {
                    jVar = bVar.k(j3, jVar22);
                    if (jVar == null) {
                        continue;
                        gVar3 = gVar;
                    }
                }
                Object z4 = bVar.z(jVar, i9, andIncrement, null);
                W0 w02 = F6.d.f2811m;
                if (z4 == w02) {
                    throw new IllegalStateException("unexpected");
                }
                W0 w03 = F6.d.f2813o;
                if (z4 != w03) {
                    break;
                }
                if (andIncrement < bVar.o()) {
                    jVar.a();
                }
                jVar22 = jVar;
                gVar3 = gVar;
            }
        }
    }
}
