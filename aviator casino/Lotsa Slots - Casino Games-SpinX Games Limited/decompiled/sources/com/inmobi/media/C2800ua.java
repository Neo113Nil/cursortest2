package com.inmobi.media;

/* renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2800ua extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va f5485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2800ua(com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va viewTreeObserverOnGlobalLayoutListenerC2826va, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5485a = viewTreeObserverOnGlobalLayoutListenerC2826va;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2800ua(this.f5485a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2800ua(this.f5485a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CompletableDeferred completableDeferred = this.f5485a.e;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        completableDeferred.complete(unit);
        return unit;
    }
}
