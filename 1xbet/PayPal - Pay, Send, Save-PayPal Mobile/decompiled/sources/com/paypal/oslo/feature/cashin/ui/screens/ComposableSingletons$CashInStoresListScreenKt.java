package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CashInStoresListScreenKt {
    public static final com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt INSTANCE = new com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1526565122, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt.$r8$lambda$L0aIwbMHcwaB_4b45GUa5ln9E8Y((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$L0aIwbMHcwaB_4b45GUa5ln9E8Y(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1526565122, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInStoresListScreenKt.lambda$1526565122.<anonymous> (CashInStoresListScreen.kt:160)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1526565122$cash_in_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
