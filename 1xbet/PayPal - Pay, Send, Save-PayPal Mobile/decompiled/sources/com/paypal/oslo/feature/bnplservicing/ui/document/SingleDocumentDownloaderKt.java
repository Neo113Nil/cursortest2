package com.paypal.oslo.feature.bnplservicing.ui.document;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"SingleDocumentDownloader", "", "model", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "onComplete", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentHalfSheetViewModel;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentHalfSheetViewModel;Landroidx/compose/runtime/Composer;II)V", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SingleDocumentDownloaderKt {
    public static final void SingleDocumentDownloader(final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel2;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(279942240);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(documentsHalfSheetModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                documentHalfSheetViewModel2 = documentHalfSheetViewModel;
                if (startRestartGroup.changedInstance(documentHalfSheetViewModel2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                documentHalfSheetViewModel2 = documentHalfSheetViewModel;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            documentHalfSheetViewModel2 = documentHalfSheetViewModel;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    documentHalfSheetViewModel3 = (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 &= -897;
                }
                documentHalfSheetViewModel3 = documentHalfSheetViewModel2;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    documentHalfSheetViewModel3 = documentHalfSheetViewModel2;
                    i5 &= -897;
                }
                documentHalfSheetViewModel3 = documentHalfSheetViewModel2;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(279942240, i5, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloader (SingleDocumentDownloader.kt:28)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(documentsHalfSheetModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(documentHalfSheetViewModel3);
            boolean z = (i5 & 112) == 32;
            com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloaderKt$SingleDocumentDownloader$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloaderKt$SingleDocumentDownloader$1$1(documentsHalfSheetModel, documentHalfSheetViewModel3, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(documentsHalfSheetModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i5 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            documentHalfSheetViewModel3 = documentHalfSheetViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel4 = documentHalfSheetViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloaderKt.$r8$lambda$FTNTX2Uu7h9up1e0eP1Bus4SpOw(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.this, function0, documentHalfSheetViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FTNTX2Uu7h9up1e0eP1Bus4SpOw(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SingleDocumentDownloader(documentsHalfSheetModel, function0, documentHalfSheetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
