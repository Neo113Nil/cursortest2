package com.paypal.oslo.feature.taptopay.data.thales;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/thales/DefaultThalesInitializerFactory;", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/init/AppPaymentExperience;", "paymentExperience", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerHandle;", "create", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/init/AppPaymentExperience;Ljava/lang/Class;)Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerHandle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultThalesInitializerFactory implements com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DefaultThalesInitializerFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory
    public final com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerHandle create(android.content.Context context, com.paypal.android.taptopay.data.thales.init.AppPaymentExperience paymentExperience, java.lang.Class<? extends android.app.Activity> paymentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentExperience, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentActivity, "");
        final com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer = new com.paypal.android.taptopay.data.thales.init.ThalesInitializer(context, paymentExperience, paymentActivity, null, null, null, false, 0, 0L, null, 0, 0L, null, 0 == true ? 1 : 0, 16376, null);
        return new com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerHandle() { // from class: com.paypal.oslo.feature.taptopay.data.thales.DefaultThalesInitializerFactory$create$1
            @Override // com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerHandle
            public final java.lang.Object init(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.data.thales.init.InitError>> continuation) {
                return com.paypal.android.taptopay.data.thales.init.ThalesInitializer.this.init(continuation);
            }
        };
    }
}
