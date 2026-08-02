package com.paypal.oslo.feature.bankingbundle.api.navigation;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/navigation/AcceptMoneyChoiceDestination;", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes11.dex */
public final /* data */ class AcceptMoneyChoiceDestination implements com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDestination, androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination();
    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination.$r8$lambda$Dq1L0BPhxluKbTcpyBXcIsMOahg();
        }
    });

    public final int hashCode() {
        return 785245700;
    }

    private AcceptMoneyChoiceDestination() {
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.AcceptMoneyChoiceScreen.IDENTIFIER, com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenShownAction(), null, 4, null);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Dq1L0BPhxluKbTcpyBXcIsMOahg() {
        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination", INSTANCE, new java.lang.annotation.Annotation[0]);
    }

    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination> serializer() {
        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final java.lang.String toString() {
        return "AcceptMoneyChoiceDestination";
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination)) {
            return false;
        }
        return true;
    }
}
