package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"TestTagSelectCardBrand", "", "TestTagCardBrandHeader", "TestTagCardBrandList", "TestTagCardBrandListItem", "TestTagCardBrandLogo", "TestTagCardBrandSelectedIcon", "SelectCardBrand", "", "cardBrandList", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "selectedCardBrand", "onCardBrandSelect", "Lkotlin/Function1;", "showGuidanceHeader", "", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "asListItem", "Lcom/paypal/pds/components/ListItem;", "isSelected", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;ZLandroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;", "SelectCardBrandPromptedFirstTimePreview", "(Landroidx/compose/runtime/Composer;I)V", "SelectCardBrandPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectCardBrandKt {
    public static final java.lang.String TestTagCardBrandHeader = "test_tag_card_brand_header";
    public static final java.lang.String TestTagCardBrandList = "test_tag_card_brand_list";
    public static final java.lang.String TestTagCardBrandListItem = "test_tag_card_brand_list_item";
    public static final java.lang.String TestTagCardBrandLogo = "test_tag_card_brand_logo";
    public static final java.lang.String TestTagCardBrandSelectedIcon = "test_tag_card_brand_selected_icon";
    public static final java.lang.String TestTagSelectCardBrand = "test_tag_select_card_brand";

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectCardBrand(final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition> list, final com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition, kotlin.Unit> function1, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-871359263);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(cardDefinition) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i6 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            i3 = i6;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i7 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-871359263, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrand (SelectCardBrand.kt:62)");
                }
                startRestartGroup.startReplaceGroup(142377901);
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                startRestartGroup.startReplaceGroup(142378949);
                for (com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition2 : list) {
                    final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(cardDefinition2, cardDefinition);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1594190091, 0, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.asListItem (SelectCardBrand.kt:96)");
                    }
                    com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage logo = cardDefinition2.getLogo();
                    final java.lang.String baseCdnLinkPath = logo != null ? logo.getBaseCdnLinkPath() : null;
                    com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(com.paypal.oslo.core.commonui.utils.RefTextKt.value(cardDefinition2.getBrand().getDisplayName(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(816440472, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$vGRGpiU0oe5g9KeHosMNVRFG7mY(areEqual, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-77494439, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.m21114$r8$lambda$W5Enee0a63FYz8cP1xEeoq7liQ(baseCdnLinkPath, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, null, null, null, null, 7998, null);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    createListBuilder.add(listItem);
                }
                startRestartGroup.endReplaceGroup();
                final java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagSelectCardBrand), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 10, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (z3) {
                    startRestartGroup.startReplaceGroup(1525158257);
                    z4 = false;
                    z5 = true;
                    i4 = i3;
                    i5 = 256;
                    com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_select_network_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagCardBrandHeader), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_select_network_subtitle, startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 48, 120);
                    startRestartGroup.endReplaceGroup();
                } else {
                    z4 = false;
                    z5 = true;
                    i4 = i3;
                    i5 = 256;
                    startRestartGroup.startReplaceGroup(1525439179);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagCardBrandList), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
                boolean changedInstance = startRestartGroup.changedInstance(build);
                boolean z6 = (i4 & 896) != i5 ? z4 : z5;
                boolean changedInstance2 = startRestartGroup.changedInstance(list);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance2 | changedInstance | z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$8oE9chguixiXW6knIn5B5vaaWS4(build, function1, list, (com.paypal.pds.components.ListItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.List(build, m1710paddingqDBjuR0$default2, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 0, 0, 1532);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z7 = z3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$i6ODzTg6TvZCve3vozHqm8VDBsA(list, cardDefinition, function1, z7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        i3 = i6;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8oE9chguixiXW6knIn5B5vaaWS4(java.util.List list, kotlin.jvm.functions.Function1 function1, java.util.List list2, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        function1.invoke(list2.get(list.indexOf(listItem)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GJnzA_uMgurJanFIb5DFEmAWnN8(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T99GVewqYIBRcI6aS_dGTcHEo-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21113$r8$lambda$T99GVewqYIBRcI6aS_dGTcHEoQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1368261553);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1368261553, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandPreview (SelectCardBrand.kt:161)");
            }
            com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition = new com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition(kotlin.collections.CollectionsKt.emptyList(), "US", "US", "USD", com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.AMEX, null, new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage("https://pics.paypal.com/00/s/MDAxWDEwMzZYUE5H/p/NzA4MDI0ZTI/image", null, null, null), null, null, kotlin.collections.CollectionsKt.emptyList(), null, null, 2048, null);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(cardDefinition);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$GJnzA_uMgurJanFIb5DFEmAWnN8((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SelectCardBrand(listOf, cardDefinition, (kotlin.jvm.functions.Function1) rememberedValue, false, startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.m21113$r8$lambda$T99GVewqYIBRcI6aS_dGTcHEoQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W5Enee0a63FYz8cP1xEeo-q7liQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21114$r8$lambda$W5Enee0a63FYz8cP1xEeoq7liQ(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-77494439, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.asListItem.<anonymous> (SelectCardBrand.kt:101)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, null, null, null, composer, 0, 30), null, 2, null), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagCardBrandLogo), com.paypal.pds.components.AvatarSize.Medium.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer, (com.paypal.pds.components.AvatarSize.Medium.$stable << 6) | 48, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i6ODzTg6TvZCve3vozHqm8VDBsA(java.util.List list, com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition, kotlin.jvm.functions.Function1 function1, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectCardBrand(list, cardDefinition, function1, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kp_hzvNH0oPC7_HICmMligmqDIc(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$odErMV6KJ1yvtho5ZbTDlR23BZs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2055346417);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2055346417, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandPromptedFirstTimePreview (SelectCardBrand.kt:130)");
            }
            com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition = new com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition(kotlin.collections.CollectionsKt.emptyList(), "US", "US", "USD", com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.VISA, null, new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage("https://pics.paypal.com/00/s/OTY5WDE1MzZYUE5H/p/YTBhNDA1NWI/image", null, null, null), null, null, kotlin.collections.CollectionsKt.emptyList(), null, null, 2048, null);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(cardDefinition);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$kp_hzvNH0oPC7_HICmMligmqDIc((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SelectCardBrand(listOf, cardDefinition, (kotlin.jvm.functions.Function1) rememberedValue, true, startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.SelectCardBrandKt.$r8$lambda$odErMV6KJ1yvtho5ZbTDlR23BZs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vGRGpiU0oe5g9KeHosMNVRFG7mY(boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(816440472, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.asListItem.<anonymous> (SelectCardBrand.kt:114)");
            }
            if (z) {
                composer.startReplaceGroup(178361828);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagCardBrandSelectedIcon), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer, 28086, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(178689002);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
