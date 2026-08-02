package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001aM\u0010\u0018\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002"}, d2 = {"UpdatePrimaryScreen", "", "phoneId", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/UpdatePrimaryPhoneViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/UpdatePrimaryPhoneViewModel;Landroidx/compose/runtime/Composer;II)V", "UpdatePrimaryScreenContent", "items", "", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "onItemClick", "Lkotlin/Function1;", "onAddNewItemClick", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UpdatePrimaryScreenHeader", "headerTitle", "headerSubtitle", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "UpdatePrimaryScreenList", "icon", "Lcom/paypal/pds/core/Icon;", "addNewItemText", "(Ljava/util/List;Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UpdatePrimaryScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease", "phones", "phoneCategory"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePrimaryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdatePrimaryScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel updatePrimaryPhoneViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel updatePrimaryPhoneViewModel2;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel updatePrimaryPhoneViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1403507179);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    updatePrimaryPhoneViewModel2 = updatePrimaryPhoneViewModel;
                    if (startRestartGroup.changedInstance(updatePrimaryPhoneViewModel2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    updatePrimaryPhoneViewModel2 = updatePrimaryPhoneViewModel;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                updatePrimaryPhoneViewModel2 = updatePrimaryPhoneViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    i4 = 0;
                    updatePrimaryPhoneViewModel3 = updatePrimaryPhoneViewModel2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
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
                        i4 = 0;
                        i5 = i3 & (-7169);
                        updatePrimaryPhoneViewModel3 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = 0;
                        i5 = i3;
                        updatePrimaryPhoneViewModel3 = updatePrimaryPhoneViewModel2;
                    }
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1403507179, i5, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreen (UpdatePrimaryScreen.kt:71)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(updatePrimaryPhoneViewModel3.getFilteredPhones(str), kotlin.collections.CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                final androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(updatePrimaryPhoneViewModel3.getPhoneCategory(str), null, null, startRestartGroup, 48, 2);
                final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, i4);
                boolean changed = startRestartGroup.changed(rememberCommonToastHostState);
                boolean changedInstance = startRestartGroup.changedInstance(context);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1(rememberCommonToastHostState, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, i4);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m20568invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20568invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                int i8 = i5 & 112;
                boolean z = i8 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$2$1(appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m20569invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20569invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                java.util.List list = (java.util.List) collectAsState.getValue();
                boolean z2 = i8 == 32;
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((z2 | changed2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.m20567$r8$lambda$pjjUrd7ltQUl4sx7VNgUygN34(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId2, (com.paypal.oslo.core.userstore.model.ProfilePhone) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue5;
                boolean z3 = i8 == 32;
                boolean changed3 = startRestartGroup.changed(rememberNavResultRequestId);
                boolean changed4 = startRestartGroup.changed(collectAsState2);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((z3 | changed3 | changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$HzcONThE6gwdadd4JJwRIxTX8dc(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, collectAsState2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                UpdatePrimaryScreenContent(list, function1, (kotlin.jvm.functions.Function0) rememberedValue6, null, startRestartGroup, 0, 8);
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.ToastHost(rememberCommonToastHostState, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), startRestartGroup, 0, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                updatePrimaryPhoneViewModel3 = updatePrimaryPhoneViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel updatePrimaryPhoneViewModel4 = updatePrimaryPhoneViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$XISzkkurb346b675z4IL_ed1jxY(str, appNavigator, modifier5, updatePrimaryPhoneViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdatePrimaryScreenContent(final java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.userstore.model.ProfilePhone, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1116509579);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1116509579, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenContent (UpdatePrimaryScreen.kt:129)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_update_primary_phone_header_title, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_update_primary_phone_header_subtitle, startRestartGroup, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_update_primary_phone_add_new_text, startRestartGroup, 0);
                com.paypal.pds.core.Icon.Phone phone = com.paypal.pds.core.Icon.Phone.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), "update_primary_mobile_screen");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                getHighSpeedVideoFpsRangesFor(stringResource, stringResource2, startRestartGroup, 0);
                int i5 = i3 << 6;
                Camera2StreamConfigurationMap(list, phone, stringResource3, function1, function0, startRestartGroup, (i3 & 14) | 48 | (i5 & 7168) | (i5 & 57344));
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.m20565$r8$lambda$LUqFdzhSUNXlL6TS_Ms0jabzdg(list, function1, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-269298739);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-269298739, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenHeader (UpdatePrimaryScreen.kt:161)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "update_primary_title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, (i3 & 14) | 432, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "update_primary_subtitle"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i3 >> 3) & 14) | 432, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.m20566$r8$lambda$ToZYmExBIm5jqB1N03Nw6gQ2Us(str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list, final com.paypal.pds.core.Icon icon, final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.userstore.model.ProfilePhone, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1364180455);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1364180455, i2, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenList (UpdatePrimaryScreen.kt:196)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (i2 & 896) == 256;
            boolean z4 = (i2 & 57344) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | z2 | z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.m20564$r8$lambda$2dl3lDXytBbMrHtNmo9zd6g7U(list, function1, icon, str, function0, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(function12);
                rememberedValue = function12;
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxWidth$default, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 6, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$6UryUtdURUM27a4cEdkSeH5gqKg(list, icon, str, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2dl3lDXytBbM-rHt-Nmo9zd6g7U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20564$r8$lambda$2dl3lDXytBbMrHtNmo9zd6g7U(final java.util.List list, final kotlin.jvm.functions.Function1 function1, final com.paypal.pds.core.Icon icon, final java.lang.String str, final kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreenList$lambda$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039820996, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreenList$lambda$0$0$$inlined$itemsIndexed$default$3
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) list.get(i);
                composer.startReplaceGroup(-1286935681);
                java.lang.String maskedPhoneNumber = profilePhone.getMaskedPhoneNumber();
                float spacing16 = com.paypal.pds.core.ConstantsKt.getSpacing16();
                float spacing162 = com.paypal.pds.core.ConstantsKt.getSpacing16();
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), "phone_number_item_".concat(java.lang.String.valueOf(profilePhone.getId())));
                final com.paypal.pds.core.Icon icon2 = icon;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2081980886, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreenList$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        androidx.compose.runtime.Composer composer3 = composer2;
                        int intValue = num.intValue();
                        if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                            composer3.skipToGroupEnd();
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2081980886, intValue, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePrimaryScreen.kt:206)");
                            }
                            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.this, profilePhone.getMaskedPhoneNumber(), null, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer3, 24576, 12);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, composer, 54);
                boolean changed = composer.changed(function1);
                boolean changedInstance = composer.changedInstance(profilePhone);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreenList$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(profilePhone);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(maskedPhoneNumber, testTag, null, null, null, true, false, null, rememberComposableLambda, null, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.unit.Dp.m8599boximpl(spacing16), androidx.compose.ui.unit.Dp.m8599boximpl(spacing162), null, null, false, composer, 100859904, 0, 466652);
                if (i < list.size() - 1) {
                    composer.startReplaceGroup(-1286266826);
                    com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 0.0f, 14, null), composer, 0, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1286183219);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!list.isEmpty()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt.INSTANCE.getLambda$965876407$user_profile_prodRelease(), 3, null);
        }
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-91135694, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$cr_zpo897INx8site9RRQPMfZLE(str, function0, icon, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6UryUtdURUM27a4cEdkSeH5gqKg(java.util.List list, com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(list, icon, str, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HzcONThE6gwdadd4JJwRIxTX8dc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final androidx.compose.runtime.State state) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Add new number clicked from update primary screen", null, null, 6, null);
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$luIKx4UxZYDgUDQsbOWKDgt8_x4(androidx.compose.runtime.State.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L3ldkJxugME9kwovZBmQZd5z4vA(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-539062392, i, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePrimaryScreen.kt:243)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Plus.INSTANCE, str, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer, 27654, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LUqFdzhSUNXlL6TS_Ms0j-abzdg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20565$r8$lambda$LUqFdzhSUNXlL6TS_Ms0jabzdg(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UpdatePrimaryScreenContent(list, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LoR8s1nmA4wWKoqD_1LyAWakn8k(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1753593575, i, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePrimaryScreen.kt:235)");
            }
            com.paypal.pds.components.IconKt.Icon(icon, str, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27648, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ToZ-YmExBIm5jqB1N03Nw6gQ2Us, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20566$r8$lambda$ToZYmExBIm5jqB1N03Nw6gQ2Us(java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XISzkkurb346b675z4IL_ed1jxY(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel updatePrimaryPhoneViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UpdatePrimaryScreen(str, appNavigator, modifier, updatePrimaryPhoneViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cr_zpo897INx8site9RRQPMfZLE(final java.lang.String str, kotlin.jvm.functions.Function0 function0, final com.paypal.pds.core.Icon icon, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-91135694, i, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenList.<anonymous>.<anonymous>.<anonymous> (UpdatePrimaryScreen.kt:231)");
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), "add_new_number_item"), null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-539062392, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$L3ldkJxugME9kwovZBmQZd5z4vA(str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1753593575, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$LoR8s1nmA4wWKoqD_1LyAWakn8k(com.paypal.pds.core.Icon.this, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), null, null, null, false, function0, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing16()), null, null, false, composer, 113442816, 0, 466524);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e2Itqt4hL3u3PcujnjFsw9A40sA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-291467204);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-291467204, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenPreview (UpdatePrimaryScreen.kt:263)");
            }
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$mvmjfU45Df7LFEBL68CU9QzwtBo((com.paypal.oslo.core.userstore.model.ProfilePhone) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            UpdatePrimaryScreenContent(emptyList, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$e2Itqt4hL3u3PcujnjFsw9A40sA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hfl8Fc0SraFlFWeV_lr105drtUo(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination(profilePhone.getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$luIKx4UxZYDgUDQsbOWKDgt8_x4(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination((java.lang.String) state.getValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mvmjfU45Df7LFEBL68CU9QzwtBo(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pjjU-rd7ltQUl4sx7VNgUygN-34, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20567$r8$lambda$pjjUrd7ltQUl4sx7VNgUygN34(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Update primary phone selected:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", profilePhone.getId())), null, 4, null);
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.$r8$lambda$hfl8Fc0SraFlFWeV_lr105drtUo(com.paypal.oslo.core.userstore.model.ProfilePhone.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
