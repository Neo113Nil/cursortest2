package com.paypal.oslo.feature.identity.logincontroller;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/LoginFlowControllerImpl;", "Lcom/paypal/oslo/feature/identity/logincontroller/domain/LoginFlowController;", "Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;", "loginEffectResolver", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "rememberedUserStorage", "Lcom/paypal/oslo/feature/identity/login/domain/ProcessAuthIntentUseCase;", "processAuthIntentUseCase", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/PostLoginDeviceBindUseCase;", "postLoginDeviceBindUseCase", "Lkotlinx/coroutines/CoroutineScope;", "ioScope", "<init>", "(Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;Lcom/paypal/oslo/feature/identity/login/domain/ProcessAuthIntentUseCase;Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/PostLoginDeviceBindUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "", "clear$identity_prodRelease", "()V", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "loginFlowEffect", "handleEffect", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/logincontroller/LoginEffectResolver;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "Lcom/paypal/oslo/feature/identity/login/domain/ProcessAuthIntentUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/PostLoginDeviceBindUseCase;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineScope;", "getInputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoginFlowControllerImpl implements com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public LoginFlowControllerImpl(com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase processAuthIntentUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginEffectResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedUserStorageWithProfile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processAuthIntentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoginDeviceBindUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = loginEffectResolver;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = userStore;
        this.getHighSpeedVideoFpsRanges = rememberedUserStorageWithProfile;
        this.getHighSpeedVideoFpsRangesFor = processAuthIntentUseCase;
        this.getOutputMinFrameDuration = postLoginDeviceBindUseCase;
        this.getHighSpeedVideoSizesFor = coroutineScope;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain()));
        this.getInputSizeshNQ4ISI = CoroutineScope;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(userStore.getUserState(), new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1(this, null)), CoroutineScope);
    }

    public final void clear$identity_prodRelease() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getInputSizeshNQ4ISI, null, 1, null);
    }

    @Override // com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController
    public final void handleEffect(final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect loginFlowEffect) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowEffect, "");
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess loginSuccess = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess) loginFlowEffect;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1(this, loginSuccess.getAuthIntent(), loginSuccess.getPostAuthOperations(), loginSuccess.getToken(), null), 3, null);
            return;
        }
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed) {
            final com.paypal.oslo.feature.identity.login.domain.model.AuthError authError = new com.paypal.oslo.feature.identity.login.domain.model.AuthError(((com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed) loginFlowEffect).getError());
            java.util.List<androidx.navigation3.runtime.NavKey> backStack = this.getHighSpeedVideoSizes.getBackStack();
            java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                androidx.navigation3.runtime.NavKey previous = listIterator.previous();
                if (previous instanceof com.paypal.oslo.feature.identity.api.navigation.AuthenticationFlowDestination) {
                    r1 = previous;
                    break;
                }
            }
            final androidx.navigation3.runtime.NavKey navKey = r1;
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.m15173$r8$lambda$khDstXxav3g7VEhylLtFYVLbmw(com.paypal.oslo.feature.identity.login.domain.model.LoginError.this, navKey, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.$r8$lambda$Oq1wBNg6exNXmpFeYNGW_ClcJFI(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.this, loginFlowEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Back) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.m15172$r8$lambda$fwYpamUBYNVxewp_nazxuC7P1M((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess) {
            final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess passiveLoginSuccess = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess) loginFlowEffect;
            final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = passiveLoginSuccess.getUserAccessTokenData();
            java.util.List<androidx.navigation3.runtime.NavKey> backStack2 = this.getHighSpeedVideoSizes.getBackStack();
            java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator2 = backStack2.listIterator(backStack2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                androidx.navigation3.runtime.NavKey previous2 = listIterator2.previous();
                if (previous2 instanceof com.paypal.oslo.feature.identity.api.navigation.AuthenticationFlowDestination) {
                    r1 = previous2;
                    break;
                }
            }
            final androidx.navigation3.runtime.NavKey navKey2 = r1;
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.m15174$r8$lambda$sVDs6nfeMjvKMNRXttKK69U80(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData.this, passiveLoginSuccess, navKey2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.$r8$lambda$XwPSvdL7C68CWu9vHqAzH2RXwao(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.this, loginFlowEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (!(loginFlowEffect instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Cancel)) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.$r8$lambda$rnZ_sBgHxYexDsvbUSktVgwq6Qc(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.this, loginFlowEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        java.util.List<androidx.navigation3.runtime.NavKey> backStack3 = this.getHighSpeedVideoSizes.getBackStack();
        java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator3 = backStack3.listIterator(backStack3.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                i = -1;
                break;
            } else if (listIterator3.previous() instanceof com.paypal.oslo.feature.identity.api.navigation.AuthenticationFlowDestination) {
                i = listIterator3.nextIndex();
                break;
            }
        }
        r1 = i > 0 ? backStack3.get(i - 1) : null;
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl.m15171$r8$lambda$MihuhJO5H34uyNjeyJXIw1mWo(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$MihuhJO5H34uy-NjeyJXIw1-mWo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15171$r8$lambda$MihuhJO5H34uyNjeyJXIw1mWo(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (navKey != null) {
            navigationScope.popTo(navKey);
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oq1wBNg6exNXmpFeYNGW_ClcJFI(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect loginFlowEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(loginFlowControllerImpl.getHighResolutionOutputSizeshNQ4ISI.resolve(loginFlowEffect));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XwPSvdL7C68CWu9vHqAzH2RXwao(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect loginFlowEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        androidx.navigation3.runtime.NavKey resolve = loginFlowControllerImpl.getHighResolutionOutputSizeshNQ4ISI.resolve(loginFlowEffect);
        if (((com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry) loginFlowEffect).getReplaceTop()) {
            navigationScope.replaceTop(resolve);
        } else {
            navigationScope.push(resolve);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fwYpamUBYNVxewp_nazxuC7P1-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15172$r8$lambda$fwYpamUBYNVxewp_nazxuC7P1M(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$khDstXxav3g7VEhylLtF-YVLbmw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15173$r8$lambda$khDstXxav3g7VEhylLtFYVLbmw(com.paypal.oslo.feature.identity.login.domain.model.LoginError loginError, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(loginError, "");
        navigationScope.setResult(new com.paypal.oslo.feature.identity.navigation.result.AuthenticationFailureNavResult(((com.paypal.oslo.feature.identity.login.domain.model.AuthError) loginError).getMsg()));
        if (navKey != null) {
            navigationScope.popTo(navKey);
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rnZ_sBgHxYexDsvbUSktVgwq6Qc(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect loginFlowEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(loginFlowControllerImpl.getHighResolutionOutputSizeshNQ4ISI.resolve(loginFlowEffect));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sVD-s6n-feMjvKMNRXttKK69U80, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15174$r8$lambda$sVDs6nfeMjvKMNRXttKK69U80(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess passiveLoginSuccess, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult(userAccessTokenData.getAccessToken(), true, passiveLoginSuccess.getPassiveLoginFlowType()));
        if (navKey != null) {
            navigationScope.popTo(navKey);
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }
}
