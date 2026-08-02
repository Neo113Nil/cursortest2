package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000f"}, d2 = {androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ImageHeight", "SingleCtaCard", "", "uiData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;", "modifier", "Landroidx/compose/ui/Modifier;", "onCtaClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/referralcard/SingleCtaOfferUiData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReferralCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SingleCtaCardKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(128.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(140.0f);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleCtaCard(final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleCtaOfferUiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-69225213);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(singleCtaOfferUiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda0
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
                        androidx.compose.runtime.ComposerKt.traceEventStart(-69225213, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCard (SingleCtaCard.kt:44)");
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.BaseColor) null, (androidx.compose.ui.graphics.painter.Painter) null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, new com.paypal.pds.components.HeaderConfig(singleCtaOfferUiData.getTitle(), singleCtaOfferUiData.getDescription(), com.paypal.pds.components.HeaderAlignment.Top, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-464805246, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt.$r8$lambda$bq_kX9UW3CNLR2nH3jMKtlIShvY(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), 8, null), new com.paypal.pds.components.FooterConfig(null, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1277542084, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt.m19546$r8$lambda$S7dagDqhyye2FIcdHF3zfQF4I(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1853844027, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt.$r8$lambda$maeVaIi7Q4iIRyO5FFirYC6mUQM(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData.this, function04, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), 31, null), function04, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.ComposableSingletons$SingleCtaCardKt.INSTANCE.m19544getLambda$996975817$shopping_rewards_prodRelease(), startRestartGroup, ((i3 << 12) & 3670016) | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | (com.paypal.pds.components.HeaderConfig.$stable << 12) | (com.paypal.pds.components.FooterConfig.$stable << 15), 6, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt.$r8$lambda$6VxsrIMGTL7TyKrhfPHStDCLf9w(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData.this, modifier5, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6VxsrIMGTL7TyKrhfPHStDCLf9w(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SingleCtaCard(singleCtaOfferUiData, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G0VlQdVId-_4lC5XYU9__lSSjLo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19545$r8$lambda$G0VlQdVId_4lC5XYU9__lSSjLo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1897272513);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1897272513, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.ReferralCardPreview (SingleCtaCard.kt:90)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData("Invite a friend", "Earn 1,000 points when a friend joins and spends $5 within 30 days.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "Share a link", "Terms apply", null, 32, null);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SingleCtaCard(singleCtaOfferUiData, companion, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCardKt.m19545$r8$lambda$G0VlQdVId_4lC5XYU9__lSSjLo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$S7dagDq-hyye2FIcdHF3zfQF-4I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19546$r8$lambda$S7dagDqhyye2FIcdHF3zfQF4I(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1277542084, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCard.<anonymous> (SingleCtaCard.kt:67)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(singleCtaOfferUiData.getTermsText(), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bq_kX9UW3CNLR2nH3jMKtlIShvY(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-464805246, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCard.<anonymous> (SingleCtaCard.kt:55)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(singleCtaOfferUiData.getCardImageUrl(), null, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoFpsRanges), getHighResolutionOutputSizeshNQ4ISI), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), composer, 197040, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$maeVaIi7Q4iIRyO5FFirYC6mUQM(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaOfferUiData singleCtaOfferUiData, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1853844027, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.referralcard.SingleCtaCard.<anonymous> (SingleCtaCard.kt:74)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, singleCtaOfferUiData.getCtaText(), null, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
