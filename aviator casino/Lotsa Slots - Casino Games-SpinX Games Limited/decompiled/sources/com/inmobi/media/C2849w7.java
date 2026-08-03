package com.inmobi.media;

/* renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2849w7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f5523a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2849w7(kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7) {
        super(2, continuation);
        this.f5523a = r7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2849w7(continuation, this.f5523a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2849w7((kotlin.coroutines.Continuation) obj2, this.f5523a).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.R7 r7 = this.f5523a;
        r7.p.addListener(r7.B);
        return kotlin.Unit.INSTANCE;
    }
}
