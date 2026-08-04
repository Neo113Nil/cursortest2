package p010b0;

import D6.E;
import G6.h;
import G6.m;
import G6.w;
import G6.z;
import R4.c;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: renamed from: b0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748t extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0733d f10096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748t(O o7, d dVar) {
        super(2, dVar);
        this.f10099d = o7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C0748t c0748t = new C0748t(this.f10099d, dVar);
        c0748t.f10098c = obj;
        return c0748t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0748t) create((h) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        h hVar;
        i0 i0Var;
        m mVar;
        Object objR;
        a aVar = a.f14648a;
        int i7 = this.f10097b;
        p044f6.i iVar = p044f6.i.f13014a;
        O o7 = this.f10099d;
        if (i7 != 0) {
            if (i7 == 1) {
                h hVar2 = (h) this.f10098c;
                p003a.a.p0(obj);
                hVar = hVar2;
            } else if (i7 == 2) {
                i0Var = this.f10096a;
                hVar = (h) this.f10098c;
                p003a.a.p0(obj);
                int i8 = 13;
                int i9 = 14;
                int i10 = 13;
                mVar = new m(new c(new P2(i10, new V0(i9, new V0(i8, new C0744o(o7, null), (w) o7.f9971h.f613b, false), new C0745p(2, null), false), new C0746q(i0Var, null), false), 13), new r(o7, (d) null));
                this.f10098c = null;
                this.f10096a = null;
                this.f10097b = 3;
                if (!(hVar instanceof z)) {
                    throw ((z) hVar).f3143a;
                }
                objR = mVar.r(hVar, this);
                if (objR != aVar) {
                    objR = iVar;
                }
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(obj);
            }
            return iVar;
        }
        p003a.a.p0(obj);
        h hVar3 = (h) this.f10098c;
        this.f10098c = hVar3;
        this.f10097b = 1;
        Object objX = E.x(o7.f9966c.c(), new G(o7, null), this);
        if (objX == aVar) {
            return aVar;
        }
        hVar = hVar3;
        obj = objX;
        i0Var = (i0) obj;
        if (i0Var instanceof C0733d) {
            Object obj2 = ((C0733d) i0Var).f10021b;
            this.f10098c = hVar;
            this.f10096a = (C0733d) i0Var;
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
                return iVar;
            }
        }
        int i11 = 13;
        int i12 = 14;
        int i13 = 13;
        mVar = new m(new c(new P2(i13, new V0(i12, new V0(i11, new C0744o(o7, null), (w) o7.f9971h.f613b, false), new C0745p(2, null), false), new C0746q(i0Var, null), false), 13), new r(o7, (d) null));
        this.f10098c = null;
        this.f10096a = null;
        this.f10097b = 3;
        if (!(hVar instanceof z)) {
            throw ((z) hVar).f3143a;
        }
        objR = mVar.r(hVar, this);
        if (objR != aVar) {
            objR = iVar;
        }
        if (objR == aVar) {
            return aVar;
        }
        return iVar;
    }
}
