package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001dH\u0003¢\u0006\u0002\u0010\u001e\u001a\u0015\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010 \u001a\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010 \u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006&²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"EmailConfirmationScreen", "", "email", "", "code", "onResult", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "viewModel", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationViewModel;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationViewModel;Landroidx/compose/runtime/Composer;II)V", "EmailConfirmationScreenContent", "uiState", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiState;", "onEvent", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "SuccessContent", "confirmedEmail", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "errorType", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "message", "onDismiss", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getErrorTitle", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getErrorMessage", "EmailConfirmationLoadingPreview", "EmailConfirmationSuccessPreview", "EmailConfirmationErrorConfirmationFailedPreview", "EmailConfirmationErrorNetworkPreview", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailConfirmationScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect, kotlin.Unit> function1, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel2;
        final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel4;
        int i5;
        int i6;
        boolean changedInstance;
        int i7;
        int i8;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        boolean changed;
        java.lang.Object rememberedValue4;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1777999318);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                emailConfirmationViewModel2 = emailConfirmationViewModel;
                if (startRestartGroup.changedInstance(emailConfirmationViewModel2)) {
                    i9 = 2048;
                    i3 |= i9;
                }
            } else {
                emailConfirmationViewModel2 = emailConfirmationViewModel;
            }
            i9 = 1024;
            i3 |= i9;
        } else {
            emailConfirmationViewModel2 = emailConfirmationViewModel;
        }
        int i10 = i3;
        if (startRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 = i10 & (-7169);
                    emailConfirmationViewModel3 = emailConfirmationViewModel2;
                    i4 = 1;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(emailConfirmationViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                    if ((i6 & 14) == 4) {
                    }
                    if ((i6 & 112) == 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | i8) == 0) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15162$r8$lambda$7zmUNu_ZAfsnVmJKLw5NP58d_I(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.this, str, str2, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 6);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    changedInstance2 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                    if ((i6 & 896) != 256) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance2 ? 1 : 0) | i4) == 0) {
                    }
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$2$1(emailConfirmationViewModel3, function1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState emailConfirmationUiState = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState) collectAsState.getValue();
                    changedInstance3 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$3$1(emailConfirmationViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    changed = startRestartGroup.changed(collectAsState);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$cN6IwFBnt0uv1td6zQLfR3DyFTA(androidx.compose.runtime.State.this));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    EmailConfirmationScreenContent(emailConfirmationUiState, function12, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6), startRestartGroup, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            } else if ((i2 & 8) != 0) {
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
                emailConfirmationViewModel4 = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i5 = i10 & (-7169);
                int i11 = i5;
                emailConfirmationViewModel3 = emailConfirmationViewModel4;
                i6 = i11;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1777999318, i6, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreen (EmailConfirmationScreen.kt:83)");
                }
                final androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(emailConfirmationViewModel3.getUiState(), null, startRestartGroup, 0, i4);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                i7 = (i6 & 14) == 4 ? i4 : 0;
                i8 = (i6 & 112) == 32 ? i4 : 0;
                rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | i8) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15162$r8$lambda$7zmUNu_ZAfsnVmJKLw5NP58d_I(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.this, str, str2, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 6);
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                if ((i6 & 896) != 256) {
                    i4 = 0;
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance2 ? 1 : 0) | i4) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$2$1(emailConfirmationViewModel3, function1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState emailConfirmationUiState2 = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState) collectAsState2.getValue();
                changedInstance3 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$3$1(emailConfirmationViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                changed = startRestartGroup.changed(collectAsState2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$cN6IwFBnt0uv1td6zQLfR3DyFTA(androidx.compose.runtime.State.this));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                EmailConfirmationScreenContent(emailConfirmationUiState2, function122, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion2, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6), startRestartGroup, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 1;
            emailConfirmationViewModel4 = emailConfirmationViewModel2;
            i5 = i10;
            int i112 = i5;
            emailConfirmationViewModel3 = emailConfirmationViewModel4;
            i6 = i112;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(emailConfirmationViewModel3.getUiState(), null, startRestartGroup, 0, i4);
            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(emailConfirmationViewModel3);
            if ((i6 & 14) == 4) {
            }
            if ((i6 & 112) == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | i7 | i8) == 0) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15162$r8$lambda$7zmUNu_ZAfsnVmJKLw5NP58d_I(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel.this, str, str2, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit32, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 6);
            kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
            if ((i6 & 896) != 256) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance2 ? 1 : 0) | i4) == 0) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$2$1(emailConfirmationViewModel3, function1, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState emailConfirmationUiState22 = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState) collectAsState22.getValue();
            changedInstance3 = startRestartGroup.changedInstance(emailConfirmationViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$3$1(emailConfirmationViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function1 function1222 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3);
            androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
            changed = startRestartGroup.changed(collectAsState22);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$cN6IwFBnt0uv1td6zQLfR3DyFTA(androidx.compose.runtime.State.this));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            EmailConfirmationScreenContent(emailConfirmationUiState22, function1222, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion22, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            emailConfirmationViewModel3 = emailConfirmationViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel5 = emailConfirmationViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$LdcxsFRZBxmZd8EVSidSw_nBrlI(str, str2, function1, emailConfirmationViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailConfirmationScreenContent(final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState emailConfirmationUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(137035069);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(emailConfirmationUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(137035069, i3, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenContent (EmailConfirmationScreen.kt:121)");
                }
                int i5 = i3 & 112;
                boolean z = i5 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$c8HPOLnTcwIHZ7ZU9aP4WxWNhCQ(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                if (emailConfirmationUiState instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading) {
                    startRestartGroup.startReplaceGroup(-1629209105);
                    getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (emailConfirmationUiState instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success) {
                    startRestartGroup.startReplaceGroup(-1629107704);
                    getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success) emailConfirmationUiState).getConfirmedEmail(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(emailConfirmationUiState instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error)) {
                        startRestartGroup.startReplaceGroup(-606746131);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1628966158);
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error error = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error) emailConfirmationUiState;
                    com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType errorType = error.getErrorType();
                    java.lang.String message = error.getMessage();
                    boolean z2 = i5 == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$xrizLwa0D1_Y0grgZKi_gEcdIKM(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    getHighResolutionOutputSizeshNQ4ISI(errorType, message, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
                boolean z3 = i5 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15166$r8$lambda$YjLELDbzAMtG45Ku_D5_jMuUks(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.IconButtonKt.IconButton(xMark, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.pds.core.ConstantsKt.getSpacing16()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null)), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_close_button, startRestartGroup, 0), null, false, false, startRestartGroup, 27654, 448);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$IEbslcbTTJbizs7V6N9FJBOozB4(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2028477492);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2028477492, i, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.LoadingContent (EmailConfirmationScreen.kt:170)");
            }
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_loading, startRestartGroup, 0);
            com.paypal.pds.core.Typography.TitleMedium titleMedium = com.paypal.pds.core.Typography.TitleMedium.INSTANCE;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, titleMedium, startRestartGroup, 384, 6, 1002);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$fe0rbcZMGw9o9PJPyZBt2g44Vq4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(775046100);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(775046100, i2, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.SuccessContent (EmailConfirmationScreen.kt:192)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.core.Icon.CheckmarkCircle checkmarkCircle = com.paypal.pds.core.Icon.CheckmarkCircle.INSTANCE;
            com.paypal.pds.core.Icon.CheckmarkCircle checkmarkCircle2 = checkmarkCircle;
            com.paypal.pds.components.IconKt.Icon(checkmarkCircle2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_success_icon_desc, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, startRestartGroup, 27654, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_success_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, (i2 & 14) | 384, 6, 1002);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$heeGW40pPuQ42dEguraliUyZPTA(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-682807110);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(emailConfirmationErrorType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-682807110, i3, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.ErrorContent (EmailConfirmationScreen.kt:235)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.core.Icon.Critical critical = com.paypal.pds.core.Icon.Critical.INSTANCE;
            com.paypal.pds.core.Icon.Critical critical2 = critical;
            com.paypal.pds.components.IconKt.Icon(critical2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_icon_desc, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, startRestartGroup, 27654, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            int i4 = i3 & 14;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(getHighSpeedVideoFpsRanges(emailConfirmationErrorType, startRestartGroup, i4), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            if (str == null) {
                startRestartGroup.startReplaceGroup(982871626);
                java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(emailConfirmationErrorType, startRestartGroup, i4);
                startRestartGroup.endReplaceGroup();
                str2 = Camera2StreamConfigurationMap;
            } else {
                startRestartGroup.startReplaceGroup(982871285);
                startRestartGroup.endReplaceGroup();
                str2 = str;
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_dismiss_button, startRestartGroup, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss_button", 0, 2, null)), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, startRestartGroup, ((i3 >> 6) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15165$r8$lambda$Pzgj7rs0GAZCkSIASnEqx9A2y4(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.this, str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1291276043, i, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.getErrorTitle (EmailConfirmationScreen.kt:285)");
        }
        int i2 = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.WhenMappings.$EnumSwitchMapping$0[emailConfirmationErrorType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(329276646);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_mismatch_title, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(329281349);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_network_title, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3 || i2 == 4) {
            composer.startReplaceGroup(329287397);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_unknown_title, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(329274228);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(926289444, i, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.getErrorMessage (EmailConfirmationScreen.kt:303)");
        }
        int i2 = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.WhenMappings.$EnumSwitchMapping$0[emailConfirmationErrorType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1105930903);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_mismatch_message, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(1105935670);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_network_message, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(1105940371);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_invalid_link, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(1105928584);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1105944822);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_email_confirmation_error_unknown_message, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* renamed from: $r8$lambda$7zmUNu_ZAfsnVm-JKLw5NP58d_I, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m15162$r8$lambda$7zmUNu_ZAfsnVmJKLw5NP58d_I(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel, java.lang.String str, java.lang.String str2, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        emailConfirmationViewModel.initialize(str, str2);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$EmailConfirmationScreen$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ADHtSX8zmw6AJjnQxKBJ_JuJxGU(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C7i82egpFf4WIht-wwtwywlvsQ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15163$r8$lambda$C7i82egpFf4WIhtwwtwywlvsQ0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(38310953);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(38310953, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationSuccessPreview (EmailConfirmationScreen.kt:334)");
            }
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success success = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Success("user@example.com");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$ADHtSX8zmw6AJjnQxKBJ_JuJxGU((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmailConfirmationScreenContent(success, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15163$r8$lambda$C7i82egpFf4WIhtwwtwywlvsQ0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IEbslcbTTJbizs7V6N9FJBOozB4(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState emailConfirmationUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmailConfirmationScreenContent(emailConfirmationUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IS36-gt-XTb0NIjQyoCPs_xnO8Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15164$r8$lambda$IS36gtXTb0NIjQyoCPs_xnO8Y(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LdcxsFRZBxmZd8EVSidSw_nBrlI(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel emailConfirmationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmailConfirmationScreen(str, str2, function1, emailConfirmationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Pzgj7rs0GAZCkSIASn-Eqx9A2y4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15165$r8$lambda$Pzgj7rs0GAZCkSIASnEqx9A2y4(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(emailConfirmationErrorType, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YjLELDbzA-MtG45Ku_D5_jMuUks, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15166$r8$lambda$YjLELDbzAMtG45Ku_D5_jMuUks(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.CloseButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_8LqRsd_ITdyJaPmq_W4SsYbi8k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-597860014);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-597860014, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorConfirmationFailedPreview (EmailConfirmationScreen.kt:347)");
            }
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error error = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.CONFIRMATION_FAILED, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.m15164$r8$lambda$IS36gtXTb0NIjQyoCPs_xnO8Y((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmailConfirmationScreenContent(error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$_8LqRsd_ITdyJaPmq_W4SsYbi8k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_BFYc_V5gNP5G_WrVIEtE_Bw0nE(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aBIKSdn7HaTmXn5I6mctl6nR8D4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1791649248);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1791649248, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorNetworkPreview (EmailConfirmationScreen.kt:361)");
            }
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error error = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Error(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.NETWORK_ERROR, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$tpoTCSttTngPiNmrGEC2zMiZtgw((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmailConfirmationScreenContent(error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$aBIKSdn7HaTmXn5I6mctl6nR8D4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c8HPOLnTcwIHZ7ZU9aP4WxWNhCQ(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.CloseButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$cN6IwFBnt0uv1td6zQLfR3DyFTA(androidx.compose.runtime.State state) {
        return !(((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState) state.getValue()) instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fe0rbcZMGw9o9PJPyZBt2g44Vq4(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$heeGW40pPuQ42dEguraliUyZPTA(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ofmyZtRVN8nXg0EKRknJls9LHXg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1637596368);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1637596368, updateChangedFlags, -1, "com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationLoadingPreview (EmailConfirmationScreen.kt:323)");
            }
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading loading = com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$_BFYc_V5gNP5G_WrVIEtE_Bw0nE((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmailConfirmationScreenContent(loading, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationScreenKt.$r8$lambda$ofmyZtRVN8nXg0EKRknJls9LHXg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tpoTCSttTngPiNmrGEC2zMiZtgw(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent emailConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xrizLwa0D1_Y0grgZKi_gEcdIKM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationEvent.Dismiss.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.CONFIRMATION_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.NETWORK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.INVALID_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
