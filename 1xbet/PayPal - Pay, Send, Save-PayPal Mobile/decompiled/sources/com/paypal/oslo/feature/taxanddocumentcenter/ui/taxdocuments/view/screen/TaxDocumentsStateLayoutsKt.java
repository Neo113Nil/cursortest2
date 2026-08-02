package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\n\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aA\u0010\u0015\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001aO\u0010\u0017\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxYear;", "availableYears", "", "selectedYear", "Lcom/paypal/pds/components/DropdownState;", "dropdownState", "Lkotlin/Function1;", "", "onYearSelect", "InitialLoadingContent", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/pds/components/DropdownState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Content;", "state", "Lkotlin/Function0;", "onRetryLoadReports", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/FaqItem;", "onFaqClick", "onFaqViewMoreClick", "InitialErrorContent", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Content;Ljava/util/List;Lcom/paypal/pds/components/DropdownState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LoadingContentWithDropdown", "onRetryClick", "ErrorContentWithDropdown", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/pds/components/DropdownState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsStateLayoutsKt {
    public static final void InitialLoadingContent(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list, final java.lang.String str, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-167556971);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-167556971, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialLoadingContent (TaxDocumentsStateLayouts.kt:55)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsBackgroundSurfaceKt.TaxDocumentsBackgroundBox(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1804385976, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.m20429$r8$lambda$cgIG5n5mLDkSPM7kFK6G_QVwDk(list, dropdownState, str, function1, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$qOG7rTBlY87PZVInSi_1B38CUWk(list, str, dropdownState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InitialErrorContent(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content, final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.FaqItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1533361192);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1533361192, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialErrorContent (TaxDocumentsStateLayouts.kt:110)");
            }
            if ((content.getReportContentState() instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Error) && (content.getFaqState() instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Error)) {
                startRestartGroup.startReplaceGroup(-908193835);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsBackgroundSurfaceKt.TaxDocumentsBackgroundBox(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1858250896, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$tsvtosy84tSJMkLR90WgbK8EKGs(list, content, dropdownState, function1, function0, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 48, 1);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-907000149);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "initial_error_lazy_column");
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean changedInstance2 = startRestartGroup.changedInstance(content);
                boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(dropdownState));
                boolean z2 = (i2 & 7168) == 2048;
                boolean z3 = (57344 & i2) == 16384;
                boolean z4 = (458752 & i2) == 131072;
                boolean z5 = (i2 & 3670016) == 1048576;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance | changedInstance2 | z | z2 | z3 | z4) || z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    modifier = testTag;
                    composer2 = startRestartGroup;
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$SlGePl8GcC6fOASnLi_Ape3pnF0(list, content, function12, function02, dropdownState, function1, function0, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(function13);
                    rememberedValue = function13;
                } else {
                    composer2 = startRestartGroup;
                    modifier = testTag;
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsBackgroundSurfaceKt.TaxDocumentsBackgroundLazyColumn(modifier, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 6, 0);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$gIu7ngiB_k3XSiv4Oy1ZPgyhmI8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.this, list, dropdownState, function1, function0, function12, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingContentWithDropdown(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list, final java.lang.String str, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-354872986);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-354872986, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.LoadingContentWithDropdown (TaxDocumentsStateLayouts.kt:204)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "loading_content_lazy_column");
            boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(dropdownState));
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 7168) == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$Wg6RngSbZpNfbTjxy0jwcf89OKQ(com.paypal.pds.components.DropdownState.this, list, str, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsBackgroundSurfaceKt.TaxDocumentsBackgroundLazyColumn(testTag, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$ERYMfHOLxRhszfd9EC7Om70Vh7U(list, str, dropdownState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ErrorContentWithDropdown(final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list, final java.lang.String str, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1304050982);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1304050982, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ErrorContentWithDropdown (TaxDocumentsStateLayouts.kt:256)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "error_content_lazy_column");
            boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && startRestartGroup.changedInstance(dropdownState));
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 7168) == 2048;
            boolean z4 = (i2 & 57344) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$j3mWvfkgW1DmyLxT8Gc01dOELdk(com.paypal.pds.components.DropdownState.this, list, str, function1, function0, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(function12);
                rememberedValue = function12;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxDocumentsBackgroundSurfaceKt.TaxDocumentsBackgroundLazyColumn(testTag, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$NailjThqjLmTHjwu2yOH6t5YugI(list, str, dropdownState, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$13IwO4KKvwS425OjegubstxdmJ0(kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(277582740, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialErrorContent.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsStateLayouts.kt:167)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsErrorKt.TaxReportsError(function0, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), composer, 0, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ERYMfHOLxRhszfd9EC7Om70Vh7U(java.util.List list, java.lang.String str, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        LoadingContentWithDropdown(list, str, dropdownState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ko0MvlfQkhkX2nXVPRmZ4yAuJWA(kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-603417883, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ErrorContentWithDropdown.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsStateLayouts.kt:276)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$sSfBhMccIdCpJjUpV0Pf08FpCYQ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1710paddingqDBjuR0$default, true, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsErrorKt.TaxReportsError(function0, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), composer, 0, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NailjThqjLmTHjwu2yOH6t5YugI(java.util.List list, java.lang.String str, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ErrorContentWithDropdown(list, str, dropdownState, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RLm0WSUoAsyGGl5h3Wylj5tkD_w(com.paypal.pds.components.DropdownState dropdownState, java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1997692974, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.LoadingContentWithDropdown.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsStateLayouts.kt:210)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(dropdownState, list, str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), function1, composer, com.paypal.pds.components.DropdownState.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SlGePl8GcC6fOASnLi_Ape3pnF0(final java.util.List list, final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function0 function02, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (!list.isEmpty()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "year_dropdown", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(694688943, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.m20428$r8$lambda$SnqbvlFlzCJsd4noL5fdaTu7PA(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.this, dropdownState, list, function12, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "reports_error", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(277582740, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$13IwO4KKvwS425OjegubstxdmJ0(kotlin.jvm.functions.Function0.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 2, null);
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenLayoutsKt.renderFaqSection(lazyListScope, content.getFaqState(), function1, function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SnqbvlFlzCJsd4noL5fdaTu-7PA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20428$r8$lambda$SnqbvlFlzCJsd4noL5fdaTu7PA(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content, com.paypal.pds.components.DropdownState dropdownState, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(694688943, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialErrorContent.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsStateLayouts.kt:154)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(dropdownState, list, content.getSelectedYear(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), function1, composer, com.paypal.pds.components.DropdownState.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V9Sbix_yH9fr1BST7sLiWaRfIvk(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wg6RngSbZpNfbTjxy0jwcf89OKQ(final com.paypal.pds.components.DropdownState dropdownState, final java.util.List list, final java.lang.String str, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "year_dropdown", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1997692974, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$RLm0WSUoAsyGGl5h3Wylj5tkD_w(com.paypal.pds.components.DropdownState.this, list, str, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 2, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "loading_indicator", null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ComposableSingletons$TaxDocumentsStateLayoutsKt.INSTANCE.getLambda$1138529829$tax_and_document_center_prodRelease(), 2, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cgIG5n5mL-DkSPM7kFK6G_QVwDk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20429$r8$lambda$cgIG5n5mLDkSPM7kFK6G_QVwDk(java.util.List list, com.paypal.pds.components.DropdownState dropdownState, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1804385976, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialLoadingContent.<anonymous> (TaxDocumentsStateLayouts.kt:58)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$V9Sbix_yH9fr1BST7sLiWaRfIvk((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(fillMaxSize$default, true, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "reports_loading_indicator"), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            composer.endNode();
            if (list.isEmpty()) {
                composer.startReplaceGroup(1349090458);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1348659620);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(dropdownState, list, str, boxScope.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), androidx.compose.ui.Alignment.INSTANCE.getTopStart()), function1, composer, com.paypal.pds.components.DropdownState.$stable, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gIu7ngiB_k3XSiv4Oy1ZPgyhmI8(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content, java.util.List list, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        InitialErrorContent(content, list, dropdownState, function1, function0, function12, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j3mWvfkgW1DmyLxT8Gc01dOELdk(final com.paypal.pds.components.DropdownState dropdownState, final java.util.List list, final java.lang.String str, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "year_dropdown", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1077691374, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$pL5ODMKMQRof1AVPfVqzDkmV84w(com.paypal.pds.components.DropdownState.this, list, str, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 2, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "error_message", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-603417883, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsStateLayoutsKt.$r8$lambda$Ko0MvlfQkhkX2nXVPRmZ4yAuJWA(kotlin.jvm.functions.Function0.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pL5ODMKMQRof1AVPfVqzDkmV84w(com.paypal.pds.components.DropdownState dropdownState, java.util.List list, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1077691374, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.ErrorContentWithDropdown.<anonymous>.<anonymous>.<anonymous> (TaxDocumentsStateLayouts.kt:262)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(dropdownState, list, str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), function1, composer, com.paypal.pds.components.DropdownState.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qOG7rTBlY87PZVInSi_1B38CUWk(java.util.List list, java.lang.String str, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        InitialLoadingContent(list, str, dropdownState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sSfBhMccIdCpJjUpV0Pf08FpCYQ(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tsvtosy84tSJMkLR90WgbK8EKGs(java.util.List list, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1858250896, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.InitialErrorContent.<anonymous> (TaxDocumentsStateLayouts.kt:120)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.TaxReportsErrorKt.TaxReportsError(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            composer.endNode();
            if (list.isEmpty()) {
                composer.startReplaceGroup(-1317836686);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1318315698);
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.YearDropdownSection(dropdownState, list, content.getSelectedYear(), boxScope.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null), androidx.compose.ui.Alignment.INSTANCE.getTopStart()), function1, composer, com.paypal.pds.components.DropdownState.$stable, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
