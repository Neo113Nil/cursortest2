package com.paypal.oslo.feature.invoicing.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function4<com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2102631808, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$z2QM5prAcfsAy54enYadkXzVz_8((com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$z2QM5prAcfsAy54enYadkXzVz_8(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInvoiceViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2102631808, i, -1, "com.paypal.oslo.feature.invoicing.di.ComposableSingletons$NavigationModuleKt.lambda$2102631808.<anonymous> (NavigationModule.kt:56)");
        }
        com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt.ViewInvoiceScreen(viewInvoiceViewModel, function0, null, composer, i & 126, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2102631808$invoicing_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
