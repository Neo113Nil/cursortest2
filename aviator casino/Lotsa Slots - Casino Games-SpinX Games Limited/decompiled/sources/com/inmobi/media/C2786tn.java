package com.inmobi.media;

/* renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2786tn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5473a;
    public final /* synthetic */ com.inmobi.media.C2865wn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2786tn(com.inmobi.media.C2865wn c2865wn, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2865wn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2786tn(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2786tn(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5473a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.b.d;
            com.inmobi.media.C2442gm c2442gm = new com.inmobi.media.C2442gm(r7.f5536a.getDuration());
            this.f5473a = 1;
            if (mutableSharedFlow.emit(c2442gm, this) == coroutine_suspended) {
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
