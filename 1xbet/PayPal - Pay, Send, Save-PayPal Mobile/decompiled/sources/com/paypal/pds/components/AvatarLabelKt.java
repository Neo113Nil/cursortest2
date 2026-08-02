package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aC\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006 "}, d2 = {"AvatarLabel", "", "source", "Lcom/paypal/pds/components/AvatarSource;", "label", "", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/AvatarSize;", "emphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onClick", "Lkotlin/Function0;", "(Lcom/paypal/pds/components/AvatarSource;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Lcom/paypal/pds/components/AvatarEmphasis;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AvatarLabelGroup", "items", "", "Lcom/paypal/pds/components/AvatarLabelGroupItem;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Lcom/paypal/pds/components/AvatarLabelLayout;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarLabelLayout;Lcom/paypal/pds/components/AvatarSize;Lcom/paypal/pds/components/AvatarEmphasis;Landroidx/compose/runtime/Composer;II)V", "getSampleAvatarGroupItems", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "AvatarLabelPreview", "(Landroidx/compose/runtime/Composer;I)V", "AvatarLabelGroupGridPreview", "AvatarLabelGroupHorizontalScrollPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AvatarLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AvatarLabel(final com.paypal.pds.components.AvatarSource avatarSource, final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis2;
        int i6;
        java.lang.String str4;
        int i7;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        com.paypal.pds.components.AvatarSize avatarSize2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis3;
        final java.lang.String str5;
        final java.lang.String str6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1703296046);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(avatarSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(avatarSize) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    avatarEmphasis2 = avatarEmphasis;
                    i3 |= startRestartGroup.changed(avatarEmphasis2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str4 = str2;
                        i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(str3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            avatarSize2 = avatarSize;
                            function02 = function0;
                            avatarEmphasis3 = avatarEmphasis2;
                            str5 = str4;
                            str6 = str3;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            avatarSize2 = i4 != 0 ? com.paypal.pds.components.AvatarSize.Large.INSTANCE : avatarSize;
                            com.paypal.pds.components.AvatarEmphasis avatarEmphasis4 = i5 != 0 ? com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE : avatarEmphasis2;
                            java.lang.String str7 = i6 != 0 ? null : str4;
                            java.lang.String str8 = i7 != 0 ? null : str3;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function03 = i8 != 0 ? null : function0;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1703296046, i3, -1, "com.paypal.pds.components.AvatarLabel (AvatarLabel.kt:72)");
                            }
                            int i10 = i3;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            androidx.compose.ui.Modifier m22101optClickablecJG_KMw = com.paypal.pds.core.ModifierExtensionsKt.m22101optClickablecJG_KMw(androidx.compose.ui.draw.ClipKt.clip(modifier3, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12()), null, null, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c()), function03, startRestartGroup, 57344 & (i3 >> 9), 3);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$WQiByKuXXsPnMJBgDgV_E0Yf9DE((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m22101optClickablecJG_KMw, true, (kotlin.jvm.functions.Function1) rememberedValue), false, null, 3, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, focusable$default);
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
                            int i11 = i10 >> 3;
                            com.paypal.pds.components.AvatarKt.Avatar(avatarSource, null, avatarSize2, avatarEmphasis4, null, null, startRestartGroup, (i10 & 14) | (i11 & 896) | (i11 & 7168), 50);
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, (i11 & 14) | 48, 6, 1004);
                            if (str7 == null) {
                                composer2.startReplaceGroup(992765185);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(992765186);
                                java.lang.String str9 = str7;
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str9, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1002);
                                composer2.endReplaceGroup();
                            }
                            if (str8 == null) {
                                composer2.startReplaceGroup(992994306);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(992994307);
                                java.lang.String str10 = str8;
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str10, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1002);
                                composer2.endReplaceGroup();
                            }
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            avatarEmphasis3 = avatarEmphasis4;
                            str5 = str7;
                            str6 = str8;
                            function02 = function03;
                            modifier2 = modifier4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final com.paypal.pds.components.AvatarSize avatarSize3 = avatarSize2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$8tQGviwMs8dg6wLIkQu4MpG3Juk(com.paypal.pds.components.AvatarSource.this, str, modifier2, avatarSize3, avatarEmphasis3, str5, str6, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str4 = str2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                avatarEmphasis2 = avatarEmphasis;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                str4 = str2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            avatarEmphasis2 = avatarEmphasis;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str4 = str2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        avatarEmphasis2 = avatarEmphasis;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str4 = str2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AvatarLabelGroup(final java.util.List<com.paypal.pds.components.AvatarLabelGroupItem> list, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout2;
        int i4;
        com.paypal.pds.components.AvatarSize avatarSize2;
        int i5;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis2;
        androidx.compose.ui.Modifier.Companion companion;
        final com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout3;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis4;
        final com.paypal.pds.components.AvatarSize avatarSize3;
        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1316974251);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                avatarLabelLayout2 = avatarLabelLayout;
                i6 |= startRestartGroup.changed(avatarLabelLayout2) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i6 |= 3072;
                } else if ((i & 3072) == 0) {
                    avatarSize2 = avatarSize;
                    i6 |= startRestartGroup.changed(avatarSize2) ? 2048 : 1024;
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i6 |= 24576;
                    } else if ((i & 24576) == 0) {
                        avatarEmphasis2 = avatarEmphasis;
                        i6 |= startRestartGroup.changed(avatarEmphasis2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            avatarLabelLayout3 = avatarLabelLayout2;
                            avatarEmphasis3 = avatarEmphasis2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll horizontalScroll = i3 != 0 ? com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll.INSTANCE : avatarLabelLayout2;
                            com.paypal.pds.components.AvatarSize avatarSize4 = i4 != 0 ? com.paypal.pds.components.AvatarSize.Large.INSTANCE : avatarSize2;
                            if (i5 != 0) {
                                avatarEmphasis2 = com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1316974251, i6, -1, "com.paypal.pds.components.AvatarLabelGroup (AvatarLabel.kt:125)");
                            }
                            if (horizontalScroll instanceof com.paypal.pds.components.AvatarLabelLayout.Grid) {
                                startRestartGroup.startReplaceGroup(-545981878);
                                com.paypal.pds.components.AvatarLabelLayout.Grid grid = (com.paypal.pds.components.AvatarLabelLayout.Grid) horizontalScroll;
                                int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(grid.getNumberOfColumns(), kotlin.ranges.RangesKt.coerceAtLeast(list.size(), 1));
                                if (coerceAtMost <= 0) {
                                    startRestartGroup.endReplaceGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final androidx.compose.ui.Modifier modifier3 = companion;
                                        final com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout4 = horizontalScroll;
                                        final com.paypal.pds.components.AvatarSize avatarSize5 = avatarSize4;
                                        final com.paypal.pds.components.AvatarEmphasis avatarEmphasis6 = avatarEmphasis2;
                                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return com.paypal.pds.components.AvatarLabelKt.m21580$r8$lambda$M74gN9eVk5VDUDp12OremA1n_4(list, modifier3, avatarLabelLayout4, avatarSize5, avatarEmphasis6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                            }
                                        };
                                        endRestartGroup.updateScope(function2);
                                        return;
                                    }
                                    return;
                                }
                                boolean z = grid.getNumberOfColumns() < list.size();
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                                startRestartGroup.startReplaceGroup(-1073837667);
                                for (java.util.List<com.paypal.pds.components.AvatarLabelGroupItem> list2 : kotlin.collections.CollectionsKt.chunked(list, coerceAtMost)) {
                                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-1561463830);
                                    for (com.paypal.pds.components.AvatarLabelGroupItem avatarLabelGroupItem : list2) {
                                        AvatarLabel(avatarLabelGroupItem.getAvatarSource(), avatarLabelGroupItem.getLabel(), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, avatarLabelGroupItem.getAnalyticsScope().getModifier(), 1.0f, false, 2, null), avatarSize4, avatarEmphasis2, avatarLabelGroupItem.getDescription(), avatarLabelGroupItem.getData(), avatarLabelGroupItem.getOnClick(), startRestartGroup, i6 & 64512, 0);
                                        coerceAtMost = coerceAtMost;
                                        avatarEmphasis2 = avatarEmphasis2;
                                        avatarSize4 = avatarSize4;
                                    }
                                    int i8 = coerceAtMost;
                                    com.paypal.pds.components.AvatarEmphasis avatarEmphasis7 = avatarEmphasis2;
                                    com.paypal.pds.components.AvatarSize avatarSize6 = avatarSize4;
                                    startRestartGroup.endReplaceGroup();
                                    if (z) {
                                        startRestartGroup.startReplaceGroup(-1160021070);
                                        int size = list2.size();
                                        for (int i9 = 0; i9 < i8 - size; i9++) {
                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1159841363);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    startRestartGroup.endNode();
                                    coerceAtMost = i8;
                                    avatarEmphasis2 = avatarEmphasis7;
                                    avatarSize4 = avatarSize6;
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                                avatarEmphasis4 = avatarEmphasis2;
                                avatarSize3 = avatarSize4;
                            } else {
                                com.paypal.pds.components.AvatarEmphasis avatarEmphasis8 = avatarEmphasis2;
                                com.paypal.pds.components.AvatarSize avatarSize7 = avatarSize4;
                                if (horizontalScroll instanceof com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll) {
                                    startRestartGroup.startReplaceGroup(-544264230);
                                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_42 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                                    boolean changedInstance = startRestartGroup.changedInstance(list);
                                    boolean z2 = (i6 & 7168) == 2048;
                                    boolean z3 = (57344 & i6) == 16384;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (((changedInstance || z2) || z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        avatarEmphasis5 = avatarEmphasis8;
                                        avatarSize3 = avatarSize7;
                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$EqLgzlaf8DnYSbb2_u70FlQ1XSc(list, avatarSize3, avatarEmphasis5, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        avatarEmphasis5 = avatarEmphasis8;
                                        avatarSize3 = avatarSize7;
                                    }
                                    avatarEmphasis4 = avatarEmphasis5;
                                    androidx.compose.foundation.lazy.LazyDslKt.LazyRow(companion, null, null, false, m1602spacedBy0680j_42, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i6 >> 3) & 14) | 24576, 494);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    avatarEmphasis4 = avatarEmphasis8;
                                    avatarSize3 = avatarSize7;
                                    startRestartGroup.startReplaceGroup(-543652073);
                                    startRestartGroup.endReplaceGroup();
                                }
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            avatarSize2 = avatarSize3;
                            avatarLabelLayout3 = horizontalScroll;
                            avatarEmphasis3 = avatarEmphasis4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier4 = companion;
                            final com.paypal.pds.components.AvatarSize avatarSize8 = avatarSize2;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.AvatarLabelKt.m21579$r8$lambda$Bq5Luxky_OqwAWm7lEFbbtyD7A(list, modifier4, avatarLabelLayout3, avatarSize8, avatarEmphasis3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                    avatarEmphasis2 = avatarEmphasis;
                    if (!startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                avatarSize2 = avatarSize;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                avatarEmphasis2 = avatarEmphasis;
                if (!startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            avatarLabelLayout2 = avatarLabelLayout;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            avatarSize2 = avatarSize;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            avatarEmphasis2 = avatarEmphasis;
            if (!startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        avatarLabelLayout2 = avatarLabelLayout;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        avatarSize2 = avatarSize;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        avatarEmphasis2 = avatarEmphasis;
        if (!startRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final java.util.List<com.paypal.pds.components.AvatarLabelGroupItem> getHighSpeedVideoFpsRanges(final android.content.Context context, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1713137067, 0, -1, "com.paypal.pds.components.getSampleAvatarGroupItems (AvatarLabel.kt:237)");
        }
        com.paypal.pds.components.AvatarLabelGroupItem[] avatarLabelGroupItemArr = new com.paypal.pds.components.AvatarLabelGroupItem[5];
        com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().avatarImage(), composer, 0), null, 2, null);
        boolean changedInstance = composer.changedInstance(context);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$nDupZoi1MruESdMtRnw3MKUFNj0(context);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        avatarLabelGroupItemArr[0] = new com.paypal.pds.components.AvatarLabelGroupItem(image, "John Doe", "Engineer", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (kotlin.jvm.functions.Function0) rememberedValue, null, 32, null);
        avatarLabelGroupItemArr[1] = new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Initials("AB"), "Alice Brown", "Designer", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, null, 48, null);
        avatarLabelGroupItemArr[2] = new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Person.INSTANCE), "Bob Smith", "Manager", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, null, 48, null);
        avatarLabelGroupItemArr[3] = new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Initials("CD"), "Carol Davis", "Description", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, null, 48, null);
        avatarLabelGroupItemArr[4] = new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Initials("EF"), "Eve Foster", "Analyst", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, null, 48, null);
        java.util.List<com.paypal.pds.components.AvatarLabelGroupItem> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) avatarLabelGroupItemArr);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listOf;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4qNLw7Jb3DEqtnkXq_WHRs_S_CA(android.content.Context context) {
        android.widget.Toast.makeText(context, "Avatar clicked", 0).show();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8tQGviwMs8dg6wLIkQu4MpG3Juk(com.paypal.pds.components.AvatarSource avatarSource, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AvatarLabel(avatarSource, str, modifier, avatarSize, avatarEmphasis, str2, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Bq5L-uxky_OqwAWm7lEFbbtyD7A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21579$r8$lambda$Bq5Luxky_OqwAWm7lEFbbtyD7A(java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AvatarLabelGroup(list, modifier, avatarLabelLayout, avatarSize, avatarEmphasis, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EqLgzlaf8DnYSbb2_u70FlQ1XSc(final java.util.List list, final com.paypal.pds.components.AvatarSize avatarSize, final com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.pds.components.AvatarLabelKt$AvatarLabelGroup$lambda$2$0$$inlined$items$default$1 avatarLabelKt$AvatarLabelGroup$lambda$2$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AvatarLabelKt$AvatarLabelGroup$lambda$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.pds.components.AvatarLabelGroupItem avatarLabelGroupItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.pds.components.AvatarLabelGroupItem) obj);
            }
        };
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.pds.components.AvatarLabelKt$AvatarLabelGroup$lambda$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.pds.components.AvatarLabelKt$AvatarLabelGroup$lambda$2$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                com.paypal.pds.components.AvatarLabelGroupItem avatarLabelGroupItem = (com.paypal.pds.components.AvatarLabelGroupItem) list.get(i);
                composer.startReplaceGroup(-2118419458);
                com.paypal.pds.components.AvatarLabelKt.AvatarLabel(avatarLabelGroupItem.getAvatarSource(), avatarLabelGroupItem.getLabel(), avatarLabelGroupItem.getAnalyticsScope().getModifier(), avatarSize, avatarEmphasis, avatarLabelGroupItem.getDescription(), avatarLabelGroupItem.getData(), avatarLabelGroupItem.getOnClick(), composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ilp8prKORJ0mkK2kjbs6kcSVU6c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1485524299);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1485524299, updateChangedFlags, -1, "com.paypal.pds.components.AvatarLabelGroupHorizontalScrollPreview (AvatarLabel.kt:345)");
            }
            AvatarLabelGroup(getHighSpeedVideoFpsRanges((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), startRestartGroup), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), com.paypal.pds.components.AvatarLabelLayout.HorizontalScroll.INSTANCE, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$Ilp8prKORJ0mkK2kjbs6kcSVU6c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JILDdoXO_Krt5D5puYwLcoR8BFw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1288930145);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1288930145, updateChangedFlags, -1, "com.paypal.pds.components.AvatarLabelPreview (AvatarLabel.kt:276)");
            }
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().avatarImage(), startRestartGroup, 0), null, 2, null);
            com.paypal.pds.components.AvatarSize.XLarge xLarge = com.paypal.pds.components.AvatarSize.XLarge.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$4qNLw7Jb3DEqtnkXq_WHRs_S_CA(context);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AvatarLabel(image, "John Doe", null, xLarge, null, "Description", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 1772592, 20);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 6);
            AvatarLabel(new com.paypal.pds.components.AvatarSource.Initials("A"), "John Doe", null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, com.paypal.pds.components.AvatarEmphasis.High.INSTANCE, "Description", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, startRestartGroup, 1797168, 132);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 6);
            AvatarLabel(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Person.INSTANCE), "John Doe", null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, "Description", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, startRestartGroup, 1772592, 148);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$JILDdoXO_Krt5D5puYwLcoR8BFw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M74g-N9eVk5VDUDp12OremA1n_4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21580$r8$lambda$M74gN9eVk5VDUDp12OremA1n_4(java.util.List list, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarLabelLayout avatarLabelLayout, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AvatarLabelGroup(list, modifier, avatarLabelLayout, avatarSize, avatarEmphasis, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WQiByKuXXsPnMJBgDgV_E0Yf9DE(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$clF7d3boPb8gOKydNsYsYYX15sY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(321103990);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(321103990, updateChangedFlags, -1, "com.paypal.pds.components.AvatarLabelGroupGridPreview (AvatarLabel.kt:319)");
            }
            AvatarLabelGroup(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.AvatarLabelGroupItem[]{new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().avatarImage(), startRestartGroup, 0), null, 2, null), "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", null, null, 48, null), new com.paypal.pds.components.AvatarLabelGroupItem(new com.paypal.pds.components.AvatarSource.Initials("JK"), "John Kennedy", "Analyst", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, null, null, 48, null)}), (java.lang.Iterable) getHighSpeedVideoFpsRanges((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), startRestartGroup)), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), new com.paypal.pds.components.AvatarLabelLayout.Grid(4), null, null, startRestartGroup, 48, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AvatarLabelKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.AvatarLabelKt.$r8$lambda$clF7d3boPb8gOKydNsYsYYX15sY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nDupZoi1MruESdMtRnw3MKUFNj0(android.content.Context context) {
        android.widget.Toast.makeText(context, "Avatar clicked", 0).show();
        return kotlin.Unit.INSTANCE;
    }
}
