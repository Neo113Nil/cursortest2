package com.paypal.oslo.feature.wallet.banks.common;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"BankFeatureRedirectScreen", "", "title", "", "onCloseClick", "Lkotlin/Function0;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "url", "tertiaryButtonText", "onTertiaryButtonClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BankFeatureRedirectScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankFeatureRedirectScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankFeatureRedirectScreen(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        java.lang.String str6;
        int i5;
        java.lang.String str7;
        int i6;
        java.lang.String str8;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str9;
        final java.lang.String str10;
        final java.lang.String str11;
        final java.lang.String str12;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        java.lang.String str13;
        java.lang.String str14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(52831005);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str6 = str3;
                i3 |= startRestartGroup.changed(str6) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str7 = str4;
                    i3 |= startRestartGroup.changed(str7) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str8 = str5;
                        i3 |= startRestartGroup.changed(str8) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                str9 = str2;
                                str10 = str6;
                                str11 = str7;
                                str12 = str8;
                                function03 = function02;
                            } else {
                                java.lang.String str15 = i8 != 0 ? null : str2;
                                java.lang.String str16 = i4 != 0 ? null : str6;
                                java.lang.String str17 = i5 != 0 ? null : str7;
                                java.lang.String str18 = i6 != 0 ? null : str8;
                                if (i7 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                                } else {
                                    function04 = function02;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(52831005, i3, -1, "com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreen (BankFeatureRedirectScreen.kt:72)");
                                }
                                if (str17 == null) {
                                    startRestartGroup.startReplaceGroup(-769002511);
                                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_redirect_url, startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                    str13 = stringResource;
                                } else {
                                    startRestartGroup.startReplaceGroup(-769002728);
                                    startRestartGroup.endReplaceGroup();
                                    str13 = str17;
                                }
                                final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSize24());
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                                int i9 = i3;
                                final java.lang.String str19 = str13;
                                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Close.INSTANCE, function0, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.pds.core.ConstantsKt.getSize40()), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_error_screen_close_content_description, startRestartGroup, 0), null, false, false, startRestartGroup, (i3 & 112) | 27654, 448);
                                androidx.compose.ui.Modifier align = boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenter());
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Warning.INSTANCE), null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.XLarge.$stable << 6) | 3072, 50);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, i9 & 14, 6, 1006);
                                if (str15 != null) {
                                    composer2 = startRestartGroup;
                                    composer2.startReplaceGroup(1849759540);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer2, 0);
                                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str15, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, ((i9 >> 6) & 14) | 384, 6, 1002);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.startReplaceGroup(1850056489);
                                    composer2.endReplaceGroup();
                                }
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                                if (str16 == null) {
                                    composer2.startReplaceGroup(-494501546);
                                    str14 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_redirect_go_to_paypal, composer2, 0);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-494501980);
                                    composer2.endReplaceGroup();
                                    str14 = str16;
                                }
                                boolean changedInstance = composer2.changedInstance(uriHandler);
                                boolean changed = composer2.changed(str19);
                                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                                if ((changedInstance | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.$r8$lambda$uK6E9jKq1uuw6wN8CrBooiXktqA(androidx.compose.ui.platform.UriHandler.this, str19);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, str14, null, null, null, primary, large, false, false, composer2, 1769472, 412);
                                if (str18 != null) {
                                    composer2.startReplaceGroup(1850449135);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                                    com.paypal.pds.components.ButtonKt.Button(function04, str18, null, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i9 >> 18) & 14) | 1769472 | ((i9 >> 12) & 112), 412);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1850750889);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endNode();
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                str9 = str15;
                                str10 = str16;
                                str11 = str17;
                                str12 = str18;
                                function03 = function04;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.$r8$lambda$1Y57OYU_BYsalBIXSkzv3_fjv78(str, function0, str9, str10, str11, str12, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str8 = str5;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                str7 = str4;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str8 = str5;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str6 = str3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str7 = str4;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str8 = str5;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str6 = str3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str7 = str4;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str8 = str5;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Y57OYU_BYsalBIXSkzv3_fjv78(java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BankFeatureRedirectScreen(str, function0, str2, str3, str4, str5, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FAUu_dBOwEsm0ppj06ySmThY0s8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(44408838);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(44408838, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenPreview (BankFeatureRedirectScreen.kt:141)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BankFeatureRedirectScreen("You can manage your payment methods on our website", function0, "Your bank info needs an update", null, null, "Not now", (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 1769910, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.$r8$lambda$FAUu_dBOwEsm0ppj06ySmThY0s8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uK6E9jKq1uuw6wN8CrBooiXktqA(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str) {
        uriHandler.openUri(str);
        return kotlin.Unit.INSTANCE;
    }
}
