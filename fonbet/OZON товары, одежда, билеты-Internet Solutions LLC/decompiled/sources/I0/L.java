package I0;

import B0.InterfaceC2477h1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1$1", f = "SelectionContainer.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11331d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f11332e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f11333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f11333f = interfaceC2477h1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        L l11 = new L(this.f11333f, dVar);
        l11.f11332e = obj;
        return l11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11331d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f11332e;
            this.f11331d = 1;
            if (B0.Y0.a(f7, this.f11333f, this) == aVar) {
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
