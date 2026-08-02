package com.paypal.oslo.feature.wallet.me.ui.product.footer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TestTagProductActionRowRoot", "", "TestTagProductActionRowActionContainer", "ProductActionRow", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Action;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function1;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ProductActionRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductActionRowKt {
    public static final java.lang.String TestTagProductActionRowActionContainer = "product_action_row_action_container_";
    public static final java.lang.String TestTagProductActionRowRoot = "product_action_row_root";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductActionRow(final java.util.List<com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(647636558);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            int i6 = 256;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i3 = i4;
            boolean z = true;
            boolean z2 = false;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(647636558, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRow (ProductActionRow.kt:58)");
                }
                if (!list.isEmpty()) {
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, TestTagProductActionRowRoot);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    startRestartGroup.startReplaceGroup(-1665928460);
                    int i7 = 0;
                    for (java.lang.Object obj : list) {
                        if (i7 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action action = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action) obj;
                        androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.$r8$lambda$mKK8BuzwzMvj9hgRAfwYZyOMYdE((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, z, (kotlin.jvm.functions.Function1) rememberedValue);
                        boolean z3 = (i3 & 896) == i6 ? z : z2;
                        boolean changedInstance = startRestartGroup.changedInstance(action);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((z3 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.m21436$r8$lambda$fLqGF2qm_MiNdoRRG13Phs6Hdo(kotlin.jvm.functions.Function1.this, action);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        boolean z4 = z;
                        int i8 = i3;
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(semantics, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 31), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), 1.0f, false, 2, null), TestTagProductActionRowActionContainer.concat(java.lang.String.valueOf(i7)));
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.AvatarSize.Medium medium = com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
                        com.paypal.pds.components.AvatarSource.Icon icon = new com.paypal.pds.components.AvatarSource.Icon(action.getIcon().getIcon());
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.$r8$lambda$fjfxUUjo8IqbmoBJ60pAuyfWNkU((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.pds.components.AvatarKt.Avatar(icon, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(companion2, (kotlin.jvm.functions.Function1) rememberedValue3), medium, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 56);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(action.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 384, 6, 1000);
                        startRestartGroup.endNode();
                        i7++;
                        modifier3 = modifier4;
                        z = z4;
                        i3 = i8;
                        i6 = 256;
                        z2 = false;
                    }
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier5;
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier6 = modifier3;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.m21433$r8$lambda$DJuLphNbahx8jdROoTHHA6WIfQ(list, modifier6, function1, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier7 = modifier2;
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.m21435$r8$lambda$VD9Mn8cuGsgIuVHLjGJQXGzhxg(list, modifier7, function1, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        int i62 = 256;
        if ((i & 384) == 0) {
        }
        i3 = i4;
        boolean z5 = true;
        boolean z22 = false;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-9VSBlI9VI4O13CzqQpus_IGLUo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21432$r8$lambda$9VSBlI9VI4O13CzqQpus_IGLUo(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DJuLphNbahx8jdR-OoTHHA6WIfQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21433$r8$lambda$DJuLphNbahx8jdROoTHHA6WIfQ(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductActionRow(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q3gQZ3ljyl9k1m9-Vjz3OggsbZk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21434$r8$lambda$Q3gQZ3ljyl9k1m9Vjz3OggsbZk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-654074876);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-654074876, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowPreview (ProductActionRow.kt:98)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action[]{new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.UNKNOWN, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Test"), com.paypal.pds.core.Icon.MoneyBill.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_balance_add_money, new java.lang.Object[0])), new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.UNKNOWN, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Test"), com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_transfer, new java.lang.Object[0])), new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action.Type.UNKNOWN, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Test"), com.paypal.pds.core.Icon.Info.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_account_info, new java.lang.Object[0]))});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.m21432$r8$lambda$9VSBlI9VI4O13CzqQpus_IGLUo((com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ProductActionRow(listOf, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductActionRowKt.m21434$r8$lambda$Q3gQZ3ljyl9k1m9Vjz3OggsbZk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V-D9Mn8cuGsgIuVHLjGJQXGzhxg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21435$r8$lambda$VD9Mn8cuGsgIuVHLjGJQXGzhxg(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductActionRow(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fLqGF2qm_MiNdo-RRG13Phs6Hdo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21436$r8$lambda$fLqGF2qm_MiNdoRRG13Phs6Hdo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Action action) {
        function1.invoke(action);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fjfxUUjo8IqbmoBJ60pAuyfWNkU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mKK8BuzwzMvj9hgRAfwYZyOMYdE(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }
}
