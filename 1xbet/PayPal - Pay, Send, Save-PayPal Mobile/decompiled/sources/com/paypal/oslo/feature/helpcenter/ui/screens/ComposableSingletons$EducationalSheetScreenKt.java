package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$EducationalSheetScreenKt {
    public static final com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt();
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1063644912, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt.$r8$lambda$pmivoKn3aDTXWoAKUMXFifEcAT0((com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1919173540, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt.$r8$lambda$yrxs4Cl896tnl_je99VPguWq1Qo((com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$nloGgveVshDyhkWzspta86khvfc(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        uriHandler.openUri(str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pmivoKn3aDTXWoAKUMXFifEcAT0(com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData ipsArticleData, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ipsArticleData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1063644912, i, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt.lambda$-1063644912.<anonymous> (EducationalSheetScreen.kt:178)");
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(ipsArticleData.getArticlePreview().getTitle(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yrxs4Cl896tnl_je99VPguWq1Qo(com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData ipsArticleData, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ipsArticleData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1919173540, i, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt.lambda$-1919173540.<anonymous> (EducationalSheetScreen.kt:184)");
        }
        final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
        java.lang.String excerpt = ipsArticleData.getArticlePreview().getExcerpt();
        com.paypal.pds.core.RichText parseHtmlLinks = com.paypal.oslo.feature.helpcenter.ui.screens.EducationalSheetScreenKt.parseHtmlLinks(excerpt != null ? excerpt : "");
        com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
        boolean changedInstance = composer.changedInstance(uriHandler);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$EducationalSheetScreenKt.$r8$lambda$nloGgveVshDyhkWzspta86khvfc(androidx.compose.ui.platform.UriHandler.this, (java.lang.String) obj, (java.lang.String) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(parseHtmlLinks, null, null, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyMedium, null, composer, 0, 48, 5118);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1919173540$helpcenter_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionBodyScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14829getLambda$1919173540$helpcenter_prodRelease() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-1063644912$helpcenter_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function4<com.paypal.pds.components.AccordionHeaderScope, com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14828getLambda$1063644912$helpcenter_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
