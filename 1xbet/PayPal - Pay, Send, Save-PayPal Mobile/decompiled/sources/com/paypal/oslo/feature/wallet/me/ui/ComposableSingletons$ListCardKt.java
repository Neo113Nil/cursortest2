package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$ListCardKt {
    public static final com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$ListCardKt INSTANCE = new com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$ListCardKt();
    private static kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(941970323, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$ListCardKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$ListCardKt.$r8$lambda$5l5dB9GN3YCcwZVJQgXOqyqF_Yo((java.lang.String) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$5l5dB9GN3YCcwZVJQgXOqyqF_Yo(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(941970323, i, -1, "com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$ListCardKt.lambda$941970323.<anonymous> (ListCard.kt:73)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Test", null, null, null, null, null, false, 0, 0, null, null, composer, 6, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$941970323$wallet_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
