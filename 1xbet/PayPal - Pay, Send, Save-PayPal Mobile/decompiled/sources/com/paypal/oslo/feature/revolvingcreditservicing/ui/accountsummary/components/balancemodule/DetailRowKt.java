package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"DetailRow", "", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "valueTestTag", "infoIconUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;", "onInfoIconClick", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrl;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailRowKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailRow(final java.lang.String str, final java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str4;
        int i4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function12;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str5;
        final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function14;
        androidx.compose.ui.Modifier.Companion m22100clickable_mRqjOc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(580685655);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str4 = str3;
            i3 |= startRestartGroup.changed(str4) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                contentUrl2 = contentUrl;
                i3 |= startRestartGroup.changedInstance(contentUrl2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        str5 = str4;
                        contentUrl3 = contentUrl2;
                        function13 = function12;
                    } else {
                        java.lang.String str6 = i7 != 0 ? "" : str4;
                        if (i4 != 0) {
                            contentUrl2 = null;
                        }
                        if (i5 != 0) {
                            function12 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(580685655, i6, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRow (DetailRow.kt:41)");
                        }
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl4 = contentUrl2;
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl, kotlin.Unit> function15 = function12;
                        java.lang.String str7 = str6;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, i6 & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                        if (contentUrl4 == null) {
                            composer3 = startRestartGroup;
                            composer3.startReplaceGroup(369292298);
                            composer3.endReplaceGroup();
                            function14 = function15;
                        } else {
                            composer3 = startRestartGroup;
                            composer3.startReplaceGroup(369292299);
                            com.paypal.pds.core.Icon.Information information = com.paypal.pds.core.Icon.Information.INSTANCE;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_accessibility_more_info, new java.lang.Object[]{str}, composer3, 0);
                            com.paypal.pds.components.IconSize.XSmall xSmall = com.paypal.pds.components.IconSize.XSmall.INSTANCE;
                            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                            if (function15 == null) {
                                composer3.startReplaceGroup(-1730972661);
                                composer3.endReplaceGroup();
                                function14 = function15;
                                m22100clickable_mRqjOc = null;
                            } else {
                                composer3.startReplaceGroup(-1730972660);
                                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                boolean changed = composer3.changed(function15);
                                boolean changedInstance = composer3.changedInstance(contentUrl4);
                                java.lang.Object rememberedValue = composer3.rememberedValue();
                                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.$r8$lambda$YTwlEs6DDowLmwlj9jGyQ4ShUXs(kotlin.jvm.functions.Function1.this, contentUrl4);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                function14 = function15;
                                m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer3, 6, 31);
                                composer3.endReplaceGroup();
                            }
                            if (m22100clickable_mRqjOc == null) {
                                m22100clickable_mRqjOc = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            com.paypal.pds.components.IconKt.Icon(information, stringResource, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(m22100clickable_mRqjOc, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), xSmall, contentMuted, composer3, 27654, 0);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            composer3.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                        composer3.endNode();
                        composer2 = composer3;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, str7.length() > 0 ? androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str7) : androidx.compose.ui.Modifier.INSTANCE, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer3, (i6 >> 3) & 14, 6, 1020);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str5 = str7;
                        contentUrl3 = contentUrl4;
                        function13 = function14;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.balancemodule.DetailRowKt.$r8$lambda$YpS7yFdeRPy8XOCt1kexRmO9nt4(str, str2, str5, contentUrl3, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                i6 = i3;
                if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            contentUrl2 = contentUrl;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str4 = str3;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        contentUrl2 = contentUrl;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YTwlEs6DDowLmwlj9jGyQ4ShUXs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl) {
        function1.invoke(contentUrl);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YpS7yFdeRPy8XOCt1kexRmO9nt4(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DetailRow(str, str2, str3, contentUrl, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
