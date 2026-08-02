package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PackageDetailScreenKt {
    public static final com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt();
    private static kotlin.jvm.functions.Function4<java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1176675304, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt.$r8$lambda$WxMhmpfzT7oxrcIukk7OES0aLhc((java.lang.String) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$WxMhmpfzT7oxrcIukk7OES0aLhc(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(function0) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1176675304, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt.lambda$1176675304.<anonymous> (PackageDetailScreen.kt:108)");
            }
            com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1 rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1.getHighSpeedVideoFpsRanges;
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.packagetracking.ui.PackageWebViewOverlayKt.PackageWebViewOverlay(str, function0, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), null, composer, (i2 & 14) | 384 | (i2 & 112), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1176675304$package_tracking_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
