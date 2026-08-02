package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032O\b\u0002\u0010\u0004\u001aI\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"BottomSheetContent", "", "model", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;", "onLinkClicked", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "index", "", "text", "tag", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/bottomsheet/ContentUiModel;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomSheetContentKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetContent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel contentUiModel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        int i6;
        kotlin.Unit unit;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-745982218);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(contentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        function33 = function32;
                        function05 = function03;
                        function06 = function04;
                    } else {
                        function33 = i7 != 0 ? null : function32;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit2;
                                        unit2 = kotlin.Unit.INSTANCE;
                                        return unit2;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function07 = function03;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit2;
                                        unit2 = kotlin.Unit.INSTANCE;
                                        return unit2;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-745982218, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContent (BottomSheetContent.kt:41)");
                        }
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if (contentUiModel.getTopIcon() == null) {
                            startRestartGroup.startReplaceGroup(580508228);
                            startRestartGroup.endReplaceGroup();
                            function08 = function04;
                            function09 = function07;
                            i6 = 0;
                        } else {
                            startRestartGroup.startReplaceGroup(580508229);
                            function08 = function04;
                            function09 = function07;
                            i6 = 0;
                            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(contentUiModel.getTopIcon()), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        }
                        if (contentUiModel.getTitle() == null) {
                            startRestartGroup.startReplaceGroup(580738217);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(580738218);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(contentUiModel.getTitle().asString(startRestartGroup, i6), null, null, null, null, null, false, 0, 0, null, contentUiModel.getTitleTypography(), startRestartGroup, 0, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i6);
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        }
                        if (contentUiModel.getSpanList() == null) {
                            startRestartGroup.startReplaceGroup(580969849);
                            startRestartGroup.endReplaceGroup();
                            unit = null;
                        } else {
                            startRestartGroup.startReplaceGroup(580969850);
                            com.paypal.pds.components.LegalConsentKt.LegalConsent(kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.pds.core.RichTextKt.toRichText(contentUiModel.getDescription().asString(startRestartGroup, i6), contentUiModel.getSpanList()), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null)), null, null, function33, null, startRestartGroup, com.paypal.pds.components.LegalConsentItem.$stable | ((i3 << 6) & 7168), 22);
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            unit = kotlin.Unit.INSTANCE;
                        }
                        if (unit == null) {
                            startRestartGroup.startReplaceGroup(1265676995);
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(contentUiModel.getDescription().asString(startRestartGroup, i6), null, null, null, null, null, false, 0, 0, null, contentUiModel.getDescriptionTypography(), startRestartGroup, 0, 0, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1265666579);
                            startRestartGroup.endReplaceGroup();
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString actionButtonTitle = contentUiModel.getActionButtonTitle();
                        if (actionButtonTitle == null) {
                            startRestartGroup.startReplaceGroup(581453232);
                            startRestartGroup.endReplaceGroup();
                            function011 = function09;
                            obj = null;
                        } else {
                            startRestartGroup.startReplaceGroup(581453233);
                            java.lang.String asString = actionButtonTitle.asString(startRestartGroup, i6);
                            com.paypal.pds.components.ButtonStyle actionButtonStyle = contentUiModel.getActionButtonStyle();
                            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                            boolean isLoading = contentUiModel.isLoading();
                            boolean isLoading2 = contentUiModel.isLoading();
                            androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null).then(contentUiModel.getPrimaryButtonTestTag() != null ? androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, contentUiModel.getPrimaryButtonTestTag()) : androidx.compose.ui.Modifier.INSTANCE);
                            int i8 = (i3 & 896) == 256 ? 1 : i6;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (i8 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function010 = function09;
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt.m18372$r8$lambda$_WlfTr84SYCzJwDEKFxb_yZdkg(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                function010 = function09;
                            }
                            function011 = function010;
                            obj = null;
                            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, asString, then, null, null, actionButtonStyle, large, !isLoading, isLoading2, startRestartGroup, 1572864, 24);
                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString secondaryButtonTitle = contentUiModel.getSecondaryButtonTitle();
                        if (secondaryButtonTitle == null) {
                            startRestartGroup.startReplaceGroup(582214158);
                            startRestartGroup.endReplaceGroup();
                            function06 = function08;
                        } else {
                            startRestartGroup.startReplaceGroup(582214159);
                            java.lang.String asString2 = secondaryButtonTitle.asString(startRestartGroup, i6);
                            com.paypal.pds.components.ButtonStyle secondaryButtonStyle = contentUiModel.getSecondaryButtonStyle();
                            com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, obj);
                            int i9 = (i3 & 7168) != 2048 ? i6 : 1;
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (i9 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function06 = function08;
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt.$r8$lambda$vbAyumvAdTumZJt8NTa_BzHoWt4(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                function06 = function08;
                            }
                            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, asString2, m1708paddingVpY3zN4$default2, null, null, secondaryButtonStyle, large2, false, false, startRestartGroup, 1572864, 408);
                            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                        }
                        androidx.compose.ui.unit.Dp m18382getBottomPaddinglTKBWiU = contentUiModel.m18382getBottomPaddinglTKBWiU();
                        if (m18382getBottomPaddinglTKBWiU == null) {
                            startRestartGroup.startReplaceGroup(582590963);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(582590964);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, m18382getBottomPaddinglTKBWiU.m8615unboximpl()), startRestartGroup, i6);
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                        }
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function05 = function011;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34 = function33;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetContentKt.$r8$lambda$cocxL6DKyrYtLK_e9HF5LkF0OGc(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel.this, function34, function05, function06, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function04 = function02;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function02;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function32 = function3;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function02;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$_WlfTr84SYC-zJwDEKFxb_yZdkg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18372$r8$lambda$_WlfTr84SYCzJwDEKFxb_yZdkg(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cocxL6DKyrYtLK_e9HF5LkF0OGc(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel contentUiModel, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BottomSheetContent(contentUiModel, function3, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vbAyumvAdTumZJt8NTa_BzHoWt4(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
