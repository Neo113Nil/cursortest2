package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$AccountSummarySectionKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-104502413, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt.$r8$lambda$xZ6IRK_E1JKlMSL4WDIEax7Dkhk((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1481053159, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt.$r8$lambda$S9l46nuK4oxHbi6fSvwQSzFDHs0((androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$S9l46nuK4oxHbi6fSvwQSzFDHs0(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1481053159, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt.lambda$-1481053159.<anonymous> (AccountSummarySection.kt:122)");
            }
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, null, null, null, null, null, null, null, getHighSpeedVideoFpsRangesFor, composer, 805306422, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xZ6IRK_E1JKlMSL4WDIEax7Dkhk(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-104502413, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.ComposableSingletons$AccountSummarySectionKt.lambda$-104502413.<anonymous> (AccountSummarySection.kt:126)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Content here", null, null, null, null, null, false, 0, 0, null, null, composer, 6, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1481053159$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18188getLambda$1481053159$revolvingcredit_servicing_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-104502413$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18187getLambda$104502413$revolvingcredit_servicing_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
