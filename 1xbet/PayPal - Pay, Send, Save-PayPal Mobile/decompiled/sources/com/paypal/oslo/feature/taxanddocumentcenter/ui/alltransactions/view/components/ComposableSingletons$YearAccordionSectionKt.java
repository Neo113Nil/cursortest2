package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$YearAccordionSectionKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(195790445, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt.$r8$lambda$LQvZWVpFmWtckeLb2kqWWYnhllg((com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$LQvZWVpFmWtckeLb2kqWWYnhllg(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yearAccordionItem, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(195790445, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.ComposableSingletons$YearAccordionSectionKt.lambda$195790445.<anonymous> (YearAccordionSection.kt:78)");
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.YearAccordionSectionKt.YearHeader(yearAccordionItem.getYear(), yearAccordionItem.isExpanded(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$195790445$tax_and_document_center_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
