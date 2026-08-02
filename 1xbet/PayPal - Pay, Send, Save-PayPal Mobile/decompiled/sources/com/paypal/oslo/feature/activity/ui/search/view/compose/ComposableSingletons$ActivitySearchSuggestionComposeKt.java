package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ActivitySearchSuggestionComposeKt {
    public static final com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt INSTANCE = new com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-715675716, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt.$r8$lambda$omf4x8nGPEhJijoUUcudqfmLb_k((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$omf4x8nGPEhJijoUUcudqfmLb_k(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-715675716, i, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt.lambda$-715675716.<anonymous> (ActivitySearchSuggestionCompose.kt:94)");
            }
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem("", null, null, null, false, false, null, null, null, null, null, null, null, 8190, null), null, false, null, null, null, false, composer, com.paypal.pds.components.ListItem.$stable, 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-715675716$activity_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11950getLambda$715675716$activity_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
