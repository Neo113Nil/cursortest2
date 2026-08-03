package com.inmobi.media;

/* renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2928za extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5587a;
    public final /* synthetic */ com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928za(com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va viewTreeObserverOnGlobalLayoutListenerC2826va, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = viewTreeObserverOnGlobalLayoutListenerC2826va;
        this.c = intRef;
        this.d = intRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2928za(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2928za) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5587a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CompletableDeferred completableDeferred = this.b.e;
            this.f5587a = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.Ref.IntRef intRef = this.c;
        com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2826va viewTreeObserverOnGlobalLayoutListenerC2826va = this.b;
        intRef.element = viewTreeObserverOnGlobalLayoutListenerC2826va.c;
        this.d.element = viewTreeObserverOnGlobalLayoutListenerC2826va.d;
        return kotlin.Unit.INSTANCE;
    }
}
