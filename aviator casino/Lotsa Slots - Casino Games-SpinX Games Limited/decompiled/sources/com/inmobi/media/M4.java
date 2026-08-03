package com.inmobi.media;

/* loaded from: classes5.dex */
public final class M4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4828a;
    public final /* synthetic */ com.inmobi.media.C2267a6 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(com.inmobi.media.C2267a6 c2267a6, long j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2267a6;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.M4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.M4(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4828a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.O4 o4 = com.inmobi.media.O4.f4868a;
            com.inmobi.media.C2267a6 c2267a6 = this.b;
            int maxAdRecords = com.inmobi.media.O4.c().getContextualData().getMaxAdRecords();
            long j = this.c;
            this.f4828a = 1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            com.inmobi.media.G4 g4 = (com.inmobi.media.G4) com.inmobi.media.O4.b.getValue();
            com.inmobi.media.C2613n9 c2613n9 = g4.f4718a;
            com.inmobi.media.F4 f4 = new com.inmobi.media.F4(g4, c2267a6, j, maxAdRecords, null);
            c2613n9.getClass();
            java.lang.Object a2 = c2613n9.a(new com.inmobi.media.C2585m9(c2613n9, f4, null), this);
            if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = kotlin.Unit.INSTANCE;
            }
            if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = kotlin.Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
