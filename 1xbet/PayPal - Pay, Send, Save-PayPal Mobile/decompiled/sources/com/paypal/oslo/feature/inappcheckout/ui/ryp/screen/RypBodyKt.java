package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"RypBody", "", "isLoading", "", "isFiLoading", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;", "entity", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;", "merchant", "", "variant", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/IntegrationType;", "billPayIntegratorName", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/contract/RypContract$Event;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutContextEntity;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/IntegrationType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypBodyKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RypBody(final boolean z, final boolean z2, final com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity, final java.lang.String str, final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeCheckoutContextEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1255137711);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(fiData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(initializeCheckoutContextEntity) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(integrationType.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1255137711, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBody (RypBody.kt:38)");
                }
                int i5 = 29360128 & i3;
                boolean z3 = i5 == 8388608;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.m15562$r8$lambda$RGxh2LW_lNapj4t3jacLUy5L9w(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z4 = i5 == 8388608;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.$r8$lambda$502XRBLpfmkjo_drp7DEiTCnZvk(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                boolean z5 = i5 == 8388608;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.$r8$lambda$KdUmXYtuXDhVHfBS2nOwCsZ31GA(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
                boolean z6 = i5 == 8388608;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.$r8$lambda$2J4AW3Z7mSGwSl69WU_VbvidSNk(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) rememberedValue4;
                boolean z7 = i5 == 8388608;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (z7 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.m15561$r8$lambda$OFAHim8Vs3Ad3Safsj7aPkfAqY(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue5;
                boolean z8 = i5 == 8388608;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z8 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.$r8$lambda$OKZ_Nb799EXLBXx4FL6KnzMWUBo(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue6;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                androidx.compose.ui.Modifier modifier5 = modifier2;
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
                if (z) {
                    startRestartGroup.startReplaceGroup(-91682852);
                    com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypLoadingShimmerKt.RypLoadingShimmer(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-91538857);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    int i6 = i3;
                    modifier4 = modifier5;
                    com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBannerKt.RypBanner(str, integrationType, str2, initializeCheckoutContextEntity.getMerchant().getMerchantLogo(), startRestartGroup, (i3 >> 12) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt.RypAlert(fiData.getContingency(), fiData.getSelectedInstrumentId(), fiData.getFundingInstruments(), function0, startRestartGroup, 0);
                    if (z2) {
                        startRestartGroup.startReplaceGroup(936207877);
                        com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypLoadingShimmerKt.FiAccordionShimmer(startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        startRestartGroup.startReplaceGroup(936285873);
                        int i7 = (i6 >> 6) & 14;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.FiAccordion(fiData, function12, function13, function0, function3, function14, function2, startRestartGroup, i7, 0);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypBodyKt.$r8$lambda$0iABSLwEVCd8hVrBbEY7XncXH30(z, z2, fiData, initializeCheckoutContextEntity, str, integrationType, str2, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0iABSLwEVCd8hVrBbEY7XncXH30(boolean z, boolean z2, com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutContextEntity initializeCheckoutContextEntity, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType, java.lang.String str2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RypBody(z, z2, fiData, initializeCheckoutContextEntity, str, integrationType, str2, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2J4AW3Z7mSGwSl69WU_VbvidSNk(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToUpdateCard(new com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams(str, str2, str3)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$502XRBLpfmkjo_drp7DEiTCnZvk(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetPayWithAccordionExpanded(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KdUmXYtuXDhVHfBS2nOwCsZ31GA(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SelectPaymentInstrument(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OFAHim8Vs3Ad3Saf-sj7aPkfAqY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15561$r8$lambda$OFAHim8Vs3Ad3Safsj7aPkfAqY(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.SetBalanceSelection(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OKZ_Nb799EXLBXx4FL6KnzMWUBo(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.OnDynamicLinkClick(str, str2));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RGxh2LW_lNapj4t3jacLU-y5L9w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15562$r8$lambda$RGxh2LW_lNapj4t3jacLUy5L9w(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.inappcheckout.ui.ryp.contract.RypContract.Event.NavigateToAddCard.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
