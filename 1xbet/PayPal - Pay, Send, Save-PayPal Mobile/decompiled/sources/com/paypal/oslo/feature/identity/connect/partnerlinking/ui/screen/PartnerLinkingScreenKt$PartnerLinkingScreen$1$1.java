package com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1", f = "PartnerLinkingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PartnerLinkingScreenKt$PartnerLinkingScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.app.Activity getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1$1", f = "PartnerLinkingScreen.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, nl = {143}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.app.Activity getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01221<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
            final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
            final /* synthetic */ android.app.Activity getHighSpeedVideoSizes;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect partnerLinkingUiEffect = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect) obj;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingScreen - flow completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", com.paypal.oslo.core.navigation.result.NavResultRequestId.m11591toStringimpl(this.getHighSpeedVideoFpsRanges))), null, 4, null);
                if (partnerLinkingUiEffect instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.access$handleLinkingCompleted(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete) partnerLinkingUiEffect);
                } else if (partnerLinkingUiEffect instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingScreen - error effect received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError) partnerLinkingUiEffect).getMessage())), null, 4, null);
                    this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1.C01221.Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(partnerLinkingUiEffect instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.UserCancelledLinking)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingScreen - user cancelled linking", null, null, 6, null);
                    this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1.C01221.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
                return kotlin.Unit.INSTANCE;
            }

            public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect partnerLinkingUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
                navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult(new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.Failure(new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown(((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError) partnerLinkingUiEffect).getMessage()))));
                return kotlin.Unit.INSTANCE;
            }

            public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
                navigationScope.goBackWithResult(new com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult(com.paypal.oslo.feature.identity.api.navigation.result.PartnerLinkingNavResult.PartnerLinkingResult.UserCancelled.INSTANCE));
                return kotlin.Unit.INSTANCE;
            }

            C01221(java.lang.String str, android.app.Activity activity, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
                this.getHighSpeedVideoFpsRanges = str;
                this.getHighSpeedVideoSizes = activity;
                this.Camera2StreamConfigurationMap = appNavigator;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (this.getHighSpeedVideoFpsRanges.getEffect().collect(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1.C01221(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
            return ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, java.lang.String str, android.app.Activity activity, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = partnerLinkingViewModel;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = activity;
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), 1, null);
            this.Camera2StreamConfigurationMap.initialize(this.getHighSpeedVideoFpsRanges);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1 partnerLinkingScreenKt$PartnerLinkingScreen$1$1 = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        partnerLinkingScreenKt$PartnerLinkingScreen$1$1.getHighSpeedVideoSizesFor = obj;
        return partnerLinkingScreenKt$PartnerLinkingScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartnerLinkingScreenKt$PartnerLinkingScreen$1$1(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, android.app.Activity activity, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt$PartnerLinkingScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = partnerLinkingViewModel;
        this.getHighSpeedVideoFpsRanges = partnerLinkingRequest;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = activity;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
