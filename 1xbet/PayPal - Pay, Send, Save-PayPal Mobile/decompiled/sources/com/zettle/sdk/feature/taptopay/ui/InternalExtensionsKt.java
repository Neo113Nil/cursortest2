package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "", "amount", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;", "paymentProperties", "paypalPartnerId", "consumerId", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;", "internalPaymentAction", "(Ljava/lang/String;JLcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentProperties;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Payment;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InternalExtensionsKt {
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment internalPaymentAction$default(java.lang.String str, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return internalPaymentAction(str, j, tapToPayPaymentProperties, str2, str3);
    }

    public static final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment internalPaymentAction(java.lang.String str, long j, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties tapToPayPaymentProperties, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPaymentProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment(com.zettle.sdk.feature.taptopay.ui.PaymentUtilsKt.createTapToPayReference(str, str2, str3), j, tapToPayPaymentProperties);
    }
}
