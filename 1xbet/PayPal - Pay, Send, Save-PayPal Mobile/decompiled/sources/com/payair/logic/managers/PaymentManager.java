package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H&¢\u0006\u0004\b\u0014\u0010\u0018J/\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/payair/logic/managers/PaymentManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "authenticatePayment", "(Landroidx/fragment/app/FragmentActivity;)V", "cancelTransaction", "()V", "", "networkTokenReference", "", "getNumberOfPaymentKeys", "(Ljava/lang/String;)I", "", "isLvtSupported", "()Z", "isVisaOfflinePaymentsSupported", "replenishAllCards", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "replenishPaymentKeys", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tokenUniqueReferences", "(Ljava/util/List;)V", "isSupported", "Landroid/content/Context;", "context", "", "Lcom/payair/model/CardScheme;", "supportedSchemes", "setLvtSupported", "(ZLandroid/content/Context;Ljava/util/Set;)V", "startPaymentAuthentication", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PaymentManager {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setLvtSupported$default(com.payair.logic.managers.PaymentManager paymentManager, boolean z, android.content.Context context, java.util.Set set, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLvtSupported");
            }
            if ((i & 4) != 0) {
                set = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.payair.model.CardScheme[]{com.payair.model.CardScheme.MASTERCARD, com.payair.model.CardScheme.VISA});
            }
            paymentManager.setLvtSupported(z, context, set);
        }
    }

    void authenticatePayment(androidx.fragment.app.FragmentActivity activity);

    void cancelTransaction();

    int getNumberOfPaymentKeys(java.lang.String networkTokenReference);

    boolean isLvtSupported();

    boolean isVisaOfflinePaymentsSupported();

    boolean replenishAllCards();

    java.lang.Object replenishPaymentKeys(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    void replenishPaymentKeys(java.util.List<java.lang.String> tokenUniqueReferences);

    void setLvtSupported(boolean isSupported, android.content.Context context, java.util.Set<? extends com.payair.model.CardScheme> supportedSchemes);

    void startPaymentAuthentication(java.lang.String networkTokenReference);
}
