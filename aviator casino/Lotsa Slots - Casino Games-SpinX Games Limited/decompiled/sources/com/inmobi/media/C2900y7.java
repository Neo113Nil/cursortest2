package com.inmobi.media;

/* renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2900y7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5565a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.B7 c;
    public final /* synthetic */ com.inmobi.media.R7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2900y7(com.inmobi.media.B7 b7, kotlin.coroutines.Continuation continuation, com.inmobi.media.R7 r7) {
        super(2, continuation);
        this.c = b7;
        this.d = r7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2900y7 c2900y7 = new com.inmobi.media.C2900y7(this.c, continuation, this.d);
        c2900y7.b = obj;
        return c2900y7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2900y7) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5565a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            com.inmobi.media.B7 b7 = this.c;
            com.inmobi.media.C2875x7 c2875x7 = new com.inmobi.media.C2875x7(coroutineScope, this.d);
            this.f5565a = 1;
            if (b7.collect(c2875x7, this) == coroutine_suspended) {
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
