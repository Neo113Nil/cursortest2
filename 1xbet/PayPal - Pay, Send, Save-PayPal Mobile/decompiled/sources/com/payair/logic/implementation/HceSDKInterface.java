package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0019H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H&¢\u0006\u0004\b \u0010\u001bJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH&¢\u0006\u0004\b&\u0010\nJR\u00102\u001a\u0002012\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u0010-\u001a\u0004\u0018\u00010\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H¦@¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\bH&¢\u0006\u0004\b4\u0010\nJ\u000f\u00105\u001a\u00020\bH&¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH&¢\u0006\u0004\b6\u0010\nJ\u001e\u00109\u001a\u00020\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001907H¦@¢\u0006\u0004\b9\u0010:J(\u0010@\u001a\u00020?2\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=H¦@¢\u0006\u0004\b@\u0010AJ\u001a\u0010B\u001a\u00020?2\b\u0010<\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0004\bB\u0010CJ*\u0010D\u001a\u00020?2\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010=H¦@¢\u0006\u0004\bD\u0010AJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u00020\bH&¢\u0006\u0004\bF\u0010\nJ\u0010\u0010G\u001a\u00020\u0004H¦@¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\bI\u0010JJ1\u0010Q\u001a\u00020M2\u0006\u0010K\u001a\u00020\u00192\b\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH&¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0004H&¢\u0006\u0004\bS\u0010\rJ\u001f\u0010W\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00142\u0006\u0010V\u001a\u00020UH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0002H&¢\u0006\u0004\bZ\u0010\u0006J\u0017\u0010[\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0019H&¢\u0006\u0004\b]\u0010^J%\u0010a\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\b2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020/0.H&¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0002H&¢\u0006\u0004\bc\u0010\u0006J\u000f\u0010d\u001a\u00020\u0004H&¢\u0006\u0004\bd\u0010\rJ\u000f\u0010e\u001a\u00020\u0004H&¢\u0006\u0004\be\u0010\rJ#\u0010h\u001a\u00020\u00042\n\b\u0002\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010>\u001a\u00020=H&¢\u0006\u0004\bh\u0010iJ+\u0010l\u001a\u00020\u00042\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040j2\u0006\u0010>\u001a\u00020=H&¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0004H&¢\u0006\u0004\bn\u0010\rJ\u0017\u0010o\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\bo\u0010\u0006J\u0010\u0010p\u001a\u00020?H¦@¢\u0006\u0004\bp\u0010HJ\u001f\u0010s\u001a\u00020M2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010r\u001a\u00020qH&¢\u0006\u0004\bs\u0010tJ\u0018\u0010u\u001a\u00020?2\u0006\u0010<\u001a\u00020\u0019H¦@¢\u0006\u0004\bu\u0010CR\u0014\u0010y\u001a\u00020v8'X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x"}, d2 = {"Lcom/payair/logic/implementation/HceSDKInterface;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "activateCardForToken", "([B)V", "activateVisaCardForToken", "", "checkIfDeviceUnlockKeysAreStillValid", "()Z", "checkSdkState", "clearAllWalletAppData", "()V", "clearHCEData", "Landroid/content/Context;", "context", "disableScreenshotProtection", "(Landroid/content/Context;)V", "enableScreenshotProtection", "Lcom/payair/listener/ClientListener;", "getClientListener", "()Lcom/payair/listener/ClientListener;", "getDefaultCard", "()[B", "", "getJWTtoken", "()Ljava/lang/String;", "networkTokenReference", "", "getNumberOfPaymentKeys", "(Ljava/lang/String;)I", "getPaymentAppInstanceId", "getSelectedCard", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "handleMDESPushPayload", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "hasVersionCheckFailed", "Lcom/payair/hce/HCEEventListener;", "hceEventListener", "apiCustomerBaseUrl", "firebaseId", "paymentAppProviderId", "wakeupIntentURI", "closeIntentURI", "", "Lcom/payair/model/CardScheme;", "schemes", "Lcom/payair/model/InitializeData;", "initialize", "(Lcom/payair/hce/HCEEventListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeviceSecure", "isLvtSupported", "isVisaOfflinePaymentsSupported", "", "tokens", "queueUpTokensForReplenishAndProcessFirst", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payPushToken", com.paypal.android.threeds.utils.NetworkUtil.JWT, "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/payair/model/Response;", "register", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerMastercard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerPayair", "removeCard", "replenishAllCards", "replenishNextToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replenishToken", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baseUrl", "payload", "Lcom/payair/hce/communication/JsonResponse;", "response", "Lcom/payair/logic/remote/HTTPmethod;", "method", "sendConnectionRequest", "(Ljava/lang/String;Ljava/lang/Object;Lcom/payair/hce/communication/JsonResponse;Lcom/payair/logic/remote/HTTPmethod;)Lcom/payair/hce/communication/JsonResponse;", "setAuthenticationAcquirer", "clientListener", "Lcom/payair/listener/DefaultHceEventListenerImpl;", "defaultHceEventListenerImpl", "setClientListener", "(Lcom/payair/listener/ClientListener;Lcom/payair/listener/DefaultHceEventListenerImpl;)V", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "setDefaultCard", "setHCEEventListener", "(Lcom/payair/hce/HCEEventListener;)V", "setJWTToken", "(Ljava/lang/String;)V", "isSupported", "supportedSchemes", "setLvtSupported", "(ZLjava/util/Set;)V", "setSelectedCard", "setUserValidationRequestListener", "setupValuesAfterAuthenticate", "Lcom/payair/listener/HceDeviceAuthenticationDialogListener;", "deviceAuthenticationDialogListener", "startDeviceAuthenticationForPurchase", "(Lcom/payair/listener/HceDeviceAuthenticationDialogListener;Landroidx/fragment/app/FragmentActivity;)V", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "startDeviceAuthenticationForRegistration", "(Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/FragmentActivity;)V", "stopTransaction", "suspendCardForToken", "unRegisterDevice", "Lcom/payair/model/PushTokenType;", "type", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;)Lcom/payair/hce/communication/JsonResponse;", "uploadUnlockKeys", "", "getSdkKeyValidity", "()J", "sdkKeyValidity"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HceSDKInterface {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startDeviceAuthenticationForPurchase$default(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.listener.HceDeviceAuthenticationDialogListener hceDeviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDeviceAuthenticationForPurchase");
            }
            if ((i & 1) != 0) {
                hceDeviceAuthenticationDialogListener = null;
            }
            hceSDKInterface.startDeviceAuthenticationForPurchase(hceDeviceAuthenticationDialogListener, fragmentActivity);
        }
    }

    void activateCardForToken(byte[] token);

    void activateVisaCardForToken(byte[] token);

    boolean checkIfDeviceUnlockKeysAreStillValid();

    boolean checkSdkState();

    void clearAllWalletAppData();

    void clearHCEData();

    void disableScreenshotProtection(android.content.Context context);

    void enableScreenshotProtection(android.content.Context context);

    com.payair.listener.ClientListener getClientListener();

    byte[] getDefaultCard();

    java.lang.String getJWTtoken();

    int getNumberOfPaymentKeys(java.lang.String networkTokenReference);

    java.lang.String getPaymentAppInstanceId();

    long getSdkKeyValidity();

    byte[] getSelectedCard();

    void handleMDESPushPayload(com.google.firebase.messaging.RemoteMessage remoteMessage);

    boolean hasVersionCheckFailed();

    java.lang.Object initialize(com.payair.hce.HCEEventListener hCEEventListener, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Set<? extends com.payair.model.CardScheme> set, kotlin.coroutines.Continuation<? super com.payair.model.InitializeData> continuation);

    boolean isDeviceSecure();

    boolean isLvtSupported();

    boolean isVisaOfflinePaymentsSupported();

    java.lang.Object queueUpTokensForReplenishAndProcessFirst(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object register(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object registerMastercard(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object registerPayair(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    void removeCard(byte[] token);

    boolean replenishAllCards();

    java.lang.Object replenishNextToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object replenishToken(byte[] bArr, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    com.payair.hce.communication.JsonResponse sendConnectionRequest(java.lang.String baseUrl, java.lang.Object payload, com.payair.hce.communication.JsonResponse response, com.payair.logic.remote.HTTPmethod method);

    void setAuthenticationAcquirer();

    void setClientListener(com.payair.listener.ClientListener clientListener, com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl);

    void setDefaultCard(byte[] tokenUniqueReference);

    void setHCEEventListener(com.payair.hce.HCEEventListener hceEventListener);

    void setJWTToken(java.lang.String jwt);

    void setLvtSupported(boolean isSupported, java.util.Set<? extends com.payair.model.CardScheme> supportedSchemes);

    void setSelectedCard(byte[] tokenUniqueReference);

    void setUserValidationRequestListener();

    void setupValuesAfterAuthenticate();

    void startDeviceAuthenticationForPurchase(com.payair.listener.HceDeviceAuthenticationDialogListener deviceAuthenticationDialogListener, androidx.fragment.app.FragmentActivity activity);

    void startDeviceAuthenticationForRegistration(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener, androidx.fragment.app.FragmentActivity activity);

    void stopTransaction();

    void suspendCardForToken(byte[] token);

    java.lang.Object unRegisterDevice(kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    com.payair.hce.communication.JsonResponse updateFirebaseToken(java.lang.String token, com.payair.model.PushTokenType type);

    java.lang.Object uploadUnlockKeys(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
