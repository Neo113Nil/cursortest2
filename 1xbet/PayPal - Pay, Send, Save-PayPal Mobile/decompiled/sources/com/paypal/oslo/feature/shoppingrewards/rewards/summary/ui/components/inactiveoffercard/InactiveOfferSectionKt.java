package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"InactiveOfferSection", "", "offers", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/inactiveoffercard/InactiveOfferCardUiData;", "verticalPosition", "", "modifier", "Landroidx/compose/ui/Modifier;", "onOfferClick", "Lkotlin/Function1;", "(Ljava/util/List;ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "InactiveOfferSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "maxCardHeightPx"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InactiveOfferSectionKt {
    public static final void InactiveOfferSection(final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData> list, final int i, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(905603487);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i6 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.$r8$lambda$e_FY5HOkCyVCvQ7p2OU31_wbPjM((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(905603487, i4, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSection (InactiveOfferSection.kt:45)");
            }
            boolean changed = startRestartGroup.changed(list);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue2;
            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            com.paypal.oslo.core.commonui.components.containers.GalleryKt.Gallery(list, modifier, androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1461129262, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.$r8$lambda$S_LovLGSguifhfO3NWFLtTtuzF0(i, density, function1, mutableIntState, (kotlin.Pair) obj, (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i4 & 14) | 3456 | ((i4 >> 3) & 112), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData, kotlin.Unit> function12 = function1;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.$r8$lambda$dp060f3RJ4PcFWVdfoCxFA2W9AI(list, i, modifier2, function12, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$D-UK5GEqKR2HgF-LTw_03CJsrdo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19539$r8$lambda$DUK5GEqKR2HgFLTw_03CJsrdo(androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.unit.IntSize intSize) {
        if (((int) (intSize.m8776unboximpl() & 4294967295L)) > mutableIntState.getIntValue()) {
            mutableIntState.setIntValue((int) (intSize.m8776unboximpl() & 4294967295L));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S_LovLGSguifhfO3NWFLtTtuzF0(int i, androidx.compose.ui.unit.Density density, final kotlin.jvm.functions.Function1 function1, final androidx.compose.runtime.MutableIntState mutableIntState, kotlin.Pair pair, final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOfferCardUiData, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(pair) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(inactiveOfferCardUiData) ? 32 : 16;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1461129262, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSection.<anonymous> (InactiveOfferSection.kt:54)");
            }
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) pair.component2()).intValue());
            if (valueOf.intValue() <= 1) {
                valueOf = null;
            }
            kotlin.Pair pair2 = valueOf != null ? kotlin.TuplesKt.to(java.lang.Integer.valueOf(intValue + 1), java.lang.Integer.valueOf(valueOf.intValue())) : null;
            if (pair2 == null) {
                composer.startReplaceGroup(-991533038);
                composer.endReplaceGroup();
                stringResource = null;
            } else {
                composer.startReplaceGroup(-991533037);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_offer_pagination_label, new java.lang.Object[]{java.lang.Integer.valueOf(((java.lang.Number) pair2.component1()).intValue()), java.lang.Integer.valueOf(((java.lang.Number) pair2.component2()).intValue())}, composer, 0);
                composer.endReplaceGroup();
            }
            java.lang.String id = inactiveOfferCardUiData.getId();
            boolean changed = composer.changed(intValue);
            boolean changed2 = composer.changed(i);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$InactiveOfferSection$2$1$1 rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$InactiveOfferSection$2$1$1(intValue, i, inactiveOfferCardUiData, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(id, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 0);
            androidx.compose.runtime.MutableIntState mutableIntState2 = mutableIntState;
            androidx.compose.ui.Modifier.Companion m1726height3ABfNKs = mutableIntState2.getIntValue() > 0 ? androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, density.mo1415toDpu2uoSUM(mutableIntState2.getIntValue())) : androidx.compose.ui.Modifier.INSTANCE;
            boolean changed3 = composer.changed(function1);
            boolean z2 = i4 == 32;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.$r8$lambda$gc7LnZmHnNOAvrPHewzmNDfXo4k(kotlin.jvm.functions.Function1.this, inactiveOfferCardUiData);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "inactive_earn_item_".concat(java.lang.String.valueOf(inactiveOfferCardUiData.getId())));
            boolean changed4 = composer.changed(mutableIntState);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.m19539$r8$lambda$DUK5GEqKR2HgFLTw_03CJsrdo(androidx.compose.runtime.MutableIntState.this, (androidx.compose.ui.unit.IntSize) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardKt.InactiveOfferCard(inactiveOfferCardUiData, function0, androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(testTag, (kotlin.jvm.functions.Function1) rememberedValue3).then(m1726height3ABfNKs), stringResource, composer, (i3 >> 3) & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dp060f3RJ4PcFWVdfoCxFA2W9AI(java.util.List list, int i, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        InactiveOfferSection(list, i, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e_FY5HOkCyVCvQ7p2OU31_wbPjM(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveOfferCardUiData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gc7LnZmHnNOAvrPHewzmNDfXo4k(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData inactiveOfferCardUiData) {
        function1.invoke(inactiveOfferCardUiData);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uWfaOfYTiAsaIpAnntKdsIDN2IA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(520844056);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(520844056, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionPreview (InactiveOfferSection.kt:101)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            InactiveOfferSection(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData[]{new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData("preview_inactive_offer_1", "+1,000 points", "Earn 1000 points by spending $300", "Ends 10/31", "Earn 5 points for every $1 spent on a monthly category of your choosing.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "Choose"), new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferCardUiData("preview_inactive_offer_2", "+300 points", "Make 5 transactions", "Ends 11/30", "Make 5 PayPal purchases and earn 300 bonus points.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "Choose")}), 1, null, null, startRestartGroup, 54, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.inactiveoffercard.InactiveOfferSectionKt.$r8$lambda$uWfaOfYTiAsaIpAnntKdsIDN2IA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
