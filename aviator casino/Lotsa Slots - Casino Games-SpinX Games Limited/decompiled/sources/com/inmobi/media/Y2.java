package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5057a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.inmobi.media.Z2 c;
    public final /* synthetic */ com.inmobi.media.V2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(int i, com.inmobi.media.Z2 z2, com.inmobi.media.V2 v2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = z2;
        this.d = v2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Y2(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Y2) create((com.inmobi.media.C2613n9) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r6.a(com.ironsource.Y3.d, r1, 5, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5057a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > " + (this.b - 1) + ";";
            com.inmobi.media.C2613n9 c2613n9 = this.c.f5077a;
            this.f5057a = 1;
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
        com.inmobi.media.C2613n9 c2613n92 = this.c.f5077a;
        android.content.ContentValues a2 = com.inmobi.media.AbstractC2290b3.a(this.d);
        this.f5057a = 2;
    }
}
