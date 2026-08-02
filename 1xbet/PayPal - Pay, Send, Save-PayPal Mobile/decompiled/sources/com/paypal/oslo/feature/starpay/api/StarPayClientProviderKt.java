package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "rememberStarPayClient", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/starpay/api/StarPayClient;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StarPayClientProviderKt {
    public static final com.paypal.oslo.feature.starpay.api.StarPayClient rememberStarPayClient(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-58660702, i, -1, "com.paypal.oslo.feature.starpay.api.rememberStarPayClient (StarPayClientProvider.kt:48)");
        }
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
        android.app.Activity activity = (android.app.Activity) consume;
        boolean changed = composer.changed(activity);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = ((com.paypal.oslo.feature.starpay.api.StarPayClientProvider) dagger.hilt.android.EntryPointAccessors.fromActivity(activity, com.paypal.oslo.feature.starpay.api.StarPayClientProvider.class)).starPayClient();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = (com.paypal.oslo.feature.starpay.api.StarPayClient) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return starPayClient;
    }
}
