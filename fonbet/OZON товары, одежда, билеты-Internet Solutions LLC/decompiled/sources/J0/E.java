package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {283}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12751d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ G0 f12752e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ H f12753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(G0 g02, H h11, kotlin.coroutines.d<? super E> dVar) {
        super(2, dVar);
        this.f12752e = g02;
        this.f12753f = h11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new E(this.f12752e, this.f12753f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        float f7;
        float f11;
        float f12;
        float f13;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12751d;
        if (i11 == 0) {
            Sc.s.b(obj);
            H h11 = this.f12753f;
            f7 = h11.f12812a;
            f11 = h11.f12813b;
            f12 = h11.f12814c;
            f13 = h11.f12815d;
            this.f12751d = 1;
            if (this.f12752e.e(f7, f11, f12, f13, this) == aVar) {
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
