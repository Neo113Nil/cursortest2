package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u001aY\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"PaymentMethodSelection", "", "availablePaymentMethods", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;", "selectedPaymentMethod", "onPaymentMethodSelect", "Lkotlin/Function1;", "onAddPaymentMethodClick", "Lkotlin/Function0;", "isLoading", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShimmerPlaceholderCount", "", "PaymentMethodShimmerPlaceholder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewPayPalBalanceLabel", "", "PreviewAvailableBalanceText", "PreviewAvailableBalanceFormatted", "PreviewDebitDetailsText", "PreviewBankAccountLabel", "PreviewBankAccountDetailsText", "PaymentMethodSelectionFirstSelectedPreview", "(Landroidx/compose/runtime/Composer;I)V", "PaymentMethodSelectionMiddleSelectedPreview", "PaymentMethodSelectionNoSelectionPreview", "PaymentMethodSelectionSingleMethodPreview", "PaymentMethodSelectionManyMethodsPreview", "PaymentMethodSelectionLoadingPreview", "PaymentMethodSelectionEmptyListPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentMethodSelectionKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodSelection(final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod> list, final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1673006338);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(paymentMethod) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1673006338, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelection (PaymentMethodSelection.kt:67)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                if (z) {
                    startRestartGroup.startReplaceGroup(-606563529);
                    Camera2StreamConfigurationMap(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "payment_method_shimmer"), startRestartGroup, 6, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-606317389);
                    startRestartGroup.startReplaceGroup(534632222);
                    int i5 = 0;
                    for (java.lang.Object obj : list) {
                        if (i5 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod2 = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj;
                        java.lang.String displayName = paymentMethod2.getDisplayName();
                        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(paymentMethod2.getId(), paymentMethod != null ? paymentMethod.getId() : null);
                        boolean z2 = (i3 & 896) == 256;
                        boolean changed = startRestartGroup.changed(paymentMethod2);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13781$r8$lambda$p9kGSX3Y00tBCHvVfoDhcaUn1E(kotlin.jvm.functions.Function1.this, paymentMethod2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.cryptocurrency.ui.common.components.payment.PaymentMethodRadioItemKt.PaymentMethodRadioItem(displayName, areEqual, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "payment_method_item_".concat(java.lang.String.valueOf(i5))), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), paymentMethod2.getDetails(), null, paymentMethod2.getIconUrl(), startRestartGroup, 0, 32);
                        i5++;
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), startRestartGroup, 0);
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "add_payment_method_cta"), 0.0f, 1, null), null, null, false, null, null, function0, startRestartGroup, ((i3 << 9) & 3670016) | 6, 31), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1708paddingVpY3zN4$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Plus.INSTANCE, null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27702, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_review_add_payment, composer2, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 384, 6, 1018);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$CxgxJiqOzPivyZpACB6nJdXD0aM(list, paymentMethod, function1, function0, z, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2098913106);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2098913106, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodShimmerPlaceholder (PaymentMethodSelection.kt:129)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            startRestartGroup.startReplaceGroup(815195274);
            for (int i5 = 0; i5 < 2; i5++) {
                com.paypal.pds.components.ShimmerKt.Shimmer((com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing56()), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.ComposableSingletons$PaymentMethodSelectionKt.INSTANCE.getLambda$776607647$cryptocurrency_prodRelease(), startRestartGroup, 3126, 0);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13776$r8$lambda$BLO9jA7EWwXV3uFdYrIB6vjMxg(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$6KTCUqlKmbQDB78TvR-IH8UF9xk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13774$r8$lambda$6KTCUqlKmbQDB78TvRIH8UF9xk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-496484682);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-496484682, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionFirstSelectedPreview (PaymentMethodSelection.kt:157)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("paypal_balance", "abc123", "PayPal Balance", "$279.41 available", null, "$279.41", 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("chase_debit", "abc123", "Chase", "Debit ••••0291", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("bank_account", "abc123", "Bank Account", "••••1234", null, null, 48, null)});
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) listOf.get(0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13780$r8$lambda$lKcsMGVicpLQAwfS13JlCtEyic((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(listOf, paymentMethod, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28032, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13774$r8$lambda$6KTCUqlKmbQDB78TvRIH8UF9xk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AQj7_UFJc2jpoZDdN9obhJv0_Rw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1372386887);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1372386887, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionLoadingPreview (PaymentMethodSelection.kt:342)");
            }
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$coGzUYR8fWoC8NVLkOht5l91SFA((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(emptyList, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, true, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$AQj7_UFJc2jpoZDdN9obhJv0_Rw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BLO9jA7EWwXV-3uFdYrIB6vjMxg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13776$r8$lambda$BLO9jA7EWwXV3uFdYrIB6vjMxg(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CxgxJiqOzPivyZpACB6nJdXD0aM(java.util.List list, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentMethodSelection(list, paymentMethod, function1, function0, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JIorporfsK5ib1MY56TFsGN36oQ(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PPgCDbDnkUn83NwPiBqgs5jXWcY(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VNUfzeVfj2oyenp74QSZfOs522Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1912287062);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1912287062, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionEmptyListPreview (PaymentMethodSelection.kt:357)");
            }
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$g79ooDFP5AUXdkpql6Xo8gFKfcc((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(emptyList, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28086, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$VNUfzeVfj2oyenp74QSZfOs522Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W29C_VKT7aNYBMFZkJUZfM7015Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2074990753);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2074990753, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionMiddleSelectedPreview (PaymentMethodSelection.kt:194)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("paypal_balance", "abc123", "PayPal Balance", "$279.41 available", null, "$279.41", 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("chase_debit", "abc123", "Chase", "Debit ••••0291", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("bank_account", "abc123", "Bank Account", "••••1234", null, null, 48, null)});
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) listOf.get(1);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$JIorporfsK5ib1MY56TFsGN36oQ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(listOf, paymentMethod, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28032, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$W29C_VKT7aNYBMFZkJUZfM7015Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XGrfg4LFc5Zct_rjf-gMVYU7LZs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13779$r8$lambda$XGrfg4LFc5Zct_rjfgMVYU7LZs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1388577110);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1388577110, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionNoSelectionPreview (PaymentMethodSelection.kt:231)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("paypal_balance", "abc123", "PayPal Balance", "$279.41 available", null, "$279.41", 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("chase_debit", "abc123", "Chase", "Debit ••••0291", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("bank_account", "abc123", "Bank Account", "••••1234", null, null, 48, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13782$r8$lambda$uXnFhQW9zJAKlHy7Kj2vOg2zrE((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(listOf, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28080, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.m13779$r8$lambda$XGrfg4LFc5Zct_rjfgMVYU7LZs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XL1MAJCkmDSFHz9oOfWyvkUWJwk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-246590630);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-246590630, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionSingleMethodPreview (PaymentMethodSelection.kt:268)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("paypal_balance", "abc123", "PayPal Balance", "$500.00 available", null, "$500.00", 16, null));
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) listOf.get(0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$yYd0UewxizLbhZ64cJdPGkVgEsI((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(listOf, paymentMethod, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28032, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$XL1MAJCkmDSFHz9oOfWyvkUWJwk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XWrkNAVOkXLmfqILam_jcbqTpQE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(119728350);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(119728350, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionManyMethodsPreview (PaymentMethodSelection.kt:293)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod[]{new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("paypal_balance", "abc123", "PayPal Balance", "$1,250.00 available", null, "$1,250.00", 16, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("chase_debit", "abc123", "Chase", "Debit ••••0291", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("bofa_credit", "abc123", "Bank of America", "Credit ••••5678", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod("wells_fargo", "abc123", "Wells Fargo", "Checking ••••9012", null, null, 48, null), new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX, "abc123", "American Express", "••••3456", null, null, 48, null)});
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) listOf.get(2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$PPgCDbDnkUn83NwPiBqgs5jXWcY((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PaymentMethodSelection(listOf, paymentMethod, function1, (kotlin.jvm.functions.Function0) rememberedValue2, false, null, startRestartGroup, 28032, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.buy.review.components.PaymentMethodSelectionKt.$r8$lambda$XWrkNAVOkXLmfqILam_jcbqTpQE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$coGzUYR8fWoC8NVLkOht5l91SFA(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g79ooDFP5AUXdkpql6Xo8gFKfcc(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lKcsMGVicpLQAwfS13-JlCtEyic, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13780$r8$lambda$lKcsMGVicpLQAwfS13JlCtEyic(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p-9kGSX3Y00tBCHvVfoDhcaUn1E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13781$r8$lambda$p9kGSX3Y00tBCHvVfoDhcaUn1E(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        function1.invoke(paymentMethod);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uXnFhQW9zJAKlHy7-Kj2vOg2zrE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13782$r8$lambda$uXnFhQW9zJAKlHy7Kj2vOg2zrE(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yYd0UewxizLbhZ64cJdPGkVgEsI(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        return kotlin.Unit.INSTANCE;
    }
}
