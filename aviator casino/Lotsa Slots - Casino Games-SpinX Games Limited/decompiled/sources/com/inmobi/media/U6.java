package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4990a;
    public final /* synthetic */ com.inmobi.media.V6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(com.inmobi.media.V6 v6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = v6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.U6(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.U6(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4990a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2313c0 c2313c0 = this.b.f;
                c2313c0.getClass();
                c2313c0.c = android.os.SystemClock.elapsedRealtime();
                java.lang.Integer num = this.b.m.d;
                long intValue = num != null ? num.intValue() : 15000;
                com.inmobi.media.T6 t6 = new com.inmobi.media.T6(this.b, null);
                this.f4990a = 1;
                obj = kotlinx.coroutines.TimeoutKt.withTimeout(intValue, t6, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.inmobi.media.ads.network.common.model.AdResponse adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
            this.b.f5166a.getClass();
            com.inmobi.media.V6 v6 = this.b;
            com.inmobi.media.AbstractC2341d0.a("native", v6.d.g, adResponse, v6.e);
            com.inmobi.media.C2799u9 c2799u9 = this.b.e;
            if (c2799u9 != null) {
                c2799u9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.b.a(adResponse);
        } catch (com.inmobi.media.Y e) {
            com.inmobi.media.C2799u9 c2799u92 = this.b.e;
            if (c2799u92 != null) {
                c2799u92.b("AUM-FetchingState", "AdResponse Parse Failure " + e);
            }
            this.b.a(e);
        } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
            com.inmobi.media.C2799u9 c2799u93 = this.b.e;
            if (c2799u93 != null) {
                c2799u93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.b.a(new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new com.inmobi.media.N6((short) 2138)));
        }
        return kotlin.Unit.INSTANCE;
    }
}
