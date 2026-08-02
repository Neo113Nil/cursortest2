package com.paypal.oslo.feature.cashin.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CashInNavigationModuleKt {
    public static final com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt INSTANCE = new com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1623418348, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt.$r8$lambda$1m6IGKQ2wtsT8jjduJkD9Fr6cpY((com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$1m6IGKQ2wtsT8jjduJkD9Fr6cpY(final com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination cashInEntryDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInEntryDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1623418348, i, -1, "com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt.lambda$-1623418348.<anonymous> (CashInNavigationModule.kt:50)");
        }
        com.paypal.oslo.feature.cashin.ui.components.CashInWindowInsetsWrapperKt.CashInWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-536414294, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt.m13395$r8$lambda$iBJ2gbZ8j6cM4dBKfsdwrePo3c(com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iBJ2gbZ8j6cM4dBKfsdw-rePo3c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13395$r8$lambda$iBJ2gbZ8j6cM4dBKfsdwrePo3c(com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination cashInEntryDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-536414294, i, -1, "com.paypal.oslo.feature.cashin.di.ComposableSingletons$CashInNavigationModuleKt.lambda$-1623418348.<anonymous>.<anonymous> (CashInNavigationModule.kt:51)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInEntryScreenKt.CashInEntryScreen(cashInEntryDestination.getSource(), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1623418348$cash_in_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.cashin.api.navigation.CashInEntryDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13396getLambda$1623418348$cash_in_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
