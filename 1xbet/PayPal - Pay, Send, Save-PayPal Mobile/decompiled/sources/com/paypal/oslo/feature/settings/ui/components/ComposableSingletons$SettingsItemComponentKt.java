package com.paypal.oslo.feature.settings.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SettingsItemComponentKt {
    public static final com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt INSTANCE = new com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(211327070, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt.$r8$lambda$DKwds8h_o_vCV5ro2BQEHoZ14Tc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-94541449, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt.$r8$lambda$d1ZfXkvrKaqY9Dx_SpeVlmchac8((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$DKwds8h_o_vCV5ro2BQEHoZ14Tc(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(211327070, i, -1, "com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt.lambda$211327070.<anonymous> (SettingsItemComponent.kt:55)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d1ZfXkvrKaqY9Dx_SpeVlmchac8(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-94541449, i, -1, "com.paypal.oslo.feature.settings.ui.components.ComposableSingletons$SettingsItemComponentKt.lambda$-94541449.<anonymous> (SettingsItemComponent.kt:86)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(120.0f)), com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$211327070$settings_prodRelease() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-94541449$settings_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19266getLambda$94541449$settings_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
