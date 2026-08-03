package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class A implements com.moloco.sdk.internal.publisher.z {
    public static final com.moloco.sdk.internal.publisher.A.a l = new com.moloco.sdk.internal.publisher.A.a(null);
    public static final int m = 8;
    public static final java.lang.String n = "InternalAdShowListenerImpl";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.AdShowListener f7070a;
    public final com.moloco.sdk.internal.services.InterfaceC3435f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> d;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.internal.publisher.C3427k> e;
    public final com.moloco.sdk.internal.w f;
    public final com.moloco.sdk.internal.f g;
    public final com.moloco.sdk.publisher.AdFormatType h;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder i;
    public final com.moloco.sdk.internal.client_metrics_data.a j;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> k;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InternalAdShowListenerImpl$onAdShowSuccess$2$1", f = "InternalAdShowListener.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7071a;
        public final /* synthetic */ long c;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.C3427k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, com.moloco.sdk.internal.publisher.C3427k c3427k, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.A.b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = c3427k;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.publisher.A.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.publisher.A.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7071a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = com.moloco.sdk.internal.publisher.A.this.c;
                long j = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.e.b;
                java.lang.String a2 = this.d.a();
                this.f7071a = 1;
                obj = aVar.a(j, eVar, a2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.publisher.A.this.g.a((java.lang.String) obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(com.moloco.sdk.publisher.AdShowListener adShowListener, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.publisher.C3427k> provideBUrlData, com.moloco.sdk.internal.w sdkEventUrlTracker, com.moloco.sdk.internal.f bUrlTracker, com.moloco.sdk.publisher.AdFormatType adType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        this.f7070a = adShowListener;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = provideSdkEvents;
        this.e = provideBUrlData;
        this.f = sdkEventUrlTracker;
        this.g = bUrlTracker;
        this.h = adType;
        this.i = metricsRecorder;
        this.j = acmClickDeduper;
        this.k = function0;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String onAdClicked;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, n, "onAdClicked: " + molocoAd, false, 4, null);
        this.b.b();
        com.moloco.sdk.internal.ortb.model.B invoke = this.d.invoke();
        if (invoke != null && (onAdClicked = invoke.getOnAdClicked()) != null) {
            com.moloco.sdk.internal.w.a.a(this.f, onAdClicked, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.i;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.D.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = this.h.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(com.moloco.sdk.internal.publisher.C3424h.a(countEvent.withTag(c, lowerCase), this.k));
        this.j.a(this.h);
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7070a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String onAdHidden;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, n, "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.B invoke = this.d.invoke();
        if (invoke != null && (onAdHidden = invoke.getOnAdHidden()) != null) {
            com.moloco.sdk.internal.w.a.a(this.f, onAdHidden, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.i;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d0.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = this.h.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(com.moloco.sdk.internal.publisher.C3424h.a(countEvent.withTag(c, lowerCase), this.k));
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7070a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str) {
        java.lang.String onAdShowSuccess;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onAdShowSuccess: ");
        sb.append(molocoAd);
        sb.append(", creativeType: ");
        kotlin.jvm.functions.Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0 = this.k;
        sb.append(function0 != null ? function0.invoke() : null);
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, n, sb.toString(), false, 4, null);
        com.moloco.sdk.internal.ortb.model.B invoke = this.d.invoke();
        if (invoke != null && (onAdShowSuccess = invoke.getOnAdShowSuccess()) != null) {
            com.moloco.sdk.internal.w.a.a(this.f, onAdShowSuccess, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        this.j.a();
        com.moloco.sdk.internal.publisher.C3427k invoke2 = this.e.invoke();
        if (invoke2 != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.f7189a.b(), null, null, new com.moloco.sdk.internal.publisher.A.b(java.lang.System.currentTimeMillis(), invoke2, null), 3, null);
        }
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.B.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = this.h.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.moloco.sdk.acm.CountEvent a2 = com.moloco.sdk.internal.publisher.C3424h.a(countEvent.withTag(c, lowerCase), this.k);
        if (str != null) {
            a2.withTag(com.moloco.sdk.internal.client_metrics_data.d.j.c(), str);
        }
        this.i.recordCountEvent(a2);
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7070a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    public /* synthetic */ A(com.moloco.sdk.publisher.AdShowListener adShowListener, com.moloco.sdk.internal.services.InterfaceC3435f interfaceC3435f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.moloco.sdk.internal.w wVar, com.moloco.sdk.internal.f fVar, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a aVar2, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adShowListener, interfaceC3435f, aVar, function0, function02, wVar, fVar, adFormatType, metricsRecorder, aVar2, (i & 1024) != 0 ? null : function03);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.s internalError) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, n, "onAdShowFailed: " + internalError, false, 4, null);
        com.moloco.sdk.internal.ortb.model.B invoke = this.d.invoke();
        if (invoke != null && (str = invoke.getCom.ironsource.Vf.e java.lang.String()) != null) {
            this.f.a(str, java.lang.System.currentTimeMillis(), internalError);
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.i;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.C.c());
        java.lang.String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        java.lang.String lowerCase = this.h.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(internalError.e().getErrorType())));
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7070a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(internalError.e());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, n, "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
    }
}
