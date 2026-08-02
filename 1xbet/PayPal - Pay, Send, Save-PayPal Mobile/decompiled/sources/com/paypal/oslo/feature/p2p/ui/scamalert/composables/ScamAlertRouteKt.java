package com.paypal.oslo.feature.p2p.ui.scamalert.composables;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/navigation/ScamAlertDestination;", "destination", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "contactSectionViewModel", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/viewmodel/ScamAlertViewModel;", "scamAlertViewModel", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "userCountryCode", "", "ScamAlertRoute", "(Lcom/paypal/oslo/feature/p2p/navigation/ScamAlertDestination;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;Lcom/paypal/oslo/feature/p2p/ui/scamalert/viewmodel/ScamAlertViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScamAlertRouteKt {
    public static final void ScamAlertRoute(final com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination scamAlertDestination, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, final com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSectionViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-4705919);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(scamAlertDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(contactSectionViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(scamAlertViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-4705919, i3, -1, "com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRoute (ScamAlertRoute.kt:40)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(scamAlertViewModel.isResolved(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.Object value = collectAsStateWithLifecycle.getValue();
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$ScamAlertRoute$1$1(collectAsStateWithLifecycle, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(value, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            java.lang.String languageTag = com.paypal.oslo.feature.p2p.ui.common.util.LocaleUtilsKt.getLocale(startRestartGroup, 0).toLanguageTag();
            int i5 = com.paypal.oslo.feature.p2p.R.string.feature_p2p_scam_alert_web_view_url;
            kotlin.jvm.internal.Intrinsics.checkNotNull(languageTag);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i5, new java.lang.Object[]{str, languageTag}, startRestartGroup, 0);
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType alertType = scamAlertDestination.getAlertType();
            boolean changedInstance = startRestartGroup.changedInstance(contactSectionViewModel);
            boolean z2 = i4 == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.m17421$r8$lambda$68WdR47GNDlU9xu9sSrohH2Do(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this, appNavigator);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance2 = startRestartGroup.changedInstance(scamAlertViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.$r8$lambda$DuM63M3q41brE_o80DoXwAQYjwQ(com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean z3 = i4 == 2048;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.m17420$r8$lambda$3VHr5V64Cmg5KXH6H2ZOnCzzks(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean z4 = i4 == 2048;
            boolean changed2 = startRestartGroup.changed(stringResource);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((z4 | changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.$r8$lambda$LpYPS2ohuYHB0l2W7pBfDEzTNiU(com.paypal.oslo.core.navigation.AppNavigator.this, stringResource);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertScreenKt.ScamAlertScreen(alertType, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue5, null, startRestartGroup, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.$r8$lambda$OC0P0CsFsiY3AMuZrI5JM2zXrbY(com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination.this, contactSectionViewModel, scamAlertViewModel, appNavigator, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$09eGniJbR11LNCZrTaPdMowsz-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17419$r8$lambda$09eGniJbR11LNCZrTaPdMowszU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3VHr-5V64Cmg5KXH6H2ZOnCzzks, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17420$r8$lambda$3VHr5V64Cmg5KXH6H2ZOnCzzks(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.$r8$lambda$irZySD1ZbADkgDxhfSQovKCOcpc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$68WdR-47GNDlU9-xu9sSrohH2Do, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17421$r8$lambda$68WdR47GNDlU9xu9sSrohH2Do(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        contactSectionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearSelections.INSTANCE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.m17419$r8$lambda$09eGniJbR11LNCZrTaPdMowszU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DuM63M3q41brE_o80DoXwAQYjwQ(com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel) {
        scamAlertViewModel.resolveScamContingency(com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice.ACCEPT_PAYMENT_TYPE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hz7QbHs9EVVkKZxbVJrWXrut1NE(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.navigation.ScamAlertWebViewDestination(str, ""));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LpYPS2ohuYHB0l2W7pBfDEzTNiU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertRouteKt.$r8$lambda$Hz7QbHs9EVVkKZxbVJrWXrut1NE(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OC0P0CsFsiY3AMuZrI5JM2zXrbY(com.paypal.oslo.feature.p2p.navigation.ScamAlertDestination scamAlertDestination, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel scamAlertViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        ScamAlertRoute(scamAlertDestination, contactSectionViewModel, scamAlertViewModel, appNavigator, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$irZySD1ZbADkgDxhfSQovKCOcpc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult.INSTANCE.cancelled());
        navigationScope.popTo(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
