package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Jk extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4786a;
    public final /* synthetic */ long b;
    public final /* synthetic */ kotlin.jvm.functions.Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jk(long j, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Jk(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Jk(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4786a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = this.b;
                this.f4786a = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.c.invoke();
        } catch (java.util.concurrent.CancellationException unused) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
