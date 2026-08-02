package androidx.compose.material;

import J0.C3326o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", l = {372}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5225x extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40152d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3326o1 f40153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5225x(C3326o1 c3326o1, kotlin.coroutines.d<? super C5225x> dVar) {
        super(2, dVar);
        this.f40153e = c3326o1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C5225x(this.f40153e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5225x) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40152d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f40152d = 1;
            if (this.f40153e.g(this) == aVar) {
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
