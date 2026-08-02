package com.paypal.oslo.app.identity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1", f = "AuthNavigationCacheClearer.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class AuthNavigationCacheClearer$observeNavigation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.app.identity.AuthNavigationCacheClearer getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Started observing navigation for login cache clearing", null, null, 6, null);
            final com.paypal.oslo.app.identity.AuthNavigationCacheClearer authNavigationCacheClearer = this.getHighSpeedVideoSizes;
            final kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.identity.AuthNavigationCacheClearer.this);
                }
            }));
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (new kotlinx.coroutines.flow.Flow<androidx.navigation3.runtime.NavKey>() { // from class: com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getOutputFormats -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputFormats;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                    androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) obj;
                                    if ((navKey instanceof com.paypal.oslo.feature.identity.api.navigation.AuthenticationFlowDestination) || (navKey instanceof com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination)) {
                                        anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                        anonymousClass1.getOutputFormats = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getInputFormats;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getOutputFormats;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1$2", f = "AuthNavigationCacheClearer.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                    /* renamed from: com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        java.lang.Object Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        int getHighSpeedVideoFpsRangesFor;
                        java.lang.Object getHighSpeedVideoSizes;
                        /* synthetic */ java.lang.Object getInputFormats;
                        int getOutputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getInputFormats = obj;
                            this.getOutputFormats |= Integer.MIN_VALUE;
                            return com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.Camera2StreamConfigurationMap = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.navigation3.runtime.NavKey> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            }.collect(new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1.AnonymousClass3(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3, reason: invalid class name */
    static final class AnonymousClass3<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.app.identity.AuthNavigationCacheClearer getHighSpeedVideoSizes;

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            throw r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            com.paypal.oslo.app.LoggerKt.log.e("Failed to clear network caches on auth navigation", r11);
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(androidx.navigation3.runtime.NavKey navKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3$emit$1 authNavigationCacheClearer$observeNavigation$1$3$emit$1;
            int i;
            com.paypal.oslo.core.session.NetworkCacheClearer networkCacheClearer;
            if (continuation instanceof com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3$emit$1) {
                authNavigationCacheClearer$observeNavigation$1$3$emit$1 = (com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3$emit$1) continuation;
                if ((authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Auth screen detected, clearing network caches", null, null, 6, null);
                        networkCacheClearer = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(navKey);
                        authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (networkCacheClearer.clearAllCaches(authNavigationCacheClearer$observeNavigation$1$3$emit$1) == coroutine_suspended) {
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
            }
            authNavigationCacheClearer$observeNavigation$1$3$emit$1 = new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1$3$emit$1(this, continuation);
            java.lang.Object obj2 = authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = authNavigationCacheClearer$observeNavigation$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass3(com.paypal.oslo.app.identity.AuthNavigationCacheClearer authNavigationCacheClearer) {
            this.getHighSpeedVideoSizes = authNavigationCacheClearer;
        }
    }

    public static /* synthetic */ androidx.navigation3.runtime.NavKey getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.identity.AuthNavigationCacheClearer authNavigationCacheClearer) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        appNavigator = authNavigationCacheClearer.getHighResolutionOutputSizeshNQ4ISI;
        return (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) appNavigator.getBackStack());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthNavigationCacheClearer$observeNavigation$1(com.paypal.oslo.app.identity.AuthNavigationCacheClearer authNavigationCacheClearer, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.AuthNavigationCacheClearer$observeNavigation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = authNavigationCacheClearer;
    }
}
