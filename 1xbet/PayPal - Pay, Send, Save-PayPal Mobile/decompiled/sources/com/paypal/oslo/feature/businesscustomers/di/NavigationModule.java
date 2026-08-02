package com.paypal.oslo.feature.businesscustomers.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;", "businessCustomerFeatureGateManager", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesscustomers.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.businesscustomers.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessCustomerFeatureGateManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$eE8tMlppJvTh9VsRE4VRvAQZg50(com.paypal.oslo.core.navigation.AppNavigator.this, businessCustomerFeatureGateManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$0FBPg1uuT1G-6s4NhZBrtec71So, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12724$r8$lambda$0FBPg1uuT1G6s4NhZBrtec71So(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final boolean z, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipient, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12751$r8$lambda$ycfogIoLoc8t3eZyoZGew8m6iU(z, recipient, customersPresentationMode, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1AATBqQnXIvRva7VzolBim6ysQk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1Y3ee-JplSIWi3KbyY9CI-EEIcU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12725$r8$lambda$1Y3eeJplSIWi3KbyY9CIEEIcU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$vBpDetyZuVmObSIick7rS0L4Kb0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2VuiBgXif5OxsMuU7V_SlviPHjs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2jrkqdbZivilI27N4P1dSaX82sk(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination internalCreateCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalCreateCustomerDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(internalCreateCustomerDestination) : composer.changedInstance(internalCreateCustomerDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(645826535, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.internalCreateCustomerDestination.<anonymous> (NavigationModule.kt:163)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1514392441, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$iBqqbjYx4sZDzXva7PZ1bLCcvFk(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2yQtx7z9sgd-qnBnpcNoE6aU_Mo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12726$r8$lambda$2yQtx7z9sgdqnBnpcNoE6aU_Mo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3P6jyf72Xb_u3xc0r-WZt-coRsE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12727$r8$lambda$3P6jyf72Xb_u3xc0rWZtcoRsE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$KbACTzQpBZAsmRz5O6pcCa2zE3M(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$45jSRRbWaz9jkdmMlNQolGD1iwU(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination addEmailModalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailModalDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addEmailModalDestination) : composer.changedInstance(addEmailModalDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-560639855, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.addEmailModalDestination.<anonymous> (NavigationModule.kt:361)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1324397731, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12734$r8$lambda$GGOV3pZNiLiOndab5RYW3ST4Q(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5JVVh2sjeESFvE1IMiLfsZyi-j4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12728$r8$lambda$5JVVh2sjeESFvE1IMiLfsZyij4(final com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination editNotesDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(957988057, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.editNotesDestination.<anonymous>.<anonymous> (NavigationModule.kt:338)");
            }
            boolean changedInstance = composer.changedInstance(editNotesDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$zvbgfQQxY8ZCYG6IEMs1PvWNEbY(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$bzspvi9tXqmfJ3b4cEmHpASkgoI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesScreenKt.EditNotesScreen(editNotesViewModel, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6Gb-kdLEmJWw2-6LYjnuwzwhK7s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12729$r8$lambda$6GbkdLEmJWw26LYjnuwzwhK7s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$KkfbV7aVLjcPHrWS3WLcQ5F6yiI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7JutbRcJwgEAKSOOVOIZ-CHwnKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12730$r8$lambda$7JutbRcJwgEAKSOOVOIZCHwnKk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination(customer));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7tecATrT60j58ruzneo5CgNphe4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.CustomerNavResult(customer));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8or-K4j0uuPDvE4RTzp-IGt7cC8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12731$r8$lambda$8orK4j0uuPDvE4RTzpIGt7cC8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Auohxk9t_Ibng2hBOOWOCv0-kic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12732$r8$lambda$Auohxk9t_Ibng2hBOOWOCv0kic(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$iAkl8KpiXb6p_F12YSLB4sBwsm8(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, customersPresentationMode, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G5W5J5X5iqLJKKsgNyKOCokk-mc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12733$r8$lambda$G5W5J5X5iqLJKKsgNyKOCokkmc(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination(select));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GGOV3pZ-NiLiOn-dab5RYW3ST4Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12734$r8$lambda$GGOV3pZNiLiOndab5RYW3ST4Q(final com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination addEmailModalDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1324397731, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.addEmailModalDestination.<anonymous>.<anonymous> (NavigationModule.kt:365)");
            }
            boolean changedInstance = composer.changedInstance(addEmailModalDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12743$r8$lambda$dqAyguP5Af9Dyv8nCs3Jd7XHHg(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel = (com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            androidx.compose.ui.Modifier fillMaxHeight = androidx.compose.foundation.layout.SizeKt.fillMaxHeight(androidx.compose.ui.Modifier.INSTANCE, 0.5f);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$UBZHJ6QinVXviyqyB2RWNFBmutI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.AddEmailScreen(addEmailViewModel, fillMaxHeight, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel $r8$lambda$HuE42WH9w6ddNoYfY7HM_9PTsa4(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(select);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IbYSOnoPAxJfjx_A7Fpj8qPjRcE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel $r8$lambda$IfWVoWCn9JOaEEDOeQshAGnFFUg(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination editCustomerDestination, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit(editCustomerDestination.getCustomer()), new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(true));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J81I3WAKcP1h4k0Tpgwvr7uQMRw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipient, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$gcj38gW7sVwtsjFR9cseyoIVF3k(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.this, recipient, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JEkqlmYCTHk8t_e6q7X18lEusk4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$p_mCiFUrMq9r4dlyEntXvfAI0l8(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, select, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KbACTzQpBZAsmRz5O6pcCa2zE3M(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination(view));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KkfbV7aVLjcPHrWS3WLcQ5F6yiI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mcc41lr_RJOi6L9S2OU6skj9tpA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12745$r8$lambda$nVihwwOFZ7BHpxE20iBygYr7x4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NNZ0UZwqbB1B1gZQOeIfyAjWZYk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination(customer, view));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OALf89xLCB4M4UI2cAZzVAF2jCU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$1AATBqQnXIvRva7VzolBim6ysQk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PI4IWeKafyQ3-nyWUkbL0n6cPcc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12735$r8$lambda$PI4IWeKafyQ3nyWUkbL0n6cPcc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$NNZ0UZwqbB1B1gZQOeIfyAjWZYk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, view, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PqU-MiUwVmIUNJHTqdo2_FH9gE8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12736$r8$lambda$PqUMiUwVmIUNJHTqdo2_FH9gE8(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination customerProfileDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerProfileDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(customerProfileDestination) : composer.changedInstance(customerProfileDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1586149089, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.customerProfileDestination.<anonymous> (NavigationModule.kt:276)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-293841871, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$g9vV3dL66eUl5TvzcF59h1PPoWw(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RLpVwVEdK9vE8d-dZ9cgVRlNarU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12737$r8$lambda$RLpVwVEdK9vE8ddZ9cgVRlNarU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$XRJa5AKi6bBT0is_0jaHzm8AOco((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TLSlt-C9Fk6Zk50kEcp0urzUFVs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12738$r8$lambda$TLSltC9Fk6Zk50kEcp0urzUFVs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UBZHJ6QinVXviyqyB2RWNFBmutI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$gcpGtOq8ymlvo0b70L0qg_iLOnA(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uq5HZQMkD_oCdj1D6NCgp3-Edjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12739$r8$lambda$Uq5HZQMkD_oCdj1D6NCgp3Edjk(final com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1856702169, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.createCustomerDestination.<anonymous>.<anonymous> (NavigationModule.kt:197)");
            }
            boolean changedInstance = composer.changedInstance(createCustomerDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$k0zgLXdwmvMZKMXz4UFwVe7NNRI(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$rbn6jU4uE0uMe2WjyPuxhP2I1Ss(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$zffa71gAnTTlTA628MRhczSmTjE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormScreenKt.CustomerFormScreen(customerFormViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VloNsCU0KQlWhrEhJiTDnt9RSKo(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination viewCustomersListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewCustomersListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1814590183, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.viewCustomersListDestination.<anonymous> (NavigationModule.kt:88)");
        }
        com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1587626197, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12748$r8$lambda$v0kM58Igw19E2u6RegQs5zTsM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XRJa5AKi6bBT0is_0jaHzm8AOco(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XjXugXY_bnttexrNMNgs9GIoga4(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination editCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editCustomerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2101529799, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.editCustomerDestination.<anonymous> (NavigationModule.kt:251)");
        }
        com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1293152935, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$Y5tlA9GDnRL3FL2MUITxaOfkwHQ(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y5tlA9GDnRL3FL2MUITxaOfkwHQ(final com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination editCustomerDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1293152935, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.editCustomerDestination.<anonymous>.<anonymous> (NavigationModule.kt:255)");
            }
            boolean changedInstance = composer.changedInstance(editCustomerDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$IfWVoWCn9JOaEEDOeQshAGnFFUg(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12725$r8$lambda$1Y3eeJplSIWi3KbyY9CIEEIcU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$bK1J8qd7mTMHIHTr1KFG50DlJJQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormScreenKt.CustomerFormScreen(customerFormViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YDuv3KRy8LoBPWr2uULevbpTGtU(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination editNotesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(editNotesDestination) : composer.changedInstance(editNotesDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1033381575, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.editNotesDestination.<anonymous> (NavigationModule.kt:334)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(957988057, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12728$r8$lambda$5JVVh2sjeESFvE1IMiLfsZyij4(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_zam-ba-ZOsujPgWYPf9kZE4Oio, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12740$r8$lambda$_zambaZOsujPgWYPf9kZE4Oio(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        if (((java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) customer.getEmails())) != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12747$r8$lambda$pcb529kBa7OU2unX2VJ3wJVx0(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$agAubHPnz8NF-u2uImVyLb0kOzc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12741$r8$lambda$agAubHPnz8NFu2uImVyLb0kOzc(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination selectCustomerDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1240041177, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.selectCustomerDestination.<anonymous>.<anonymous> (NavigationModule.kt:125)");
            }
            final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select = new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(selectCustomerDestination.getRequireEmail());
            boolean changed = composer.changed(select);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$HuE42WH9w6ddNoYfY7HM_9PTsa4(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.this, (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed2 = composer.changed(appNavigator);
            boolean changed3 = composer.changed(select);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$JEkqlmYCTHk8t_e6q7X18lEusk4(com.paypal.oslo.core.navigation.AppNavigator.this, select, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed4 = composer.changed(appNavigator);
            boolean changed5 = composer.changed(select);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed4 | changed5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$qIB7_MwAK59VrkwDzsXThhdM8sQ(com.paypal.oslo.core.navigation.AppNavigator.this, select);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed6 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12729$r8$lambda$6GbkdLEmJWw26LYjnuwzwhK7s(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changed7 = composer.changed(appNavigator);
            boolean changed8 = composer.changed(select);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if ((changed7 | changed8) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$J81I3WAKcP1h4k0Tpgwvr7uQMRw(com.paypal.oslo.core.navigation.AppNavigator.this, select, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.CustomersListScreen(customersListViewModel, function12, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bK1J8qd7mTMHIHTr1KFG50DlJJQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$7tecATrT60j58ruzneo5CgNphe4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel $r8$lambda$bOWSvzcQvK3s8ksZ13N7gHTVsfo(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(view);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bzspvi9tXqmfJ3b4cEmHpASkgoI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12738$r8$lambda$TLSltC9Fk6Zk50kEcp0urzUFVs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c_WWUdDWt9Dhb-4pmOqrS5G4rtg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel m12742$r8$lambda$c_WWUdDWt9Dhb4pmOqrS5G4rtg(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination internalCreateCustomerDestination, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Create(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null)), internalCreateCustomerDestination.getPresentationMode());
    }

    /* renamed from: $r8$lambda$dqAyguP5Af9Dyv8nCs3J-d7XHHg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel m12743$r8$lambda$dqAyguP5Af9Dyv8nCs3Jd7XHHg(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination addEmailModalDestination, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(addEmailModalDestination.getCustomer(), addEmailModalDestination.getPresentationMode());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eE8tMlppJvTh9VsRE4VRvAQZg50(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1814590183, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$VloNsCU0KQlWhrEhJiTDnt9RSKo(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$viewCustomersListDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination viewCustomersListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(viewCustomersListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$viewCustomersListDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.ViewCustomersListDestination viewCustomersListDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2099847353, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$zLQ8N2MKE37eNCg4x00Fk4bNhw4(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$selectCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination selectCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(selectCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$selectCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination selectCustomerDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(645826535, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$2jrkqdbZivilI27N4P1dSaX82sk(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$internalCreateCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination internalCreateCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(internalCreateCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$internalCreateCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination internalCreateCustomerDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1483186361, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12750$r8$lambda$vZMgadHLzK6b793YnX_pgb3XYc(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$createCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(createCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$createCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-331259225, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$fgaXO8KMrOsC2620hSm_0GP5RYY(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$internalEditCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination internalEditCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(internalEditCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$internalEditCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination internalEditCustomerDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2101529799, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$XjXugXY_bnttexrNMNgs9GIoga4(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$editCustomerDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination editCustomerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editCustomerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$editCustomerDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.api.navigation.EditCustomerDestination editCustomerDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1586149089, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12736$r8$lambda$PqUMiUwVmIUNJHTqdo2_FH9gE8(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$customerProfileDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination customerProfileDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(customerProfileDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$customerProfileDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination customerProfileDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1033381575, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$YDuv3KRy8LoBPWr2uULevbpTGtU(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$editNotesDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination editNotesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editNotesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$editNotesDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination editNotesDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-560639855, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$45jSRRbWaz9jkdmMlNQolGD1iwU(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$addEmailModalDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination addEmailModalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addEmailModalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$addEmailModalDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination addEmailModalDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v0kM-58Igw19E2u6RegQ-s5zTsM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12748$r8$lambda$v0kM58Igw19E2u6RegQs5zTsM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1587626197, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.viewCustomersListDestination.<anonymous>.<anonymous> (NavigationModule.kt:92)");
            }
            final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view = com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$bOWSvzcQvK3s8ksZ13N7gHTVsfo(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.this, (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12735$r8$lambda$PI4IWeKafyQ3nyWUkbL0n6cPcc(com.paypal.oslo.core.navigation.AppNavigator.this, view, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12727$r8$lambda$3P6jyf72Xb_u3xc0rWZtcoRsE(com.paypal.oslo.core.navigation.AppNavigator.this, view);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12737$r8$lambda$RLpVwVEdK9vE8ddZ9cgVRlNarU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.CustomersListScreen(customersListViewModel, function12, function0, (kotlin.jvm.functions.Function0) rememberedValue4, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gcj38gW7sVwtsjFR9cseyoIVF3k(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (select.getRequireEmail() && (recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient)) {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient customerRecipient = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) recipient;
            if (customerRecipient.getCustomer().getEmails().isEmpty()) {
                navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination(customerRecipient.getCustomer(), select));
                return kotlin.Unit.INSTANCE;
            }
        }
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult(recipient));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p_mCiFUrMq9r4dlyEntXvfAI0l8(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination(customer, select));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zLQ8N2MKE37eNCg4x00Fk4bNhw4(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination selectCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectCustomerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2099847353, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.selectCustomerDestination.<anonymous> (NavigationModule.kt:121)");
        }
        com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1240041177, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12741$r8$lambda$agAubHPnz8NFu2uImVyLb0kOzc(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qIB7_MwAK59VrkwDzsXThhdM8sQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12733$r8$lambda$G5W5J5X5iqLJKKsgNyKOCokkmc(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iBqqbjYx4sZDzXva7PZ1bLCcvFk(final com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination internalCreateCustomerDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1514392441, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.internalCreateCustomerDestination.<anonymous>.<anonymous> (NavigationModule.kt:167)");
            }
            boolean changedInstance = composer.changedInstance(internalCreateCustomerDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12742$r8$lambda$c_WWUdDWt9Dhb4pmOqrS5G4rtg(com.paypal.oslo.feature.businesscustomers.navigation.InternalCreateCustomerDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$OALf89xLCB4M4UI2cAZzVAF2jCU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$Mcc41lr_RJOi6L9S2OU6skj9tpA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormScreenKt.CustomerFormScreen(customerFormViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nVihwwOFZ7BHp-xE20iBygYr7x4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12745$r8$lambda$nVihwwOFZ7BHpxE20iBygYr7x4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient(customer)));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel $r8$lambda$k0zgLXdwmvMZKMXz4UFwVe7NNRI(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Create(createCustomerDestination.getInput()), new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(true));
    }

    /* renamed from: $r8$lambda$vZMgadHLzK6b793YnX-_pgb3XYc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12750$r8$lambda$vZMgadHLzK6b793YnX_pgb3XYc(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCustomerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1483186361, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.createCustomerDestination.<anonymous> (NavigationModule.kt:193)");
        }
        com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1856702169, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12739$r8$lambda$Uq5HZQMkD_oCdj1D6NCgp3Edjk(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rbn6jU4uE0uMe2WjyPuxhP2I1Ss(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12726$r8$lambda$2yQtx7z9sgdqnBnpcNoE6aU_Mo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fgaXO8KMrOsC2620hSm_0GP5RYY(com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination internalEditCustomerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalEditCustomerDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(internalEditCustomerDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-331259225, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.internalEditCustomerDestination.<anonymous> (NavigationModule.kt:226)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.common.FeatureDisabledScreenKt.ShowContentOrFeatureDisabledScreen(businessCustomerFeatureGateManager.isFeatureEnabled(), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(676020025, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$pErDjVJa8XfqwE8QIu79VGBtn6M(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination.this, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ryd5nmrvEjXAdQBN2uv_ll7eLcs(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.CustomerNavResult(customer));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zffa71gAnTTlTA628MRhczSmTjE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$ryd5nmrvEjXAdQBN2uv_ll7eLcs(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h1pZ926SFppc3vOgsauBEpNF6ZY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$IbYSOnoPAxJfjx_A7Fpj8qPjRcE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pErDjVJa8XfqwE8QIu79VGBtn6M(final com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination internalEditCustomerDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(676020025, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.internalEditCustomerDestination.<anonymous>.<anonymous> (NavigationModule.kt:230)");
            }
            boolean changed = composer.changed(internalEditCustomerDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12749$r8$lambda$vOri9AYpxuwNyAvh9O5yLBAS7E(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12746$r8$lambda$ovqCBMmHXaehcowSMlBA2EvBHY(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$h1pZ926SFppc3vOgsauBEpNF6ZY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormScreenKt.CustomerFormScreen(customerFormViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ovqCBMmHX-aehcowSMlBA2EvBHY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12746$r8$lambda$ovqCBMmHXaehcowSMlBA2EvBHY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$2VuiBgXif5OxsMuU7V_SlviPHjs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vOri9A-YpxuwNyAvh9O5yLBAS7E, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel m12749$r8$lambda$vOri9AYpxuwNyAvh9O5yLBAS7E(com.paypal.oslo.feature.businesscustomers.navigation.InternalEditCustomerDestination internalEditCustomerDestination, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType.Edit(internalEditCustomerDestination.getCustomer()), com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g9vV3dL66eUl5TvzcF59h1PPoWw(final com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination customerProfileDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-293841871, i, -1, "com.paypal.oslo.feature.businesscustomers.di.NavigationModule.customerProfileDestination.<anonymous>.<anonymous> (NavigationModule.kt:280)");
            }
            final com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode = customerProfileDestination.getPresentationMode();
            final boolean z = (presentationMode instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) && ((com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select) presentationMode).getRequireEmail();
            boolean changedInstance = composer.changedInstance(customerProfileDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12744$r8$lambda$kXU1nUuTdB2TKnC2mTs1V8Gf5M(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination.this, (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel = (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$iyCBdPEI42PAgv3h6fFK5D2cUO0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.$r8$lambda$wlp8nP9CjgU06cqWwYvUnITrkJE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed3 = composer.changed(appNavigator);
            boolean changed4 = composer.changed(z);
            boolean changedInstance2 = composer.changedInstance(presentationMode);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed3 | changed4 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12724$r8$lambda$0FBPg1uuT1G6s4NhZBrtec71So(com.paypal.oslo.core.navigation.AppNavigator.this, z, presentationMode, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            boolean changed5 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12740$r8$lambda$_zambaZOsujPgWYPf9kZE4Oio(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean changed6 = composer.changed(appNavigator);
            boolean changedInstance3 = composer.changedInstance(presentationMode);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if ((changed6 | changedInstance3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12732$r8$lambda$Auohxk9t_Ibng2hBOOWOCv0kic(com.paypal.oslo.core.navigation.AppNavigator.this, presentationMode, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileScreenKt.CustomerProfileScreen(customerProfileViewModel, function0, function12, function13, function14, (kotlin.jvm.functions.Function1) rememberedValue6, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vBpDetyZuVmObSIick7rS0L4Kb0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kXU1nUuTdB2TKnC-2mTs1V8Gf5M, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel m12744$r8$lambda$kXU1nUuTdB2TKnC2mTs1V8Gf5M(com.paypal.oslo.feature.businesscustomers.navigation.CustomerProfileDestination customerProfileDestination, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(customerProfileDestination.getCustomer(), customerProfileDestination.getPresentationMode());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iyCBdPEI42PAgv3h6fFK5D2cUO0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12731$r8$lambda$8orK4j0uuPDvE4RTzpIGt7cC8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wlp8nP9CjgU06cqWwYvUnITrkJE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesscustomers.di.NavigationModule.m12730$r8$lambda$7JutbRcJwgEAKSOOVOIZCHwnKk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ycfogIoLoc8t3eZy-oZGew8m6iU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12751$r8$lambda$ycfogIoLoc8t3eZyoZGew8m6iU(boolean z, com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (z && (recipient instanceof com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient)) {
            com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient customerRecipient = (com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient) recipient;
            if (customerRecipient.getCustomer().getEmails().isEmpty()) {
                navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.AddEmailModalDestination(customerRecipient.getCustomer(), customersPresentationMode));
                return kotlin.Unit.INSTANCE;
            }
        }
        navigationScope.setResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult(recipient));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey.class));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iAkl8KpiXb6p_F12YSLB4sBwsm8(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination(customer, customersPresentationMode));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pcb529kBa7OU-2unX2VJ3-wJVx0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12747$r8$lambda$pcb529kBa7OU2unX2VJ3wJVx0(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDestination(new com.paypal.oslo.feature.businesspayandgetpaid.api.InvoiceAction.Create(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.toPayAndGetPaidCustomer(customer)), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel $r8$lambda$zvbgfQQxY8ZCYG6IEMs1PvWNEbY(com.paypal.oslo.feature.businesscustomers.navigation.EditNotesDestination editNotesDestination, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(editNotesDestination.getCustomer(), editNotesDestination.getPresentationMode());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gcpGtOq8ymlvo0b70L0qg_iLOnA(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.businesscustomers.api.navigation.result.RecipientSelectedNavResult(new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerRecipient(customer)));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey.class));
        return kotlin.Unit.INSTANCE;
    }
}
