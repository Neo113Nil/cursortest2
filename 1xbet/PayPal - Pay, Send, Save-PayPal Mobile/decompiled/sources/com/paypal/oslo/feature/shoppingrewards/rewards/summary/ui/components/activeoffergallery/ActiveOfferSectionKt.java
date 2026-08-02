package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"ActiveOfferSection", "", "activeOfferSectionUiData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;", "modifier", "Landroidx/compose/ui/Modifier;", "onActiveOfferClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferCardUiData;", "onSeeAllClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffergallery/ActiveOfferSectionUiData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ActiveOfferSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "maxCardHeightPx", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOfferSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActiveOfferSection(final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData, kotlin.Unit> function12;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferSectionUiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1329486672);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activeOfferSectionUiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function13 = function12;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.m19527$r8$lambda$_XMgFDY_3P9uoRWa_mV9V9IF3M((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function14 = function12;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1329486672, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSection (ActiveOfferSection.kt:52)");
                        }
                        boolean changed = startRestartGroup.changed(activeOfferSectionUiData.getActiveOffers());
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
                        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function03;
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, activeOfferSectionUiData.getTitle(), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1577878666, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.$r8$lambda$CRb9n9xHQZOVR9BZpTC7BmN6wRs(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData.this, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3072, 5);
                        com.paypal.oslo.core.commonui.components.containers.GalleryKt.Gallery(activeOfferSectionUiData.getActiveOffers(), null, androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2039872676, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function4
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.$r8$lambda$m_k2ZmnO6rVGLgp_rYVNtFYqmVs(androidx.compose.ui.unit.Density.this, mutableIntState, function14, (kotlin.Pair) obj, (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3456, 2);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function13 = function14;
                        function02 = function04;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function02;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.$r8$lambda$pwzU3EC_tNDfdqOzcZfXVm0X18g(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData.this, modifier3, function13, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0TzuIkt424L1eF5tC7Hj0inZ64s(androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.unit.IntSize intSize) {
        if (((int) (intSize.m8776unboximpl() & 4294967295L)) > mutableIntState.getIntValue()) {
            mutableIntState.setIntValue((int) (intSize.m8776unboximpl() & 4294967295L));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CRb9n9xHQZOVR9BZpTC7BmN6wRs(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1577878666, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSection.<anonymous>.<anonymous> (ActiveOfferSection.kt:63)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, activeOfferSectionUiData.getSeeAllButtonText(), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, composer, 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I7I7sHG07JzifEZClkf-tXRxj70, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19525$r8$lambda$I7I7sHG07JzifEZClkftXRxj70(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData activeOfferCardUiData) {
        function1.invoke(activeOfferCardUiData);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ML9CvAN0tQS3RHC3KL7uW6--jOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19526$r8$lambda$ML9CvAN0tQS3RHC3KL7uW6jOk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1642874295);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1642874295, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionPreview (ActiveOfferSection.kt:123)");
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
            ActiveOfferSection(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData("Active offers", "See all", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData[]{new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData("preview_active_section_offer_1", "5X Points", "Earn 5 points for every $1 spent at Lululemon.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "7 days left", null, false, null, 224, null), new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData("preview_active_section_offer_2", "+2,000 points", "Make 3 PayPal Debit Card purchases.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "5 days left", new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar(2, 3), false, null, 192, null), new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData("preview_active_section_offer_3", "5X Points", "You're earning 5 points per $1 spent on Groceries with your debit card.", "https://www.paypalobjects.com/shopping/oslo-rewards/money-bag.png", "30 days left", new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear(0.7f, 0.3f), false, null, 192, null)})), null, null, null, startRestartGroup, 6, 14);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.m19526$r8$lambda$ML9CvAN0tQS3RHC3KL7uW6jOk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_-XMgFDY_3P9uoRWa_mV9V9IF3M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19527$r8$lambda$_XMgFDY_3P9uoRWa_mV9V9IF3M(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData activeOfferCardUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferCardUiData, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m_k2ZmnO6rVGLgp_rYVNtFYqmVs(androidx.compose.ui.unit.Density density, final androidx.compose.runtime.MutableIntState mutableIntState, final kotlin.jvm.functions.Function1 function1, kotlin.Pair pair, final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardUiData activeOfferCardUiData, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferCardUiData, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(pair) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(activeOfferCardUiData) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2039872676, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSection.<anonymous>.<anonymous> (ActiveOfferSection.kt:75)");
            }
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) pair.component2()).intValue());
            if (valueOf.intValue() <= 1) {
                valueOf = null;
            }
            kotlin.Pair pair2 = valueOf != null ? kotlin.TuplesKt.to(java.lang.Integer.valueOf(intValue + 1), java.lang.Integer.valueOf(valueOf.intValue())) : null;
            if (pair2 == null) {
                composer.startReplaceGroup(-354431348);
                composer.endReplaceGroup();
                stringResource = null;
            } else {
                composer.startReplaceGroup(-354431347);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_offer_pagination_label, new java.lang.Object[]{java.lang.Integer.valueOf(((java.lang.Number) pair2.component1()).intValue()), java.lang.Integer.valueOf(((java.lang.Number) pair2.component2()).intValue())}, composer, 0);
                composer.endReplaceGroup();
            }
            java.lang.String id = activeOfferCardUiData.getId();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            boolean changed = composer.changed(intValue);
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$ActiveOfferSection$3$2$1$1 rememberedValue = composer.rememberedValue();
            if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$ActiveOfferSection$3$2$1$1(activeOfferCardUiData, intValue, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(id, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 0);
            androidx.compose.runtime.MutableIntState mutableIntState2 = mutableIntState;
            androidx.compose.ui.Modifier.Companion m1726height3ABfNKs = mutableIntState2.getIntValue() > 0 ? androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, density.mo1415toDpu2uoSUM(mutableIntState2.getIntValue())) : androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "active_earn_item_".concat(java.lang.String.valueOf(activeOfferCardUiData.getId())));
            boolean changed2 = composer.changed(mutableIntState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.$r8$lambda$0TzuIkt424L1eF5tC7Hj0inZ64s(androidx.compose.runtime.MutableIntState.this, (androidx.compose.ui.unit.IntSize) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier then = androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(testTag, (kotlin.jvm.functions.Function1) rememberedValue2).then(m1726height3ABfNKs);
            boolean changed3 = composer.changed(function1);
            boolean z2 = i3 == 32;
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionKt.m19525$r8$lambda$I7I7sHG07JzifEZClkftXRxj70(kotlin.jvm.functions.Function1.this, activeOfferCardUiData);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferCardKt.ActiveOfferCard(activeOfferCardUiData, then, stringResource, (kotlin.jvm.functions.Function0) rememberedValue3, composer, (i2 >> 3) & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pwzU3EC_tNDfdqOzcZfXVm0X18g(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffergallery.ActiveOfferSectionUiData activeOfferSectionUiData, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActiveOfferSection(activeOfferSectionUiData, modifier, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
