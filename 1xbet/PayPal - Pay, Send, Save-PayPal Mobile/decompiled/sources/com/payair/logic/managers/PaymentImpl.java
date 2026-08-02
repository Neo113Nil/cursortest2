package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010%\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u001bJ\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u001b"}, d2 = {"Lcom/payair/logic/managers/PaymentImpl;", "Lcom/payair/logic/managers/PaymentManager;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/managers/CoroutineDispatcherProvider;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "authenticatePayment", "(Landroidx/fragment/app/FragmentActivity;)V", "", "networkTokenReference", "startPaymentAuthentication", "(Ljava/lang/String;)V", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "", "replenishPaymentKeys", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tokenUniqueReferences", "(Ljava/util/List;)V", "cancelTransaction", "()V", "replenishAllCards", "()Z", "", "getNumberOfPaymentKeys", "(Ljava/lang/String;)I", "isSupported", "Landroid/content/Context;", "context", "", "Lcom/payair/model/CardScheme;", "supportedSchemes", "setLvtSupported", "(ZLandroid/content/Context;Ljava/util/Set;)V", "isLvtSupported", "isVisaOfflinePaymentsSupported"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentImpl implements com.payair.logic.managers.PaymentManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4446a;
    public final com.payair.logic.managers.CoroutineDispatcherProvider b;

    public PaymentImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        this.f4446a = hceSDKInterface;
        this.b = coroutineDispatcherProvider;
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final void authenticatePayment(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.payair.logic.implementation.HceSDKInterface.DefaultImpls.startDeviceAuthenticationForPurchase$default(this.f4446a, null, activity, 1, null);
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final void cancelTransaction() {
        this.f4446a.stopTransaction();
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final int getNumberOfPaymentKeys(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return this.f4446a.getNumberOfPaymentKeys(networkTokenReference);
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final boolean isLvtSupported() {
        return this.f4446a.isLvtSupported();
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final boolean isVisaOfflinePaymentsSupported() {
        return this.f4446a.isVisaOfflinePaymentsSupported();
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final boolean replenishAllCards() {
        return this.f4446a.replenishAllCards();
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final java.lang.Object replenishPaymentKeys(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.f4446a;
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return hceSDKInterface.replenishToken(bytes, continuation);
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final void setLvtSupported(boolean isSupported, android.content.Context context, java.util.Set<? extends com.payair.model.CardScheme> supportedSchemes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedSchemes, "");
        this.f4446a.setLvtSupported(isSupported, supportedSchemes);
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final void startPaymentAuthentication(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.f4446a;
        byte[] bytes = networkTokenReference.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        hceSDKInterface.setSelectedCard(bytes);
        this.f4446a.setAuthenticationAcquirer();
        this.f4446a.setUserValidationRequestListener();
    }

    @Override // com.payair.logic.managers.PaymentManager
    public final void replenishPaymentKeys(java.util.List<java.lang.String> tokenUniqueReferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReferences, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.getIOScope(), null, null, new com.payair.csdk.a2(this, tokenUniqueReferences, null), 3, null);
    }
}
