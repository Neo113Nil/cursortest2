package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CustomerViewKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1861473322, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt.$r8$lambda$hrgkmFz0_C9qFoVJYDeue_hQxo0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$hrgkmFz0_C9qFoVJYDeue_hQxo0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1861473322, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.components.ComposableSingletons$CustomerViewKt.lambda$1861473322.<anonymous> (CustomerView.kt:67)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, null, null, null, composer, 54, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1861473322$business_pay_and_get_paid_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
