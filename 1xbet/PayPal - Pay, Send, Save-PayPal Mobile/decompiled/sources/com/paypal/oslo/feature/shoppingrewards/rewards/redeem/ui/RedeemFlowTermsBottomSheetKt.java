package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001aR\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"RedeemFlowTermsBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "redeemType", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "onLinkClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RedeemFlowTermsBottomSheetContent", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RedeemFlowTermsBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemFlowTermsBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemFlowTermsBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1005328438);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(redeemType.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            boolean z = false;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function13 = function12;
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$hN6Rj_X111WuSG2_YS9QkS0gTiQ((java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function14 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1005328438, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheet (RedeemFlowTermsBottomSheet.kt:46)");
                }
                int i5 = i3 & 14;
                if (i5 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) {
                    z = true;
                }
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$EfSBFb6hC9gvYQtnum8MFihr7kA(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-20483421, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$pvtTXrRiuaGZQxKenym8GwM4f5o(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.this, function0, function14, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, i5 | com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function13 = function15;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.m19489$r8$lambda$gNmj0vnhP20XFTA4WaQe6bciXM(com.paypal.pds.components.BottomSheetController.this, redeemType, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        boolean z2 = false;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemFlowTermsBottomSheetContent(final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1362794786);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(redeemType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$KFnb9k8S3s76zWcRMVolY0tVdLw((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1362794786, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetContent (RedeemFlowTermsBottomSheet.kt:70)");
                    }
                    androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                    com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemFlowTermsUiData termsUiData = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UiDataMappersKt.toTermsUiData(redeemType);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(termsUiData.getBody(), startRestartGroup, 0);
                    final java.util.Map<java.lang.String, java.lang.String> donationTagUrls = com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.TermsUrls.INSTANCE.getDonationTagUrls();
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(termsUiData.getTitle(), startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false), rememberScrollState, false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                    com.paypal.pds.core.RichText parseRichTextWithLinkTags = com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.parseRichTextWithLinkTags(stringResource);
                    com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(donationTagUrls);
                    boolean z = (i3 & 7168) == 2048;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.m19488$r8$lambda$5leeOkEhwNjGwv2iu5ditEN8qY(donationTagUrls, function14, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(parseRichTextWithLinkTags, null, contentBase, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodyLarge, null, startRestartGroup, 384, 48, 5114);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_use_at_checkout_details_cta_title, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, false, startRestartGroup, ((i3 >> 3) & 14) | 384, 504);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function13 = function15;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$MhzYoAawuJ5phlrYhIdrEhxuihU(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.this, function0, modifier3, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$5lee-OkEhwNjGwv2iu5ditEN8qY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19488$r8$lambda$5leeOkEhwNjGwv2iu5ditEN8qY(java.util.Map map, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = (java.lang.String) map.get(str2);
        if (str3 != null) {
            function1.invoke(str3);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9NB1Q2KGIQCyK19llCE_Qdx6qGY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1274719859);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1274719859, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetPreview (RedeemFlowTermsBottomSheet.kt:118)");
            }
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RedeemFlowTermsBottomSheetContent(redeemType, (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 54, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheetKt.$r8$lambda$9NB1Q2KGIQCyK19llCE_Qdx6qGY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EfSBFb6hC9gvYQtnum8MFihr7kA(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KFnb9k8S3s76zWcRMVolY0tVdLw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MhzYoAawuJ5phlrYhIdrEhxuihU(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemFlowTermsBottomSheetContent(redeemType, function0, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gNmj0vnhP20XFTA4-WaQe6bciXM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19489$r8$lambda$gNmj0vnhP20XFTA4WaQe6bciXM(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemFlowTermsBottomSheet(bottomSheetController, redeemType, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hN6Rj_X111WuSG2_YS9QkS0gTiQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pvtTXrRiuaGZQxKenym8GwM4f5o(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-20483421, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemFlowTermsBottomSheet.<anonymous> (RedeemFlowTermsBottomSheet.kt:56)");
            }
            RedeemFlowTermsBottomSheetContent(redeemType, function0, null, function1, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
