package p010b0;

import D6.C;
import D6.C0136t;
import G6.g;
import G6.s;
import H6.h;
import H6.j;
import H6.l;
import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: renamed from: b0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753y extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753y(O o7, d dVar) {
        super(2, dVar);
        this.f10119b = o7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        return new C0753y(this.f10119b, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0753y) create((C) obj, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f14648a;
        int i7 = this.f10118a;
        p044f6.i iVar = p044f6.i.f13014a;
        O o7 = this.f10119b;
        if (i7 != 0) {
            if (i7 == 1) {
                p003a.a.p0(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(obj);
            }
        }
        p003a.a.p0(obj);
        this.f10118a = 1;
        Object objJ = ((C0136t) o7.f9972i.f17380c).j(this);
        if (objJ != aVar) {
            objJ = iVar;
        }
        if (objJ == aVar) {
            return aVar;
        }
        g gVar = o7.g().f10052c;
        g gVarA = gVar instanceof j ? l.a((j) gVar, null, 0, 2, 1) : new h(gVar, p065i6.j.f14074a, 0, 2);
        s sVar = new s(o7, 3);
        this.f10118a = 2;
        return gVarA.r(sVar, this) == aVar ? aVar : iVar;
    }
}
