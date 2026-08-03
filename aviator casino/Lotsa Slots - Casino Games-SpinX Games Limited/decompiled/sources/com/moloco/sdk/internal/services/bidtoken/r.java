package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class r implements com.moloco.sdk.internal.services.bidtoken.q {
    public static final int k = 8;
    public final com.moloco.sdk.internal.services.J b;
    public final com.moloco.sdk.internal.services.bidtoken.o c;
    public final com.moloco.sdk.internal.services.encryption.a d;
    public final com.moloco.sdk.internal.services.bidtoken.providers.l e;
    public final java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public com.moloco.sdk.internal.services.bidtoken.f i;
    public final kotlinx.coroutines.sync.Mutex j;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ClientBidTokenServiceImpl", f = "ClientBidTokenService.kt", i = {0, 0, 0, 0, 0}, l = {191}, m = "bidToken-BWLJW6A", n = {"this", "metricsRecorder", "publicKey", "bidTokenConfig", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7248a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public /* synthetic */ java.lang.Object f;
        public int h;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.r.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.internal.services.bidtoken.r.this.a(null, null, null, this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    public r(com.moloco.sdk.internal.services.J timeProviderService, com.moloco.sdk.internal.services.bidtoken.o clientBidTokenBuilder, com.moloco.sdk.internal.services.encryption.a encryptionService, com.moloco.sdk.internal.services.bidtoken.providers.l signalProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientBidTokenBuilder, "clientBidTokenBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalProvider, "signalProvider");
        this.b = timeProviderService;
        this.c = clientBidTokenBuilder;
        this.d = encryptionService;
        this.e = signalProvider;
        this.f = "ClientBidTokenServiceImpl";
        this.g = "";
        this.h = "";
        this.i = com.moloco.sdk.internal.services.bidtoken.e.a();
        this.j = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b3, B:16:0x00bb, B:20:0x00d0, B:23:0x0099), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #0 {all -> 0x00dc, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b3, B:16:0x00bb, B:20:0x00d0, B:23:0x0099), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0 A[Catch: all -> 0x00dc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00dc, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b3, B:16:0x00bb, B:20:0x00d0, B:23:0x0099), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b3, B:16:0x00bb, B:20:0x00d0, B:23:0x0099), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.internal.services.bidtoken.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String str, com.moloco.sdk.internal.services.bidtoken.f fVar, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        com.moloco.sdk.internal.services.bidtoken.r.a aVar;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.moloco.sdk.internal.services.bidtoken.r rVar;
        try {
            if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.r.a) {
                aVar = (com.moloco.sdk.internal.services.bidtoken.r.a) continuation;
                int i2 = aVar.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.h = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.f;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.h;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.j;
                        aVar.f7248a = this;
                        aVar.b = metricsRecorder;
                        aVar.c = str;
                        aVar.d = fVar;
                        aVar.e = mutex;
                        aVar.h = 1;
                        if (mutex.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        rVar = this;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) aVar.e;
                        fVar = (com.moloco.sdk.internal.services.bidtoken.f) aVar.d;
                        str = (java.lang.String) aVar.c;
                        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                        rVar = (com.moloco.sdk.internal.services.bidtoken.r) aVar.f7248a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        metricsRecorder = metricsRecorder2;
                    }
                    if (rVar.a(str, fVar)) {
                        metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "true"));
                    } else {
                        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, rVar.f, "Bid token needs refresh, fetching new bid token", false, 4, null);
                        rVar.g = str;
                        rVar.i = fVar;
                        metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "false"));
                        rVar.h = rVar.a(str, metricsRecorder);
                    }
                    if (rVar.h.length() != 0) {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Client bid token is empty")));
                    }
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(rVar.h);
                }
            }
            if (rVar.a(str, fVar)) {
            }
            if (rVar.h.length() != 0) {
            }
        } finally {
            mutex.unlock(null);
        }
        aVar = new com.moloco.sdk.internal.services.bidtoken.r.a(continuation);
        java.lang.Object obj2 = aVar.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.h;
        if (i != 0) {
        }
    }

    public final boolean a(com.moloco.sdk.internal.services.bidtoken.f fVar) {
        com.moloco.sdk.internal.services.bidtoken.f fVar2 = this.i;
        this.i = fVar;
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(fVar2, fVar);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, z ? "config updated" : "config didn't change", false, 4, null);
        return z;
    }

    public final boolean a(java.lang.String str, com.moloco.sdk.internal.services.bidtoken.f fVar) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.g, str)) {
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, "rp changed, needs refresh", false, 4, null);
            return true;
        }
        if (a(fVar)) {
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (this.h.length() == 0) {
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (this.e.b()) {
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.f, "Bid token doesn't need refresh", false, 4, null);
        return false;
    }

    public final java.lang.String a(java.lang.String str, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        java.lang.Exception exc;
        java.lang.String str2;
        byte[] a2;
        com.moloco.sdk.internal.MolocoLogger molocoLogger;
        byte[] encode;
        if (str.length() == 0) {
            metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "empty_public_key"));
            return "";
        }
        com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.o.c());
        try {
            long a3 = this.b.a();
            str2 = "rsa";
            try {
                a2 = this.d.a(str);
                java.lang.String str3 = "update_signal_state";
                try {
                    this.e.a();
                    str3 = "provide_signal";
                    com.moloco.sdk.BidToken.ClientBidTokenComponents a4 = this.c.a(this.e.d(), this.i);
                    molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger, this.f, "BidToken Component: " + a4, false, 4, null);
                    encode = android.util.Base64.encode(a4.toByteArray(), 0);
                } catch (java.lang.Exception e) {
                    exc = e;
                    str2 = str3;
                }
            } catch (java.lang.Exception e2) {
                exc = e2;
            }
            try {
                com.moloco.sdk.internal.services.encryption.a aVar = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
                byte[] encode2 = android.util.Base64.encode(aVar.a(encode), 0);
                com.moloco.sdk.internal.services.bidtoken.o oVar = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(encode2);
                java.lang.String encodeToString = android.util.Base64.encodeToString(oVar.a(encode2, a2), 0);
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder.recordTimerEvent(startTimerEvent.withTag(dVar.c(), "success"));
                metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c()).withTag(dVar.c(), "success"));
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, this.f, "Client bid token build time: " + (this.b.a() - a3) + " ms", null, false, 12, null);
                return "v2:" + encodeToString;
            } catch (java.lang.Exception e3) {
                exc = e3;
                str2 = "aes";
                java.lang.String simpleName = exc.getClass().getSimpleName();
                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.warn$default(molocoLogger2, this.f, "Client bid token build failed: " + simpleName, exc, false, 8, null);
                com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c());
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
                com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                com.moloco.sdk.acm.CountEvent withTag2 = withTag.withTag(dVar3.c(), simpleName);
                if (str2.length() > 0) {
                    withTag2.withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), str2);
                }
                com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger2, this.f, "Recording metric failure: " + withTag2.getName() + ", tags: " + kotlin.collections.CollectionsKt.joinToString$default(withTag2.getEventTags(), ",", null, null, 0, null, null, 62, null), false, 4, null);
                metricsRecorder.recordCountEvent(withTag2);
                metricsRecorder.recordTimerEvent(startTimerEvent.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar3.c(), simpleName));
                return "";
            }
        } catch (java.lang.Exception e4) {
            exc = e4;
            str2 = "";
        }
    }
}
