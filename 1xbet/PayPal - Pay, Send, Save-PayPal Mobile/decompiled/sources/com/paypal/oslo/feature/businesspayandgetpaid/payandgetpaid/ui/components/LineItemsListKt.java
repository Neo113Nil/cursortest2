package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"LineItemsList", "", "items", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "onItemClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "taxSettings", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;Landroidx/compose/runtime/Composer;II)V", "LineItemRow", "item", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "business-pay-and-get-paid_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LineItemsListKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LineItemsList(final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i3;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1170154521);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    taxSettings2 = taxSettings;
                    if (startRestartGroup.changed(taxSettings2)) {
                        i4 = 2048;
                        i5 |= i4;
                    }
                } else {
                    taxSettings2 = taxSettings;
                }
                i4 = 1024;
                i5 |= i4;
            } else {
                taxSettings2 = taxSettings;
            }
            if (!startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    i3 = i5;
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 = i5 & (-7169);
                        modifier3 = companion;
                        taxSettings3 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1170154521, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsList (LineItemsList.kt:35)");
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
                        if (!startRestartGroup.getInserting()) {
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
                        int i7 = i3;
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings4 = taxSettings3;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_items, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        startRestartGroup.startReplaceGroup(-1557706419);
                        for (final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem : list) {
                            boolean z = (i7 & 112) == 32;
                            boolean changed = startRestartGroup.changed(lineItem);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt.$r8$lambda$i6pNgZlqEyo4VQGPs3234z_3TVc(kotlin.jvm.functions.Function1.this, lineItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            getHighSpeedVideoFpsRangesFor(lineItem, taxSettings4, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, (i7 >> 6) & 112);
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        taxSettings2 = taxSettings4;
                    } else {
                        i3 = i5;
                        modifier3 = companion;
                    }
                }
                taxSettings3 = taxSettings2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                int i72 = i3;
                com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings42 = taxSettings3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_items, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                startRestartGroup.startReplaceGroup(-1557706419);
                while (r6.hasNext()) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                taxSettings2 = taxSettings42;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings5 = taxSettings2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt.$r8$lambda$FjuRhy8Y1ZiSyO_mVr8E5ZDj9yw(list, function1, modifier4, taxSettings5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        java.lang.String str;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1991775453);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lineItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(taxSettings) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1991775453, i2, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemRow (LineItemsList.kt:53)");
            }
            java.math.BigDecimal quantity = lineItem.getQuantity();
            java.lang.String formatUnitPriceText = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.SharedSummaryComponentsKt.formatUnitPriceText(lineItem, startRestartGroup, i2 & 14);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(quantity);
            sb.append("x ");
            sb.append(formatUnitPriceText);
            java.lang.String obj = sb.toString();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = lineItem.getTax();
            if (tax != null) {
                startRestartGroup.startReplaceGroup(2009525942);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_item_tax, new java.lang.Object[]{tax.getLabel(), java.lang.String.valueOf(lineItem.getTax().getValue()), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(lineItem.totalTax(taxSettings), null, 1, null)}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2009525941);
                startRestartGroup.endReplaceGroup();
                stringResource = null;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalDiscount = lineItem.getTotalDiscount();
            if (totalDiscount.getValue() == 0) {
                totalDiscount = null;
            }
            if (totalDiscount != null) {
                startRestartGroup.startReplaceGroup(2009841150);
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount = lineItem.getDiscount();
                if (discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) {
                    startRestartGroup.startReplaceGroup(-728906934);
                    str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_item_discount_percent, new java.lang.Object[]{((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) discount).getPercentage(), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalDiscount, null, 1, null)}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) {
                    startRestartGroup.startReplaceGroup(-728899086);
                    str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_invoice_item_discount_amount, new java.lang.Object[]{com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalDiscount, null, 1, null), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalDiscount, null, 1, null)}, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (discount != null) {
                        startRestartGroup.startReplaceGroup(-728909125);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1120804700);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2009841149);
                startRestartGroup.endReplaceGroup();
                str = null;
            }
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(lineItem.getName(), kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{obj, stringResource, str}), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(lineItem.getSubTotal(), null, 1, null), null, false, false, null, null, null, null, null, null, null, 8184, null), null, false, function0, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Top, false, startRestartGroup, ((i2 << 3) & 7168) | com.paypal.pds.components.ListItem.$stable | 1769472 | (com.paypal.pds.components.ListStyle.$stable << 12), 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.components.LineItemsListKt.$r8$lambda$uLQkZ5MU3GpY0Rx4jgoZ4ANudPg(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.this, taxSettings, function0, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FjuRhy8Y1ZiSyO_mVr8E5ZDj9yw(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LineItemsList(list, function1, modifier, taxSettings, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i6pNgZlqEyo4VQGPs3234z_3TVc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        function1.invoke(lineItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uLQkZ5MU3GpY0Rx4jgoZ4ANudPg(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(lineItem, taxSettings, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
