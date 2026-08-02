package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aq\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/ItemsListState;", "itemsListState", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "", "onEdit", "", "componentName", "componentAction", "moduleName", "moduleAction", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "dockContent", "emptyState", "BusinessInventoryItemsListScreen", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/ItemsListState;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "onAdd", "BusinessInventoryItemsListProduct", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/ItemsListState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BusinessInventoryItemsListService", "BusinessInventoryItemsListProductPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryItemsListKt {
    public static final void BusinessInventoryItemsListScreen(final com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemsListState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1348687135);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(itemsListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1348687135, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen (BusinessInventoryItemsList.kt:60)");
            }
            if (itemsListState.getLoading()) {
                startRestartGroup.startReplaceGroup(-680278540);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.BusinessInventoryScreenLoadingTestTag), null, null, null, startRestartGroup, 6, 14);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else if (!itemsListState.getItems().isEmpty()) {
                startRestartGroup.startReplaceGroup(-679913143);
                composer2 = startRestartGroup;
                com.paypal.pds.components.DockKt.Dock(com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str3, 0, null, null, 14, null)), "item_list", str4), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1263621768, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$yhCbc3nYK0UtBNfMEKJ75HcaGJo(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1399649065, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$d_AQFL_RHeOwyztmAtv1UV5Z7VI(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.this, str, str2, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, 27648, 4);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-678031536);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                function22.invoke(composer2, java.lang.Integer.valueOf((i2 >> 21) & 14));
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$49NuHxwjFGwuUS6LlaRit19Ub8E(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.this, function1, str, str2, str3, str4, function2, function22, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryItemsListProduct(final com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemsListState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1416046156);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(itemsListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1416046156, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListProduct (BusinessInventoryItemsList.kt:131)");
            }
            BusinessInventoryItemsListScreen(itemsListState, function1, com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ComponentName.ProductListItem, com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.SelectProduct, com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products, com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.ViewProducts, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(760701109, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$ZntVPuy7qsE6bYanvWaVMqijIt4(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1321850250, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$wotCsreAjIwN_1Xdd8RgqxbHjlw(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 14) | 14380416 | ((i2 >> 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$RSusCUfoM0uEgYCLw3dU7heBAFU(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.this, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryItemsListService(final com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemsListState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1520928506);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(itemsListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1520928506, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListService (BusinessInventoryItemsList.kt:175)");
            }
            BusinessInventoryItemsListScreen(itemsListState, function1, com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ComponentName.ServiceListItem, com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.SelectService, com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Services, com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.ViewServices, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-597291525, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.m13049$r8$lambda$EQKjHNkwnLfQ0ZktQSZNltW3xI(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1615124412, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$Z5aV6RNso6Ca4KYghXdsdiU8zxw(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i2 & 14) | 14380416 | ((i2 >> 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$WI2XXHHc3lz68A8N7kKTlxT6L6M(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.this, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryItemsListProductPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-126769238);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-126769238, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListProductPreview (BusinessInventoryItemsList.kt:216)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem[]{new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem((java.lang.String) null, "My Product", new com.paypal.oslo.core.money.Money(123L, "USD"), (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) null, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT, "Description", 9, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem((java.lang.String) null, "My Second Product", new com.paypal.oslo.core.money.Money(456L, "USD"), (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) null, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT, "Description", 9, (kotlin.jvm.internal.DefaultConstructorMarker) null)}), false);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$UNPuyQFg_UzMHdoTXUUeD9u9DNM((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BusinessInventoryItemsListProduct(itemsListState, function0, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.m13053$r8$lambda$yhqvdjk_vbdtcFY0KAt6HaIkk4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$49NuHxwjFGwuUS6LlaRit19Ub8E(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryItemsListScreen(itemsListState, function1, str, str2, str3, str4, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EQKjHNkwnLfQ0ZktQS-ZNltW3xI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13049$r8$lambda$EQKjHNkwnLfQ0ZktQSZNltW3xI(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-597291525, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListService.<anonymous> (BusinessInventoryItemsList.kt:184)");
            }
            androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.AddNewServiceButton, 0, 2, null)), "item_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.AddNewService);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_service_empty_state_add_button, composer, 0);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.$r8$lambda$SNqczhkXxs8dUSHEGvDaOaiRRcc(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, userIntent, null, null, null, null, false, false, composer, 0, 504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HECEe8x8JxOeZk5VA-HCKRDAbIU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13050$r8$lambda$HECEe8x8JxOeZk5VAHCKRDAbIU(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LLliOXivKrs-IhbDiRq29mFjaCY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13051$r8$lambda$LLliOXivKrsIhbDiRq29mFjaCY(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> items = itemsListState.getItems();
        final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$lambda$2$0$0$$inlined$items$default$1 businessInventoryItemsListKt$BusinessInventoryItemsListScreen$lambda$2$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$lambda$2$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
            }
        };
        lazyListScope.items(items.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$lambda$2$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(items.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$lambda$2$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) items.get(i);
                composer.startReplaceGroup(1353169933);
                androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.m1731requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(str, 0, null, null, 14, null)), "item_list", str2);
                java.lang.String name2 = libraryItem.getName();
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-641431184, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$3$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        java.lang.String formatAsCurrencyWithSeparators$default;
                        androidx.compose.runtime.Composer composer3 = composer2;
                        int intValue = num.intValue();
                        if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                            composer3.skipToGroupEnd();
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-641431184, intValue, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BusinessInventoryItemsList.kt:99)");
                            }
                            if (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this.getType() == com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE) {
                                composer3.startReplaceGroup(-566778018);
                                formatAsCurrencyWithSeparators$default = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_service_list_item_price, new java.lang.Object[]{com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this.getPrice(), null, 1, null)}, composer3, 0);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-566472575);
                                composer3.endReplaceGroup();
                                formatAsCurrencyWithSeparators$default = com.paypal.oslo.core.money.MoneyFormattingKt.formatAsCurrencyWithSeparators$default(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.this.getPrice(), null, 1, null);
                            }
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(formatAsCurrencyWithSeparators$default, null, null, null, null, null, false, 0, 0, null, null, composer3, 0, 0, 2046);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, composer, 54);
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(libraryItem);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$BusinessInventoryItemsListScreen$3$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(libraryItem);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(name2, userIntent, null, null, null, false, false, rememberComposableLambda, null, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, false, composer, 12582912, 0, 515964);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RSusCUfoM0uEgYCLw3dU7heBAFU(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryItemsListProduct(itemsListState, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SNqczhkXxs8dUSHEGvDaOaiRRcc(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UNPuyQFg_UzMHdoTXUUeD9u9DNM(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WI2XXHHc3lz68A8N7kKTlxT6L6M(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryItemsListService(itemsListState, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z5aV6RNso6Ca4KYghXdsdiU8zxw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1615124412, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListService.<anonymous> (BusinessInventoryItemsList.kt:197)");
            }
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Box.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.ServicesEmptyView, 0, null, null, 14, null)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.AddNewServiceButton, 0, 2, null)), "item_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.AddNewService), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_service_empty_state_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_service_empty_state_text, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_service_empty_state_add_button, composer, 0), function0, composer, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZntVPuy7qsE6bYanvWaVMqijIt4(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(760701109, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListProduct.<anonymous> (BusinessInventoryItemsList.kt:140)");
            }
            androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.AddNewProductButton, 0, 2, null)), "item_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.AddNewProduct);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_product_empty_state_add_button, composer, 0);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.m13050$r8$lambda$HECEe8x8JxOeZk5VAHCKRDAbIU(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, userIntent, null, null, null, null, false, false, composer, 0, 504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d_AQFL_RHeOwyztmAtv1UV5Z7VI(final com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState itemsListState, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1399649065, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen.<anonymous> (BusinessInventoryItemsList.kt:85)");
            }
            boolean changed = composer.changed(itemsListState);
            boolean changed2 = composer.changed(str);
            boolean changed3 = composer.changed(str2);
            boolean changed4 = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.m13051$r8$lambda$LLliOXivKrsIhbDiRq29mFjaCY(com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState.this, str, str2, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0, 511);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wotCsreAjIwN_1Xdd8RgqxbHjlw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1321850250, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListProduct.<anonymous> (BusinessInventoryItemsList.kt:153)");
            }
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Box.INSTANCE, com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.ProductsEmptyView, 0, null, null, 14, null)), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ItemName.AddNewProductButton, 0, 2, null)), "item_list", com.paypal.oslo.feature.businessinventory.analytics.UserIntentContextValues.Action.AddNewProduct), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_product_empty_state_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_product_empty_state_text, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_add_item_product_empty_state_add_button, composer, 0), function0, composer, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yhCbc3nYK0UtBNfMEKJ75HcaGJo(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1263621768, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen.<anonymous> (BusinessInventoryItemsList.kt:82)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yhqvdjk_vbdtcFY0KAt6HaI-kk4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13053$r8$lambda$yhqvdjk_vbdtcFY0KAt6HaIkk4(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryItemsListProductPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
