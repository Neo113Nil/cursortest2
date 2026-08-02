package com.paypal.oslo.feature.identity.changepassword.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0099\u0001\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\f*\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0003¢\u0006\u0002\u0010\u001b\u001a\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 ¨\u0006\"²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"ChangePasswordScreen", "", "onPasswordChangeSuccess", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel;", "(Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel;Landroidx/compose/runtime/Composer;II)V", "ChangePasswordContent", "uiState", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ChangePasswordUiState;", "onCurrentPasswordChange", "Lkotlin/Function1;", "", "onNewPasswordChange", "onConfirmPasswordChange", "onChangePasswordClick", "onDismissError", "onNewPasswordFocusChange", "", "onConfirmPasswordFocusChange", "(Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ChangePasswordUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "toDisplayString", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;", "(Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "newPasswordValidationAlerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "confirmPasswordMatchAlert", "passwordsMatch", "(ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "ChangePasswordContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "ChangePasswordContentValidationPreview", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangePasswordScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangePasswordScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel3;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$1$1 rememberedValue;
        boolean changedInstance2;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$2$1 rememberedValue2;
        boolean changedInstance3;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$3$1 rememberedValue3;
        boolean changedInstance4;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$4$1 rememberedValue4;
        boolean changedInstance5;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$5$1 rememberedValue5;
        boolean changedInstance6;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$6$1 rememberedValue6;
        boolean changedInstance7;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$7$1 rememberedValue7;
        boolean changedInstance8;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$8$1 rememberedValue8;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1384378847);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                changePasswordViewModel2 = changePasswordViewModel;
                if (startRestartGroup.changedInstance(changePasswordViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                changePasswordViewModel2 = changePasswordViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            changePasswordViewModel2 = changePasswordViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
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
                i4 = i6 & (-113);
                changePasswordViewModel3 = (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1384378847, i4, -1, "com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreen (ChangePasswordScreen.kt:66)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(changePasswordViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(changePasswordViewModel3);
                z = (i4 & 14) == 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$1$1(changePasswordViewModel3, function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState = (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState) collectAsStateWithLifecycle.getValue();
                changedInstance2 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$2$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2);
                changedInstance3 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$3$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3);
                changedInstance4 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$4$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4);
                changedInstance5 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$5$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue5);
                changedInstance6 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$6$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6);
                changedInstance7 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$7$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                changedInstance8 = startRestartGroup.changedInstance(changePasswordViewModel3);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$8$1(changePasswordViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel4 = changePasswordViewModel3;
                ChangePasswordContent(changePasswordUiState, function1, function12, function13, function02, function03, function14, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8), startRestartGroup, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                changePasswordViewModel2 = changePasswordViewModel4;
            }
            i4 = i6;
            changePasswordViewModel3 = changePasswordViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(changePasswordViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(changePasswordViewModel3);
            if ((i4 & 14) == 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$1$1(changePasswordViewModel3, function0, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState2 = (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState) collectAsStateWithLifecycle2.getValue();
            changedInstance2 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$2$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2);
            changedInstance3 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$3$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3);
            changedInstance4 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue4 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$4$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function1 function132 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4);
            changedInstance5 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue5 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$5$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue5);
            changedInstance6 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            rememberedValue6 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$6$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6);
            changedInstance7 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance7) {
            }
            rememberedValue7 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$7$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue7);
            kotlin.jvm.functions.Function1 function142 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
            changedInstance8 = startRestartGroup.changedInstance(changePasswordViewModel3);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance8) {
            }
            rememberedValue8 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$ChangePasswordScreen$8$1(changePasswordViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel42 = changePasswordViewModel3;
            ChangePasswordContent(changePasswordUiState2, function15, function122, function132, function022, function032, function142, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changePasswordViewModel2 = changePasswordViewModel42;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15109$r8$lambda$3sCtikG87kDuVWP_stXTVNNL9k(kotlin.jvm.functions.Function0.this, changePasswordViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangePasswordContent(final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function16;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function18;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function19;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function110;
        java.lang.String stringResource;
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
        char c;
        char c2;
        androidx.compose.runtime.Composer composer3;
        java.util.List emptyList;
        java.util.List emptyList2;
        final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function111;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1952289568);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(changePasswordUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            function16 = function14;
            i3 |= startRestartGroup.changedInstance(function16) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function15) ? 8388608 : 4194304;
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function17 = function15;
                function18 = function16;
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit unit;
                                ((java.lang.Boolean) obj).booleanValue();
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function19 = function16;
                }
                if (i4 != 0) {
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit unit;
                                ((java.lang.Boolean) obj).booleanValue();
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                } else {
                    function110 = function15;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1952289568, i3, -1, "com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordContent (ChangePasswordScreen.kt:99)");
                }
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2 = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function112 = function19;
                int i6 = i3;
                kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function113 = function110;
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSafeDrawing(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
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
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
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
                com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage = changePasswordUiState.getErrorMessage();
                if (errorMessage == null) {
                    startRestartGroup.startReplaceGroup(-1887345765);
                    startRestartGroup.endReplaceGroup();
                    softwareKeyboardController = softwareKeyboardController2;
                    c2 = 3;
                    composer3 = startRestartGroup;
                    c = 2;
                } else {
                    startRestartGroup.startReplaceGroup(-1887345764);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1463244257, 0, -1, "com.paypal.oslo.feature.identity.changepassword.ui.toDisplayString (ChangePasswordScreen.kt:248)");
                    }
                    int i7 = com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.WhenMappings.$EnumSwitchMapping$0[errorMessage.ordinal()];
                    if (i7 == 1) {
                        startRestartGroup.startReplaceGroup(-1723420914);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_error_invalid_current, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (i7 == 2) {
                        startRestartGroup.startReplaceGroup(-1723416756);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_error_same_password, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            startRestartGroup.startReplaceGroup(-1723422989);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-1723412858);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_error_generic, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String str = stringResource;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$zvIw_AFu2oLLnc3uhMW05GKxoCk((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    softwareKeyboardController = softwareKeyboardController2;
                    c = 2;
                    c2 = 3;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), negative, str, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function02, startRestartGroup, ((i6 << 3) & 3670016) | 48, 56);
                    composer3 = startRestartGroup;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer3, 0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    composer3.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                if (changePasswordUiState.getShowSubmitError()) {
                    composer3.startReplaceGroup(-1886837240);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_password_error_fill_required, composer3, 0);
                    com.paypal.pds.components.BannerStyle.Negative negative2 = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$zE9jNjSYYpVOOmsrsdxOUXaL4IA((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    composer2 = composer3;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue4, 1, null), negative2, stringResource2, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, function02, composer3, ((i6 << 3) & 3670016) | 48, 56);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer3;
                    composer2.startReplaceGroup(-1886400946);
                    composer2.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_title, composer2, 0);
                com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$E49xUdJOhB3vvOCW9RPUn5IIDXw((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion3, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk), null, false, 0, 0, null, headingMedium, composer2, 384, 6, 1000);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_current_section, composer2, 0);
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                int m8448getStarte0LSkKk2 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue6 = composer2.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$xAEtfu_JWzgf1ugW9mf4VrAY0dQ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource4, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion4, false, (kotlin.jvm.functions.Function1) rememberedValue6, 1, null), contentBase2, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk2), null, false, 0, 0, null, bodyMedium, composer2, 384, 6, 1000);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                com.paypal.pds.components.PasswordInputKt.PasswordInput(changePasswordUiState.getCurrentPassword(), function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "CurrentPasswordInput"), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_current_label, composer2, 0), false, null, null, null, composer2, (i6 & 112) | 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_new_section, composer2, 0);
                com.paypal.pds.core.Typography.BodyMedium bodyMedium2 = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase3 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                int m8448getStarte0LSkKk3 = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue7 = composer2.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$UEny76YArLfwpnisZuLPYeG4U7I((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue7);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource5, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion5, false, (kotlin.jvm.functions.Function1) rememberedValue7, 1, null), contentBase3, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk3), null, false, 0, 0, null, bodyMedium2, composer2, 384, 6, 1000);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                java.lang.String newPassword = changePasswordUiState.getNewPassword();
                java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_new_label, composer2, 0);
                if (!changePasswordUiState.isNewPasswordFocused() || changePasswordUiState.getNewPassword().length() <= 0) {
                    composer2.startReplaceGroup(-1884282437);
                    composer2.endReplaceGroup();
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    composer2.startReplaceGroup(-1884356279);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1534381838, 0, -1, "com.paypal.oslo.feature.identity.changepassword.ui.newPasswordValidationAlerts (ChangePasswordScreen.kt:260)");
                    }
                    final java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_alert_length, composer2, 0);
                    final java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_alert_number, composer2, 0);
                    final java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_alert_special, composer2, 0);
                    final java.lang.String stringResource10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_alert_uppercase, composer2, 0);
                    final java.lang.String stringResource11 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_alert_lowercase, composer2, 0);
                    com.paypal.pds.components.textinput.ValidationAlert[] validationAlertArr = new com.paypal.pds.components.textinput.ValidationAlert[5];
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion6 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed = composer2.changed(stringResource7);
                    java.lang.Object rememberedValue8 = composer2.rememberedValue();
                    if (changed || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$wVKS9DjTWJpze4ZDqaQajvR1XxA(stringResource7, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    validationAlertArr[0] = companion6.invoke((kotlin.jvm.functions.Function1) rememberedValue8);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion7 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed2 = composer2.changed(stringResource8);
                    java.lang.Object rememberedValue9 = composer2.rememberedValue();
                    if (changed2 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15112$r8$lambda$wuuZpRshQSFAxSz5WF1tTJw1WM(stringResource8, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    validationAlertArr[1] = companion7.invoke((kotlin.jvm.functions.Function1) rememberedValue9);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion8 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed3 = composer2.changed(stringResource9);
                    java.lang.Object rememberedValue10 = composer2.rememberedValue();
                    if (changed3 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$7N659Hoomri7KDQdJ2rGdKvdRAg(stringResource9, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    validationAlertArr[c] = companion8.invoke((kotlin.jvm.functions.Function1) rememberedValue10);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion9 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed4 = composer2.changed(stringResource10);
                    java.lang.Object rememberedValue11 = composer2.rememberedValue();
                    if (changed4 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15108$r8$lambda$2fUlaZ271_RkwbsOEHsVJSumQ(stringResource10, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    validationAlertArr[c2] = companion9.invoke((kotlin.jvm.functions.Function1) rememberedValue11);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion10 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed5 = composer2.changed(stringResource11);
                    java.lang.Object rememberedValue12 = composer2.rememberedValue();
                    if (changed5 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15114$r8$lambda$xJJa0W3cDiw__k3xL3_dgrpZoM(stringResource11, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    validationAlertArr[4] = companion10.invoke((kotlin.jvm.functions.Function1) rememberedValue12);
                    emptyList = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) validationAlertArr);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                }
                java.util.List list = emptyList;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "NewPasswordInput");
                boolean z = (i6 & 3670016) == 1048576;
                java.lang.Object rememberedValue13 = composer2.rememberedValue();
                if (z || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$Vxg_UwlashyQNVFXSF3pAgfHVOg(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.focus.FocusState) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue13);
                }
                com.paypal.pds.components.PasswordInputKt.PasswordInput(newPassword, function12, androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(testTag, (kotlin.jvm.functions.Function1) rememberedValue13), stringResource6, false, list, null, null, composer2, (i6 >> 3) & 112, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                java.lang.String confirmPassword = changePasswordUiState.getConfirmPassword();
                java.lang.String stringResource12 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_confirm_label, composer2, 0);
                if (!changePasswordUiState.isConfirmPasswordFocused() || changePasswordUiState.getPasswordsMatch() == null) {
                    composer2.startReplaceGroup(-1883507685);
                    composer2.endReplaceGroup();
                    emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    composer2.startReplaceGroup(-1883600747);
                    final boolean booleanValue = changePasswordUiState.getPasswordsMatch().booleanValue();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-204407623, 0, -1, "com.paypal.oslo.feature.identity.changepassword.ui.confirmPasswordMatchAlert (ChangePasswordScreen.kt:322)");
                    }
                    final java.lang.String stringResource13 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_password_match, composer2, 0);
                    final java.lang.String stringResource14 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_password_match_alert, composer2, 0);
                    com.paypal.pds.components.textinput.ValidationAlert.Companion companion11 = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                    boolean changed6 = composer2.changed(booleanValue);
                    boolean changed7 = composer2.changed(stringResource13);
                    boolean changed8 = composer2.changed(stringResource14);
                    java.lang.Object rememberedValue14 = composer2.rememberedValue();
                    if ((changed6 | changed7 | changed8) || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$NHrRjqORVjTMvS56Iejx4INNIxQ(booleanValue, stringResource13, stringResource14, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    emptyList2 = kotlin.collections.CollectionsKt.listOf(companion11.invoke((kotlin.jvm.functions.Function1) rememberedValue14));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                }
                java.util.List list2 = emptyList2;
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "ConfirmPasswordInput");
                boolean z2 = (i6 & 29360128) == 8388608;
                java.lang.Object rememberedValue15 = composer2.rememberedValue();
                if (z2 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    function111 = function113;
                    rememberedValue15 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$8LYUp7EHyT7wy4ru6NnQUCQj1aU(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.focus.FocusState) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue15);
                } else {
                    function111 = function113;
                }
                kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function114 = function111;
                com.paypal.pds.components.PasswordInputKt.PasswordInput(confirmPassword, function13, androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(testTag2, (kotlin.jvm.functions.Function1) rememberedValue15), stringResource12, false, list2, null, null, composer2, (i6 >> 6) & 112, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                composer2.endNode();
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing24());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1707paddingVpY3zN4);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController;
                boolean changed9 = composer2.changed(softwareKeyboardController3);
                boolean z3 = (i6 & 57344) == 16384;
                java.lang.Object rememberedValue16 = composer2.rememberedValue();
                if ((changed9 | z3) || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$QA4kPyquklX8Xl0G_CWUTErmVUM(androidx.compose.ui.platform.SoftwareKeyboardController.this, function0);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue16);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue16, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_change_password_button, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, !changePasswordUiState.isLoading(), changePasswordUiState.isLoading(), composer2, 196992, 88);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function18 = function112;
                function17 = function114;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$utLUVHmh4NNl0XJyNGOUBseOwfo(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.this, function1, function12, function13, function0, function02, function18, function17, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function16 = function14;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$2fUla-Z271-_RkwbsOEHsVJSumQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m15108$r8$lambda$2fUlaZ271_RkwbsOEHsVJSumQ(java.lang.String str, java.lang.String str2) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str2;
        int i = 0;
        while (true) {
            if (i >= str3.length()) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
                break;
            }
            if (java.lang.Character.isUpperCase(str3.charAt(i))) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                break;
            }
            i++;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, neutral, false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$3sCtikG87kDuVW-P_stXTVNNL9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15109$r8$lambda$3sCtikG87kDuVWP_stXTVNNL9k(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChangePasswordScreen(function0, changePasswordViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4cblQTV98R_uSG1A7pJdnQGf7Wg(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4fBW7qzfw3Bmfqlw1kbwSioBAl4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$69-K5z4IXg1gg32usCes1darutg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15110$r8$lambda$69K5z4IXg1gg32usCes1darutg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(808979466);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(808979466, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordContentValidationPreview (ChangePasswordScreen.kt:372)");
            }
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState("oldPassword1!", "NewPass1!", "NewPass1!", false, null, null, false, false, false, 504, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15111$r8$lambda$6eutQl1unqbeoJGRcQd18FDiTU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$GjW1BACXiP58w9G51ScCNXoTexI((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$4fBW7qzfw3Bmfqlw1kbwSioBAl4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ChangePasswordContent(changePasswordUiState, function1, function12, function13, function0, (kotlin.jvm.functions.Function0) rememberedValue5, null, null, startRestartGroup, 224688, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.m15110$r8$lambda$69K5z4IXg1gg32usCes1darutg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6eutQl1unqb-eoJGRcQd18FDiTU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15111$r8$lambda$6eutQl1unqbeoJGRcQd18FDiTU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6pr82wB_526_2qjNYRphTr603jM(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$7N659Hoomri7KDQdJ2rGdKvdRAg(java.lang.String str, java.lang.String str2) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str2;
        int i = 0;
        while (true) {
            if (i >= str3.length()) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
                break;
            }
            if (!java.lang.Character.isLetterOrDigit(str3.charAt(i))) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                break;
            }
            i++;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, neutral, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8LYUp7EHyT7wy4ru6NnQUCQj1aU(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        function1.invoke(java.lang.Boolean.valueOf(focusState.isFocused()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Beq3cn6fgrFBCEVCU3UkIH2dKJ8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1227925891);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1227925891, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordContentPreview (ChangePasswordScreen.kt:353)");
            }
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState(null, null, null, false, null, null, false, false, false, 511, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$4cblQTV98R_uSG1A7pJdnQGf7Wg((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$sbPTJiSF0ZWoYrA9yNKz88xnXH0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$6pr82wB_526_2qjNYRphTr603jM((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ChangePasswordContent(changePasswordUiState, function1, function12, function13, function0, (kotlin.jvm.functions.Function0) rememberedValue5, null, null, startRestartGroup, 224688, 192);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordScreenKt.$r8$lambda$Beq3cn6fgrFBCEVCU3UkIH2dKJ8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E49xUdJOhB3vvOCW9RPUn5IIDXw(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GjW1BACXiP58w9G51ScCNXoTexI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$NHrRjqORVjTMvS56Iejx4INNIxQ(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(!z ? str2 : str, z ? com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QA4kPyquklX8Xl0G_CWUTErmVUM(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.jvm.functions.Function0 function0) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UEny76YArLfwpnisZuLPYeG4U7I(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vxg_UwlashyQNVFXSF3pAgfHVOg(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        function1.invoke(java.lang.Boolean.valueOf(focusState.isFocused()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sbPTJiSF0ZWoYrA9yNKz88xnXH0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$utLUVHmh4NNl0XJyNGOUBseOwfo(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChangePasswordContent(changePasswordUiState, function1, function12, function13, function0, function02, function14, function15, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$wVKS9DjTWJpze4ZDqaQajvR1XxA(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, str2.length() >= 8 ? com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE : com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, false, null, null, 28, null);
    }

    /* renamed from: $r8$lambda$wuuZpRshQSFAx-Sz5WF1tTJw1WM, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m15112$r8$lambda$wuuZpRshQSFAxSz5WF1tTJw1WM(java.lang.String str, java.lang.String str2) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str2;
        int i = 0;
        while (true) {
            if (i >= str3.length()) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
                break;
            }
            if (java.lang.Character.isDigit(str3.charAt(i))) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                break;
            }
            i++;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, neutral, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xAEtfu_JWzgf1ugW9mf4VrAY0dQ(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xJJa0W3cDiw__k-3xL3_dgrpZoM, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m15114$r8$lambda$xJJa0W3cDiw__k3xL3_dgrpZoM(java.lang.String str, java.lang.String str2) {
        com.paypal.pds.components.ContextualAlertStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str2;
        int i = 0;
        while (true) {
            if (i >= str3.length()) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
                break;
            }
            if (java.lang.Character.isLowerCase(str3.charAt(i))) {
                neutral = com.paypal.pds.components.ContextualAlertStyle.Positive.INSTANCE;
                break;
            }
            i++;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, neutral, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zE9jNjSYYpVOOmsrsdxOUXaL4IA(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7790getAssertive0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zvIw_AFu2oLLnc3uhMW05GKxoCk(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7814setLiveRegionhR3wRGc(semanticsPropertyReceiver, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7790getAssertive0phEisY());
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.INVALID_CURRENT_PASSWORD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.SAME_PASSWORD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.GENERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
