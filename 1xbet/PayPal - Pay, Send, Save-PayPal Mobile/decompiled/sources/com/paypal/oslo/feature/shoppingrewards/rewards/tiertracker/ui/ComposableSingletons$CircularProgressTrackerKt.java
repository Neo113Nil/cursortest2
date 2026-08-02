package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$CircularProgressTrackerKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.ComposableSingletons$CircularProgressTrackerKt INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.ComposableSingletons$CircularProgressTrackerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1339996315, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.ComposableSingletons$CircularProgressTrackerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.ComposableSingletons$CircularProgressTrackerKt.$r8$lambda$YvvNkD9i2YLgX8htNgQ5zWTfldc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$YvvNkD9i2YLgX8htNgQ5zWTfldc(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1339996315, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui.ComposableSingletons$CircularProgressTrackerKt.lambda$1339996315.<anonymous> (CircularProgressTracker.kt:853)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("You're ready\nto earn", null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, composer, 390, 6, 1002);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1339996315$shopping_rewards_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
