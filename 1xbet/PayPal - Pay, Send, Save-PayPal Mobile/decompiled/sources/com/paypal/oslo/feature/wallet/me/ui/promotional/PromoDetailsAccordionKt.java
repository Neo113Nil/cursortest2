package com.paypal.oslo.feature.wallet.me.ui.promotional;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"PromoDetailsAccordion", "", "promoDetails", "Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/me/ui/promotional/PromoDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoDetailsAccordionKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromoDetailsAccordion(final com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoDetails, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(331337532);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(promoDetails) ? 4 : 2) | i;
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
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(331337532, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordion (PromoDetailsAccordion.kt:34)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(promoDetails.isExpanded()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing4()), com.paypal.oslo.feature.wallet.me.ui.promotional.PromoCardKt.TestTagPromoDetailsAccordion);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(androidx.compose.ui.res.StringResources_androidKt.stringResource(promoDetails.getCallToActionResId(), startRestartGroup, 0));
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt.$r8$lambda$2bAoLqePbBJvTqvezOy9zMPsiPQ(androidx.compose.runtime.MutableState.this, (java.lang.String) obj));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt.$r8$lambda$Sr6_QKRJPfIZ0AjNRPSErjqfi2U(androidx.compose.runtime.MutableState.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.AccordionKt.Accordion(listOf, function1, testTag, (kotlin.jvm.functions.Function2) rememberedValue3, false, com.paypal.oslo.feature.wallet.me.ui.promotional.ComposableSingletons$PromoDetailsAccordionKt.INSTANCE.m21441getLambda$858297320$wallet_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1361480628, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt.$r8$lambda$XqIK6J_4la00DviYOpTUqXL60JE(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails.this, (com.paypal.pds.components.AccordionBodyScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 1797168, 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordionKt.m21444$r8$lambda$9lYGvoFfwN8GaVBumePtlqd56M(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-9lYGvoFfwN8GaVBumePtlqd56M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21444$r8$lambda$9lYGvoFfwN8GaVBumePtlqd56M(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PromoDetailsAccordion(promoDetails, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean $r8$lambda$2bAoLqePbBJvTqvezOy9zMPsiPQ(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((java.lang.Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Sr6_QKRJPfIZ0AjNRPSErjqfi2U(androidx.compose.runtime.MutableState mutableState, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XqIK6J_4la00DviYOpTUqXL60JE(com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetails promoDetails, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1361480628, i, -1, "com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsAccordion.<anonymous> (PromoDetailsAccordion.kt:60)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        composer.startReplaceGroup(-1657290516);
        java.util.Iterator<T> it = promoDetails.getItems().iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsListItemComposableKt.PromoDetailsListItemComposable((com.paypal.oslo.feature.wallet.me.ui.promotional.PromoDetailsItem) it.next(), null, composer, 0, 2);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
