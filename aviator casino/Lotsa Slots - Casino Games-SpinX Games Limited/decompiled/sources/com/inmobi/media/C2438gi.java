package com.inmobi.media;

/* renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2438gi extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5222a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438gi(java.lang.String str, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, long j, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = gestureDetectorOnGestureListenerC2675pi;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2438gi c2438gi = new com.inmobi.media.C2438gi(this.c, this.d, this.e, continuation);
        c2438gi.b = obj;
        return c2438gi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.C2438gi) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r1, r13) == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5222a;
        try {
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.c;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.c.getValue();
            com.inmobi.media.Re re = new com.inmobi.media.Re(str, null, null, null, null, false, 62);
            this.f5222a = 1;
            obj = b9.f4618a.a(re, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
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
        com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
        m10798constructorimpl = kotlin.Result.m10798constructorimpl(ve.c() == 200 ? kotlin.TuplesKt.to(ve.d().string(kotlin.text.Charsets.UTF_8), kotlin.coroutines.jvm.internal.Boxing.boxInt(200)) : kotlin.TuplesKt.to(null, kotlin.coroutines.jvm.internal.Boxing.boxInt(ve.c())));
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.d;
        java.lang.String str2 = this.c;
        long j = this.e;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = gestureDetectorOnGestureListenerC2675pi.i;
            if (interfaceC2772t9 != null) {
                java.lang.String str3 = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b(str3, "Error prefetching HTML content from URL: " + str2 + io.ktor.sse.ServerSentEventKt.SPACE + m10801exceptionOrNullimpl.getMessage());
            }
            com.inmobi.media.C2936zi renderViewTelemetry = gestureDetectorOnGestureListenerC2675pi.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(j, kotlin.coroutines.jvm.internal.Boxing.boxShort((short) 3101));
            }
            m10798constructorimpl = kotlin.TuplesKt.to(null, kotlin.coroutines.jvm.internal.Boxing.boxInt(3101));
        }
        kotlin.Pair pair = (kotlin.Pair) m10798constructorimpl;
        java.lang.String str4 = (java.lang.String) pair.component1();
        int intValue = ((java.lang.Number) pair.component2()).intValue();
        kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
        com.inmobi.media.C2411fi c2411fi = new com.inmobi.media.C2411fi(this.d, str4, this.e, intValue, null);
        this.f5222a = 2;
    }
}
