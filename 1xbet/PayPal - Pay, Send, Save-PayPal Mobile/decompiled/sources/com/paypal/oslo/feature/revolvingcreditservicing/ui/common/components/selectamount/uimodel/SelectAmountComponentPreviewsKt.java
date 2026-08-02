package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/selectamount/uimodel/SelectAmountOptionUiModel;", "getHighSpeedVideoSizes", "()Ljava/util/Map;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/selectamount/uimodel/SelectAmountUiModel;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/selectamount/uimodel/SelectAmountUiModel;Landroidx/compose/runtime/Composer;I)V", "p2", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectAmountComponentPreviewsKt {
    private static final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel> getHighSpeedVideoSizes() {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1322991513, 0, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.autopayOptions (SelectAmountComponentPreviews.kt:37)");
        }
        java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_minimum_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_statement_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_set_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mapOf;
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2083780247);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(selectAmountUiModel) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            selectAmountUiModel2 = selectAmountUiModel;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2083780247, i4, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PreviewContainer (SelectAmountComponentPreviews.kt:53)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), str, null, null, startRestartGroup, (i4 << 3) & 112, 12);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$oPxQrvwEIKFlbcOrfpYCf6bnrCk((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) obj, (java.math.BigDecimal) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.m18406$r8$lambda$DJPuVT3Xeo7V44QXOp6vGiYLwc((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            composer2 = startRestartGroup;
            i3 = i;
            selectAmountUiModel2 = selectAmountUiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.SelectAmountComponentKt.SelectAmountComponent(selectAmountUiModel, function2, function1, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, ((i4 >> 3) & 14) | 25008, 8);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$P1C3jkKKf99HRU97XzdtpCNBuok(str, selectAmountUiModel2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel> Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1479473431, 438, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.paymentOptions (SelectAmountComponentPreviews.kt:125)");
        }
        java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_minimum_payment_due, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, str, null, null, false, 58, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_description_statement_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, str2, null, null, true, 26, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_current_balance, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, str3, null, null, false, 58, null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_set_custom_amount, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, false, 62, null)));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mapOf;
    }

    /* renamed from: $r8$lambda$-DJPuVT3Xeo7V44QXOp6vGiYLwc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18406$r8$lambda$DJPuVT3Xeo7V44QXOp6vGiYLwc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6tkTsoK_lDO5sh2NsY2fSE4cggY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(294011207);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(294011207, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PaymentStatementBalancePreview (SelectAmountComponentPreviews.kt:176)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(Camera2StreamConfigurationMap("$125.00", "$1,250.00", "$1,456.78"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, null, null, null, null, "$2000.00", null, "$0", "$4,000.00", null, "en_US", 1212, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$6tkTsoK_lDO5sh2NsY2fSE4cggY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7nQt66Jdxz8rt8cODSeFkuNYf9c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-369576392);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-369576392, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PaymentMinimumPreview (SelectAmountComponentPreviews.kt:153)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(Camera2StreamConfigurationMap("$66.18", "$435.10", "$728.25"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, null, null, null, null, "$2000.00", null, "$0", "$5,000.00", null, "en_US", 1212, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$7nQt66Jdxz8rt8cODSeFkuNYf9c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9XZl_Uwde8Wrk2BFAqEBEiBY-UY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18408$r8$lambda$9XZl_Uwde8Wrk2BFAqEBEiBYUY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1979474285);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1979474285, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.AutopayGeneralErrorPreview (SelectAmountComponentPreviews.kt:301)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(getHighSpeedVideoSizes(), null, null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Error message"), "$2000.00", null, "$0", null, null, "en_US", 1692, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.m18408$r8$lambda$9XZl_Uwde8Wrk2BFAqEBEiBYUY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H7NIEiCNlXJm7RzJqlzH3Py2-BM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18409$r8$lambda$H7NIEiCNlXJm7RzJqlzH3Py2BM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1526339765);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1526339765, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PaymentCustomPreview (SelectAmountComponentPreviews.kt:199)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(Camera2StreamConfigurationMap("$35.00", "$890.50", "$1,015.75"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null, "50000", null, null, "$2000.00", null, "$0", "$6,000.00", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_hint, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "en_US", com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.m18409$r8$lambda$H7NIEiCNlXJm7RzJqlzH3Py2BM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P1C3jkKKf99HRU97XzdtpCNBuok(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel selectAmountUiModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, selectAmountUiModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a7fjvHUWo1bBAocx0uEIleL-XuQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18410$r8$lambda$a7fjvHUWo1bBAocx0uEIleLXuQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1146365262);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1146365262, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.AutopayCustomErrorPreview (SelectAmountComponentPreviews.kt:274)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(getHighSpeedVideoSizes(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null, "999999999900", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_exceeds_credit, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, "$2000.00", null, "$0", null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_hint, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "en_US", 676, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.m18410$r8$lambda$a7fjvHUWo1bBAocx0uEIleLXuQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iMQFx7zVJdsnykm9eHi1fchjmvo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1994460395);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1994460395, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PaymentCustomErrorMinPreview (SelectAmountComponentPreviews.kt:250)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_make_a_payment, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(Camera2StreamConfigurationMap("$100.00", "$675.00", "$850.99"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null, "000", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_enter_amount_greater_than_zero), null, "$2000.00", null, "$0", null, null, "en_US", 1700, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$iMQFx7zVJdsnykm9eHi1fchjmvo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oPxQrvwEIKFlbcOrfpYCf6bnrCk(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vXkFm34y_yfzb6l_5P3Fi5lvVVQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-958967035);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-958967035, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.AutopayMinimumPreview (SelectAmountComponentPreviews.kt:81)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(getHighSpeedVideoSizes(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, null, null, null, null, "$2000.00", null, "$0", null, null, "en_US", 1724, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$vXkFm34y_yfzb6l_5P3Fi5lvVVQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xeR8I9SpULIZsCkZ3Nh6hlUNVUc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1129710370);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1129710370, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.AutopayCustomPreview (SelectAmountComponentPreviews.kt:103)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_title, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(getHighSpeedVideoSizes(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null, "2500", null, null, "$2000.00", null, "$0", null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_hint, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), "en_US", 692, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$xeR8I9SpULIZsCkZ3Nh6hlUNVUc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yAtHk1ml4vrrl8ZWicIs1nnfvHA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(129823143);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(129823143, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.PaymentCustomErrorMaxPreview (SelectAmountComponentPreviews.kt:224)");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment, startRestartGroup, 0), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel(Camera2StreamConfigurationMap("$50.00", "$2,345.67", "$2,890.12"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null, "20000000", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_custom_amount_error_exceeds_credit, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, "$2000.00", null, "$0", null, null, "en_US", 1700, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountComponentPreviewsKt.$r8$lambda$yAtHk1ml4vrrl8ZWicIs1nnfvHA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
