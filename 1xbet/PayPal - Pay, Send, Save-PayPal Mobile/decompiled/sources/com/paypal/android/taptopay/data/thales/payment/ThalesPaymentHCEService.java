package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R3\u0010\u0016\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u00150\u00138\u0007@\u0007X\u0086.¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u000e8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010!"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentHCEService;", "Lcom/gemalto/mfs/mwsdk/payment/AsyncHCEService;", "<init>", "()V", "", "commandApdu", "Landroid/os/Bundle;", "extras", "responseApdu", "", "onApduResponse", "([BLandroid/os/Bundle;[B)Z", "setupCardActivation", "()Z", "Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;", "setupListener", "()Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;", "", "setupPluginRegistration", "", "Lcom/paypal/android/taptopay/domain/di/OrphanedPaymentLifecycleDependency;", "Lkotlin/jvm/JvmSuppressWildcards;", "orphanedObservers", "Ljava/util/Set;", "getOrphanedObservers", "()Ljava/util/Set;", "setOrphanedObservers", "(Ljava/util/Set;)V", "getOrphanedObservers$annotations", "paymentServiceListener", "Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;", "getPaymentServiceListener", "setPaymentServiceListener", "(Lcom/gemalto/mfs/mwsdk/payment/PaymentServiceListener;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ThalesPaymentHCEService extends com.paypal.android.taptopay.data.thales.payment.Hilt_ThalesPaymentHCEService {

    @javax.inject.Inject
    public java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> orphanedObservers;

    @javax.inject.Inject
    public com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener;

    public static /* synthetic */ void getOrphanedObservers$annotations() {
    }

    @Override // com.gemalto.mfs.mwsdk.payment.APDUProcessorSetupCallbacks
    public final boolean setupCardActivation() {
        return false;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.APDUProcessorSetupCallbacks
    public final void setupPluginRegistration() {
    }

    public final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener getPaymentServiceListener() {
        com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = this.paymentServiceListener;
        if (paymentServiceListener != null) {
            return paymentServiceListener;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setPaymentServiceListener(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentServiceListener, "");
        this.paymentServiceListener = paymentServiceListener;
    }

    public final java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> getOrphanedObservers() {
        java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> set = this.orphanedObservers;
        if (set != null) {
            return set;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOrphanedObservers(java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.orphanedObservers = set;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.APDUProcessorSetupCallbacks
    public final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener setupListener() {
        return getPaymentServiceListener();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.AsyncHCEService, util.h.xy.bf.rc
    public final boolean onApduResponse(byte[] commandApdu, android.os.Bundle extras, byte[] responseApdu) {
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("commandApdu", commandApdu != null ? com.paypal.android.taptopay.data.thales.payment.ExtensionsKt.toHexString(commandApdu) : null);
        pairArr[1] = kotlin.TuplesKt.to("responseApdu", responseApdu != null ? com.paypal.android.taptopay.data.thales.payment.ExtensionsKt.toHexString(responseApdu) : null);
        com.paypal.android.logger.Logger.d$default(log, "Received APDU response", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return super.onApduResponse(commandApdu, extras, responseApdu);
    }

    @Override // com.paypal.android.taptopay.data.thales.payment.Hilt_ThalesPaymentHCEService, com.gemalto.mfs.mwsdk.payment.AsyncHCEService, util.h.xy.bf.rc, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.paypal.android.taptopay.data.thales.payment.Hilt_ThalesPaymentHCEService, com.gemalto.mfs.mwsdk.payment.AsyncHCEService, util.h.xy.bf.rc, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
