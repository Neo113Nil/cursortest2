package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BulkUpdateFiPostUpdateScreenKt {
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-799372821, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.$r8$lambda$7kDNl2C0HRZZQISivfskoz3Oe8w((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1844190653, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.m19770$r8$lambda$kK5vaPelniApe1Jf06FS7_kgxA((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$7kDNl2C0HRZZQISivfskoz3Oe8w(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-799372821, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.lambda$-799372821.<anonymous> (BulkUpdateFiPostUpdateScreen.kt:219)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_error_needs_attention_section_title, composer, 0), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k-K5vaPelniApe1Jf06FS7_kgxA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19770$r8$lambda$kK5vaPelniApe1Jf06FS7_kgxA(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1844190653, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.lambda$1844190653.<anonymous> (BulkUpdateFiPostUpdateScreen.kt:246)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_error_successfully_updated_section_title, composer, 0), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1844190653$subscriptions_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-799372821$subscriptions_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19771getLambda$799372821$subscriptions_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
