package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"MerchantTile", "", "merchant", "Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "onMerchantClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "isLoading", "", "onFavoriteClick", "(Lcom/paypal/oslo/feature/home/domain/model/Merchant;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MerchantTileWithBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantTileKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MerchantTile(final com.paypal.oslo.feature.home.domain.model.Merchant merchant, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1655017123);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(merchant) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function03 = function02;
                    i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function04 = function03;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 != 0 ? false : z2;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.MerchantTileKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function05 = function03;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1655017123, i3, -1, "com.paypal.oslo.feature.home.ui.MerchantTile (MerchantTile.kt:65)");
                        }
                        int i7 = i3 >> 6;
                        androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.feature.home.ui.TileInstrumentationModifierKt.instrument(modifier4, merchant.getInstrumentation(), startRestartGroup, (i7 & 14) | (com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable << 3)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("store_tile", 0, 2, null));
                        com.paypal.oslo.feature.home.ui.MerchantTileConstants merchantTileConstants = com.paypal.oslo.feature.home.ui.MerchantTileConstants.INSTANCE;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function05;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(item, com.paypal.oslo.feature.home.ui.MerchantTileConstants.getHighSpeedVideoFpsRangesFor()), null, null, false, null, null, function0, startRestartGroup, (i3 << 15) & 3670016, 31);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                        java.lang.String backgroundColor = merchant.getBackgroundColor();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        com.paypal.oslo.feature.home.ui.MerchantTileConstants merchantTileConstants2 = com.paypal.oslo.feature.home.ui.MerchantTileConstants.INSTANCE;
                        int i8 = i7 & 112;
                        com.paypal.oslo.feature.home.ui.ExternalMerchantDynamicColorContainerKt.ExternalMerchantDynamicColorContainer(backgroundColor, com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(companion, com.paypal.oslo.feature.home.ui.MerchantTileConstants.getHighSpeedVideoFpsRangesFor()), z4, null, startRestartGroup, i8 | 6, 2), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1342420408, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.home.ui.MerchantTileKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.home.ui.MerchantTileKt.m14920$r8$lambda$7d_YFPFUVmEcYl5dA1lRTYjuiU(com.paypal.oslo.feature.home.domain.model.Merchant.this, function06, (androidx.compose.foundation.layout.BoxScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3072, 4);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 2, null), "merchantInfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(merchant.getName(), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), z4, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, startRestartGroup, i8 | 390, 0), "merchantName"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, composer2, 384, 6, 1016);
                        if (merchant.getLabel() != null) {
                            composer2.startReplaceGroup(-209687330);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(merchant.getLabel(), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), z4, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, composer2, i8 | 384, 0), "merchantLabel"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1016);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-209261173);
                            composer2.endReplaceGroup();
                        }
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(merchant.getDescription(), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.components.ShimmerKt.shimmer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), z4, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, composer2, i8 | 384, 0), "merchantDescription"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1016);
                        composer2.endNode();
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function04 = function06;
                        z3 = z4;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantTileKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.home.ui.MerchantTileKt.$r8$lambda$juaABcWrEYiuLYzt4LOCa_h47hw(com.paypal.oslo.feature.home.domain.model.Merchant.this, function0, modifier3, z3, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function03 = function02;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function03 = function02;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function03 = function02;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$7d_YFPFUVmEcYl5dA-1lRTYjuiU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14920$r8$lambda$7d_YFPFUVmEcYl5dA1lRTYjuiU(com.paypal.oslo.feature.home.domain.model.Merchant merchant, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(boxScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1342420408, i2, -1, "com.paypal.oslo.feature.home.ui.MerchantTile.<anonymous>.<anonymous> (MerchantTile.kt:80)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(merchant.getLogoUrl(), null, null, null, null, composer, 0, 30);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter = rememberAsyncImagePainter;
            com.paypal.pds.components.ImageKt.Image(asyncImagePainter, "", androidx.compose.ui.platform.TestTagKt.testTag(boxScope.align(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), androidx.compose.ui.Alignment.INSTANCE.getCenter()), "merchantLogo"), androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), com.paypal.pds.components.ImageCornerRadius.RadiusFull, com.paypal.pds.components.ImageAspectRatio.Square, null, composer, 224304, 64);
            if (merchant.getShowFavoriteButton()) {
                composer.startReplaceGroup(-1605300482);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), com.paypal.pds.core.ConstantsKt.getSpacing12()), "favoriteButton");
                com.paypal.pds.components.IconButtonKt.IconButton(merchant.isFavorite() ? com.paypal.pds.core.Icon.HeartFill.INSTANCE : com.paypal.pds.core.Icon.Heart.INSTANCE, function0, testTag, com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, null, null, false, false, composer, 27648, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1604859910);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eMQvqH0n53S0fN61FUVY-KMqAs0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14921$r8$lambda$eMQvqH0n53S0fN61FUVYKMqAs0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(73404873);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(73404873, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.MerchantTileWithBadgePreview (MerchantTile.kt:161)");
            }
            com.paypal.oslo.feature.home.ui.preview.HomePreviewKt.HomePreview(com.paypal.oslo.feature.home.ui.ComposableSingletons$MerchantTileKt.INSTANCE.m14893getLambda$1394339193$home_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.MerchantTileKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.MerchantTileKt.m14921$r8$lambda$eMQvqH0n53S0fN61FUVYKMqAs0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$juaABcWrEYiuLYzt4LOCa_h47hw(com.paypal.oslo.feature.home.domain.model.Merchant merchant, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MerchantTile(merchant, function0, modifier, z, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
