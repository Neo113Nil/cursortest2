package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"ConfirmationBottomSheetWrapper", "", "destination", "Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "confirmationSheetViewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmationSheetViewModel;", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmationSheetViewModel;Landroidx/compose/runtime/Composer;II)V", "mapIconName", "Lcom/paypal/pds/core/Icon;", "iconName", "", "user-profile_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmationBottomSheetWrapperKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationBottomSheetWrapper(final com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination confirmationBottomSheetDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel3;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.pds.core.RichText richText;
        com.paypal.pds.core.Icon.Warning warning;
        androidx.compose.ui.Modifier modifier5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationBottomSheetDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2023648932);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(confirmationBottomSheetDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    confirmationSheetViewModel2 = confirmationSheetViewModel;
                    if (startRestartGroup.changedInstance(confirmationSheetViewModel2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    confirmationSheetViewModel2 = confirmationSheetViewModel;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                confirmationSheetViewModel2 = confirmationSheetViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier4 = modifier2;
                    confirmationSheetViewModel3 = confirmationSheetViewModel2;
                    i5 = 0;
                } else {
                    androidx.compose.ui.Modifier modifier6 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
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
                        i5 = 0;
                        i4 &= -7169;
                        confirmationSheetViewModel3 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i5 = 0;
                        confirmationSheetViewModel3 = confirmationSheetViewModel2;
                    }
                    modifier4 = modifier6;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2023648932, i4, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapper (ConfirmationBottomSheetWrapper.kt:51)");
                }
                final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(confirmationBottomSheetDestination.getDescriptionRes(), startRestartGroup, i5);
                if (confirmationBottomSheetDestination.getDescriptionRes() == com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_before_you_continue_title_subtitle) {
                    startRestartGroup.startReplaceGroup(-1930109047);
                    java.util.Locale userLocale = confirmationSheetViewModel3.getUserLocale();
                    java.lang.String country = userLocale.getCountry();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(country);
                    if (country.length() <= 0) {
                        country = null;
                    }
                    if (country == null) {
                        country = java.util.Locale.US.getCountry();
                    }
                    java.lang.String language = userLocale.getLanguage();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(language);
                    if (language.length() <= 0) {
                        language = null;
                    }
                    if (language == null) {
                        language = java.util.Locale.US.getLanguage();
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(language);
                    sb.append("_");
                    sb.append(country);
                    java.lang.String obj = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(country);
                    java.lang.String lowerCase = country.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://www.paypal.com/");
                    sb2.append(lowerCase);
                    sb2.append("/legalhub/paypal/useragreement-full?locale.x=");
                    sb2.append(obj);
                    kotlin.Pair pair = kotlin.TuplesKt.to("User Agreement", sb2.toString());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("https://www.paypal.com/");
                    sb3.append(lowerCase);
                    sb3.append("/webapps/mpp/ua/privacy-full?locale.x=");
                    sb3.append(obj);
                    kotlin.Pair pair2 = kotlin.TuplesKt.to("Privacy Statement", sb3.toString());
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[i5] = pair;
                    pairArr[1] = pair2;
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) pairArr);
                    boolean changed = startRestartGroup.changed(obj);
                    boolean changed2 = startRestartGroup.changed(stringResource);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = com.paypal.pds.core.RichTextKt.toRichText(stringResource, listOf);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    richText = (com.paypal.pds.core.RichText) rememberedValue;
                } else {
                    startRestartGroup.startReplaceGroup(-1929436502);
                    startRestartGroup.endReplaceGroup();
                    richText = null;
                }
                java.lang.String iconName = confirmationBottomSheetDestination.getIconName();
                if (iconName != null) {
                    int hashCode = iconName.hashCode();
                    if (hashCode == -1505867908) {
                        if (iconName.equals(com.google.common.net.HttpHeaders.WARNING)) {
                            warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        }
                        warning = com.paypal.pds.core.Icon.Info.INSTANCE;
                    } else if (hashCode == 2283726) {
                        if (iconName.equals("Info")) {
                            warning = com.paypal.pds.core.Icon.Info.INSTANCE;
                        }
                        warning = com.paypal.pds.core.Icon.Info.INSTANCE;
                    } else {
                        if (hashCode == 65074408 && iconName.equals("Check")) {
                            warning = com.paypal.pds.core.Icon.Check.INSTANCE;
                        }
                        warning = com.paypal.pds.core.Icon.Info.INSTANCE;
                    }
                } else {
                    warning = null;
                }
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(confirmationBottomSheetDestination.getTitleRes(), startRestartGroup, i5);
                com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton[] confirmationButtonArr = new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton[2];
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(confirmationBottomSheetDestination.getPrimaryButtonTextRes(), startRestartGroup, i5);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                int i8 = i4 & 112;
                int i9 = i8 == 32 ? 1 : i5;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (i9 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.$r8$lambda$RAzTO45eJPaiSeBhOQU78pzzTYA(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                confirmationButtonArr[i5] = new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(stringResource3, primary, (kotlin.jvm.functions.Function0) rememberedValue2, "confirmation_primary_button", false, confirmationBottomSheetDestination.getAnalyticsPrimaryItemName(), 16, null);
                java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(confirmationBottomSheetDestination.getSecondaryButtonTextRes(), startRestartGroup, i5);
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                int i10 = i8 == 32 ? 1 : i5;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (i10 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.$r8$lambda$dulwMxx0fQk5QWQim6_V3q8UJag(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                confirmationButtonArr[1] = new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(stringResource4, secondary, (kotlin.jvm.functions.Function0) rememberedValue3, "confirmation_secondary_button", false, confirmationBottomSheetDestination.getAnalyticsSecondaryItemName(), 16, null);
                java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) confirmationButtonArr);
                java.lang.String analyticsFeature = confirmationBottomSheetDestination.getAnalyticsFeature();
                if (analyticsFeature != null) {
                    java.lang.String analyticsAction = confirmationBottomSheetDestination.getAnalyticsAction();
                    if (analyticsAction == null) {
                        analyticsAction = "view";
                    }
                    modifier5 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier4, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("user_profile", analyticsFeature, analyticsAction)));
                } else {
                    modifier5 = modifier4;
                }
                boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.m20462$r8$lambda$zEMuF5JJjwQIUVqxImQ5u0fCEc(androidx.compose.ui.platform.UriHandler.this, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.core.RichText richText2 = richText;
                androidx.compose.ui.Modifier modifier7 = modifier4;
                com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetKt.ConfirmationBottomSheet(warning, stringResource2, stringResource, listOf2, modifier5, null, "generic_confirmation_bottom_sheet", richText2, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 1572864, 32);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                confirmationSheetViewModel2 = confirmationSheetViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel4 = confirmationSheetViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.$r8$lambda$cYWTwHDWYvNT80tPMaK3jGWEWKo(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination.this, appNavigator, modifier3, confirmationSheetViewModel4, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RAzTO45eJPaiSeBhOQU78pzzTYA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.$r8$lambda$m4AwL29xfrVH8KlmkKIJqLhuanY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XG39ugy5v0DSJ6Vmyckm952KB9A(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.SECONDARY));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cYWTwHDWYvNT80tPMaK3jGWEWKo(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination confirmationBottomSheetDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConfirmationBottomSheetWrapper(confirmationBottomSheetDestination, appNavigator, modifier, confirmationSheetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dulwMxx0fQk5QWQim6_V3q8UJag(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.$r8$lambda$XG39ugy5v0DSJ6Vmyckm952KB9A((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m4AwL29xfrVH8KlmkKIJqLhuanY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult(com.paypal.oslo.feature.userprofile.api.navigation.result.ConfirmationBottomSheetNavResult.Action.PRIMARY));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zE-MuF5JJjwQIUVqxImQ5u0fCEc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20462$r8$lambda$zEMuF5JJjwQIUVqxImQ5u0fCEc(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        uriHandler.openUri(str);
        return kotlin.Unit.INSTANCE;
    }
}
