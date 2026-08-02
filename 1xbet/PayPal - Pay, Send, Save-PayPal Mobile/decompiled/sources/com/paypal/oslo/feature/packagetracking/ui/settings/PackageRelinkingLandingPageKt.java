package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"PackageRelinkingLandingPage", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "relinkByDate", "", "emailProvider", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "onLinkClick", "Lkotlin/Function0;", "onPrivacyClick", "onLearnMoreClick", "onCancelClick", "onDismiss", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PackageRelinkingLandingPagePreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageRelinkingLandingPageKt {
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PackageRelinkingLandingPage(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1409232591);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(emailProvider == null ? -1 : emailProvider.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            function06 = function05;
            i3 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                emailProvider2 = emailProvider;
                function07 = function06;
            } else {
                com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider3 = i4 != 0 ? com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL : emailProvider;
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function06 = (kotlin.jvm.functions.Function0) rememberedValue;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1409232591, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPage (PackageRelinkingLandingPage.kt:53)");
                }
                boolean z = (29360128 & i3) == 8388608;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$9cfOBorudaOnJylfOeo8Ld_jRKA(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                int i6 = i3;
                final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider4 = emailProvider3;
                kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, (kotlin.jvm.functions.Function0) rememberedValue2, new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_relinking_landing_page_title, startRestartGroup, 0), false, null, 6, null), null, null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1835186102, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$qnlmsuGnn5CPGh6J0dBKF21JYuo(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.this, str, function0, function04, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, com.paypal.pds.components.BottomSheetController.$stable | 905969664 | (i6 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                emailProvider2 = emailProvider3;
                function07 = function08;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.m17566$r8$lambda$giBShNvZ5AYjPbcy_SYd22qeog(com.paypal.pds.components.BottomSheetController.this, str, emailProvider2, function0, function02, function03, function04, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function06 = function05;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1ezwVMkMLJDd99Lw7s17tcodfG8(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9cfOBorudaOnJylfOeo8Ld_jRKA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HvNyt30nv_QLLV_-MutnLpojU2E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17565$r8$lambda$HvNyt30nv_QLLV_MutnLpojU2E(kotlin.jvm.functions.Function0 function0) {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getPrivacyLink(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "relink_gmail", "relink_gmail", 1, null), null, 4, null).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ezJdLQUYh2AyByJ9iuroVhnyVIs(kotlin.jvm.functions.Function0 function0) {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getLearnMoreLink(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "relink_gmail", "relink_gmail", 1, null), null, 4, null).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$giBShNvZ5AYjPbcy_SYd-22qeog, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17566$r8$lambda$giBShNvZ5AYjPbcy_SYd22qeog(com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PackageRelinkingLandingPage(bottomSheetController, str, emailProvider, function0, function02, function03, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pdj3PHZexhgAixcnJusYjYpzY_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1698143697);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1698143697, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPagePreview (PackageRelinkingLandingPage.kt:168)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$PackageRelinkingLandingPagePreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$PackageRelinkingLandingPagePreview$1$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            PackageRelinkingLandingPage(bottomSheetController, "January 15, 2025", emailProvider, function0, function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 14380464, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$pdj3PHZexhgAixcnJusYjYpzY_U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qnlmsuGnn5CPGh6J0dBKF21JYuo(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final kotlin.jvm.functions.Function0 function03, final kotlin.jvm.functions.Function0 function04, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1835186102, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPage.<anonymous> (PackageRelinkingLandingPage.kt:64)");
            }
            androidx.compose.ui.Modifier analytics$default = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.analytics$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "relink_gmail", "relink_gmail", 1, null)}), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Components.INSTANCE.getRelinkGmail(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 6);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, analytics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
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
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsHeaderKt.PackageSettingsHeader(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_relink_full_screen_title, new java.lang.Object[]{com.paypal.oslo.feature.packagetracking.ui.utils.EmailProviderExtensionsKt.toDisplayName(emailProvider, composer, 0)}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_relinking_landing_page_subtitle, new java.lang.Object[]{str}, composer, 0), false, composer, 0, 4);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String displayName = com.paypal.oslo.feature.packagetracking.ui.utils.EmailProviderExtensionsKt.toDisplayName(emailProvider, composer, 0);
            int icon = com.paypal.oslo.feature.packagetracking.ui.utils.EmailProviderExtensionsKt.toIcon(emailProvider);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$sSOhgXkB5Jl29zJURU0E1k_8sxA(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEmailItemKt.PackageSettingsEmailItem(displayName, icon, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_action_cancel, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            boolean changed2 = composer.changed(function02);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$1ezwVMkMLJDd99Lw7s17tcodfG8(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource, fillMaxWidth$default2, null, null, secondary, null, false, false, composer, 196992, 472);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_relinking_landing_page_privacy_text, composer, 0);
            boolean changed3 = composer.changed(function03);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.m17565$r8$lambda$HvNyt30nv_QLLV_MutnLpojU2E(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changed4 = composer.changed(function04);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageRelinkingLandingPageKt.$r8$lambda$ezJdLQUYh2AyByJ9iuroVhnyVIs(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsPrivacyPolicyLabelKt.PackageSettingsPrivacyPolicyLabel(stringResource2, function05, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sSOhgXkB5Jl29zJURU0E1k_8sxA(kotlin.jvm.functions.Function0 function0) {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getLinkEmailButton(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "relink_gmail", "relink_gmail", 1, null), null, 4, null).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
