package E;

import b4.EnumC0510a;
import c4.AbstractC0547h;
import x.Q0;

/* renamed from: E.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098f0 extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public t0.s f1140l;

    /* renamed from: m, reason: collision with root package name */
    public int f1141m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1142n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1143o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098f0(InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(cVar);
        this.f1143o = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0098f0 c0098f0 = new C0098f0(this.f1143o, cVar);
        c0098f0.f1142n = obj;
        return c0098f0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0098f0) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        t0.E e5;
        t0.s sVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1141m;
        InterfaceC0104i0 interfaceC0104i0 = this.f1143o;
        if (i == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f1142n;
            this.f1142n = e3;
            this.f1141m = 1;
            obj = Q0.b(e3, (r3 & 1) != 0, t0.k.f19490l, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f1140l;
                e5 = (t0.E) this.f1142n;
                G4.l.N(obj);
                ?? r13 = ((t0.j) obj).f19485a;
                int size = r13.size();
                for (int i5 = 0; i5 < size; i5++) {
                    t0.s sVar2 = (t0.s) r13.get(i5);
                    if (t0.r.a(sVar2.f19500a, sVar.f19500a) && sVar2.f19503d) {
                        this.f1142n = e5;
                        this.f1140l = sVar;
                        this.f1141m = 2;
                        obj = e5.b(t0.k.f19490l, this);
                    }
                }
                interfaceC0104i0.b();
                return W3.o.f6046a;
            }
            e3 = (t0.E) this.f1142n;
            G4.l.N(obj);
        }
        t0.s sVar3 = (t0.s) obj;
        long j5 = sVar3.f19502c;
        interfaceC0104i0.d();
        e5 = e3;
        sVar = sVar3;
        this.f1142n = e5;
        this.f1140l = sVar;
        this.f1141m = 2;
        obj = e5.b(t0.k.f19490l, this);
    }
}
