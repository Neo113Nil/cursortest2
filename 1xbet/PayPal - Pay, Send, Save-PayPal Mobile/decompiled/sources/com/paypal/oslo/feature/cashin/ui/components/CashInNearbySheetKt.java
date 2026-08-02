package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a9\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\tH\u0000\u001a#\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"BottomSheetDragHandle", "", "(Landroidx/compose/runtime/Composer;I)V", "BottomSheetHeader", "CashInExpandedContent", "stores", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "onStoreClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CollapsedContent", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DismissibleOverlay", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CashInNearbySheet", "initiallyExpanded", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "handleDragEnd", "density", "Landroidx/compose/ui/unit/Density;", "dragOffset", "", "updateExpandedState", "StoreListItem", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "onClick", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StoreListPreview", "cash-in_prodRelease", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "currentHeight", "Landroidx/compose/ui/unit/Dp;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInNearbySheetKt {
    private static final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-55620347);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-55620347, i, -1, "com.paypal.oslo.feature.cashin.ui.components.BottomSheetDragHandle (CashInNearbySheet.kt:74)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), 1, null), "cash_in_bottom_sheet_drag_handle");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f)), androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.ContentUtilityUnselected.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f)), startRestartGroup, 54, 0), "cash_in_bottom_sheet_drag_handle_bar"), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$Lz6Nm295gi8HHy6RrErB0_BP8ag(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1478517780);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1478517780, i, -1, "com.paypal.oslo.feature.cashin.ui.components.BottomSheetHeader (CashInNearbySheet.kt:96)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_nearby_stores_text, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), "cash_in_bottom_sheet_header"), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 0, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$1hHVpLHYOAXbVGHe_VBK4IBOt3o(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1883807113);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1883807113, i3, -1, "com.paypal.oslo.feature.cashin.ui.components.CashInExpandedContent (CashInNearbySheet.kt:114)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, "cash_in_expanded_store_list");
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$ifVWzLhHKSHuaZ5ep3G5eywGVmc(list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$_EoSts9sYp2rLTbNn4KG_I1qWDU(list, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-272364190);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-272364190, i2, -1, "com.paypal.oslo.feature.cashin.ui.components.CollapsedContent (CashInNearbySheet.kt:140)");
            }
            if (!list.isEmpty()) {
                startRestartGroup.startReplaceGroup(-808233401);
                com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = list.get(0);
                boolean z = (i2 & 112) == 32;
                boolean changedInstance = startRestartGroup.changedInstance(list);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$auHXXz6arspjykOZheJ9JaINwA0(kotlin.jvm.functions.Function1.this, list);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                StoreListItem(cashInStore, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-808117120);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$PfdsMxg8MkXaiZmRE8d1ffHhuNw(list, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DismissibleOverlay(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-537127408);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-537127408, i4, -1, "com.paypal.oslo.feature.cashin.ui.components.DismissibleOverlay (CashInNearbySheet.kt:156)");
                }
                androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.Transparent.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, null, null, function0, startRestartGroup, ((i4 << 18) & 3670016) | 384, 29), startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$z0YYVFGV_jU8P6_FcfOzCqtVzt8(kotlin.jvm.functions.Function0.this, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInNearbySheet(final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore, kotlin.Unit> function1, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        int i4;
        boolean z4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1308294156);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                z3 = z2;
            } else {
                final boolean z5 = i5 != 0 ? false : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1308294156, i3, -1, "com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheet (CashInNearbySheet.kt:176)");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                boolean z6 = (i3 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z5), null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(260.0f);
                float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(650.0f);
                androidx.compose.runtime.MutableState mutableState2 = mutableState;
                if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                    m8601constructorimpl = m8601constructorimpl2;
                }
                androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(m8601constructorimpl, null, "sheet_height", null, startRestartGroup, 384, 10);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue2;
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen.INSTANCE.getNEARBY_STORES_SHEET_MODULE());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
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
                if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1605978042);
                    boolean changed = startRestartGroup.changed(mutableState);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$A414D8vn5su9Jn6VXY1SDi6RhkM(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    obj = null;
                    DismissibleOverlay((kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, 0, 2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    obj = null;
                    startRestartGroup.startReplaceGroup(-1605903084);
                    startRestartGroup.endReplaceGroup();
                }
                boolean z7 = z5;
                java.lang.Object obj2 = obj;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), m1173animateDpAsStateAjpBEmI.getValue().m8615unboximpl()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1973RoundedCornerShapea9UjIt4$default(androidx.compose.ui.unit.Dp.m8601constructorimpl(26.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(26.0f), 0.0f, 0.0f, 12, null), startRestartGroup, 48, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changed2 = startRestartGroup.changed(density);
                boolean changed3 = startRestartGroup.changed(mutableState);
                com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$CashInNearbySheet$1$2$1(density, mutableFloatState, mutableState);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(background, unit, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue4);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, obj2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                Camera2StreamConfigurationMap(startRestartGroup, 0);
                getHighSpeedVideoFpsRanges(startRestartGroup, 0);
                if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1331407385);
                    i4 = 0;
                    z4 = z7;
                    composer2 = startRestartGroup;
                    getHighResolutionOutputSizeshNQ4ISI(list, function1, androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i3 & 126, 0);
                    composer2.endReplaceGroup();
                } else {
                    i4 = 0;
                    composer2 = startRestartGroup;
                    z4 = z7;
                    composer2.startReplaceGroup(-1331175102);
                    getHighResolutionOutputSizeshNQ4ISI(list, function1, composer2, i3 & 126);
                    composer2.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, i4);
                composer2.endNode();
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z3 = z4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.m13427$r8$lambda$uUTFfqb1Dbumud67O9Blym1g70(list, function1, z3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void StoreListItem(final com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(321953328);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(cashInStore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(321953328, i3, -1, "com.paypal.oslo.feature.cashin.ui.components.StoreListItem (CashInNearbySheet.kt:270)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderUtilityUnselected.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), startRestartGroup, 432, 0), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen.INSTANCE.getSTORE_LIST_ITEM()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.PRODUCT, "store_search", "select_store"))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("store_item", 0, null, null, 14, null)), "store_list_item_".concat(java.lang.String.valueOf(cashInStore.getId()))), com.paypal.pds.core.Color.BackgroundOverlayCard.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, function0, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-591072874, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$IYwFwCAk4rRe3rjRrg3uF2AU3ms(com.paypal.oslo.feature.cashin.domain.model.CashInStore.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416 | ((i3 << 9) & 57344), 484);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.m13429$r8$lambda$vk77wdbid3cvQcITxNLkCNEi0Y(com.paypal.oslo.feature.cashin.domain.model.CashInStore.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleDragEnd(androidx.compose.ui.unit.Density density, float f, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f));
        if (f < (-mo1418toPx0680j_4)) {
            function1.invoke(java.lang.Boolean.TRUE);
        } else if (f > mo1418toPx0680j_4) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1hHVpLHYOAXbVGHe_VBK4IBOt3o(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7wC4lKbdEGY9Na6Q17j9oB_pmCo(java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1365816153, i2, -1, "com.paypal.oslo.feature.cashin.ui.components.CashInExpandedContent.<anonymous>.<anonymous>.<anonymous> (CashInNearbySheet.kt:122)");
            }
            final com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = (com.paypal.oslo.feature.cashin.domain.model.CashInStore) list.get(i);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(cashInStore);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$JOu0i0KwLhizhYYjIkd2u5Ah5A0(kotlin.jvm.functions.Function1.this, cashInStore);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            StoreListItem(cashInStore, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A414D8vn5su9Jn6VXY1SDi6RhkM(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B4qsfgRa2pRxOs6d6PMW988m7ls(final java.util.List list, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object id;
                id = ((com.paypal.oslo.feature.cashin.domain.model.CashInStore) list.get(((java.lang.Integer) obj).intValue())).getId();
                return id;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-695683452, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.m13428$r8$lambda$ustFRGcaiV7jr_0mqgO7PP6PFA(list, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GxiTEvcWvz2nk5H-43eu8MGb1mw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13425$r8$lambda$GxiTEvcWvz2nk5H43eu8MGb1mw(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1168177392);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1168177392, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.components.StoreListPreview (CashInNearbySheet.kt:336)");
            }
            final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cashin.domain.model.CashInStore[]{new com.paypal.oslo.feature.cashin.domain.model.CashInStore("1", "H-E-B", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("6001 West Parmer Lane", "Austin", "TX", "78727"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(30.3515d, -97.7553d), "3.95", "0.5", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null), new com.paypal.oslo.feature.cashin.domain.model.CashInStore(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "CVS Pharmacy", "", "", new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress("123 Main Street", "Austin", "TX", "78701"), new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(30.3525d, -97.7563d), "4.95", "0.5", null, null, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null)});
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Nearby location", androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 6, 6, 1020);
            composer2 = startRestartGroup;
            boolean changed = composer2.changed(listOf);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$B4qsfgRa2pRxOs6d6PMW988m7ls(listOf, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 0, 511);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.m13425$r8$lambda$GxiTEvcWvz2nk5H43eu8MGb1mw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IYwFwCAk4rRe3rjRrg3uF2AU3ms(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-591072874, i, -1, "com.paypal.oslo.feature.cashin.ui.components.StoreListItem.<anonymous> (CashInNearbySheet.kt:292)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.AvatarKt.Avatar(com.paypal.oslo.feature.cashin.ui.utils.AvatarUtilKt.rememberAvatarSource(cashInStore.getLogoUrl(), composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f)), "store_list_item_avatar_".concat(java.lang.String.valueOf(cashInStore.getId()))), com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 56);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(cashInStore.getName(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "store_list_item_name_".concat(java.lang.String.valueOf(cashInStore.getId()))), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, composer, 0, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_nearby_miles_caption, new java.lang.Object[]{cashInStore.getAddress().getLine1(), cashInStore.getDistance()}, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "store_list_item_address_distance_".concat(java.lang.String.valueOf(cashInStore.getId()))), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 0, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
            java.lang.String fee = cashInStore.getFee();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(fee);
            sb.append(" fee");
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "store_list_item_fee_".concat(java.lang.String.valueOf(cashInStore.getId()))), com.paypal.pds.core.Color.ContentUtilityUnselected.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1016);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JOu0i0KwLhizhYYjIkd2u5Ah5A0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore) {
        function1.invoke(cashInStore);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Lz6Nm295gi8HHy6RrErB0_BP8ag(int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PfdsMxg8MkXaiZmRE8d1ffHhuNw(java.util.List list, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(list, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_EoSts9sYp2rLTbNn4KG_I1qWDU(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(list, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$auHXXz6arspjykOZheJ9JaINwA0(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        function1.invoke(list.get(0));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ifVWzLhHKSHuaZ5ep3G5eywGVmc(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object id;
                id = ((com.paypal.oslo.feature.cashin.domain.model.CashInStore) list.get(((java.lang.Integer) obj).intValue())).getId();
                return id;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1365816153, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.$r8$lambda$7wC4lKbdEGY9Na6Q17j9oB_pmCo(list, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uUTFf-qb1Dbumud67O9Blym1g70, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13427$r8$lambda$uUTFfqb1Dbumud67O9Blym1g70(java.util.List list, kotlin.jvm.functions.Function1 function1, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInNearbySheet(list, function1, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ustFRGcaiV7jr_0mqgO-7PP6PFA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13428$r8$lambda$ustFRGcaiV7jr_0mqgO7PP6PFA(java.util.List list, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-695683452, i2, -1, "com.paypal.oslo.feature.cashin.ui.components.StoreListPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashInNearbySheet.kt:388)");
            }
            com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = (com.paypal.oslo.feature.cashin.domain.model.CashInStore) list.get(i);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            StoreListItem(cashInStore, (kotlin.jvm.functions.Function0) rememberedValue, composer, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vk77wdbid3cvQcITxNLk-CNEi0Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13429$r8$lambda$vk77wdbid3cvQcITxNLkCNEi0Y(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        StoreListItem(cashInStore, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z0YYVFGV_jU8P6_FcfOzCqtVzt8(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DismissibleOverlay(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
