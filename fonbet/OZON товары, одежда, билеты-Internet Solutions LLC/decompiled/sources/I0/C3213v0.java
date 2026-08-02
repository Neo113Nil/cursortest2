package I0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8010q;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {100}, m = "invokeSuspend")
/* renamed from: I0.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3213v0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11618d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<C7459e, C8010q> f11619e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f11620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3213v0(C7980b<C7459e, C8010q> c7980b, long j11, kotlin.coroutines.d<? super C3213v0> dVar) {
        super(2, dVar);
        this.f11619e = c7980b;
        this.f11620f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3213v0(this.f11619e, this.f11620f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3213v0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11618d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7459e a11 = C7459e.a(this.f11620f);
            C8011q0<C7459e> c11 = C3205r0.c();
            this.f11618d = 1;
            if (C7980b.f(this.f11619e, a11, c11, null, this, 12) == aVar) {
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
