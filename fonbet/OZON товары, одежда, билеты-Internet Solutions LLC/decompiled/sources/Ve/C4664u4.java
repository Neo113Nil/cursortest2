package Ve;

import Ae.C2406m0;
import Ae.C2414q0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.u4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4664u4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32177d;

    /* renamed from: e, reason: collision with root package name */
    public int f32178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f32179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4664u4(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f32177d = i11;
        this.f32179f = interfaceC2395h;
        this.f32180g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f32177d) {
            case 0:
                return new C4664u4((C2414q0) this.f32179f, dVar, (C4378k7) this.f32180g, 0);
            default:
                return new C4664u4((C2406m0) this.f32179f, dVar, (J4) this.f32180g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f32177d) {
            case 0:
                return new C4664u4((C2414q0) this.f32179f, dVar, (C4378k7) this.f32180g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4664u4((C2406m0) this.f32179f, dVar, (J4) this.f32180g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32177d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f32178e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    P3 p32 = new P3((C4378k7) this.f32180g);
                    this.f32178e = 1;
                    if (((C2414q0) this.f32179f).collect(p32, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f32178e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4430m1 c4430m1 = new C4430m1((J4) this.f32180g, 2);
                    this.f32178e = 1;
                    if (((C2406m0) this.f32179f).collect(c4430m1, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
