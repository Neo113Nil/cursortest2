package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class C extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f43189d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ D f43190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(D d11, kotlin.coroutines.d<? super C> dVar) {
        super(2, dVar);
        this.f43190e = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C c11 = new C(this.f43190e, dVar);
        c11.f43189d = obj;
        return c11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        xe.M m11 = (xe.M) this.f43189d;
        D d11 = this.f43190e;
        if (d11.a().b().compareTo(AbstractC5434v.b.INITIALIZED) >= 0) {
            d11.a().a(d11);
        } else {
            xe.E0.b(m11.getCoroutineContext(), null);
        }
        return Unit.f71690a;
    }
}
