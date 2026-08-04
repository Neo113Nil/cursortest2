package H6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p077k6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, p065i6.d dVar) {
        super(2, dVar);
        this.f3433c = fVar;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        e eVar = new e(this.f3433c, dVar);
        eVar.f3432b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F6.p) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f3431a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            F6.p pVar = (F6.p) this.f3432b;
            this.f3431a = 1;
            if (this.f3433c.a(pVar, this) == aVar) {
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
