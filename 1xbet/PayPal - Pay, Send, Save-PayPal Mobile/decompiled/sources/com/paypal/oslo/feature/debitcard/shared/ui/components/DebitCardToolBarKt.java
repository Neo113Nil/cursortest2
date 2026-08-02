package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ai\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001b"}, d2 = {"DebitCardToolBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "showBackButton", "", "trailingButtonType", "Lcom/paypal/oslo/feature/debitcard/api/model/TrailingButtonType;", "onBackButtonClick", "Lkotlin/Function0;", "onTrailingButtonClick", "Lkotlin/Function1;", "progressBarConfig", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/TrailingButtonType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig;Landroidx/compose/runtime/Composer;II)V", "progressBarWidth", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "DebitCardToolBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "DebitCardToolBarWithCloseButtonPreview", "DebitCardToolBarWithBackButtonPreview", "DebitCardToolBarWithOnlyBackButtonPreview", "DebitCardToolBarWithOnlyCloseButtonPreview", "DebitCardToolBarWithProgressBarPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardToolBarKt {
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(185.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardToolBar(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType, kotlin.Unit> function12;
        int i8;
        final com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType, kotlin.Unit> function13;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        float f;
        boolean z4;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig3;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig4 = debitCardProgressBarConfig;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1185100809);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(trailingButtonType == null ? -1 : trailingButtonType.ordinal()) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    int i11 = 1572864;
                    if (i8 == 0) {
                        if ((i & 1572864) == 0) {
                            i11 = (i & 2097152) == 0 ? startRestartGroup.changed(debitCardProgressBarConfig4) : startRestartGroup.changedInstance(debitCardProgressBarConfig4) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            debitCardProgressBarConfig2 = debitCardProgressBarConfig4;
                            function13 = function12;
                            modifier3 = modifier2;
                            z3 = z2;
                            trailingButtonType2 = trailingButtonType;
                            function02 = function0;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str3 = i10 != 0 ? null : str2;
                            boolean z5 = i4 != 0 ? false : z2;
                            com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType3 = i5 != 0 ? com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE : trailingButtonType;
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function03 = function0;
                            }
                            if (i7 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.m14606$r8$lambda$2vlFDMXYbNyJ8TKiTUBS_eFmok((com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            }
                            if (i8 != 0) {
                                debitCardProgressBarConfig4 = null;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1185100809, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBar (DebitCardToolBar.kt:57)");
                            }
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null)), com.paypal.pds.core.ConstantsKt.getSize8()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_TOOLBAR);
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
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            if (z5) {
                                startRestartGroup.startReplaceGroup(884707163);
                                modifier4 = companion;
                                boxScopeInstance = boxScopeInstance2;
                                f = 0.0f;
                                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function03, androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance2.align(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.INSTANCE.getBACK_BUTTON()), androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.BACK_BUTTON), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toolbar_back_button, startRestartGroup, 0), null, false, false, startRestartGroup, ((i3 >> 9) & 112) | 27654, 448);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                modifier4 = companion;
                                boxScopeInstance = boxScopeInstance2;
                                f = 0.0f;
                                startRestartGroup.startReplaceGroup(885218725);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (str3 != null) {
                                startRestartGroup.startReplaceGroup(885296318);
                                z4 = z5;
                                java.lang.String str4 = str3;
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str4, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), com.paypal.pds.core.ConstantsKt.getSize48(), f, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 12779904, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
                                startRestartGroup.endReplaceGroup();
                                debitCardProgressBarConfig3 = debitCardProgressBarConfig4;
                            } else {
                                z4 = z5;
                                if (debitCardProgressBarConfig4 != null) {
                                    startRestartGroup.startReplaceGroup(885825147);
                                    debitCardProgressBarConfig3 = debitCardProgressBarConfig4;
                                    com.paypal.pds.components.ProgressBarKt.ProgressBar(debitCardProgressBarConfig4.getMaxProgress(), debitCardProgressBarConfig4.getCurrentProgress(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), getHighSpeedVideoSizes), com.paypal.pds.core.ConstantsKt.getSize32(), f, 2, null), com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE, debitCardProgressBarConfig4.getCurrentSegment(), debitCardProgressBarConfig4.getTotalSegments(), 0L, null, startRestartGroup, 3072, 192);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    debitCardProgressBarConfig3 = debitCardProgressBarConfig4;
                                    startRestartGroup.startReplaceGroup(886399360);
                                    startRestartGroup.endReplaceGroup();
                                }
                            }
                            int i12 = com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.WhenMappings.$EnumSwitchMapping$0[trailingButtonType3.ordinal()];
                            if (i12 == 1) {
                                startRestartGroup.startReplaceGroup(886712367);
                                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_skip, startRestartGroup, 0);
                                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.INSTANCE.getSKIP_BUTTON()), androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.SKIP_BUTTON), com.paypal.pds.core.ConstantsKt.getSize8(), f, 2, null);
                                boolean z6 = (i3 & 458752) == 131072;
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.m14610$r8$lambda$MXf07oA5C1BVujbA0iEvkJmdJM(kotlin.jvm.functions.Function1.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource, m1708paddingVpY3zN4$default, null, null, secondary, medium, false, false, startRestartGroup, 1769472, 408);
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            } else if (i12 == 2) {
                                startRestartGroup.startReplaceGroup(887411076);
                                com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
                                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                                com.paypal.pds.components.ButtonSize.Medium medium2 = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_close, startRestartGroup, 0);
                                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardToolbarAnalytics.INSTANCE.getCLOSE_BUTTON()), androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.CLOSE_BUTTON);
                                com.paypal.pds.core.Icon.XMark xMark2 = xMark;
                                boolean z7 = (i3 & 458752) == 131072;
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z7 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.m14607$r8$lambda$4ovy13o0zWUfqZSs_cz2ubPErA(kotlin.jvm.functions.Function1.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                com.paypal.pds.components.IconButtonKt.IconButton(xMark2, (kotlin.jvm.functions.Function0) rememberedValue4, testTag2, tertiary, medium2, stringResource2, null, false, false, startRestartGroup, 27654, 448);
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            } else {
                                if (i12 != 3) {
                                    startRestartGroup.startReplaceGroup(-1772513484);
                                    startRestartGroup.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(888083621);
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            debitCardProgressBarConfig2 = debitCardProgressBarConfig3;
                            function13 = function12;
                            str2 = str3;
                            trailingButtonType2 = trailingButtonType3;
                            function02 = function03;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final java.lang.String str5 = str2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.$r8$lambda$4nOME5VdO6ksJEKwOIEoTfTpZ4k(androidx.compose.ui.Modifier.this, str5, z3, trailingButtonType2, function02, function13, debitCardProgressBarConfig2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                int i112 = 1572864;
                if (i8 == 0) {
                }
                i3 |= i112;
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            int i1122 = 1572864;
            if (i8 == 0) {
            }
            i3 |= i1122;
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        int i11222 = 1572864;
        if (i8 == 0) {
        }
        i3 |= i11222;
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$2vlFDMXYbNyJ8-TKiTUBS_eFmok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14606$r8$lambda$2vlFDMXYbNyJ8TKiTUBS_eFmok(com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailingButtonType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4nOME5VdO6ksJEKwOIEoTfTpZ4k(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig debitCardProgressBarConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardToolBar(modifier, str, z, trailingButtonType, function0, function1, debitCardProgressBarConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4ovy13o0zWUfqZSs_-cz2ubPErA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14607$r8$lambda$4ovy13o0zWUfqZSs_cz2ubPErA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5Pq-3oGLZOEtdSMnsI6329Bnm5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14608$r8$lambda$5Pq3oGLZOEtdSMnsI6329Bnm5w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1350034703);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1350034703, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarWithOnlyBackButtonPreview (DebitCardToolBar.kt:208)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, true, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE, null, null, null, startRestartGroup, 3456, 114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.m14608$r8$lambda$5Pq3oGLZOEtdSMnsI6329Bnm5w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6Mn7kqc_9f6n97HewtyUTpa1UT4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-513251684);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-513251684, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarPreview (DebitCardToolBar.kt:163)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_manage_card_title, startRestartGroup, 0), true, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE, null, null, null, startRestartGroup, 3456, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.$r8$lambda$6Mn7kqc_9f6n97HewtyUTpa1UT4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HjqA4B8wgdPlkqgi-tKEwnNKbAc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14609$r8$lambda$HjqA4B8wgdPlkqgitKEwnNKbAc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1405977122);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1405977122, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarWithOnlyCloseButtonPreview (DebitCardToolBar.kt:222)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, false, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE, null, null, null, startRestartGroup, 3456, 114);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.m14609$r8$lambda$HjqA4B8wgdPlkqgitKEwnNKbAc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MXf07o-A5C1BVujbA0iEvkJmdJM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14610$r8$lambda$MXf07oA5C1BVujbA0iEvkJmdJM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.SKIP);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OIqh4ZTwaamH_ubsP1e4J2CN0gg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(340702397);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(340702397, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarWithBackButtonPreview (DebitCardToolBar.kt:193)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_manage_card_title, startRestartGroup, 0), true, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE, null, null, null, startRestartGroup, 3456, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.$r8$lambda$OIqh4ZTwaamH_ubsP1e4J2CN0gg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pwf9pSAYUv1bGNYAoKtxSzX89MY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-532734574);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-532734574, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarWithCloseButtonPreview (DebitCardToolBar.kt:178)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_manage_card_title, startRestartGroup, 0), false, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE, null, null, null, startRestartGroup, 3456, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.$r8$lambda$Pwf9pSAYUv1bGNYAoKtxSzX89MY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i5BriOMqYxUdfodzfZPIhEVKLWU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(83458486);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(83458486, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarWithProgressBarPreview (DebitCardToolBar.kt:236)");
            }
            DebitCardToolBar(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, false, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.SKIP, null, null, new com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig(50.0f, 100.0f, 2, 3), startRestartGroup, (com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig.$stable << 18) | 3456, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.$r8$lambda$i5BriOMqYxUdfodzfZPIhEVKLWU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.SKIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
