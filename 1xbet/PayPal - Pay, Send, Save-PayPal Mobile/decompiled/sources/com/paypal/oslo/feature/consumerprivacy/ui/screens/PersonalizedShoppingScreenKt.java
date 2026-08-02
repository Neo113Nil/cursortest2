package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aO\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0018²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"PersonalizedShoppingScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedShoppingViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedShoppingViewModel;Landroidx/compose/runtime/Composer;II)V", "PersonalizedShoppingScreenContent", "uiState", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "onCloseClick", "Lkotlin/Function0;", "onToggleChange", "Lkotlin/Function1;", "", "onClearBanner", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PersonalizedShoppingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "PersonalizedShoppingScreenLoadingPreview", "PersonalizedShoppingScreenSuccessBannerPreview", "PersonalizedShoppingScreenErrorBannerPreview", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedShoppingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedShoppingScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        boolean changedInstance2;
        com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$PersonalizedShoppingScreen$3$1 rememberedValue3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1648956899);
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
                    personalizedShoppingViewModel2 = personalizedShoppingViewModel;
                    if (startRestartGroup.changedInstance(personalizedShoppingViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    personalizedShoppingViewModel2 = personalizedShoppingViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                personalizedShoppingViewModel2 = personalizedShoppingViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel4 = (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 = i3 & (-897);
                        personalizedShoppingViewModel3 = personalizedShoppingViewModel4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1648956899, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreen (PersonalizedShoppingScreen.kt:55)");
                        }
                        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(personalizedShoppingViewModel3.getUiState(), null, startRestartGroup, 0, 1).getValue();
                        z = (i4 & 14) == 4;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13636$r8$lambda$r2WgYV2Y9Qy82gw1obfRml76h0(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                        changedInstance = startRestartGroup.changedInstance(personalizedShoppingViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$Vseg4Y1T3aYFW4e7dn4rtDsLpL0(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        changedInstance2 = startRestartGroup.changedInstance(personalizedShoppingViewModel3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$PersonalizedShoppingScreen$3$1(personalizedShoppingViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        PersonalizedShoppingScreenContent(personalizedShoppingUiState, function0, function1, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3), modifier3, startRestartGroup, (i4 << 9) & 57344, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                    }
                }
                personalizedShoppingViewModel3 = personalizedShoppingViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState2 = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(personalizedShoppingViewModel3.getUiState(), null, startRestartGroup, 0, 1).getValue();
                if ((i4 & 14) == 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13636$r8$lambda$r2WgYV2Y9Qy82gw1obfRml76h0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                changedInstance = startRestartGroup.changedInstance(personalizedShoppingViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$Vseg4Y1T3aYFW4e7dn4rtDsLpL0(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance2 = startRestartGroup.changedInstance(personalizedShoppingViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$PersonalizedShoppingScreen$3$1(personalizedShoppingViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                PersonalizedShoppingScreenContent(personalizedShoppingUiState2, function02, function12, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3), modifier3, startRestartGroup, (i4 << 9) & 57344, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                personalizedShoppingViewModel3 = personalizedShoppingViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$0xc0EOIXWEfO3gqBpqK9cFdvznw(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, personalizedShoppingViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedShoppingScreenContent(final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-376699654);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(personalizedShoppingUiState) : startRestartGroup.changedInstance(personalizedShoppingUiState) ? 4 : 2) | i;
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
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-376699654, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenContent (PersonalizedShoppingScreen.kt:74)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_privacy_statement_url, startRestartGroup, 0);
                final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, startRestartGroup, 0);
                final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_ca_nd_vt_url, startRestartGroup, 0);
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content = personalizedShoppingUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content ? (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) personalizedShoppingUiState : null;
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.PrivacyToastHost(content != null ? content.getBanner() : null, function02, "personalized_shopping", com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i4 >> 12) & 14) | 48, 2), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-886637742, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13625$r8$lambda$4nRuEM47iUtqJvcnbME9h9ikRw(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.this, function0, function1, stringResource, context, stringResource2, stringResource3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 6) & 112) | 24960, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$i4Kv1qk60EPdUThajcYrVgGnXug(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.this, function0, function1, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0xc0EOIXWEfO3gqBpqK9cFdvznw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalizedShoppingScreen(appNavigator, modifier, personalizedShoppingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4nRuEM4-7iUtqJvcnbME9h9ikRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13625$r8$lambda$4nRuEM47iUtqJvcnbME9h9ikRw(final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, final java.lang.String str, final android.content.Context context, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-886637742, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenContent.<anonymous> (PersonalizedShoppingScreen.kt:88)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingOverlayKt.LoadingOverlay((personalizedShoppingUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) && ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) personalizedShoppingUiState).isMutating(), androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_shopping_mutation_loader", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(847070422, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13626$r8$lambda$6LM5rLi2Lid0mjpPVFdSkY1Lpk(kotlin.jvm.functions.Function0.this, personalizedShoppingUiState, function1, str, context, str2, str3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0342  */
    /* renamed from: $r8$lambda$6LM5rLi2Lid0-mjpPVFdSkY1Lpk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit m13626$r8$lambda$6LM5rLi2Lid0mjpPVFdSkY1Lpk(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState, kotlin.jvm.functions.Function1 function1, final java.lang.String str, final android.content.Context context, final java.lang.String str2, final java.lang.String str3, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2 = composer;
        if (composer2.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(847070422, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenContent.<anonymous>.<anonymous> (PersonalizedShoppingScreen.kt:93)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_shopping_screen");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor);
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
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.PrivacyToolbar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_security_and_privacy_navigation_title, composer2, 0), function0, "personalized_shopping_top_bar", "personalized_shopping_close_button", null, composer, 3456, 16);
            if (kotlin.jvm.internal.Intrinsics.areEqual(personalizedShoppingUiState, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading.INSTANCE)) {
                composer2.startReplaceGroup(-98082770);
                com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingScreenKt.LoadingScreen(null, "personalized_shopping_loading", composer2, 48, 1);
                composer.endReplaceGroup();
            } else if (personalizedShoppingUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) {
                composer2.startReplaceGroup(-97849991);
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) personalizedShoppingUiState;
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner = content.getBanner();
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error error = banner instanceof com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error ? (com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error) banner : null;
                if (error == null) {
                    composer2.startReplaceGroup(-97839018);
                    composer.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-97839017);
                    com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.PrivacyErrorBanner(error, "personalized_shopping", null, composer, 48, 4);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    composer.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_title, composer2, 0);
                com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), false, null, 3, null);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$iSGVktTGQLb5tY4rIuoQJLL1dCI((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), "personalized_shopping_screen_title"), contentBase, null, null, null, false, 0, 0, null, headingMedium, composer, 384, 6, 1016);
                boolean isShoppingPersonalizationEnabled = content.isShoppingPersonalizationEnabled();
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant variant = content.getVariant();
                boolean isToggleEnabled = content.isToggleEnabled();
                com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType = content.getConsentType();
                java.lang.String dataUsageDate = content.getDataUsageDate();
                composer2 = composer;
                boolean changed = composer2.changed(str);
                boolean changedInstance = composer2.changedInstance(context);
                boolean changed2 = composer2.changed(str2);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed | changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13627$r8$lambda$6YC88Uo8uLYxZC9u5QWT7_B3U8(str, context, str2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean changed3 = composer2.changed(str3);
                boolean changedInstance2 = composer2.changedInstance(context);
                boolean changed4 = composer2.changed(str2);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if ((changed3 | changedInstance2 | changed4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$P47nWqMQioTbgu2ly1m7FOEhRPI(str3, context, str2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.PersonalizedShoppingContent(variant, null, isShoppingPersonalizationEnabled, isToggleEnabled, consentType, dataUsageDate, function1, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0, 2);
                composer.endReplaceGroup();
            } else {
                if (!(personalizedShoppingUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error)) {
                    composer2.startReplaceGroup(412479992);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-95578869);
                com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerStateKt.PrivacyErrorBanner(((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error) personalizedShoppingUiState).getBanner(), "personalized_shopping", null, composer, 48, 4);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_title, composer2, 0);
                com.paypal.pds.core.Typography.HeadingMedium headingMedium2 = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier focusable$default2 = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), false, null, 3, null);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13628$r8$lambda$6mgsE3Tu9spDxkYnUvA7LNKhoc((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default2, false, (kotlin.jvm.functions.Function1) rememberedValue4, 1, null), "personalized_shopping_screen_title"), contentBase2, null, null, null, false, 0, 0, null, headingMedium2, composer, 384, 6, 1016);
                com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant = com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT;
                java.lang.Object rememberedValue5 = composer.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit3;
                            ((java.lang.Boolean) obj).booleanValue();
                            unit3 = kotlin.Unit.INSTANCE;
                            return unit3;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
                boolean changed5 = composer2.changed(str);
                boolean changedInstance3 = composer2.changedInstance(context);
                boolean changed6 = composer2.changed(str2);
                java.lang.Object rememberedValue6 = composer.rememberedValue();
                if ((changed5 | changedInstance3 | changed6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$WUr0AoS7qPMqSwqQWrzKmhhTbSU(str, context, str2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changed7 = composer2.changed(str3);
                boolean changedInstance4 = composer2.changedInstance(context);
                boolean changed8 = composer2.changed(str2);
                java.lang.Object rememberedValue7 = composer.rememberedValue();
                if ((changed7 | changedInstance4 | changed8) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13630$r8$lambda$KMiEiCoXb0rajvHnn0ytZ4T94Q(str3, context, str2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue7);
                }
                com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.PersonalizedShoppingContent(personalizedShoppingVariant, null, false, false, null, null, function12, function03, (kotlin.jvm.functions.Function0) rememberedValue7, composer, 1576326, 50);
                composer.endReplaceGroup();
                composer.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6YC88Uo8uLYxZC9u5QWT7-_B3U8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13627$r8$lambda$6YC88Uo8uLYxZC9u5QWT7_B3U8(java.lang.String str, android.content.Context context, java.lang.String str2) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE.handleExternalWebView(str, context, str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6m-gsE3Tu9spDxkYnUvA7LNKhoc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13628$r8$lambda$6mgsE3Tu9spDxkYnUvA7LNKhoc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DltBBUEfECUCmndaSvIRojNXUAQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1233038162);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1233038162, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenErrorBannerPreview (PersonalizedShoppingScreen.kt:253)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error error = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, null), "Failed to load settings");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda18
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda19
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
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PersonalizedShoppingScreenContent(error, function0, function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$DltBBUEfECUCmndaSvIRojNXUAQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KMi-EiCoXb0rajvHnn0ytZ4T94Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13630$r8$lambda$KMiEiCoXb0rajvHnn0ytZ4T94Q(java.lang.String str, android.content.Context context, java.lang.String str2) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE.handleExternalWebView(str, context, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P47nWqMQioTbgu2ly1m7FOEhRPI(java.lang.String str, android.content.Context context, java.lang.String str2) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE.handleExternalWebView(str, context, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U2HZQeW7OF3wC9brFIMb9MgAZKE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(838169378);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(838169378, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenPreview (PersonalizedShoppingScreen.kt:203)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT, true, null, false, false, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.PARTIAL, "November 27, 2024", 28, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda11
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
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PersonalizedShoppingScreenContent(content, function0, function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$U2HZQeW7OF3wC9brFIMb9MgAZKE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vseg4Y1T3aYFW4e7dn4rtDsLpL0(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, boolean z) {
        personalizedShoppingViewModel.onPersonalizationToggleChanged(z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WUr0AoS7qPMqSwqQWrzKmhhTbSU(java.lang.String str, android.content.Context context, java.lang.String str2) {
        com.paypal.oslo.feature.consumerprivacy.ui.util.UiHelper.INSTANCE.handleExternalWebView(str, context, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f_CeNWyrqJhUsig_8yP4KoHBelA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1314444105);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1314444105, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenSuccessBannerPreview (PersonalizedShoppingScreen.kt:234)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.US_SPECIAL, true, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_update_success_on, null, 2, null), false, false, null, null, 120, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda25
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda26
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
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PersonalizedShoppingScreenContent(content, function0, function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.$r8$lambda$f_CeNWyrqJhUsig_8yP4KoHBelA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h2eYB9dDC8xaKOh-46gvEf8L_Qc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13633$r8$lambda$h2eYB9dDC8xaKOh46gvEf8L_Qc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1838216554);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1838216554, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenLoadingPreview (PersonalizedShoppingScreen.kt:221)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading loading = com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda1
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda2
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
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            PersonalizedShoppingScreenContent(loading, function0, function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 3510, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13633$r8$lambda$h2eYB9dDC8xaKOh46gvEf8L_Qc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i4Kv1qk60EPdUThajcYrVgGnXug(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState personalizedShoppingUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalizedShoppingScreenContent(personalizedShoppingUiState, function0, function1, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iSGVktTGQLb5tY4rIuoQJLL1dCI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$noAfUhuOBUi1-Fy9WcKD44NZHf8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13635$r8$lambda$noAfUhuOBUi1Fy9WcKD44NZHf8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r2WgYV2Y9Qy82gw-1obfRml76h0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13636$r8$lambda$r2WgYV2Y9Qy82gw1obfRml76h0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.screens.PersonalizedShoppingScreenKt.m13635$r8$lambda$noAfUhuOBUi1Fy9WcKD44NZHf8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
