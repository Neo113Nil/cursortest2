package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\f²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"ActivityDetailAppBarCompose", "", "transaction", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "activityTransactionDetailViewModel", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;II)V", "onBackPressEvent", "getTransactionDisplayStatus", "", "uiState", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailAppBarComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityDetailAppBarCompose(final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel3;
        int i4;
        com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState;
        java.lang.String transactionShortDescription;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data queryResult;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionDto, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1715962682);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(activityTransactionDto) : startRestartGroup.changedInstance(activityTransactionDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
                if (startRestartGroup.changedInstance(activityTransactionDetailViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                int i7 = i6 & (-113);
                activityTransactionDetailViewModel3 = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i7;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1715962682, i4, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarCompose (ActivityDetailAppBarCompose.kt:55)");
                }
                activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(activityTransactionDetailViewModel3.getActivityDetailUIState$activity_prodRelease(), null, startRestartGroup, 0, 1).getValue();
                if (!(activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success)) {
                    com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult result2 = ((com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) activityUiState).getResult();
                    com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = result2 != null ? result2.getData() : null;
                    com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult activityTransactionDetailResult = data instanceof com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult ? (com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult) data : null;
                    if (activityTransactionDetailResult == null || (queryResult = activityTransactionDetailResult.getQueryResult()) == null || (result = queryResult.getResult()) == null || (transactionShortDescription = result.getShortDescription()) == null) {
                        transactionShortDescription = activityTransactionDto.getTransactionShortDescription();
                    }
                } else {
                    transactionShortDescription = activityTransactionDto.getTransactionShortDescription();
                }
                changedInstance = startRestartGroup.changedInstance(activityTransactionDetailViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.m11823$r8$lambda$UY7fUNbpR1Kqwx6zctX_0QJs0A(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), 0.0f, 1, null), null, false, 3, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.m11824$r8$lambda$v869MfyZdaYXCiwscrWilRzBHI(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel4 = activityTransactionDetailViewModel3;
                com.paypal.pds.components.IconKt.Icon(arrowLeft, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_back, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 31), com.paypal.pds.core.ConstantsKt.getSize20()), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 24582, 8);
                java.lang.String str = transactionShortDescription;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing28(), com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel4;
            }
            i4 = i6;
            activityTransactionDetailViewModel3 = activityTransactionDetailViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(activityTransactionDetailViewModel3.getActivityDetailUIState$activity_prodRelease(), null, startRestartGroup, 0, 1).getValue();
            if (!(activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success)) {
            }
            changedInstance = startRestartGroup.changedInstance(activityTransactionDetailViewModel3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.m11823$r8$lambda$UY7fUNbpR1Kqwx6zctX_0QJs0A(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier wrapContentSize$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.core.Icon.ArrowLeft arrowLeft2 = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.m11824$r8$lambda$v869MfyZdaYXCiwscrWilRzBHI(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel42 = activityTransactionDetailViewModel3;
            com.paypal.pds.components.IconKt.Icon(arrowLeft2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_filter_back, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 31), com.paypal.pds.core.ConstantsKt.getSize20()), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 24582, 8);
            java.lang.String str2 = transactionShortDescription;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing28(), com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            activityTransactionDetailViewModel2 = activityTransactionDetailViewModel42;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.$r8$lambda$L1xRKUQkKIwnJOEzyPPIVApxKY0(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto.this, activityTransactionDetailViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions navResultOptions;
        com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig$activity_prodRelease;
        com.paypal.oslo.core.navigation.AppNavigator navigator;
        kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> needsLedgerRefresh$activity_prodRelease;
        if (activityTransactionDetailViewModel != null && (needsLedgerRefresh$activity_prodRelease = activityTransactionDetailViewModel.getNeedsLedgerRefresh$activity_prodRelease()) != null && needsLedgerRefresh$activity_prodRelease.getValue().booleanValue()) {
            navResultOptions = new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions(-1, true);
        } else {
            navResultOptions = new com.paypal.oslo.feature.activity.api.navigation.result.options.NavResultOptions(0, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        final com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult activityNavResult = new com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult(new com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult.ActivityDetailResult(navResultOptions, null, 2, null));
        if (activityTransactionDetailViewModel == null || (activityComposeConfig$activity_prodRelease = activityTransactionDetailViewModel.getActivityComposeConfig$activity_prodRelease()) == null || (navigator = activityComposeConfig$activity_prodRelease.getNavigator()) == null) {
            return;
        }
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAppBarComposeKt.$r8$lambda$YOghqwn2SbF64yy4fMj9bJ62okM(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L1xRKUQkKIwnJOEzyPPIVApxKY0(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetailAppBarCompose(activityTransactionDto, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UY7fUNbp-R1Kqwx6zctX_0QJs0A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11823$r8$lambda$UY7fUNbpR1Kqwx6zctX_0QJs0A(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        getHighSpeedVideoSizes(activityTransactionDetailViewModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YOghqwn2SbF64yy4fMj9bJ62okM(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult activityNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(activityNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v869MfyZdaYXCi-wscrWilRzBHI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11824$r8$lambda$v869MfyZdaYXCiwscrWilRzBHI(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        getHighSpeedVideoSizes(activityTransactionDetailViewModel);
        return kotlin.Unit.INSTANCE;
    }
}
