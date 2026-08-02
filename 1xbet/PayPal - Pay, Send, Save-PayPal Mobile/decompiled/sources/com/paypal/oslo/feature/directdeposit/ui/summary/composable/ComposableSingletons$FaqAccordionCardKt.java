package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$FaqAccordionCardKt {
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2008108571, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt.$r8$lambda$JE1TK6UfiJWlnXuzsw6uN0PLFAs((com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$JE1TK6UfiJWlnXuzsw6uN0PLFAs(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem faqItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faqItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2008108571, i, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.ComposableSingletons$FaqAccordionCardKt.lambda$2008108571.<anonymous> (FaqAccordionCard.kt:80)");
        }
        java.lang.String title = faqItem.getTitle();
        com.paypal.pds.core.Typography.TitleMedium titleMedium = com.paypal.pds.core.Typography.TitleMedium.INSTANCE;
        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        java.lang.String tag = faqItem.getTag();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(tag);
        sb.append("Title");
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(title, androidx.compose.ui.platform.TestTagKt.testTag(companion, sb.toString()), contentBase, null, null, null, false, 0, 0, null, titleMedium, composer, 384, 6, 1016);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqItem, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2008108571$directdeposit_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
