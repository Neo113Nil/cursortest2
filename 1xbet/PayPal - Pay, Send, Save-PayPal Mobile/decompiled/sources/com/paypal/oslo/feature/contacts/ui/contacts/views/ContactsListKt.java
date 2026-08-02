package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"ContactsListContent", "", "config", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "contactsSearch", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchItem;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toCustomCTAType", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "Lcom/paypal/oslo/feature/contacts/api/CustomActionType;", "contacts_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsListKt {
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContactsListContent(final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, final java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(338889489);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(contactsListConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i4;
            boolean z2 = false;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(338889489, i3, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListContent (ContactsList.kt:39)");
                }
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, ((i3 >> 9) & 14) | 48, 0), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                startRestartGroup.startReplaceGroup(-1775855148);
                for (final com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem : list) {
                    if (contactSearchItem instanceof com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem) {
                        startRestartGroup.startReplaceGroup(-1865514165);
                        com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem contactSearchHeaderItem = (com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem) contactSearchItem;
                        boolean changedInstance = startRestartGroup.changedInstance(contactSearchItem);
                        boolean z3 = (i3 & 896) == 256 ? true : z2;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$fre4VaunBi4KwGbMWJzlPpnvO2o(com.paypal.oslo.feature.contacts.api.ContactSearchItem.this, function1);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.contacts.ui.contacts.views.ContactHeaderItemKt.ContactHeaderItem(contactSearchHeaderItem, (kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 0, 4);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (contactSearchItem instanceof com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) {
                            startRestartGroup.startReplaceGroup(-1865502384);
                            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contactSearchContactItem = (com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) contactSearchItem;
                            int i6 = i3 & 896;
                            boolean z4 = i6 == 256 ? true : z2;
                            boolean changedInstance2 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if ((z4 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$cupyKOh9mPvlkNv5SkpfQ_h8X_E(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            boolean z5 = i6 == 256 ? true : z2;
                            boolean changedInstance3 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((z5 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$SEF0P0ziwz1phrSfcwq69TkPeaw(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemKt.ContactItem(contactSearchContactItem, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, contactsListConfig, startRestartGroup, (i3 << 12) & 57344, 8);
                            startRestartGroup.endReplaceGroup();
                        } else if (contactSearchItem instanceof com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem) {
                            startRestartGroup.startReplaceGroup(-1865490067);
                            com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem contactSearchCustomActionItem = (com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem) contactSearchItem;
                            int i7 = i3 & 896;
                            boolean z6 = i7 == 256;
                            boolean changedInstance4 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if ((changedInstance4 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.m13661$r8$lambda$GsovXNFy6QgZq1TGoYLM83E_sQ(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                            boolean z7 = i7 == 256;
                            boolean changedInstance5 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((changedInstance5 | z7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$AEVP9G_cYHgrHJtUtbwqaoJ3XnM(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            com.paypal.oslo.feature.contacts.ui.contacts.views.ContactCustomActionItemKt.ContactCustomActionItem(contactSearchCustomActionItem, function02, null, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 0, 4);
                            startRestartGroup.endReplaceGroup();
                        } else if (contactSearchItem instanceof com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem) {
                            startRestartGroup.startReplaceGroup(-1865471138);
                            com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem contactSearchUnilateralItem = (com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem) contactSearchItem;
                            int i8 = i3 & 896;
                            boolean z8 = i8 == 256;
                            boolean changedInstance6 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if ((changedInstance6 | z8) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$bucE_4HmKaVGGTKXDUJkkqbWsO0(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                            boolean z9 = i8 == 256;
                            boolean changedInstance7 = startRestartGroup.changedInstance(contactSearchItem);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if ((changedInstance7 | z9) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.$r8$lambda$QZNS3cm1dtpEDN0eSTLPbvterGM(kotlin.jvm.functions.Function1.this, contactSearchItem);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            com.paypal.oslo.feature.contacts.ui.contacts.views.UnilateralContactItemKt.UnilateralContactItem(contactSearchUnilateralItem, function03, (kotlin.jvm.functions.Function0) rememberedValue7, null, startRestartGroup, 0, 8);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (contactSearchItem instanceof com.paypal.oslo.feature.contacts.api.ContactSearchShimmerItem) {
                                startRestartGroup.startReplaceGroup(-1865458076);
                                z = false;
                                com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListLoadingItemKt.ContactsListLoadingItem(null, startRestartGroup, 0, 1);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                z = false;
                                startRestartGroup.startReplaceGroup(-1994587593);
                                startRestartGroup.endReplaceGroup();
                            }
                            z2 = z;
                        }
                        z2 = false;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.m13662$r8$lambda$L7UCPUkibmHOZUMbtWDKS0neqo(com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig.this, list, function1, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        boolean z22 = false;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.contacts.api.CustomActionType customActionType) {
        int i = com.paypal.oslo.feature.contacts.ui.contacts.views.ContactsListKt.WhenMappings.$EnumSwitchMapping$0[customActionType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AEVP9G_cYHgrHJtUtbwqaoJ3XnM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked(getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem) contactSearchItem).getType())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GsovXNFy6QgZq1TGoYLM83E_s-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13661$r8$lambda$GsovXNFy6QgZq1TGoYLM83E_sQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked(getHighSpeedVideoFpsRanges(((com.paypal.oslo.feature.contacts.api.ContactSearchCustomActionItem) contactSearchItem).getType())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L7UCPUkibmHOZUMbtW-DKS0neqo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13662$r8$lambda$L7UCPUkibmHOZUMbtWDKS0neqo(com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContactsListContent(contactsListConfig, list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZNS3cm1dtpEDN0eSTLPbvterGM(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.InfoIconClicked((com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem) contactSearchItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SEF0P0ziwz1phrSfcwq69TkPeaw(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked((com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) contactSearchItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bucE_4HmKaVGGTKXDUJkkqbWsO0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.UnilateralContactEvent.CardClicked((com.paypal.oslo.feature.contacts.api.ContactSearchUnilateralItem) contactSearchItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cupyKOh9mPvlkNv5SkpfQ_h8X_E(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem) {
        function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked((com.paypal.oslo.feature.contacts.api.ContactSearchContactItem) contactSearchItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fre4VaunBi4KwGbMWJzlPpnvO2o(com.paypal.oslo.feature.contacts.api.ContactSearchItem contactSearchItem, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.contacts.api.HeaderAction action = ((com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem) contactSearchItem).getAction();
        if (action != null) {
            function1.invoke(new com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.HeaderActionEvent.ActionClicked(action.getType()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.contacts.api.CustomActionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.contacts.api.CustomActionType.PaymentLink.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.contacts.api.CustomActionType.ReadContacts.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
