package H6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.h f3459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(G6.h hVar, p065i6.d dVar) {
        super(2, dVar);
        this.f3459c = hVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        t tVar = new t(this.f3459c, dVar);
        tVar.f3458b = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create(obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f3457a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            Object obj2 = this.f3458b;
            this.f3457a = 1;
            if (this.f3459c.c(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
