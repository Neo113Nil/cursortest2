package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$PayModeActivityKt {
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt();
    private static kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-753845547, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.$r8$lambda$V9rjCrZB8d7c66zQVcSSUelKTRA((kotlin.jvm.functions.Function0) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(430090546, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.$r8$lambda$bub_95LL6xKBp3eyF3DgXQqwhIY((kotlin.jvm.functions.Function0) obj, (kotlin.jvm.functions.Function0) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1802182177, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.$r8$lambda$SWqc8Tpey9df0ocGBffq8U8bceM((kotlin.jvm.functions.Function0) obj, (com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-345463004, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.$r8$lambda$uelWmuygb1GrqPHRMbxX8JmB0zU((kotlin.jvm.functions.Function0) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$SWqc8Tpey9df0ocGBffq8U8bceM(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant payModeErrorVariant, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payModeErrorVariant, "");
        if ((i & 6) == 0) {
            i2 = (composer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(payModeErrorVariant.ordinal()) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1802182177, i2, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.lambda$1802182177.<anonymous> (PayModeActivity.kt:470)");
            }
            com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorScreenKt.PayModeErrorScreen(payModeErrorVariant, function0, function0, false, composer, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | ((i2 << 6) & 896), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V9rjCrZB8d7c66zQVcSSUelKTRA(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        if ((i & 6) == 0) {
            i2 = (composer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(function02) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-753845547, i2, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.lambda$-753845547.<anonymous> (PayModeActivity.kt:413)");
            }
            com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt.ChooseSecondaryPaymentScreen(null, function0, function02, composer, (i2 << 3) & 1008, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bub_95LL6xKBp3eyF3DgXQqwhIY(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        if ((i & 6) == 0) {
            i2 = (composer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changedInstance(function02) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(430090546, i2, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.lambda$430090546.<anonymous> (PayModeActivity.kt:464)");
            }
            com.paypal.oslo.feature.taptopay.ui.paymode.enablenfc.EnableNfcScreenKt.EnableNfcScreen(function0, function02, null, null, composer, i2 & 126, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uelWmuygb1GrqPHRMbxX8JmB0zU(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if ((i & 6) == 0) {
            i |= composer.changedInstance(function0) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-345463004, i, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.ComposableSingletons$PayModeActivityKt.lambda$-345463004.<anonymous> (PayModeActivity.kt:477)");
            }
            com.paypal.oslo.feature.taptopay.ui.shared.error.IneligibleCardErrorScreenKt.IneligibleCardErrorScreen(function0, function0, composer, (i & 14) | ((i << 3) & 112), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$430090546$taptopay_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, com.paypal.oslo.feature.taptopay.ui.paymode.error.PayModeErrorVariant, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1802182177$taptopay_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-753845547$taptopay_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20099getLambda$753845547$taptopay_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-345463004$taptopay_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m20098getLambda$345463004$taptopay_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
