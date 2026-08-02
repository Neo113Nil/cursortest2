package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "amount", "gratuity", "Lcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;", "gratuityPercentageConfiguration", "Lcom/zettle/sdk/feature/taptopay/core/transaction/GratuityValidationHelperResult;", "getGratuityValidationResult", "(JJLcom/zettle/sdk/core/payment/GratuityPercentageConfiguration;)Lcom/zettle/sdk/feature/taptopay/core/transaction/GratuityValidationHelperResult;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GratuityAmountValidationHelperKt {
    public static final com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult getGratuityValidationResult(long j, long j2, com.zettle.sdk.core.payment.GratuityPercentageConfiguration gratuityPercentageConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gratuityPercentageConfiguration, "");
        if (j2 == 0) {
            return com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.Valid;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j);
        double doubleValue = valueOf.doubleValue() != 0.0d ? 100.0d * (java.lang.Long.valueOf(j2).doubleValue() / valueOf.doubleValue()) : 0.0d;
        boolean z = ((double) gratuityPercentageConfiguration.getMinPercentage()) > doubleValue;
        boolean z2 = ((double) gratuityPercentageConfiguration.getMaxPercentage()) < doubleValue;
        if (z) {
            return com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.TooLow;
        }
        if (z2) {
            return com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.TooHigh;
        }
        return com.zettle.sdk.feature.taptopay.core.transaction.GratuityValidationHelperResult.Valid;
    }
}
