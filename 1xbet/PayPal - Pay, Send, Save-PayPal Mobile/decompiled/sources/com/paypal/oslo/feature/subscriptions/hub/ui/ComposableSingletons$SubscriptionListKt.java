package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$SubscriptionListKt {
    public static final com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt INSTANCE = new com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(97021103, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt.$r8$lambda$nuYe7YSVwaB_LDV2pBzsIC9OmWc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$nuYe7YSVwaB_LDV2pBzsIC9OmWc(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(97021103, i, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt.lambda$97021103.<anonymous> (SubscriptionList.kt:108)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.component.NoPaymentMethodErrorViewKt.NoPaymentMethodErrorView(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), composer, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$97021103$subscriptions_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
