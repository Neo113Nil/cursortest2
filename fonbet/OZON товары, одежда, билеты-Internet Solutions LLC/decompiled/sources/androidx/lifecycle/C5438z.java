package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", l = {93}, m = "invokeSuspend")
/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5438z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f43413d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B f43414e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f43415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5438z(B b11, Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C5438z> dVar) {
        super(2, dVar);
        this.f43414e = b11;
        this.f43415f = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C5438z(this.f43414e, this.f43415f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5438z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f43413d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v a11 = this.f43414e.a();
            this.f43413d = 1;
            if (C5406a0.a(a11, AbstractC5434v.b.RESUMED, this.f43415f, this) == aVar) {
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
