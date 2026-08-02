package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"", "YearDropdownPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxYear;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YearDropdownSectionPreviewKt {
    private static final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear[]{new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2025", "2025"), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2024", "2024"), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2023", "2023"), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2022", "2022"), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2021", "2021"), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear("2020", "2020")});

    public static final void YearDropdownPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(861201276);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(861201276, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearDropdownPreview (YearDropdownSectionPreview.kt:36)");
            }
            com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list = getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearDropdownSectionPreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearDropdownSectionPreviewKt.$r8$lambda$kJ0IvVxgtc2Nlos9KZ42rLSLCj0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(rememberDropdownState, list, "2024", m1706padding3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.pds.components.DropdownState.$stable | 24960, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearDropdownSectionPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.YearDropdownSectionPreviewKt.$r8$lambda$MOaAS6Uuvjc5FZv9y3uv2zYkg6s(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MOaAS6Uuvjc5FZv9y3uv2zYkg6s(int i, androidx.compose.runtime.Composer composer, int i2) {
        YearDropdownPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kJ0IvVxgtc2Nlos9KZ42rLSLCj0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
