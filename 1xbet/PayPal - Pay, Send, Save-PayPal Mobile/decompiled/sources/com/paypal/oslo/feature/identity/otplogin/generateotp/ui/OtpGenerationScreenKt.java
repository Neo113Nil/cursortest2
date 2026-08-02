package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001ai\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0016\u001a7\u0010\u0017\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002"}, d2 = {"OtpGenerationScreen", "", "publicCredential", "", "adsChallengeId", "nonce", "phoneNumbers", "", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/PhoneChallengeInfo;", "onChangeUser", "Lkotlin/Function0;", "onNavigateToVerifyOTP", "viewModel", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationViewModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationViewModel;Landroidx/compose/runtime/Composer;II)V", "OtpGenerationContent", "onPhoneSelect", "Lkotlin/Function1;", "isLoading", "", "onGenerateOTP", "onTryAnotherWay", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PhoneSelection", "dropdownState", "Lcom/paypal/pds/components/DropdownState;", "(Ljava/util/List;Lcom/paypal/pds/components/DropdownState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OtpGenerationContentSinglePhonePreview", "(Landroidx/compose/runtime/Composer;I)V", "OtpGenerationContentMultiplePhonesPreview", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "selectedPhone"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpGenerationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OtpGenerationScreen(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer composer3;
        final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel4;
        int i4;
        androidx.compose.runtime.Composer composer4;
        boolean z;
        boolean changed;
        boolean z2;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        boolean changedInstance2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i6;
        com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel5;
        boolean z6;
        java.lang.Object rememberedValue4;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1959492627);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                otpGenerationViewModel2 = otpGenerationViewModel;
                if (startRestartGroup.changedInstance(otpGenerationViewModel2)) {
                    i7 = 1048576;
                    i3 |= i7;
                }
            } else {
                otpGenerationViewModel2 = otpGenerationViewModel;
            }
            i7 = 524288;
            i3 |= i7;
        } else {
            otpGenerationViewModel2 = otpGenerationViewModel;
        }
        int i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 599187) != 599186, i8 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 64) != 0) {
                    composer3 = startRestartGroup;
                    i4 = i8 & (-3670017);
                    otpGenerationViewModel4 = otpGenerationViewModel2;
                    composer3.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    composer4 = composer3;
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(otpGenerationViewModel4.getState(), null, composer4, 0, 1);
                    z = ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading;
                    com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState otpGenerationUiState = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState.getValue();
                    changed = composer4.changed(collectAsState);
                    if ((i4 & 458752) == 131072) {
                    }
                    rememberedValue = composer4.rememberedValue();
                    if (!(z2 | changed)) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$OtpGenerationScreen$1$1(function02, collectAsState, null);
                    composer4.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(otpGenerationUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer4, 0);
                    changedInstance = composer4.changedInstance(otpGenerationViewModel4);
                    rememberedValue2 = composer4.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$pcUv6oCfqtBvbmQSJ_SPUftjShA(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) obj);
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue2);
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    changedInstance2 = composer4.changedInstance(otpGenerationViewModel4);
                    i5 = i4 & 14;
                    if (i5 == 4) {
                    }
                    if ((i4 & 896) == 256) {
                    }
                    if ((i4 & 112) == 32) {
                    }
                    changedInstance3 = composer4.changedInstance(list);
                    rememberedValue3 = composer4.rememberedValue();
                    if (!(z4 | changedInstance2 | z3 | z5 | changedInstance3)) {
                    }
                    final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel6 = otpGenerationViewModel4;
                    i6 = i5;
                    otpGenerationViewModel5 = otpGenerationViewModel4;
                    z6 = z;
                    java.lang.Object obj = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15216$r8$lambda$V4vlWLFyzx_XVPUnOU6Cd4rO_g(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, str, str3, str2, list);
                        }
                    };
                    composer4.updateRememberedValue(obj);
                    rememberedValue3 = obj;
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    rememberedValue4 = composer4.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    composer2 = composer4;
                    com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel7 = otpGenerationViewModel5;
                    OtpGenerationContent(str, list, function1, z6, function03, (kotlin.jvm.functions.Function0) rememberedValue4, function0, composer4, i6 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i4 >> 6) & 112) | (3670016 & (i4 << 6)));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    otpGenerationViewModel3 = otpGenerationViewModel7;
                }
            } else if ((i2 & 64) != 0) {
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
                composer3 = startRestartGroup;
                i8 &= -3670017;
                otpGenerationViewModel4 = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i8;
                composer3.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1959492627, i4, -1, "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreen (OtpGenerationScreen.kt:70)");
                }
                composer4 = composer3;
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(otpGenerationViewModel4.getState(), null, composer4, 0, 1);
                z = ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState2.getValue()) instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading;
                com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState otpGenerationUiState2 = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState2.getValue();
                changed = composer4.changed(collectAsState2);
                z2 = (i4 & 458752) == 131072;
                rememberedValue = composer4.rememberedValue();
                if (!(z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$OtpGenerationScreen$1$1(function02, collectAsState2, null);
                    composer4.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(otpGenerationUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer4, 0);
                changedInstance = composer4.changedInstance(otpGenerationViewModel4);
                rememberedValue2 = composer4.rememberedValue();
                if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$pcUv6oCfqtBvbmQSJ_SPUftjShA(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) obj2);
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance2 = composer4.changedInstance(otpGenerationViewModel4);
                i5 = i4 & 14;
                z3 = i5 == 4;
                z4 = (i4 & 896) == 256;
                z5 = (i4 & 112) == 32;
                changedInstance3 = composer4.changedInstance(list);
                rememberedValue3 = composer4.rememberedValue();
                if ((!(z4 | changedInstance2 | z3 | z5) && !changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel62 = otpGenerationViewModel4;
                    i6 = i5;
                    otpGenerationViewModel5 = otpGenerationViewModel4;
                    z6 = z;
                    java.lang.Object obj2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15216$r8$lambda$V4vlWLFyzx_XVPUnOU6Cd4rO_g(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, str, str3, str2, list);
                        }
                    };
                    composer4.updateRememberedValue(obj2);
                    rememberedValue3 = obj2;
                } else {
                    i6 = i5;
                    z6 = z;
                    otpGenerationViewModel5 = otpGenerationViewModel4;
                }
                kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue3;
                rememberedValue4 = composer4.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue4);
                }
                composer2 = composer4;
                com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel72 = otpGenerationViewModel5;
                OtpGenerationContent(str, list, function12, z6, function032, (kotlin.jvm.functions.Function0) rememberedValue4, function0, composer4, i6 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i4 >> 6) & 112) | (3670016 & (i4 << 6)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                otpGenerationViewModel3 = otpGenerationViewModel72;
            }
            composer3 = startRestartGroup;
            otpGenerationViewModel4 = otpGenerationViewModel2;
            i4 = i8;
            composer3.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer4 = composer3;
            androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(otpGenerationViewModel4.getState(), null, composer4, 0, 1);
            z = ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState22.getValue()) instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading;
            com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState otpGenerationUiState22 = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) collectAsState22.getValue();
            changed = composer4.changed(collectAsState22);
            if ((i4 & 458752) == 131072) {
            }
            rememberedValue = composer4.rememberedValue();
            if (!(z2 | changed)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$OtpGenerationScreen$1$1(function02, collectAsState22, null);
            composer4.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(otpGenerationUiState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer4, 0);
            changedInstance = composer4.changedInstance(otpGenerationViewModel4);
            rememberedValue2 = composer4.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj22) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$pcUv6oCfqtBvbmQSJ_SPUftjShA(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) obj22);
                }
            };
            composer4.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue2;
            changedInstance2 = composer4.changedInstance(otpGenerationViewModel4);
            i5 = i4 & 14;
            if (i5 == 4) {
            }
            if ((i4 & 896) == 256) {
            }
            if ((i4 & 112) == 32) {
            }
            changedInstance3 = composer4.changedInstance(list);
            rememberedValue3 = composer4.rememberedValue();
            if (!(z4 | changedInstance2 | z3 | z5 | changedInstance3)) {
            }
            final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel622 = otpGenerationViewModel4;
            i6 = i5;
            otpGenerationViewModel5 = otpGenerationViewModel4;
            z6 = z;
            java.lang.Object obj22 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15216$r8$lambda$V4vlWLFyzx_XVPUnOU6Cd4rO_g(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.this, str, str3, str2, list);
                }
            };
            composer4.updateRememberedValue(obj22);
            rememberedValue3 = obj22;
            kotlin.jvm.functions.Function0 function0322 = (kotlin.jvm.functions.Function0) rememberedValue3;
            rememberedValue4 = composer4.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            composer2 = composer4;
            com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel722 = otpGenerationViewModel5;
            OtpGenerationContent(str, list, function122, z6, function0322, (kotlin.jvm.functions.Function0) rememberedValue4, function0, composer4, i6 | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i4 >> 6) & 112) | (3670016 & (i4 << 6)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            otpGenerationViewModel3 = otpGenerationViewModel722;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            otpGenerationViewModel3 = otpGenerationViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$S_o2vlSC4fChIg2Cl8CzpnUTAJ8(str, str2, str3, list, function0, function02, otpGenerationViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final void OtpGenerationContent(final java.lang.String str, final java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo, kotlin.Unit> function1, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(648069228);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(648069228, i3, -1, "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationContent (OtpGenerationScreen.kt:113)");
            }
            com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundStatesLightPressed.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleLarge.INSTANCE, startRestartGroup, i3 & 14, 6, 1020);
            composer2 = startRestartGroup;
            int i4 = i3 >> 12;
            com.paypal.pds.components.LinkKt.Link(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_link_text, composer2, 0), boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), function03, null, composer2, i4 & 896, 8);
            composer2.endNode();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.User.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_login_paypal_logo_label, composer2, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), null, com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, composer2, 24582, 8);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_login_with_a_one_time_code, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer2, 48, 6, 1004);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), composer2, 0);
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
            int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_a_code_will_be_sent_to, composer2, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 0, 6, 1006);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize4()), composer2, 0);
            getHighSpeedVideoFpsRangesFor(list, rememberDropdownState, function1, composer2, (com.paypal.pds.components.DropdownState.$stable << 3) | ((i3 >> 3) & 14) | (i3 & 896));
            composer2.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), composer2, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_authorization_and_fee_text, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize40()), composer2, 0);
            boolean z2 = !z;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_get_a_code, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, z2, false, composer2, (i4 & 14) | 196992, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_try_another_way, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, z2, false, composer2, ((i3 >> 15) & 14) | 196992, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
            composer2.endNode();
            composer2.endNode();
            com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, composer2, com.paypal.pds.components.DropdownState.$stable);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$LLQrViEGgADVvPGZBaTgwfr0xcc(str, list, function1, z, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoFpsRangesFor(final java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        com.paypal.pds.components.MenuItem menuItem;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1934700571);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1934700571, i2, -1, "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.PhoneSelection (OtpGenerationScreen.kt:236)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            if (list.size() != 1) {
                startRestartGroup.startReplaceGroup(1796963102);
                java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo : list2) {
                    arrayList.add(new com.paypal.pds.components.MenuItem(null, phoneChallengeInfo.getPhoneNumber(), phoneChallengeInfo.getChallengeId(), null, null, 25, null));
                }
                java.util.ArrayList arrayList2 = arrayList;
                com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo2 = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) mutableState.getValue();
                if (phoneChallengeInfo2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj).getKey(), phoneChallengeInfo2.getChallengeId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    menuItem = (com.paypal.pds.components.MenuItem) obj;
                } else {
                    menuItem = null;
                }
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_select_phone_number, startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z = (i2 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15215$r8$lambda$NP454tHKUeUfmoxYCHQVkYl5_o(list, function1, mutableState, (com.paypal.pds.components.MenuItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15217$r8$lambda$qeM50S1rJjvbFV5Qdor57JNSNA((com.paypal.pds.components.MenuItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, menuItem, arrayList2, function12, (kotlin.jvm.functions.Function1) rememberedValue3, stringResource, false, null, null, null, null, false, composer2, com.paypal.pds.components.DropdownState.$stable | 24576 | ((i2 >> 3) & 14), 0, 4032);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1796741545);
                mutableState.setValue((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) kotlin.collections.CollectionsKt.first((java.util.List) list));
                com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo3 = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) mutableState.getValue();
                java.lang.String phoneNumber = phoneChallengeInfo3 != null ? phoneChallengeInfo3.getPhoneNumber() : null;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(phoneNumber == null ? "" : phoneNumber, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$DDIheTkNgYMEfIvMSafdvXKE62I(list, dropdownState, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-ZyI4DPFsJRye4Qk5NkFQIXbO0w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15211$r8$lambda$ZyI4DPFsJRye4Qk5NkFQIXbO0w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1760453196);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1760453196, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationContentSinglePhonePreview (OtpGenerationScreen.kt:291)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo("test", "(9XX) XXX-6934", false, 4, null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15212$r8$lambda$8Ccz7mRJbEN0xSv52iHDQ9ICaM((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            OtpGenerationContent("test@paypal.com", listOf, function1, false, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 1797510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.m15211$r8$lambda$ZyI4DPFsJRye4Qk5NkFQIXbO0w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8C-cz7mRJbEN0xSv52iHDQ9ICaM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15212$r8$lambda$8Ccz7mRJbEN0xSv52iHDQ9ICaM(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallengeInfo, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DDIheTkNgYMEfIvMSafdvXKE62I(java.util.List list, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(list, dropdownState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LLQrViEGgADVvPGZBaTgwfr0xcc(java.lang.String str, java.util.List list, kotlin.jvm.functions.Function1 function1, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        OtpGenerationContent(str, list, function1, z, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mvpp5ewcn34HF02j4cGiMpE8q80(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallengeInfo, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NP454tHKUe-UfmoxYCHQVkYl5_o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15215$r8$lambda$NP454tHKUeUfmoxYCHQVkYl5_o(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(phoneChallengeInfo.getChallengeId(), menuItem.getKey())) {
                mutableState.setValue(phoneChallengeInfo);
                function1.invoke(phoneChallengeInfo);
                return kotlin.Unit.INSTANCE;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OSgRvofxTtQ7_TgYmsYQwSqleRI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1747357245);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1747357245, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationContentMultiplePhonesPreview (OtpGenerationScreen.kt:316)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo[]{new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo("phone1", "(9XX) XXX-6934", false, 4, null), new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo("phone2", "(8XX) XXX-5432", false, 4, null), new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo("phone3", "(7XX) XXX-9876", false, 4, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$Mvpp5ewcn34HF02j4cGiMpE8q80((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            OtpGenerationContent("test@paypal.com", listOf, function1, false, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 1797510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationScreenKt.$r8$lambda$OSgRvofxTtQ7_TgYmsYQwSqleRI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S_o2vlSC4fChIg2Cl8CzpnUTAJ8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OtpGenerationScreen(str, str2, str3, list, function0, function02, otpGenerationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V4vlWLFyzx_-XVPUnOU6Cd4rO_g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15216$r8$lambda$V4vlWLFyzx_XVPUnOU6Cd4rO_g(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        otpGenerationViewModel.generateOTP(str, str2, str3, list);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pcUv6oCfqtBvbmQSJ_SPUftjShA(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneChallengeInfo, "");
        otpGenerationViewModel.selectPhone(phoneChallengeInfo);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qeM50-S1rJjvbFV5Qdor57JNSNA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15217$r8$lambda$qeM50S1rJjvbFV5Qdor57JNSNA(com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState access$OtpGenerationScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState) state.getValue();
    }
}
