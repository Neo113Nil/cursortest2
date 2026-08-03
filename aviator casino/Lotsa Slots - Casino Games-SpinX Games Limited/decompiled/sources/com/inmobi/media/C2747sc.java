package com.inmobi.media;

/* renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2747sc extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5445a;
    public final /* synthetic */ com.inmobi.media.C2775tc b;
    public final /* synthetic */ com.inmobi.media.C6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2747sc(com.inmobi.media.C2775tc c2775tc, com.inmobi.media.C6 c6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2775tc;
        this.c = c6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2747sc(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2747sc(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r13.a(r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.AbstractC2525k2 fm;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5445a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2775tc c2775tc = this.b;
            com.inmobi.media.B6 b6 = c2775tc.d;
            com.inmobi.media.C6 experienceModel = this.c;
            b6.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceModel, "experienceModel");
            if (experienceModel instanceof com.inmobi.media.Oj) {
                fm = new com.inmobi.media.Nj(b6.f4615a, b6.b, (com.inmobi.media.Oj) experienceModel, b6.c, b6.d);
            } else {
                if (!(experienceModel instanceof com.inmobi.media.Gm)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                fm = new com.inmobi.media.Fm(b6.f4615a, b6.b, (com.inmobi.media.Gm) experienceModel, b6.c, b6.d);
            }
            c2775tc.b = fm;
            com.inmobi.media.AbstractC2525k2 abstractC2525k2 = this.b.b;
            if (abstractC2525k2 != null) {
                this.f5445a = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return this.b.c;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.C2775tc c2775tc2 = this.b;
        com.inmobi.media.AbstractC2525k2 abstractC2525k22 = c2775tc2.b;
        if (abstractC2525k22 != null) {
            com.inmobi.media.ads.nativeAd.MediaView mediaView = c2775tc2.c;
            this.f5445a = 2;
        }
        return this.b.c;
    }
}
