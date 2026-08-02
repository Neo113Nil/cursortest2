package com.payair.logic.implementation;

@com.payair.Generated
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010 J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010$J\u0017\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010 J+\u00104\u001a\u00020\f2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010 J\u0010\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u0010<J(\u0010>\u001a\u0002082\u0006\u0010=\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\u0006\u00103\u001a\u000202H\u0096@¢\u0006\u0004\b>\u0010?J*\u0010@\u001a\u0002082\u0006\u0010=\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u000102H\u0096@¢\u0006\u0004\b@\u0010?J\u001a\u0010A\u001a\u0002082\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020\u0013H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020\"H\u0016¢\u0006\u0004\bL\u0010'J\u0017\u0010M\u001a\u00020\f2\u0006\u0010K\u001a\u00020\"H\u0016¢\u0006\u0004\bM\u0010'J\u0017\u0010N\u001a\u00020\f2\u0006\u0010K\u001a\u00020\"H\u0016¢\u0006\u0004\bN\u0010'J\u0017\u0010O\u001a\u00020\f2\u0006\u0010K\u001a\u00020\"H\u0016¢\u0006\u0004\bO\u0010'J\u0018\u0010P\u001a\u0002002\u0006\u0010K\u001a\u00020\"H\u0096@¢\u0006\u0004\bP\u0010QJ\u001e\u0010T\u001a\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130RH\u0096@¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u000200H\u0016¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\fH\u0096@¢\u0006\u0004\bX\u0010:J1\u0010`\u001a\u00020\\2\u0006\u0010Y\u001a\u00020\u00132\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ!\u0010d\u001a\u00020\f2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bd\u0010eJ\u0011\u0010f\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\bf\u0010<J#\u0010i\u001a\u0006*\u00020\\0\\2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u0002082\u0006\u0010+\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bk\u0010BJ\u0017\u0010l\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u000200H\u0016¢\u0006\u0004\bn\u0010WJ\u000f\u0010o\u001a\u000200H\u0016¢\u0006\u0004\bo\u0010WJ%\u0010r\u001a\u00020\f2\u0006\u0010p\u001a\u0002002\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u000200H\u0016¢\u0006\u0004\bt\u0010WJ\u000f\u0010u\u001a\u000200H\u0016¢\u0006\u0004\bu\u0010WJ\u0017\u0010v\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bx\u0010wJ\u000f\u0010y\u001a\u000200H\u0016¢\u0006\u0004\by\u0010WJ\u000f\u0010z\u001a\u000200H\u0016¢\u0006\u0004\bz\u0010WR\u0014\u0010~\u001a\u00020{8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}"}, d2 = {"Lcom/payair/logic/implementation/HceSDKInterfaceImpl;", "Lcom/payair/logic/implementation/HceSDKInterface;", "Landroid/content/Context;", "context", "Lcom/payair/configuration/ClientConfigurationInterface;", "clientConfiguration", "<init>", "(Landroid/content/Context;Lcom/payair/configuration/ClientConfigurationInterface;)V", "Lcom/payair/listener/ClientListener;", "clientListener", "Lcom/payair/listener/DefaultHceEventListenerImpl;", "defaultHceEventListenerImpl", "", "setClientListener", "(Lcom/payair/listener/ClientListener;Lcom/payair/listener/DefaultHceEventListenerImpl;)V", "getClientListener", "()Lcom/payair/listener/ClientListener;", "Lcom/payair/hce/HCEEventListener;", "hceEventListener", "", "apiCustomerBaseUrl", "firebaseId", "paymentAppProviderId", "wakeupIntentURI", "closeIntentURI", "", "Lcom/payair/model/CardScheme;", "schemes", "Lcom/payair/model/InitializeData;", "initialize", "(Lcom/payair/hce/HCEEventListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserValidationRequestListener", "()V", "setAuthenticationAcquirer", "", "getSelectedCard", "()[B", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "setSelectedCard", "([B)V", "getDefaultCard", "setDefaultCard", "stopTransaction", com.paypal.android.threeds.utils.NetworkUtil.JWT, "setJWTToken", "(Ljava/lang/String;)V", "setupValuesAfterAuthenticate", "Lkotlin/Function1;", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/fragment/app/FragmentActivity;", "activity", "startDeviceAuthenticationForRegistration", "(Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/FragmentActivity;)V", "clearAllWalletAppData", "clearHCEData", "Lcom/payair/model/Response;", "unRegisterDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentAppInstanceId", "()Ljava/lang/String;", "payPushToken", "register", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerPayair", "registerMastercard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReference", "", "getNumberOfPaymentKeys", "(Ljava/lang/String;)I", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "handleMDESPushPayload", "(Lcom/google/firebase/messaging/RemoteMessage;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "suspendCardForToken", "removeCard", "activateCardForToken", "activateVisaCardForToken", "replenishToken", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tokens", "queueUpTokensForReplenishAndProcessFirst", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replenishAllCards", "()Z", "replenishNextToken", "baseUrl", "", "payload", "Lcom/payair/hce/communication/JsonResponse;", "response", "Lcom/payair/logic/remote/HTTPmethod;", "method", "sendConnectionRequest", "(Ljava/lang/String;Ljava/lang/Object;Lcom/payair/hce/communication/JsonResponse;Lcom/payair/logic/remote/HTTPmethod;)Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/listener/HceDeviceAuthenticationDialogListener;", "deviceAuthenticationDialogListener", "startDeviceAuthenticationForPurchase", "(Lcom/payair/listener/HceDeviceAuthenticationDialogListener;Landroidx/fragment/app/FragmentActivity;)V", "getJWTtoken", "Lcom/payair/model/PushTokenType;", "type", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;)Lcom/payair/hce/communication/JsonResponse;", "uploadUnlockKeys", "setHCEEventListener", "(Lcom/payair/hce/HCEEventListener;)V", "hasVersionCheckFailed", "checkIfDeviceUnlockKeysAreStillValid", "isSupported", "supportedSchemes", "setLvtSupported", "(ZLjava/util/Set;)V", "isLvtSupported", "isVisaOfflinePaymentsSupported", "enableScreenshotProtection", "(Landroid/content/Context;)V", "disableScreenshotProtection", "checkSdkState", "isDeviceSecure", "", "getSdkKeyValidity", "()J", "sdkKeyValidity"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HceSDKInterfaceImpl implements com.payair.logic.implementation.HceSDKInterface {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4440a;
    public final com.payair.configuration.ClientConfigurationInterface b;
    public final java.util.LinkedHashSet c;
    public com.payair.listener.ClientListener d;

    public HceSDKInterfaceImpl(android.content.Context context, com.payair.configuration.ClientConfigurationInterface clientConfigurationInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientConfigurationInterface, "");
        this.f4440a = context;
        this.b = clientConfigurationInterface;
        com.payair.hce.HCEInitializer.initContext(context);
        this.c = new java.util.LinkedHashSet();
    }

    public static final void a(kotlin.jvm.functions.Function1 function1, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(java.lang.Boolean.valueOf(z));
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void activateCardForToken(byte[] token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.payair.hce.HCEManager.activateCardForToken(token, this.f4440a);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void activateVisaCardForToken(byte[] token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.payair.hce.HCEManager.activateVisaCardForToken(token, this.f4440a);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean checkIfDeviceUnlockKeysAreStillValid() {
        return com.payair.hce.HCEManager.checkDeviceUnlockKeys();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean checkSdkState() {
        return com.payair.hce.HCEManager.checkSdkState();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void clearAllWalletAppData() {
        com.payair.hce.HCEManager.clearAllWalletAppData();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void clearHCEData() {
        com.payair.hce.HCEManager.clearHCEData();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void disableScreenshotProtection(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.payair.hce.HCEManager.disableScreenShotProtection(context);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void enableScreenshotProtection(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.payair.hce.HCEManager.enableScreenShotProtection(context);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    /* renamed from: getClientListener, reason: from getter */
    public final com.payair.listener.ClientListener getD() {
        return this.d;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final byte[] getDefaultCard() {
        return com.payair.hce.HCEManager.getDefaultCardForContactlessPayments();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.String getJWTtoken() {
        return com.payair.hce.HCEManager.getJWTToken();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final int getNumberOfPaymentKeys(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        byte[] bytes = networkTokenReference.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return com.payair.hce.HCEManager.getNumberOfAvailableCredentialsForToken(bytes);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.String getPaymentAppInstanceId() {
        java.lang.String paymentAppInstanceId = com.payair.hce.HCERegistration.getPaymentAppInstanceId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paymentAppInstanceId, "");
        return paymentAppInstanceId;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final long getSdkKeyValidity() {
        return com.payair.hce.HCEManager.getKeyCreationTimestamp();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final byte[] getSelectedCard() {
        return com.payair.hce.HCEManager.getSelectedCard();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void handleMDESPushPayload(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "");
        com.payair.hce.HCEManager.handleMDESPushPayload(remoteMessage, this.f4440a);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean hasVersionCheckFailed() {
        return com.payair.hce.HCEManager.hasVersionCheckFailed();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.payair.logic.implementation.HceSDKInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initialize(com.payair.hce.HCEEventListener hCEEventListener, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Set<? extends com.payair.model.CardScheme> set, kotlin.coroutines.Continuation<? super com.payair.model.InitializeData> continuation) throws java.lang.Exception {
        com.payair.csdk.u1 u1Var;
        int i;
        kotlinx.coroutines.CompletableJob Job$default;
        if (continuation instanceof com.payair.csdk.u1) {
            u1Var = (com.payair.csdk.u1) continuation;
            int i2 = u1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1Var.c = i2 - 2147483648;
                java.lang.Object obj = u1Var.f4321a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u1Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.hce.HCEInitializer.initialize(this.f4440a, hCEEventListener, str, this.b.getBackendBasePath(), com.payair.hce.AuthenticationEnum.JWT, kotlin.coroutines.jvm.internal.Boxing.boxInt(this.b.getMpWalletVersion()), this.f4440a.getPackageName(), str2, true, str3, str4, str5);
                    com.payair.hce.HCEInitializer.setUpMCBP(set.contains(com.payair.model.CardScheme.MASTERCARD));
                    if (set.contains(com.payair.model.CardScheme.VISA)) {
                        android.content.Context context = this.f4440a;
                        u1Var.c = 1;
                        if (com.payair.hce.visa.Initializer.initialize(context, u1Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(Job$default.plus(kotlinx.coroutines.Dispatchers.getDefault())), null, null, new com.payair.csdk.v1(null), 3, null);
                return new com.payair.model.InitializeData(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(android.os.Build.VERSION.SDK_INT >= 30));
            }
        }
        u1Var = new com.payair.csdk.u1(this, continuation);
        java.lang.Object obj2 = u1Var.f4321a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u1Var.c;
        if (i != 0) {
        }
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(Job$default.plus(kotlinx.coroutines.Dispatchers.getDefault())), null, null, new com.payair.csdk.v1(null), 3, null);
        return new com.payair.model.InitializeData(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(android.os.Build.VERSION.SDK_INT >= 30));
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean isDeviceSecure() {
        java.lang.Object systemService = this.f4440a.getSystemService("keyguard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return ((android.app.KeyguardManager) systemService).isDeviceSecure();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean isLvtSupported() {
        return com.payair.hce.HCEManager.isLvtAllowed();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean isVisaOfflinePaymentsSupported() {
        return com.payair.hce.HCEManager.isVisaOfflinePaymentsSupported();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object queueUpTokensForReplenishAndProcessFirst(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        synchronized (this.c) {
            this.c.addAll(list);
        }
        java.lang.Object replenishNextToken = replenishNextToken(continuation);
        return replenishNextToken == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? replenishNextToken : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object register(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.x1 x1Var = new com.payair.csdk.x1(str, str2, fragmentActivity);
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        x1Var.invoke(new com.payair.logic.implementation.HceSDKInterfaceImpl$performRegistration$2$listener$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object registerMastercard(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.y1 y1Var = new com.payair.csdk.y1(str);
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        y1Var.invoke(new com.payair.logic.implementation.HceSDKInterfaceImpl$performRegistration$2$listener$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object registerPayair(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.z1 z1Var = new com.payair.csdk.z1(str, str2, fragmentActivity);
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        z1Var.invoke(new com.payair.logic.implementation.HceSDKInterfaceImpl$performRegistration$2$listener$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void removeCard(byte[] token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.payair.hce.HCEManager.removeCard(token, this.f4440a);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final boolean replenishAllCards() {
        return com.payair.hce.HCEManager.replenishAllCards();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object replenishNextToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        synchronized (this.c) {
            java.util.Iterator it = this.c.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
            if (!it.hasNext()) {
                return kotlin.Unit.INSTANCE;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
            it.remove();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            byte[] bytes = ((java.lang.String) next).getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.Object replenishToken = replenishToken(bytes, continuation);
            return replenishToken == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? replenishToken : unit;
        }
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object replenishToken(byte[] bArr, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        boolean z;
        try {
            com.payair.hce.HCEManager.replenishToken(bArr);
            z = true;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to replenish token ");
            sb.append(bArr);
            sb.append(": ");
            sb.append(e);
            com.paypal.android.logger.Logger.i$default(log, sb.toString(), null, null, 6, null);
            z = false;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final com.payair.hce.communication.JsonResponse sendConnectionRequest(java.lang.String baseUrl, java.lang.Object payload, com.payair.hce.communication.JsonResponse response, com.payair.logic.remote.HTTPmethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(baseUrl, true, payload), response, java.lang.Integer.valueOf(method.getType()));
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setAuthenticationAcquirer() {
        com.payair.hce.HCEPayment.setAuthenticationAquirer();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setClientListener(com.payair.listener.ClientListener clientListener, com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultHceEventListenerImpl, "");
        this.d = clientListener;
        com.payair.hce.HCEManager.setHCEEventListener(defaultHceEventListenerImpl);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setDefaultCard(byte[] tokenUniqueReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        com.payair.hce.HCEManager.setNewDefaultCardForContactlessPayments(tokenUniqueReference);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setHCEEventListener(com.payair.hce.HCEEventListener hceEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceEventListener, "");
        com.payair.hce.HCEManager.setHCEEventListener(hceEventListener);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setJWTToken(java.lang.String jwt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
        com.payair.hce.HCEManager.setJWTToken(jwt);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setLvtSupported(boolean isSupported, java.util.Set<? extends com.payair.model.CardScheme> supportedSchemes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedSchemes, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedSchemes, 10));
        java.util.Iterator<T> it = supportedSchemes.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.payair.model.CardScheme) it.next()).getValue());
        }
        com.payair.hce.HCEManager.setLvtAllowed(isSupported, kotlin.collections.CollectionsKt.toSet(arrayList));
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setSelectedCard(byte[] tokenUniqueReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        com.payair.hce.HCEManager.setSelectedCard(tokenUniqueReference);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setUserValidationRequestListener() {
        com.payair.hce.HCEPayment.setUserValidationRequestListener();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void setupValuesAfterAuthenticate() {
        com.payair.hce.HCERegistration.setupValuesAfterAuthenticate();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void startDeviceAuthenticationForPurchase(com.payair.listener.HceDeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.payair.hce.HCEManager.startDeviceAuthenticationForPurchase(deviceAuthenticationDialogListener, activity);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void startDeviceAuthenticationForRegistration(final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener, androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.payair.hce.HCEManager.startDeviceAuthenticationForRegistration(new com.payair.hce.DeviceAuthenticationDialogListener() { // from class: com.payair.logic.implementation.HceSDKInterfaceImpl$$ExternalSyntheticLambda0
            @Override // com.payair.hce.DeviceAuthenticationDialogListener
            public final void deviceAuthenticationCompleted(boolean z) {
                com.payair.logic.implementation.HceSDKInterfaceImpl.a(kotlin.jvm.functions.Function1.this, z);
            }
        }, activity);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void stopTransaction() {
        com.payair.hce.HCEManager.stopTransaction();
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final void suspendCardForToken(byte[] token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.payair.hce.HCEManager.suspendCardForToken(token, this.f4440a);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object unRegisterDevice(kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        java.lang.Integer statusCode;
        java.util.List emptyList;
        com.payair.hce.communication.JsonResponse unRegisterDevice = com.payair.hce.HCEManager.unRegisterDevice();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unRegisterDevice, "");
        if (unRegisterDevice.isSuccessful()) {
            try {
                return new com.payair.model.Response.Success(unRegisterDevice);
            } catch (java.lang.ClassCastException unused) {
                return new com.payair.model.Response.Error(101, null, 2, null);
            }
        }
        java.lang.Integer statusCode2 = unRegisterDevice.getStatusCode();
        int i = 100;
        if ((statusCode2 == null || statusCode2.intValue() != 0) && unRegisterDevice.getStatusCode() != null) {
            statusCode = unRegisterDevice.getStatusCode();
        } else {
            java.lang.Integer statusCodeFromServer = unRegisterDevice.getStatusCodeFromServer();
            statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && unRegisterDevice.getStatusCodeFromServer() != null) ? unRegisterDevice.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
        }
        if (statusCode != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
            i = statusCode.intValue();
        }
        java.util.List<com.payair.hce.ErrorModel> errors = unRegisterDevice.getErrors();
        if (errors != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
            emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
            for (com.payair.hce.ErrorModel errorModel : errors) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
                emptyList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel));
            }
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.payair.model.Response.Error(i, emptyList);
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final com.payair.hce.communication.JsonResponse updateFirebaseToken(java.lang.String token, com.payair.model.PushTokenType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return com.payair.hce.HCEManager.updatePushToken(token, type.toHceType$core_release());
    }

    @Override // com.payair.logic.implementation.HceSDKInterface
    public final java.lang.Object uploadUnlockKeys(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        java.lang.Integer statusCode;
        java.util.List emptyList;
        com.payair.hce.communication.JsonResponse updateUnlockKeys = com.payair.hce.HCEManager.updateUnlockKeys(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(updateUnlockKeys, "");
        if (updateUnlockKeys.isSuccessful()) {
            try {
                return new com.payair.model.Response.Success(updateUnlockKeys);
            } catch (java.lang.ClassCastException unused) {
                return new com.payair.model.Response.Error(101, null, 2, null);
            }
        }
        java.lang.Integer statusCode2 = updateUnlockKeys.getStatusCode();
        int i = 100;
        if ((statusCode2 == null || statusCode2.intValue() != 0) && updateUnlockKeys.getStatusCode() != null) {
            statusCode = updateUnlockKeys.getStatusCode();
        } else {
            java.lang.Integer statusCodeFromServer = updateUnlockKeys.getStatusCodeFromServer();
            statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && updateUnlockKeys.getStatusCodeFromServer() != null) ? updateUnlockKeys.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
        }
        if (statusCode != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
            i = statusCode.intValue();
        }
        java.util.List<com.payair.hce.ErrorModel> errors = updateUnlockKeys.getErrors();
        if (errors != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
            emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
            for (com.payair.hce.ErrorModel errorModel : errors) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
                emptyList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel));
            }
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.payair.model.Response.Error(i, emptyList);
    }

    public static final java.lang.Object access$performRegistration(com.payair.logic.implementation.HceSDKInterfaceImpl hceSDKInterfaceImpl, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        function1.invoke(new com.payair.logic.implementation.HceSDKInterfaceImpl$performRegistration$2$listener$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
