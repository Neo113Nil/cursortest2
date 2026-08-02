package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10585N;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39681d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f39682e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f39683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(q qVar, int i11, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f39682e = qVar;
        this.f39683f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new s(this.f39682e, this.f39683f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39681d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC10585N interfaceC10585N = this.f39682e.f39670b;
            this.f39681d = 1;
            if (interfaceC10585N.b(this.f39683f, this) == aVar) {
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
