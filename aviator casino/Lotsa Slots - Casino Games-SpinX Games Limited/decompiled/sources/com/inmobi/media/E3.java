package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4675a;
    public final /* synthetic */ kotlinx.coroutines.Deferred b;
    public final /* synthetic */ kotlin.jvm.functions.Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(kotlinx.coroutines.Deferred deferred, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = deferred;
        this.c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.E3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.E3(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4675a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.Deferred deferred = this.b;
            this.f4675a = 1;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            this.c.invoke(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
