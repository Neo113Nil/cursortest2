package F0;

import I0.C3205r0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", l = {148}, m = "invokeSuspend")
/* renamed from: F0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2987h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f8239d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2986g f8240e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f8241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2987h(C2986g c2986g, long j11, kotlin.coroutines.d<? super C2987h> dVar) {
        super(2, dVar);
        this.f8240e = c2986g;
        this.f8241f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C2987h(this.f8240e, this.f8241f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2987h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f8239d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7980b c7980b = this.f8240e.f8228h;
            C7459e a11 = C7459e.a(this.f8241f);
            C8011q0<C7459e> c11 = C3205r0.c();
            this.f8239d = 1;
            if (C7980b.f(c7980b, a11, c11, null, this, 12) == aVar) {
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
