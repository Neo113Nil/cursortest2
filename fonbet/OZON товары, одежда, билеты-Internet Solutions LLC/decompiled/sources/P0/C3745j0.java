package P0;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* renamed from: P0.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3745j0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, Float, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ float f21102d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Float, Unit> f21103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3745j0(Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super C3745j0> dVar) {
        super(3, dVar);
        this.f21103e = function1;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(xe.M m11, Float f7, kotlin.coroutines.d<? super Unit> dVar) {
        float floatValue = f7.floatValue();
        C3745j0 c3745j0 = new C3745j0(this.f21103e, dVar);
        c3745j0.f21102d = floatValue;
        return c3745j0.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        this.f21103e.invoke(new Float(this.f21102d));
        return Unit.f71690a;
    }
}
