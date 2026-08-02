package Ve;

import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.je, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4356je extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.a f31367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4356je(f.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31367e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4356je c4356je = new C4356je(this.f31367e, dVar);
        c4356je.f31366d = obj;
        return c4356je;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4356je c4356je = new C4356je(this.f31367e, (kotlin.coroutines.d) obj2);
        c4356je.f31366d = (W2.f) obj;
        return c4356je.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        W2.b d11 = ((W2.f) this.f31366d).d();
        d11.h(this.f31367e);
        return d11;
    }
}
