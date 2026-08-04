package H6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p065i6.d dVar) {
        super(2, dVar);
        this.f3439c = hVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        g gVar = new g(this.f3439c, dVar);
        gVar.f3438b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((G6.h) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f3437a;
        p044f6.i iVar = p044f6.i.f13014a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            G6.h hVar = (G6.h) this.f3438b;
            this.f3437a = 1;
            Object objR = this.f3439c.f3440d.r(hVar, this);
            if (objR != aVar) {
                objR = iVar;
            }
            if (objR == aVar) {
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
