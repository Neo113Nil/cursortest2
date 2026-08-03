package com.inmobi.media;

/* renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2815v extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5496a;
    public final /* synthetic */ com.inmobi.media.C2841w b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.inmobi.media.Tj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2815v(com.inmobi.media.C2841w c2841w, java.lang.String str, com.inmobi.media.Tj tj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2841w;
        this.c = str;
        this.d = tj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2815v(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2815v) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5496a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2841w c2841w = this.b;
        java.lang.String str = this.c;
        com.inmobi.media.Tj tj = this.d;
        this.f5496a = 1;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new com.inmobi.media.C2762t(c2841w));
        com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
        com.inmobi.media.Yf.b(c2841w.f5518a).load(str).tag(c2841w.e).transform(new com.inmobi.media.Tf(android.graphics.Bitmap.Config.RGB_565)).into(tj, new com.inmobi.media.C2789u(c2841w, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
