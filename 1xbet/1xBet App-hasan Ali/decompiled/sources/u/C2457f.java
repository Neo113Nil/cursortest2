package u;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public r4.b f19805k;

    /* renamed from: l, reason: collision with root package name */
    public int f19806l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19807m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r4.g f19808n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2451c f19809o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19810p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19811q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457f(r4.g gVar, C2451c c2451c, InterfaceC0289e0 interfaceC0289e0, InterfaceC0289e0 interfaceC0289e02, a4.c cVar) {
        super(2, cVar);
        this.f19808n = gVar;
        this.f19809o = c2451c;
        this.f19810p = interfaceC0289e0;
        this.f19811q = interfaceC0289e02;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2457f c2457f = new C2457f(this.f19808n, this.f19809o, this.f19810p, this.f19811q, cVar);
        c2457f.f19807m = obj;
        return c2457f;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2457f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r4.b it;
        InterfaceC2280u interfaceC2280u;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19806l;
        r4.g gVar = this.f19808n;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u2 = (InterfaceC2280u) this.f19807m;
            it = gVar.iterator();
            interfaceC2280u = interfaceC2280u2;
            this.f19807m = interfaceC2280u;
            this.f19805k = it;
            this.f19806l = 1;
            obj = it.a(this);
            if (obj == enumC0510a) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f19805k;
            interfaceC2280u = (InterfaceC2280u) this.f19807m;
            G4.l.N(obj);
            if (((Boolean) obj).booleanValue()) {
                Object c5 = it.c();
                Object o5 = gVar.o();
                if (o5 instanceof r4.i) {
                    o5 = null;
                }
                AbstractC2282w.p(interfaceC2280u, null, new C2455e(o5 == null ? c5 : o5, this.f19809o, this.f19810p, this.f19811q, null), 3);
                this.f19807m = interfaceC2280u;
                this.f19805k = it;
                this.f19806l = 1;
                obj = it.a(this);
                if (obj == enumC0510a) {
                    return enumC0510a;
                }
                if (((Boolean) obj).booleanValue()) {
                    return W3.o.f6046a;
                }
            }
        }
    }
}
