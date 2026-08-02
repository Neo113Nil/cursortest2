package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.P2;
import w1.V0;

/* renamed from: b0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771t extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C0756d f10096a;

    /* renamed from: b, reason: collision with root package name */
    public int f10097b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771t(O o7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10099d = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0771t c0771t = new C0771t(this.f10099d, interfaceC1287d);
        c0771t.f10098c = obj;
        return c0771t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0771t) create((G6.h) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        G6.h hVar;
        i0 i0Var;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10097b;
        C1116i c1116i = C1116i.f13008a;
        O o7 = this.f10099d;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            G6.h hVar2 = (G6.h) this.f10098c;
            this.f10098c = hVar2;
            this.f10097b = 1;
            Object x4 = D6.E.x(o7.f9966c.c(), new G(o7, null), this);
            if (x4 == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj = x4;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        AbstractC0603a.p0(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var = this.f10096a;
                hVar = (G6.h) this.f10098c;
                AbstractC0603a.p0(obj);
                int i8 = 14;
                int i9 = 13;
                G6.m mVar = new G6.m(new R4.c(new P2(i9, new V0(i8, new V0(13, new C0767o(o7, null), (G6.w) o7.f9971h.f613b, false), new C0768p(2, null), false), new C0769q(i0Var, null), false), 13), new r(o7, (InterfaceC1287d) null));
                this.f10098c = null;
                this.f10096a = null;
                this.f10097b = 3;
                if (!(hVar instanceof G6.z)) {
                    throw ((G6.z) hVar).f3143a;
                }
                Object r7 = mVar.r(hVar, this);
                if (r7 != aVar) {
                    r7 = c1116i;
                }
                return r7 == aVar ? aVar : c1116i;
            }
            G6.h hVar3 = (G6.h) this.f10098c;
            AbstractC0603a.p0(obj);
            hVar = hVar3;
        }
        i0Var = (i0) obj;
        if (i0Var instanceof C0756d) {
            Object obj2 = ((C0756d) i0Var).f10021b;
            this.f10098c = hVar;
            this.f10096a = (C0756d) i0Var;
            this.f10097b = 2;
            if (hVar.c(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i0Var instanceof j0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (i0Var instanceof b0) {
                throw ((b0) i0Var).f10015b;
            }
            if (i0Var instanceof Z) {
                return c1116i;
            }
        }
        int i82 = 14;
        int i92 = 13;
        G6.m mVar2 = new G6.m(new R4.c(new P2(i92, new V0(i82, new V0(13, new C0767o(o7, null), (G6.w) o7.f9971h.f613b, false), new C0768p(2, null), false), new C0769q(i0Var, null), false), 13), new r(o7, (InterfaceC1287d) null));
        this.f10098c = null;
        this.f10096a = null;
        this.f10097b = 3;
        if (!(hVar instanceof G6.z)) {
        }
    }
}
