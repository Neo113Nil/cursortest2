package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {55}, m = "invokeSuspend")
/* renamed from: B0.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2480i1 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1800d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E0.G f1801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2480i1(E0.G g10, kotlin.coroutines.d<? super C2480i1> dVar) {
        super(2, dVar);
        this.f1801e = g10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C2480i1(this.f1801e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2480i1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1800d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f1800d = 1;
            if (this.f1801e.e(this) == aVar) {
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
