package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1", f = "InboundConnectScreen.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {107}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class InboundConnectScreenKt$InboundConnectScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect inboundConnectUiEffect = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect) obj;
            if (inboundConnectUiEffect instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(inboundConnectUiEffect instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.OpenRedirectUrl)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.OpenRedirectUrl openRedirectUrl = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiEffect.OpenRedirectUrl) inboundConnectUiEffect;
                if (!kotlin.text.StringsKt.isBlank(openRedirectUrl.getRedirectUrl())) {
                    com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt.access$openRedirectUrl(this.getHighSpeedVideoFpsRangesFor, openRedirectUrl.getRedirectUrl());
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "redirectUrl is blank - navigating back without opening redirect URL", null, null, 6, null);
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.Camera2StreamConfigurationMap.getUiEffect().collect(new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboundConnectScreenKt$InboundConnectScreen$3$1(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectViewModel inboundConnectViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectScreenKt$InboundConnectScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = inboundConnectViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
