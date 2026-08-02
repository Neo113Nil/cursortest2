package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ai\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0085\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"BusinessInventoryScreenLoadingTestTag", "", "BusinessInventoryItemsListScreen", "", "onClickAddProduct", "Lkotlin/Function0;", "onClickEditProduct", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "onClickAddService", "onClickEditService", "onNavigateBack", "viewModel", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListViewModel;Landroidx/compose/runtime/Composer;II)V", "businessInventoryItemsListState", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListState;", "onEvent", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BusinessInventoryListSuccessLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "BusinessInventoryListSuccessEmptyPreview", "BusinessInventoryListSuccessServicesEmptyPreview", "BusinessInventoryListSuccessEmptyWithErrorPreview", "BusinessInventoryListPreview", "business-inventory_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryItemsListScreenKt {
    public static final java.lang.String BusinessInventoryScreenLoadingTestTag = "BusinessInventoryListScreen_ListLoader";

    public static final void BusinessInventoryItemsListScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel4;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel5;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-527886871);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                businessInventoryItemsListViewModel2 = businessInventoryItemsListViewModel;
                if (startRestartGroup.changedInstance(businessInventoryItemsListViewModel2)) {
                    i4 = 131072;
                    i3 |= i4;
                }
            } else {
                businessInventoryItemsListViewModel2 = businessInventoryItemsListViewModel;
            }
            i4 = 65536;
            i3 |= i4;
        } else {
            businessInventoryItemsListViewModel2 = businessInventoryItemsListViewModel;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 32) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    businessInventoryItemsListViewModel4 = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 &= -458753;
                    businessInventoryItemsListViewModel5 = businessInventoryItemsListViewModel4;
                }
                businessInventoryItemsListViewModel5 = businessInventoryItemsListViewModel2;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 32) != 0) {
                    businessInventoryItemsListViewModel4 = businessInventoryItemsListViewModel2;
                    i5 &= -458753;
                    businessInventoryItemsListViewModel5 = businessInventoryItemsListViewModel4;
                }
                businessInventoryItemsListViewModel5 = businessInventoryItemsListViewModel2;
            }
            int i6 = i5;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-527886871, i6, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen (BusinessInventoryItemsListScreen.kt:51)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = (com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(businessInventoryItemsListViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            boolean changedInstance = startRestartGroup.changedInstance(businessInventoryItemsListViewModel5);
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$BusinessInventoryItemsListScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$BusinessInventoryItemsListScreen$1$1(businessInventoryItemsListViewModel5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i7 = i6 << 6;
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel6 = businessInventoryItemsListViewModel5;
            composer2 = startRestartGroup;
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function03, function0, function1, function02, function12, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, ((i6 >> 9) & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            businessInventoryItemsListViewModel3 = businessInventoryItemsListViewModel6;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            businessInventoryItemsListViewModel3 = businessInventoryItemsListViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$B8UZo6PwUBLu72NcvFsGGXBsXbI(kotlin.jvm.functions.Function0.this, function1, function02, function12, function03, businessInventoryItemsListViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BusinessInventoryItemsListScreen(final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent, kotlin.Unit> function13, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        boolean z;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1040728600);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(businessInventoryItemsListState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1040728600, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen (BusinessInventoryItemsListScreen.kt:75)");
                }
                int i5 = i3;
                modifier2 = modifier3;
                androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, statusBarsPadding);
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
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_item_list_title, startRestartGroup, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1824868770, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$4A52UR3pHhxrFwpukWEDPTGLV4w(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                if (businessInventoryItemsListState.getItemDelete() != null) {
                    startRestartGroup.startReplaceGroup(-489903555);
                    int i6 = com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.WhenMappings.$EnumSwitchMapping$0[businessInventoryItemsListState.getItemDelete().getType().ordinal()];
                    if (i6 == 1) {
                        startRestartGroup.startReplaceGroup(1646767995);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_product_deleted, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 2) {
                            startRestartGroup.startReplaceGroup(1646765058);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(1646772763);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_service_deleted, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8());
                    boolean z2 = (i5 & 3670016) == 1048576;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13057$r8$lambda$CpmqEeFEP7KW5tINbIf65PDOgw(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    obj = null;
                    com.paypal.pds.components.ToastKt.Toast(stringResource, m1706padding3ABfNKs, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    obj = null;
                    startRestartGroup.startReplaceGroup(-489147248);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, obj);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (businessInventoryItemsListState.getError() != null) {
                    startRestartGroup.startReplaceGroup(-1461857405);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_error_loading, startRestartGroup, 0);
                    com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                    com.paypal.pds.components.BannerTrailingElement bannerTrailingElement = com.paypal.pds.components.BannerTrailingElement.Close;
                    com.paypal.pds.components.BannerStyle.Negative negative2 = negative;
                    boolean z3 = (i5 & 3670016) == 1048576;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13067$r8$lambda$t8UaPyS0W0vRFcs7yh1O0uEJvk(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    z = true;
                    com.paypal.pds.components.BannerKt.Banner(m1706padding3ABfNKs2, negative2, stringResource2, (java.lang.String) null, bannerTrailingElement, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue2, startRestartGroup, 24624, 40);
                    startRestartGroup.endReplaceGroup();
                } else {
                    z = true;
                    startRestartGroup.startReplaceGroup(-1461471610);
                    startRestartGroup.endReplaceGroup();
                }
                java.util.List<com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem> segmentedControlItems = businessInventoryItemsListState.getSegmentedControlItems();
                com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem selectedSegmentedControlItem = businessInventoryItemsListState.getSelectedSegmentedControlItem();
                boolean z4 = (i5 & 3670016) == 1048576 ? z : false;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$MR72URZKiqd4iv1fdsbwgkJMXaI(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlKt.BusinessInventorySegmentedControl(segmentedControlItems, selectedSegmentedControlItem, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                if (businessInventoryItemsListState.getSelectedSegmentedControlItem() == com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS) {
                    startRestartGroup.startReplaceGroup(-1460921980);
                    com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.BusinessInventoryItemsListProduct(businessInventoryItemsListState.getProducts(), function02, function1, startRestartGroup, (i5 >> 3) & 1008);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1460660092);
                    com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListKt.BusinessInventoryItemsListService(businessInventoryItemsListState.getServices(), function03, function12, startRestartGroup, (i5 >> 9) & 1008);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13069$r8$lambda$zhvZvDlrwVJODKm3XJzsj3fsFU(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.this, function0, function02, function1, function03, function12, function13, modifier4, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BusinessInventoryListSuccessLoadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(278587448);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(278587448, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryListSuccessLoadingPreview (BusinessInventoryItemsListScreen.kt:148)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]{com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES}), com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), true), new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), true), null, null, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda38
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13064$r8$lambda$dHu8S5jHPDeEhp9JIr1QLEjPzg((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$paGAIolUHGTa47J6THeic4l6wVI((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13066$r8$lambda$qXiEtyG_AT7WiLkIJxmM6wjk((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$4EDRrG5Use2om9HasEUBpzo0v3s(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryListSuccessEmptyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1871366649);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1871366649, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryListSuccessEmptyPreview (BusinessInventoryItemsListScreen.kt:173)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]{com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES}), com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), null, null, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda19
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$h2kC77PkQbOsQ8LyAuRunyf4tXo((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$avbz3Z5ozPbhRCZq9iXLD8hBftE((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$BOnM0Ln3AZjtCYSUihUvReyFNKQ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$Q1mQtBmHJ0vceY7DcuYfSDOOXco(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryListSuccessServicesEmptyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(484567301);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(484567301, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryListSuccessServicesEmptyPreview (BusinessInventoryItemsListScreen.kt:198)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]{com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES}), com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), null, null, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda27
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13068$r8$lambda$wEzkiQaoysYE2iwyoamxjJP6Y8((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$08INkXauacGMkjGvgkKVeBnHFtM((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$nbChlAYRTR51oKp_fMK_gtCkp24((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$6prtfZFthCbJyVTRcNYgmnIXHC8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryListSuccessEmptyWithErrorPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1378464305);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1378464305, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryListSuccessEmptyWithErrorPreview (BusinessInventoryItemsListScreen.kt:223)");
            }
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]{com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES}), com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), com.paypal.oslo.feature.businessinventory.ui.itemslist.Error.LOAD_ITEMS_FAILED, null, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13060$r8$lambda$IAj4aqztu8DPPkP1UOWYZstcl0((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$Jk_VSQOCF8DWc0Wb5H7VM2UipDI((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13063$r8$lambda$XDvvL5Om7I_C3f3sPgvBvCunEc((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$dHRztcs2w4c_WijHjaVrsHZG0bc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BusinessInventoryListPreview(androidx.compose.runtime.Composer composer, final int i) {
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1523885553);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1523885553, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryListPreview (BusinessInventoryItemsListScreen.kt:248)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]{com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES});
            com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem = com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS;
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            for (int i2 = 0; i2 < 10; i2++) {
                java.lang.String concat = "Item number ".concat(java.lang.String.valueOf(i2));
                com.paypal.oslo.core.money.Money money = new com.paypal.oslo.core.money.Money(i2, "USD");
                if (i2 % 2 == 0) {
                    libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT;
                } else {
                    libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE;
                }
                createListBuilder.add(new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem((java.lang.String) null, concat, money, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) null, libraryItemType, i2 % 3 == 0 ? "Description ".concat(java.lang.String.valueOf(i2)) : null, 9, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState(listOf, inventoryLibraryItemTypeBusinessInventorySegmentedControlItem, new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.build(createListBuilder), false), new com.paypal.oslo.feature.businessinventory.ui.itemslist.ItemsListState(kotlin.collections.CollectionsKt.emptyList(), false), null, null, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$rYAZOyV20qMlwEZAovZFjzMLO9s((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13055$r8$lambda$95Vktg47M26DnmUXJl006NO0uc((com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.m13058$r8$lambda$GnIsQUQYTPGYIKWPSUlA_HUuMM((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, (kotlin.jvm.functions.Function1) rememberedValue6, null, startRestartGroup, 1797552, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreenKt.$r8$lambda$03fMyS45Fyf5ySOfq6FJOaw6I7I(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$03fMyS45Fyf5ySOfq6FJOaw6I7I(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryListPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$08INkXauacGMkjGvgkKVeBnHFtM(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4A52UR3pHhxrFwpukWEDPTGLV4w(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1824868770, i, -1, "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListScreen.<anonymous>.<anonymous> (BusinessInventoryItemsListScreen.kt:84)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4EDRrG5Use2om9HasEUBpzo0v3s(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryListSuccessLoadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6prtfZFthCbJyVTRcNYgmnIXHC8(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryListSuccessServicesEmptyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$95Vktg47M26DnmUXJl-006NO0uc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13055$r8$lambda$95Vktg47M26DnmUXJl006NO0uc(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B8UZo6PwUBLu72NcvFsGGXBsXbI(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BusinessInventoryItemsListScreen(function0, function1, function02, function12, function03, businessInventoryItemsListViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BOnM0Ln3AZjtCYSUihUvReyFNKQ(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CpmqE-eFEP7KW5tINbIf65PDOgw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13057$r8$lambda$CpmqEeFEP7KW5tINbIf65PDOgw(kotlin.jvm.functions.Function1 function1, boolean z) {
        if (!z) {
            function1.invoke(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissToast.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GnIsQUQYTPGYIKWPSUlA_HUuM-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13058$r8$lambda$GnIsQUQYTPGYIKWPSUlA_HUuMM(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IAj4aqztu8DPPkP1UOWYZs-tcl0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13060$r8$lambda$IAj4aqztu8DPPkP1UOWYZstcl0(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jk_VSQOCF8DWc0Wb5H7VM2UipDI(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MR72URZKiqd4iv1fdsbwgkJMXaI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inventoryLibraryItemTypeBusinessInventorySegmentedControlItem, "");
        function1.invoke(new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked(inventoryLibraryItemTypeBusinessInventorySegmentedControlItem));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q1mQtBmHJ0vceY7DcuYfSDOOXco(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryListSuccessEmptyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XDvvL5Om7I_C3f3sPgvBvCun-Ec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13063$r8$lambda$XDvvL5Om7I_C3f3sPgvBvCunEc(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$avbz3Z5ozPbhRCZq9iXLD8hBftE(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$d-Hu8S5jHPDeEhp9JIr1QLEjPzg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13064$r8$lambda$dHu8S5jHPDeEhp9JIr1QLEjPzg(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dHRztcs2w4c_WijHjaVrsHZG0bc(int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessInventoryListSuccessEmptyWithErrorPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h2kC77PkQbOsQ8LyAuRunyf4tXo(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nbChlAYRTR51oKp_fMK_gtCkp24(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$paGAIolUHGTa47J6THeic4l6wVI(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qXi-EtyG_AT-7WiLkIJxmM6-wjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13066$r8$lambda$qXiEtyG_AT7WiLkIJxmM6wjk(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rYAZOyV20qMlwEZAovZFjzMLO9s(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t8UaPyS0W0vRF-cs7yh1O0uEJvk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13067$r8$lambda$t8UaPyS0W0vRFcs7yh1O0uEJvk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wEzkiQaoysYE2iwyoamxjJ-P6Y8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13068$r8$lambda$wEzkiQaoysYE2iwyoamxjJP6Y8(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zhvZvDlrwVJODKm3XJzs-j3fsFU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13069$r8$lambda$zhvZvDlrwVJODKm3XJzsj3fsFU(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState businessInventoryItemsListState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BusinessInventoryItemsListScreen(businessInventoryItemsListState, function0, function02, function1, function03, function12, function13, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
