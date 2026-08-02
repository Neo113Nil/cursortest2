package com.paypal.oslo.feature.mosaic.ui.components.datefield;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"MosaicDateFieldScreen", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPageDateOfBirthInputComponent;", "viewModel", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/MosaicDateFieldViewModel;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicPageDateOfBirthInputComponent;Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/MosaicDateFieldViewModel;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease", "uiState", "Lcom/paypal/oslo/feature/mosaic/ui/components/datefield/mvi/MosaicDateFieldUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicDateFieldScreenKt {
    public static final void MosaicDateFieldScreen(final com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent mosaicPageDateOfBirthInputComponent, final com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageDateOfBirthInputComponent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(685770763);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mosaicPageDateOfBirthInputComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(mosaicDateFieldViewModel)) ? 32 : 16;
        }
        int i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                mosaicDateFieldViewModel = (com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 &= -113;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(685770763, i4, -1, "com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreen (MosaicDateFieldScreen.kt:28)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(mosaicDateFieldViewModel.getUiState$mosaic_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState mosaicDateFieldUiState = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState) collectAsStateWithLifecycle.getValue();
            if (mosaicDateFieldUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Initial) {
                startRestartGroup.startReplaceGroup(1895715631);
                startRestartGroup.endReplaceGroup();
            } else if (!(mosaicDateFieldUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready)) {
                if (!(mosaicDateFieldUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error)) {
                    startRestartGroup.startReplaceGroup(1895714861);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-1361733923);
                com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState mosaicDateFieldUiState2 = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState) collectAsStateWithLifecycle.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mosaicDateFieldUiState2, "");
                com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel = ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Error) mosaicDateFieldUiState2).getUiModel();
                boolean changedInstance = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$daLXzZksvzD7qaNGmo0AhYELFSU(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changedInstance2 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$8XgwXTkEwB0DefYIdLD2_q2NuZ0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean changedInstance3 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$rdYMge_qyWjRVw_rCYN69QnChG0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean changedInstance4 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$tE_KZkgYdxXFODCo4FECcpNuOvs(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.MosaicDateFieldContent(mosaicPageDateOfBirthInputComponent, uiModel, function0, function02, function03, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i4 & 14);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1362258412);
                com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState mosaicDateFieldUiState3 = (com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState) collectAsStateWithLifecycle.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mosaicDateFieldUiState3, "");
                com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiModel uiModel2 = ((com.paypal.oslo.feature.mosaic.ui.components.datefield.mvi.MosaicDateFieldUiState.Ready) mosaicDateFieldUiState3).getUiModel();
                boolean changedInstance5 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$HZ1aQoRAhe20vEa45Eq0vQ129M0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
                boolean changedInstance6 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.m15794$r8$lambda$o2OfVV4NfjHQBJTqX8wm6mEeKQ(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance7 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.$r8$lambda$GRlqf5bpsKqn0_21kOgsGxNLOWU(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue7;
                boolean changedInstance8 = startRestartGroup.changedInstance(mosaicDateFieldViewModel);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.m15793$r8$lambda$h33UVu_8rRZBXAcPYQKDV90NyI(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldContentKt.MosaicDateFieldContent(mosaicPageDateOfBirthInputComponent, uiModel2, function04, function05, function06, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, i4 & 14);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldScreenKt.m15792$r8$lambda$95EWIoUKOR9lHVrE93L95mGhXM(com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent.this, mosaicDateFieldViewModel, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8XgwXTkEwB0DefYIdLD2_q2NuZ0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onFieldUnfocused$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$95E-WIoUKOR9lHVrE93L95mGhXM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15792$r8$lambda$95EWIoUKOR9lHVrE93L95mGhXM(com.paypal.oslo.feature.mosaic.domain.model.MosaicPageDateOfBirthInputComponent mosaicPageDateOfBirthInputComponent, com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicDateFieldScreen(mosaicPageDateOfBirthInputComponent, mosaicDateFieldViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GRlqf5bpsKqn0_21kOgsGxNLOWU(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onDateValidated$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HZ1aQoRAhe20vEa45Eq0vQ129M0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onFieldFocused$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$daLXzZksvzD7qaNGmo0AhYELFSU(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onFieldFocused$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h33UV-u_8rRZBXAcPYQKDV90NyI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15793$r8$lambda$h33UVu_8rRZBXAcPYQKDV90NyI(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mosaicDateFieldViewModel.onValidationFailed$mosaic_prodRelease(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o2OfVV4NfjHQBJT-qX8wm6mEeKQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15794$r8$lambda$o2OfVV4NfjHQBJTqX8wm6mEeKQ(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onFieldUnfocused$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rdYMge_qyWjRVw_rCYN69QnChG0(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel) {
        mosaicDateFieldViewModel.onDateValidated$mosaic_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tE_KZkgYdxXFODCo4FECcpNuOvs(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mosaicDateFieldViewModel.onValidationFailed$mosaic_prodRelease(str);
        return kotlin.Unit.INSTANCE;
    }
}
