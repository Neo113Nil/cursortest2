package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ra extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4936a;
    public final /* synthetic */ com.inmobi.media.Sa b;
    public final /* synthetic */ com.inmobi.media.X9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(com.inmobi.media.Sa sa, com.inmobi.media.X9 x9, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = sa;
        this.c = x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Ra(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Ra(this.b, this.c, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (com.inmobi.media.Sa.a(r6, r1, r5) == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4936a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.core.config.models.CrashConfig.ANRConfig anr = this.b.f4953a.getAnr();
            if (!com.inmobi.media.AbstractC2939zl.a(this.c)) {
                return kotlin.Unit.INSTANCE;
            }
            if (this.c instanceof com.inmobi.media.C2919z1) {
                com.inmobi.media.B5.f4614a.getClass();
                if (com.inmobi.media.B5.t() && anr.getAppExitReason().getUseForReporting() && this.b.c.d.a()) {
                    com.inmobi.media.X9 x9 = this.c;
                    x9.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ANREvent", "<set-?>");
                    x9.f5268a = "ANREvent";
                    com.inmobi.media.Sa sa = this.b;
                    com.inmobi.media.X9 x92 = this.c;
                    this.f4936a = 1;
                }
            }
            if ((this.c instanceof com.inmobi.media.C2654oo) && anr.getWatchdog().getUseForReporting() && this.b.c.c.a()) {
                com.inmobi.media.Sa sa2 = this.b;
                com.inmobi.media.X9 x93 = this.c;
                this.f4936a = 2;
            } else {
                if (!(this.c instanceof com.inmobi.media.X4)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (this.b.f4953a.getCrashConfig().getEnabled() && this.b.c.f5062a.a()) {
                    com.inmobi.media.Sa sa3 = this.b;
                    com.inmobi.media.X9 x94 = this.c;
                    this.f4936a = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return kotlin.Unit.INSTANCE;
    }
}
