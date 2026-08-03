package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Cd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4641a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Fd c;
    public final /* synthetic */ com.inmobi.media.Ld d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(com.inmobi.media.Fd fd, kotlin.coroutines.Continuation continuation, com.inmobi.media.Ld ld) {
        super(2, continuation);
        this.c = fd;
        this.d = ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Cd cd = new com.inmobi.media.Cd(this.c, continuation, this.d);
        cd.b = obj;
        return cd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Cd) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4641a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            com.inmobi.media.Fd fd = this.c;
            com.inmobi.media.Bd bd = new com.inmobi.media.Bd(coroutineScope, this.d);
            this.f4641a = 1;
            if (fd.collect(bd, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
