package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002"}, d2 = {"", "CustomStatementDownloadScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "CustomStatementDownloadLoadingPreview", "CustomStatementDownloadErrorPreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatementDownloadScreenPreviewKt {
    public static final void CustomStatementDownloadScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(176582392);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(176582392, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreview (CustomStatementDownloadScreenPreview.kt:27)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt.CustomStatementDownloadIdleContent(null, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 432, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt.$r8$lambda$jbFLVZjWAQuo3Yc7dL6GN3p7iNo(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomStatementDownloadLoadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-191236648);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-191236648, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadLoadingPreview (CustomStatementDownloadScreenPreview.kt:40)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.LoadingScreenComponentKt.LoadingScreenComponent(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_loading_message, startRestartGroup, 0), startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt.m20354$r8$lambda$cCJb8JhQfdBznGZT7CQKR6DnTc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomStatementDownloadErrorPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(397774732);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(397774732, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadErrorPreview (CustomStatementDownloadScreenPreview.kt:52)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.common.components.ErrorScreenComponentKt.ErrorScreenComponent(function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.preview.CustomStatementDownloadScreenPreviewKt.$r8$lambda$OgmLeFGyw3qenWntixCC3CKYmEg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OgmLeFGyw3qenWntixCC3CKYmEg(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomStatementDownloadErrorPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cCJb8-JhQfdBznGZT7CQKR6DnTc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20354$r8$lambda$cCJb8JhQfdBznGZT7CQKR6DnTc(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomStatementDownloadLoadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jbFLVZjWAQuo3Yc7dL6GN3p7iNo(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomStatementDownloadScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
