package com.paypal.oslo.feature.cryptocurrency.ui.hub.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a3\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"CryptoBadge", "", "badge", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;Landroidx/compose/runtime/Composer;I)V", "PriceMovementSection", "priceMovementPercent", "", "showPriceMovement", "", "cryptoPriceMovementIndicator", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoAvatarPreview", "CryptoPricePercentChangeChipPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHubCommonComponentsKt {
    public static final void CryptoBadge(final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi badgeInfoUi, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-508569194);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(badgeInfoUi) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-508569194, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoBadge (CryptoHubCommonComponents.kt:40)");
            }
            java.lang.String text = badgeInfoUi != null ? badgeInfoUi.getText() : null;
            if (text != null) {
                startRestartGroup.startReplaceGroup(1859845815);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (kotlin.jvm.internal.Intrinsics.areEqual(badgeInfoUi.getType(), com.paypal.pds.components.BadgeStyle.Positive.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1955210256);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_rewards_badge_active, new java.lang.Object[]{text}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1955016041);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_rewards_badge, new java.lang.Object[]{text}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.BadgeKt.Badge(stringResource, null, badgeInfoUi.getType(), null, null, null, null, startRestartGroup, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1859845814);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt.$r8$lambda$Jh0dSc3w4q0AAoNy5qJRP_fTaJs(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PriceMovementSection(final java.lang.String str, final boolean z, final com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1598905258);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(cryptoPriceMovementIndicatorUi == null ? -1 : cryptoPriceMovementIndicatorUi.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1598905258, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.hub.components.PriceMovementSection (CryptoHubCommonComponents.kt:75)");
            }
            if (str != null && z) {
                startRestartGroup.startReplaceGroup(1799490111);
                int i5 = i3 >> 3;
                com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.CryptoPricePercentChangeChip(str, cryptoPriceMovementIndicatorUi, modifier, startRestartGroup, (i3 & 14) | (i5 & 112) | (i5 & 896), 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1799698648);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt.m13953$r8$lambda$9DTN67uLOW66KeOrZpZfUoR1aE(str, z, cryptoPriceMovementIndicatorUi, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2VARTWwa1WO2qPwHObzXIMgTRQU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(559162233);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(559162233, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoBadgePreview (CryptoHubCommonComponents.kt:88)");
            }
            CryptoBadge(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi(com.paypal.pds.components.BadgeStyle.Positive.INSTANCE, "4"), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt.$r8$lambda$2VARTWwa1WO2qPwHObzXIMgTRQU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9DTN67uLOW66KeOrZpZf-UoR1aE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13953$r8$lambda$9DTN67uLOW66KeOrZpZfUoR1aE(java.lang.String str, boolean z, com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PriceMovementSection(str, z, cryptoPriceMovementIndicatorUi, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bx_qqnO1fQ1WaGrwERN9_HYg2Xw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-327006516);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-327006516, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoPricePercentChangeChipPreview (CryptoHubCommonComponents.kt:111)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.CryptoPricePercentChangeChip("↑2.5%", com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.UP, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt.$r8$lambda$Bx_qqnO1fQ1WaGrwERN9_HYg2Xw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jh0dSc3w4q0AAoNy5qJRP_fTaJs(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi badgeInfoUi, int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoBadge(badgeInfoUi, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KKp-kSvkYcGynHI-66R3XBscHK4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13954$r8$lambda$KKpkSvkYcGynHI66R3XBscHK4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(658560173);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(658560173, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoAvatarPreview (CryptoHubCommonComponents.kt:102)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatarKt.CryptoAvatar("", "Bitcoin", startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.components.CryptoHubCommonComponentsKt.m13954$r8$lambda$KKpkSvkYcGynHI66R3XBscHK4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
