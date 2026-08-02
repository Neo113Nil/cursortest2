package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aZ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"BenefitCardList", "", "benefits", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "modifier", "Landroidx/compose/ui/Modifier;", "itemTestTags", "", "onTermsLinkClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "url", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BenefitCard", "uiData", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "BenefitItemRow", "icon", "Lcom/paypal/pds/core/Icon;", "label", "testTag", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "BenefitCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BenifitCardKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenefitCardList(final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> list, androidx.compose.ui.Modifier modifier, java.util.List<java.lang.String> list2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.util.List<java.lang.String> list3;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.ui.Modifier.Companion companion;
        final java.util.List<java.lang.String> list4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-774108780);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                list3 = list2;
                i5 |= startRestartGroup.changedInstance(list3) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    boolean z = false;
                    if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        list4 = list3;
                        function13 = function12;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.util.List<java.lang.String> emptyList = i3 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.m19654$r8$lambda$uMsilRijaw8hNPdqpKF5vWMoc8((java.lang.String) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function14 = function12;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-774108780, i5, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitCardList (BenifitCard.kt:49)");
                        }
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
                        startRestartGroup.startReplaceGroup(-1398010628);
                        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> list5 = list;
                        int i7 = 0;
                        for (java.lang.Object obj : list5) {
                            if (i7 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            int i8 = i7;
                            BenefitCard((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData) obj, emptyList, function14, startRestartGroup, (i5 >> 3) & 1008, 0);
                            if (i8 < kotlin.collections.CollectionsKt.getLastIndex(list)) {
                                startRestartGroup.startReplaceGroup(-1323196603);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-1323122606);
                                startRestartGroup.endReplaceGroup();
                            }
                            i7 = i8 + 1;
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1398001132);
                        java.util.Iterator<T> it = list5.iterator();
                        while (it.hasNext()) {
                            com.paypal.pds.core.RichText disclosureTerms = ((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData) it.next()).getDisclosureTerms();
                            if (disclosureTerms != null) {
                                startRestartGroup.startReplaceGroup(-1684851704);
                                com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                                com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null);
                                com.paypal.pds.core.Color.ContentMuted contentMuted2 = contentMuted;
                                boolean z2 = (i5 & 7168) == 2048 ? true : z;
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$s0RFAH4nistWmjdnf4u7FtNDYlg(kotlin.jvm.functions.Function1.this, (java.lang.String) obj2, (java.lang.String) obj3);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(disclosureTerms, m1710paddingqDBjuR0$default, contentMuted2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall, null, startRestartGroup, 384, 48, 5112);
                                startRestartGroup.endReplaceGroup();
                                function14 = function14;
                                z = z;
                            } else {
                                startRestartGroup.startReplaceGroup(-1684851705);
                                startRestartGroup.endReplaceGroup();
                            }
                        }
                        function13 = function14;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        list4 = emptyList;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function13;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$BW9IavM5p4LFOzOIQ7flZzhFDtM(list, modifier3, list4, function15, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                boolean z3 = false;
                if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            list3 = list2;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function12 = function1;
            boolean z32 = false;
            if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        list3 = list2;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        boolean z322 = false;
        if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenefitCard(final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData, java.util.List<java.lang.String> list, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        java.util.List<java.lang.String> list2;
        int i3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        java.util.List<java.lang.String> list3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        java.util.List<java.lang.String> list4;
        boolean z;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> items;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(242823602);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(benefitData) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            list2 = list;
            i4 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    list3 = list2;
                    function13 = function12;
                } else {
                    java.util.List<java.lang.String> emptyList = i5 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
                    if (i3 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$ZprzKEoIbQvOle0D4eZj10WrVE4((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(242823602, i4, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitCard (BenifitCard.kt:76)");
                    }
                    if (benefitData.getTitle() != null || (((items = benefitData.getItems()) != null && !items.isEmpty()) || benefitData.getTerms() != null)) {
                        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 438, 0), com.paypal.pds.core.ConstantsKt.getSpacing16());
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
                        java.lang.String title = benefitData.getTitle();
                        if (title != null) {
                            startRestartGroup.startReplaceGroup(-1135950248);
                            list4 = emptyList;
                            z = true;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(title, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 432, 6, 1000);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1135950249);
                            startRestartGroup.endReplaceGroup();
                            list4 = emptyList;
                            z = true;
                        }
                        com.paypal.pds.core.RichText terms = benefitData.getTerms();
                        if (terms != null) {
                            startRestartGroup.startReplaceGroup(-1135608535);
                            com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                            boolean z2 = (i4 & 896) == 256 ? z : false;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$TlOm98cZGbvzo7cBn1vlk5dJqzM(kotlin.jvm.functions.Function1.this, (java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(terms, null, contentMuted, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall, null, startRestartGroup, 384, 48, 5114);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1135608536);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> items2 = benefitData.getItems();
                        if (items2 == null) {
                            startRestartGroup.startReplaceGroup(-1135260158);
                        } else {
                            startRestartGroup.startReplaceGroup(-1135260157);
                            int i6 = 0;
                            for (java.lang.Object obj : items2) {
                                if (i6 < 0) {
                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                }
                                com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem benefitListItem = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem) obj;
                                getHighSpeedVideoSizes(benefitListItem.getIcon(), benefitListItem.getText(), (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(list4, i6), startRestartGroup, 0, 0);
                                i6++;
                            }
                        }
                        list3 = list4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function13 = function15;
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final java.util.List<java.lang.String> list5 = emptyList;
                            final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16 = function14;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$NviBHYgxu2lnRWbi34wN5pZfBpk(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData.this, list5, function16, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.util.List<java.lang.String> list6 = list3;
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$TS0dyaGqZyiQUXPej2TFpPJw4HE(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData.this, list6, function13, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        list2 = list;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.pds.core.Icon icon, final java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(233968628);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str3 = str2;
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                str4 = str3;
            } else {
                java.lang.String str5 = i4 != 0 ? null : str3;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(233968628, i3, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitItemRow (BenifitCard.kt:129)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                if (str5 != null) {
                    companion = androidx.compose.ui.platform.TestTagKt.testTag(companion, str5);
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(fillMaxWidth$default.then(companion), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, null, startRestartGroup, (i3 & 14) | 3120, 20);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                java.lang.String str6 = str5;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 384, 6, 1016);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str4 = str6;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.$r8$lambda$2U1uPAZ4AVaNawYXNFo8tgCmLqg(com.paypal.pds.core.Icon.this, str, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str3 = str2;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BenefitCardPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1780746910);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1780746910, i, -1, "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitCardPreview (BenifitCard.kt:158)");
            }
            BenefitCard(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData("Benefit card title", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[]{new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.Check.INSTANCE, "Benefit one"), new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.Check.INSTANCE, "Benefit two")}), com.paypal.pds.core.RichTextKt.toRichText("Benefit terms apply", kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to("Benefit", "http://www.paypal.com"))), null, 8, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenifitCardKt.m19653$r8$lambda$5XFODpgLOC5AwUrkvzPPzNa3w(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2U1uPAZ4AVaNawYXNFo8tgCmLqg(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(icon, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5XFODpgLOC5Aw-UrkvzPPzNa-3w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19653$r8$lambda$5XFODpgLOC5AwUrkvzPPzNa3w(int i, androidx.compose.runtime.Composer composer, int i2) {
        BenefitCardPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BW9IavM5p4LFOzOIQ7flZzhFDtM(java.util.List list, androidx.compose.ui.Modifier modifier, java.util.List list2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BenefitCardList(list, modifier, list2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NviBHYgxu2lnRWbi34wN5pZfBpk(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BenefitCard(benefitData, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TS0dyaGqZyiQUXPej2TFpPJw4HE(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData, java.util.List list, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BenefitCard(benefitData, list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TlOm98cZGbvzo7cBn1vlk5dJqzM(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZprzKEoIbQvOle0D4eZj10WrVE4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s0RFAH4nistWmjdnf4u7FtNDYlg(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uM-silRijaw8hNPdqpKF5vWMoc8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19654$r8$lambda$uMsilRijaw8hNPdqpKF5vWMoc8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
