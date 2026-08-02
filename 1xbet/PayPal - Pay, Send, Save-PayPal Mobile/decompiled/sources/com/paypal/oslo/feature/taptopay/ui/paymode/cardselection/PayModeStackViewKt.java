package com.paypal.oslo.feature.taptopay.ui.paymode.cardselection;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a]\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\u001a\u001f\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\"\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"CardFallbackColor", "Landroidx/compose/ui/graphics/Color;", "J", "CardAspectRatioWidth", "", "CardAspectRatioHeight", "PayModeStackViewTestTag", "", "StackCardTestTag", "PayLaterCardLabelsTestTag", "BottomReserved", "Landroidx/compose/ui/unit/Dp;", "getBottomReserved", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MainStackVisibleRatio", "AnimationDurationMs", "", "DragFriction", "SnapThresholdPercentage", "PayModeStackView", "", "cards", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "selectedCardIndex", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "onSelectedCardChange", "Lkotlin/Function1;", "onExpandedChange", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PayLaterCardLabels", "card", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "taptopay_prodRelease", "scrollOffsetDp", "cardHeightDp", "isDragging"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayModeStackViewKt {
    public static final java.lang.String PayLaterCardLabelsTestTag = "pay_later_card_labels_test_tag";
    public static final java.lang.String PayModeStackViewTestTag = "pay_mode_stack_view_test_tag";
    public static final java.lang.String StackCardTestTag = "stack_card_";
    private static final long Camera2StreamConfigurationMap = androidx.compose.ui.graphics.ColorKt.Color(4281216558L);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f);

    public static final float getBottomReserved() {
        return getHighSpeedVideoSizes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayModeStackView(final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list, final int i, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(446296792);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                final androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(446296792, i4, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackView (PayModeStackView.kt:107)");
                }
                if (list.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1590756085);
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), PayModeStackViewTestTag), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$M3EPoVea5iGEeGLwc6weAML7ook(list, i, z, function1, function12, modifier4, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(-1590603286);
                startRestartGroup.endReplaceGroup();
                final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue4;
                androidx.compose.runtime.MutableState mutableState4 = mutableState2;
                boolean changed = startRestartGroup.changed(((androidx.compose.ui.unit.Dp) mutableState4.getValue()).m8615unboximpl());
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(((androidx.compose.ui.unit.Dp) mutableState4.getValue()).m8615unboximpl() * 0.38f));
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final float m8615unboximpl = ((androidx.compose.ui.unit.Dp) rememberedValue5).m8615unboximpl();
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(514947394, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$yp5DUufbwly5f1CgYyZ44s5HAV0(list, m8615unboximpl, mutableState2, z, coroutineScope, density, mutableState3, mutableState, i, function1, function12, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer2, 54), composer2, 3072, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.m20112$r8$lambda$9TBRjW8Zej21nfKFxdVTono6pY(list, i, z, function1, function12, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData extras;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1828208628);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(payPalDigitizedCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1828208628, i3, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayLaterCardLabels (PayModeStackView.kt:350)");
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = payPalDigitizedCard.getCardInfo();
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo payLaterCardInfo = cardInfo instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo ? (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo) cardInfo : null;
                if (payLaterCardInfo == null || (extras = payLaterCardInfo.getExtras()) == null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScope = startRestartGroup.endRestartGroup();
                    if (scopeUpdateScope != null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$PfegPXklFO7GF2AbQOYaGNGa2qg(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard.this, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                boolean changed = startRestartGroup.changed(extras.getSpendingLimit());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils payLaterUtils = com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.INSTANCE;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit spendingLimit = extras.getSpendingLimit();
                    java.lang.String value = spendingLimit != null ? spendingLimit.getValue() : null;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit spendingLimit2 = extras.getSpendingLimit();
                    rememberedValue = payLaterUtils.formatLoanAmount(value, spendingLimit2 != null ? spendingLimit2.getCurrencyCode() : null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.lang.String str2 = (java.lang.String) rememberedValue;
                java.lang.String createTime = extras.getCreateTime();
                java.lang.String validityDuration = extras.getValidityDuration();
                boolean changed2 = startRestartGroup.changed(createTime);
                boolean changed3 = startRestartGroup.changed(validityDuration);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.getValidityResult$default(com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.INSTANCE, extras.getCreateTime(), extras.getValidityDuration(), 0L, 4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult validityResult = (com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult) rememberedValue2;
                if (validityResult instanceof com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours) {
                    startRestartGroup.startReplaceGroup(266890774);
                    str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_pay_later_card_expiry_time_hours, new java.lang.Object[]{java.lang.Integer.valueOf(((com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Hours) validityResult).getValue())}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (validityResult instanceof com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes) {
                    startRestartGroup.startReplaceGroup(266896632);
                    str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_pay_later_card_expiry_time_minutes, new java.lang.Object[]{java.lang.Integer.valueOf(((com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterUtils.ValidityResult.Minutes) validityResult).getValue())}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (validityResult != null) {
                        startRestartGroup.startReplaceGroup(266888724);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-315994167);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                }
                boolean changed4 = startRestartGroup.changed(payPalDigitizedCard.getDigitizedCard().getLast4());
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = "•• ".concat(java.lang.String.valueOf(payPalDigitizedCard.getDigitizedCard().getLast4()));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                java.lang.String str3 = (java.lang.String) rememberedValue3;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                if (str2 != null) {
                    startRestartGroup.startReplaceGroup(-1518975164);
                    modifier3 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-1518823016);
                    startRestartGroup.endReplaceGroup();
                }
                if (str != null) {
                    startRestartGroup.startReplaceGroup(-1518768890);
                    java.lang.String str4 = str;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1518557160);
                    composer2.endReplaceGroup();
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer2, 384, 6, 1016);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScope = composer2.endRestartGroup();
            if (scopeUpdateScope == null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.m20114$r8$lambda$byvOsggGG66_WcQnSCPFK3N2QQ(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                scopeUpdateScope.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        scopeUpdateScope = composer2.endRestartGroup();
        if (scopeUpdateScope == null) {
        }
    }

    /* renamed from: $r8$lambda$9TBRjW8Zej21nfKFxdV-Tono6pY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20112$r8$lambda$9TBRjW8Zej21nfKFxdVTono6pY(java.util.List list, int i, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PayModeStackView(list, i, z, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KR4OaMTq27d-YmKuVw2-4y83H18, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.unit.IntOffset m20113$r8$lambda$KR4OaMTq27dYmKuVw24y83H18(androidx.compose.animation.core.Animatable animatable, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((int) ((java.lang.Number) animatable.getValue()).floatValue()) & 4294967295L));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M3EPoVea5iGEeGLwc6weAML7ook(java.util.List list, int i, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PayModeStackView(list, i, z, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ob08NeTpVQwYJTRvXAgCzlD3xSI(boolean z, int i, int i2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        if (!z && i == i2) {
            return kotlin.Unit.INSTANCE;
        }
        function1.invoke(java.lang.Integer.valueOf(i));
        function12.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PfegPXklFO7GF2AbQOYaGNGa2qg(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(payPalDigitizedCard, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UyqLrKzkVuAwVVsDW87rec1MyLc(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState, float f, float f2) {
        mutableState.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(density.mo1415toDpu2uoSUM((int) f)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b-yvOsggGG66_WcQnSCPFK3N2QQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20114$r8$lambda$byvOsggGG66_WcQnSCPFK3N2QQ(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(payPalDigitizedCard, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$rFeE4NvMxW5Z5tHmPg8vrpGz_s4(androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(((androidx.compose.ui.unit.Dp) mutableState.getValue()).m8615unboximpl(), com.paypal.pds.core.ConstantsKt.getSpacing0())) {
            mutableState.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(density.mo1415toDpu2uoSUM((int) (layoutCoordinates.mo7361getSizeYbymL2g() & 4294967295L))));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$yp5DUufbwly5f1CgYyZ44s5HAV0(java.util.List list, float f, final androidx.compose.runtime.MutableState mutableState, final boolean z, kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, final int i, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i2) {
        float f2;
        float f3;
        float f4;
        androidx.compose.ui.Modifier modifier;
        float f5;
        androidx.compose.runtime.Composer composer2;
        java.lang.Object[] objArr;
        float f6;
        float f7;
        int i3;
        float f8;
        float m20110computeCollapsedY4j6BHR0;
        androidx.compose.ui.unit.Density density2;
        java.lang.Object obj;
        com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1 payModeStackViewKt$PayModeStackView$2$1$2$1$1$1;
        java.lang.String sourceUrl;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
        int i4 = (i2 & 6) == 0 ? i2 | (composer.changed(boxWithConstraintsScope) ? 4 : 2) : i2;
        if (composer.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(514947394, i4, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackView.<anonymous> (PayModeStackView.kt:131)");
            }
            float mo1623getMaxHeightD9Ej5fM = boxWithConstraintsScope.mo1623getMaxHeightD9Ej5fM();
            float spacing0 = com.paypal.pds.core.ConstantsKt.getSpacing0();
            float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.8f * mo1623getMaxHeightD9Ej5fM);
            float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1623getMaxHeightD9Ej5fM - m8601constructorimpl);
            androidx.compose.runtime.MutableState mutableState4 = mutableState;
            float spacing02 = androidx.compose.ui.unit.Dp.m8606equalsimpl0(((androidx.compose.ui.unit.Dp) mutableState4.getValue()).m8615unboximpl(), com.paypal.pds.core.ConstantsKt.getSpacing0()) ? com.paypal.pds.core.ConstantsKt.getSpacing0() : androidx.compose.ui.unit.Dp.m8601constructorimpl(m8601constructorimpl - ((androidx.compose.ui.unit.Dp) mutableState4.getValue()).m8615unboximpl());
            int size = list.size();
            boolean changed = composer.changed(f);
            boolean changed2 = composer.changed(size);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, com.paypal.pds.core.ConstantsKt.getSpacing0()) || list.isEmpty()) ? kotlin.ranges.RangesKt.rangeTo(androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0())) : kotlin.ranges.RangesKt.rangeTo(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(-androidx.compose.ui.unit.Dp.m8601constructorimpl((list.size() - 1) * f))), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()));
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.ranges.ClosedRange closedRange = (kotlin.ranges.ClosedRange) rememberedValue;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), PayModeStackViewTestTag);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            java.lang.Object[] objArr2 = {java.lang.Boolean.valueOf(z), androidx.compose.ui.unit.Dp.m8599boximpl(f), java.lang.Integer.valueOf(list.size()), closedRange};
            boolean changed3 = composer.changed(z);
            boolean changedInstance = composer.changedInstance(coroutineScope);
            boolean changed4 = composer.changed(f);
            boolean changedInstance2 = composer.changedInstance(list);
            boolean changed5 = composer.changed(spacing02);
            boolean changed6 = composer.changed(mo1623getMaxHeightD9Ej5fM);
            boolean changed7 = composer.changed(m8601constructorimpl);
            boolean changed8 = composer.changed(m8601constructorimpl2);
            boolean changed9 = composer.changed(closedRange);
            boolean changed10 = composer.changed(density);
            com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1 rememberedValue2 = composer.rememberedValue();
            if ((((changed3 | changedInstance | changed4 | changedInstance2 | changed5 | changed6 | changed7 | changed8) || changed9) || changed10) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                f2 = m8601constructorimpl2;
                f3 = m8601constructorimpl;
                f4 = mo1623getMaxHeightD9Ej5fM;
                modifier = fillMaxSize$default;
                f5 = spacing02;
                composer2 = composer;
                objArr = objArr2;
                f6 = spacing0;
                rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1(z, coroutineScope, mutableState2, f, list, spacing02, f4, f3, f2, closedRange, density, mutableState3, mutableState);
                composer2.updateRememberedValue(rememberedValue2);
            } else {
                f2 = m8601constructorimpl2;
                f3 = m8601constructorimpl;
                modifier = fillMaxSize$default;
                f4 = mo1623getMaxHeightD9Ej5fM;
                f5 = spacing02;
                composer2 = composer;
                objArr = objArr2;
                f6 = spacing0;
            }
            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, objArr, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, pointerInput);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-960182078);
            androidx.compose.runtime.Composer composer3 = composer2;
            int i5 = 0;
            for (java.lang.Object obj2 : list) {
                if (i5 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) obj2;
                if (z) {
                    m20110computeCollapsedY4j6BHR0 = com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.CardStackCalculationsKt.m20111computeExpandedYa145CXI(i5, f5, f, ((androidx.compose.ui.unit.Dp) mutableState3.getValue()).m8615unboximpl(), ((androidx.compose.ui.unit.Dp) mutableState4.getValue()).m8615unboximpl(), f4, f3, f2);
                    f7 = f4;
                    density2 = density;
                    i3 = i;
                    f8 = f6;
                } else {
                    f7 = f4;
                    i3 = i;
                    f8 = f6;
                    m20110computeCollapsedY4j6BHR0 = com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.CardStackCalculationsKt.m20110computeCollapsedY4j6BHR0(i5, i3, f7, f8);
                    density2 = density;
                }
                float mo1412roundToPx0680j_4 = density2.mo1412roundToPx0680j_4(m20110computeCollapsedY4j6BHR0);
                boolean changed11 = composer3.changed(i5);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changed11 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.animation.core.AnimatableKt.Animatable(mo1412roundToPx0680j_4, 0.5f);
                    composer3.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
                androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(m20110computeCollapsedY4j6BHR0);
                boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                boolean changedInstance3 = composer3.changedInstance(animatable);
                boolean changed12 = composer3.changed(mo1412roundToPx0680j_4);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if ((changedInstance3 || changed12) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    payModeStackViewKt$PayModeStackView$2$1$2$1$1$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1(animatable, mo1412roundToPx0680j_4, mutableState2, null);
                    composer3.updateRememberedValue(payModeStackViewKt$PayModeStackView$2$1$2$1$1$1);
                } else {
                    payModeStackViewKt$PayModeStackView$2$1$2$1$1$1 = rememberedValue4;
                    obj = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(m8599boximpl, java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2) payModeStackViewKt$PayModeStackView$2$1$2$1$1$1, composer3, 0);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, obj);
                boolean changedInstance4 = composer3.changedInstance(animatable);
                java.lang.Object rememberedValue5 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.m20113$r8$lambda$KR4OaMTq27dYmKuVw24y83H18(androidx.compose.animation.core.Animatable.this, (androidx.compose.ui.unit.Density) obj3);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.ZIndexModifierKt.zIndex(androidx.compose.foundation.layout.OffsetKt.offset(m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function1) rememberedValue5), list.size() - i5), StackCardTestTag.concat(java.lang.String.valueOf(i5)));
                boolean changed13 = composer3.changed(z);
                boolean changed14 = composer3.changed(i5);
                boolean changed15 = composer3.changed(i3);
                boolean changed16 = composer3.changed(function1);
                float f9 = f7;
                boolean changed17 = composer3.changed(function12);
                java.lang.Object rememberedValue6 = composer.rememberedValue();
                if ((changed13 | changed14 | changed15 | changed16 | changed17) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final int i6 = i5;
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$Ob08NeTpVQwYJTRvXAgCzlD3xSI(z, i6, i, function1, function12);
                        }
                    };
                    composer3.updateRememberedValue(function0);
                    rememberedValue6 = function0;
                }
                float f10 = f8;
                androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(testTag2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, composer, 0, 31);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, m22100clickable_mRqjOc);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = payPalDigitizedCard.getCardInfo();
                boolean z2 = (cardInfo != null ? cardInfo.getType() : null) == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = payPalDigitizedCard.getCardArtCollection();
                if (cardArtCollection == null || (stackView = cardArtCollection.getStackView()) == null || (sourceUrl = stackView.getSourceUrl()) == null) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2 = payPalDigitizedCard.getCardArtCollection();
                    sourceUrl = (cardArtCollection2 == null || (primary = cardArtCollection2.getPrimary()) == null) ? null : primary.getSourceUrl();
                }
                androidx.compose.ui.Modifier aspectRatio$default = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.5857725f, false, 2, null);
                boolean changed18 = composer3.changed(density);
                java.lang.Object rememberedValue7 = composer.rememberedValue();
                if (changed18 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$rFeE4NvMxW5Z5tHmPg8vrpGz_s4(androidx.compose.ui.unit.Density.this, mutableState, (androidx.compose.ui.layout.LayoutCoordinates) obj3);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(aspectRatio$default, (kotlin.jvm.functions.Function1) rememberedValue7);
                if (sourceUrl != null) {
                    composer3.startReplaceGroup(-1937244479);
                    androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_car_fallback_placeholder, composer3, 0);
                    com.paypal.pds.components.PaymentCardKt.PaymentCard(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(sourceUrl, painterResource, painterResource, null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds(), composer, (androidx.compose.ui.graphics.painter.Painter.$stable << 3) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (androidx.compose.ui.graphics.painter.Painter.$stable << 6), 24), "", onGloballyPositioned, com.paypal.pds.components.PaymentCardMode.Display, com.paypal.pds.components.PaymentCardCornerRadius.Radius12, composer, 27696, 0);
                    composer.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    composer3.startReplaceGroup(-1936421119);
                    com.paypal.pds.components.PaymentCardKt.PaymentCard(new androidx.compose.ui.graphics.painter.ColorPainter(Camera2StreamConfigurationMap, null), "", onGloballyPositioned, com.paypal.pds.components.PaymentCardMode.Display, com.paypal.pds.components.PaymentCardCornerRadius.Radius12, composer, androidx.compose.ui.graphics.painter.ColorPainter.$stable | 27696, 0);
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = payPalDigitizedCard.getCardInfo();
                    java.lang.String description = cardInfo2 != null ? cardInfo2.getDescription() : null;
                    if (description == null) {
                        composer3.startReplaceGroup(-1935977944);
                        composer.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1935977943);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(description, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance3.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 12, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 384, 6, 1016);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        composer.endReplaceGroup();
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    composer.endReplaceGroup();
                }
                if (z2) {
                    composer3.startReplaceGroup(-1935392446);
                    getHighResolutionOutputSizeshNQ4ISI(payPalDigitizedCard, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance3.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomStart()), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 6, null), PayLaterCardLabelsTestTag.concat(java.lang.String.valueOf(i5))), composer3, 0, 0);
                    composer.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-1934927043);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("•• ".concat(java.lang.String.valueOf(payPalDigitizedCard.getDigitizedCard().getLast4())), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance3.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomStart()), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 6, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 384, 6, 1016);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                i5++;
                f6 = f10;
                f4 = f9;
            }
            composer.endReplaceGroup();
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.Object access$PayModeStackView$lambda$11$snapToNearestCard(boolean z, float f, java.util.List list, float f2, float f3, float f4, float f5, kotlin.ranges.ClosedRange closedRange, final androidx.compose.ui.unit.Density density, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, kotlin.coroutines.Continuation continuation) {
        if (!z || androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, com.paypal.pds.core.ConstantsKt.getSpacing0())) {
            return kotlin.Unit.INSTANCE;
        }
        if (com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.CardStackCalculationsKt.m20109calculateCardStackSnapGBMyqPk(list.size(), ((androidx.compose.ui.unit.Dp) mutableState.getValue()).m8615unboximpl(), f, ((androidx.compose.ui.unit.Dp) mutableState2.getValue()).m8615unboximpl(), f2, f3, f4, f5, closedRange).m20118getTargetScrollOffsetlTKBWiU() == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animate$default = androidx.compose.animation.core.SuspendAnimationKt.animate$default(density.mo1412roundToPx0680j_4(((androidx.compose.ui.unit.Dp) r2.getValue()).m8615unboximpl()), density.mo1412roundToPx0680j_4(r3.m8615unboximpl()), 0.0f, androidx.compose.animation.core.AnimationSpecKt.tween$default(350, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt.$r8$lambda$UyqLrKzkVuAwVVsDW87rec1MyLc(androidx.compose.ui.unit.Density.this, mutableState, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        }, continuation, 4, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }
}
