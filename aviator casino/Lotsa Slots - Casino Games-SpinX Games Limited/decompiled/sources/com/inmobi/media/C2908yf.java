package com.inmobi.media;

/* renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2908yf extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Af f5571a;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig.OmidConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2908yf(com.inmobi.media.Af af, com.inmobi.media.core.config.models.AdConfig.OmidConfig omidConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5571a = af;
        this.b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2908yf(this.f5571a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2908yf(this.f5571a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.La la = this.f5571a.f4602a.f4765a;
        la.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("last_ts", com.ironsource.X3.i.W);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((java.lang.System.currentTimeMillis() / ((long) 1000)) - la.f4815a.getLong("last_ts", 0L) > this.b.getExpiry());
    }
}
