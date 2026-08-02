package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;", "fundingInstrumentViewModel", "", "FundingInstrumentCompose", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentFundingInstrument;", "fundingInstruments", "", "showPaymentDetails", "ActivityTransactionDetailFundingInstrumentCompose", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailFundingInstrumentModel;Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V", "fundingInstrument", "FundingInstrumentImageComposable", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/PaymentFundingInstrument;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/CurrencyExchangeRate;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/CurrencyExchangeRate;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailFundingInstrumentComposableMapperKt {
    public static final void FundingInstrumentCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailFundingInstrumentModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1289156557);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityDetailFundingInstrumentModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1289156557, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.FundingInstrumentCompose (ActivityDetailFundingInstrumentComposableMapper.kt:79)");
            }
            if (!activityDetailFundingInstrumentModel.getDebitFundingInstruments().isEmpty()) {
                startRestartGroup.startReplaceGroup(-334381523);
                i3 = 0;
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, true, false, com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(activityDetailFundingInstrumentModel.getDebitFundingInstrumentHeaderResId()), new java.lang.Object[0], startRestartGroup, 0), null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1732010082, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.$r8$lambda$JnSVI5g1BB3kK2MbzjcpkViW9K0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582966, 116);
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                startRestartGroup.startReplaceGroup(-333912555);
                startRestartGroup.endReplaceGroup();
            }
            if (!activityDetailFundingInstrumentModel.getCreditFundingInstruments().isEmpty()) {
                startRestartGroup.startReplaceGroup(-333818873);
                final boolean isEmpty = activityDetailFundingInstrumentModel.getDebitFundingInstruments().isEmpty();
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(true, true, false, com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(activityDetailFundingInstrumentModel.getCreditFundingInstrumentHeaderResId()), new java.lang.Object[i3], startRestartGroup, i3), null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1806317177, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.m11830$r8$lambda$rW3jTOy2b8pVThb2ugVZgChqqs(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel.this, isEmpty, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582966, 116);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-333221131);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.m11829$r8$lambda$esGR8HyheTSmSBlz3P0j5hEffY(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ActivityTransactionDetailFundingInstrumentCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument> list, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        int i2;
        java.lang.String titleDisplayText;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        boolean z2;
        boolean z3;
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow> paymentDetailsInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailFundingInstrumentModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(591606533);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailFundingInstrumentModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        boolean z4 = true;
        boolean z5 = false;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(591606533, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailFundingInstrumentCompose (ActivityDetailFundingInstrumentComposableMapper.kt:119)");
            }
            java.lang.Object obj2 = null;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
            int size = list.size();
            startRestartGroup.startReplaceGroup(1759162132);
            int i4 = 0;
            for (java.lang.Object obj3 : list) {
                if (i4 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument) obj3;
                float spacing4 = i4 == 0 ? com.paypal.pds.core.ConstantsKt.getSpacing4() : com.paypal.pds.core.ConstantsKt.getSpacing8();
                boolean z6 = (i4 != size + (-1) || (z && !(((paymentDetailsInfo = activityDetailFundingInstrumentModel.getPaymentDetailsInfo()) == null || paymentDetailsInfo.isEmpty()) && activityDetailFundingInstrumentModel.getCurrencyExchange() == null))) ? z5 : z4;
                float spacing0 = z6 ? com.paypal.pds.core.ConstantsKt.getSpacing0() : com.paypal.pds.core.ConstantsKt.getSpacing8();
                java.lang.String instrumentName = paymentFundingInstrument.getInstrumentName();
                java.lang.String instrumentDescription = paymentFundingInstrument.getInstrumentDescription();
                java.lang.String instrumentAmount = paymentFundingInstrument.getInstrumentAmount();
                if (paymentFundingInstrument.getBackupDisplayTextRestId() != null) {
                    startRestartGroup.startReplaceGroup(1211059166);
                    androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-498360039, z4, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.m11831$r8$lambda$zcFeYogNTvsIdWMmCWjkJZCYI(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument.this, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = rememberComposableLambda;
                } else {
                    startRestartGroup.startReplaceGroup(1211448960);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = null;
                }
                int i5 = i4;
                androidx.compose.runtime.Composer composer3 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(instrumentName, null, instrumentDescription, instrumentAmount, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(69718315, z4, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.$r8$lambda$VRzNiYuQZOdcN8VPpOKJ0SSTmbo(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument.this, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                }, startRestartGroup, 54), null, composableLambda, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(spacing4), androidx.compose.ui.unit.Dp.m8599boximpl(spacing0), null, null, false, composer3, 100663296, 0, 473842);
                if (!z6) {
                    startRestartGroup = composer3;
                    startRestartGroup.startReplaceGroup(1211542115);
                    z2 = false;
                    z3 = true;
                    obj = null;
                    com.paypal.pds.components.DividerKt.Divider(null, startRestartGroup, 0, 1);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup = composer3;
                    z2 = false;
                    z3 = true;
                    obj = null;
                    startRestartGroup.startReplaceGroup(1211581516);
                    startRestartGroup.endReplaceGroup();
                }
                z4 = z3;
                i4 = i5 + 1;
                obj2 = obj;
                z5 = z2;
            }
            boolean z7 = z4;
            boolean z8 = z5;
            java.lang.Object obj4 = obj2;
            startRestartGroup.endReplaceGroup();
            if (z) {
                startRestartGroup.startReplaceGroup(-1299225798);
                java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow> paymentDetailsInfo2 = activityDetailFundingInstrumentModel.getPaymentDetailsInfo();
                if (paymentDetailsInfo2 != null && !paymentDetailsInfo2.isEmpty()) {
                    startRestartGroup.startReplaceGroup(-1299150034);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, z7 ? 1 : 0, obj4);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, z8 ? 1 : 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z8 ? 1 : 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                    androidx.compose.runtime.Composer composer4 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_details_label, startRestartGroup, z8 ? 1 : 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer4, 0, 6, 1020);
                    androidx.compose.runtime.Composer composer5 = composer4;
                    composer5.startReplaceGroup(-184221930);
                    for (final com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow : activityDetailFundingInstrumentModel.getPaymentDetailsInfo()) {
                        if (paymentDetailRow.getTitleResId() != null) {
                            composer5.startReplaceGroup(1322201012);
                            titleDisplayText = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(paymentDetailRow.getTitleResId(), new java.lang.Object[0], composer5, 0);
                            composer5.endReplaceGroup();
                        } else {
                            composer5.startReplaceGroup(1322378115);
                            composer5.endReplaceGroup();
                            titleDisplayText = paymentDetailRow.getTitleDisplayText();
                        }
                        androidx.compose.runtime.Composer composer6 = composer5;
                        com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(titleDisplayText, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1887435435, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.$r8$lambda$wxcopoNvVqkq1nL7RmYnrbf9pgM(com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow.this, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                            }
                        }, composer5, 54), null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, false, composer6, 12582912, 0, 475006);
                        composer5 = composer6;
                    }
                    androidx.compose.runtime.Composer composer7 = composer5;
                    composer7.endReplaceGroup();
                    com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate currencyExchange = activityDetailFundingInstrumentModel.getCurrencyExchange();
                    java.util.List<java.lang.String> currencyExchangeRateValues = currencyExchange != null ? currencyExchange.getCurrencyExchangeRateValues() : null;
                    if (currencyExchangeRateValues != null && !currencyExchangeRateValues.isEmpty()) {
                        composer2 = composer7;
                        composer2.startReplaceGroup(-1414855866);
                        i2 = 0;
                        com.paypal.pds.components.DividerKt.Divider(null, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = composer7;
                        i2 = 0;
                        composer2.startReplaceGroup(-1414801089);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    i2 = z8 ? 1 : 0;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1297607629);
                    composer2.endReplaceGroup();
                }
                getHighSpeedVideoFpsRanges(activityDetailFundingInstrumentModel.getCurrencyExchange(), composer2, i2);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1297510413);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.$r8$lambda$9Q0PC0OGHYCFehT3bKqdNwYsVSI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel.this, list, z, i, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                }
            });
        }
    }

    public static final void FundingInstrumentImageComposable(final com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1470378346);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(paymentFundingInstrument) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1470378346, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.FundingInstrumentImageComposable (ActivityDetailFundingInstrumentComposableMapper.kt:188)");
            }
            if (paymentFundingInstrument.getInstrumentImageUrl().length() > 0) {
                startRestartGroup.startReplaceGroup(-329991433);
                com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(paymentFundingInstrument.getInstrumentImageUrl(), null, null, null, null, startRestartGroup, 0, 30), "image", androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48(), com.paypal.pds.core.ConstantsKt.getSpacing32()), androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds(), com.paypal.pds.components.ImageCornerRadius.Radius4, com.paypal.pds.components.ImageAspectRatio.Landscape3x2, null, startRestartGroup, 224304, 64);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-329590696);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.$r8$lambda$s_i7A064vmUMdZx9cAKWx6MALNY(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate currencyExchangeRate, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-747042799);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(currencyExchangeRate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-747042799, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.CurrencyExchangeRateComposable (ActivityDetailFundingInstrumentComposableMapper.kt:203)");
            }
            java.util.List<java.lang.String> currencyExchangeRateValues = currencyExchangeRate != null ? currencyExchangeRate.getCurrencyExchangeRateValues() : null;
            if (currencyExchangeRateValues != null && !currencyExchangeRateValues.isEmpty()) {
                startRestartGroup.startReplaceGroup(1368688741);
                androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), null, false, 3, null), null, false, 3, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(java.lang.Integer.valueOf(currencyExchangeRate.getTitleDisplayTextResId()), new java.lang.Object[0], startRestartGroup, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 0, 6, 1006);
                androidx.compose.ui.Alignment.Horizontal end = androidx.compose.ui.Alignment.INSTANCE.getEnd();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), end, composer2, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1548332444);
                java.util.Iterator<T> it = currencyExchangeRate.getCurrencyExchangeRateValues().iterator();
                while (it.hasNext()) {
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4((java.lang.String) it.next(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1000);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1369622833);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailFundingInstrumentComposableMapperKt.m11828$r8$lambda$YamyyfmnRKTBFINxJB_ZYf3TEg(com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9Q0PC0OGHYCFehT3bKqdNwYsVSI(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, java.util.List list, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityTransactionDetailFundingInstrumentCompose(activityDetailFundingInstrumentModel, list, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JnSVI5g1BB3kK2MbzjcpkViW9K0(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1732010082, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.FundingInstrumentCompose.<anonymous> (ActivityDetailFundingInstrumentComposableMapper.kt:86)");
            }
            ActivityTransactionDetailFundingInstrumentCompose(activityDetailFundingInstrumentModel, activityDetailFundingInstrumentModel.getDebitFundingInstruments(), true, composer, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VRzNiYuQZOdcN8VPpOKJ0SSTmbo(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(69718315, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailFundingInstrumentCompose.<anonymous>.<anonymous>.<anonymous> (ActivityDetailFundingInstrumentComposableMapper.kt:132)");
            }
            FundingInstrumentImageComposable(paymentFundingInstrument, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YamyyfmnRKTBF-INxJB_ZYf3TEg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11828$r8$lambda$YamyyfmnRKTBFINxJB_ZYf3TEg(com.paypal.oslo.feature.activity.domain.detail.models.CurrencyExchangeRate currencyExchangeRate, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(currencyExchangeRate, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$esGR8HyheT-SmSBlz3P0j5hEffY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11829$r8$lambda$esGR8HyheTSmSBlz3P0j5hEffY(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        FundingInstrumentCompose(activityDetailFundingInstrumentModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rW3jTOy2b-8pVThb2ugVZgChqqs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11830$r8$lambda$rW3jTOy2b8pVThb2ugVZgChqqs(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailFundingInstrumentModel activityDetailFundingInstrumentModel, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1806317177, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.FundingInstrumentCompose.<anonymous> (ActivityDetailFundingInstrumentComposableMapper.kt:101)");
            }
            ActivityTransactionDetailFundingInstrumentCompose(activityDetailFundingInstrumentModel, activityDetailFundingInstrumentModel.getCreditFundingInstruments(), z, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s_i7A064vmUMdZx9cAKWx6MALNY(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument, int i, androidx.compose.runtime.Composer composer, int i2) {
        FundingInstrumentImageComposable(paymentFundingInstrument, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wxcopoNvVqkq1nL7RmYnrbf9pgM(com.paypal.oslo.feature.activity.domain.detail.models.PaymentDetailRow paymentDetailRow, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1887435435, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailFundingInstrumentCompose.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ActivityDetailFundingInstrumentComposableMapper.kt:168)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(paymentDetailRow.getValueDisplayText(), null, null, paymentDetailRow.isAmountReversed() ? androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough() : null, null, null, false, 0, 0, null, null, composer, 0, 0, 2038);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zcFeYogNT-vsIdWMmCWjkJ-ZCYI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11831$r8$lambda$zcFeYogNTvsIdWMmCWjkJZCYI(com.paypal.oslo.feature.activity.domain.detail.models.PaymentFundingInstrument paymentFundingInstrument, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-498360039, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailFundingInstrumentCompose.<anonymous>.<anonymous>.<anonymous> (ActivityDetailFundingInstrumentComposableMapper.kt:135)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(paymentFundingInstrument.getBackupDisplayTextRestId(), new java.lang.Object[0], composer, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
