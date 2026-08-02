package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u000f\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "sheetData", "", "selectedFormId", "Lkotlin/Function1;", "", "onFormSelect", "Lkotlin/Function0;", "onDismiss", "MultiSavingSheetManager", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "", "isLoading", "onRequest", "ReconSheetManager", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsSheetManagersKt {
    public static final void MultiSavingSheetManager(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1056039795);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(multiSavingsSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1056039795, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.MultiSavingSheetManager (TaxDocumentsSheetManagers.kt:42)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(multiSavingsSheetData);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$MultiSavingSheetManager$1$1(multiSavingsSheetData, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(multiSavingsSheetData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i2 & 14);
            if (multiSavingsSheetData == null) {
                startRestartGroup.startReplaceGroup(-153494086);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-153494085);
                boolean z = (i2 & 896) == 256;
                boolean z2 = (i2 & 7168) == 2048;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.m20427$r8$lambda$v03bBC6IQtwOXFR5gBWy9LV3pA(kotlin.jvm.functions.Function1.this, function0, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.MultiSavingSheetKt.MultiSavingSheet(multiSavingsSheetData, str, bottomSheetController, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, (i2 & 112) | (com.paypal.pds.components.BottomSheetController.$stable << 6));
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.$r8$lambda$5OW4ktwNWIUaiRBl2x30NQqGY5s(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData.this, str, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReconSheetManager(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1148052778);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(sheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1148052778, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ReconSheetManager (TaxDocumentsSheetManagers.kt:87)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(sheetData);
            boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$ReconSheetManager$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$ReconSheetManager$1$1(sheetData, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(sheetData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i2 & 14);
            if (sheetData == null) {
                startRestartGroup.startReplaceGroup(-815343043);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-815343042);
                boolean z2 = (i2 & 896) == 256;
                boolean changedInstance3 = startRestartGroup.changedInstance(sheetData);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.$r8$lambda$4MRe8hLFx7MSHzXDuKomv20BpxM(kotlin.jvm.functions.Function1.this, sheetData);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.RequestReconTaxDocumentSheetKt.RequestReconTaxDocumentSheet(sheetData, bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue3, function0, z, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | (i2 & 7168) | ((i2 << 9) & 57344), 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsSheetManagersKt.$r8$lambda$nxmHFGTBD7DeejdAWvzEMhGytdE(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData.this, z, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4MRe8hLFx7MSHzXDuKomv20BpxM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData) {
        function1.invoke(sheetData);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5OW4ktwNWIUaiRBl2x30NQqGY5s(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        MultiSavingSheetManager(multiSavingsSheetData, str, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nxmHFGTBD7DeejdAWvzEMhGytdE(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData sheetData, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReconSheetManager(sheetData, z, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v03bBC6IQtwOXFR5gBWy9LV-3pA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20427$r8$lambda$v03bBC6IQtwOXFR5gBWy9LV3pA(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent multiSavingSheetIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiSavingSheetIntent, "");
        if (multiSavingSheetIntent instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.SelectForm) {
            function1.invoke(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.SelectForm) multiSavingSheetIntent).getFormId());
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(multiSavingSheetIntent, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.DismissSheet.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
