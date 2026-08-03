package com.inmobi.media;

/* renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2737s3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f5438a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.inmobi.media.C2799u9 c;
    public final /* synthetic */ com.inmobi.media.C2260a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2737s3(java.lang.String str, com.inmobi.media.C2799u9 c2799u9, com.inmobi.media.C2260a0 c2260a0, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = c2799u9;
        this.d = c2260a0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2737s3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.C2737s3) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5438a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                if (com.inmobi.media.A3.e()) {
                    int maxRetries = com.inmobi.media.A3.c().getMaxRetries();
                    java.lang.String str = this.b;
                    com.inmobi.media.V2 v2 = new com.inmobi.media.V2(str, true, false, maxRetries + 1, 197);
                    com.inmobi.media.C2799u9 c2799u9 = this.c;
                    if (c2799u9 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                        c2799u9.a("A3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    com.inmobi.media.C2260a0 c2260a0 = this.d;
                    com.inmobi.media.C2799u9 c2799u92 = this.c;
                    this.f5438a = 1;
                    if (a3.a(v2, c2260a0, c2799u92, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u93 = this.c;
            if (c2799u93 != null) {
                com.inmobi.media.A3 a32 = com.inmobi.media.A3.f4593a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "access$getTAG$p(...)");
                c2799u93.b("A3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
