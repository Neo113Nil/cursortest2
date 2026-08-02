package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$MainNavigationEntriesKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-120681757, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt.$r8$lambda$yxo32Tj4buIh39FpUX7ixlwZQZU((com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$yxo32Tj4buIh39FpUX7ixlwZQZU(com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination businessTransferDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessTransferDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-120681757, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.di.navigation.ComposableSingletons$MainNavigationEntriesKt.lambda$-120681757.<anonymous> (MainNavigationEntries.kt:140)");
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.transfer.TransferScreenKt.TransferScreen(null, composer, 0, 1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-120681757$business_pay_and_get_paid_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessTransferDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13105getLambda$120681757$business_pay_and_get_paid_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
