package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"DebitCardManagementLinks", "", "links", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "onLinkClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DebitCardManagementLinksPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardManagementLinksKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardManagementLinks(final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item learn_more_link;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-504520206);
        int i5 = 2;
        int i6 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i6 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i4 = i6;
                int i8 = 0;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i3 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.$r8$lambda$PzL3qHRTaOC60SYIeRXNG3LFV6c((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-504520206, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinks (DebitCardManagementLinks.kt:45)");
                    }
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_LINKS), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    startRestartGroup.startReplaceGroup(1633373105);
                    for (final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails : list) {
                        int i9 = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentLinkDetails.getType().ordinal()];
                        if (i9 == 1) {
                            startRestartGroup.startReplaceGroup(-1509910176);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_links_help_center, startRestartGroup, i8);
                            startRestartGroup.endReplaceGroup();
                        } else if (i9 == i5) {
                            startRestartGroup.startReplaceGroup(-1509906067);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_links_learn_more, startRestartGroup, i8);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(437689602);
                            startRestartGroup.endReplaceGroup();
                            stringResource = "";
                        }
                        com.paypal.pds.components.LinkSize.Medium medium = com.paypal.pds.components.LinkSize.Medium.INSTANCE;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        if (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentLinkDetails.getType().ordinal()] == 1) {
                            learn_more_link = com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getHELP_CENTER_LINK();
                        } else {
                            learn_more_link = com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getLEARN_MORE_LINK();
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(companion, learn_more_link), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.HELP_CENTER_LINK);
                        int i10 = (i4 & 896) == 256 ? 1 : i8;
                        boolean changed = startRestartGroup.changed(debitInstrumentLinkDetails);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((i10 | (changed ? 1 : 0)) != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.$r8$lambda$Oz693FRoscPqrxj7_Gb2FJEqB64(kotlin.jvm.functions.Function1.this, debitInstrumentLinkDetails);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.pds.components.LinkKt.Link(stringResource, testTag, (kotlin.jvm.functions.Function0) rememberedValue2, medium, startRestartGroup, com.paypal.pds.components.LinkSize.Medium.$stable << 9, 0);
                        function12 = function12;
                        i8 = 0;
                        modifier4 = modifier4;
                        i5 = 2;
                    }
                    function13 = function12;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14 = function13;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.m14382$r8$lambda$Juxk1OZn_Ab_iO63wt713BGkFM(list, modifier3, function14, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            i4 = i6;
            int i82 = 0;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function12 = function1;
        i4 = i6;
        int i822 = 0;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$Juxk1-OZn_Ab_iO63wt713BGkFM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14382$r8$lambda$Juxk1OZn_Ab_iO63wt713BGkFM(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardManagementLinks(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oz693FRoscPqrxj7_Gb2FJEqB64(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails) {
        java.lang.String url = debitInstrumentLinkDetails.getUrl();
        if (url == null) {
            url = "";
        }
        function1.invoke(url);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PzL3qHRTaOC60SYIeRXNG3LFV6c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$moY_OniSaNIdwjOixaUKfhNzg8Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1218788092);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1218788092, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksPreview (DebitCardManagementLinks.kt:81)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails[]{new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.HELP, "help_url"), new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.LEARN_MORE, "learn_more_url")});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.$r8$lambda$xI_NTpwpqN76ILcZsjC4eW63lqE((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DebitCardManagementLinks(listOf, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementLinksKt.$r8$lambda$moY_OniSaNIdwjOixaUKfhNzg8Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xI_NTpwpqN76ILcZsjC4eW63lqE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.HELP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.LEARN_MORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
