package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Authenticate", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "intent", "Lcom/paypal/oslo/feature/identity/api/Intent;", "onAuthenticationSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "authenticationContext", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "onAuthenticationCancel", "Lkotlin/Function0;", "onPassiveAuthenticationSuccess", "linkAccountType", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "loginEffectResolver", "Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;", "authOption", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "viewModel", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/api/Intent;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;Ljava/util/List;Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateViewModel;Landroidx/compose/runtime/Composer;II)V", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticateKt {
    /* JADX WARN: Removed duplicated region for block: B:139:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Authenticate(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.Intent intent, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        int i5;
        int i6;
        int i7;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel2;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType2;
        com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver2;
        final java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list2;
        final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15;
        int i9;
        androidx.compose.runtime.Composer composer3;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel4;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel5;
        int i10;
        com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver3;
        java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list3;
        com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1 authenticateKt$Authenticate$4$1;
        kotlin.Unit unit;
        int i11;
        java.lang.String str;
        int i12;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel6;
        java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list4;
        int i13;
        boolean z;
        java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list5;
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel7;
        int i14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-690637872);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(intent.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(authenticationContext) ? 2048 : 1024;
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function13 = function12;
            } else {
                function13 = function12;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(linkProfileOptionType == null ? -1 : linkProfileOptionType.ordinal()) ? 1048576 : 524288;
            }
            i6 = i2 & 128;
            int i16 = 12582912;
            if (i6 == 0) {
                if ((i & 12582912) == 0) {
                    i16 = (i & 16777216) == 0 ? startRestartGroup.changed(loginEffectResolver) : startRestartGroup.changedInstance(loginEffectResolver) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(list) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    if ((i2 & 512) == 0) {
                        authenticateViewModel2 = authenticateViewModel;
                        if (startRestartGroup.changedInstance(authenticateViewModel2)) {
                            i14 = 536870912;
                            i3 |= i14;
                        }
                    } else {
                        authenticateViewModel2 = authenticateViewModel;
                    }
                    i14 = 268435456;
                    i3 |= i14;
                } else {
                    authenticateViewModel2 = authenticateViewModel;
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 512) != 0) {
                            i8 &= -1879048193;
                        }
                        authenticateViewModel5 = authenticateViewModel2;
                        function05 = function02;
                        function16 = function13;
                        i9 = 0;
                        composer3 = startRestartGroup;
                        i10 = i8;
                        linkProfileOptionType3 = linkProfileOptionType;
                        loginEffectResolver3 = loginEffectResolver;
                        list3 = list;
                    } else {
                        if (i15 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit2;
                                        unit2 = kotlin.Unit.INSTANCE;
                                        return unit2;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function04 = function02;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt.$r8$lambda$vIZOu_xsCKMY_74xhKvRMARteZk((java.lang.String) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function15 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        } else {
                            function15 = function13;
                        }
                        com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType4 = i5 != 0 ? null : linkProfileOptionType;
                        com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver4 = i6 != 0 ? null : loginEffectResolver;
                        java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> listOf = i7 != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE) : list;
                        if ((i2 & 512) != 0) {
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
                            i9 = 0;
                            composer3 = startRestartGroup;
                            i8 &= -1879048193;
                            authenticateViewModel4 = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        } else {
                            i9 = 0;
                            composer3 = startRestartGroup;
                            authenticateViewModel4 = authenticateViewModel;
                        }
                        authenticateViewModel5 = authenticateViewModel4;
                        i10 = i8;
                        loginEffectResolver3 = loginEffectResolver4;
                        list3 = listOf;
                        linkProfileOptionType3 = linkProfileOptionType4;
                        function16 = function15;
                        function05 = function04;
                    }
                    composer3.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-690637872, i10, -1, "com.paypal.oslo.feature.identity.logincontroller.ui.Authenticate (Authenticate.kt:69)");
                    }
                    androidx.compose.runtime.Composer composer4 = composer3;
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer4, i9);
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(authenticateViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer4, 0, 7);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changed = composer4.changed(collectAsStateWithLifecycle);
                    java.lang.Object rememberedValue3 = composer4.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt.$r8$lambda$4vSOSBG_oaqDOTflcXmah6NvVTA(androidx.compose.runtime.State.this));
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.foundation.layout.BoxKt.Box(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion, (kotlin.jvm.functions.Function0) rememberedValue3, composer4, 6), composer4, i9);
                    boolean changedInstance = composer4.changedInstance(authenticateViewModel5);
                    java.lang.Object rememberedValue4 = composer4.rememberedValue();
                    if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        navResultManager = null;
                        authenticateKt$Authenticate$4$1 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1(authenticateViewModel5, null);
                        composer4.updateRememberedValue(authenticateKt$Authenticate$4$1);
                    } else {
                        authenticateKt$Authenticate$4$1 = rememberedValue4;
                        navResultManager = null;
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) authenticateKt$Authenticate$4$1;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer4, i9);
                    com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = composer4.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m15177invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m15177invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, composer4, 3072);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    boolean changedInstance2 = composer4.changedInstance(authenticateViewModel5);
                    int i17 = i10 & 112;
                    int i18 = i17 == 32 ? 1 : i9;
                    int i19 = (i10 & 14) == 4 ? 1 : 0;
                    boolean changed2 = composer4.changed(rememberNavResultRequestId);
                    int i20 = (i10 & 3670016) == 1048576 ? 1 : 0;
                    int i21 = 29360128 & i10;
                    int i22 = (i21 == 8388608 || ((i10 & 16777216) != 0 && composer4.changedInstance(loginEffectResolver3))) ? 1 : 0;
                    int i23 = (i10 & 896) == 256 ? 1 : 0;
                    java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list6 = list3;
                    int i24 = (458752 & i10) == 131072 ? 1 : 0;
                    int i25 = i10;
                    int i26 = (57344 & i10) == 16384 ? 1 : 0;
                    com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1 rememberedValue6 = composer4.rememberedValue();
                    if (((changedInstance2 ? 1 : 0) | i18 | i19 | (changed2 ? 1 : 0) | i20 | i22 | i23 | i24 | i26) != 0 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        unit = unit2;
                        i11 = i21;
                        str = rememberNavResultRequestId;
                        i12 = i17;
                        authenticateViewModel6 = authenticateViewModel5;
                        list4 = list6;
                        loginEffectResolver2 = loginEffectResolver3;
                        i13 = 32;
                        z = false;
                        rememberedValue6 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$5$1(authenticateViewModel5, intent, appNavigator, str, loginEffectResolver3, function1, function16, function05, linkProfileOptionType3, null);
                        composer2 = composer4;
                        composer2.updateRememberedValue(rememberedValue6);
                    } else {
                        i12 = i17;
                        unit = unit2;
                        str = rememberNavResultRequestId;
                        i11 = i21;
                        list4 = list6;
                        composer2 = composer4;
                        authenticateViewModel6 = authenticateViewModel5;
                        loginEffectResolver2 = loginEffectResolver3;
                        i13 = 32;
                        z = false;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer2, 6);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel8 = authenticateViewModel6;
                    boolean changedInstance3 = composer2.changedInstance(authenticateViewModel8);
                    boolean z2 = (i11 == 8388608 || ((i25 & 16777216) != 0 && composer2.changedInstance(loginEffectResolver2))) ? true : z;
                    java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list7 = list4;
                    boolean changedInstance4 = composer2.changedInstance(list7);
                    java.lang.String str2 = str;
                    boolean changed3 = composer2.changed(str2);
                    boolean z3 = i12 != i13 ? z : true;
                    boolean changedInstance5 = composer2.changedInstance(authenticationContext);
                    com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1 rememberedValue7 = composer2.rememberedValue();
                    if (((changedInstance3 | z2 | changedInstance4 | changed3 | z3) || changedInstance5) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        list5 = list7;
                        authenticateViewModel7 = authenticateViewModel8;
                        rememberedValue7 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1(authenticateViewModel8, loginEffectResolver2, list7, str2, intent, authenticationContext, null);
                        composer2.updateRememberedValue(rememberedValue7);
                    } else {
                        list5 = list7;
                        authenticateViewModel7 = authenticateViewModel8;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, composer2, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                    function14 = function16;
                    authenticateViewModel3 = authenticateViewModel7;
                    linkProfileOptionType2 = linkProfileOptionType3;
                    list2 = list5;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    linkProfileOptionType2 = linkProfileOptionType;
                    loginEffectResolver2 = loginEffectResolver;
                    list2 = list;
                    authenticateViewModel3 = authenticateViewModel;
                    function14 = function13;
                    function03 = function02;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver5 = loginEffectResolver2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt.m15175$r8$lambda$67Q23zM37lwbgC_CJhGU5TP1BM(com.paypal.oslo.core.navigation.AppNavigator.this, intent, function1, authenticationContext, function03, function14, linkProfileOptionType2, loginEffectResolver5, list2, authenticateViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= i16;
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        i6 = i2 & 128;
        int i162 = 12582912;
        if (i6 == 0) {
        }
        i3 |= i162;
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 306783379) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ boolean $r8$lambda$4vSOSBG_oaqDOTflcXmah6NvVTA(androidx.compose.runtime.State state) {
        return ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState) state.getValue()) instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth;
    }

    /* renamed from: $r8$lambda$67Q23zM37lwb-gC_CJhGU5TP1BM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15175$r8$lambda$67Q23zM37lwbgC_CJhGU5TP1BM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.Intent intent, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType linkProfileOptionType, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, java.util.List list, com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Authenticate(appNavigator, intent, function1, authenticationContext, function0, function12, linkProfileOptionType, loginEffectResolver, list, authenticateViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vIZOu_xsCKMY_74xhKvRMARteZk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
