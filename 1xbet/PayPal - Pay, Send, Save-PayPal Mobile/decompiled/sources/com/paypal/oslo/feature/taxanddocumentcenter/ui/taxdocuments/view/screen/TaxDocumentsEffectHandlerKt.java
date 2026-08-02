package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"TaxDocumentsEffectHandler", "", "viewModel", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;", "onShowToast", "Lkotlin/Function1;", "", "onOpenMultiSavingsSheet", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "onOpenReconSheet", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "onShowReconLoading", "Lkotlin/Function0;", "onDismissReconSheet", "onDismissMultiSavingsSheet", "context", "Landroid/content/Context;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "handleOpenDownloadedFile", "effect", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect$OpenDownloadedFile;", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsEffectHandlerKt {
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if ((r32 & 128) != 0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxDocumentsEffectHandler(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData, kotlin.Unit> function13, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, android.content.Context context, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        android.content.Context context2;
        androidx.compose.runtime.Composer composer2;
        final android.content.Context context3;
        android.content.Context context4;
        kotlin.Unit unit;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxDocumentsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1611311192);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(taxDocumentsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                context2 = context;
                if (startRestartGroup.changedInstance(context2)) {
                    i4 = 8388608;
                    i3 |= i4;
                }
            } else {
                context2 = context;
            }
            i4 = 4194304;
            i3 |= i4;
        } else {
            context2 = context;
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 128) != 0) {
                    context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    i3 &= -29360129;
                }
                android.content.Context context5 = context2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1611311192, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandler (TaxDocumentsEffectHandler.kt:54)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_reconciliation_success, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_mutation_error_message, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_mutation_error_message, startRestartGroup, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(taxDocumentsViewModel);
                boolean z = (i3 & 112) == 32;
                boolean z2 = (i3 & 896) == 256;
                boolean z3 = (i3 & 7168) == 2048;
                boolean changedInstance2 = startRestartGroup.changedInstance(context5);
                boolean z4 = (i3 & 57344) == 16384;
                boolean z5 = (458752 & i3) == 131072;
                boolean changed = startRestartGroup.changed(stringResource);
                boolean changed2 = startRestartGroup.changed(stringResource2);
                boolean changed3 = startRestartGroup.changed(stringResource3);
                boolean z6 = (i3 & 3670016) == 1048576;
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (((z | changedInstance | z2 | z3 | changedInstance2 | z4 | z5 | changed | changed2 | changed3) || z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    context4 = context5;
                    composer2 = startRestartGroup;
                    unit = unit2;
                    rememberedValue = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1(taxDocumentsViewModel, function1, function12, function13, context4, function0, function02, stringResource, stringResource2, stringResource3, function03, null);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    composer2 = startRestartGroup;
                    unit = unit2;
                    context4 = context5;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                context3 = context4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            context3 = context2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt.$r8$lambda$8tnEI0RIDYhWqdJNDgwVxDCQjLw(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this, function1, function12, function13, function0, function02, function03, context3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8tnEI0RIDYhWqdJNDgwVxDCQjLw(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, android.content.Context context, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxDocumentsEffectHandler(taxDocumentsViewModel, function1, function12, function13, function0, function02, function03, context, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
