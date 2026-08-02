package com.paypal.oslo.feature.verificationcapture.ui.widget;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$IdScanWidgetProviderImplKt {
    public static final com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt();
    private static kotlin.jvm.functions.Function5<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface, com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(290272411, false, new kotlin.jvm.functions.Function5() { // from class: com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt.m20699$r8$lambda$1urJTot_1PHOqE2dQKY3f8_AI((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface) obj, (com.paypal.oslo.core.navigation.AppNavigator) obj2, (androidx.compose.ui.Modifier) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    /* renamed from: $r8$lambda$1urJT-ot_1-PHOqE2dQKY3f8_AI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20699$r8$lambda$1urJTot_1PHOqE2dQKY3f8_AI(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idScanWidgetInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(idScanWidgetInterface) : composer.changedInstance(idScanWidgetInterface) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(modifier) ? 256 : 128;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(290272411, i2, -1, "com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt.lambda$290272411.<anonymous> (IdScanWidgetProviderImpl.kt:26)");
            }
            com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.IdScanWidget(idScanWidgetInterface, modifier, appNavigator, null, composer, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface.$stable | (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function5<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface, com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$290272411$verification_capture_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
