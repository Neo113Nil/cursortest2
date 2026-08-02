package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aO\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"PersonalizedAdsScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedAdsViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedAdsViewModel;Landroidx/compose/runtime/Composer;II)V", "PersonalizedAdsScreenContent", "state", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "onCloseClick", "Lkotlin/Function0;", "onToggleChange", "Lkotlin/Function1;", "", "onClearBanner", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedAdsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedAdsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        boolean changedInstance;
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$1$1 rememberedValue;
        boolean changedInstance2;
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$2$1 rememberedValue2;
        boolean changedInstance3;
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$3$1 rememberedValue3;
        boolean z;
        java.lang.Object rememberedValue4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1036723767);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    personalizedAdsViewModel2 = personalizedAdsViewModel;
                    if (startRestartGroup.changedInstance(personalizedAdsViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    personalizedAdsViewModel2 = personalizedAdsViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                personalizedAdsViewModel2 = personalizedAdsViewModel;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                personalizedAdsViewModel3 = personalizedAdsViewModel2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        i4 = i3 & (-897);
                        personalizedAdsViewModel3 = (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1036723767, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreen (PersonalizedAdsScreen.kt:44)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(personalizedAdsViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$1$1(personalizedAdsViewModel3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState) collectAsStateWithLifecycle.getValue();
                        changedInstance2 = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$2$1(personalizedAdsViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue2;
                        changedInstance3 = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$3$1(personalizedAdsViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue3;
                        z = (i4 & 14) == 4;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$ZwDI8rCEcjeIfCmvFmlrJpmR7vg(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        PersonalizedAdsScreenContent(personalizedAdsUiState, (kotlin.jvm.functions.Function0) rememberedValue4, (kotlin.jvm.functions.Function1) kFunction, (kotlin.jvm.functions.Function0) kFunction2, modifier3, startRestartGroup, (i4 << 9) & 57344, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                personalizedAdsViewModel3 = personalizedAdsViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(personalizedAdsViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$1$1(personalizedAdsViewModel3, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState2 = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState) collectAsStateWithLifecycle2.getValue();
                changedInstance2 = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$2$1(personalizedAdsViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.reflect.KFunction kFunction3 = (kotlin.reflect.KFunction) rememberedValue2;
                changedInstance3 = startRestartGroup.changedInstance(personalizedAdsViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$PersonalizedAdsScreen$3$1(personalizedAdsViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                kotlin.reflect.KFunction kFunction22 = (kotlin.reflect.KFunction) rememberedValue3;
                if ((i4 & 14) == 4) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$ZwDI8rCEcjeIfCmvFmlrJpmR7vg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                PersonalizedAdsScreenContent(personalizedAdsUiState2, (kotlin.jvm.functions.Function0) rememberedValue4, (kotlin.jvm.functions.Function1) kFunction3, (kotlin.jvm.functions.Function0) kFunction22, modifier3, startRestartGroup, (i4 << 9) & 57344, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$03VrgiEA0cX0k3KjVR227jIQTGA(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, personalizedAdsViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedAdsScreenContent(final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedAdsUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1085129890);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(personalizedAdsUiState) : startRestartGroup.changedInstance(personalizedAdsUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1085129890, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenContent (PersonalizedAdsScreen.kt:67)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_privacy_statement_url, startRestartGroup, 0);
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content content = personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content ? (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) personalizedAdsUiState : null;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.PrivacyToastHost(content != null ? content.getBanner() : null, function02, "personalized_ads", com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i4 >> 12) & 14) | 48, 2), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1570480122, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$WyYfgG_LL3qakHehaZLPgtTtzwQ(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.this, function0, function1, stringResource, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, ((i4 >> 6) & 112) | 24960, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.m13624$r8$lambda$qXGPk_CMXAMMxKk75pAAiNbzUk(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.this, function0, function1, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$03VrgiEA0cX0k3KjVR227jIQTGA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalizedAdsScreen(appNavigator, modifier, personalizedAdsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I_Mfi2b7NsNQ3mK3sUw-_Wyple8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13623$r8$lambda$I_Mfi2b7NsNQ3mK3sUw_Wyple8(java.lang.String str, android.content.Context context) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.handleExternalWebView$default(com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE, str, context, null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WyYfgG_LL3qakHehaZLPgtTtzwQ(final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, final java.lang.String str, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1570480122, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenContent.<anonymous> (PersonalizedAdsScreen.kt:77)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingOverlayKt.LoadingOverlay((personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) && ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) personalizedAdsUiState).isMutating(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_ads_mutation_loader", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-820199678, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$sL7LJNxnh2ZF2aVgTbvxPMtedgc(kotlin.jvm.functions.Function0.this, personalizedAdsUiState, function1, str, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3504, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZwDI8rCEcjeIfCmvFmlrJpmR7vg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$_aH_DIJRTLlasSRTKZu30VXMlNI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_aH_DIJRTLlasSRTKZu30VXMlNI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jOmkxV7CVdT2rAVqUh2USL8EeRU(java.lang.String str, android.content.Context context) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.handleExternalWebView$default(com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE, str, context, null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qXG-Pk_CMXAMMxKk75pAAiNbzUk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13624$r8$lambda$qXGPk_CMXAMMxKk75pAAiNbzUk(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalizedAdsScreenContent(personalizedAdsUiState, function0, function1, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$sL7LJNxnh2ZF2aVgTbvxPMtedgc(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState personalizedAdsUiState, kotlin.jvm.functions.Function1 function1, final java.lang.String str, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-820199678, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenContent.<anonymous>.<anonymous> (PersonalizedAdsScreen.kt:82)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_ads_screen");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.PrivacyToolbar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_security_and_privacy_navigation_title, composer, 0), function0, "personalized_ads_top_bar", "personalized_ads_close_button", null, composer, 3456, 16);
            boolean z = personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content;
            if (z) {
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner2 = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) personalizedAdsUiState).getBanner();
                if (banner2 instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) {
                    banner = (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) banner2;
                    if (banner != null) {
                        composer.startReplaceGroup(490110331);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(490110332);
                        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.PrivacyErrorBanner(banner, "personalized_ads", null, composer, 48, 4);
                        composer.endReplaceGroup();
                    }
                    if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading)) {
                        composer.startReplaceGroup(490381427);
                        com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingScreenKt.LoadingScreen(null, "personalized_ads_loading", composer, 48, 1);
                        composer.endReplaceGroup();
                    } else if (z) {
                        composer.startReplaceGroup(490552578);
                        boolean isEnabled = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) personalizedAdsUiState).isEnabled();
                        boolean changed = composer.changed(str);
                        boolean changedInstance = composer.changedInstance(context);
                        java.lang.Object rememberedValue = composer.rememberedValue();
                        if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.m13623$r8$lambda$I_Mfi2b7NsNQ3mK3sUw_Wyple8(str, context);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedAdsContentKt.PersonalizedAdsContent(isEnabled, function1, (kotlin.jvm.functions.Function0) rememberedValue, !r0.isMutating(), null, composer, 0, 16);
                        composer.endReplaceGroup();
                    } else {
                        if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error)) {
                            composer.startReplaceGroup(-676918837);
                            composer.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(491198618);
                        boolean isEnabled2 = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error) personalizedAdsUiState).isEnabled();
                        java.lang.Object rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit unit;
                                    ((java.lang.Boolean) obj).booleanValue();
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        boolean changed2 = composer.changed(str);
                        boolean changedInstance2 = composer.changedInstance(context);
                        java.lang.Object rememberedValue3 = composer.rememberedValue();
                        if ((changed2 | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedAdsScreenKt.$r8$lambda$jOmkxV7CVdT2rAVqUh2USL8EeRU(str, context);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedAdsContentKt.PersonalizedAdsContent(isEnabled2, function12, (kotlin.jvm.functions.Function0) rememberedValue3, false, null, composer, 3120, 16);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                banner = null;
                if (banner != null) {
                }
                if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading)) {
                }
                composer.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error) {
                    banner = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Error) personalizedAdsUiState).getBanner();
                    if (banner != null) {
                    }
                    if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading)) {
                    }
                    composer.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
                banner = null;
                if (banner != null) {
                }
                if (!(personalizedAdsUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading)) {
                }
                composer.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
