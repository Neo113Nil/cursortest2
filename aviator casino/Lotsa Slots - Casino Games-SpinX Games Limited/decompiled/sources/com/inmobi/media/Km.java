package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Km extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Gl f4804a;
    public int b;
    public final /* synthetic */ com.inmobi.media.Gl c;
    public final /* synthetic */ double d;
    public final /* synthetic */ com.inmobi.media.Xe e;
    public final /* synthetic */ int f;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig.VastVideoConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Km(com.inmobi.media.Gl gl, double d, com.inmobi.media.Xe xe, int i, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = gl;
        this.d = d;
        this.e = xe;
        this.f = i;
        this.g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Km(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Km) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.Gl gl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Gl gl2 = this.c;
            double d = this.d;
            com.inmobi.media.Xe xe = this.e;
            int i2 = this.f;
            com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig = this.g;
            this.f4804a = gl2;
            this.b = 1;
            java.lang.Object a2 = com.inmobi.media.Nm.a(gl2, d, xe, i2, vastVideoConfig, this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            gl = gl2;
            obj = a2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gl = this.f4804a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.TuplesKt.to(gl, obj);
    }
}
