package com.paypal.oslo.feature.wallet.me.ui.product.footer;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"TestTagProductDetailListItemIcon", "", "TestTagProductDetailListItemUrlIcon", "TestTagProductDetailListItemTitle", "TestTagProductDetailListItemDescription", "TestTagProductDetailListItemBalance", "TestTagProductDetailListItemBalanceStatus", "TestTagProductDetailListItemCriticalAlert", "ProductDetailItemColumn", "", "item", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProductDetailItemColumnPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductDetailItemColumnKt {
    public static final java.lang.String TestTagProductDetailListItemBalance = "detail_balance";
    public static final java.lang.String TestTagProductDetailListItemBalanceStatus = "detail_balance_status";
    public static final java.lang.String TestTagProductDetailListItemCriticalAlert = "detail_critical_alert";
    public static final java.lang.String TestTagProductDetailListItemDescription = "detail_description";
    public static final java.lang.String TestTagProductDetailListItemIcon = "detail_icon";
    public static final java.lang.String TestTagProductDetailListItemTitle = "detail_title";
    public static final java.lang.String TestTagProductDetailListItemUrlIcon = "detail_url_icon";

    /* JADX WARN: Removed duplicated region for block: B:118:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductDetailItemColumn(final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier3;
        int i5;
        int i6;
        java.lang.String str2;
        final java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1192760116);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(item) : startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1192760116, i4, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumn (ProductDetailItemColumn.kt:67)");
                }
                androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(modifier4, com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1709paddingqDBjuR0);
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
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                com.paypal.oslo.core.commonui.utils.RefText imageUrl = item.getImageUrl();
                if (imageUrl == null) {
                    startRestartGroup.startReplaceGroup(-1472052984);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                } else {
                    startRestartGroup.startReplaceGroup(1199440409);
                    java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(imageUrl, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    startRestartGroup.endReplaceGroup();
                    str = value2;
                }
                final java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getIcon().getContentDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                if (str != null && str.length() > 0) {
                    startRestartGroup.startReplaceGroup(-1471902354);
                    modifier3 = modifier4;
                    i5 = i4;
                    com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, item.getIcon().getIcon(), null, null, startRestartGroup, 0, 26), value3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize40()), com.paypal.pds.core.ConstantsKt.getSize40()), TestTagProductDetailListItemUrlIcon), null, null, null, null, startRestartGroup, 0, 120);
                    startRestartGroup.endReplaceGroup();
                    i6 = 0;
                } else {
                    modifier3 = modifier4;
                    i5 = i4;
                    startRestartGroup.startReplaceGroup(-1471333938);
                    com.paypal.pds.components.AvatarSource.Icon icon = new com.paypal.pds.components.AvatarSource.Icon(item.getIcon().getIcon());
                    com.paypal.pds.components.AvatarSize.Medium medium = com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
                    com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changed = startRestartGroup.changed(value3);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.$r8$lambda$53VBCgflTSAmAx_beRs4K4CiOWc(value3, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    i6 = 0;
                    com.paypal.pds.components.AvatarKt.Avatar(icon, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), TestTagProductDetailListItemIcon), medium, custom, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 48);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, i6);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i6);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductDetailListItemTitle), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 2, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 12583344, 6, 872);
                final java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getSubtitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                java.lang.String value5 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getSubtitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                boolean z = (i5 & 14) == 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(item));
                boolean changed2 = startRestartGroup.changed(value4);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.$r8$lambda$IuNMW3tKPZv_glMhwCN1TLcuQjc(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.this, value4, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(value5, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion2, (kotlin.jvm.functions.Function1) rememberedValue2), contentMuted, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8448getStarte0LSkKk), null, false, 2, 0, null, bodySmall, startRestartGroup, 12583296, 6, 872);
                composer2.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                androidx.compose.ui.Alignment.Horizontal end = androidx.compose.ui.Alignment.INSTANCE.getEnd();
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), end, composer2, 48);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion3);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (item.getBalance() != null) {
                    composer2.startReplaceGroup(-1199875189);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getBalance(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductDetailListItemBalance), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), null, false, 1, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 12583344, 6, 872);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1199501763);
                    composer2.endReplaceGroup();
                }
                if (item.getBalanceStatus() != null) {
                    composer2.startReplaceGroup(-1199429192);
                    com.paypal.oslo.core.commonui.utils.RefText balanceStatusContentDescription = item.getBalanceStatusContentDescription();
                    if (balanceStatusContentDescription == null) {
                        composer2.startReplaceGroup(-1199349771);
                        composer2.endReplaceGroup();
                        value = null;
                    } else {
                        composer2.startReplaceGroup(-1839804020);
                        value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(balanceStatusContentDescription, composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        composer2.endReplaceGroup();
                    }
                    if (value == null) {
                        composer2.startReplaceGroup(-1839803060);
                        value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getBalanceStatus(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    } else {
                        composer2.startReplaceGroup(-1839805168);
                    }
                    composer2.endReplaceGroup();
                    com.paypal.pds.core.Color balanceStatusColor = item.getBalanceStatusColor();
                    java.lang.String value6 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getBalanceStatus(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    int m8444getEnde0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk();
                    com.paypal.pds.core.Typography.BodySmall bodySmall2 = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changed3 = composer2.changed(value);
                    java.lang.Object rememberedValue3 = composer2.rememberedValue();
                    if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.$r8$lambda$z_A8q2pnrWNh8FLM91KVe1Pc02I(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(value6, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion4, (kotlin.jvm.functions.Function1) rememberedValue3), balanceStatusColor, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8444getEnde0LSkKk), null, false, 1, 0, null, bodySmall2, composer2, 12582912, 6, 872);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1198686339);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                if (item.getNextBestAction() != null) {
                    composer2.startReplaceGroup(-76953472);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    java.lang.String value7 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(item.getNextBestAction().getTitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    com.paypal.oslo.core.commonui.utils.RefText subtitle = item.getNextBestAction().getSubtitle();
                    if (subtitle == null) {
                        composer2.startReplaceGroup(-76756220);
                        composer2.endReplaceGroup();
                        str2 = null;
                    } else {
                        composer2.startReplaceGroup(136071325);
                        java.lang.String value8 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(subtitle, composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        composer2.endReplaceGroup();
                        str2 = value8;
                    }
                    com.paypal.oslo.feature.wallet.me.ui.product.ProductNextBestActionKt.ProductNextBestActionCard(value7, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagProductDetailListItemCriticalAlert), item.getNextBestAction().getStyle().getBackgroundColor(), item.getNextBestAction().getStyle().getIcon(), str2, composer2, 48, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-76449908);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.$r8$lambda$oZw7AxWrIJDBvEJSZ9H8BJkMkAU(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$53VBCgflTSAmAx_beRs4K4CiOWc(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IuNMW3tKPZv_glMhwCN1TLcuQjc(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item, java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, TestTagProductDetailListItemDescription);
        if (item.getType() != com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.CRYPTO_HOLDING) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m0VryiroG6kGP4XtcD6FdPZUHuc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1448120268);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1448120268, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnPreview (ProductDetailItemColumn.kt:196)");
            }
            ProductDetailItemColumn(com.paypal.oslo.feature.wallet.me.ui.ProductOverviewKtKt.previewProductOverviewDetailItem(), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.$r8$lambda$m0VryiroG6kGP4XtcD6FdPZUHuc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oZw7AxWrIJDBvEJSZ9H8BJkMkAU(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductDetailItemColumn(item, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z_A8q2pnrWNh8FLM91KVe1Pc02I(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, TestTagProductDetailListItemBalanceStatus);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
