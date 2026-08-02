package com.paypal.oslo.feature.bnplservicing.ui.document;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"DocumentHalfSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "model", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "onClose", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentHalfSheetViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentHalfSheetViewModel;Landroidx/compose/runtime/Composer;II)V", "DocumentHalfSheetContent", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;", "showErrorContent", "", "onDocumentClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentData;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentsUiModel;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DocumentItem", "document", "onClick", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DocumentHalfSheetContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentHalfSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocumentHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel4;
        int i4;
        java.lang.Object rememberedValue;
        boolean z2;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$1$1 rememberedValue2;
        boolean changedInstance;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$2$1 rememberedValue3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1176894694);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(documentsHalfSheetModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                documentHalfSheetViewModel2 = documentHalfSheetViewModel;
                if (startRestartGroup.changedInstance(documentHalfSheetViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                documentHalfSheetViewModel2 = documentHalfSheetViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            documentHalfSheetViewModel2 = documentHalfSheetViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i4 = i6 & (-7169);
                    z = false;
                    documentHalfSheetViewModel4 = documentHalfSheetViewModel2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    int i7 = i4 & 14;
                    if (i7 != 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(documentHalfSheetViewModel4);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$2$1(documentHalfSheetViewModel4, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel5 = documentHalfSheetViewModel4;
                    com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel6 = documentHalfSheetViewModel4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 5, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1109583873, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$uheopEczY7lISnQhTjFTP5DFcnA(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.this, documentHalfSheetViewModel5, bottomSheetController, function0, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i7 | ((i4 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i4 << 12) & 3670016), 440);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    documentHalfSheetViewModel3 = documentHalfSheetViewModel6;
                }
            } else if ((i2 & 8) != 0) {
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
                z = false;
                documentHalfSheetViewModel4 = (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i6 & (-7169);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1176894694, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheet (DocumentHalfSheet.kt:69)");
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                int i72 = i4 & 14;
                z2 = (i72 != 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) ? true : z;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(documentHalfSheetViewModel4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$2$1(documentHalfSheetViewModel4, mutableState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel52 = documentHalfSheetViewModel4;
                com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel62 = documentHalfSheetViewModel4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 5, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1109583873, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$uheopEczY7lISnQhTjFTP5DFcnA(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.this, documentHalfSheetViewModel52, bottomSheetController, function0, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i72 | ((i4 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i4 << 12) & 3670016), 440);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                documentHalfSheetViewModel3 = documentHalfSheetViewModel62;
            }
            z = false;
            i4 = i6;
            documentHalfSheetViewModel4 = documentHalfSheetViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue;
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            int i722 = i4 & 14;
            if (i722 != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$1$1(bottomSheetController, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(documentHalfSheetViewModel4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$DocumentHalfSheet$2$1(documentHalfSheetViewModel4, mutableState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel522 = documentHalfSheetViewModel4;
            com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel622 = documentHalfSheetViewModel4;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 5, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1109583873, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$uheopEczY7lISnQhTjFTP5DFcnA(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.this, documentHalfSheetViewModel522, bottomSheetController, function0, mutableState22, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i722 | ((i4 >> 3) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i4 << 12) & 3670016), 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            documentHalfSheetViewModel3 = documentHalfSheetViewModel622;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            documentHalfSheetViewModel3 = documentHalfSheetViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.m12584$r8$lambda$5CW_xsmRpwiFPUwduMS_CwLgYo(com.paypal.pds.components.BottomSheetController.this, documentsHalfSheetModel, function0, documentHalfSheetViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DocumentHalfSheetContent(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        int i2;
        int i3;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1944025409);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(documentsUiModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i5 = i4;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1944025409, i5, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetContent (DocumentHalfSheet.kt:113)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(documentsUiModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
            if (z) {
                startRestartGroup.startReplaceGroup(-2098414730);
                i3 = i5;
                composer3 = startRestartGroup;
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetTestTags.DOWNLOAD_ERROR), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.value(documentsUiModel.getErrorMessage(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 54, 120);
                i2 = 0;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer3, 0);
                composer3.endReplaceGroup();
            } else {
                i2 = 0;
                i3 = i5;
                composer3 = startRestartGroup;
                composer3.startReplaceGroup(-2098137001);
                composer3.endReplaceGroup();
            }
            composer3.startReplaceGroup(1871982729);
            for (final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData : documentsUiModel.getDocuments()) {
                int i6 = (i3 & 896) == 256 ? 1 : i2;
                boolean changed = composer3.changed(documentData);
                java.lang.Object rememberedValue = composer3.rememberedValue();
                if (((changed ? 1 : 0) | i6) != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.m12586$r8$lambda$S6W2sLNBbLpExRaJBLIcGFe_5o(kotlin.jvm.functions.Function1.this, documentData);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue);
                }
                getHighSpeedVideoFpsRangesFor(documentData, (kotlin.jvm.functions.Function0) rememberedValue, composer3, i2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer3, i2);
            }
            composer3.endReplaceGroup();
            composer2 = composer3;
            com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(documentsUiModel.getButtonText(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetTestTags.CLOSE_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer3, ((i3 >> 9) & 14) | 1769856, 408);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.m12585$r8$lambda$OYnoOGKnhtUFiqqtolnorr1EsA(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel.this, z, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(734271464);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(documentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(734271464, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentItem (DocumentHalfSheet.kt:165)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize4());
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Document.INSTANCE, "Document", null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 4);
            com.paypal.pds.components.LinkKt.Link(documentData.getName(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "document_item_".concat(java.lang.String.valueOf(documentData.getFileName()))), function0, com.paypal.pds.components.LinkSize.Medium.INSTANCE, startRestartGroup, ((i3 << 3) & 896) | (com.paypal.pds.components.LinkSize.Medium.$stable << 9), 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$qEVftkV8ChgQQrNvdCX3jgUb_s4(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-YPGF4fD8QiiYt9xG7irz8tE2Ao, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12583$r8$lambda$YPGF4fD8QiiYt9xG7irz8tE2Ao(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5CW_xsmRpwiFPUwduMS_C-wLgYo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12584$r8$lambda$5CW_xsmRpwiFPUwduMS_CwLgYo(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocumentHalfSheet(bottomSheetController, documentsHalfSheetModel, function0, documentHalfSheetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OYnoOGKnhtUFiqq-tolnorr1EsA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12585$r8$lambda$OYnoOGKnhtUFiqqtolnorr1EsA(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        DocumentHalfSheetContent(documentsUiModel, z, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S6W2sLNBbL-pExRaJBLIcGFe_5o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12586$r8$lambda$S6W2sLNBbLpExRaJBLIcGFe_5o(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData) {
        function1.invoke(documentData);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZbCin_AZ7ZRaO5dvh-tEEhFREuY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12587$r8$lambda$ZbCin_AZ7ZRaO5dvhtEEhFREuY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1276977105);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1276977105, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetContentPreview (DocumentHalfSheet.kt:192)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel documentsUiModel = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_download_documents_label, new java.lang.Object[0]), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData[]{new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData("Contract", "contract.pdf", new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(null, "https://example.com/contract.pdf", com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.STATIC_PDF, 1, null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.CONTRACT), new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData("Privacy Notice", "privacy.pdf", new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(null, "https://example.com/privacy.pdf", com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.STATIC_PDF, 1, null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.PRIVACY_NOTICE), new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData("Facility Agreement", "facility.pdf", new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel(null, "https://example.com/facility.pdf", com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.STATIC_PDF, 1, null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.FACILITY_AGREEMENT)}), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Available Documents"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_close, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_plan_documents_sheet_error_message, new java.lang.Object[0]));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            java.lang.Object obj = rememberedValue;
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
                bottomSheetController.showSheet();
                startRestartGroup.updateRememberedValue(bottomSheetController);
                obj = bottomSheetController;
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) obj;
            com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel = new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel(documentsUiModel, "", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US);
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController2);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.m12583$r8$lambda$YPGF4fD8QiiYt9xG7irz8tE2Ao(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DocumentHalfSheet(bottomSheetController2, documentsHalfSheetModel, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.m12587$r8$lambda$ZbCin_AZ7ZRaO5dvhtEEhFREuY(updateChangedFlags, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b1L2I8PH_k5kaAoKmOCZWiYs3x4(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f1rclc8sdPqCtn9WQeH50rjug_s(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentData, "");
        mutableState.setValue(java.lang.Boolean.FALSE);
        documentHalfSheetViewModel.onDocumentClick(documentData, documentsHalfSheetModel.getPlanId(), documentsHalfSheetModel.getCpi());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qEVftkV8ChgQQrNvdCX3jgUb_s4(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(documentData, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$uheopEczY7lISnQhTjFTP5DFcnA(final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel, final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1109583873, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheet.<anonymous> (DocumentHalfSheet.kt:92)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentsUiModel document = documentsHalfSheetModel.getDocument();
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changedInstance = composer.changedInstance(documentHalfSheetViewModel);
            boolean changedInstance2 = composer.changedInstance(documentsHalfSheetModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$f1rclc8sdPqCtn9WQeH50rjug_s(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel.this, documentsHalfSheetModel, mutableState, (com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance3 = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetKt.$r8$lambda$b1L2I8PH_k5kaAoKmOCZWiYs3x4(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            DocumentHalfSheetContent(document, booleanValue, function1, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
