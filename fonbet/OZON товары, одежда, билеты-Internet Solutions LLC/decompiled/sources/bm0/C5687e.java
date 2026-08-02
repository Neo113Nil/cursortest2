package bm0;

import Sc.s;
import We.L;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: bm0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5687e extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f56114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5687e(L l11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f56114d = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5687e(this.f56114d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
        return new C5687e(this.f56114d, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        We.M c11 = this.f56114d.c();
        return (c11 == null || (string = c11.string()) == null) ? "" : string;
    }
}
