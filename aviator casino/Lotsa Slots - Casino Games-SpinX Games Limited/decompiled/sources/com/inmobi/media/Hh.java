package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4747a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ com.inmobi.media.Kh d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ com.inmobi.media.core.config.models.RootConfig f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hh(java.util.List list, com.inmobi.media.Kh kh, java.lang.String str, com.inmobi.media.core.config.models.RootConfig rootConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.d = kh;
        this.e = str;
        this.f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Hh hh = new com.inmobi.media.Hh(this.c, this.d, this.e, this.f, continuation);
        hh.b = obj;
        return hh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Hh) create((kotlinx.coroutines.channels.ProducerScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4747a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Gh gh = new com.inmobi.media.Gh(this.c, this.d, this.e, this.f, (kotlinx.coroutines.channels.ProducerScope) this.b, null);
            this.f4747a = 1;
            if (kotlinx.coroutines.SupervisorKt.supervisorScope(gh, this) == coroutine_suspended) {
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
