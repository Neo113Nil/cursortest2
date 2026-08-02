package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1", f = "RemoteConfigUserObserver.kt", i = {1}, l = {62, 80}, m = "invokeSuspend", n = {"visitorId"}, nl = {64, 88}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class RemoteConfigUserObserver$startObserving$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r1.collect(new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1.AnonymousClass2(), r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity;
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appIdentity = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            obj = appIdentity.appGuid(this);
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
        final java.lang.String str = (java.lang.String) obj;
        userStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
        final com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver remoteConfigUserObserver = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.flow.Flow filterNotNull = kotlinx.coroutines.flow.FlowKt.filterNotNull(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser>() { // from class: com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver Camera2StreamConfigurationMap;
                final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser remoteConfigUser;
                    com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity;
                    com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity2;
                    if (continuation instanceof com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
                                    com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser.Companion companion = com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser.INSTANCE;
                                    java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                                    appIdentity2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                                    remoteConfigUser = companion.anonymous(str, appIdentity2.getDistributionChannel().getValue());
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    com.paypal.oslo.core.userstore.model.User user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser();
                                    java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                                    appIdentity = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                                    remoteConfigUser = com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUserKt.toRemoteConfigUser(user, str2, appIdentity.getDistributionChannel().getValue());
                                } else {
                                    remoteConfigUser = null;
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(remoteConfigUser, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1$2", f = "RemoteConfigUserObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str, com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver remoteConfigUserObserver) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = str;
                    this.Camera2StreamConfigurationMap = remoteConfigUserObserver;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector, str, remoteConfigUserObserver), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }));
        final com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver remoteConfigUserObserver2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigUserObserver$startObserving$1$1(com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver remoteConfigUserObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver$startObserving$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = remoteConfigUserObserver;
    }
}
