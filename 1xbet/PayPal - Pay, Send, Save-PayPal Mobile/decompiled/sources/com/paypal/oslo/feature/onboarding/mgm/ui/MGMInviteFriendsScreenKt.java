package com.paypal.oslo.feature.onboarding.mgm.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072C\b\u0002\u0010\b\u001a=\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"MGMInviteFriendsScreen", "", "mgmUrlProvider", "Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMUrlProvider;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Lkotlin/Function0;", "onBackClick", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/onboarding/mgm/domain/MGMUrlProvider;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "MGMInviteFriendsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MGMInviteFriendsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MGMInviteFriendsScreen(final com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider mGMUrlProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mGMUrlProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-371881722);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mGMUrlProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function42 = function4;
                i3 |= startRestartGroup.changedInstance(function42) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m16072getLambda$1461764845$onboarding_prodRelease = i4 != 0 ? com.paypal.oslo.feature.onboarding.mgm.ui.ComposableSingletons$MGMInviteFriendsScreenKt.INSTANCE.m16072getLambda$1461764845$onboarding_prodRelease() : function42;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-371881722, i3, -1, "com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreen (MGMInviteFriendsScreen.kt:78)");
                    }
                    boolean changed = startRestartGroup.changed(mGMUrlProvider);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = mGMUrlProvider.getMgmUrl();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration rememberMGMWebViewConfiguration = com.paypal.oslo.feature.onboarding.mgm.ui.MGMWebViewConfigurationKt.rememberMGMWebViewConfiguration((java.lang.String) rememberedValue, startRestartGroup, 0);
                    boolean z = (i3 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt.m16074$r8$lambda$0eZ9fkgdTS2Z777qsD1CmF1Ask(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null)), "mgm_invite_friends_webview"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, "member_get_member", "member_get_member")));
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
                    m16072getLambda$1461764845$onboarding_prodRelease.invoke(rememberMGMWebViewConfiguration, function0, startRestartGroup, java.lang.Integer.valueOf(((i3 >> 3) & 896) | com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable));
                    kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43 = m16072getLambda$1461764845$onboarding_prodRelease;
                    modifier3 = modifier4;
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd())), com.paypal.pds.core.ConstantsKt.getSpacing16()), "mgm_close_button"), com.paypal.oslo.feature.onboarding.mgm.analytics.MGMAnalyticsConstants.INSTANCE.getDISMISS_ITEM()), com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_close_description, startRestartGroup, 0), null, false, false, startRestartGroup, 27654, 448);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function42 = function43;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function44 = function42;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt.$r8$lambda$farNVN3gv1iUibWKKIgHLMhOe7Y(com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider.this, appNavigator, modifier5, function44, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function42 = function4;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function42 = function4;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$0eZ9fkgdTS2Z777qsD1CmF1As-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16074$r8$lambda$0eZ9fkgdTS2Z777qsD1CmF1Ask(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt.$r8$lambda$CphzVDpPoRLpKDs0gr3Cx1dHdZg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0q65H11zXfinjWoTrbfzJVxM46o(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2047426421);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2047426421, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenPreview (MGMInviteFriendsScreen.kt:124)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), "mgm_invite_friends_webview");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6);
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Overlay overlay = com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE;
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd())), com.paypal.pds.core.ConstantsKt.getSpacing16());
            com.paypal.pds.core.Icon.XMark xMark2 = xMark;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(xMark2, (kotlin.jvm.functions.Function0) rememberedValue, m1706padding3ABfNKs, overlay, small, com.knotapi.knot.utilities.Constants.META_CLOSE, null, false, false, startRestartGroup, 224310, 448);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.mgm.ui.MGMInviteFriendsScreenKt.$r8$lambda$0q65H11zXfinjWoTrbfzJVxM46o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CphzVDpPoRLpKDs0gr3Cx1dHdZg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult(com.paypal.oslo.feature.onboarding.api.navigation.result.MGMInviteFriendsNavResult.DismissType.CLOSE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$farNVN3gv1iUibWKKIgHLMhOe7Y(com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider mGMUrlProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MGMInviteFriendsScreen(mGMUrlProvider, appNavigator, modifier, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
