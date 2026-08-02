package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u001aC\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aQ\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"PhoneConfirmationScreen", "", "onNavigateToOTPVerification", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/PhoneConfirmationViewModel;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/PhoneConfirmationViewModel;Landroidx/compose/runtime/Composer;II)V", "PhoneConfirmationContent", "uiState", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "maskedPhoneNumber", "", "onSendCodeClick", "onCancelClick", "onDismissError", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewMaskedPhone", "PreviewMaskedPhoneAlt", "PhoneConfirmationScreenInitialStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "PhoneConfirmationScreenLoadingPreview", "PhoneConfirmationScreenErrorPreview", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneConfirmationScreen(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        int i4;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel4;
        boolean changedInstance;
        boolean z2;
        boolean z3;
        boolean changedInstance2;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1 rememberedValue;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel5;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer composer3;
        boolean changedInstance3;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$2$1 rememberedValue2;
        boolean changedInstance4;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$3$1 rememberedValue3;
        boolean changedInstance5;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$4$1 rememberedValue4;
        boolean changed;
        java.lang.Object rememberedValue5;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(490403517);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    phoneConfirmationViewModel2 = phoneConfirmationViewModel;
                    if (startRestartGroup.changedInstance(phoneConfirmationViewModel2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    phoneConfirmationViewModel2 = phoneConfirmationViewModel;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                phoneConfirmationViewModel2 = phoneConfirmationViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                } else {
                    companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
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
                        i4 = i3 & (-7169);
                        phoneConfirmationViewModel4 = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(490403517, i4, -1, "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreen (PhoneConfirmationScreen.kt:79)");
                        }
                        int i7 = i4;
                        final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneConfirmationViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(phoneConfirmationViewModel4);
                        z2 = (i7 & 14) != 4 ? true : z;
                        z3 = (i7 & 112) != 32 ? z : true;
                        changedInstance2 = startRestartGroup.changedInstance(context);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if ((!(changedInstance | z2 | z3) && !changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            phoneConfirmationViewModel5 = phoneConfirmationViewModel4;
                            modifier4 = companion;
                            composer3 = startRestartGroup;
                            rememberedValue = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1(phoneConfirmationViewModel4, function1, function0, context, null);
                            composer3.updateRememberedValue(rememberedValue);
                        } else {
                            phoneConfirmationViewModel5 = phoneConfirmationViewModel4;
                            modifier4 = companion;
                            composer3 = startRestartGroup;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
                        com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState phoneConfirmationUiState = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState) collectAsStateWithLifecycle.getValue();
                        java.lang.String maskedPhoneNumber = phoneConfirmationViewModel5.getMaskedPhoneNumber();
                        changedInstance3 = composer3.changedInstance(phoneConfirmationViewModel5);
                        rememberedValue2 = composer3.rememberedValue();
                        if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$2$1(phoneConfirmationViewModel5);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
                        changedInstance4 = composer3.changedInstance(phoneConfirmationViewModel5);
                        rememberedValue3 = composer3.rememberedValue();
                        if (!changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$3$1(phoneConfirmationViewModel5);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3);
                        changedInstance5 = composer3.changedInstance(phoneConfirmationViewModel5);
                        rememberedValue4 = composer3.rememberedValue();
                        if (!changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$4$1(phoneConfirmationViewModel5);
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue4);
                        changed = composer3.changed(collectAsStateWithLifecycle);
                        rememberedValue5 = composer3.rememberedValue();
                        if (!changed || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$sPJPQs0A7J_cbq73R1_oG2vbaxc(androidx.compose.runtime.State.this));
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        composer2 = composer3;
                        modifier3 = modifier4;
                        com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel6 = phoneConfirmationViewModel5;
                        PhoneConfirmationContent(phoneConfirmationUiState, maskedPhoneNumber, function02, function03, function04, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(modifier4, (kotlin.jvm.functions.Function0) rememberedValue5, composer3, (i7 >> 6) & 14), composer2, 0, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        phoneConfirmationViewModel3 = phoneConfirmationViewModel6;
                    }
                }
                z = false;
                i4 = i3;
                phoneConfirmationViewModel4 = phoneConfirmationViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i72 = i4;
                final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneConfirmationViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(phoneConfirmationViewModel4);
                if ((i72 & 14) != 4) {
                }
                if ((i72 & 112) != 32) {
                }
                changedInstance2 = startRestartGroup.changedInstance(context2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2 | z3 | changedInstance2)) {
                }
                phoneConfirmationViewModel5 = phoneConfirmationViewModel4;
                modifier4 = companion;
                composer3 = startRestartGroup;
                rememberedValue = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$1$1(phoneConfirmationViewModel4, function1, function0, context2, null);
                composer3.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState phoneConfirmationUiState2 = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState) collectAsStateWithLifecycle2.getValue();
                java.lang.String maskedPhoneNumber2 = phoneConfirmationViewModel5.getMaskedPhoneNumber();
                changedInstance3 = composer3.changedInstance(phoneConfirmationViewModel5);
                rememberedValue2 = composer3.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$2$1(phoneConfirmationViewModel5);
                composer3.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
                changedInstance4 = composer3.changedInstance(phoneConfirmationViewModel5);
                rememberedValue3 = composer3.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$3$1(phoneConfirmationViewModel5);
                composer3.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3);
                changedInstance5 = composer3.changedInstance(phoneConfirmationViewModel5);
                rememberedValue4 = composer3.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue4 = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$PhoneConfirmationScreen$4$1(phoneConfirmationViewModel5);
                composer3.updateRememberedValue(rememberedValue4);
                kotlin.jvm.functions.Function0 function042 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue4);
                changed = composer3.changed(collectAsStateWithLifecycle2);
                rememberedValue5 = composer3.rememberedValue();
                if (!changed) {
                }
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$sPJPQs0A7J_cbq73R1_oG2vbaxc(androidx.compose.runtime.State.this));
                    }
                };
                composer3.updateRememberedValue(rememberedValue5);
                composer2 = composer3;
                modifier3 = modifier4;
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel62 = phoneConfirmationViewModel5;
                PhoneConfirmationContent(phoneConfirmationUiState2, maskedPhoneNumber2, function022, function032, function042, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(modifier4, (kotlin.jvm.functions.Function0) rememberedValue5, composer3, (i72 >> 6) & 14), composer2, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                phoneConfirmationViewModel3 = phoneConfirmationViewModel62;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                phoneConfirmationViewModel3 = phoneConfirmationViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$WlfVm4zBUt4xp4TwqGe3dJREMfs(kotlin.jvm.functions.Function1.this, function0, modifier3, phoneConfirmationViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneConfirmationContent(final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState phoneConfirmationUiState, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1359046149);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(phoneConfirmationUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1359046149, i4, -1, "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationContent (PhoneConfirmationScreen.kt:122)");
                }
                boolean z = phoneConfirmationUiState instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading;
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error error = phoneConfirmationUiState instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error ? (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error) phoneConfirmationUiState : null;
                java.lang.String errorMessage = error != null ? error.getErrorMessage() : null;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
                com.paypal.pds.components.IconSize.Medium medium = com.paypal.pds.components.IconSize.Medium.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                boolean z2 = (i4 & 7168) == 2048;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.m15316$r8$lambda$90xBD5sGkkvlJUnaPfQsslS18Y(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconKt.Icon(arrowLeft, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_button", 0, 2, null)), medium, null, startRestartGroup, 3126, 16);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Confirm your primary mobile number", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 54, 6, 1020);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("We'll send a code to ");
                sb.append(str);
                sb.append(".");
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 432, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                boolean z3 = !z;
                com.paypal.pds.components.ButtonKt.Button(function0, "Continue", com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("send_code_button", 0, 2, null)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z3, false, startRestartGroup, ((i4 >> 6) & 14) | 1769520, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function02, "Update number", com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("update_number_button", 0, 2, null)), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z3, false, startRestartGroup, ((i4 >> 9) & 14) | 1769520, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                composer2.endNode();
                if (errorMessage != null) {
                    composer2.startReplaceGroup(1041994986);
                    obj = null;
                    com.paypal.pds.components.BannerKt.Banner(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss_error", 0, 2, null)), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, "Error", errorMessage, com.paypal.pds.components.BannerTrailingElement.Close, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function03, composer2, (3670016 & (i4 << 6)) | 25008, 32);
                    composer2.endReplaceGroup();
                } else {
                    obj = null;
                    composer2.startReplaceGroup(1042428707);
                    composer2.endReplaceGroup();
                }
                if (z) {
                    composer2.startReplaceGroup(1042486770);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, composer2, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1042687619);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$XuE6C_gn9t1oWqierL403YzsEeI(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.this, str, function0, function02, function03, modifier2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-90xBD5sGkkvlJUnaPfQsslS18Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15316$r8$lambda$90xBD5sGkkvlJUnaPfQsslS18Y(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$17jAXp2ESxTXo66CWOwcFzqGI9E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-740142274);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-740142274, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenErrorPreview (PhoneConfirmationScreen.kt:263)");
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error error = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error("This phone number is temporarily blocked");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda12
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda13
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PhoneConfirmationContent(error, "(3**) ***-1234", function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 28080, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$17jAXp2ESxTXo66CWOwcFzqGI9E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FYTmRgDqH8RXGJUgR72pjjpjMm4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(263857482);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(263857482, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenLoadingPreview (PhoneConfirmationScreen.kt:249)");
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading loading = com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda8
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda9
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PhoneConfirmationContent(loading, "(3**) ***-1234", function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$FYTmRgDqH8RXGJUgR72pjjpjMm4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WlfVm4zBUt4xp4TwqGe3dJREMfs(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel phoneConfirmationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PhoneConfirmationScreen(function1, function0, modifier, phoneConfirmationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XuE6C_gn9t1oWqierL403YzsEeI(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState phoneConfirmationUiState, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PhoneConfirmationContent(phoneConfirmationUiState, str, function0, function02, function03, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cecGUX9sbChaziX073pQno7BsYw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(856749143);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(856749143, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenInitialStatePreview (PhoneConfirmationScreen.kt:235)");
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial initial = com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda3
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda4
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PhoneConfirmationContent(initial, "(5**) ***-2416", function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationScreenKt.$r8$lambda$cecGUX9sbChaziX073pQno7BsYw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$sPJPQs0A7J_cbq73R1_oG2vbaxc(androidx.compose.runtime.State state) {
        return !(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState) state.getValue()) instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading);
    }
}
