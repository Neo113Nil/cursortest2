package com.paypal.android.threeds;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R!\u0010\u001b\u001a\u00020\u00158GX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/android/threeds/ChallengeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/android/threeds/data/model/ProtocolErrorType;)V", "onDestroy", "", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/os/Handler;", "Landroid/os/Handler;", "getHighSpeedVideoSizes", "Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;", "challengeViewModel$delegate", "Lkotlin/Lazy;", "getChallengeViewModel", "()Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;", "getChallengeViewModel$annotations", "challengeViewModel", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/threeds/interfaces/ChallengeStatusReceiver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChallengeActivity extends androidx.view.ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: challengeViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy challengeViewModel;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.threeds.interfaces.ChallengeStatusReceiver getHighSpeedVideoFpsRangesFor = com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.getChallengeStatusReceiver();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.os.Handler getHighSpeedVideoSizes;

    public static /* synthetic */ void getChallengeViewModel$annotations() {
    }

    public ChallengeActivity() {
        final com.paypal.android.threeds.ChallengeActivity challengeActivity = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.challengeViewModel = new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.android.threeds.viewmodel.ChallengeViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.paypal.android.threeds.ChallengeActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.view.ComponentActivity.this.getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.lifecycle.ViewModelProvider.Factory challengeViewModelFactory;
                challengeViewModelFactory = com.paypal.android.threeds.viewmodel.ChallengeViewModel.INSTANCE.getChallengeViewModelFactory();
                return challengeViewModelFactory;
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.paypal.android.threeds.ChallengeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                return (function02 == null || (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) == null) ? challengeActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public final com.paypal.android.threeds.viewmodel.ChallengeViewModel getChallengeViewModel() {
        return (com.paypal.android.threeds.viewmodel.ChallengeViewModel) this.challengeViewModel.getValue();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ChallengeActivity onCreate started", null, null, 6, null);
        getTheme().applyStyle(com.paypal.android.threeds.R.style.OptOutEdgeToEdgeEnforcement, true);
        super.onCreate(savedInstanceState);
        this.getHighResolutionOutputSizeshNQ4ISI = com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.getSdkTransactionId();
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        if (str == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        com.paypal.android.logger.Logger.d$default(logger, "SDK transaction ID obtained: ".concat(java.lang.String.valueOf(str)), null, null, 6, null);
        androidx.view.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(981902562, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.android.threeds.ChallengeActivity.getHighSpeedVideoFpsRangesFor(com.paypal.android.threeds.ChallengeActivity.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        }), 1, null);
        getOnBackPressedDispatcher().addCallback(new androidx.view.OnBackPressedCallback() { // from class: com.paypal.android.threeds.ChallengeActivity$onCreate$2
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Back pressed, cancelling challenge", null, null, 6, null);
                com.paypal.android.threeds.ChallengeActivity.this.getHighSpeedVideoFpsRangesFor();
            }
        });
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ChallengeActivity onCreate completed", null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x020f, code lost:
    
        if (r4 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(final com.paypal.android.threeds.ChallengeActivity challengeActivity, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.android.threeds.data.model.ChallengeParameters challengeParameters;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(981902562, i, -1, "com.paypal.android.threeds.ChallengeActivity.onCreate.<anonymous> (ChallengeActivity.kt:64)");
            }
            final androidx.view.NavHostController rememberNavController = androidx.view.compose.NavHostControllerKt.rememberNavController(new androidx.view.Navigator[0], composer, 0);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Navigation controller created", null, null, 6, null);
            com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel = challengeActivity.getChallengeViewModel();
            boolean changedInstance = composer.changedInstance(challengeActivity);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.android.threeds.ChallengeActivity.$r8$lambda$2Aga2M8XhlmWoHe0fF0m5e5ctoo(com.paypal.android.threeds.ChallengeActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.android.threeds.ThreeDsNavGraphKt.ThreeDsNavGraph(challengeViewModel, null, rememberNavController, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 2);
            if (com.paypal.android.threeds.transaction.devicedata.WrapperData.INSTANCE.getVersionSDKInt() >= 33) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Using Android 13+ intent parameter extraction", null, null, 6, null);
                challengeParameters = (com.paypal.android.threeds.data.model.ChallengeParameters) challengeActivity.getIntent().getParcelableExtra(com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_PARAMS, com.paypal.android.threeds.data.model.ChallengeParameters.class);
            } else {
                challengeParameters = (com.paypal.android.threeds.data.model.ChallengeParameters) challengeActivity.getIntent().getParcelableExtra(com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_PARAMS);
            }
            if (challengeActivity.getHighSpeedVideoFpsRangesFor == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "challengeStatusReceiver is null", null, null, null, 14, null);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (challengeParameters != null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge parameters received, initiating challenge flow", null, null, 6, null);
                try {
                    com.paypal.android.threeds.transaction.ThreeDsTransactionSession.INSTANCE.setRequestorAppUrl(challengeParameters.getRequestorAppUrl());
                    com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
                    java.lang.String requestorAppUrl = challengeParameters.getRequestorAppUrl();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requestor app URL set: ");
                    sb.append(requestorAppUrl);
                    com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                    challengeActivity.getChallengeViewModel().generateAcsDataAndSecretKey(challengeParameters);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ACS data and secret key generated", null, null, 6, null);
                    com.paypal.android.threeds.data.model.ChallengeRequest challengeRequestParams = challengeActivity.getChallengeViewModel().getChallengeRequestParams(challengeParameters);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge request parameters created", null, null, 6, null);
                    challengeActivity.getChallengeViewModel().initChallenge(challengeRequestParams);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge initialization started", null, null, 6, null);
                    final int intExtra = challengeActivity.getIntent().getIntExtra(com.paypal.android.threeds.utils.ConstantUtil.CHALLENGE_TIMEOUT, 5);
                    android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                    challengeActivity.getHighSpeedVideoSizes = handler;
                    handler.postDelayed(new java.lang.Runnable() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.paypal.android.threeds.ChallengeActivity.m10983$r8$lambda$hUg5ut04XpmXClKv8xVmQN7WME(com.paypal.android.threeds.ChallengeActivity.this, intExtra);
                        }
                    }, 60000 * intExtra);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge timer started successfully", null, null, 6, null);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge timer started", null, null, 6, null);
                } catch (com.paypal.android.threeds.exceptions.SDKRuntimeException e) {
                    com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType = e.getProtocolErrorType();
                    if (protocolErrorType != null) {
                        challengeActivity.getHighSpeedVideoFpsRangesFor(e.getProtocolErrorType());
                        java.lang.String str = challengeActivity.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.Unit unit2 = null;
                        if (str == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            str = null;
                        }
                        com.paypal.android.threeds.utils.ThreeDsSdkUtils threeDsSdkUtils = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE;
                        com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType2 = e.getProtocolErrorType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(protocolErrorType2);
                        com.paypal.android.threeds.data.model.ChallengeResponse value = challengeActivity.getChallengeViewModel().getChallengeResponse().getValue();
                        java.lang.String str2 = challengeActivity.getHighResolutionOutputSizeshNQ4ISI;
                        if (str2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            str2 = null;
                        }
                        com.paypal.android.threeds.data.model.ProtocolErrorEvent protocolErrorEvent = new com.paypal.android.threeds.data.model.ProtocolErrorEvent(str, threeDsSdkUtils.getErrorMessage(protocolErrorType2, value, str2));
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge protocol error, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error code", protocolErrorType.getErrorCode()), kotlin.TuplesKt.to("error message", protocolErrorType.getErrorMessage())), null, 4, null);
                        com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = challengeActivity.getHighSpeedVideoFpsRangesFor;
                        if (challengeStatusReceiver != null) {
                            challengeStatusReceiver.protocolError(protocolErrorEvent);
                            unit2 = kotlin.Unit.INSTANCE;
                        }
                    }
                    java.lang.String localizedMessage = e.getLocalizedMessage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localizedMessage, "");
                    com.paypal.android.threeds.data.model.RuntimeErrorEvent runtimeErrorEvent = new com.paypal.android.threeds.data.model.RuntimeErrorEvent("1001", localizedMessage);
                    com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge runtime error, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error code", runtimeErrorEvent.getErrorCode()), kotlin.TuplesKt.to("error message", runtimeErrorEvent.getErrorMessage())), null, 4, null);
                    com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver2 = challengeActivity.getHighSpeedVideoFpsRangesFor;
                    if (challengeStatusReceiver2 != null) {
                        challengeStatusReceiver2.runtimeError(runtimeErrorEvent);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    challengeActivity.finish();
                } catch (java.lang.Exception e2) {
                    java.lang.String localizedMessage2 = e2.getLocalizedMessage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localizedMessage2, "");
                    com.paypal.android.threeds.data.model.RuntimeErrorEvent runtimeErrorEvent2 = new com.paypal.android.threeds.data.model.RuntimeErrorEvent("1001", localizedMessage2);
                    com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge runtime error, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error code", runtimeErrorEvent2.getErrorCode()), kotlin.TuplesKt.to("error message", runtimeErrorEvent2.getErrorMessage())), null, 4, null);
                    com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver3 = challengeActivity.getHighSpeedVideoFpsRangesFor;
                    if (challengeStatusReceiver3 != null) {
                        challengeStatusReceiver3.runtimeError(runtimeErrorEvent2);
                    }
                    challengeActivity.finish();
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Setting up challenge response observer", null, null, 6, null);
            challengeActivity.getChallengeViewModel().getChallengeResponse().observeForever(new com.paypal.android.threeds.ChallengeActivity$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.android.threeds.ChallengeActivity.m10984$r8$lambda$uKN1UxbJPB3WNoRfefUmXr562E(com.paypal.android.threeds.ChallengeActivity.this, rememberNavController, (com.paypal.android.threeds.data.model.ChallengeResponse) obj);
                }
            }));
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Setting up error response observers", null, null, 6, null);
            challengeActivity.getChallengeViewModel().getNetworkErrorResponse().observeForever(new com.paypal.android.threeds.ChallengeActivity$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.android.threeds.ChallengeActivity.m10981$r8$lambda$8wAmiAXbPy3rDZepCrOIC4zGZk(com.paypal.android.threeds.ChallengeActivity.this, (com.paypal.android.threeds.data.model.NetworkErrorResponse) obj);
                }
            }));
            challengeActivity.getChallengeViewModel().getSdkRuntimeException().observeForever(new com.paypal.android.threeds.ChallengeActivity$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.android.threeds.ChallengeActivity.$r8$lambda$ifp92XIf79bvyyAiMZH_EoJYkuU(com.paypal.android.threeds.ChallengeActivity.this, (com.paypal.android.threeds.exceptions.SDKRuntimeException) obj);
                }
            }));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.android.threeds.data.model.ProtocolErrorType p0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Posting error message to ACS for protocol error", null, null, 6, null);
        if (p0 != null) {
            com.paypal.android.threeds.data.model.ChallengeResponse value = getChallengeViewModel().getChallengeResponse().getValue();
            com.paypal.android.threeds.data.model.AcsData acsData = getChallengeViewModel().getAcsData();
            java.lang.String str = null;
            java.lang.String acsUrl = acsData != null ? acsData.getAcsUrl() : null;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ACS URL: ".concat(java.lang.String.valueOf(acsUrl)), null, null, 6, null);
            com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel = getChallengeViewModel();
            com.paypal.android.threeds.utils.ThreeDsSdkUtils threeDsSdkUtils = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (str2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str2;
            }
            challengeViewModel.postErrorMessageToAcs(acsUrl, threeDsSdkUtils.getErrorMessage(p0, value, str));
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Error message posted to ACS successfully", null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor() {
        com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest;
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancellation initiated", null, null, 6, null);
        com.paypal.android.threeds.data.model.ChallengeResponse value = getChallengeViewModel().getChallengeResponse().getValue();
        if (value != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response available, sending cancellation request", null, null, 6, null);
            challengeRequest = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE.getChallengeRequest(value, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? null : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : "01", (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancellation request created", null, null, 6, null);
            getChallengeViewModel().cancelChallenge(challengeRequest);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancellation sent to view model", null, null, 6, null);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancelled event sent to receiver", null, null, 6, null);
            com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = this.getHighSpeedVideoFpsRangesFor;
            if (challengeStatusReceiver != null) {
                challengeStatusReceiver.onCancelled();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Finishing activity after challenge cancellation", null, null, 6, null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ChallengeActivity onDestroy started", null, null, 6, null);
        super.onDestroy();
        android.os.Handler handler = this.getHighSpeedVideoSizes;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "ChallengeActivity onDestroy completed", null, null, 6, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2Aga2M8XhlmWoHe0fF0m5e5ctoo(com.paypal.android.threeds.ChallengeActivity challengeActivity) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Navigate up action triggered", null, null, 6, null);
        challengeActivity.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8wAmiA-XbPy3rDZepCrOIC4zGZk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10981$r8$lambda$8wAmiAXbPy3rDZepCrOIC4zGZk(com.paypal.android.threeds.ChallengeActivity challengeActivity, com.paypal.android.threeds.data.model.NetworkErrorResponse networkErrorResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(networkErrorResponse);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Posting network error to ACS", null, null, 6, null);
        if (408 == networkErrorResponse.getErrorCode()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Network timeout detected, posting transaction timeout error", null, null, 6, null);
            challengeActivity.getHighSpeedVideoFpsRangesFor(com.paypal.android.threeds.data.model.ProtocolErrorType.TransactionTimeout.INSTANCE);
        } else if (503 == networkErrorResponse.getErrorCode()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Service unavailable detected, posting connection failure error", null, null, 6, null);
            challengeActivity.getHighSpeedVideoFpsRangesFor(com.paypal.android.threeds.data.model.ProtocolErrorType.ConnectionFailure.INSTANCE);
        }
        com.paypal.android.threeds.data.model.RuntimeErrorEvent runtimeErrorEvent = new com.paypal.android.threeds.data.model.RuntimeErrorEvent(java.lang.String.valueOf(networkErrorResponse.getErrorCode()), networkErrorResponse.getErrorMessage());
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge runtime error, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error code", runtimeErrorEvent.getErrorCode()), kotlin.TuplesKt.to("error message", runtimeErrorEvent.getErrorMessage())), null, 4, null);
        com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = challengeActivity.getHighSpeedVideoFpsRangesFor;
        if (challengeStatusReceiver != null) {
            challengeStatusReceiver.runtimeError(runtimeErrorEvent);
        }
        challengeActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OTpKtg1qmuWhTlEsij3pqUd-zkY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10982$r8$lambda$OTpKtg1qmuWhTlEsij3pqUdzkY(androidx.view.NavOptionsBuilder navOptionsBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navOptionsBuilder, "");
        androidx.view.NavOptionsBuilder.popUpTo$default(navOptionsBuilder, 0, (kotlin.jvm.functions.Function1) null, 2, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hUg5ut04XpmXClKv8xV-mQN7WME, reason: not valid java name */
    public static /* synthetic */ void m10983$r8$lambda$hUg5ut04XpmXClKv8xVmQN7WME(com.paypal.android.threeds.ChallengeActivity challengeActivity, int i) {
        challengeActivity.getHighSpeedVideoFpsRangesFor(com.paypal.android.threeds.data.model.ProtocolErrorType.TransactionTimeout.INSTANCE);
        com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Challenge timed out event sent to receiver after ");
        sb.append(i);
        sb.append(" minutes");
        com.paypal.android.logger.Logger.i$default(logger, sb.toString(), null, null, 6, null);
        com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = challengeActivity.getHighSpeedVideoFpsRangesFor;
        if (challengeStatusReceiver != null) {
            challengeStatusReceiver.timedOut();
        }
        challengeActivity.finish();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ifp92XIf79bvyyAiMZH_EoJYkuU(com.paypal.android.threeds.ChallengeActivity challengeActivity, com.paypal.android.threeds.exceptions.SDKRuntimeException sDKRuntimeException) {
        com.paypal.android.threeds.data.model.ProtocolErrorEvent protocolErrorEvent;
        com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType = sDKRuntimeException.getProtocolErrorType();
        java.lang.String str = null;
        if ((protocolErrorType != null ? protocolErrorType.getErrorMessage() : null) != null) {
            java.lang.String str2 = challengeActivity.getHighResolutionOutputSizeshNQ4ISI;
            if (str2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str2;
            }
            com.paypal.android.threeds.data.model.ErrorMessage errorMessage = sDKRuntimeException.getProtocolErrorType().getErrorMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNull(errorMessage);
            protocolErrorEvent = new com.paypal.android.threeds.data.model.ProtocolErrorEvent(str, errorMessage);
        } else {
            challengeActivity.getHighSpeedVideoFpsRangesFor(sDKRuntimeException.getProtocolErrorType());
            java.lang.String str3 = challengeActivity.getHighResolutionOutputSizeshNQ4ISI;
            if (str3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            }
            com.paypal.android.threeds.utils.ThreeDsSdkUtils threeDsSdkUtils = com.paypal.android.threeds.utils.ThreeDsSdkUtils.INSTANCE;
            com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType2 = sDKRuntimeException.getProtocolErrorType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(protocolErrorType2);
            com.paypal.android.threeds.data.model.ChallengeResponse value = challengeActivity.getChallengeViewModel().getChallengeResponse().getValue();
            java.lang.String str4 = challengeActivity.getHighResolutionOutputSizeshNQ4ISI;
            if (str4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str4;
            }
            protocolErrorEvent = new com.paypal.android.threeds.data.model.ProtocolErrorEvent(str3, threeDsSdkUtils.getErrorMessage(protocolErrorType2, value, str));
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge protocol error, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error code", sDKRuntimeException.getProtocolErrorType().getErrorCode()), kotlin.TuplesKt.to("error message", sDKRuntimeException.getProtocolErrorType().getErrorMessage())), null, 4, null);
        com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = challengeActivity.getHighSpeedVideoFpsRangesFor;
        if (challengeStatusReceiver != null) {
            challengeStatusReceiver.protocolError(protocolErrorEvent);
        }
        challengeActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uKN1Ux-bJPB3WNoRfefUmXr562E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10984$r8$lambda$uKN1UxbJPB3WNoRfefUmXr562E(com.paypal.android.threeds.ChallengeActivity challengeActivity, androidx.view.NavHostController navHostController, com.paypal.android.threeds.data.model.ChallengeResponse challengeResponse) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(challengeResponse.getChallengeCompletionInd(), com.paypal.android.threeds.utils.Indicator.No.INSTANCE.getValue())) {
            com.paypal.android.threeds.utils.ChallengeUiType uiType = com.paypal.android.threeds.utils.ChallengeUiType.INSTANCE.getUiType(challengeResponse.getAcsUiType());
            if (uiType != null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response received, navigating to challenge screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeType", uiType.getName())), null, 4, null);
                navHostController.navigate(uiType.getName(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ChallengeActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.android.threeds.ChallengeActivity.m10982$r8$lambda$OTpKtg1qmuWhTlEsij3pqUdzkY((androidx.view.NavOptionsBuilder) obj);
                    }
                });
            }
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge completed, giving callback to caller app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeCompletionIndicator", challengeResponse.getChallengeCompletionInd()), kotlin.TuplesKt.to("challengeType", challengeResponse.getAcsUiType())), null, 4, null);
            com.paypal.android.threeds.interfaces.ChallengeStatusReceiver challengeStatusReceiver = challengeActivity.getHighSpeedVideoFpsRangesFor;
            if (challengeStatusReceiver != null) {
                java.lang.String sdkTransId = challengeResponse.getSdkTransId();
                java.lang.String transStatus = challengeResponse.getTransStatus();
                kotlin.jvm.internal.Intrinsics.checkNotNull(transStatus);
                challengeStatusReceiver.onCompleted(new com.paypal.android.threeds.data.model.CompletionEvent(sdkTransId, transStatus));
            }
            challengeActivity.finish();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
