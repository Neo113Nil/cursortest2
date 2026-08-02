package com.paypal.oslo.app.launch;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/app/launch/SessionLaunchSourceProviderImpl;", "Lcom/paypal/oslo/core/telemetry/analytics/SessionLaunchSourceProvider;", "Lcom/paypal/oslo/app/launch/AppLaunchSourceProvider;", "appLaunchSourceProvider", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/app/launch/AppLaunchSourceProvider;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getSessionLaunchTrafficSource", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/app/launch/AppLaunchSourceProvider;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionLaunchSourceProviderImpl implements com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.app.launch.AppLaunchSourceProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SessionLaunchSourceProviderImpl(com.paypal.oslo.app.launch.AppLaunchSourceProvider appLaunchSourceProvider, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLaunchSourceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.Camera2StreamConfigurationMap = appLaunchSourceProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1(null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl$1", f = "SessionLaunchSourceProviderImpl.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, nl = {43}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                obj = kotlinx.coroutines.flow.FlowKt.first(com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.this.Camera2StreamConfigurationMap.getLaunchSource(), new com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1.C01111(null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.app.launch.AppLaunchSource appLaunchSource = (com.paypal.oslo.app.launch.AppLaunchSource) obj;
            if (appLaunchSource != null) {
                com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl sessionLaunchSourceProviderImpl = com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.this;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.app.LoggerKt.log, "Captured session launch source", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", appLaunchSource)), null, 4, null);
                sessionLaunchSourceProviderImpl.getHighSpeedVideoSizes = com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.access$mapToTrafficSourceContext(sessionLaunchSourceProviderImpl, appLaunchSource);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/app/launch/AppLaunchSource;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl$1$1", f = "SessionLaunchSourceProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01111 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.app.launch.AppLaunchSource, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
            int getHighSpeedVideoFpsRanges;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.app.launch.AppLaunchSource appLaunchSource = (com.paypal.oslo.app.launch.AppLaunchSource) this.getHighSpeedVideoSizes;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRanges != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(appLaunchSource != null);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.app.launch.AppLaunchSource appLaunchSource, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1.C01111) create(appLaunchSource, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1.C01111 c01111 = new com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1.C01111(continuation);
                c01111.getHighSpeedVideoSizes = obj;
                return c01111;
            }

            C01111(kotlin.coroutines.Continuation<? super com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1.C01111> continuation) {
                super(2, continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider
    /* renamed from: getSessionLaunchTrafficSource, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext access$mapToTrafficSourceContext(com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl sessionLaunchSourceProviderImpl, com.paypal.oslo.app.launch.AppLaunchSource appLaunchSource) {
        if (appLaunchSource instanceof com.paypal.oslo.app.launch.AppLaunchSource.Organic) {
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext("organic", null);
        }
        if (appLaunchSource instanceof com.paypal.oslo.app.launch.AppLaunchSource.DeepLink) {
            return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext("deep_link", ((com.paypal.oslo.app.launch.AppLaunchSource.DeepLink) appLaunchSource).getId());
        }
        if (!(appLaunchSource instanceof com.paypal.oslo.app.launch.AppLaunchSource.PushNotification)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext(com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider.DEEPLINK_SOURCE_VALUE, ((com.paypal.oslo.app.launch.AppLaunchSource.PushNotification) appLaunchSource).getNotificationId());
    }
}
