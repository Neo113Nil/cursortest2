package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$ErrorKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1168179598, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt.$r8$lambda$rGnBwDIhkK9NuG8H0iqerhAn3bg((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-936499516, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt.$r8$lambda$mJ2s4yAAlvTDqEyepVWZlOosOO4((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$mJ2s4yAAlvTDqEyepVWZlOosOO4(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-936499516, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt.lambda$-936499516.<anonymous> (Error.kt:199)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, null, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rGnBwDIhkK9NuG8H0iqerhAn3bg(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1168179598, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt.lambda$-1168179598.<anonymous> (Error.kt:176)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("We can't show your activity right now."), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.RETRY_BUTTON_TEXT), null, null, null, null, false, 250, null);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ComposableSingletons$ErrorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(errorUiModel, fillMaxSize$default, (kotlin.jvm.functions.Function0) rememberedValue, composer, 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-936499516$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18388getLambda$936499516$revolvingcredit_servicing_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-1168179598$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18387getLambda$1168179598$revolvingcredit_servicing_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
