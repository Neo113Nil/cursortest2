package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fh extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4709a;
    public final /* synthetic */ com.inmobi.media.Kh b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ com.inmobi.media.core.config.models.RootConfig e;
    public final /* synthetic */ java.util.List f;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fh(com.inmobi.media.Kh kh, java.lang.String str, java.lang.String str2, com.inmobi.media.core.config.models.RootConfig rootConfig, java.util.List list, kotlinx.coroutines.channels.ProducerScope producerScope, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = kh;
        this.c = str;
        this.d = str2;
        this.e = rootConfig;
        this.f = list;
        this.g = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Fh(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Fh) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4709a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.Kh kh = this.b;
                java.lang.String str = this.c;
                java.lang.String str2 = this.d;
                com.inmobi.media.core.config.models.RootConfig rootConfig = this.e;
                java.util.List list = this.f;
                kotlinx.coroutines.channels.ProducerScope producerScope = this.g;
                this.f4709a = 1;
                if (kh.a(str, str2, rootConfig, list, producerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
        return kotlin.Unit.INSTANCE;
    }
}
