package com.paypal.oslo.feature.wallet.fifo.transfer.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"TestTagWithdrawSpeedRoot", "", "TestTagWithdrawSpeedTitle", "TestTagWithdrawSpeedSubtitle", "WithdrawSpeedRow", "", "withdrawSpeedUiModel", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "resolveSpeedTitle", "model", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "resolveSpeedSubtitle", "WithdrawSpeedRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawSpeedRowKt {
    public static final java.lang.String TestTagWithdrawSpeedRoot = "withdraw_speed_row_root";
    public static final java.lang.String TestTagWithdrawSpeedSubtitle = "withdraw_speed_row_subtitle";
    public static final java.lang.String TestTagWithdrawSpeedTitle = "withdraw_speed_row_title";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawSpeedRow(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedUIModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1741752016);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(withdrawSpeedUIModel) ? 4 : 2) | i;
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
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1741752016, i3, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRow (WithdrawSpeedRow.kt:57)");
                }
                int i5 = i3 & 14;
                java.lang.String resolveSpeedTitle = resolveSpeedTitle(withdrawSpeedUIModel, startRestartGroup, i5);
                java.lang.String resolveSpeedSubtitle = resolveSpeedSubtitle(withdrawSpeedUIModel, startRestartGroup, i5);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(resolveSpeedTitle);
                sb.append(", ");
                sb.append(resolveSpeedSubtitle);
                final java.lang.String obj = sb.toString();
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, TestTagWithdrawSpeedRoot);
                boolean changed = startRestartGroup.changed(obj);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.m21305$r8$lambda$qyQW5g5jdWFpieCt2zqNDN5VMg(obj, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (withdrawSpeedUIModel.getIcon() != null) {
                    startRestartGroup.startReplaceGroup(-1566427645);
                    com.paypal.pds.components.AvatarSource.Icon icon = new com.paypal.pds.components.AvatarSource.Icon(withdrawSpeedUIModel.getIcon());
                    com.paypal.pds.components.AvatarSize.Medium medium = com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.m21304$r8$lambda$OAwDj1swUz8RIjY6YpnLaSVoM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    str = resolveSpeedTitle;
                    com.paypal.pds.components.AvatarKt.Avatar(icon, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion2, (kotlin.jvm.functions.Function1) rememberedValue2), medium, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 56);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1566427646);
                    startRestartGroup.endReplaceGroup();
                    str = resolveSpeedTitle;
                }
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagWithdrawSpeedTitle), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, bodyMedium, startRestartGroup, 12779568, 6, 860);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(resolveSpeedSubtitle, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagWithdrawSpeedSubtitle), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 12779952, 6, 856);
                composer2.endNode();
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.$r8$lambda$n_otnq6FFd1iuU2A97PwAsXxhdg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String resolveSpeedTitle(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedUIModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-378174842, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.resolveSpeedTitle (WithdrawSpeedRow.kt:109)");
        }
        int i2 = com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.WhenMappings.$EnumSwitchMapping$0[withdrawSpeedUIModel.getSpeedType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1646201223);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_speed_in_minutes, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(1646199962);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-507257076);
            int minDays = withdrawSpeedUIModel.getMinDays();
            if (minDays == withdrawSpeedUIModel.getMaxDays() && withdrawSpeedUIModel.getMinDays() == 1) {
                composer.startReplaceGroup(1646206817);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_speed_in_day, composer, 0);
                composer.endReplaceGroup();
            } else if (minDays == withdrawSpeedUIModel.getMaxDays()) {
                composer.startReplaceGroup(1646210686);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_speed_in_days, new java.lang.Object[]{java.lang.String.valueOf(withdrawSpeedUIModel.getMinDays())}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1646214268);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_speed_in_days_range, new java.lang.Object[]{java.lang.String.valueOf(withdrawSpeedUIModel.getMinDays()), java.lang.String.valueOf(withdrawSpeedUIModel.getMaxDays())}, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String resolveSpeedSubtitle(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedUIModel, "");
        composer.startReplaceGroup(2112859348);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2112859348, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.resolveSpeedSubtitle (WithdrawSpeedRow.kt:130)");
        }
        java.lang.String feeValue = withdrawSpeedUIModel.getFeeValue();
        if (feeValue != null) {
            composer.startReplaceGroup(-1061694848);
            composer.endReplaceGroup();
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(feeValue);
            if ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) == 0.0d) {
                composer.startReplaceGroup(1447331723);
                obj = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_no_fee, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1447408231);
                com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils currencyUtils = com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils.INSTANCE;
                java.lang.String feeCurrencyCode = withdrawSpeedUIModel.getFeeCurrencyCode();
                java.lang.String currencySymbol$wallet_prodRelease = currencyUtils.getCurrencySymbol$wallet_prodRelease(feeCurrencyCode != null ? feeCurrencyCode : "");
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_fee_suffix, composer, 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(currencySymbol$wallet_prodRelease);
                sb.append(feeValue);
                sb.append(" ");
                sb.append(stringResource);
                obj = sb.toString();
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return obj;
        }
        composer.startReplaceGroup(1447215380);
        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_no_fee, composer, 0);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource2;
    }

    /* renamed from: $r8$lambda$OAwDj1swUz-8RIjY6Yp-nLaSVoM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21304$r8$lambda$OAwDj1swUz8RIjY6YpnLaSVoM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n_otnq6FFd1iuU2A97PwAsXxhdg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawSpeedRow(withdrawSpeedUIModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qyQW5g5jdWFpieCt2zqN-DN5VMg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21305$r8$lambda$qyQW5g5jdWFpieCt2zqNDN5VMg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uO24wqXT6sT8qCUcYMKMviWLkF0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(123567053);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(123567053, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowPreview (WithdrawSpeedRow.kt:142)");
            }
            WithdrawSpeedRow(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT, com.paypal.pds.core.Icon.Clock.INSTANCE, "1.50", "USD", 0, 0, 48, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.$r8$lambda$uO24wqXT6sT8qCUcYMKMviWLkF0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
