package H6;

import D6.C;
import D6.E;
import G6.x;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.h f3429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f3430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(G6.h hVar, f fVar, p065i6.d dVar) {
        super(2, dVar);
        this.f3429c = hVar;
        this.f3430d = fVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        d dVar2 = new d(this.f3429c, this.f3430d, dVar);
        dVar2.f3428b = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f3427a;
        p044f6.i iVar = p044f6.i.f13014a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            C c3 = (C) this.f3428b;
            f fVar = this.f3430d;
            int i8 = fVar.f3435b;
            if (i8 == -3) {
                i8 = -2;
            }
            Function2 eVar = new e(fVar, null);
            F6.o oVar = new F6.o(E.q(c3, fVar.f3434a), F6.i.a(i8, fVar.f3436c, 4));
            oVar.Q(3, oVar, eVar);
            this.f3427a = 1;
            Object objB = x.b(this.f3429c, oVar, true, this);
            if (objB != aVar) {
                objB = iVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return iVar;
    }
}
