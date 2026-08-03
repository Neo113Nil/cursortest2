package com.inmobi.media;

/* loaded from: classes5.dex */
public final class V7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.W7 f5009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(com.inmobi.media.W7 w7, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5009a = w7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.V7(this.f5009a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.V7(this.f5009a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f5009a.d.e()) {
            com.inmobi.media.W7 w7 = this.f5009a;
            w7.b.setVolume(1.0f);
            com.inmobi.media.T4.a(w7.c, w7.f5025a, new com.inmobi.media.S1(1.0f, false));
            w7.e = false;
        } else {
            this.f5009a.a();
        }
        return kotlin.Unit.INSTANCE;
    }
}
