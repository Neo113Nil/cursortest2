package com.inmobi.media;

/* renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2869x1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2894y1 f5540a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2869x1(com.inmobi.media.C2894y1 c2894y1, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f5540a = c2894y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2869x1(this.f5540a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.C2869x1(this.f5540a, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.inmobi.media.C2919z1 c2919z1;
        okio.Source source;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2894y1 c2894y1 = this.f5540a;
        java.util.List<android.app.ApplicationExitInfo> historicalProcessExitReasons = c2894y1.f.getHistoricalProcessExitReasons(c2894y1.b.getPackageName(), 0, 10);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        com.inmobi.media.La la = this.f5540a.g;
        la.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("exitReasonTimestamp", com.ironsource.X3.i.W);
        long j = la.f4815a.getLong("exitReasonTimestamp", 0L);
        com.inmobi.media.C2894y1 c2894y12 = this.f5540a;
        long j2 = j;
        for (android.app.ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getTimestamp() > j) {
                try {
                    int reason = applicationExitInfo.getReason();
                    java.lang.String description = applicationExitInfo.getDescription();
                    java.io.InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                    c2919z1 = new com.inmobi.media.C2919z1(description, reason, com.inmobi.media.J3.a((traceInputStream == null || (source = okio.Okio.source(traceInputStream)) == null) ? null : okio.Okio.buffer(source), c2894y12.d));
                } catch (java.lang.Exception e) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2894y12.e, "access$getTAG$p(...)");
                    e.getMessage();
                    c2919z1 = new com.inmobi.media.C2919z1(applicationExitInfo.getDescription(), applicationExitInfo.getReason(), kotlin.ExceptionsKt.stackTraceToString(e));
                }
                long j3 = c2894y12.c;
                com.inmobi.media.C2843w1 runnable = new com.inmobi.media.C2843w1(c2894y12, c2919z1, null);
                kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC2939zl.f5596a, null, null, new com.inmobi.media.C2863wl(j3, null, runnable), 3, null);
                if (applicationExitInfo.getTimestamp() > j2) {
                    j2 = applicationExitInfo.getTimestamp();
                }
            }
        }
        this.f5540a.g.a("exitReasonTimestamp", j2, false);
        return kotlin.Unit.INSTANCE;
    }
}
