package u;

import A0.C0040k0;
import A0.Y0;
import P.AbstractC0329z;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u2.C2496k;

/* renamed from: u.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2437H extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.t f19674k;

    /* renamed from: l, reason: collision with root package name */
    public int f19675l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19676m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f19677n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2438I f19678o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437H(InterfaceC0289e0 interfaceC0289e0, C2438I c2438i, a4.c cVar) {
        super(2, cVar);
        this.f19677n = interfaceC0289e0;
        this.f19678o = c2438i;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2437H c2437h = new C2437H(this.f19677n, this.f19678o, cVar);
        c2437h.f19676m = obj;
        return c2437h;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((C2437H) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (s4.C.h(r12, r1, r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        if (P.AbstractC0329z.q(getContext()).n(r5, r11) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006e -> B:6:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008b -> B:6:0x003e). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2280u interfaceC2280u;
        kotlin.jvm.internal.t tVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19675l;
        if (i == 0) {
            G4.l.N(obj);
            InterfaceC2280u interfaceC2280u2 = (InterfaceC2280u) this.f19676m;
            kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
            tVar2.f17621k = 1.0f;
            interfaceC2280u = interfaceC2280u2;
            tVar = tVar2;
        } else if (i == 1) {
            kotlin.jvm.internal.t tVar3 = this.f19674k;
            InterfaceC2280u interfaceC2280u3 = (InterfaceC2280u) this.f19676m;
            G4.l.N(obj);
            tVar = tVar3;
            interfaceC2280u = interfaceC2280u3;
            if (tVar.f17621k == 0.0f) {
                C2496k z3 = AbstractC0329z.z(new C0040k0(25, interfaceC2280u));
                C2436G c2436g = new C2436G(2, null);
                this.f19676m = interfaceC2280u;
                this.f19674k = tVar;
                this.f19675l = 2;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.t tVar4 = this.f19674k;
            InterfaceC2280u interfaceC2280u4 = (InterfaceC2280u) this.f19676m;
            G4.l.N(obj);
            tVar = tVar4;
            interfaceC2280u = interfaceC2280u4;
        }
        B.t tVar5 = new B.t(this.f19677n, this.f19678o, tVar, interfaceC2280u, 4);
        this.f19676m = interfaceC2280u;
        this.f19674k = tVar;
        this.f19675l = 1;
        if (getContext().l(Y0.f424k) != null) {
            throw new ClassCastException();
        }
    }
}
