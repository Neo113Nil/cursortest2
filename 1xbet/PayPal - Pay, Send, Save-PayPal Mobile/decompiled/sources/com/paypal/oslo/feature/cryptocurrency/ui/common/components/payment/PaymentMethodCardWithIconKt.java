package com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aW\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0016"}, d2 = {"PaymentMethodCardWithIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lcom/paypal/pds/core/Icon;", "logoUrl", "", "contentDescription", "iconSize", "Lcom/paypal/pds/components/IconSize;", "iconTint", "Lcom/paypal/pds/core/Color;", "iconBackgroundColor", "(Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/IconSize;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "PaymentMethodCardWithIconBankPreview", "(Landroidx/compose/runtime/Composer;I)V", "PaymentMethodCardWithIconCardPreview", "PaymentMethodCardWithIconChevronRightPreview", "PaymentMethodCardWithIconSmallSizePreview", "PaymentMethodCardWithIconMediumSizePreview", "PaymentMethodCardWithIconMutedColorPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentMethodCardWithIconKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodCardWithIcon(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        java.lang.String str3;
        int i5;
        java.lang.String str4;
        int i6;
        com.paypal.pds.components.IconSize iconSize2;
        int i7;
        com.paypal.pds.core.Color color3;
        int i8;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.pds.core.Icon icon2;
        final com.paypal.pds.core.Color color4;
        final java.lang.String str5;
        final com.paypal.pds.components.IconSize iconSize3;
        final com.paypal.pds.core.Color color5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(814239228);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        iconSize2 = iconSize;
                        i3 |= startRestartGroup.changed(iconSize2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            color3 = color;
                            i3 |= startRestartGroup.changed(color3) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(color2) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                icon2 = icon;
                                color4 = color2;
                                str5 = str4;
                                iconSize3 = iconSize2;
                                color5 = color3;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                com.paypal.pds.core.Icon.LogoPaypalMarkColor logoPaypalMarkColor = i10 != 0 ? com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE : icon;
                                java.lang.String str6 = i4 != 0 ? null : str3;
                                java.lang.String str7 = i5 == 0 ? str4 : null;
                                com.paypal.pds.components.IconSize.Small small = i6 != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : iconSize2;
                                com.paypal.pds.core.Color color6 = i7 != 0 ? com.paypal.pds.core.Color.ContentBase.INSTANCE : color3;
                                com.paypal.pds.core.Color color7 = i8 != 0 ? com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE : color2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(814239228, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIcon (PaymentMethodCardWithIcon.kt:42)");
                                }
                                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(companion, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing2())), color7, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, (i3 >> 15) & 112, 2);
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                if (str6 != null) {
                                    startRestartGroup.startReplaceGroup(-1807766389);
                                    com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str6, null, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), startRestartGroup, ((i3 >> 6) & 14) | 196656, 24);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-1807447554);
                                    int i11 = i3 >> 3;
                                    com.paypal.pds.components.IconKt.Icon(logoPaypalMarkColor, str7, null, small, color6, startRestartGroup, ((i3 >> 6) & 112) | (i11 & 14) | (i11 & 7168) | (57344 & i11), 4);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                str5 = str7;
                                str3 = str6;
                                iconSize3 = small;
                                color5 = color6;
                                color4 = color7;
                                icon2 = logoPaypalMarkColor;
                                modifier2 = companion;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final com.paypal.pds.core.Icon icon3 = icon2;
                                final java.lang.String str8 = str3;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.$r8$lambda$H6senC7bcvsD1eHb_42xofZhyrU(androidx.compose.ui.Modifier.this, icon3, str8, str5, iconSize3, color5, color4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        color3 = color;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    iconSize2 = iconSize;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    color3 = color;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                str4 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                iconSize2 = iconSize;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                color3 = color;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            iconSize2 = iconSize;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            color3 = color;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        iconSize2 = iconSize;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        color3 = color;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$111FVHtaCpQZq3wusDqfjn7_IMM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(284067042);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(284067042, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconSmallSizePreview (PaymentMethodCardWithIcon.kt:109)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.Card.INSTANCE, null, "Small Card Icon", com.paypal.pds.components.IconSize.Small.INSTANCE, null, null, startRestartGroup, 27696, 101);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.$r8$lambda$111FVHtaCpQZq3wusDqfjn7_IMM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8m_3sLZVthk_rdoQWn3pOhx_zAA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1854875394);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1854875394, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconMutedColorPreview (PaymentMethodCardWithIcon.kt:135)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.Bank.INSTANCE, null, "Muted Color Bank", null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, startRestartGroup, 199728, 85);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.$r8$lambda$8m_3sLZVthk_rdoQWn3pOhx_zAA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H6senC7bcvsD1eHb_42xofZhyrU(androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentMethodCardWithIcon(modifier, icon, str, str2, iconSize, color, color2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O6YyFdnxF_wJ1jRYmc_QPSCiWfI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1941971740);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1941971740, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconMediumSizePreview (PaymentMethodCardWithIcon.kt:122)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.Card.INSTANCE, null, "Medium Card Icon", com.paypal.pds.components.IconSize.Medium.INSTANCE, null, null, startRestartGroup, 27696, 101);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.$r8$lambda$O6YyFdnxF_wJ1jRYmc_QPSCiWfI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RsgDxZp_MfJlC0izQx2K1QiKUak(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-923364438);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-923364438, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconCardPreview (PaymentMethodCardWithIcon.kt:85)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.Card.INSTANCE, null, "Debit Card", null, null, null, startRestartGroup, 3120, 117);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.$r8$lambda$RsgDxZp_MfJlC0izQx2K1QiKUak(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$grnItBM6jf2hlYrODoS-QAYhVpA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13826$r8$lambda$grnItBM6jf2hlYrODoSQAYhVpA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(653188857);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(653188857, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconChevronRightPreview (PaymentMethodCardWithIcon.kt:97)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, "Chevron Right", null, null, null, startRestartGroup, 3120, 117);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.m13826$r8$lambda$grnItBM6jf2hlYrODoSQAYhVpA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hTA-GqrUCYSqHrSU2_-9s6CKwOs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13827$r8$lambda$hTAGqrUCYSqHrSU2_9s6CKwOs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(287852286);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(287852286, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconBankPreview (PaymentMethodCardWithIcon.kt:73)");
            }
            PaymentMethodCardWithIcon(null, com.paypal.pds.core.Icon.Bank.INSTANCE, null, "Bank Account", null, null, null, startRestartGroup, 3120, 117);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodCardWithIconKt.m13827$r8$lambda$hTAGqrUCYSqHrSU2_9s6CKwOs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
