package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJB\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u001d\u0010\nJ(\u0010\"\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H¦@¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b$\u0010%J*\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H¦@¢\u0006\u0004\b'\u0010#J\"\u0010(\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b(\u0010)"}, d2 = {"Lcom/payair/logic/managers/SetupManager;", "", "", "checkIfDeviceUnlockKeysAreValid", "()Z", "Lcom/payair/model/RegistrationStatus;", "checkRegistrationStatus", "()Lcom/payair/model/RegistrationStatus;", "", "clearData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getPaymentAppInstanceId", "()Ljava/lang/String;", "paymentAppProviderId", "apiCustomerBaseUrl", "wakeupIntentURI", "closeIntentURI", "", "Lcom/payair/model/CardScheme;", "schemes", "Lcom/payair/model/Response;", "initialize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "initializeVisa", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeviceSecure", "logout", com.paypal.android.threeds.utils.NetworkUtil.JWT, "appPushToken", "Landroidx/fragment/app/FragmentActivity;", "activity", "register", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerMastercard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payairPushToken", "registerPayair", "registerVisa", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SetupManager {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object initialize$default(com.payair.logic.managers.SetupManager setupManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Set set, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
            }
            if ((i & 16) != 0) {
                set = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.payair.model.CardScheme[]{com.payair.model.CardScheme.MASTERCARD, com.payair.model.CardScheme.VISA});
            }
            return setupManager.initialize(str, str2, str3, str4, set, continuation);
        }
    }

    boolean checkIfDeviceUnlockKeysAreValid();

    com.payair.model.RegistrationStatus checkRegistrationStatus();

    java.lang.Object clearData(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.String getPaymentAppInstanceId();

    java.lang.Object initialize(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Set<? extends com.payair.model.CardScheme> set, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object initializeVisa(android.content.Context context, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    boolean isDeviceSecure();

    java.lang.Object logout(kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object register(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object registerMastercard(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object registerPayair(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object registerVisa(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
