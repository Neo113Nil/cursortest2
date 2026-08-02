package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001aa\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"UnlinkAccountScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "partyId", "", "fullName", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "profilePicture", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UnlinkAccountViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/accountswitch/ui/UnlinkAccountViewModel;Landroidx/compose/runtime/Composer;II)V", "UnlinkAccountContent", "userAccount", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "onBackClick", "Lkotlin/Function0;", "onUnlinkClick", "isUnlinking", "", "errorMessage", "onErrorDismiss", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AccountCard", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnlinkAccountScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "UnlinkAccountScreenWithImagePreview", "UnlinkAccountScreenLoadingPreview", "UnlinkAccountScreenErrorPreview", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UnlinkAccountUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnlinkAccountScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnlinkAccountScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel4;
        boolean changed;
        boolean z;
        java.lang.Object rememberedValue;
        boolean z2;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        java.lang.Object rememberedValue4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(475375959);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    unlinkAccountViewModel2 = unlinkAccountViewModel;
                    if (startRestartGroup.changedInstance(unlinkAccountViewModel2)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    unlinkAccountViewModel2 = unlinkAccountViewModel;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                unlinkAccountViewModel2 = unlinkAccountViewModel;
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) != 0) {
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
                        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel5 = (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 = i3 & (-3670017);
                        modifier4 = companion;
                        unlinkAccountViewModel4 = unlinkAccountViewModel5;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(475375959, i4, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreen (UnlinkAccountScreen.kt:87)");
                        }
                        androidx.compose.runtime.Composer composer3 = startRestartGroup;
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(unlinkAccountViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState unlinkAccountUiState = (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle.getValue();
                        changed = composer3.changed(collectAsStateWithLifecycle);
                        int i7 = i4 & 14;
                        z = i7 != 4;
                        rememberedValue = composer3.rememberedValue();
                        if (!(changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$UnlinkAccountScreen$1$1(appNavigator, collectAsStateWithLifecycle, null);
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unlinkAccountUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 0);
                        com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount(str, str2, str3, str4, false, false);
                        boolean z3 = ((com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Loading;
                        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState unlinkAccountUiState2 = (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle.getValue();
                        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error error = !(unlinkAccountUiState2 instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error) ? (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error) unlinkAccountUiState2 : null;
                        java.lang.String message = error == null ? error.getMessage() : null;
                        z2 = i7 == 4;
                        rememberedValue2 = composer3.rememberedValue();
                        if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$FiF8rSCC5ikHTumopWgtEnDHqyI(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        changedInstance = composer3.changedInstance(unlinkAccountViewModel4);
                        rememberedValue3 = composer3.rememberedValue();
                        if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$VfTHjjj_rM26epuj87Qkhk_3sbU(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        changedInstance2 = composer3.changedInstance(unlinkAccountViewModel4);
                        rememberedValue4 = composer3.rememberedValue();
                        if (!changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.m15013$r8$lambda$6TiUu4zyktEAIdx8cR_JGZZ4vo(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel6 = unlinkAccountViewModel4;
                        UnlinkAccountContent(userAccount, function0, function02, modifier4, z3, message, (kotlin.jvm.functions.Function0) rememberedValue4, composer3, (i4 >> 6) & 7168, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        unlinkAccountViewModel3 = unlinkAccountViewModel6;
                        modifier3 = modifier4;
                        composer2 = composer3;
                    } else {
                        i4 = i3;
                        modifier4 = companion;
                    }
                }
                unlinkAccountViewModel4 = unlinkAccountViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.Composer composer32 = startRestartGroup;
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(unlinkAccountViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState unlinkAccountUiState3 = (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle2.getValue();
                changed = composer32.changed(collectAsStateWithLifecycle2);
                int i72 = i4 & 14;
                if (i72 != 4) {
                }
                rememberedValue = composer32.rememberedValue();
                if (!(changed | z)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$UnlinkAccountScreen$1$1(appNavigator, collectAsStateWithLifecycle2, null);
                composer32.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unlinkAccountUiState3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer32, 0);
                com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount2 = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount(str, str2, str3, str4, false, false);
                boolean z32 = ((com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle2.getValue()) instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Loading;
                com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState unlinkAccountUiState22 = (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) collectAsStateWithLifecycle2.getValue();
                if (!(unlinkAccountUiState22 instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error)) {
                }
                if (error == null) {
                }
                if (i72 == 4) {
                }
                rememberedValue2 = composer32.rememberedValue();
                if (!z2) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$FiF8rSCC5ikHTumopWgtEnDHqyI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer32.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                changedInstance = composer32.changedInstance(unlinkAccountViewModel4);
                rememberedValue3 = composer32.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$VfTHjjj_rM26epuj87Qkhk_3sbU(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.this);
                    }
                };
                composer32.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue3;
                changedInstance2 = composer32.changedInstance(unlinkAccountViewModel4);
                rememberedValue4 = composer32.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.m15013$r8$lambda$6TiUu4zyktEAIdx8cR_JGZZ4vo(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.this);
                    }
                };
                composer32.updateRememberedValue(rememberedValue4);
                com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel62 = unlinkAccountViewModel4;
                UnlinkAccountContent(userAccount2, function03, function022, modifier4, z32, message, (kotlin.jvm.functions.Function0) rememberedValue4, composer32, (i4 >> 6) & 7168, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                unlinkAccountViewModel3 = unlinkAccountViewModel62;
                modifier3 = modifier4;
                composer2 = composer32;
            } else {
                androidx.compose.runtime.Composer composer4 = startRestartGroup;
                composer4.skipToGroupEnd();
                modifier3 = modifier2;
                unlinkAccountViewModel3 = unlinkAccountViewModel2;
                composer2 = composer4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.m15016$r8$lambda$HWhJhRhozno0g3FQzCcsC9C50(com.paypal.oslo.core.navigation.AppNavigator.this, str, str2, str3, str4, modifier3, unlinkAccountViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnlinkAccountContent(final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1176174329);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(userAccount) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function04 = function03;
                        i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            str2 = str;
                            modifier3 = modifier2;
                            function05 = function04;
                            z2 = z;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            boolean z3 = i4 != 0 ? false : z;
                            java.lang.String str3 = i5 != 0 ? null : str;
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function06 = function04;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1176174329, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountContent (UnlinkAccountScreen.kt:145)");
                            }
                            int i8 = i3;
                            androidx.compose.ui.Modifier modifier5 = modifier4;
                            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
                            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_back_button, startRestartGroup, 0), null, false, false, startRestartGroup, (i8 & 112) | 27654, 448);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                            if (str3 != null) {
                                composer2.startReplaceGroup(-1101866831);
                                f = 0.0f;
                                com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, str3, (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.Close, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function06, composer2, ((i8 >> 9) & 896) | 24630 | (i8 & 3670016), 40);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                f = 0.0f;
                                composer2.startReplaceGroup(-1101499729);
                                composer2.endReplaceGroup();
                            }
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_title, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer2, 432, 6, 1000);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_subtitle, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 432, 6, 1000);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), composer2, 0);
                            getHighResolutionOutputSizeshNQ4ISI(userAccount, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), composer2, (i8 & 14) | 48, 0);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_explanation, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 432, 6, 1000);
                            composer2.endNode();
                            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_button, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing24()), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, !z3, z3, composer2, ((i8 >> 6) & 14) | 1769472 | ((i8 << 12) & 234881024), 24);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z2 = z3;
                            str2 = str3;
                            function05 = function06;
                            modifier3 = modifier5;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$b1QTGzOmPhpW5pDsJuJOi5bqL2s(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount.this, function0, function02, modifier3, z2, str2, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function04 = function03;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function04 = function03;
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function04 = function03;
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function04 = function03;
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.AvatarSource.Image initials;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(566458710);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(userAccount) ? 4 : 2) | i;
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
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(566458710, i3, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AccountCard (UnlinkAccountScreen.kt:246)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                java.lang.String profilePicture = userAccount.getProfilePicture();
                if (profilePicture != null && profilePicture.length() != 0) {
                    startRestartGroup.startReplaceGroup(-1533553758);
                    com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(userAccount.getProfilePicture()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null);
                    startRestartGroup.endReplaceGroup();
                    initials = image;
                } else {
                    startRestartGroup.startReplaceGroup(-1533201226);
                    startRestartGroup.endReplaceGroup();
                    initials = new com.paypal.pds.components.AvatarSource.Initials(userAccount.getFullName());
                }
                com.paypal.pds.components.AvatarKt.Avatar(initials, null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 58);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String fullName = userAccount.getFullName();
                com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fullName, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, bodyLarge, startRestartGroup, 384, 6, 1002);
                if (userAccount.getEmailAddress().length() > 0) {
                    composer2.startReplaceGroup(-708556659);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(userAccount.getEmailAddress(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1002);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-708322702);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$efr8a3ahE8FW0mx9Lt1CiZ2X8mI(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$6TiUu4z-yktEAIdx8cR_JGZZ4vo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15013$r8$lambda$6TiUu4zyktEAIdx8cR_JGZZ4vo(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel) {
        unlinkAccountViewModel.resetState();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9uxMRezNb2Oz3Tsix0AE_r3UiGI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1939766164);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1939766164, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenLoadingPreview (UnlinkAccountScreen.kt:339)");
            }
            com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount("encrypted_party_id_123", "Max Gold Test SMB", "max.gold@paypal.com", null, true, true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda4
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            UnlinkAccountContent(userAccount, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, true, null, null, startRestartGroup, 25008, 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$9uxMRezNb2Oz3Tsix0AE_r3UiGI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FiF8rSCC5ikHTumopWgtEnDHqyI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$fdBXVfG_uo2x9vIqzo9MYcmSJhU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GNAXNCwNKtq5MnAu7VYJJeI5t7Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1543519149);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1543519149, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenWithImagePreview (UnlinkAccountScreen.kt:318)");
            }
            com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount("encrypted_party_id_456", "John Business", "john.business@example.com", "https://via.placeholder.com/150", true, true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda13
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            UnlinkAccountContent(userAccount, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, null, null, startRestartGroup, 432, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$GNAXNCwNKtq5MnAu7VYJJeI5t7Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HWhJhRhozno0g3FQzCcsC-9C5-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15016$r8$lambda$HWhJhRhozno0g3FQzCcsC9C50(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UnlinkAccountScreen(appNavigator, str, str2, str3, str4, modifier, unlinkAccountViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rj9B1x_8GSC-_8NDJtuzXMVfhbI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15017$r8$lambda$Rj9B1x_8GSC_8NDJtuzXMVfhbI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1289056224);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1289056224, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenErrorPreview (UnlinkAccountScreen.kt:361)");
            }
            com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount("encrypted_party_id_123", "Max Gold Test SMB", "max.gold@paypal.com", null, true, true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda20
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            UnlinkAccountContent(userAccount, function0, function02, null, false, "Check your network connection and try again.", (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 1769904, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.m15017$r8$lambda$Rj9B1x_8GSC_8NDJtuzXMVfhbI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VfTHjjj_rM26epuj87Qkhk_3sbU(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel) {
        unlinkAccountViewModel.unlinkAccount();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b1QTGzOmPhpW5pDsJuJOi5bqL2s(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UnlinkAccountContent(userAccount, function0, function02, modifier, z, str, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$efr8a3ahE8FW0mx9Lt1CiZ2X8mI(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(userAccount, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fdBXVfG_uo2x9vIqzo9MYcmSJhU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z1hwO5JvcIA9pdwsPsRhYwsEu7I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1386679192);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1386679192, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenPreview (UnlinkAccountScreen.kt:297)");
            }
            com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount = new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount("encrypted_party_id_123", "Judy Parker", "@judyparker", null, true, true);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda17
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            UnlinkAccountContent(userAccount, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, null, null, startRestartGroup, 432, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountScreenKt.$r8$lambda$z1hwO5JvcIA9pdwsPsRhYwsEu7I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState access$UnlinkAccountScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState) state.getValue();
    }
}
