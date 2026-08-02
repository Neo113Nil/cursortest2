package com.paypal.oslo.feature.settings.ui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001aA\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "appVersion", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;", "logoutState", "", "isCloseAccountEnabled", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent;", "", "onEvent", "footerContentSection", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;ZLkotlin/jvm/functions/Function1;)V", "p0", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$LogoutState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsFooterSectionKt {
    public static /* synthetic */ void footerContentSection$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.m19278$r8$lambda$fkwloKz5auNJyvtlzbL4ZrF7jw((com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent) obj2);
                }
            };
        }
        footerContentSection(lazyListScope, str, logoutState, z, function1);
    }

    public static final void footerContentSection(androidx.compose.foundation.lazy.LazyListScope lazyListScope, final java.lang.String str, final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoutState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "footer-section", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1688407320, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.m19279$r8$lambda$xvz2mn1mYiuW2srSoPT4CNKrgs(str, logoutState, z, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 2, null);
    }

    private static final void getHighSpeedVideoSizes(final java.lang.String str, final com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(549071288);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(logoutState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(549071288, i3, -1, "com.paypal.oslo.feature.settings.ui.components.FooterContent (SettingsFooterSection.kt:73)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getFOOTER()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getUSER_INTENT())), "footer_section"), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), startRestartGroup, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_footer_log_out, startRestartGroup, 0);
            com.paypal.pds.core.Icon.ArrowRightTray arrowRightTray = com.paypal.pds.core.Icon.ArrowRightTray.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Outline outline = com.paypal.pds.components.ButtonStyle.Outline.INSTANCE;
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(logoutState, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState.InProgress.INSTANCE);
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.FooterComponent.INSTANCE.getLOG_OUT()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getITEM_USER_INTENT()));
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.$r8$lambda$Skl2WwLxwPB59Cln__Jf_KFKQj4(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, context, arrowRightTray, null, outline, large, false, areEqual, startRestartGroup, 1772544, 144);
            if (z) {
                startRestartGroup.startReplaceGroup(1639172086);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_footer_close_account, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.FooterComponent.INSTANCE.getCLOSE_ACCOUNT()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getITEM_USER_INTENT()));
                boolean z3 = i4 == 2048;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.$r8$lambda$WQOTpaKG3n0Q0JeUyQszcDD8Yow(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, context2, trash, null, tertiary, large2, false, false, startRestartGroup, 1772544, 400);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1639796736);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_footer_legal, startRestartGroup, 0);
            com.paypal.pds.components.LinkSize.Medium medium = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.m19277$r8$lambda$FU_7q6B_gHJSVhSGviA3t34jIk((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier context3 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.FooterComponent.INSTANCE.getLEGAL()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getITEM_USER_INTENT()));
            boolean z4 = i4 == 2048;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.$r8$lambda$m_Sqh8fWRQN6CZZCD6vOKxTAtHY(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.LinkKt.Link(stringResource3, context3, (kotlin.jvm.functions.Function0) rememberedValue4, medium, startRestartGroup, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing96()), startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.components.SettingsFooterSectionKt.$r8$lambda$kWiJFZI_okzFmAmKI2qL0ANz2mk(str, logoutState, z, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$FU_7q6B_gHJSVhS-GviA3t34jIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19277$r8$lambda$FU_7q6B_gHJSVhSGviA3t34jIk(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Skl2WwLxwPB59Cln__Jf_KFKQj4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLogout.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WQOTpaKG3n0Q0JeUyQszcDD8Yow(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapCloseAccount.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fkw-loKz5auNJyvtlzbL4ZrF7jw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19278$r8$lambda$fkwloKz5auNJyvtlzbL4ZrF7jw(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent settingsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kWiJFZI_okzFmAmKI2qL0ANz2mk(java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(str, logoutState, z, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m_Sqh8fWRQN6CZZCD6vOKxTAtHY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.UserIntent.TapLegalAgreements.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xvz2mn1mYiuW2srS-oPT4CNKrgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19279$r8$lambda$xvz2mn1mYiuW2srSoPT4CNKrgs(java.lang.String str, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.LogoutState logoutState, boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1688407320, i, -1, "com.paypal.oslo.feature.settings.ui.components.footerContentSection.<anonymous> (SettingsFooterSection.kt:58)");
            }
            getHighSpeedVideoSizes(str, logoutState, z, function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
