package com.paypal.oslo.app;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.MainActivity$onNewIntent$1", f = "MainActivity.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"notificationLaunchInfo", "deeplinkBackstack", "notificationLaunchInfo", "deeplinkBackstack"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class MainActivity$onNewIntent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Intent getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.app.MainActivity getHighSpeedVideoSizesFor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo handleIfNotificationIntent;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo notificationLaunchInfo;
        T t;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo notificationLaunchInfo2;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            handleIfNotificationIntent = this.getHighSpeedVideoSizesFor.getNotificationIntentHandler().handleIfNotificationIntent(this.getHighSpeedVideoFpsRanges);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            if (this.getHighSpeedVideoSizesFor.getStartDestinationProvider().isDeepLinkIntent(this.getHighSpeedVideoFpsRanges)) {
                this.getHighSpeedVideoFpsRangesFor = handleIfNotificationIntent;
                this.Camera2StreamConfigurationMap = objectRef;
                this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object initialBackstack = this.getHighSpeedVideoSizesFor.getStartDestinationProvider().getInitialBackstack(this.getHighSpeedVideoFpsRanges, this);
                if (initialBackstack != coroutine_suspended) {
                    notificationLaunchInfo = handleIfNotificationIntent;
                    t = initialBackstack;
                    objectRef2 = objectRef;
                }
                return coroutine_suspended;
            }
            if (handleIfNotificationIntent == null) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            notificationLaunchInfo2 = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            if (((arrow.core.Either) obj2).isRight()) {
                this.getHighSpeedVideoSizesFor.getNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onNewIntent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.oslo.app.MainActivity$onNewIntent$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.ObjectRef.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                    }
                });
            }
            handleIfNotificationIntent = notificationLaunchInfo2;
            objectRef = objectRef3;
            if (handleIfNotificationIntent == null) {
                this.getHighSpeedVideoSizesFor.getAppLaunchSourceTracker().setLaunchSource(com.paypal.oslo.app.MainActivity.access$resolveLaunchSource(this.getHighSpeedVideoSizesFor, null, handleIfNotificationIntent));
            } else if (objectRef.element != 0) {
                this.getHighSpeedVideoSizesFor.getAppLaunchSourceTracker().setLaunchSource(com.paypal.oslo.app.MainActivity.access$resolveLaunchSource(this.getHighSpeedVideoSizesFor, (com.paypal.oslo.app.navigation.InitialBackstack) objectRef.element, null));
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
        notificationLaunchInfo = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        objectRef2 = objectRef4;
        objectRef = objectRef5;
        t = obj;
        objectRef2.element = t;
        if (com.paypal.oslo.app.MainActivity.access$shouldAcquireDeeplinkToken(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges)) {
            this.getHighSpeedVideoFpsRangesFor = notificationLaunchInfo;
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = 2;
            java.lang.Object tokenWithFreshAuth = this.getHighSpeedVideoSizesFor.getAppTokenProvider().getTokenWithFreshAuth(new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("deeplink", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), this);
            if (tokenWithFreshAuth != coroutine_suspended) {
                objectRef3 = objectRef;
                notificationLaunchInfo2 = notificationLaunchInfo;
                obj2 = tokenWithFreshAuth;
                if (((arrow.core.Either) obj2).isRight()) {
                }
                handleIfNotificationIntent = notificationLaunchInfo2;
                objectRef = objectRef3;
                if (handleIfNotificationIntent == null) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        this.getHighSpeedVideoSizesFor.getNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onNewIntent$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.oslo.app.MainActivity$onNewIntent$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
            }
        });
        handleIfNotificationIntent = notificationLaunchInfo;
        if (handleIfNotificationIntent == null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceStack(((com.paypal.oslo.app.navigation.InitialBackstack) objectRef.element).getStack());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceStack(((com.paypal.oslo.app.navigation.InitialBackstack) objectRef.element).getStack());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.MainActivity$onNewIntent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.MainActivity$onNewIntent$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onNewIntent$1(com.paypal.oslo.app.MainActivity mainActivity, android.content.Intent intent, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.MainActivity$onNewIntent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = mainActivity;
        this.getHighSpeedVideoFpsRanges = intent;
    }
}
