package com.paypal.oslo.feature.taptopay.data.observer.auth;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLogoutObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "isNfcSupportedUseCase", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;", "backgroundSyncWorkerCanceller", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;Lkotlinx/coroutines/CoroutineScope;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayLogoutObserver implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TapToPayLogoutObserver(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller backgroundSyncWorkerCanceller, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcSupportedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncWorkerCanceller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = isNfcSupportedUseCase;
        this.Camera2StreamConfigurationMap = backgroundSyncWorkerCanceller;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.AnonymousClass1(null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1", f = "TapToPayLogoutObserver.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {65}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.this.getHighResolutionOutputSizeshNQ4ISI.invoke()) {
                    final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.this.getHighSpeedVideoFpsRanges.getUserState();
                    kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getInputFormats -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getInputFormats;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.core.userstore.model.UserState) obj) instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                            anonymousClass1.getInputFormats = 1;
                                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                            java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                            java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getInputFormats;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1$2", f = "TapToPayLogoutObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                            /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object Camera2StreamConfigurationMap;
                                java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                                int getHighSpeedVideoFpsRanges;
                                java.lang.Object getHighSpeedVideoFpsRangesFor;
                                java.lang.Object getHighSpeedVideoSizes;
                                /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                                int getInputFormats;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoSizesFor = obj;
                                    this.getInputFormats |= Integer.MIN_VALUE;
                                    return com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.getHighSpeedVideoSizes = flowCollector;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    });
                    final com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver tapToPayLogoutObserver = com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.this;
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                                com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.access$handleLogout(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.this);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay logout observer skipped: NFC not supported", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public static final /* synthetic */ void access$handleLogout(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver tapToPayLogoutObserver) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay logout detected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "cancelling_background_sync_workers")), null, 4, null);
        try {
            tapToPayLogoutObserver.Camera2StreamConfigurationMap.invoke();
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to cancel background sync workers on logout", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "cancel_background_sync_workers")), null, th, 4, null);
        }
    }
}
