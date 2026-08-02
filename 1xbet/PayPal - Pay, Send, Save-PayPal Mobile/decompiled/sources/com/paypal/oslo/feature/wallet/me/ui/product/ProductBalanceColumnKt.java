package com.paypal.oslo.feature.wallet.me.ui.product;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"TestTagProductBalanceColumnBalance", "", "TestTagProductBalanceColumnStatus", "TestTagProductBalanceColumnSubtitle", "ProductBalanceColumn", "", "balance", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Balance;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Balance;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProductBalanceColumnPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductBalanceColumnKt {
    public static final java.lang.String TestTagProductBalanceColumnBalance = "product_balance_column_balance";
    public static final java.lang.String TestTagProductBalanceColumnStatus = "product_balance_column_status";
    public static final java.lang.String TestTagProductBalanceColumnSubtitle = "product_balance_column_subtitle";

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductBalanceColumn(final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1748058474);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(balance) : startRestartGroup.changedInstance(balance) ? 4 : 2) | i;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1748058474, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumn (ProductBalanceColumn.kt:41)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(balance.getBalance(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                com.paypal.pds.core.Typography.HeadingSmall headingSmall = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(value2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductBalanceColumnBalance), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 1, 0, null, headingSmall, startRestartGroup, 12583344, 6, 888);
                if (balance.getSubtitle() != null) {
                    composer2.startReplaceGroup(-740232869);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(balance.getSubtitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductBalanceColumnSubtitle), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 1, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 12583344, 6, 888);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-739958674);
                    composer2.endReplaceGroup();
                }
                if (balance.getStatus() != null) {
                    composer2.startReplaceGroup(-739902595);
                    com.paypal.oslo.core.commonui.utils.RefText statusContentDescription = balance.getStatusContentDescription();
                    if (statusContentDescription == null) {
                        composer2.startReplaceGroup(-739837434);
                        composer2.endReplaceGroup();
                        value = null;
                    } else {
                        composer2.startReplaceGroup(-1409339045);
                        value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(statusContentDescription, composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        composer2.endReplaceGroup();
                    }
                    if (value == null) {
                        composer2.startReplaceGroup(-1409338213);
                        value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(balance.getStatus(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    } else {
                        composer2.startReplaceGroup(-1409340073);
                    }
                    composer2.endReplaceGroup();
                    java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(balance.getStatus(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    com.paypal.pds.core.Color statusColor = balance.getStatusColor();
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing2(), 0.0f, 0.0f, 13, null);
                    boolean changed = composer2.changed(value);
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt.m21421$r8$lambda$ZboDxvvdItBWTQw1OQ47PDLqXg(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(value3, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(m1710paddingqDBjuR0$default, (kotlin.jvm.functions.Function1) rememberedValue), statusColor, null, null, null, false, 1, 0, null, bodySmall, composer2, 12582912, 6, 888);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-739301970);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt.m21422$r8$lambda$pKAqYI4pEYxWv9HaLrdOUyXik(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$J27uA0GLgtomWTSt7WlRb4anI0I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1848494487);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1848494487, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnPreview (ProductBalanceColumn.kt:81)");
            }
            ProductBalanceColumn(new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_information, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_current_balance, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_current_balance, new java.lang.Object[0]), null, null, 24, null), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.ProductBalanceColumnKt.$r8$lambda$J27uA0GLgtomWTSt7WlRb4anI0I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZboD-xvvdItBWTQw1OQ47PDLqXg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21421$r8$lambda$ZboDxvvdItBWTQw1OQ47PDLqXg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, TestTagProductBalanceColumnStatus);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pKAqYI4pEYxWv9-HaLrdOUyXi-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21422$r8$lambda$pKAqYI4pEYxWv9HaLrdOUyXik(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Balance balance, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductBalanceColumn(balance, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
