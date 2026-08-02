package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$TapToPaySummaryScreenKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.ComposableSingletons$TapToPaySummaryScreenKt INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.ComposableSingletons$TapToPaySummaryScreenKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1320951872, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.ComposableSingletons$TapToPaySummaryScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.ComposableSingletons$TapToPaySummaryScreenKt.m13236$r8$lambda$tyWol5tHY7MKcsqCdF45mDajQ((com.paypal.pds.components.AccordionHeaderScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    /* renamed from: $r8$lambda$tyWol5tHY7MKcsqCd-F4-5mDajQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13236$r8$lambda$tyWol5tHY7MKcsqCdF45mDajQ(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1320951872, i, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.ComposableSingletons$TapToPaySummaryScreenKt.lambda$1320951872.<anonymous> (TapToPaySummaryScreen.kt:294)");
        }
        com.paypal.pds.components.AccordionHeaderScope.ComposeDefaultImpls.Header$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_note_title, composer, 0), null, accordionHeaderScope, composer, (i << 6) & 896, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1320951872$business_pay_and_get_paid_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
