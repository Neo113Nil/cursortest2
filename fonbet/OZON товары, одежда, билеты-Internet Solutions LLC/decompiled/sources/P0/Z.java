package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class Z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20929d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3787x1 f20930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(C3787x1 c3787x1, kotlin.coroutines.d<? super Z> dVar) {
        super(2, dVar);
        this.f20930e = c3787x1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new Z(this.f20930e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20929d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f20929d = 1;
            C3787x1 c3787x1 = this.f20930e;
            Object a11 = C3787x1.a(c3787x1, c3787x1.f() ? EnumC3790y1.PartiallyExpanded : EnumC3790y1.Expanded, this);
            if (a11 != obj2) {
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
