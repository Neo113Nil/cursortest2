package com.paypal.oslo.feature.settings.ui.screens;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"SettingsErrorScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lcom/paypal/pds/core/Icon;", "iconEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "message", "", "title", "retryText", "onRetryClick", "Lkotlin/Function0;", "onCloseClick", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarEmphasis;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SettingsErrorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "SettingsErrorScreenNoButtonPreview", "settings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsErrorScreen(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.pds.core.Icon icon2;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis2;
        java.lang.String str4;
        java.lang.String str5;
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis3;
        final java.lang.String str6;
        final java.lang.String str7;
        java.lang.String str8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.String str9;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        java.lang.String str10;
        java.lang.String str11;
        int i7;
        java.lang.Object obj;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-961162705);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            icon2 = icon;
            i3 |= startRestartGroup.changed(icon2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    avatarEmphasis2 = avatarEmphasis;
                    if (startRestartGroup.changed(avatarEmphasis2)) {
                        i11 = 256;
                        i3 |= i11;
                    }
                } else {
                    avatarEmphasis2 = avatarEmphasis;
                }
                i11 = 128;
                i3 |= i11;
            } else {
                avatarEmphasis2 = avatarEmphasis;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    str4 = str;
                    if (startRestartGroup.changed(str4)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    str4 = str;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                str4 = str;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    str5 = str2;
                    if (startRestartGroup.changed(str5)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    str5 = str2;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                str5 = str2;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0 && startRestartGroup.changed(str3)) {
                    i8 = 131072;
                    i3 |= i8;
                }
                i8 = 65536;
                i3 |= i8;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        str10 = str3;
                        function05 = function02;
                        i6 = i3;
                        str11 = str5;
                        function06 = function0;
                    } else {
                        companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if (i13 != 0) {
                            icon2 = com.paypal.pds.core.Icon.Critical.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            avatarEmphasis2 = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            str4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_generic_error_description, startRestartGroup, 0);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            str5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_sorry, startRestartGroup, 0);
                        }
                        if ((i2 & 32) != 0) {
                            str9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.settings.R.string.feature_settings_try_again, startRestartGroup, 0);
                            i3 = (-458753) & i3;
                        } else {
                            str9 = str3;
                        }
                        kotlin.jvm.functions.Function0<kotlin.Unit> function07 = i4 != 0 ? null : function0;
                        if (i5 != 0) {
                            i6 = i3;
                            function05 = null;
                        } else {
                            function05 = function02;
                            i6 = i3;
                        }
                        function06 = function07;
                        str10 = str9;
                        str11 = str5;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-961162705, i6, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreen (SettingsErrorScreen.kt:57)");
                    }
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    androidx.compose.ui.Modifier modifier3 = companion;
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
                    if (function05 != null) {
                        startRestartGroup.startReplaceGroup(1520847582);
                        obj = null;
                        i7 = i6;
                        com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1407454605, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.m19301$r8$lambda$v_X5cTZXgD9ARVppNic5oRRN8(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i7 = i6;
                        obj = null;
                        startRestartGroup.startReplaceGroup(1521073417);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Module.INSTANCE.getERROR()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getUSER_INTENT()));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    int i14 = i7 >> 12;
                    com.paypal.pds.components.HeaderKt.Header(str11, (androidx.compose.ui.Modifier) null, str4, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1922433348, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.$r8$lambda$9Fb8Fi8DIsz1GiPvc17eSTobK0U(com.paypal.pds.core.Icon.this, avatarEmphasis2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i14 & 14) | 221184 | ((i7 >> 3) & 896), 74);
                    if (function06 != null) {
                        startRestartGroup.startReplaceGroup(-696495591);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        com.paypal.pds.components.ButtonKt.Button(function06, str10, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.ErrorComponent.INSTANCE.getTRY_AGAIN()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.settings.api.analytics.SettingsAnalyticsConstants.Screen.INSTANCE.getITEM_USER_INTENT())), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i7 >> 18) & 14) | 1769472 | (i14 & 112), 408);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-695997793);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                    str7 = str11;
                    modifier2 = modifier3;
                    com.paypal.pds.components.AvatarEmphasis avatarEmphasis4 = avatarEmphasis2;
                    str8 = str10;
                    avatarEmphasis3 = avatarEmphasis4;
                    java.lang.String str12 = str4;
                    function04 = function06;
                    str6 = str12;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    function03 = function02;
                    avatarEmphasis3 = avatarEmphasis2;
                    str6 = str4;
                    str7 = str5;
                    str8 = str3;
                    function04 = function0;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    final com.paypal.pds.core.Icon icon3 = icon2;
                    final java.lang.String str13 = str8;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function04;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function03;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.$r8$lambda$yFB22AKMM5K1LHtZzevxKOdg8sk(androidx.compose.ui.Modifier.this, icon3, avatarEmphasis3, str6, str7, str13, function08, function09, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        icon2 = icon;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9Fb8Fi8DIsz1GiPvc17eSTobK0U(com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1922433348, i, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreen.<anonymous>.<anonymous>.<anonymous> (SettingsErrorScreen.kt:85)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(icon.getAvatarSource(), null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, avatarEmphasis, null, null, composer, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UIO6UBtYgD7eUG0DOvky28wzynQ(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h-H-DmOCFamCKiCC6GL4bN1r0RI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19299$r8$lambda$hHDmOCFamCKiCC6GL4bN1r0RI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(841402025);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(841402025, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenPreview (SettingsErrorScreen.kt:111)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SettingsErrorScreen(null, null, null, "Please check your connection and try again.", "Something went wrong", null, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 14183424, 39);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.m19299$r8$lambda$hHDmOCFamCKiCC6GL4bN1r0RI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v_X5cTZXgD9A-RVppNic5oRRN-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19301$r8$lambda$v_X5cTZXgD9ARVppNic5oRRN8(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1407454605, i, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreen.<anonymous>.<anonymous> (SettingsErrorScreen.kt:66)");
            }
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.$r8$lambda$UIO6UBtYgD7eUG0DOvky28wzynQ(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yFB22AKMM5K1LHtZzevxKOdg8sk(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SettingsErrorScreen(modifier, icon, avatarEmphasis, str, str2, str3, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zvQonRkoAAFpma9nuvSJffrAr0c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(851122326);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(851122326, updateChangedFlags, -1, "com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenNoButtonPreview (SettingsErrorScreen.kt:125)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SettingsErrorScreen(null, null, null, "Please check your connection and try again.", "Something went wrong", null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 12610560, 103);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.ui.screens.SettingsErrorScreenKt.$r8$lambda$zvQonRkoAAFpma9nuvSJffrAr0c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
