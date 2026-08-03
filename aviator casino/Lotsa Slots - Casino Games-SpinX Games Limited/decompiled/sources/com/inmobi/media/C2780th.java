package com.inmobi.media;

/* renamed from: com.inmobi.media.th, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2780th extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5468a;
    public final /* synthetic */ com.inmobi.media.C2807uh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2780th(com.inmobi.media.C2807uh c2807uh, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2807uh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2780th(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2780th(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5468a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.H0 h0 = (com.inmobi.media.H0) com.inmobi.media.E0.f4672a.getValue();
            com.inmobi.adquality.models.AdQualityResult adQualityResult = this.b.f5489a;
            this.f5468a = 1;
            if (h0.a(adQualityResult, this) == coroutine_suspended) {
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
