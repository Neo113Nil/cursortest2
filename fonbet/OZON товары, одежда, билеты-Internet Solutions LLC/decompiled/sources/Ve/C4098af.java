package Ve;

import Ae.C2406m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.af, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4098af extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4817zg f30671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4098af(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4817zg c4817zg) {
        super(2, dVar);
        this.f30670e = c2406m0;
        this.f30671f = c4817zg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4098af(this.f30670e, dVar, this.f30671f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4098af(this.f30670e, (kotlin.coroutines.d) obj2, this.f30671f).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30669d;
        if (i11 == 0) {
            Sc.s.b(obj);
            D0 d02 = new D0(this.f30671f, 1);
            this.f30669d = 1;
            if (this.f30670e.collect(d02, this) == aVar) {
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
