package Ic0;

import Ic0.d;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitAuthUseCase$executeAsync$1", f = "InitAuthUseCase.kt", l = {54, 54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12203d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f12204e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f12205f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f12206g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f12207h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ d f12208i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(boolean z11, Function1 function1, String str, boolean z12, d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f12204e = z11;
        this.f12205f = (AbstractC7737t) function1;
        this.f12206g = str;
        this.f12207h = z12;
        this.f12208i = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f12204e, this.f12205f, this.f12206g, this.f12207h, this.f12208i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12203d;
        if (i11 == 0) {
            s.b(obj);
            d.a aVar2 = new d.a(this.f12206g, this.f12205f, this.f12204e, this.f12207h);
            this.f12203d = 2;
            if (this.f12208i.f(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
