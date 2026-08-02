package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$LinkedBusinessesListContentKt {
    public static final com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt INSTANCE = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1168829093, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.m19804$r8$lambda$KMo0r97fw2VepXdCIvZKl_Pqqk((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(355062067, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.$r8$lambda$I3EPWUvIlqsnd3pGXdOeDacbkyM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$I3EPWUvIlqsnd3pGXdOeDacbkyM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(355062067, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.lambda$355062067.<anonymous> (LinkedBusinessesListContent.kt:190)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.component.NoPaymentMethodErrorViewKt.NoPaymentMethodErrorView(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KMo0r97-fw2VepXdCIvZKl_Pqqk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19804$r8$lambda$KMo0r97fw2VepXdCIvZKl_Pqqk(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1168829093, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.lambda$1168829093.<anonymous> (LinkedBusinessesListContent.kt:79)");
            }
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_header_title, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$355062067$subscriptions_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1168829093$subscriptions_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
