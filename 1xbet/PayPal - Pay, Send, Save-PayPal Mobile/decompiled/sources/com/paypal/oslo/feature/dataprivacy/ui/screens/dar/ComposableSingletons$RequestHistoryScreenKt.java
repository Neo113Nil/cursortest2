package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$RequestHistoryScreenKt {
    public static final com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$RequestHistoryScreenKt INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$RequestHistoryScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1194217883, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$RequestHistoryScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$RequestHistoryScreenKt.$r8$lambda$WJvFM8oyVFMp21jPWAbLnagKTEw((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$WJvFM8oyVFMp21jPWAbLnagKTEw(androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1194217883, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.ComposableSingletons$RequestHistoryScreenKt.lambda$-1194217883.<anonymous> (RequestHistoryScreen.kt:351)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            f = com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt.Camera2StreamConfigurationMap;
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(fillMaxWidth$default, f), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1194217883$data_privacy_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14100getLambda$1194217883$data_privacy_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
