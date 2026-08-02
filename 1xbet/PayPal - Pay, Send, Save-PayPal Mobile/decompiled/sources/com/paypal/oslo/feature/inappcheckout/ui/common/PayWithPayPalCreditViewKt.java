package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052:\b\u0002\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u000f"}, d2 = {"PayWithPayPalCreditView", "", "instrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "modifier", "Landroidx/compose/ui/Modifier;", "onDynamicLinkClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "url", "title", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "getPayPalCreditSubText", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayWithPayPalCreditViewKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayWithPayPalCreditView(final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1458450469);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function23 = function22;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24 = i4 != 0 ? null : function22;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1458450469, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditView (PayWithPayPalCreditView.kt:36)");
                    }
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrl = fundingInstrument.getImageUrl();
                    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function25 = function24;
                    com.paypal.oslo.feature.inappcheckout.ui.common.FiImageKt.FiImage(imageUrl != null ? imageUrl.getImagePath() : null, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_ppbl_logo, null, startRestartGroup, 0, 4);
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 0.0f, 0.0f, 0.0f, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    modifier3 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrument.getLabel(), androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 2, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 12582960, 6, 876);
                    androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer = fundingInstrument.getCreditOffer();
                    java.lang.String normalizeNullString = com.paypal.oslo.feature.inappcheckout.UtilsKt.normalizeNullString(creditOffer != null ? creditOffer.getText1() : null);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer2 = fundingInstrument.getCreditOffer();
                    java.lang.String normalizeNullString2 = com.paypal.oslo.feature.inappcheckout.UtilsKt.normalizeNullString(creditOffer2 != null ? creditOffer2.getText2() : null);
                    if (normalizeNullString != null && normalizeNullString2 != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(normalizeNullString);
                        sb.append(" ");
                        sb.append(normalizeNullString2);
                        normalizeNullString = sb.toString();
                    } else if (normalizeNullString == null) {
                        if (normalizeNullString2 == null) {
                            normalizeNullString2 = "UNKNOWN";
                        }
                        normalizeNullString = normalizeNullString2;
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(normalizeNullString, wrapContentHeight$default, null, null, null, null, false, 0, 0, null, bodySmall, startRestartGroup, 48, 6, 1020);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer3 = fundingInstrument.getCreditOffer();
                    final java.lang.String termLinkText = creditOffer3 != null ? creditOffer3.getTermLinkText() : null;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer4 = fundingInstrument.getCreditOffer();
                    final java.lang.String termLink = creditOffer4 != null ? creditOffer4.getTermLink() : null;
                    java.lang.String str2 = termLinkText;
                    if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && (str = termLink) != null && !kotlin.text.StringsKt.isBlank(str)) {
                        startRestartGroup.startReplaceGroup(1802752487);
                        androidx.compose.ui.Modifier wrapContentHeight$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                        com.paypal.pds.components.LinkSize.Medium medium = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
                        boolean z = (i3 & 896) == 256;
                        boolean changed = startRestartGroup.changed(termLink);
                        boolean changed2 = startRestartGroup.changed(termLinkText);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (((changed | z) || changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            function23 = function25;
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditViewKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditViewKt.m15510$r8$lambda$FCdpQB4kUC1sZxC1qARUqM3s7k(kotlin.jvm.functions.Function2.this, termLink, termLinkText);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        } else {
                            function23 = function25;
                        }
                        com.paypal.pds.components.LinkKt.Link(termLinkText, wrapContentHeight$default2, (kotlin.jvm.functions.Function0) rememberedValue, medium, startRestartGroup, (com.paypal.pds.components.LinkSize.Medium.$stable << 9) | 48, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function23 = function25;
                        startRestartGroup.startReplaceGroup(1803110413);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditViewKt.$r8$lambda$8txcQKekge6SnfDCJmj6YfftyPA(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, modifier5, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8txcQKekge6SnfDCJmj6YfftyPA(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayWithPayPalCreditView(fundingInstrument, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FCdpQB4kUC1sZxC-1qARUqM3s7k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15510$r8$lambda$FCdpQB4kUC1sZxC1qARUqM3s7k(kotlin.jvm.functions.Function2 function2, java.lang.String str, java.lang.String str2) {
        if (function2 != null) {
            function2.invoke(str, str2);
        }
        return kotlin.Unit.INSTANCE;
    }
}
