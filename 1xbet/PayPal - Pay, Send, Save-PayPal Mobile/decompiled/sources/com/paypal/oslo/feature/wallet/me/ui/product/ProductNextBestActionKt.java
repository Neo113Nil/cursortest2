package com.paypal.oslo.feature.wallet.me.ui.product;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"TestTagProductNextBestActionCardIcon", "", "TestTagProductNextBestActionCardPip", "TestTagProductNextBestActionCardTitle", "TestTagProductNextBestActionCardSubtitle", "ProductNextBestActionCard", "", "title", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Lcom/paypal/pds/core/Color;", "icon", "Lcom/paypal/pds/core/Icon;", "subtitle", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ProductNextBestActionCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "ProductNextBestActionCardAlertPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductNextBestActionKt {
    public static final java.lang.String TestTagProductNextBestActionCardIcon = "product_nba_card_icon";
    public static final java.lang.String TestTagProductNextBestActionCardPip = "product_nba_card_pip";
    public static final java.lang.String TestTagProductNextBestActionCardSubtitle = "product_nba_card_subtitle";
    public static final java.lang.String TestTagProductNextBestActionCardTitle = "product_nba_card_title";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductNextBestActionCard(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, com.paypal.pds.core.Icon icon, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.core.Color color2;
        int i5;
        com.paypal.pds.core.Icon icon2;
        int i6;
        java.lang.String str3;
        androidx.compose.ui.Modifier.Companion companion;
        final com.paypal.pds.core.Color color3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(695763038);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                color2 = color;
                i3 |= startRestartGroup.changed(color2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    icon2 = icon;
                    i3 |= startRestartGroup.changed(icon2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str3 = str2;
                        i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            color3 = color2;
                            str4 = str3;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            com.paypal.pds.core.Color.BackgroundMuted backgroundMuted = i4 != 0 ? com.paypal.pds.core.Color.BackgroundMuted.INSTANCE : color2;
                            final com.paypal.pds.core.Icon icon3 = i5 != 0 ? null : icon2;
                            final java.lang.String str5 = i6 != 0 ? null : str3;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(695763038, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionCard (ProductNextBestAction.kt:54)");
                            }
                            com.paypal.pds.components.CardStyle.Filled filled = com.paypal.pds.components.CardStyle.Filled.INSTANCE;
                            com.paypal.pds.components.CardCornerRadius cardCornerRadius = com.paypal.pds.components.CardCornerRadius.Radius12;
                            com.paypal.pds.components.CardStyle.Filled filled2 = filled;
                            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-369664316, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt.$r8$lambda$blGrdInSKxxXYc__O5kUXM20hQE(com.paypal.pds.core.Icon.this, str, str5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54);
                            int i8 = i3 >> 3;
                            int i9 = (i8 & 112) | (i8 & 14) | 806879232 | (com.paypal.pds.components.CardStyle.Filled.$stable << 9);
                            java.lang.String str6 = str5;
                            com.paypal.pds.core.Icon icon4 = icon3;
                            com.paypal.pds.components.CardKt.Card(companion, backgroundMuted, null, filled2, null, null, cardCornerRadius, null, null, rememberComposableLambda, startRestartGroup, i9, 436);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            icon2 = icon4;
                            com.paypal.pds.core.Color color4 = backgroundMuted;
                            str4 = str6;
                            color3 = color4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final com.paypal.pds.core.Icon icon5 = icon2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt.m21425$r8$lambda$ZYyoFxC3PxEzkaj7cUc0LLwpF0(str, modifier3, color3, icon5, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                icon2 = icon;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str3 = str2;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            color2 = color;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            icon2 = icon;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str3 = str2;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        color2 = color;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        icon2 = icon;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str3 = str2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8V3zsusdBwVBhsQh0iuzV1_B_wM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-83001563);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-83001563, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionCardAlertPreview (ProductNextBestAction.kt:122)");
            }
            ProductNextBestActionCard("This is an alert title.", null, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE, com.paypal.pds.core.Icon.Alert.INSTANCE, "This is an alert subtitle.", startRestartGroup, 28038, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt.$r8$lambda$8V3zsusdBwVBhsQh0iuzV1_B_wM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZYyo-FxC3PxEzkaj7cUc0LLwpF0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21425$r8$lambda$ZYyoFxC3PxEzkaj7cUc0LLwpF0(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, com.paypal.pds.core.Icon icon, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductNextBestActionCard(str, modifier, color, icon, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$blGrdInSKxxXYc__O5kUXM20hQE(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-369664316, i, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionCard.<anonymous> (ProductNextBestAction.kt:61)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (icon != null) {
                composer.startReplaceGroup(690108120);
                com.paypal.pds.components.IconKt.Icon(icon, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 9, null), TestTagProductNextBestActionCardIcon), com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, composer, 27696, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(690586574);
                com.paypal.pds.components.BadgeKt.BadgePip(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 9, null), TestTagProductNextBestActionCardPip), null, null, composer, 0, 6);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion2);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductNextBestActionCardTitle), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 1, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 12583344, 6, 888);
            java.lang.String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                composer.startReplaceGroup(776004004);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(775686316);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductNextBestActionCardSubtitle), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 12583344, 6, 888);
                composer.endReplaceGroup();
            }
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

    /* renamed from: $r8$lambda$pVZ-Rxuqw89MoMd9nAeWYv4Pf_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21426$r8$lambda$pVZRxuqw89MoMd9nAeWYv4Pf_A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(99905125);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(99905125, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionCardPreview (ProductNextBestAction.kt:111)");
            }
            ProductNextBestActionCard("This is a next best action title.", null, null, null, "This is a next best action subtitle.", startRestartGroup, 24582, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt.m21426$r8$lambda$pVZRxuqw89MoMd9nAeWYv4Pf_A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
