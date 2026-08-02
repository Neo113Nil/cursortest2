package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "MainMenuScreenPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainMenuScreenPreviewKt {
    public static final void MainMenuScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1388125074);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1388125074, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview.MainMenuScreenPreview (MainMenuScreenPreview.kt:28)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState mainMenuState = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MainMenuState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_group_taxes, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.TAX_DOCUMENTS, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_tax_documents_title, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_tax_documents_description), new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.FILE_TAXES, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_file_taxes_title, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_file_taxes_description)})), new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_group_statements, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem[]{new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.ALL_TRANSACTIONS, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_all_transactions_title, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_all_transactions_description), new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.CUSTOM_STATEMENT, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_custom_statement_title, com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_menu_item_custom_statement_description)}))}));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview.MainMenuScreenPreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview.MainMenuScreenPreviewKt.$r8$lambda$wVfpe_hQip4GsXjEybAuTvIt87Y((com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.screen.MainMenuScreenKt.RenderMainMenuScreenContent(mainMenuState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType, kotlin.Unit>) rememberedValue, (androidx.compose.ui.Modifier) null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview.MainMenuScreenPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.view.preview.MainMenuScreenPreviewKt.$r8$lambda$yUDdI9DgAZuugnELas45gKCjqOY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wVfpe_hQip4GsXjEybAuTvIt87Y(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuCardType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yUDdI9DgAZuugnELas45gKCjqOY(int i, androidx.compose.runtime.Composer composer, int i2) {
        MainMenuScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
