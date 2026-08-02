package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a;\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a;\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u0015\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"StatementDetailsScreen", "", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;", "onNavigateBack", "Lkotlin/Function0;", "onNavigateWebView", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RevolvingCreditWebViewArgs;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.LOADING, "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.ERROR, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "onTryAgain", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.NO_PDF_READER_ERROR, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.READY, "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Ready;", "onLearnMoreClick", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState$Ready;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsScreenKt {
    public static final void StatementDetailsScreen(final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1008234135);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(statementDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1008234135, i5, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreen (StatementDetailsScreen.kt:64)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(statementDetailsViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
            boolean changedInstance2 = startRestartGroup.changedInstance(statementDetailsViewModel);
            boolean z = (i5 & 896) == 256;
            boolean z2 = (i5 & 112) == 32;
            boolean changedInstance3 = startRestartGroup.changedInstance(context);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | changedInstance2 | z | z2) || changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 1;
                i4 = i5;
                composer3 = startRestartGroup;
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$StatementDetailsScreen$1$1(lifecycleOwner, statementDetailsViewModel, function1, function0, context, null);
                composer3.updateRememberedValue(rememberedValue);
            } else {
                i4 = i5;
                composer3 = startRestartGroup;
                i3 = 1;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.TRUE, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState statementDetailsState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState) collectAsStateWithLifecycle.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(statementDetailsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Initial.INSTANCE) || (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Loading)) {
                composer2 = composer3;
                composer2.startReplaceGroup(-599978499);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.LOADING);
                boolean changedInstance4 = composer2.changedInstance(statementDetailsViewModel);
                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                if (changedInstance4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$v7xkdHWrrJdN7JwY4sjMPrQaN6c(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoSizes((kotlin.jvm.functions.Function0) rememberedValue2, testTag, composer2, 48, 0);
                composer2.endReplaceGroup();
            } else {
                if (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Error) {
                    composer3.startReplaceGroup(-599712891);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.ERROR);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_error_description, composer3, 0);
                    boolean changedInstance5 = composer3.changedInstance(statementDetailsViewModel);
                    java.lang.Object rememberedValue3 = composer3.rememberedValue();
                    if (changedInstance5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.m18650$r8$lambda$UhZmztQnMcZL5rwGL_Z2bjq4bI(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    boolean changedInstance6 = composer3.changedInstance(statementDetailsViewModel);
                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                    if (changedInstance6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$_iG2RlGLOuvVAow_nFuDnSHpBZU(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    composer4 = composer3;
                    Camera2StreamConfigurationMap(stringResource, function02, (kotlin.jvm.functions.Function0) rememberedValue4, testTag2, composer4, 3072, 0);
                    composer4.endReplaceGroup();
                } else {
                    composer4 = composer3;
                    if (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.DownloadError) {
                        composer4.startReplaceGroup(-599200802);
                        androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.DOWNLOAD_ERROR);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_document_error_subtitle, composer4, 0);
                        boolean changedInstance7 = composer4.changedInstance(statementDetailsViewModel);
                        java.lang.Object rememberedValue5 = composer4.rememberedValue();
                        if (changedInstance7 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.m18647$r8$lambda$GLzppWMfAXdFV6r4N6q98PHEW0(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
                        boolean changedInstance8 = composer4.changedInstance(statementDetailsViewModel);
                        java.lang.Object rememberedValue6 = composer4.rememberedValue();
                        if (changedInstance8 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$xxInbN5qHvD5bylgo9l3czbOpOY(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue6);
                        }
                        Camera2StreamConfigurationMap(stringResource2, function03, (kotlin.jvm.functions.Function0) rememberedValue6, testTag3, composer4, 3072, 0);
                        composer4.endReplaceGroup();
                    } else if (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready) {
                        composer4.startReplaceGroup(-598695347);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready) statementDetailsState;
                        androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.READY);
                        boolean changedInstance9 = composer4.changedInstance(statementDetailsViewModel);
                        java.lang.Object rememberedValue7 = composer4.rememberedValue();
                        if (changedInstance9 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$SdiWjjEIkVA4Shwg3PtoKTFIhjU(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this, (java.lang.String) obj);
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue7);
                        }
                        composer2 = composer4;
                        getHighSpeedVideoFpsRangesFor(ready, statementDetailsViewModel, testTag4, (kotlin.jvm.functions.Function1) rememberedValue7, composer4, ((i4 << 3) & 112) | 384, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composer4;
                        if (statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Downloading) {
                            composer2.startReplaceGroup(-598354471);
                            androidx.compose.ui.Modifier testTag5 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.DOWNLOADING);
                            boolean changedInstance10 = composer2.changedInstance(statementDetailsViewModel);
                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                            if (changedInstance10 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.m18649$r8$lambda$Lxtd_gBIJcTZTeHhuDQ1iF3X4w(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue8);
                            }
                            getHighSpeedVideoSizes((kotlin.jvm.functions.Function0) rememberedValue8, testTag5, composer2, 48, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(statementDetailsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.NoPdfReaderError)) {
                                composer2.startReplaceGroup(-1959018200);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-598081144);
                            androidx.compose.ui.Modifier testTag6 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.NO_PDF_READER_ERROR);
                            boolean changedInstance11 = composer2.changedInstance(statementDetailsViewModel);
                            java.lang.Object rememberedValue9 = composer2.rememberedValue();
                            if (changedInstance11 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$5A9ySW6bIWAGb8ifDDjecfMD93U(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue9);
                            }
                            getHighSpeedVideoFpsRanges((kotlin.jvm.functions.Function0) rememberedValue9, testTag6, composer2, 48, 0);
                            composer2.endReplaceGroup();
                        }
                    }
                }
                composer2 = composer4;
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$0mIjcUacAxtQFM9xTeXZabuFiCA(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2122114624);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            } else {
                companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2122114624, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsLoading (StatementDetailsScreen.kt:153)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE.asString(startRestartGroup, 6), new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, startRestartGroup, 0)), null, 4, null), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.TOOLBAR), startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable | 48, 0);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$ZdJ11zqLKJmiR07WVT51DhOHLfw(kotlin.jvm.functions.Function0.this, companion, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-568340703);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-568340703, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsError (StatementDetailsScreen.kt:177)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE.asString(startRestartGroup, 6), new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, startRestartGroup, 0)), null, 4, null), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.TOOLBAR), startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable | 48, 0);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                int i5 = i3 << 12;
                modifier3 = modifier4;
                com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_something_went_wrong_error_title, startRestartGroup, 0), str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, startRestartGroup, 0), function02, startRestartGroup, (i5 & 3670016) | 6 | (57344 & i5), 6);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$ramTTt11qnJFXp1jMXZbQKNqPCM(str, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1052188934);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1052188934, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsNoPdfReaderError (StatementDetailsScreen.kt:212)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE.asString(startRestartGroup, 6), new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, startRestartGroup, 0)), null, 4, null), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.TOOLBAR), startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable | 48, 0);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_no_pdf_reader_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_no_pdf_reader_description, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_details_no_pdf_reader_button, startRestartGroup, 0), function0, startRestartGroup, ((i3 << 18) & 3670016) | 6, 6);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$UW8gZjY510tuJ6GZAkh1lN8rn0s(kotlin.jvm.functions.Function0.this, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready ready, final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1062222890);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(statementDetailsViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1062222890, i4, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsReady (StatementDetailsScreen.kt:253)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsTestArgs.TOOLBAR);
                java.lang.String asString = ready.getHeaderUiModel().getStatementPeriod().asString(startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(statementDetailsViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.m18648$r8$lambda$KI8LgFtYmj87W6XNFFU481DfBc(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.navigation.ui.NavigationBarKt.NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(asString, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, startRestartGroup, 0)), null, 4, null), testTag, startRestartGroup, com.paypal.oslo.core.navigation.ui.NavigationBarConfig.$stable | 48, 0);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsHeaderSectionKt.StatementDetailsHeaderSection(ready.getHeaderUiModel(), null, startRestartGroup, 0, 2);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.uimodel.StatementSummaryUiModel statementSummaryUiModel = ready.getStatementSummaryUiModel();
                boolean changedInstance2 = startRestartGroup.changedInstance(statementDetailsViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.m18651$r8$lambda$UkVy_oe0vDcfPhkGtZHvcMnrlQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsStatementSectionKt.StatementDetailsStatementSection(statementSummaryUiModel, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 0, 4);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsPaymentsSectionKt.StatementDetailsPaymentsSection(ready.getPaymentsUiModel(), function1, null, startRestartGroup, (i4 >> 6) & 112, 4);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementsDetailsSpecialFinancingSectionKt.StatementsDetailsSpecialFinancingSection(ready.getSpecialFinancingSection(), null, startRestartGroup, 0, 2);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsCashBackSectionKt.StatementDetailsCashBackSection(ready.getCashbackSection(), null, startRestartGroup, 0, 2);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.components.StatementDetailsTransactionsSectionKt.StatementDetailsTransactionsSection(ready.getTransactionsSection(), null, startRestartGroup, 0, 2);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), startRestartGroup, 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.$r8$lambda$n2i3gy_zWE2q2NG8ERR0a3oRUJs(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready.this, statementDetailsViewModel, modifier4, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0mIjcUacAxtQFM9xTeXZabuFiCA(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        StatementDetailsScreen(statementDetailsViewModel, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5A9ySW6bIWAGb8ifDDjecfMD93U(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GLzppWMfAXdFV-6r4N6q98PHEW0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18647$r8$lambda$GLzppWMfAXdFV6r4N6q98PHEW0(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KI8LgFtYmj-87W6XNFFU481DfBc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18648$r8$lambda$KI8LgFtYmj87W6XNFFU481DfBc(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Lxtd_gBIJcTZ-TeHhuDQ1iF3X4w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18649$r8$lambda$Lxtd_gBIJcTZTeHhuDQ1iF3X4w(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SdiWjjEIkVA4Shwg3PtoKTFIhjU(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        statementDetailsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnLearnMoreClick(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UW8gZjY510tuJ6GZAkh1lN8rn0s(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UhZmztQnMcZL5rw-GL_Z2bjq4bI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18650$r8$lambda$UhZmztQnMcZL5rwGL_Z2bjq4bI(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uk-Vy_oe0vDcfPhkGtZHvcMnrlQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18651$r8$lambda$UkVy_oe0vDcfPhkGtZHvcMnrlQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnDownloadClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZdJ11zqLKJmiR07WVT51DhOHLfw(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_iG2RlGLOuvVAow_nFuDnSHpBZU(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnRetry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n2i3gy_zWE2q2NG8ERR0a3oRUJs(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(ready, statementDetailsViewModel, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ramTTt11qnJFXp1jMXZbQKNqPCM(java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(str, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v7xkdHWrrJdN7JwY4sjMPrQaN6c(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xxInbN5qHvD5bylgo9l3czbOpOY(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel) {
        statementDetailsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnRetry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
