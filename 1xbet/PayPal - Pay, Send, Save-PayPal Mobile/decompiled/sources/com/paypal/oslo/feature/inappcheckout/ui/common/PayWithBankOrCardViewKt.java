package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052S\b\u0002\u0010\u0006\u001aM\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"PayWithBankOrCardView", "", "instrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "modifier", "Landroidx/compose/ui/Modifier;", "onUpdateCardClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "fiId", "cardBrand", "lastDigits", "isSelected", "", "showCardDetails", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;ZZLandroidx/compose/runtime/Composer;II)V", "DisAllowedError", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayWithBankOrCardViewKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayWithBankOrCardView(final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        int i5;
        int i6;
        final boolean z3;
        final boolean z4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-313298206);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrument) ? 4 : 2) | i;
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
                function32 = function3;
                i3 |= startRestartGroup.changedInstance(function32) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z;
                            z4 = z2;
                            modifier3 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                function32 = null;
                            }
                            boolean z5 = i5 != 0 ? false : z;
                            boolean z6 = i6 != 0 ? true : z2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-313298206, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardView (PayWithBankOrCardView.kt:51)");
                            }
                            android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
                            com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrl = fundingInstrument.getImageUrl();
                            final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34 = function32;
                            boolean z7 = z5;
                            com.paypal.oslo.feature.inappcheckout.ui.common.FiImageKt.FiImage(imageUrl != null ? imageUrl.getImagePath() : null, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_ppbl_logo, null, startRestartGroup, 0, 4);
                            androidx.compose.ui.Modifier alignCenterVerticallyIf = com.paypal.oslo.feature.inappcheckout.UtilsKt.alignCenterVerticallyIf(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 0.0f, 0.0f, 0.0f, 14, null), rowScopeInstance, !z6);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, alignCenterVerticallyIf);
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
                            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrument.getLabel(), androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize0(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), null, false, 3, null), 1.0f, false, 2, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 2, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 12582912, 6, 876);
                            if (fundingInstrument.shouldBeUpdated()) {
                                startRestartGroup.startReplaceGroup(-1069485410);
                                androidx.compose.ui.Modifier wrapContentSize$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null);
                                boolean z8 = function34 != null;
                                boolean z9 = (i3 & 896) == 256;
                                boolean z10 = (i3 & 14) == 4;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if ((z9 | z10) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.m15508$r8$lambda$YwzVrPllSaiqU_kKbPwPf01cYs(kotlin.jvm.functions.Function3.this, fundingInstrument);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function33 = function34;
                                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(wrapContentSize$default2, null, null, z8, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 27), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.UPDATE_CARD);
                                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                                com.paypal.pds.core.Color.ContentLink contentLink = com.paypal.pds.core.Color.ContentLink.INSTANCE;
                                java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_expired_card_update_label);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(string, testTag, contentLink, null, null, null, false, 0, 0, null, bodyMedium, startRestartGroup, 384, 6, 1016);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function33 = function34;
                                startRestartGroup.startReplaceGroup(-1068681332);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (z6) {
                                startRestartGroup.startReplaceGroup(-1157781142);
                                androidx.compose.ui.Modifier wrapContentHeight$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSize4(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null);
                                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                                java.lang.String string2 = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_fi_details_text, resources.getString(com.paypal.oslo.feature.inappcheckout.UtilsKt.getFiSubTypeStringResId(fundingInstrument.getType(), fundingInstrument)), fundingInstrument.getLastDigits());
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(string2, wrapContentHeight$default2, null, null, null, null, false, 0, 0, null, bodySmall, startRestartGroup, 0, 6, 1020);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-1157203984);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (fundingInstrument.isDisallowed()) {
                                startRestartGroup.startReplaceGroup(-1157154291);
                                getHighResolutionOutputSizeshNQ4ISI(fundingInstrument, startRestartGroup, i3 & 14);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-1157089904);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            com.paypal.oslo.feature.inappcheckout.UtilsKt.SmartAuthMessage(fundingInstrument, z7, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112));
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            z3 = z7;
                            function32 = function33;
                            z4 = z6;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function35 = function32;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.$r8$lambda$DaHI0pvcVZAxFLPTBln1bTGpngM(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, modifier3, function35, z3, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function32 = function3;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1859566240);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(fundingInstrument) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1859566240, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.DisAllowedError (PayWithBankOrCardView.kt:128)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> disallowedReasons = fundingInstrument.getUsability().getDisallowedReasons();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason fundingDisallowedReason = disallowedReasons != null ? (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) disallowedReasons) : null;
            switch (fundingDisallowedReason != null ? com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.WhenMappings.$EnumSwitchMapping$0[fundingDisallowedReason.ordinal()] : -1) {
                case 1:
                case 2:
                    i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_contact_issuer;
                    break;
                case 3:
                case 4:
                    i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_expired_instrument;
                    break;
                case 5:
                    i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_low_available_credit;
                    break;
                case 6:
                    i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_unavailable_for_gaming;
                    break;
                default:
                    i3 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_unavailable_instrument;
                    break;
            }
            int i4 = i3;
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
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
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Critical.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_card_disallowed, new java.lang.Object[0], startRestartGroup, 0), null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 24582, 12);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i4, new java.lang.Object[0], startRestartGroup, 0), rowScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize4(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 0, 6, 1020);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.$r8$lambda$Zg5vTsKFLdx0UPXEuqNHlOEqtRQ(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DaHI0pvcVZAxFLPTBln1bTGpngM(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayWithBankOrCardView(fundingInstrument, modifier, function3, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YwzVrPllSaiq-U_kKbPwPf01cYs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15508$r8$lambda$YwzVrPllSaiqU_kKbPwPf01cYs(kotlin.jvm.functions.Function3 function3, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument) {
        if (function3 != null) {
            function3.invoke(fundingInstrument.getId(), fundingInstrument.getCardBrand(), fundingInstrument.getLastDigits());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zg5vTsKFLdx0UPXEuqNHlOEqtRQ(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(fundingInstrument, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.CARD_VERIFICATION_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.UNAVAILABLE_INSTRUMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.EXPIRED_INSTRUMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.INACTIVE_DUE_TO_EXPIRY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.UNSUPPORTED_FOR_GAMING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
