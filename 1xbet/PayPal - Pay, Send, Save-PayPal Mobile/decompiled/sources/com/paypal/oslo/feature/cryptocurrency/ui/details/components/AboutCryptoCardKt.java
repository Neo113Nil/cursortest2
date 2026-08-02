package com.paypal.oslo.feature.cryptocurrency.ui.details.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"AboutCryptoCardTag", "", "AboutCryptoCard", "", "assetName", "logoUrl", "assetDescription", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/CryptoAssetDescriptionUiState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AboutCryptoPreview", "(Landroidx/compose/runtime/Composer;I)V", "AboutCryptoWithPpdPreview", "AboutCryptoWithLinksPreview", "AboutCryptoStablecoinPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AboutCryptoCardKt {
    public static final java.lang.String AboutCryptoCardTag = "about-crypto-card";

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutCryptoCard(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState cryptoAssetDescriptionUiState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAssetDescriptionUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1604543066);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(cryptoAssetDescriptionUiState) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1604543066, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCard (AboutCryptoCard.kt:53)");
                }
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), AboutCryptoCardTag), com.paypal.pds.core.Color.BackgroundCardOutlined.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-993579468, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.m13888$r8$lambda$KNcWODLPD_Kpi2IccAtNV4MbA4(str2, cryptoAssetDescriptionUiState, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.$r8$lambda$hqgP1BTQwll9am90RITWJPn6g5o(str, str2, cryptoAssetDescriptionUiState, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$46wZ1UBiSYxCa5F-KfUpTTcJ2x4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13887$r8$lambda$46wZ1UBiSYxCa5FKfUpTTcJ2x4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1973378515);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1973378515, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoWithPpdPreview (AboutCryptoCard.kt:145)");
            }
            AboutCryptoCard("Bitcoin", "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_btc_description, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_exchange_rate_disclaimer), com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_regulatory_disclaimer, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_hub_ppd_disclosure), null), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.m13887$r8$lambda$46wZ1UBiSYxCa5FKfUpTTcJ2x4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GuI4Fd0DE8SksHtsXe90E52Sqww(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(397017851);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(397017851, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoStablecoinPreview (AboutCryptoCard.kt:183)");
            }
            AboutCryptoCard("PYUSD", "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_pyusd_description, null, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_regulatory_disclaimer, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_hub_ppd_disclosure), "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc"), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.$r8$lambda$GuI4Fd0DE8SksHtsXe90E52Sqww(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KNcWODLPD_Kpi2IccAtNV-4MbA4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13888$r8$lambda$KNcWODLPD_Kpi2IccAtNV4MbA4(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState cryptoAssetDescriptionUiState, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-993579468, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCard.<anonymous> (AboutCryptoCard.kt:60)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            if (str == null) {
                composer.startReplaceGroup(1944295072);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1944295073);
                com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatarKt.CryptoAvatar(str, str2, composer, 0);
                composer.endReplaceGroup();
            }
            if (cryptoAssetDescriptionUiState.getDescriptionLinkUrl() != null) {
                composer.startReplaceGroup(1944581079);
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.toCryptoRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoAssetDescriptionUiState.getDescriptionResId(), new java.lang.Object[]{cryptoAssetDescriptionUiState.getDescriptionLinkUrl()}, composer, 0), null, 1, null), null, null, null, null, null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, null, composer, 0, 48, 6142);
                composer.endReplaceGroup();
                composer2 = composer;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1944975027);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoAssetDescriptionUiState.getDescriptionResId(), composer2, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer.endReplaceGroup();
            }
            java.lang.Integer exchangeRateDisclaimerResId = cryptoAssetDescriptionUiState.getExchangeRateDisclaimerResId();
            if (exchangeRateDisclaimerResId == null) {
                composer2.startReplaceGroup(1945326628);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1945326629);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(exchangeRateDisclaimerResId.intValue(), composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(cryptoAssetDescriptionUiState.getRegulatoryDisclaimerResId(), composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
            java.lang.Integer ppdDisclosureResId = cryptoAssetDescriptionUiState.getPpdDisclosureResId();
            if (ppdDisclosureResId == null) {
                composer2.startReplaceGroup(1945972420);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1945972421);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(ppdDisclosureResId.intValue(), composer2, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OSezfIrYdvncoPoelYznEot9nCk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1800020879);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1800020879, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoPreview (AboutCryptoCard.kt:126)");
            }
            AboutCryptoCard("Bitcoin", "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_btc_description, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_exchange_rate_disclaimer), com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_regulatory_disclaimer, null, null), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.$r8$lambda$OSezfIrYdvncoPoelYznEot9nCk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$atrXkH8NLC3iwbaT2FwSigdqpYo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1698085186);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1698085186, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoWithLinksPreview (AboutCryptoCard.kt:164)");
            }
            AboutCryptoCard("Bitcoin", "https://www.paypalobjects.com/cryptocurrency/coin-bitcoin.png", new com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_pyusd_description, null, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_asset_regulatory_disclaimer, null, "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc"), null, startRestartGroup, 54, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.AboutCryptoCardKt.$r8$lambda$atrXkH8NLC3iwbaT2FwSigdqpYo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hqgP1BTQwll9am90RITWJPn6g5o(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState cryptoAssetDescriptionUiState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AboutCryptoCard(str, str2, cryptoAssetDescriptionUiState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
