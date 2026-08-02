package com.paypal.oslo.feature.searchandintelligence.data.observer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1", f = "SearchAndIntelligenceLogoutObserver.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {66}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class SearchAndIntelligenceLogoutObserver$observeUserState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Started observing UserStore for chat session cleanup", null, null, 6, null);
            userStore = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
            kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getInputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getInputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.core.userstore.model.UserState) obj) instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoSizes = 0;
                                    anonymousClass1.getInputFormats = 1;
                                    if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                    java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getInputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1$2", f = "SearchAndIntelligenceLogoutObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        java.lang.Object getHighSpeedVideoFpsRangesFor;
                        int getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                        int getInputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getHighSpeedVideoSizesFor = obj;
                            this.getInputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoFpsRanges = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            });
            final com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver searchAndIntelligenceLogoutObserver = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence;
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "User logged out, notifying chat delegate", null, null, 6, null);
                        internalSearchAndIntelligence = com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver.this.getHighResolutionOutputSizeshNQ4ISI;
                        internalSearchAndIntelligence.notifyLogout();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchAndIntelligenceLogoutObserver$observeUserState$1(com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver searchAndIntelligenceLogoutObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.observer.SearchAndIntelligenceLogoutObserver$observeUserState$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = searchAndIntelligenceLogoutObserver;
    }
}
