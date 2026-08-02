package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a]\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u001a\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"TestTagEmptyStateAvatar", "", "TestTagEmptyStateButton", "EmptyState", "", "avatarIcon", "Lcom/paypal/pds/core/Icon;", "modifier", "Landroidx/compose/ui/Modifier;", "avatarEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarEmphasis;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LongText", "EmptyStatePreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyStateNoTitlePreview", "EmptyStateNoDescriptionNoButtonPreview", "EmptyStateNoDescriptionWithButtonPreview", "EmptyStateNoButtonPreview", "EmptyStateDescriptionOnlyPreview", "EmptyStateButtonOnlyPreview", "EmptyStateLongTextPreview", "EmptyStateCustomAvatarColorsPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EmptyStateKt {
    public static final java.lang.String TestTagEmptyStateAvatar = "empty_state_avatar";
    public static final java.lang.String TestTagEmptyStateButton = "empty_state_button";

    /* JADX WARN: Removed duplicated region for block: B:100:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmptyState(final com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis2;
        int i5;
        java.lang.String str4;
        int i6;
        int i7;
        java.lang.String str5;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis3;
        final java.lang.String str7;
        java.lang.String str8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(107175517);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                avatarEmphasis2 = avatarEmphasis;
                i3 |= startRestartGroup.changed(avatarEmphasis2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            str5 = str3;
                            i3 |= startRestartGroup.changed(str5) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                                function02 = function0;
                            } else {
                                function02 = function0;
                                if ((i & 1572864) == 0) {
                                    i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                                }
                            }
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                str6 = str2;
                                function03 = function02;
                                avatarEmphasis3 = avatarEmphasis2;
                                str7 = str4;
                                str8 = str5;
                            } else {
                                if (i10 != 0) {
                                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                com.paypal.pds.components.AvatarEmphasis.Default r0 = i4 != 0 ? com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE : avatarEmphasis2;
                                java.lang.String str9 = i5 != 0 ? null : str4;
                                java.lang.String str10 = i6 != 0 ? null : str2;
                                str8 = i7 != 0 ? null : str5;
                                if (i8 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(107175517, i3, -1, "com.paypal.pds.components.EmptyState (EmptyState.kt:68)");
                                }
                                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier2), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
                                com.paypal.pds.components.AvatarKt.Avatar(icon.getAvatarSource(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagEmptyStateAvatar), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, r0, null, null, startRestartGroup, ((i3 << 3) & 7168) | 432, 48);
                                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                                if (str9 != null && str9.length() > 0) {
                                    startRestartGroup.startReplaceGroup(-810546160);
                                    i9 = 1;
                                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str9, androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize32(), 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, ((i3 >> 9) & 14) | 432, 6, 1000);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    i9 = 1;
                                    startRestartGroup.startReplaceGroup(-810193039);
                                    startRestartGroup.endReplaceGroup();
                                }
                                if (str10 != null && str10.length() > 0) {
                                    startRestartGroup.startReplaceGroup(-810112532);
                                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str10, androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i9, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize24(), i9, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, ((i3 >> 12) & 14) | 432, 6, 1000);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-809755567);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endNode();
                                if (str8 != null && str8.length() > 0) {
                                    startRestartGroup.startReplaceGroup(1691367790);
                                    com.paypal.pds.components.ButtonKt.Button(function02, str8, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), TestTagEmptyStateButton), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, startRestartGroup, ((i3 >> 18) & 14) | 1769856 | ((i3 >> 12) & 112), 408);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(1691636219);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                avatarEmphasis3 = r0;
                                java.lang.String str11 = str10;
                                function03 = function02;
                                str7 = str9;
                                str6 = str11;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final java.lang.String str12 = str8;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.pds.components.EmptyStateKt.$r8$lambda$HfNSb8eG4T5t21rlqq63sjX9a2c(com.paypal.pds.core.Icon.this, modifier3, avatarEmphasis3, str7, str6, str12, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        str5 = str3;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    str5 = str3;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                str4 = str;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                str5 = str3;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            avatarEmphasis2 = avatarEmphasis;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            str5 = str3;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        avatarEmphasis2 = avatarEmphasis;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        str5 = str3;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GcfwyCbH6jE2np8mfZ72q40jgec(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1965942835);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1965942835, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateCustomAvatarColorsPreview (EmptyState.kt:214)");
            }
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmptyState(defaultIcon, null, custom, "Title", "Description", null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 1600518, 34);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$GcfwyCbH6jE2np8mfZ72q40jgec(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HfNSb8eG4T5t21rlqq63sjX9a2c(com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmptyState(icon, modifier, avatarEmphasis, str, str2, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nf0XxApw2qfNoEM95K7Xs_-pvRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21868$r8$lambda$Nf0XxApw2qfNoEM95K7Xs_pvRw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1138375334);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1138375334, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateNoButtonPreview (EmptyState.kt:170)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, "Title", "Description", null, null, startRestartGroup, 27654, 102);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.m21868$r8$lambda$Nf0XxApw2qfNoEM95K7Xs_pvRw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QqjKYJ3W5iffb6z5OvZsoGXJ1q8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(50939292);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(50939292, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateLongTextPreview (EmptyState.kt:201)");
            }
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmptyState(defaultIcon, null, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "Lorem ipsum dolor sit amet", (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 1797126, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$QqjKYJ3W5iffb6z5OvZsoGXJ1q8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c28GRP-s0fQ48xWAxBgBPy0eSU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21869$r8$lambda$c28GRPs0fQ48xWAxBgBPy0eSU4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-173335919);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-173335919, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateButtonOnlyPreview (EmptyState.kt:191)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, "Only Button", null, startRestartGroup, 196614, 94);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.m21869$r8$lambda$c28GRPs0fQ48xWAxBgBPy0eSU4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f9zMo3KaGMKcg6yxW7uf93tjOts(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1253455587);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1253455587, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateNoDescriptionNoButtonPreview (EmptyState.kt:149)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, "Title", null, null, null, startRestartGroup, 3078, 118);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$f9zMo3KaGMKcg6yxW7uf93tjOts(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mDQ0bmMX2h9NAY_IqIzjoPS5eug(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1099983607);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1099983607, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateDescriptionOnlyPreview (EmptyState.kt:181)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, "Only Description", null, null, startRestartGroup, 24582, 110);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$mDQ0bmMX2h9NAY_IqIzjoPS5eug(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nG2vSPU75bCwWdI7rht9ZdabUMg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1052668787);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1052668787, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStatePreview (EmptyState.kt:125)");
            }
            com.paypal.pds.core.Icon.DefaultIcon defaultIcon = com.paypal.pds.core.Icon.DefaultIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EmptyState(defaultIcon, null, null, "Title", "Description", "Label", (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 1797126, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$nG2vSPU75bCwWdI7rht9ZdabUMg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nL3XCpfa6MDVVkb5So9jh091j98(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1046780922);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1046780922, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateNoTitlePreview (EmptyState.kt:138)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, "Description", "Label", null, startRestartGroup, 221190, 78);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.$r8$lambda$nL3XCpfa6MDVVkb5So9jh091j98(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s6RKc_QhZ1rjOgFzIQ-EOTrdNkg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21870$r8$lambda$s6RKc_QhZ1rjOgFzIQEOTrdNkg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(905673570);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(905673570, updateChangedFlags, -1, "com.paypal.pds.components.EmptyStateNoDescriptionWithButtonPreview (EmptyState.kt:159)");
            }
            EmptyState(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, "Title", null, "Label", null, startRestartGroup, 199686, 86);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.EmptyStateKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.EmptyStateKt.m21870$r8$lambda$s6RKc_QhZ1rjOgFzIQEOTrdNkg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
