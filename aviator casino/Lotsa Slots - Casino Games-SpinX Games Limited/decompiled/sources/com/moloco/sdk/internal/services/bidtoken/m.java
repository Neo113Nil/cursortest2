package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class m implements com.moloco.sdk.internal.services.bidtoken.l {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.y f7228a;
    public final com.moloco.sdk.internal.services.bidtoken.q b;
    public final java.lang.String c;
    public final kotlinx.coroutines.sync.Mutex d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenServiceImpl", f = "BidTokenService.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {117, 53, 60}, m = "bidToken", n = {"this", "metricsRecorder", "$this$withLock_u24default$iv", "this", "metricsRecorder", "$this$withLock_u24default$iv", "bidTokenTimer", "this", "metricsRecorder", "$this$withLock_u24default$iv", "bidTokenTimer", "serverBidToken"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7229a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public /* synthetic */ java.lang.Object f;
        public int h;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.m.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.m.this.a(null, this);
        }
    }

    public m(com.moloco.sdk.internal.services.bidtoken.y serverBidTokenService, com.moloco.sdk.internal.services.bidtoken.q clientBidTokenService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverBidTokenService, "serverBidTokenService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientBidTokenService, "clientBidTokenService");
        this.f7228a = serverBidTokenService;
        this.b = clientBidTokenService;
        this.c = "BidTokenServiceImpl";
        this.d = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:13:0x0046, B:14:0x00f1, B:17:0x00f8, B:19:0x0100, B:21:0x012e, B:26:0x0112), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:13:0x0046, B:14:0x00f1, B:17:0x00f8, B:19:0x0100, B:21:0x012e, B:26:0x0112), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:36:0x006c, B:37:0x00c4, B:39:0x00d0), top: B:35:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.moloco.sdk.internal.services.bidtoken.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.services.bidtoken.m.a aVar;
        java.lang.Object coroutine_suspended;
        int i;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        kotlinx.coroutines.sync.Mutex mutex;
        com.moloco.sdk.internal.services.bidtoken.m mVar;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object a2;
        com.moloco.sdk.acm.TimerEvent timerEvent;
        kotlinx.coroutines.sync.Mutex mutex3;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3;
        java.lang.String d;
        java.lang.String str;
        java.lang.Object a3;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4;
        com.moloco.sdk.internal.services.bidtoken.m mVar2;
        java.lang.String str2;
        java.lang.String str3;
        try {
            if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.m.a) {
                aVar = (com.moloco.sdk.internal.services.bidtoken.m.a) continuation;
                int i2 = aVar.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.h = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.f;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.h;
                    java.lang.String str4 = "";
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex4 = this.d;
                        aVar.f7229a = this;
                        metricsRecorder2 = metricsRecorder;
                        aVar.b = metricsRecorder2;
                        aVar.c = mutex4;
                        aVar.h = 1;
                        if (mutex4.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex4;
                        mVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str2 = (java.lang.String) aVar.e;
                                timerEvent = (com.moloco.sdk.acm.TimerEvent) aVar.d;
                                mutex2 = (kotlinx.coroutines.sync.Mutex) aVar.c;
                                metricsRecorder4 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                                mVar2 = (com.moloco.sdk.internal.services.bidtoken.m) aVar.f7229a;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    a3 = ((kotlin.Result) obj).getValue();
                                    if (kotlin.Result.m10804isFailureimpl(a3)) {
                                        a3 = "";
                                    }
                                    str3 = (java.lang.String) a3;
                                    if (str3.length() != 0) {
                                        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, mVar2.c, "CBT has error", null, false, 12, null);
                                        str = "client";
                                    } else {
                                        str4 = str2 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON + str3;
                                        str = null;
                                    }
                                    mVar = mVar2;
                                    metricsRecorder3 = metricsRecorder4;
                                    mVar.a(timerEvent, metricsRecorder3, str);
                                    mutex2.unlock(null);
                                    return str4;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                            timerEvent = (com.moloco.sdk.acm.TimerEvent) aVar.d;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) aVar.c;
                            metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                            mVar = (com.moloco.sdk.internal.services.bidtoken.m) aVar.f7229a;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.moloco.sdk.internal.services.bidtoken.k kVar = (com.moloco.sdk.internal.services.bidtoken.k) obj;
                                d = kVar.d();
                                if (d.length() > 0) {
                                    str = com.ironsource.Gb.f5725a;
                                    mutex2 = mutex3;
                                    mVar.a(timerEvent, metricsRecorder3, str);
                                    mutex2.unlock(null);
                                    return str4;
                                }
                                java.lang.String f = kVar.f();
                                com.moloco.sdk.internal.services.bidtoken.f e2 = kVar.e();
                                com.moloco.sdk.internal.services.bidtoken.q qVar = mVar.b;
                                aVar.f7229a = mVar;
                                aVar.b = metricsRecorder3;
                                aVar.c = mutex3;
                                aVar.d = timerEvent;
                                aVar.e = d;
                                aVar.h = 3;
                                a3 = qVar.a(metricsRecorder3, f, e2, aVar);
                                if (a3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex2 = mutex3;
                                metricsRecorder4 = metricsRecorder3;
                                mVar2 = mVar;
                                str2 = d;
                                if (kotlin.Result.m10804isFailureimpl(a3)) {
                                }
                                str3 = (java.lang.String) a3;
                                if (str3.length() != 0) {
                                }
                                mVar = mVar2;
                                metricsRecorder3 = metricsRecorder4;
                                mVar.a(timerEvent, metricsRecorder3, str);
                                mutex2.unlock(null);
                                return str4;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex5 = (kotlinx.coroutines.sync.Mutex) aVar.c;
                        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                        mVar = (com.moloco.sdk.internal.services.bidtoken.m) aVar.f7229a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex5;
                        metricsRecorder2 = metricsRecorder5;
                    }
                    com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.l.c());
                    com.moloco.sdk.internal.services.bidtoken.y yVar = mVar.f7228a;
                    aVar.f7229a = mVar;
                    aVar.b = metricsRecorder2;
                    aVar.c = mutex;
                    aVar.d = startTimerEvent;
                    aVar.h = 2;
                    a2 = yVar.a(metricsRecorder2, aVar);
                    if (a2 != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder6 = metricsRecorder2;
                    timerEvent = startTimerEvent;
                    obj = a2;
                    mutex3 = mutex;
                    metricsRecorder3 = metricsRecorder6;
                    com.moloco.sdk.internal.services.bidtoken.k kVar2 = (com.moloco.sdk.internal.services.bidtoken.k) obj;
                    d = kVar2.d();
                    if (d.length() > 0) {
                    }
                }
            }
            com.moloco.sdk.acm.TimerEvent startTimerEvent2 = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.l.c());
            com.moloco.sdk.internal.services.bidtoken.y yVar2 = mVar.f7228a;
            aVar.f7229a = mVar;
            aVar.b = metricsRecorder2;
            aVar.c = mutex;
            aVar.d = startTimerEvent2;
            aVar.h = 2;
            a2 = yVar2.a(metricsRecorder2, aVar);
            if (a2 != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex3 = mutex2;
            mutex3.unlock(null);
            throw th;
        }
        aVar = new com.moloco.sdk.internal.services.bidtoken.m.a(continuation);
        java.lang.Object obj2 = aVar.f;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.h;
        java.lang.String str42 = "";
        if (i != 0) {
        }
    }

    public final void a(com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str) {
        if (str != null) {
            com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.r.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
            com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), str));
            metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), str));
            return;
        }
        com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.r.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
        metricsRecorder.recordCountEvent(countEvent2.withTag(dVar3.c(), "success"));
        metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar3.c(), "success"));
    }
}
