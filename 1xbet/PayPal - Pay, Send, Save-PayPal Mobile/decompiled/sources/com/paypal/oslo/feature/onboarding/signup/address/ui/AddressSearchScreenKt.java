package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"AddressSearchScreen", "", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/address/ui/AddressSearchViewModel;", "AddressSearchScreen-PMBouqM", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/address/ui/AddressSearchViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/onboarding/signup/address/ui/model/AddressSearchUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSearchScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025d  */
    /* renamed from: AddressSearchScreen-PMBouqM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16223AddressSearchScreenPMBouqM(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel2;
        final com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        boolean z;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        boolean z2;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$1$1 rememberedValue;
        boolean changedInstance;
        boolean z3;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$2$1 rememberedValue2;
        boolean changedInstance2;
        boolean z4;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$3$1 rememberedValue3;
        boolean changedInstance3;
        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$4$1 rememberedValue4;
        boolean z5;
        boolean changedInstance4;
        java.lang.Object rememberedValue5;
        boolean z6;
        boolean z7;
        java.lang.Object rememberedValue6;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-807201439);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    addressSearchViewModel2 = addressSearchViewModel;
                    if (startRestartGroup.changedInstance(addressSearchViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    addressSearchViewModel2 = addressSearchViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                addressSearchViewModel2 = addressSearchViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    z = false;
                    i4 = 32;
                } else {
                    modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
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
                        i4 = 32;
                        i5 = i3 & (-57345);
                        addressSearchViewModel3 = (com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-807201439, i5, -1, "com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreen (AddressSearchScreen.kt:48)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addressSearchViewModel3.getAddressSearchUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        int i8 = i5 & 112;
                        z2 = i8 != i4 ? true : z;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$1$1(str2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        com.paypal.oslo.core.i18n.domain.model.CountryCode m11363boximpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str);
                        changedInstance = startRestartGroup.changedInstance(addressSearchViewModel3);
                        int i9 = i5 & 14;
                        z3 = i9 != 4 ? true : z;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$2$1(addressSearchViewModel3, str, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(m11363boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i9);
                        changedInstance2 = startRestartGroup.changedInstance(addressSearchViewModel3);
                        int i10 = i5 & 896;
                        z4 = i10 != 256 ? true : z;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(changedInstance2 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$3$1(addressSearchViewModel3, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(addressSearchViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i5 >> 12) & 14);
                        com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState addressSearchUiState = (com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) collectAsStateWithLifecycle.getValue();
                        changedInstance3 = startRestartGroup.changedInstance(addressSearchViewModel3);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$4$1(addressSearchViewModel3);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4);
                        z5 = i8 != i4 ? true : z;
                        changedInstance4 = startRestartGroup.changedInstance(addressSearchViewModel3);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!(changedInstance4 | z5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$JtDfNrSzI0atDRrs901OMRD27Xw(str2, addressSearchViewModel3, ((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
                        z6 = i8 != i4 ? true : z;
                        z7 = i10 != 256 ? z : true;
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!(z6 | z7) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$4q3AbmQPNuEFtRzbPNIoVWjpY3s(str2, appNavigator);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchContentKt.AddressSearchContent(addressSearchUiState, function1, function2, (kotlin.jvm.functions.Function0) rememberedValue6, modifier3, startRestartGroup, (i5 << 3) & 57344, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        z = false;
                        i4 = 32;
                        modifier2 = modifier3;
                    }
                }
                i5 = i3;
                modifier3 = modifier2;
                addressSearchViewModel3 = addressSearchViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addressSearchViewModel3.getAddressSearchUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                int i82 = i5 & 112;
                if (i82 != i4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$1$1(str2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.core.i18n.domain.model.CountryCode m11363boximpl2 = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str);
                changedInstance = startRestartGroup.changedInstance(addressSearchViewModel3);
                int i92 = i5 & 14;
                if (i92 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | z3)) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$2$1(addressSearchViewModel3, str, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(m11363boximpl2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i92);
                changedInstance2 = startRestartGroup.changedInstance(addressSearchViewModel3);
                int i102 = i5 & 896;
                if (i102 != 256) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z4)) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$3$1(addressSearchViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(addressSearchViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i5 >> 12) & 14);
                com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState addressSearchUiState2 = (com.paypal.oslo.feature.onboarding.signup.address.ui.model.AddressSearchUiState) collectAsStateWithLifecycle2.getValue();
                changedInstance3 = startRestartGroup.changedInstance(addressSearchViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue4 = new com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$AddressSearchScreen$4$1(addressSearchViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4);
                if (i82 != i4) {
                }
                changedInstance4 = startRestartGroup.changedInstance(addressSearchViewModel3);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changedInstance4 | z5)) {
                }
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$JtDfNrSzI0atDRrs901OMRD27Xw(str2, addressSearchViewModel3, ((java.lang.Integer) obj).intValue(), (com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue5;
                if (i82 != i4) {
                }
                if (i102 != 256) {
                }
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!(z6 | z7)) {
                }
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$4q3AbmQPNuEFtRzbPNIoVWjpY3s(str2, appNavigator);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
                com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchContentKt.AddressSearchContent(addressSearchUiState2, function12, function22, (kotlin.jvm.functions.Function0) rememberedValue6, modifier3, startRestartGroup, (i5 << 3) & 57344, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                addressSearchViewModel3 = addressSearchViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$26AoD9b5pNWVPd2POWlQIV_JICk(str, str2, appNavigator, modifier4, addressSearchViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$26AoD9b5pNWVPd2POWlQIV_JICk(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m16223AddressSearchScreenPMBouqM(str, str2, appNavigator, modifier, addressSearchViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4q3AbmQPNuEFtRzbPNIoVWjpY3s(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.INSTANCE.trackAddManually$onboarding_prodRelease(str);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchScreenKt.$r8$lambda$BfFqM9HCeVH9Q41REYViUZJqbj0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BfFqM9HCeVH9Q41REYViUZJqbj0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.ManualEntryRequested.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JtDfNrSzI0atDRrs901OMRD27Xw(java.lang.String str, com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, int i, com.paypal.oslo.feature.onboarding.signup.address.domain.model.AddressSuggestion addressSuggestion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSuggestion, "");
        com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.INSTANCE.trackAddressSelected$onboarding_prodRelease(i, str);
        addressSearchViewModel.onAddressSelected(addressSuggestion);
        return kotlin.Unit.INSTANCE;
    }
}
