package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aY\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\u0010!\u001a#\u0010\"\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010'\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010(\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010)\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"RememberedLoginScreen", "", "requestId", "", "loginFlowController", "Lcom/paypal/oslo/feature/identity/logincontroller/domain/LoginFlowController;", "viewModel", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/logincontroller/domain/LoginFlowController;Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginViewModel;Landroidx/compose/runtime/Composer;II)V", "RememberedLoginScreenContent", "uiState", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "biometricState", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "passkeyState", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "onLoginClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;Lcom/paypal/oslo/feature/identity/passkey/login/auth/ui/PasskeyLoginState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeaderSection", "(Landroidx/compose/runtime/Composer;I)V", "UserInfoSection", "displayName", "email", "avatarUrl", "onChangeUser", "isLoading", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ActionButtonSection", "onPrimaryAction", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RememberedLoginInitialPreview", "RememberedLoginLoadingPreview", "RememberedLoginUserDataLoadedPreview", "RememberedLoginErrorPreview", "DemoRequestId", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RememberedLoginScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0137 A[EDGE_INSN: B:142:0x0137->B:141:0x0137 BREAK  A[LOOP:0: B:134:0x0121->B:138:0x012d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RememberedLoginScreen(final java.lang.String str, final com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel3;
        java.lang.Object obj;
        androidx.compose.runtime.State collectAsState;
        androidx.compose.runtime.State collectAsState2;
        android.content.Context context;
        boolean changed;
        java.lang.Object rememberedValue;
        android.content.Context context2;
        androidx.fragment.app.FragmentActivity fragmentActivity;
        kotlin.Unit unit;
        boolean changedInstance;
        int i6;
        int i7;
        int i8;
        boolean changed2;
        boolean changedInstance2;
        boolean changedInstance3;
        java.lang.Object rememberedValue2;
        int i9;
        kotlin.Unit unit2;
        androidx.fragment.app.FragmentActivity fragmentActivity2;
        android.content.Context context3;
        androidx.compose.runtime.State state;
        androidx.compose.runtime.State state2;
        boolean changed3;
        java.lang.Object rememberedValue3;
        boolean changed4;
        androidx.fragment.app.FragmentActivity fragmentActivity3;
        boolean changedInstance4;
        boolean changed5;
        boolean changedInstance5;
        java.lang.Object rememberedValue4;
        androidx.fragment.app.FragmentActivity fragmentActivity4;
        com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState;
        boolean changed6;
        boolean changedInstance6;
        int i10;
        boolean z;
        androidx.compose.runtime.State state3;
        boolean z2;
        boolean changed7;
        boolean changedInstance7;
        java.lang.Object rememberedValue5;
        androidx.compose.runtime.State state4;
        int i11;
        androidx.compose.runtime.State state5;
        com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState2;
        boolean changed8;
        boolean changedInstance8;
        boolean z3;
        boolean z4;
        java.lang.Object rememberedValue6;
        boolean changedInstance9;
        java.lang.Object rememberedValue7;
        boolean changedInstance10;
        java.lang.Object rememberedValue8;
        boolean changed9;
        java.lang.Object rememberedValue9;
        int i12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1760373667);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(loginFlowController) : startRestartGroup.changedInstance(loginFlowController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                rememberedLoginViewModel2 = rememberedLoginViewModel;
                if (startRestartGroup.changedInstance(rememberedLoginViewModel2)) {
                    i12 = 256;
                    i3 |= i12;
                }
            } else {
                rememberedLoginViewModel2 = rememberedLoginViewModel;
            }
            i12 = 128;
            i3 |= i12;
        } else {
            rememberedLoginViewModel2 = rememberedLoginViewModel;
        }
        int i13 = i3;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
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
                    i4 = 1;
                    i5 = i13 & (-897);
                    rememberedLoginViewModel3 = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1760373667, i5, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreen (RememberedLoginScreen.kt:104)");
                    }
                    obj = null;
                    final androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getUiState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getBiometricLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getPasskeyLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    changed = startRestartGroup.changed(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        context2 = context;
                        while (true) {
                            if (!(context2 instanceof android.content.ContextWrapper)) {
                                break;
                            }
                            if (context2 instanceof androidx.fragment.app.FragmentActivity) {
                                obj = (androidx.fragment.app.FragmentActivity) context2;
                                break;
                            } else {
                                android.content.Context baseContext = ((android.content.ContextWrapper) context2).getBaseContext();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baseContext, "");
                                context2 = baseContext;
                            }
                        }
                        startRestartGroup.updateRememberedValue(obj);
                        rememberedValue = obj;
                    }
                    fragmentActivity = (androidx.fragment.app.FragmentActivity) rememberedValue;
                    unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    i6 = i5 & 112;
                    i7 = (i6 != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(loginFlowController))) ? i4 : 0;
                    int i14 = i5 & 14;
                    i8 = i14 != 4 ? 1 : 0;
                    changed2 = startRestartGroup.changed(collectAsState2);
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    changedInstance3 = startRestartGroup.changedInstance(fragmentActivity);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | i8 | (changed2 ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changedInstance3 ? 1 : 0)) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i9 = i6;
                        unit2 = unit;
                        fragmentActivity2 = fragmentActivity;
                        context3 = context;
                        state = collectAsState2;
                        state2 = collectAsState;
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1(rememberedLoginViewModel3, loginFlowController, str, context, fragmentActivity2, collectAsState2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    } else {
                        i9 = i6;
                        fragmentActivity2 = fragmentActivity;
                        context3 = context;
                        state = collectAsState2;
                        state2 = collectAsState;
                        unit2 = unit;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    changed3 = startRestartGroup.changed((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3.getValue());
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3.getValue()) instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    boolean booleanValue = ((java.lang.Boolean) rememberedValue3).booleanValue();
                    changed4 = startRestartGroup.changed(booleanValue);
                    fragmentActivity3 = fragmentActivity2;
                    changedInstance4 = startRestartGroup.changedInstance(fragmentActivity3);
                    changed5 = startRestartGroup.changed(state2);
                    changedInstance5 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((!(changed4 | changedInstance4 | changed5) && !changedInstance5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        fragmentActivity4 = fragmentActivity3;
                        rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$2$1(booleanValue, fragmentActivity3, rememberedLoginViewModel3, state2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        fragmentActivity4 = fragmentActivity3;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), fragmentActivity4, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 0);
                    biometricLoginUiState = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state2.getValue();
                    changed6 = startRestartGroup.changed(state2);
                    changedInstance6 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    i10 = i9;
                    z = i10 != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(loginFlowController));
                    state3 = state;
                    z2 = i14 != 4;
                    changed7 = startRestartGroup.changed(state3);
                    android.content.Context context4 = context3;
                    changedInstance7 = startRestartGroup.changedInstance(context4);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((!(changed6 | changedInstance6 | z | z2 | changed7) && !changedInstance7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        state4 = state3;
                        androidx.compose.runtime.State state6 = state2;
                        i11 = i10;
                        state5 = state2;
                        biometricLoginUiState2 = biometricLoginUiState;
                        rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1(rememberedLoginViewModel3, loginFlowController, str, context4, state6, state4, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        state4 = state3;
                        i11 = i10;
                        state5 = state2;
                        biometricLoginUiState2 = biometricLoginUiState;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(biometricLoginUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state4.getValue();
                    androidx.compose.runtime.State state7 = state4;
                    changed8 = startRestartGroup.changed(state7);
                    changedInstance8 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    z3 = i11 != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(loginFlowController));
                    z4 = i14 != 4;
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!(changed8 | changedInstance8 | z3 | z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1(rememberedLoginViewModel3, loginFlowController, str, state7, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(passkeyLoginState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                    com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3.getValue();
                    com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState3 = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state5.getValue();
                    com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState2 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state7.getValue();
                    changedInstance9 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance9 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$5$1(rememberedLoginViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                    changedInstance10 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance10 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15325$r8$lambda$rZ7oUpFFigNXldRtK_fPIPmQQ(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    changed9 = startRestartGroup.changed(collectAsState3);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changed9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$NIJ95osJ6dRzMj70GmDKbwrl12Y(androidx.compose.runtime.State.this));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    RememberedLoginScreenContent(rememberedLoginUiState, biometricLoginUiState3, passkeyLoginState2, str, function1, function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 6), startRestartGroup, (i5 << 9) & 7168, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    rememberedLoginViewModel2 = rememberedLoginViewModel3;
                }
                i4 = 1;
                i5 = i13;
                rememberedLoginViewModel3 = rememberedLoginViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                obj = null;
                final androidx.compose.runtime.State collectAsState32 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getUiState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getBiometricLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getPasskeyLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                context2 = context;
                while (true) {
                    if (!(context2 instanceof android.content.ContextWrapper)) {
                    }
                    android.content.Context baseContext2 = ((android.content.ContextWrapper) context2).getBaseContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baseContext2, "");
                    context2 = baseContext2;
                }
                startRestartGroup.updateRememberedValue(obj);
                rememberedValue = obj;
                fragmentActivity = (androidx.fragment.app.FragmentActivity) rememberedValue;
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                i6 = i5 & 112;
                if (i6 != 32) {
                }
                int i142 = i5 & 14;
                if (i142 != 4) {
                }
                changed2 = startRestartGroup.changed(collectAsState2);
                changedInstance2 = startRestartGroup.changedInstance(context);
                changedInstance3 = startRestartGroup.changedInstance(fragmentActivity);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | i8 | (changed2 ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changedInstance3 ? 1 : 0)) == 0) {
                }
                i9 = i6;
                unit2 = unit;
                fragmentActivity2 = fragmentActivity;
                context3 = context;
                state = collectAsState2;
                state2 = collectAsState;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1(rememberedLoginViewModel3, loginFlowController, str, context, fragmentActivity2, collectAsState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                changed3 = startRestartGroup.changed((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState32.getValue());
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState32.getValue()) instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                boolean booleanValue2 = ((java.lang.Boolean) rememberedValue3).booleanValue();
                changed4 = startRestartGroup.changed(booleanValue2);
                fragmentActivity3 = fragmentActivity2;
                changedInstance4 = startRestartGroup.changedInstance(fragmentActivity3);
                changed5 = startRestartGroup.changed(state2);
                changedInstance5 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(changed4 | changedInstance4 | changed5 | changedInstance5)) {
                }
                fragmentActivity4 = fragmentActivity3;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$2$1(booleanValue2, fragmentActivity3, rememberedLoginViewModel3, state2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), fragmentActivity4, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 0);
                biometricLoginUiState = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state2.getValue();
                changed6 = startRestartGroup.changed(state2);
                changedInstance6 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                i10 = i9;
                if (i10 != 32) {
                }
                state3 = state;
                if (i142 != 4) {
                }
                changed7 = startRestartGroup.changed(state3);
                android.content.Context context42 = context3;
                changedInstance7 = startRestartGroup.changedInstance(context42);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changed6 | changedInstance6 | z | z2 | changed7 | changedInstance7)) {
                }
                state4 = state3;
                androidx.compose.runtime.State state62 = state2;
                i11 = i10;
                state5 = state2;
                biometricLoginUiState2 = biometricLoginUiState;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1(rememberedLoginViewModel3, loginFlowController, str, context42, state62, state4, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(biometricLoginUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState3 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state4.getValue();
                androidx.compose.runtime.State state72 = state4;
                changed8 = startRestartGroup.changed(state72);
                changedInstance8 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                if (i11 != 32) {
                }
                if (i142 != 4) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!(changed8 | changedInstance8 | z3 | z4)) {
                }
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1(rememberedLoginViewModel3, loginFlowController, str, state72, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(passkeyLoginState3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState2 = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState32.getValue();
                com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState32 = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state5.getValue();
                com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState22 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state72.getValue();
                changedInstance9 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance9) {
                }
                rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$5$1(rememberedLoginViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue7);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                changedInstance10 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance10) {
                }
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15325$r8$lambda$rZ7oUpFFigNXldRtK_fPIPmQQ(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                changed9 = startRestartGroup.changed(collectAsState32);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed9) {
                }
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$NIJ95osJ6dRzMj70GmDKbwrl12Y(androidx.compose.runtime.State.this));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
                RememberedLoginScreenContent(rememberedLoginUiState2, biometricLoginUiState32, passkeyLoginState22, str, function12, function02, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion2, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 6), startRestartGroup, (i5 << 9) & 7168, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedLoginViewModel2 = rememberedLoginViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i5 = i13 & (-897);
                    rememberedLoginViewModel3 = rememberedLoginViewModel2;
                    i4 = 1;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    obj = null;
                    final androidx.compose.runtime.State collectAsState322 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getUiState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getBiometricLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getPasskeyLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                    context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    changed = startRestartGroup.changed(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    context2 = context;
                    while (true) {
                        if (!(context2 instanceof android.content.ContextWrapper)) {
                        }
                        android.content.Context baseContext22 = ((android.content.ContextWrapper) context2).getBaseContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baseContext22, "");
                        context2 = baseContext22;
                    }
                    startRestartGroup.updateRememberedValue(obj);
                    rememberedValue = obj;
                    fragmentActivity = (androidx.fragment.app.FragmentActivity) rememberedValue;
                    unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    i6 = i5 & 112;
                    if (i6 != 32) {
                    }
                    int i1422 = i5 & 14;
                    if (i1422 != 4) {
                    }
                    changed2 = startRestartGroup.changed(collectAsState2);
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    changedInstance3 = startRestartGroup.changedInstance(fragmentActivity);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | i8 | (changed2 ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changedInstance3 ? 1 : 0)) == 0) {
                    }
                    i9 = i6;
                    unit2 = unit;
                    fragmentActivity2 = fragmentActivity;
                    context3 = context;
                    state = collectAsState2;
                    state2 = collectAsState;
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1(rememberedLoginViewModel3, loginFlowController, str, context, fragmentActivity2, collectAsState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    changed3 = startRestartGroup.changed((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState322.getValue());
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState322.getValue()) instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    boolean booleanValue22 = ((java.lang.Boolean) rememberedValue3).booleanValue();
                    changed4 = startRestartGroup.changed(booleanValue22);
                    fragmentActivity3 = fragmentActivity2;
                    changedInstance4 = startRestartGroup.changedInstance(fragmentActivity3);
                    changed5 = startRestartGroup.changed(state2);
                    changedInstance5 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!(changed4 | changedInstance4 | changed5 | changedInstance5)) {
                    }
                    fragmentActivity4 = fragmentActivity3;
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$2$1(booleanValue22, fragmentActivity3, rememberedLoginViewModel3, state2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue22), fragmentActivity4, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 0);
                    biometricLoginUiState = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state2.getValue();
                    changed6 = startRestartGroup.changed(state2);
                    changedInstance6 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    i10 = i9;
                    if (i10 != 32) {
                    }
                    state3 = state;
                    if (i1422 != 4) {
                    }
                    changed7 = startRestartGroup.changed(state3);
                    android.content.Context context422 = context3;
                    changedInstance7 = startRestartGroup.changedInstance(context422);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!(changed6 | changedInstance6 | z | z2 | changed7 | changedInstance7)) {
                    }
                    state4 = state3;
                    androidx.compose.runtime.State state622 = state2;
                    i11 = i10;
                    state5 = state2;
                    biometricLoginUiState2 = biometricLoginUiState;
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1(rememberedLoginViewModel3, loginFlowController, str, context422, state622, state4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(biometricLoginUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState32 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state4.getValue();
                    androidx.compose.runtime.State state722 = state4;
                    changed8 = startRestartGroup.changed(state722);
                    changedInstance8 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    if (i11 != 32) {
                    }
                    if (i1422 != 4) {
                    }
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!(changed8 | changedInstance8 | z3 | z4)) {
                    }
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1(rememberedLoginViewModel3, loginFlowController, str, state722, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(passkeyLoginState32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                    com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState22 = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState322.getValue();
                    com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState322 = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state5.getValue();
                    com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState222 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state722.getValue();
                    changedInstance9 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance9) {
                    }
                    rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$5$1(rememberedLoginViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                    changedInstance10 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance10) {
                    }
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15325$r8$lambda$rZ7oUpFFigNXldRtK_fPIPmQQ(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
                    changed9 = startRestartGroup.changed(collectAsState322);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changed9) {
                    }
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$NIJ95osJ6dRzMj70GmDKbwrl12Y(androidx.compose.runtime.State.this));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                    RememberedLoginScreenContent(rememberedLoginUiState22, biometricLoginUiState322, passkeyLoginState222, str, function122, function022, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion22, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 6), startRestartGroup, (i5 << 9) & 7168, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    rememberedLoginViewModel2 = rememberedLoginViewModel3;
                }
                i4 = 1;
                i5 = i13;
                rememberedLoginViewModel3 = rememberedLoginViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                obj = null;
                final androidx.compose.runtime.State collectAsState3222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getUiState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getBiometricLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberedLoginViewModel3.getPasskeyLoginState$identity_prodRelease(), null, startRestartGroup, 0, i4);
                context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                context2 = context;
                while (true) {
                    if (!(context2 instanceof android.content.ContextWrapper)) {
                    }
                    android.content.Context baseContext222 = ((android.content.ContextWrapper) context2).getBaseContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(baseContext222, "");
                    context2 = baseContext222;
                }
                startRestartGroup.updateRememberedValue(obj);
                rememberedValue = obj;
                fragmentActivity = (androidx.fragment.app.FragmentActivity) rememberedValue;
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                i6 = i5 & 112;
                if (i6 != 32) {
                }
                int i14222 = i5 & 14;
                if (i14222 != 4) {
                }
                changed2 = startRestartGroup.changed(collectAsState2);
                changedInstance2 = startRestartGroup.changedInstance(context);
                changedInstance3 = startRestartGroup.changedInstance(fragmentActivity);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | i8 | (changed2 ? 1 : 0) | (changedInstance2 ? 1 : 0) | (changedInstance3 ? 1 : 0)) == 0) {
                }
                i9 = i6;
                unit2 = unit;
                fragmentActivity2 = fragmentActivity;
                context3 = context;
                state = collectAsState2;
                state2 = collectAsState;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$1$1(rememberedLoginViewModel3, loginFlowController, str, context, fragmentActivity2, collectAsState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                changed3 = startRestartGroup.changed((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3222.getValue());
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = java.lang.Boolean.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3222.getValue()) instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                boolean booleanValue222 = ((java.lang.Boolean) rememberedValue3).booleanValue();
                changed4 = startRestartGroup.changed(booleanValue222);
                fragmentActivity3 = fragmentActivity2;
                changedInstance4 = startRestartGroup.changedInstance(fragmentActivity3);
                changed5 = startRestartGroup.changed(state2);
                changedInstance5 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(changed4 | changedInstance4 | changed5 | changedInstance5)) {
                }
                fragmentActivity4 = fragmentActivity3;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$2$1(booleanValue222, fragmentActivity3, rememberedLoginViewModel3, state2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue222), fragmentActivity4, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 0);
                biometricLoginUiState = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state2.getValue();
                changed6 = startRestartGroup.changed(state2);
                changedInstance6 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                i10 = i9;
                if (i10 != 32) {
                }
                state3 = state;
                if (i14222 != 4) {
                }
                changed7 = startRestartGroup.changed(state3);
                android.content.Context context4222 = context3;
                changedInstance7 = startRestartGroup.changedInstance(context4222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changed6 | changedInstance6 | z | z2 | changed7 | changedInstance7)) {
                }
                state4 = state3;
                androidx.compose.runtime.State state6222 = state2;
                i11 = i10;
                state5 = state2;
                biometricLoginUiState2 = biometricLoginUiState;
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1(rememberedLoginViewModel3, loginFlowController, str, context4222, state6222, state4, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(biometricLoginUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState322 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state4.getValue();
                androidx.compose.runtime.State state7222 = state4;
                changed8 = startRestartGroup.changed(state7222);
                changedInstance8 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                if (i11 != 32) {
                }
                if (i14222 != 4) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!(changed8 | changedInstance8 | z3 | z4)) {
                }
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1(rememberedLoginViewModel3, loginFlowController, str, state7222, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(passkeyLoginState322, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState222 = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) collectAsState3222.getValue();
                com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState3222 = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state5.getValue();
                com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState2222 = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state7222.getValue();
                changedInstance9 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance9) {
                }
                rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$5$1(rememberedLoginViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue7);
                kotlin.jvm.functions.Function1 function1222 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                changedInstance10 = startRestartGroup.changedInstance(rememberedLoginViewModel3);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance10) {
                }
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15325$r8$lambda$rZ7oUpFFigNXldRtK_fPIPmQQ(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                kotlin.jvm.functions.Function0 function0222 = (kotlin.jvm.functions.Function0) rememberedValue8;
                androidx.compose.ui.Modifier.Companion companion222 = androidx.compose.ui.Modifier.INSTANCE;
                changed9 = startRestartGroup.changed(collectAsState3222);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed9) {
                }
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$NIJ95osJ6dRzMj70GmDKbwrl12Y(androidx.compose.runtime.State.this));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
                RememberedLoginScreenContent(rememberedLoginUiState222, biometricLoginUiState3222, passkeyLoginState2222, str, function1222, function0222, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion222, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 6), startRestartGroup, (i5 << 9) & 7168, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                rememberedLoginViewModel2 = rememberedLoginViewModel3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$59ExNGjnPPpIJzKjBaQpY3TL8Ww(str, loginFlowController, rememberedLoginViewModel2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RememberedLoginScreenContent(final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState, final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState, final com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricLoginUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-965785840);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(rememberedLoginUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(biometricLoginUiState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(passkeyLoginState) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            i4 = i3;
            if (startRestartGroup.shouldExecute((598163 & i4) == 598162, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-965785840, i4, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenContent (RememberedLoginScreen.kt:320)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 54, 0);
                if (rememberedLoginUiState instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded) {
                    startRestartGroup.startReplaceGroup(261153376);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
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
                    modifier3 = modifier4;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing64()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    if (biometricLoginUiState instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error) {
                        startRestartGroup.startReplaceGroup(657210453);
                        com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error) biometricLoginUiState).getMessageResId(), startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.None, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 24624, 105);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(657586204);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (passkeyLoginState instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error) {
                        startRestartGroup.startReplaceGroup(657754999);
                        com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error) passkeyLoginState).getMessageResId(), startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.None, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 24624, 105);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(658128828);
                        startRestartGroup.endReplaceGroup();
                    }
                    HeaderSection(startRestartGroup, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), startRestartGroup, 0);
                    com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded userDataLoaded = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded) rememberedLoginUiState;
                    java.lang.String displayName = userDataLoaded.getDisplayName();
                    java.lang.String publicCredential = userDataLoaded.getPublicCredential();
                    java.lang.String avatarUrl = userDataLoaded.getAvatarUrl();
                    boolean z2 = (i4 & 57344) == 16384;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$AKkmFMtgNdVZAdlGJUlMGeX0ZEY(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    UserInfoSection(displayName, publicCredential, avatarUrl, (kotlin.jvm.functions.Function0) rememberedValue2, false, startRestartGroup, 24576);
                    if (userDataLoaded.isPasskeyPromptShown()) {
                        startRestartGroup.startReplaceGroup(658834016);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.pds.components.LoaderSize.Medium medium = com.paypal.pds.components.LoaderSize.Medium.INSTANCE;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15327$r8$lambda$zvRFtoEPxobDEgApqW5aK2rO4((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        z = true;
                        com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), medium, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Medium.$stable << 3, 12);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        z = true;
                        startRestartGroup.startReplaceGroup(659475964);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                    ActionButtonSection(((passkeyLoginState instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Loading) || userDataLoaded.isVerifyingCredentials()) ? z : false, function0, startRestartGroup, (i4 >> 12) & 112);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if ((biometricLoginUiState instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading) || (biometricLoginUiState instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success)) {
                        startRestartGroup.startReplaceGroup(-1950638730);
                        com.paypal.oslo.feature.identity.shared.ui.FullScreenLoaderKt.FullScreenLoader(startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1950582992);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (rememberedLoginUiState instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading) {
                        startRestartGroup.startReplaceGroup(265025865);
                        androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor6);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_authenticating, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else if (rememberedLoginUiState instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error) {
                        startRestartGroup.startReplaceGroup(265925268);
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode7 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor7);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, maybeCachedBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl7, java.lang.Integer.valueOf(hashCode7), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier background3 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode8 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background3);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor8);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl8, java.lang.Integer.valueOf(hashCode8), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing64()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode9 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor9);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl9 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, columnMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, currentCompositionLocalMap9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl9, java.lang.Integer.valueOf(hashCode9), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, materializeModifier9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance5 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_error_message, startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.None, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 24624, 104);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance5, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                        boolean z3 = (i4 & 57344) == 16384;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15326$r8$lambda$xwcWk_WYQaP_6tMtBtEQkYqRkw(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        ActionButtonSection(false, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), startRestartGroup, 0);
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(267402325);
                        androidx.compose.ui.Modifier background4 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy5 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode10 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap10 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier10 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor10);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl10 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, maybeCachedBoxMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, currentCompositionLocalMap10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl10, java.lang.Integer.valueOf(hashCode10), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, materializeModifier10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance5 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("RememberedLogin - ".concat(java.lang.String.valueOf(rememberedLoginUiState.getName())), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$C8iR5wRksaQh8Qa9UPi2vhiJLJ8(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.this, biometricLoginUiState, passkeyLoginState, str, function1, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((598163 & i4) == 598162, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void HeaderSection(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1547015597);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1547015597, i, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.HeaderSection (RememberedLoginScreen.kt:502)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.identity.R.drawable.feature_identity_paypal_logo_custom, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_user_verification_logo_description, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48()), (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_welcome_back_without_name, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 384, 6, 1018);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$UW5fejQQXnT3vVsCTu_KsEYvpxg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UserInfoSection(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        com.paypal.pds.components.AvatarSource icon;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1332095698);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1332095698, i4, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.UserInfoSection (RememberedLoginScreen.kt:532)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_change_user_button, startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            if (str3 != null) {
                startRestartGroup.startReplaceGroup(-1592014896);
                i3 = i4;
                com.paypal.pds.components.AvatarSource image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str3, null, null, null, null, startRestartGroup, (i4 >> 6) & 14, 30), null, 2, null);
                startRestartGroup.endReplaceGroup();
                icon = image;
            } else {
                i3 = i4;
                startRestartGroup.startReplaceGroup(-1591914766);
                startRestartGroup.endReplaceGroup();
                icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Person.INSTANCE);
            }
            com.paypal.pds.components.AvatarSize.XLarge xLarge = com.paypal.pds.components.AvatarSize.XLarge.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$6aBs7kPLaNbKJqiaeVbqaI2WJfo((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.AvatarKt.Avatar(icon, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion, (kotlin.jvm.functions.Function1) rememberedValue), xLarge, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 56);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$IKZcP73Ah53pasPq9BN8KRDKUCo((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(weight$default, true, (kotlin.jvm.functions.Function1) rememberedValue2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, ((i3 >> 3) & 14) | 384, 6, 1018);
            composer2.endNode();
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Pencil.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, stringResource, null, !z, false, composer2, ((i3 >> 6) & 112) | 27654, 324);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$juD0l4mdiUdZUsNyGpj5m4GMrWw(str, str2, str3, function0, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ActionButtonSection(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1104130826);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1104130826, i2, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.ActionButtonSection (RememberedLoginScreen.kt:593)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_remembered_login_button_next, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, !z, z, startRestartGroup, ((i2 >> 3) & 14) | 1769856 | ((i2 << 24) & 234881024), 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$iiqazgdluN19uZ9cYXB0W94v_s4(z, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2Gs7Y2L-BR-5CL7pQ5aGkEYRBTE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15323$r8$lambda$2Gs7Y2LBR5CL7pQ5aGkEYRBTE(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2H3VngaqXn8D17t20cUUhBHGlwI(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$41gHKCFCNIc83AtmW33Un_H_ALM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1616817564);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1616817564, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginLoadingPreview (RememberedLoginScreen.kt:632)");
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading loading = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading.INSTANCE;
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle idle = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE;
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle idle2 = com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15324$r8$lambda$K61AhxJBrauUdZQK5ceoRrO3w((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RememberedLoginScreenContent(loading, idle, idle2, "demo-request-id", function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 224694, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$41gHKCFCNIc83AtmW33Un_H_ALM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$59ExNGjnPPpIJzKjBaQpY3TL8Ww(java.lang.String str, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RememberedLoginScreen(str, loginFlowController, rememberedLoginViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6aBs7kPLaNbKJqiaeVbqaI2WJfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AKkmFMtgNdVZAdlGJUlMGeX0ZEY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C8iR5wRksaQh8Qa9UPi2vhiJLJ8(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState rememberedLoginUiState, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState biometricLoginUiState, com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState passkeyLoginState, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RememberedLoginScreenContent(rememberedLoginUiState, biometricLoginUiState, passkeyLoginState, str, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IKZcP73Ah53pasPq9BN8KRDKUCo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K61A-hxJBrauUdZQK5ceoRrO3-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15324$r8$lambda$K61AhxJBrauUdZQK5ceoRrO3w(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$NIJ95osJ6dRzMj70GmDKbwrl12Y(androidx.compose.runtime.State state) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState) state.getValue()) instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UW5fejQQXnT3vVsCTu_KsEYvpxg(int i, androidx.compose.runtime.Composer composer, int i2) {
        HeaderSection(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XpOj9TpC5lrZGj1L2GfGjbEIZo0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1742738968);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1742738968, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUserDataLoadedPreview (RememberedLoginScreen.kt:651)");
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded userDataLoaded = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded("Anthony Charles", "anthony.charles@example.com", null, null, null, false, false, false, false, null, false, 0, 0, false, false, 32756, null);
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle idle = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE;
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle idle2 = com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.m15323$r8$lambda$2Gs7Y2LBR5CL7pQ5aGkEYRBTE((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RememberedLoginScreenContent(userDataLoaded, idle, idle2, "demo-request-id", function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 224688, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$XpOj9TpC5lrZGj1L2GfGjbEIZo0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iiqazgdluN19uZ9cYXB0W94v_s4(boolean z, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActionButtonSection(z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$juD0l4mdiUdZUsNyGpj5m4GMrWw(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        UserInfoSection(str, str2, str3, function0, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rZ7oUp-FFigNXldRtK_fPI-PmQQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15325$r8$lambda$rZ7oUpFFigNXldRtK_fPIPmQQ(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel) {
        rememberedLoginViewModel.processEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoginButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s5DZ9GAay4bApV3_kSGL6veq5b8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-358408356);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-358408356, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginInitialPreview (RememberedLoginScreen.kt:613)");
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial initial = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial.INSTANCE;
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle idle = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE;
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle idle2 = com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$2H3VngaqXn8D17t20cUUhBHGlwI((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RememberedLoginScreenContent(initial, idle, idle2, "demo-request-id", function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 224694, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$s5DZ9GAay4bApV3_kSGL6veq5b8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u0zPF9_BwxWfwm2YaOZ2MxFcbv8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2072750632);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2072750632, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginErrorPreview (RememberedLoginScreen.kt:674)");
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error error = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error("Failed to load user data. Please try again.");
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle idle = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Idle.INSTANCE;
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle idle2 = com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$yj8AONpkM6s0TeCDMC2YxX3tW8A((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            RememberedLoginScreenContent(error, idle, idle2, "demo-request-id", function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 224688, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.$r8$lambda$u0zPF9_BwxWfwm2YaOZ2MxFcbv8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xwc-Wk_WYQaP_6tMtBtEQkYqRkw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15326$r8$lambda$xwcWk_WYQaP_6tMtBtEQkYqRkw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yj8AONpkM6s0TeCDMC2YxX3tW8A(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zvRFtoE-Px-obDEgApqW5aK2rO4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15327$r8$lambda$zvRFtoEPxobDEgApqW5aK2rO4(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, "Loading passkey authentication");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState access$RememberedLoginScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState access$RememberedLoginScreen$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState) state.getValue();
    }
}
