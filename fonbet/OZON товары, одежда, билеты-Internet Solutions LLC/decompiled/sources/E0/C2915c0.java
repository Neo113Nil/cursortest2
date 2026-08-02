package E0;

import Sc.C4005g;
import androidx.compose.ui.platform.C5278q1;
import androidx.compose.ui.platform.InterfaceC5286t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {135}, m = "invokeSuspend")
/* renamed from: E0.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2915c0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f7167d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2917d0 f7168e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC5286t1, kotlin.coroutines.d<?>, Object> f7169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2915c0(C2917d0 c2917d0, Function2<? super InterfaceC5286t1, ? super kotlin.coroutines.d<?>, ? extends Object> function2, kotlin.coroutines.d<? super C2915c0> dVar) {
        super(2, dVar);
        this.f7168e = c2917d0;
        this.f7169f = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C2915c0(this.f7168e, this.f7169f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2915c0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f7167d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f7167d = 1;
            if (C5278q1.b(this.f7168e, this.f7169f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
