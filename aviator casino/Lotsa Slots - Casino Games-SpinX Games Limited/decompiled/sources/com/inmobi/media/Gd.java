package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4725a;
    public final /* synthetic */ com.inmobi.media.Ld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gd(com.inmobi.media.Ld ld, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Gd(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Gd(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4725a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2841w c2841w = this.b.f;
        this.f4725a = 1;
        java.lang.Object a2 = c2841w.a(this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
