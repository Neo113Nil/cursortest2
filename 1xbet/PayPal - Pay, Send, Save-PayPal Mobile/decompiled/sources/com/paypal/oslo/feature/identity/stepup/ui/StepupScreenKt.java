package com.paypal.oslo.feature.identity.stepup.ui;

@kotlin.Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0000\u001a>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u0002\u001a6\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u0002\u001a6\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\tH\u0002\u001aQ\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, d2 = {"SampleMaskedPhoneNumber", "", "createPreviewChallengeData", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "id", "type", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "phoneNumber", "getPreviewChallenges", "", "navigateToChallengeVerification", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "requestId", "challengeData", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.KEY_CHALLENGE_CONTEXT, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", "isFromStepup", "", "availableChallenges", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "handleAutoRedirectNavigation", "handleManualSelectNavigation", "StepupScreen", "challengeResult", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "modifier", "Landroidx/compose/ui/Modifier;", "exhaustedChallengeType", "validationError", "Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;", "viewModel", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Lcom/paypal/oslo/feature/identity/stepup/navigation/StepupValidationError;Lcom/paypal/oslo/feature/identity/stepup/ui/StepupViewModel;Landroidx/compose/runtime/Composer;II)V", "StepupScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/stepup/ui/StepupUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepupScreenKt {
    public static final java.lang.String SampleMaskedPhoneNumber = "(2••) •••-0418";

    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData createPreviewChallengeData$default(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return createPreviewChallengeData(str, challengeType, str2);
    }

    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData createPreviewChallengeData(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, java.lang.String str2) {
        java.util.List list;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge smsChallenge;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        if (com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.WhenMappings.$EnumSwitchMapping$0[challengeType.ordinal()] == 1) {
            smsChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge(str, challengeType, true, "sample_nonce", "sample_partial_token");
        } else {
            if (str2 != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("_phone");
                list = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber(sb.toString(), str2, false, false, false, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            } else {
                list = null;
            }
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            smsChallenge = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SmsChallenge(str, challengeType, true, list, "sample_nonce", "sample_partial_token");
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData(smsChallenge, false, (java.util.Map) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> getPreviewChallenges() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData[]{createPreviewChallengeData("sms_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS, SampleMaskedPhoneNumber), createPreviewChallengeData$default("email_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL, null, 4, null), createPreviewChallengeData$default("whatsapp_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP, null, 4, null), createPreviewChallengeData("ivr_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR, SampleMaskedPhoneNumber), createPreviewChallengeData$default("authenticator_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP, null, 4, null), createPreviewChallengeData$default("security_1", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION, null, 4, null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, final boolean z, final java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list) {
        switch (com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.WhenMappings.$EnumSwitchMapping$0[challengeData.getSelectedChallenge().getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15364$r8$lambda$9F75vIb7o1VnPDvHMEQmi3SUqU(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData.this, str, challengeContext, list, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            case 6:
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15366$r8$lambda$h3YeAGdXYIQYxv0ghqQT_7PtPk(str, challengeData, challengeContext, list, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            case 7:
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$J0dmFCFEkYTt22_rKnEIf2P9708(str, challengeData, challengeContext, list, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            case 8:
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$B8ucJsj3ewNJmW1_p2pEV_8cpSQ(str, challengeData, challengeContext, list, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            case 9:
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge selectedChallenge = challengeData.getSelectedChallenge();
                final com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge = selectedChallenge instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge ? (com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge) selectedChallenge : null;
                if (webViewChallenge != null) {
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$3UZOUzk1dJfxXDVs3rjYlzAdwrg(str, webViewChallenge, challengeContext, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                        }
                    });
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x043c  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StepupScreen(final java.lang.String str, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError, com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError2;
        final com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2;
        final androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError3;
        final com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3;
        int i6;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType4;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        int i7;
        boolean z;
        boolean z2;
        boolean changedInstance2;
        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1 rememberedValue2;
        boolean changed;
        boolean z3;
        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$3$1 rememberedValue3;
        kotlin.Unit unit;
        boolean changedInstance3;
        boolean z4;
        int i8;
        boolean z5;
        boolean changedInstance4;
        com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1 rememberedValue4;
        kotlin.Unit unit2;
        ?? r8;
        com.paypal.oslo.feature.identity.stepup.ui.StepupUiState stepupUiState;
        final com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel4;
        androidx.compose.ui.Modifier modifier5;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1728861128);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(challengeResult) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(challengeType == null ? -1 : challengeType.ordinal()) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                stepupValidationError2 = stepupValidationError;
                i3 |= startRestartGroup.changed(stepupValidationError2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        stepupViewModel2 = stepupViewModel;
                        if (startRestartGroup.changedInstance(stepupViewModel2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        stepupViewModel2 = stepupViewModel;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    stepupViewModel2 = stepupViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        challengeType3 = challengeType;
                        stepupValidationError3 = stepupValidationError2;
                        i6 = -1;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        challengeType3 = i4 != 0 ? null : challengeType;
                        stepupValidationError3 = i5 != 0 ? null : stepupValidationError2;
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
                            i6 = -1;
                            i3 &= -3670017;
                            modifier4 = companion;
                            challengeType4 = challengeType3;
                            stepupViewModel2 = (com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            int i11 = i3;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1728861128, i11, i6, "com.paypal.oslo.feature.identity.stepup.ui.StepupScreen (StepupScreen.kt:246)");
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit3;
                                        unit3 = kotlin.Unit.INSTANCE;
                                        return unit3;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48, 1);
                            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(stepupViewModel2.getUiState(), null, startRestartGroup, 0, 1);
                            changedInstance = startRestartGroup.changedInstance(challengeResult);
                            i7 = i11 & 896;
                            z = i7 != 256;
                            int i12 = i11 & 14;
                            z2 = i12 != 4;
                            changedInstance2 = startRestartGroup.changedInstance(stepupViewModel2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if ((!(changedInstance | z | z2) && !changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                composer2 = startRestartGroup;
                                rememberedValue2 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1(challengeResult, appNavigator, str, stepupViewModel2, null);
                                composer2.updateRememberedValue(rememberedValue2);
                            } else {
                                composer2 = startRestartGroup;
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(challengeResult, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, (i11 >> 3) & 14);
                            com.paypal.oslo.feature.identity.stepup.ui.StepupUiState stepupUiState2 = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState) collectAsState.getValue();
                            changed = composer2.changed(collectAsState);
                            z3 = i7 != 256;
                            rememberedValue3 = composer2.rememberedValue();
                            if (!(changed | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$3$1(appNavigator, collectAsState, null);
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(stepupUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                            unit = kotlin.Unit.INSTANCE;
                            changedInstance3 = composer2.changedInstance(stepupViewModel2);
                            if (i7 != 256) {
                                i8 = 4;
                                z4 = true;
                            } else {
                                z4 = false;
                                i8 = 4;
                            }
                            z5 = i12 != i8;
                            changedInstance4 = composer2.changedInstance(challengeResult);
                            rememberedValue4 = composer2.rememberedValue();
                            if ((!(changedInstance3 | z4 | z5) && !changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                unit2 = unit;
                                r8 = 0;
                                rememberedValue4 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1(stepupViewModel2, appNavigator, str, challengeResult, null);
                                composer2.updateRememberedValue(rememberedValue4);
                            } else {
                                unit2 = unit;
                                r8 = 0;
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
                            stepupUiState = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState) collectAsState.getValue();
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(stepupUiState, com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing.INSTANCE)) {
                                composer2.startReplaceGroup(748971855);
                                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), composer2, r8);
                                composer2.endReplaceGroup();
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                stepupViewModel4 = stepupViewModel2;
                                modifier5 = modifier4;
                            } else if (stepupUiState instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection) {
                                composer2.startReplaceGroup(749266913);
                                com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection challengeSelection = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.ChallengeSelection) stepupUiState;
                                java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> challengeDataList = challengeSelection.getChallengeDataList();
                                boolean changedInstance5 = composer2.changedInstance(stepupViewModel2);
                                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15368$r8$lambda$s7HkDbH5YIBYRvffAyksgntFHI(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.this, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue5);
                                }
                                stepupViewModel4 = stepupViewModel2;
                                modifier5 = modifier4;
                                com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.StepupFullScreenContent(challengeDataList, (kotlin.jvm.functions.Function1) rememberedValue5, challengeType4, stepupValidationError3, composer2, (i11 >> 6) & 8064, 0);
                                com.paypal.oslo.feature.identity.stepup.ui.OptionSelectionState selectionState = challengeSelection.getSelectionState();
                                if (selectionState != null) {
                                    composer2.startReplaceGroup(749737493);
                                    java.util.List<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption> options = selectionState.getOptions();
                                    com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType = selectionState.getSelectionType();
                                    boolean changedInstance6 = composer2.changedInstance(stepupViewModel4);
                                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                                    if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$bZctRy7c5jX5S55ruHZbtpbe1I0(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.this, (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue6);
                                    }
                                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue6;
                                    boolean changedInstance7 = composer2.changedInstance(stepupViewModel4);
                                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                                    if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15369$r8$lambda$sKwLBF9f8tlTfibmjLq2Mgt8iI(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.this);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue7);
                                    }
                                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                                    boolean changedInstance8 = composer2.changedInstance(stepupViewModel4);
                                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                                    if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15365$r8$lambda$Uh9Hqeq_wfgVvuiSxBPO55NQOQ(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel.this);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue8);
                                    }
                                    com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.SelectionBottomSheetKt.SelectionBottomSheet(options, null, selectionType, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue8, false, composer2, 48, 64);
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    composer2.endReplaceGroup();
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                } else {
                                    composer2.startReplaceGroup(749737492);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            } else {
                                stepupViewModel4 = stepupViewModel2;
                                modifier5 = modifier4;
                                if (stepupUiState instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Processing) {
                                    composer2.startReplaceGroup(750429785);
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r8);
                                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r8));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer2, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                                    composer2.endNode();
                                    composer2.endReplaceGroup();
                                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                } else if (stepupUiState instanceof com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Error) {
                                    composer2.startReplaceGroup(750673011);
                                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), composer2, r8);
                                    composer2.endReplaceGroup();
                                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                } else {
                                    composer2.startReplaceGroup(716896683);
                                    composer2.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            stepupViewModel3 = stepupViewModel4;
                            modifier3 = modifier5;
                            challengeType2 = challengeType4;
                        } else {
                            i6 = -1;
                            modifier2 = companion;
                        }
                    }
                    challengeType4 = challengeType3;
                    modifier4 = modifier2;
                    int i112 = i3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(stepupViewModel2.getUiState(), null, startRestartGroup, 0, 1);
                    changedInstance = startRestartGroup.changedInstance(challengeResult);
                    i7 = i112 & 896;
                    if (i7 != 256) {
                    }
                    int i122 = i112 & 14;
                    if (i122 != 4) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(stepupViewModel2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z | z2 | changedInstance2)) {
                    }
                    composer2 = startRestartGroup;
                    rememberedValue2 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$2$1(challengeResult, appNavigator, str, stepupViewModel2, null);
                    composer2.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(challengeResult, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, (i112 >> 3) & 14);
                    com.paypal.oslo.feature.identity.stepup.ui.StepupUiState stepupUiState22 = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState) collectAsState2.getValue();
                    changed = composer2.changed(collectAsState2);
                    if (i7 != 256) {
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changed | z3)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$3$1(appNavigator, collectAsState2, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(stepupUiState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                    unit = kotlin.Unit.INSTANCE;
                    changedInstance3 = composer2.changedInstance(stepupViewModel2);
                    if (i7 != 256) {
                    }
                    if (i122 != i8) {
                    }
                    changedInstance4 = composer2.changedInstance(challengeResult);
                    rememberedValue4 = composer2.rememberedValue();
                    if (!(changedInstance3 | z4 | z5 | changedInstance4)) {
                    }
                    unit2 = unit;
                    r8 = 0;
                    rememberedValue4 = new com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$StepupScreen$4$1(stepupViewModel2, appNavigator, str, challengeResult, null);
                    composer2.updateRememberedValue(rememberedValue4);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
                    stepupUiState = (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState) collectAsState2.getValue();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(stepupUiState, com.paypal.oslo.feature.identity.stepup.ui.StepupUiState.Initializing.INSTANCE)) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    stepupViewModel3 = stepupViewModel4;
                    modifier3 = modifier5;
                    challengeType2 = challengeType4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    challengeType2 = challengeType;
                    modifier3 = modifier2;
                    stepupValidationError3 = stepupValidationError2;
                    stepupViewModel3 = stepupViewModel2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError4 = stepupValidationError3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$qV1ykJxdoYllGHKw68SHZdyPzGI(str, challengeResult, appNavigator, modifier3, challengeType2, stepupValidationError4, stepupViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            stepupValidationError2 = stepupValidationError;
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
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
        if (i5 == 0) {
        }
        stepupValidationError2 = stepupValidationError;
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3UZOUzk1dJfxXDVs3rjYlzAdwrg(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.WebViewChallenge webViewChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupwebview.navigation.StepupWebViewDestination(str, webViewChallenge, challengeContext));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9F75-vIb7o1VnPDvHMEQmi3SUqU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15364$r8$lambda$9F75vIb7o1VnPDvHMEQmi3SUqU(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination(str, challengeData.getSelectedChallenge(), challengeContext, list, z, false, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B8ucJsj3ewNJmW1_p2pEV_8cpSQ(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupsna.navigation.StepupSnaDestination(str, challengeData.getSelectedChallenge(), challengeContext, list, z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J0dmFCFEkYTt22_rKnEIf2P9708(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.navigation.StepupCreditCardDestination(str, challengeData.getSelectedChallenge(), challengeContext, list, z, false, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OUReLj3aq2fsvqqowYoIJMmBQTA(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uh9Hqeq_-wfgVvuiSxBPO55NQOQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15365$r8$lambda$Uh9Hqeq_wfgVvuiSxBPO55NQOQ(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel) {
        stepupViewModel.onSelectionDismissed();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bZctRy7c5jX5S55ruHZbtpbe1I0(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionOption selectionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionOption, "");
        stepupViewModel.onOptionSelected(selectionOption.getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h3YeAGdXYIQYxv0ghqQT_7PtP-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15366$r8$lambda$h3YeAGdXYIQYxv0ghqQT_7PtPk(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination(str, challengeData.getSelectedChallenge(), challengeContext, list, z, false, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k7B3NwGtXd-25f6cIVvy9yoRLFE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15367$r8$lambda$k7B3NwGtXd25f6cIVvy9yoRLFE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1288952962);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1288952962, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.stepup.ui.StepupScreenPreview (StepupScreen.kt:374)");
            }
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> previewChallenges = getPreviewChallenges();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.$r8$lambda$OUReLj3aq2fsvqqowYoIJMmBQTA((com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.identity.stepup.ui.components.StepupFullScreenContentKt.StepupFullScreenContent(previewChallenges, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.stepup.ui.StepupScreenKt.m15367$r8$lambda$k7B3NwGtXd25f6cIVvy9yoRLFE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qV1ykJxdoYllGHKw68SHZdyPzGI(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError stepupValidationError, com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StepupScreen(str, challengeResult, appNavigator, modifier, challengeType, stepupValidationError, stepupViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s7H-kDbH5YIBYRvffAyksgntFHI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15368$r8$lambda$s7HkDbH5YIBYRvffAyksgntFHI(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
        stepupViewModel.onChallengeSelected(challengeData);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sKwLBF9f8-tlTfibmjLq2Mgt8iI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15369$r8$lambda$sKwLBF9f8tlTfibmjLq2Mgt8iI(com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel stepupViewModel) {
        stepupViewModel.onSelectionDismissed();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.stepup.ui.StepupUiState access$StepupScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.stepup.ui.StepupUiState) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SILENT_AUTH.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WEBVIEW.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
