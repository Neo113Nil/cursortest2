package com.inmobi.media;

/* renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2805uf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5487a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig.OmidConfig c;
    public final /* synthetic */ android.content.Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2805uf(com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = omidConfig;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2805uf c2805uf = new com.inmobi.media.C2805uf(this.c, this.d, continuation);
        c2805uf.b = obj;
        return c2805uf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2805uf) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r15 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5487a;
        try {
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig = this.c;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            this.f5487a = 1;
            java.lang.String url = omidConfig.getUrl();
            int maxRetries = omidConfig.getMaxRetries();
            int retryInterval = omidConfig.getRetryInterval();
            kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
            obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.Bf(new com.inmobi.media.Re(url, null, null, null, new com.inmobi.media.Ni(maxRetries, retryInterval * 1000, 0), false, 46), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        m10798constructorimpl = kotlin.Result.m10798constructorimpl((java.lang.String) obj);
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            com.inmobi.media.C2883xf.b.set(0);
        }
        android.content.Context context = this.d;
        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            java.lang.String str = (java.lang.String) m10798constructorimpl;
            com.inmobi.media.C2883xf.b.set(1);
            com.inmobi.media.C2883xf c2883xf = com.inmobi.media.C2883xf.f5551a;
            com.inmobi.media.Af af = com.inmobi.media.C2883xf.c;
            if (af == null) {
                af = new com.inmobi.media.Af(context);
                com.inmobi.media.C2883xf.c = af;
            }
            this.b = m10798constructorimpl;
            this.f5487a = 2;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.C2933zf(af, str, null), this);
            if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
