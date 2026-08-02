package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"FundingInstrumentComponent", "", "fundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "secondaryText", "", "trailingLabel", "spacingBetweenLabels", "Landroidx/compose/ui/unit/Dp;", "FundingInstrumentComponent-FJfuzF0", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;FLandroidx/compose/runtime/Composer;II)V", "CardPreview", "(Landroidx/compose/runtime/Composer;I)V", "CardWithTrailingPreview", "PayPalBalancePreview", "NormalFundingInstrumentPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentComponentKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /* renamed from: FundingInstrumentComponent-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19836FundingInstrumentComponentFJfuzF0(final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        int i5;
        java.lang.String str4;
        androidx.compose.runtime.Composer composer2;
        final float f2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str5;
        final java.lang.String str6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f3;
        androidx.compose.ui.Modifier modifier4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1066857737);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0 && startRestartGroup.changed(f)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                        i6 = 8192;
                        i3 |= i6;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            f3 = f;
                            modifier4 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                str3 = null;
                            }
                            if (i5 != 0) {
                                str4 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                modifier4 = companion;
                                f3 = com.paypal.pds.core.ConstantsKt.getSpacing0();
                            } else {
                                f3 = f;
                                modifier4 = companion;
                            }
                        }
                        java.lang.String str7 = str3;
                        java.lang.String str8 = str4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1066857737, i3, -1, "com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponent (FundingInstrumentComponent.kt:45)");
                        }
                        java.lang.String name2 = fundingInstrumentUiModel.getName();
                        java.lang.String str9 = name2 == null ? "" : name2;
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.FundingInstrumentCardArt(fundingInstrumentUiModel, null, null, startRestartGroup, i3 & 14, 6);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        float f4 = f3;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str9, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                        if (str7 == null) {
                            composer2.startReplaceGroup(-543702785);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-543702784);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f4), composer2, 0);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str7, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (str8 == null) {
                            composer2.startReplaceGroup(111323246);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(111323247);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str8, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1018);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        f2 = f4;
                        str5 = str7;
                        str6 = str8;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        f2 = f;
                        modifier3 = modifier2;
                        str5 = str3;
                        str6 = str4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19833$r8$lambda$CT6NBDXCpoWU1DWC3eqBr3ZgaE(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, modifier3, str5, str6, f2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str4 = str2;
                if ((i & 24576) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$7Cq-C_QxKJ1PDbta7nMPVp-yBJw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19832$r8$lambda$7CqC_QxKJ1PDbta7nMPVpyBJw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-465264814);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-465264814, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.CardPreview (FundingInstrumentComponent.kt:84)");
            }
            m19836FundingInstrumentComponentFJfuzF0(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-1", null, null, "88", null, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewDataKt.THUMBNAIL, 22, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), "••88 ••1192", null, 0.0f, startRestartGroup, 384, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19832$r8$lambda$7CqC_QxKJ1PDbta7nMPVpyBJw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8HruowxOUsDxZdTnTlZW0be6G50(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-899352683);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-899352683, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.PayPalBalancePreview (FundingInstrumentComponent.kt:120)");
            }
            m19836FundingInstrumentComponentFJfuzF0(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalBalance(), "preview-3", null, null, null, null, null, 62, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), "$100.00 available", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_backup, startRestartGroup, 0), 0.0f, startRestartGroup, 384, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.$r8$lambda$8HruowxOUsDxZdTnTlZW0be6G50(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CT6NBD-XCpoWU1DWC3eqBr3ZgaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19833$r8$lambda$CT6NBDXCpoWU1DWC3eqBr3ZgaE(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m19836FundingInstrumentComponentFJfuzF0(fundingInstrumentUiModel, modifier, str, str2, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JFYLAqAT6S7todCsY8a-ec-vLOQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19834$r8$lambda$JFYLAqAT6S7todCsY8aecvLOQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1884486032);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1884486032, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.CardWithTrailingPreview (FundingInstrumentComponent.kt:101)");
            }
            m19836FundingInstrumentComponentFJfuzF0(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getDebitCard(), "preview-2", null, "Chase Visa", "88", null, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewDataKt.THUMBNAIL, 18, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), "••88 ••1192", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_first, startRestartGroup, 0), 0.0f, startRestartGroup, 384, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19834$r8$lambda$JFYLAqAT6S7todCsY8aecvLOQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ST5ENsg3ljzBe-Z9ZMc1IcV5qwk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19835$r8$lambda$ST5ENsg3ljzBeZ9ZMc1IcV5qwk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-473573759);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-473573759, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.NormalFundingInstrumentPreview (FundingInstrumentComponent.kt:136)");
            }
            m19836FundingInstrumentComponentFJfuzF0(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-3", null, "This is a pretty long credit card name that should not be truncated", null, null, null, 58, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), "$100.00 available", androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_backup, startRestartGroup, 0), 0.0f, startRestartGroup, 384, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.FundingInstrumentComponentKt.m19835$r8$lambda$ST5ENsg3ljzBeZ9ZMc1IcV5qwk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
