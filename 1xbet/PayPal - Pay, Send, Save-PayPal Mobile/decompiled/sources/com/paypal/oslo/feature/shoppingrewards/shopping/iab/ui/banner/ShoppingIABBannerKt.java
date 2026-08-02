package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"PayPalPlusLogoHeight", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "CtaShimmerWidth", "ShoppingIABBanner", "", "bannerContent", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "onCtaClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "strongPattern", "Lkotlin/text/Regex;", "parseBannerRichText", "Lcom/paypal/pds/core/RichText;", "text", "", "ShoppingIABBannerPreviewContent", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;Landroidx/compose/runtime/Composer;I)V", "ShoppingIABBannerBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "ShoppingIABBannerEarnPointsPreview", "ShoppingIABBannerLoadingPreview", "ShoppingIABBannerHiddenCtaPreview", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABBannerKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(96.0f);
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("<strong>(.*?)</strong>", kotlin.text.RegexOption.DOT_MATCHES_ALL);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShoppingIABBanner(final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Modifier.Companion companion;
        int i4;
        androidx.compose.runtime.Composer composer3;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContentData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1799228245);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bannerContentData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1799228245, i3, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBanner (ShoppingIABBanner.kt:84)");
                }
                final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = (androidx.compose.ui.hapticfeedback.HapticFeedback) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback());
                boolean changedInstance = startRestartGroup.changedInstance(hapticFeedback);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$pMc1oW3NPoR1XsHv_L2CnjxawcE(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z2 = bannerContentData.getCtaMode() != com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Hidden;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.BANNER), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                if (z2) {
                    startRestartGroup.startReplaceGroup(-382615338);
                    modifier4 = background;
                    modifier3 = modifier5;
                    str = "";
                    companion = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, null, null, function02, startRestartGroup, 6, 31);
                    startRestartGroup.endReplaceGroup();
                } else {
                    str = "";
                    modifier4 = background;
                    modifier3 = modifier5;
                    startRestartGroup.startReplaceGroup(-382524291);
                    startRestartGroup.endReplaceGroup();
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(modifier4.then(companion), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                if (bannerContentData.getUseBadge()) {
                    startRestartGroup.startReplaceGroup(1202749516);
                    com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE), com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), startRestartGroup, 390, 0), com.paypal.pds.components.AvatarSize.Small.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.Unspecified.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Small.$stable << 6, 48);
                    startRestartGroup.endReplaceGroup();
                    i4 = 0;
                } else {
                    startRestartGroup.startReplaceGroup(1203269913);
                    i4 = 0;
                    androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.shoppingrewards.R.drawable.feature_shopping_rewards_ic_paypal_plus, startRestartGroup, 0), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRanges), (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 432, 120);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, i4);
                java.lang.String textString = bannerContentData.getTextString();
                if (textString != null) {
                    startRestartGroup.startReplaceGroup(-1485187056);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1203907831);
                    java.lang.Integer textResId = bannerContentData.getTextResId();
                    if (textResId == null) {
                        startRestartGroup.startReplaceGroup(1203907830);
                        startRestartGroup.endReplaceGroup();
                        stringResource = null;
                    } else {
                        startRestartGroup.startReplaceGroup(1203907831);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(textResId.intValue(), startRestartGroup, i4);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    textString = stringResource;
                }
                final java.lang.String replace$default = kotlin.text.StringsKt.replace$default(textString == null ? str : textString, "%%", "%", false, 4, (java.lang.Object) null);
                boolean changed = startRestartGroup.changed(replace$default);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$UdLsSVNU4iydUVu8y_uBMlFH4bk(replace$default, (com.paypal.pds.core.Builder) obj);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0((com.paypal.pds.core.RichText) rememberedValue2, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, null, startRestartGroup, 0, 48, 6140);
                int i6 = com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.WhenMappings.$EnumSwitchMapping$0[bannerContentData.getCtaMode().ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(1204849332);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer3, i4);
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRangesFor), com.paypal.pds.core.ConstantsKt.getSize32()), false, com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, composer3, 384, 1), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.BANNER_CTA_SHIMMER), composer3, i4);
                        composer3.endReplaceGroup();
                    } else {
                        if (i6 != 3) {
                            startRestartGroup.startReplaceGroup(-1485173355);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(1205252890);
                        composer3.endReplaceGroup();
                    }
                    composer2 = composer3;
                } else {
                    startRestartGroup.startReplaceGroup(1204316442);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i4);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(bannerContentData.getCtaTextResId(), startRestartGroup, i4);
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$iToNH4kP2XEwm7hOoBgmKfSnE1g((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function02, stringResource2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion2, (kotlin.jvm.functions.Function1) rememberedValue3), com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABTestTags.BANNER_LEARN_MORE_BUTTON), null, null, secondary, small, false, false, startRestartGroup, 1769472, 408);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$kR3cflWP3QRBNMMUWJXsgdJPnhY(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData.this, function0, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-184011859);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(bannerContentData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-184011859, i2, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerPreviewContent (ShoppingIABBanner.kt:208)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ShoppingIABBanner(bannerContentData, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, (i2 & 14) | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$SsCRFCpe9Z14HUpqVaHySYVtL2A(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7sS0dRqQWviYlwmnltc8PmTHO4A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1607338263);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1607338263, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerLoadingPreview (ShoppingIABBanner.kt:243)");
            }
            getHighSpeedVideoSizes(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_later), null, 0, true, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Loading, 6, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$7sS0dRqQWviYlwmnltc8PmTHO4A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DOz98AIKPUvpJBgGO8XQ0grJ9C8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(300838195);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(300838195, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerHiddenCtaPreview (ShoppingIABBanner.kt:257)");
            }
            getHighSpeedVideoSizes(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_fallback), null, 0, true, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Hidden, 6, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$DOz98AIKPUvpJBgGO8XQ0grJ9C8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IXGLN1xs6VuEZ8PVs6ETN2GcupY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1609639792);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1609639792, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerBadgePreview (ShoppingIABBanner.kt:217)");
            }
            getHighSpeedVideoSizes(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_later), null, 0, true, null, 22, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.$r8$lambda$IXGLN1xs6VuEZ8PVs6ETN2GcupY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SsCRFCpe9Z14HUpqVaHySYVtL2A(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(bannerContentData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UdLsSVNU4iydUVu8y_uBMlFH4bk(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int i = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(getHighResolutionOutputSizeshNQ4ISI, str, 0, 2, null)) {
            if (matchResult.getRange().getFirst() > i) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            com.paypal.pds.core.Builder.append$default(builder, matchResult.getGroupValues().get(1), com.paypal.pds.core.Color.ContentLink.INSTANCE, false, 4, null);
            i = matchResult.getRange().getLast() + 1;
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bWsYCSH6eFbYAkt-hdyw8xtj_YI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19635$r8$lambda$bWsYCSH6eFbYAkthdyw8xtj_YI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-561743032);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-561743032, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerEarnPointsPreview (ShoppingIABBanner.kt:230)");
            }
            getHighSpeedVideoSizes(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_earn_points_pp_plus), null, 0, true, null, 22, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.banner.ShoppingIABBannerKt.m19635$r8$lambda$bWsYCSH6eFbYAkthdyw8xtj_YI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iToNH4kP2XEwm7hOoBgmKfSnE1g(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kR3cflWP3QRBNMMUWJXsgdJPnhY(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShoppingIABBanner(bannerContentData, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pMc1oW3NPoR1XsHv_L2CnjxawcE(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function0 function0) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI());
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Visible.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Loading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Hidden.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
