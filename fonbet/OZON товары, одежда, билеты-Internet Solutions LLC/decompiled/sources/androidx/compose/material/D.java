package androidx.compose.material;

import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", l = {432}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39880d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3326o1 f39881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C3326o1 c3326o1, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f39881e = c3326o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new D(this.f39881e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object a11;
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39880d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f39880d = 1;
            C3326o1 c3326o1 = this.f39881e;
            if (c3326o1.e()) {
                a11 = C3326o1.a(c3326o1, EnumC3337r1.HalfExpanded, this);
                if (a11 != obj2) {
                    a11 = Unit.f71690a;
                }
            } else {
                a11 = Unit.f71690a;
            }
            if (a11 == obj2) {
                return obj2;
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
