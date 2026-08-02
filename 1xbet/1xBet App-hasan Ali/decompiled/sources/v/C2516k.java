package v;

import b4.EnumC0510a;
import c4.AbstractC0547h;
import h0.C1988b;
import java.util.ArrayList;
import n.AbstractC2107A;
import x.Q0;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2516k extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20260l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2518m f20262n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2516k(C2518m c2518m, a4.c cVar) {
        super(cVar);
        this.f20262n = c2518m;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2516k c2516k = new C2516k(this.f20262n, cVar);
        c2516k.f20261m = obj;
        return c2516k;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2516k) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0036, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0055 -> B:6:0x0058). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20260l;
        C2518m c2518m = this.f20262n;
        if (i == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f20261m;
            this.f20261m = e3;
            this.f20260l = 1;
            obj = Q0.b(e3, (r3 & 1) != 0, t0.k.f19490l, this);
        } else if (i == 1) {
            e3 = (t0.E) this.f20261m;
            G4.l.N(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e3 = (t0.E) this.f20261m;
            G4.l.N(obj);
            ?? r13 = ((t0.j) obj).f19485a;
            ArrayList arrayList = new ArrayList(r13.size());
            int size = r13.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj3 = r13.get(i6);
                if (((t0.s) obj3).f19503d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i5 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i5);
                long j5 = ((t0.s) obj2).f19500a;
                t0.r rVar = c2518m.f20272q;
                if (AbstractC2107A.A(rVar) && j5 == rVar.f19499a) {
                    break;
                }
                i5++;
            }
            t0.s sVar = (t0.s) obj2;
            if (sVar == null) {
                sVar = (t0.s) X3.m.Z(arrayList);
            }
            if (sVar != null) {
                c2518m.f20272q = new t0.r(sVar.f19500a);
                c2518m.f20266k = new C1988b(sVar.f19502c);
            }
            if (arrayList.isEmpty()) {
                c2518m.f20272q = null;
                return W3.o.f6046a;
            }
            this.f20261m = e3;
            this.f20260l = 2;
            obj = e3.b(t0.k.f19490l, this);
        }
        t0.s sVar2 = (t0.s) obj;
        c2518m.f20272q = new t0.r(sVar2.f19500a);
        c2518m.f20266k = new C1988b(sVar2.f19502c);
        this.f20261m = e3;
        this.f20260l = 2;
        obj = e3.b(t0.k.f19490l, this);
    }
}
