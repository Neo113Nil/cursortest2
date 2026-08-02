package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt INSTANCE = new com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(481029974, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt.$r8$lambda$QBG9iqUyNidIKHEmAR6iaxoYpkM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$KVZ9XrkwMPhiTHrNun-qujQfVwg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14886$r8$lambda$KVZ9XrkwMPhiTHrNunqujQfVwg(com.paypal.oslo.feature.home.ui.mvi.HomeEvent homeEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QBG9iqUyNidIKHEmAR6iaxoYpkM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(481029974, i, -1, "com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt.lambda$481029974.<anonymous> (HomeScreen.kt:529)");
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success success = new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSampleSections$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, 0, 1, null), 0, 0, false, 14, null);
            com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider fakeAdWidgetProvider = com.paypal.oslo.feature.home.ui.preview.FakeAdWidgetProvider.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.ComposableSingletons$HomeScreenKt.m14886$r8$lambda$KVZ9XrkwMPhiTHrNunqujQfVwg((com.paypal.oslo.feature.home.ui.mvi.HomeEvent) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.HomeScreenKt.HomeScreenContent(success, fakeAdWidgetProvider, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$481029974$home_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
