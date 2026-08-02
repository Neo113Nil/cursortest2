package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QuickStartPromptRendererKt {
    /* renamed from: $r8$lambda$T64Ws_Fc-mE6z4Lq5uVb8SnD9Bw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19210$r8$lambda$T64Ws_FcmE6z4Lq5uVb8SnD9Bw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-251762658);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-251762658, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptWithImagePreview (QuickStartPromptRenderer.kt:162)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.INSTANCE.m19207getLambda$2080586395$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRendererKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRendererKt.m19210$r8$lambda$T64Ws_FcmE6z4Lq5uVb8SnD9Bw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jtZ8-El8pKVIxdDxC55C9HeI_U0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19211$r8$lambda$jtZ8El8pKVIxdDxC55C9HeI_U0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-564980362);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-564980362, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptWithIconPreview (QuickStartPromptRenderer.kt:176)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.renderer.ComposableSingletons$QuickStartPromptRendererKt.INSTANCE.m19206getLambda$1593806001$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRendererKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRendererKt.m19211$r8$lambda$jtZ8El8pKVIxdDxC55C9HeI_U0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.pds.components.AvatarSource access$resolveAvatarSource(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.AvatarSource.Icon icon;
        com.paypal.pds.core.Icon.CurrencyUsdCircle currencyUsdCircle;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1818943761, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.resolveAvatarSource (QuickStartPromptRenderer.kt:122)");
        }
        if (quickStartPrompt.getIconUrl() != null) {
            composer.startReplaceGroup(1448945241);
            android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            boolean changed = composer.changed(density);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = java.lang.Integer.valueOf(density.mo1412roundToPx0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()));
                composer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((java.lang.Number) rememberedValue).intValue();
            boolean changed2 = composer.changed(quickStartPrompt.getIconUrl());
            boolean changed3 = composer.changed(intValue);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.core.commonui.components.ImageRequest.Builder(context).data(quickStartPrompt.getIconUrl()).size(intValue).build();
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter((com.paypal.oslo.core.commonui.components.ImageRequest) rememberedValue2, null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), androidx.compose.ui.layout.ContentScale.INSTANCE.getInside());
            composer.endReplaceGroup();
            icon = image;
        } else if (quickStartPrompt.getIconName() != null) {
            composer.startReplaceGroup(1449572898);
            composer.endReplaceGroup();
            java.lang.String iconName = quickStartPrompt.getIconName();
            int hashCode = iconName.hashCode();
            if (hashCode == -1787145119) {
                if (iconName.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.CURRENCY_CIRCLE)) {
                    currencyUsdCircle = com.paypal.pds.core.Icon.CurrencyUsdCircle.INSTANCE;
                    icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
                }
                currencyUsdCircle = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
            } else if (hashCode == 289896647) {
                if (iconName.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.MONEY_BILL)) {
                    currencyUsdCircle = com.paypal.pds.core.Icon.MoneyBill.INSTANCE;
                    icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
                }
                currencyUsdCircle = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
            } else {
                if (hashCode == 508584288 && iconName.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.SHOPPING_BAG)) {
                    currencyUsdCircle = com.paypal.pds.core.Icon.Bag.INSTANCE;
                    icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
                }
                currencyUsdCircle = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                icon = new com.paypal.pds.components.AvatarSource.Icon(currencyUsdCircle);
            }
        } else {
            composer.startReplaceGroup(1449670269);
            composer.endReplaceGroup();
            icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.NoIcon.INSTANCE);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return icon;
    }
}
