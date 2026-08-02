package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001aM\u0010\u0010\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001a\u001a)\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 ¨\u0006!²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames.ADDRESS_OVERVIEW_SCREEN, "", "formattedAddressOverviewItems", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "onDismiss", "Lkotlin/Function0;", "onNavigateToAddAddress", "onAddressUpdate", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewViewModel;", "sharedViewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewViewModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/shared/BnplAcquisitionSharedViewModel;Landroidx/compose/runtime/Composer;II)V", "AddressOverviewEffect", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiEffect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/Flow;Landroidx/compose/runtime/Composer;I)V", "AddressOverviewContent", "state", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiState;", "onEvent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddressOverviewSuccessContent", "uiModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AddressOverviewScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewScreenKt {
    public static final void AddressOverviewScreen(final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel2;
        com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel3;
        final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel3;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(137925933);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
            if ((i2 & 16) == 0) {
                addressOverviewViewModel2 = addressOverviewViewModel;
                if (startRestartGroup.changedInstance(addressOverviewViewModel2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                addressOverviewViewModel2 = addressOverviewViewModel;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            addressOverviewViewModel2 = addressOverviewViewModel;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
                if (startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            bnplAcquisitionSharedViewModel2 = bnplAcquisitionSharedViewModel;
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    androidx.view.viewmodel.CreationExtras creationExtras = empty2;
                    i4 = 0;
                    addressOverviewViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, creationExtras, startRestartGroup, 0, 0);
                    i3 &= -57345;
                } else {
                    i4 = 0;
                }
                if ((i2 & 32) != 0) {
                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, i4);
                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    bnplAcquisitionSharedViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i3 &= -458753;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel4 = addressOverviewViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(137925933, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreen (AddressOverviewScreen.kt:80)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addressOverviewViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bnplAcquisitionSharedViewModel2);
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$1$1(bnplAcquisitionSharedViewModel2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(addressOverviewViewModel4);
            boolean changedInstance3 = startRestartGroup.changedInstance(list);
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$2$1(addressOverviewViewModel4, list, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel4 = bnplAcquisitionSharedViewModel2;
            composer2 = startRestartGroup;
            getHighSpeedVideoFpsRanges(function0, function02, function1, addressOverviewViewModel4.getUiEffect(), startRestartGroup, (i3 >> 3) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState addressOverviewUiState = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance4 = composer2.changedInstance(addressOverviewViewModel4);
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$3$1 rememberedValue3 = composer2.rememberedValue();
            if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewScreen$3$1(addressOverviewViewModel4);
                composer2.updateRememberedValue(rememberedValue3);
            }
            getHighSpeedVideoFpsRangesFor(addressOverviewUiState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit>) ((kotlin.reflect.KFunction) rememberedValue3), composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel4;
            addressOverviewViewModel3 = addressOverviewViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            addressOverviewViewModel3 = addressOverviewViewModel2;
            bnplAcquisitionSharedViewModel3 = bnplAcquisitionSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.m12304$r8$lambda$B_zf6B7Rxj57jhlgom3tscfWHk(list, function0, function02, function1, addressOverviewViewModel3, bnplAcquisitionSharedViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> flow, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1764698287);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(flow) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1764698287, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEffect (AddressOverviewScreen.kt:117)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(flow);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 896) == 256;
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewEffect$1$1(flow, function0, function02, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.m12305$r8$lambda$hp84GN1NxkgxEeQENdGV5rvdg(kotlin.jvm.functions.Function0.this, function02, function1, flow, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState addressOverviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1014377477);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(addressOverviewUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1014377477, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContent (AddressOverviewScreen.kt:141)");
            }
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
            if (addressOverviewUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading) {
                startRestartGroup.startReplaceGroup(440313172);
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.LoaderContentKt.LoaderContent(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(addressOverviewUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success)) {
                    startRestartGroup.startReplaceGroup(-678534770);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(440413984);
                getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success) addressOverviewUiState).getUiModel(), function1, startRestartGroup, i3 & 112);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.m12306$r8$lambda$zzgApXbxmQOZGlaGS0pjEYyQwQ(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-42878328);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(addressOverviewUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-42878328, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewSuccessContent (AddressOverviewScreen.kt:168)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.constraintlayout.compose.Measurer2(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.constraintlayout.compose.Measurer2 measurer2 = (androidx.constraintlayout.compose.Measurer2) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.constraintlayout.compose.ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = (androidx.constraintlayout.compose.ConstraintLayoutScope) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new androidx.constraintlayout.compose.ConstraintSetForInlineDsl(constraintLayoutScope);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.constraintlayout.compose.ConstraintSetForInlineDsl constraintSetForInlineDsl = (androidx.constraintlayout.compose.ConstraintSetForInlineDsl) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue5;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2);
            boolean changed = startRestartGroup.changed(257);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final int i3 = 257;
                rememberedValue6 = (androidx.compose.ui.layout.MeasurePolicy) new androidx.compose.ui.layout.MeasurePolicy() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        androidx.compose.runtime.MutableState.this.getValue();
                        long m8985performMeasureDjhGOtQ = measurer2.m8985performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i3);
                        mutableState.getValue();
                        int m8772getWidthimpl = androidx.compose.ui.unit.IntSize.m8772getWidthimpl(m8985performMeasureDjhGOtQ);
                        int m8771getHeightimpl = androidx.compose.ui.unit.IntSize.m8771getHeightimpl(m8985performMeasureDjhGOtQ);
                        final androidx.constraintlayout.compose.Measurer2 measurer22 = measurer2;
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8772getWidthimpl, m8771getHeightimpl, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                androidx.constraintlayout.compose.Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$3
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.runtime.MutableState.this.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
            boolean changedInstance2 = startRestartGroup.changedInstance(measurer2);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$4
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.constraintlayout.compose.ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, androidx.constraintlayout.compose.Measurer2.this);
                    }

                    {
                        super(1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (kotlin.jvm.functions.Function1) rememberedValue8, 1, null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1200550679, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$$inlined$ConstraintLayout$5
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    com.paypal.pds.components.SelectionCardModel create;
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        androidx.compose.runtime.MutableState.this.setValue(kotlin.Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(928347935);
                        androidx.constraintlayout.compose.ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                        androidx.constraintlayout.compose.ConstrainedLayoutReference component1 = createRefs.component1();
                        androidx.constraintlayout.compose.ConstrainedLayoutReference component2 = createRefs.component2();
                        androidx.constraintlayout.compose.ConstrainedLayoutReference component3 = createRefs.component3();
                        androidx.constraintlayout.compose.ConstrainedLayoutReference createRef = constraintLayoutScope2.createRef();
                        androidx.constraintlayout.compose.ConstrainedLayoutReference createRef2 = constraintLayoutScope2.createRef();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$1$1.getHighResolutionOutputSizeshNQ4ISI;
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        androidx.compose.ui.Modifier statusBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(constraintLayoutScope2.constrainAs(companion, component1, (kotlin.jvm.functions.Function1) rememberedValue9), com.paypal.pds.core.ConstantsKt.getSpacing16()));
                        java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(addressOverviewUiModel.getToolBarContent().getBackButtonLabel(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(addressOverviewUiModel.getToolBarContent().getCloseButtonLabel(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        boolean changed2 = composer2.changed(function1);
                        java.lang.Object rememberedValue10 = composer2.rememberedValue();
                        if (changed2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$2$1(function1);
                            composer2.updateRememberedValue(rememberedValue10);
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, statusBarsPadding, null, null, (kotlin.jvm.functions.Function0) rememberedValue10, false, composer2, 0, 88);
                        java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(addressOverviewUiModel.getTitle(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed3 = composer2.changed(component1);
                        java.lang.Object rememberedValue11 = composer2.rememberedValue();
                        if (changed3 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$3$1(component1);
                            composer2.updateRememberedValue(rememberedValue11);
                        }
                        com.paypal.pds.components.HeaderKt.Header(value3, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(constraintLayoutScope2.constrainAs(companion2, component2, (kotlin.jvm.functions.Function1) rememberedValue11), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing12()), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed4 = composer2.changed(component2);
                        boolean changed5 = composer2.changed(createRef);
                        java.lang.Object rememberedValue12 = composer2.rememberedValue();
                        if ((changed4 | changed5) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$4$1(component2, createRef);
                            composer2.updateRememberedValue(rememberedValue12);
                        }
                        androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(constraintLayoutScope2.constrainAs(companion3, component3, (kotlin.jvm.functions.Function1) rememberedValue12), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 0.0f, 13, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        boolean changed6 = composer2.changed(addressOverviewUiModel.getAddresses());
                        java.lang.Object rememberedValue13 = composer2.rememberedValue();
                        if (changed6 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                            for (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel : addressOverviewUiModel.getAddresses()) {
                                create = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(addressItemUiModel.getId(), (r18 & 2) != 0 ? null : addressItemUiModel.getStreetAddress(), (r18 & 4) != 0 ? null : addressItemUiModel.getCityStateZip(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : null), (r18 & 16) != 0 ? false : addressItemUiModel.isSelected(), (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                                createListBuilder.add(create);
                            }
                            rememberedValue13 = kotlin.collections.CollectionsKt.build(createListBuilder);
                            composer2.updateRememberedValue(rememberedValue13);
                        }
                        java.util.List list = (java.util.List) rememberedValue13;
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null);
                        com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
                        boolean changed7 = composer2.changed(function1);
                        java.lang.Object rememberedValue14 = composer2.rememberedValue();
                        if (changed7 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$5$1$1(function1);
                            composer2.updateRememberedValue(rememberedValue14);
                        }
                        com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, list, (kotlin.jvm.functions.Function2) rememberedValue14, m1710paddingqDBjuR0$default, null, false, null, composer2, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable, 112);
                        composer2.endNode();
                        androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed8 = composer2.changed(createRef2);
                        java.lang.Object rememberedValue15 = composer2.rememberedValue();
                        if (changed8 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue15 = (kotlin.jvm.functions.Function1) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$6$1(createRef2);
                            composer2.updateRememberedValue(rememberedValue15);
                        }
                        androidx.compose.ui.Modifier constrainAs = constraintLayoutScope2.constrainAs(companion4, createRef, (kotlin.jvm.functions.Function1) rememberedValue15);
                        boolean changed9 = composer2.changed(function1);
                        java.lang.Object rememberedValue16 = composer2.rememberedValue();
                        if (changed9 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue16 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$7$1(function1);
                            composer2.updateRememberedValue(rememberedValue16);
                        }
                        androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(constrainAs, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue16, composer2, 0, 31), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing12());
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1709paddingqDBjuR0);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer2, 27702, 4);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(addressOverviewUiModel.getAddNewAddressButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()), false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, 196992, 6, 970);
                        composer2.endNode();
                        java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(addressOverviewUiModel.getDoneButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.INSTANCE;
                        java.lang.Object rememberedValue17 = composer2.rememberedValue();
                        if (rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue17 = (kotlin.jvm.functions.Function1) com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$9$1.getHighSpeedVideoFpsRangesFor;
                            composer2.updateRememberedValue(rememberedValue17);
                        }
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion5, createRef2, (kotlin.jvm.functions.Function1) rememberedValue17), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                        boolean changed10 = composer2.changed(function1);
                        java.lang.Object rememberedValue18 = composer2.rememberedValue();
                        if (changed10 || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue18 = (kotlin.jvm.functions.Function0) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$AddressOverviewSuccessContent$1$10$1(function1);
                            composer2.updateRememberedValue(rememberedValue18);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue18, value4, m1707paddingVpY3zN4, null, null, primary, large, false, false, composer2, 1769472, 408);
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            androidx.compose.runtime.EffectsKt.SideEffect(function0, composer2, 6);
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }, startRestartGroup, 54), measurePolicy, startRestartGroup, 48, 0);
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.$r8$lambda$ZlmF_1RfMgYDCik6EPpsvqoHHE8(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-2QDGfSucjyJe042_-cllzF71wg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12303$r8$lambda$2QDGfSucjyJe042_cllzF71wg(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent addressOverviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B_zf6B7Rxj57jhl-gom3tscfWHk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12304$r8$lambda$B_zf6B7Rxj57jhlgom3tscfWHk(java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressOverviewScreen(list, function0, function02, function1, addressOverviewViewModel, bnplAcquisitionSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LytLvWiFO9FMV2riKVey7lKAWdI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1806227685);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1806227685, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenPreview (AddressOverviewScreen.kt:303)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider addressOverviewContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewContentProvider();
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success success = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success(new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel[]{new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel("1", "200 N Clark St", "Chicago, IL 60601", true, new com.paypal.oslo.core.i18n.domain.model.Address(null, null, null, null, null, null, null, null, null, null, 1023, null)), new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "208 Copperhead Road", "Hartford, CT 95108", false, new com.paypal.oslo.core.i18n.domain.model.Address(null, null, null, null, null, null, null, null, null, null, 1023, null))}), "1", addressOverviewContentProvider.getTitle(), addressOverviewContentProvider.getAddNewAddressButtonText(), addressOverviewContentProvider.getDoneButtonText(), addressOverviewContentProvider.getToolBarContent()));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.m12303$r8$lambda$2QDGfSucjyJe042_cllzF71wg((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRangesFor(success, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit>) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.$r8$lambda$LytLvWiFO9FMV2riKVey7lKAWdI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZlmF_1RfMgYDCik6EPpsvqoHHE8(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(addressOverviewUiModel, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hp84-GN1NxkgxEeQENdGV5-rvdg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12305$r8$lambda$hp84GN1NxkgxEeQENdGV5rvdg(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.flow.Flow flow, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function0, function02, function1, flow, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z-zgApXbxmQOZGlaGS0pjEYyQwQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12306$r8$lambda$zzgApXbxmQOZGlaGS0pjEYyQwQ(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState addressOverviewUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(addressOverviewUiState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
