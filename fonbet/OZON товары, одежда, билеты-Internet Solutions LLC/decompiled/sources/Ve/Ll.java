package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ll extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J4 f29434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ll(C2406m0 c2406m0, kotlin.coroutines.d dVar, J4 j42) {
        super(2, dVar);
        this.f29433e = c2406m0;
        this.f29434f = j42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ll(this.f29433e, dVar, this.f29434f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ll(this.f29433e, (kotlin.coroutines.d) obj2, this.f29434f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29432d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I4 i42 = new I4(this.f29434f, 2);
            this.f29432d = 1;
            if (this.f29433e.collect(i42, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
