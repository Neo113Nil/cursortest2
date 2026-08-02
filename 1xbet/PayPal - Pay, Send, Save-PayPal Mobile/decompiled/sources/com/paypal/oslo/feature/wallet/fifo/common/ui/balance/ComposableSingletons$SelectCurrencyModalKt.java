package com.paypal.oslo.feature.wallet.fifo.common.ui.balance;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$SelectCurrencyModalKt {
    public static final com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt INSTANCE = new com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1678213597, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt.m21298$r8$lambda$LYuUKuE7hZT4c5oUbtjSCHfss((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$2CkmuOAk6T0admpYcNtnhj3Prt0(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LY-uUKuE7hZT4c5-oUbtjSCHfss, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21298$r8$lambda$LYuUKuE7hZT4c5oUbtjSCHfss(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1678213597, i, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt.lambda$1678213597.<anonymous> (SelectCurrencyModal.kt:94)");
            }
            com.paypal.pds.core.Icon.CheckCircleFill checkCircleFill = com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.TestTagSelectCurrencyCheckmark);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.balance.ComposableSingletons$SelectCurrencyModalKt.$r8$lambda$2CkmuOAk6T0admpYcNtnhj3Prt0((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconKt.Icon(checkCircleFill, null, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue), null, null, composer, 54, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1678213597$wallet_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
