package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class i implements com.moloco.sdk.internal.services.bidtoken.h {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.l f7224a;
    public final com.moloco.sdk.internal.publisher.w b;
    public final com.moloco.sdk.internal.services.J c;
    public final java.lang.String d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenHandlerImpl", f = "BidTokenHandler.kt", i = {0, 0, 0, 0}, l = {60}, m = "handleBidTokenRequest", n = {"this", "metricsRecorder", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bidTokenLoadStart"}, s = {"L$0", "L$1", "L$2", "J$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7225a;
        public java.lang.Object b;
        public java.lang.Object c;
        public long d;
        public /* synthetic */ java.lang.Object e;
        public int g;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.i.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.i.this.a(null, null, null, this);
        }
    }

    public i(com.moloco.sdk.internal.services.bidtoken.l bidTokenService, com.moloco.sdk.internal.publisher.w initializationHandler, com.moloco.sdk.internal.services.J timeProviderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenService, "bidTokenService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationHandler, "initializationHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f7224a = bidTokenService;
        this.b = initializationHandler;
        this.c = timeProviderService;
        this.d = "BidTokenHandlerImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.internal.services.bidtoken.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.publisher.MolocoBidTokenListener molocoBidTokenListener, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.services.bidtoken.i.a aVar;
        int i;
        long a2;
        com.moloco.sdk.internal.services.bidtoken.i iVar;
        java.lang.String str;
        com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = metricsRecorder;
        com.moloco.sdk.publisher.MolocoBidTokenListener molocoBidTokenListener2 = molocoBidTokenListener;
        if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.i.a) {
            aVar = (com.moloco.sdk.internal.services.bidtoken.i.a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.p.c()));
                    if (!this.b.c()) {
                        com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType2 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT;
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.d, "Bid token cannot be fetched because SDK initialization cannot happen due to WM issue", null, false, 12, null);
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "sdk_cannot_initialize"));
                        molocoBidTokenListener2.onBidTokenResult("", errorType2);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (this.b.d().getValue() == com.moloco.sdk.publisher.Initialization.FAILURE || com.moloco.sdk.publisher.Moloco.INSTANCE.getFailedMediations$moloco_sdk_release().contains(mediationInfo.getName())) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.d, "Bid token cannot be fetched because SDK initialization has failed", null, false, 12, null);
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "sdk_init_failed"));
                        molocoBidTokenListener2.onBidTokenResult("", com.moloco.sdk.publisher.MolocoAdError.ErrorType.SDK_INIT_ERROR);
                        return kotlin.Unit.INSTANCE;
                    }
                    a2 = this.c.a();
                    com.moloco.sdk.internal.services.bidtoken.l lVar = this.f7224a;
                    aVar.f7225a = this;
                    aVar.b = metricsRecorder2;
                    aVar.c = molocoBidTokenListener2;
                    aVar.d = a2;
                    aVar.g = 1;
                    obj = lVar.a(metricsRecorder2, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = aVar.d;
                    com.moloco.sdk.publisher.MolocoBidTokenListener molocoBidTokenListener3 = (com.moloco.sdk.publisher.MolocoBidTokenListener) aVar.c;
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar.b;
                    iVar = (com.moloco.sdk.internal.services.bidtoken.i) aVar.f7225a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a2 = j;
                    molocoBidTokenListener2 = molocoBidTokenListener3;
                    metricsRecorder2 = metricsRecorder3;
                }
                str = (java.lang.String) obj;
                long a3 = iVar.c.a() - a2;
                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, iVar.d, "Bid token fetched in " + a3 + " ms", null, false, 12, null);
                if (str.length() != 0) {
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder2.recordCountEvent(withTag.withTag(dVar2.c(), "bid_token_fetch_failed"));
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    if (a3 >= timeUnit.toMillis(1L)) {
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.s.c()).withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "bid_token_fetch_failed"));
                    }
                    if (a3 >= timeUnit.toMillis(3L)) {
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.t.c()).withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "bid_token_fetch_failed"));
                    }
                    errorType = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_SIGNAL_COLLECTION_FAILED;
                } else {
                    com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), "success"));
                    java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
                    if (a3 >= timeUnit2.toMillis(1L)) {
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.s.c()).withTag(dVar3.c(), "success"));
                    }
                    if (a3 >= timeUnit2.toMillis(3L)) {
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.t.c()).withTag(dVar3.c(), "success"));
                    }
                    errorType = null;
                }
                java.lang.String str2 = iVar.d;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Returning bid token result, hasError: ");
                sb.append(errorType == null);
                sb.append(", SDK init complete: ");
                sb.append(com.moloco.sdk.publisher.Moloco.isInitialized());
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str2, sb.toString(), null, false, 12, null);
                molocoBidTokenListener2.onBidTokenResult(str, errorType);
                return kotlin.Unit.INSTANCE;
            }
        }
        aVar = new com.moloco.sdk.internal.services.bidtoken.i.a(continuation);
        java.lang.Object obj2 = aVar.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        long a32 = iVar.c.a() - a2;
        com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, iVar.d, "Bid token fetched in " + a32 + " ms", null, false, 12, null);
        if (str.length() != 0) {
        }
        java.lang.String str22 = iVar.d;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Returning bid token result, hasError: ");
        sb2.append(errorType == null);
        sb2.append(", SDK init complete: ");
        sb2.append(com.moloco.sdk.publisher.Moloco.isInitialized());
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, str22, sb2.toString(), null, false, 12, null);
        molocoBidTokenListener2.onBidTokenResult(str, errorType);
        return kotlin.Unit.INSTANCE;
    }
}
