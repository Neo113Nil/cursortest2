package com.paypal.oslo.feature.businesshome.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/businesshome/ui/webview/WebUrls;", "webUrls", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideBusinessHomeEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/businesshome/ui/webview/WebUrls;)Lkotlin/jvm/functions/Function1;", "provideAccountSetupSheetEntry", "provideWebViewEntry", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideBusinessExperienceDisabledEntry", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesshome.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.businesshome.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessHomeEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webUrls, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$mFYc1sTfHoLn79TIkNh57vStJIM(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAccountSetupSheetEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webUrls, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12882$r8$lambda$AghyybVXXbhVy3emUbMGuyjuRQ(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideWebViewEntry(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$QrF4HaGF9xwgie6TEeio6oW0wJQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-Ki06_5xucCAVtlLYZt-zqbui0A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12880$r8$lambda$Ki06_5xucCAVtlLYZtzqbui0A(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$W3r4RyEn7PWqf0BKFQf6ajnpYxM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-UCtl5EzO855uoY88MpBrJ9OXbI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12881$r8$lambda$UCtl5EzO855uoY88MpBrJ9OXbI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("business_home", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4ZJyEelKQiL03xxtLh3CpXXaHI4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12884$r8$lambda$EfFWRiuAwK66T9HdV3w3uIbVX0(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5tc3R7_t1zcywIPm69JpYKRvquM(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination(webUrls.getDisputes(), "disputes"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$65XxjpJmkda7SlLphxJEoy5vqlk(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination(webUrls.getAccountVerification(), "account-verification"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$87KuQjbueVWohfprs81I7YpMqZE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination webViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(webViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1950187368, i, -1, "com.paypal.oslo.feature.businesshome.di.NavigationModule.provideWebViewEntry.<anonymous>.<anonymous> (NavigationModule.kt:242)");
            }
            com.paypal.oslo.feature.businesshome.ui.webview.WebViewScreenKt.WebViewScreen(appNavigator, webViewDestination, null, composer, (i << 3) & 112, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AghyybVXXbhVy3emUbMG-uyjuRQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12882$r8$lambda$AghyybVXXbhVy3emUbMGuyjuRQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$TZSTE_ja9d5_HcMXV0CMiYomd30(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 83, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1465304420, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$TE5hXULEW85Pxa8fcVCRG1vHXoQ(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls, (com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideAccountSetupSheetEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination accountSetupSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSetupSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideAccountSetupSheetEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination accountSetupSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AkMHDNYVBaoxnnoBqSl8ZqVqmIQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination businessHomeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessHomeDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1951274788, i, -1, "com.paypal.oslo.feature.businesshome.di.NavigationModule.provideBusinessHomeEntry.<anonymous>.<anonymous> (NavigationModule.kt:66)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$LOTA9fZ7v6D1Yr2l1moKcsU6nnw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(webUrls);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12889$r8$lambda$k0Nhc0nNtOwbp3zkIV7t1_jeGY(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean changedInstance2 = composer.changedInstance(webUrls);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$Z0lTnTWd4kuorkmWdtxbZaNAB4Y(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            boolean changedInstance3 = composer.changedInstance(webUrls);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed4 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$pwMy7w_0fqfOm5pMh4SXn1hBSq0(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changed5 = composer.changed(appNavigator);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$qHn1F3s480SHsayXk85gWU6NA5Y(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue5;
            boolean changed6 = composer.changed(appNavigator);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changed6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$Dqm65hNcKzU7_lD1O4rW_blFTDg(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue6;
            boolean changed7 = composer.changed(appNavigator);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if (changed7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12891$r8$lambda$tyKM4LFMaIzJCXGiz4GQarylWU(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue7;
            boolean changed8 = composer.changed(appNavigator);
            java.lang.Object rememberedValue8 = composer.rememberedValue();
            if (changed8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$4ZJyEelKQiL03xxtLh3CpXXaHI4(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue8;
            boolean changed9 = composer.changed(appNavigator);
            java.lang.Object rememberedValue9 = composer.rememberedValue();
            if (changed9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$i8pK1vMflMVSfGUs8sh_5vYHOLE(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue9;
            boolean changed10 = composer.changed(appNavigator);
            java.lang.Object rememberedValue10 = composer.rememberedValue();
            if (changed10 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$OEDISX2d2AzZ9faidFJDw5m7bZ8(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue10;
            boolean changed11 = composer.changed(appNavigator);
            java.lang.Object rememberedValue11 = composer.rememberedValue();
            if (changed11 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12890$r8$lambda$kRJ9wwcgdluztCztAffFhEXLwA(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue11;
            boolean changed12 = composer.changed(appNavigator);
            java.lang.Object rememberedValue12 = composer.rememberedValue();
            if (changed12 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$JArpRUSNU0R1lpEOtZT6oKo9uaI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) rememberedValue12;
            boolean changed13 = composer.changed(appNavigator);
            java.lang.Object rememberedValue13 = composer.rememberedValue();
            if (changed13 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$cmVistNBglAXixG0KSsUD6HdY0M(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeScreenKt.BusinessHomeScreen(function0, function02, function03, function04, function05, function1, function12, function13, function14, function06, function07, function08, (kotlin.jvm.functions.Function0) rememberedValue13, null, null, composer, 0, 0, 24576);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CnAFsLNZvgz2tS16fA7sqiWjr7Q(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination(webUrls.getAccountVerification(), "business_home"));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DBc3I8ZtQP-PQ4UFOyprSeGxB4Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12883$r8$lambda$DBc3I8ZtQPPQ4UFOyprSeGxB4Y(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("business_home", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dqm65hNcKzU7_lD1O4rW_blFTDg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12885$r8$lambda$GuHjBySNtqkykbwvjY9PfaQ0nY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EfFWRiuAwK66T9HdV3w3-uIbVX0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12884$r8$lambda$EfFWRiuAwK66T9HdV3w3uIbVX0(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessInvoiceDetailsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GuHjBySNtqkykbwvjY9Pf-aQ0nY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12885$r8$lambda$GuHjBySNtqkykbwvjY9PfaQ0nY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("business_home", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H7LY_K-NFL-lHi-h44H5mXc8A48, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12886$r8$lambda$H7LY_KNFLlHih44H5mXc8A48(androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$392440904$business_home_prodRelease = com.paypal.oslo.feature.businesshome.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$392440904$business_home_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideBusinessExperienceDisabledEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination businessExperienceDisabledDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessExperienceDisabledDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideBusinessExperienceDisabledEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination businessExperienceDisabledDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) lambda$392440904$business_home_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JArpRUSNU0R1lpEOtZT6oKo9uaI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$bp8IxMOxq382GTOX1Il4rGrSrag((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LOTA9fZ7v6D1Yr2l1moKcsU6nnw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$QwxlN7BKb1bE0OCoQXNyWL4BPyo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O3r40ligGglY9czTtm1osiFny5Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$fb3EZhKnpAm0oMQvP922IM_GkgE(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OEDISX2d2AzZ9faidFJDw5m7bZ8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12893$r8$lambda$xghPlYjbFk4OWUlADb_QMmtmm4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QrF4HaGF9xwgie6TEeio6oW0wJQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1950187368, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$87KuQjbueVWohfprs81I7YpMqZE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideWebViewEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination webViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(webViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideWebViewEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination webViewDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QwxlN7BKb1bE0OCoQXNyWL4BPyo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceStack(com.paypal.oslo.feature.businesshome.di.navigation.BusinessExperienceDisabledDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TE5hXULEW85Pxa8fcVCRG1vHXoQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.feature.businesshome.api.navigation.AccountSetupSheetDestination accountSetupSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupSheetDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(accountSetupSheetDestination) : composer.changedInstance(accountSetupSheetDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1465304420, i2, -1, "com.paypal.oslo.feature.businesshome.di.NavigationModule.provideAccountSetupSheetEntry.<anonymous>.<anonymous> (NavigationModule.kt:203)");
            }
            java.lang.String featureName = accountSetupSheetDestination.getFeatureName();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12880$r8$lambda$Ki06_5xucCAVtlLYZtzqbui0A(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(webUrls);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$hRNVnMXKiPJVzKQJ1mPQutigUdQ(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed3 = composer.changed(appNavigator);
            boolean changedInstance2 = composer.changedInstance(webUrls);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$O3r40ligGglY9czTtm1osiFny5Q(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt.AccountSetupSheet(function0, featureName, null, null, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TZSTE_ja9d5_HcMXV0CMiYomd30(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$TtNaZOlG88N2L35iE87AyN8sSu0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TtNaZOlG88N2L35iE87AyN8sSu0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W3r4RyEn7PWqf0BKFQf6ajnpYxM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(com.paypal.oslo.feature.businesshome.api.navigation.result.AccountSetupCompleteNavResult.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z0lTnTWd4kuorkmWdtxbZaNAB4Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$5tc3R7_t1zcywIPm69JpYKRvquM(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_cDT2acd8d63I7c-eAYVvozVmc4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12887$r8$lambda$_cDT2acd8d63I7ceAYVvozVmc4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("business_home", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bp8IxMOxq382GTOX1Il4rGrSrag(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.activity.api.navigation.ActivityFilteredLandingScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto("business_home", new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 12, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cmVistNBglAXixG0KSsUD6HdY0M(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12883$r8$lambda$DBc3I8ZtQPPQ4UFOyprSeGxB4Y((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fb3EZhKnpAm0oMQvP922IM_GkgE(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination(webUrls.getConfirmEmail(), "business_home"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hRNVnMXKiPJVzKQJ1mPQutigUdQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$CnAFsLNZvgz2tS16fA7sqiWjr7Q(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i8pK1vMflMVSfGUs8sh_5vYHOLE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$yyO07feD_IrgXXKXLmu8vK1k4Ng(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k-B7x5PGnFw79kwtQGHRsYdXWf0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12888$r8$lambda$kB7x5PGnFw79kwtQGHRsYdXWf0(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.businesshome.di.navigation.WebViewDestination(webUrls.getConfirmEmail(), "confirm-email"));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k0Nhc0nNtOwbp3zkIV7t1_jeG-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12889$r8$lambda$k0Nhc0nNtOwbp3zkIV7t1_jeGY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$65XxjpJmkda7SlLphxJEoy5vqlk(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kRJ9w-wcgdluztCztAffFhEXLwA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12890$r8$lambda$kRJ9wwcgdluztCztAffFhEXLwA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12887$r8$lambda$_cDT2acd8d63I7ceAYVvozVmc4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mFYc1sTfHoLn79TIkNh57vStJIM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> l1PlainMetadata = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l1PlainMetadata();
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1951274788, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.$r8$lambda$AkMHDNYVBaoxnnoBqSl8ZqVqmIQ(com.paypal.oslo.core.navigation.AppNavigator.this, webUrls, (com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideBusinessHomeEntry$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination businessHomeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessHomeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$provideBusinessHomeEntry$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination businessHomeDestination) {
                return l1PlainMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pwMy7w_0fqfOm5pMh4SXn1hBSq0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.businesshome.ui.webview.WebUrls webUrls) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12888$r8$lambda$kB7x5PGnFw79kwtQGHRsYdXWf0(com.paypal.oslo.feature.businesshome.ui.webview.WebUrls.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qHn1F3s480SHsayXk85gWU6NA5Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12892$r8$lambda$uxL00E5_wDYIkwst5dPhyAIVGw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tyKM4L-FMaIzJCXGiz4GQarylWU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12891$r8$lambda$tyKM4LFMaIzJCXGiz4GQarylWU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12881$r8$lambda$UCtl5EzO855uoY88MpBrJ9OXbI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uxL00E5_wDYI-kwst5dPhyAIVGw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12892$r8$lambda$uxL00E5_wDYIkwst5dPhyAIVGw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, "business_home", (java.lang.String) null, (java.util.Map) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xghPlYjbFk4OWUlA-Db_QMmtmm4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12893$r8$lambda$xghPlYjbFk4OWUlADb_QMmtmm4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.CREATE.getValue(), (java.lang.String) null, (java.lang.String) null, "business_home", 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yyO07feD_IrgXXKXLmu8vK1k4Ng(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination(str, "business_home"));
        return kotlin.Unit.INSTANCE;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessExperienceDisabledEntry() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesshome.di.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.businesshome.di.NavigationModule.m12886$r8$lambda$H7LY_KNFLlHih44H5mXc8A48((androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }
}
