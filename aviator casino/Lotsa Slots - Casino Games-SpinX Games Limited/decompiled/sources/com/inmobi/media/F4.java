package com.inmobi.media;

/* loaded from: classes5.dex */
public final class F4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4696a;
    public final /* synthetic */ com.inmobi.media.G4 b;
    public final /* synthetic */ com.inmobi.media.C2267a6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(com.inmobi.media.G4 g4, com.inmobi.media.C2267a6 c2267a6, long j, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = g4;
        this.c = c2267a6;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.F4(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.F4) create((com.inmobi.media.C2613n9) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r8.a("c_data", r4, 4, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4696a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2613n9 c2613n9 = this.b.f4718a;
            com.inmobi.media.C2267a6 c2267a6 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2267a6, "<this>");
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("e_data", c2267a6.f5094a);
            contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(c2267a6.b));
            this.f4696a = 1;
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
        java.lang.String str = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + this.d + " ORDER BY timestamp DESC LIMIT " + this.e + ") foo);";
        com.inmobi.media.C2613n9 c2613n92 = this.b.f4718a;
        this.f4696a = 2;
    }
}
