package F5;

import fd.InterfaceC6511n;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<Integer, Throwable, kotlin.coroutines.d<? super Boolean>, Object> {
    @Override // fd.InterfaceC6511n
    public final Object invoke(Integer num, Throwable th2, kotlin.coroutines.d<? super Boolean> dVar) {
        num.intValue();
        new D(3, dVar).invokeSuspend(Unit.f71690a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return Boolean.FALSE;
    }
}
