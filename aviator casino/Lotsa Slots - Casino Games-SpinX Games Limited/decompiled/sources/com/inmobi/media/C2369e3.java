package com.inmobi.media;

/* renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2369e3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5168a;
    public final /* synthetic */ com.inmobi.media.Z2 b;
    public final /* synthetic */ com.inmobi.media.HandlerC2526k3 c;
    public final /* synthetic */ com.inmobi.media.core.config.models.AdConfig.ImaiConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2369e3(com.inmobi.media.Z2 z2, com.inmobi.media.HandlerC2526k3 handlerC2526k3, com.inmobi.media.core.config.models.AdConfig.ImaiConfig imaiConfig, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = z2;
        this.c = handlerC2526k3;
        this.d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2369e3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2369e3) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5168a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Z2 z2 = this.b;
            this.f5168a = 1;
            obj = z2.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.inmobi.media.A3.g.set(false);
            return kotlin.Unit.INSTANCE;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.c.sendMessageDelayed(obtain, this.d.getPingInterval() * 1000));
    }
}
