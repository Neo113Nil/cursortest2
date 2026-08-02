package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import y.C2654j;
import y.C2655k;
import y.InterfaceC2653i;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2509d extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public boolean f20215k;

    /* renamed from: l, reason: collision with root package name */
    public int f20216l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x.T f20218n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f20219o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2654j f20220p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2503A f20221q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2509d(x.T t5, long j5, C2654j c2654j, C2503A c2503a, a4.c cVar) {
        super(2, cVar);
        this.f20218n = t5;
        this.f20219o = j5;
        this.f20220p = c2654j;
        this.f20221q = c2503a;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2509d c2509d = new C2509d(this.f20218n, this.f20219o, this.f20220p, this.f20221q, cVar);
        c2509d.f20217m = obj;
        return c2509d;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2509d) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (r11.a(r2, r18) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r11.a(r4, r18) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p4.U p5;
        Object b3;
        boolean z3;
        y.m mVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20216l;
        W3.o oVar = W3.o.f6046a;
        C2503A c2503a = this.f20221q;
        C2654j c2654j = this.f20220p;
        if (i == 0) {
            G4.l.N(obj);
            p5 = AbstractC2282w.p((InterfaceC2280u) this.f20217m, null, new C2508c(this.f20221q, this.f20219o, this.f20220p, null), 3);
            this.f20217m = p5;
            this.f20216l = 1;
            b3 = this.f20218n.b(this);
        } else if (i == 1) {
            p5 = (p4.U) this.f20217m;
            G4.l.N(obj);
            b3 = obj;
        } else {
            if (i == 2) {
                z3 = this.f20215k;
                G4.l.N(obj);
                if (z3) {
                    y.l lVar = new y.l(this.f20219o);
                    y.m mVar2 = new y.m(lVar);
                    this.f20217m = mVar2;
                    this.f20216l = 3;
                    if (c2654j.a(lVar, this) != enumC0510a) {
                        mVar = mVar2;
                        this.f20217m = null;
                        this.f20216l = 4;
                    }
                    return enumC0510a;
                }
                c2503a.K = null;
                return oVar;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                c2503a.K = null;
                return oVar;
            }
            mVar = (y.m) this.f20217m;
            G4.l.N(obj);
            this.f20217m = null;
            this.f20216l = 4;
        }
        boolean booleanValue = ((Boolean) b3).booleanValue();
        if (!p5.b()) {
            y.l lVar2 = c2503a.K;
            if (lVar2 != null) {
                InterfaceC2653i mVar3 = booleanValue ? new y.m(lVar2) : new C2655k(lVar2);
                this.f20217m = null;
                this.f20216l = 5;
            }
            c2503a.K = null;
            return oVar;
        }
        this.f20217m = null;
        this.f20215k = booleanValue;
        this.f20216l = 2;
        p5.d(null);
        Object h3 = p5.h(this);
        if (h3 != enumC0510a) {
            h3 = oVar;
        }
        if (h3 != enumC0510a) {
            z3 = booleanValue;
            if (z3) {
            }
            c2503a.K = null;
            return oVar;
        }
        return enumC0510a;
    }
}
