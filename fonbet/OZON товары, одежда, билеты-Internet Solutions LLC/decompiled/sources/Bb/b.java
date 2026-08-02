package Bb;

import Sc.s;
import We.L;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f3360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(L l11, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f3360d = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f3360d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        We.M c11 = this.f3360d.c();
        return (c11 == null || (string = c11.string()) == null) ? "" : string;
    }
}
