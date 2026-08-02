package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {138}, m = "invokeSuspend")
/* renamed from: P0.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3721b0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20977d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3787x1 f20978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3721b0(C3787x1 c3787x1, kotlin.coroutines.d<? super C3721b0> dVar) {
        super(2, dVar);
        this.f20978e = c3787x1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3721b0(this.f20978e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3721b0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20977d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f20977d = 1;
            if (this.f20978e.i(this) == aVar) {
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
