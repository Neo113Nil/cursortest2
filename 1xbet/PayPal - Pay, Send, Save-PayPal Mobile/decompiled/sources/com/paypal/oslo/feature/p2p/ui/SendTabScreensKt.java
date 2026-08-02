package com.paypal.oslo.feature.p2p.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"SendTabContent", "", "currentDestination", "Landroidx/navigation3/runtime/NavKey;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/viewmodel/SendTabViewModel;", "transferViewModel", "Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;", "amountScreenComponentsOverride", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "tabs", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/p2p/ui/viewmodel/SendTabViewModel;Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "SelectTabContent", "destination", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/p2p/ui/viewmodel/SendTabViewModel;Lcom/paypal/oslo/feature/p2p/ui/transfer/viewmodels/TransferViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/runtime/Composer;II)V", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SendTabScreensKt {
    public static final void SendTabContent(final androidx.navigation3.runtime.NavKey navKey, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel2;
        final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel2;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents2;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents3;
        final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list3;
        com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel3;
        int i3;
        int i4;
        com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel4;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list4;
        final com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel5;
        final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        boolean z;
        int i5;
        boolean z2;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents5;
        com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel3;
        com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel6;
        java.lang.String label;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1396088215);
        int i7 = (i & 6) == 0 ? (startRestartGroup.changedInstance(navKey) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sendTabViewModel2 = sendTabViewModel;
                if (startRestartGroup.changedInstance(sendTabViewModel2)) {
                    i6 = 256;
                    i7 |= i6;
                }
            } else {
                sendTabViewModel2 = sendTabViewModel;
            }
            i6 = 128;
            i7 |= i6;
        } else {
            sendTabViewModel2 = sendTabViewModel;
        }
        if ((i & 3072) == 0) {
            transferViewModel2 = transferViewModel;
            i7 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(transferViewModel2)) ? 2048 : 1024;
        } else {
            transferViewModel2 = transferViewModel;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i7 |= 24576;
            amountScreenComponents2 = amountScreenComponents;
        } else {
            amountScreenComponents2 = amountScreenComponents;
            if ((i & 24576) == 0) {
                i7 |= startRestartGroup.changedInstance(amountScreenComponents2) ? 16384 : 8192;
            }
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            list2 = list;
            i7 |= ((i2 & 32) == 0 && startRestartGroup.changedInstance(list2)) ? 131072 : 65536;
        } else {
            list2 = list;
        }
        int i9 = i7;
        if (startRestartGroup.shouldExecute((74899 & i9) != 74898, i9 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
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
                    i3 = 0;
                    sendTabViewModel4 = (com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i4 = i9 & (-897);
                } else {
                    i3 = 0;
                    i4 = i9;
                    sendTabViewModel4 = sendTabViewModel2;
                }
                if ((i2 & 8) != 0) {
                    androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, i3);
                    if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    transferViewModel2 = (com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i9 = i4 & (-7169);
                } else {
                    i9 = i4;
                }
                com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents6 = i8 != 0 ? null : amountScreenComponents;
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                    sendTabViewModel5 = sendTabViewModel4;
                    amountScreenComponents4 = amountScreenComponents6;
                    list4 = com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.INSTANCE.getTabs();
                } else {
                    list4 = list;
                    sendTabViewModel5 = sendTabViewModel4;
                    amountScreenComponents4 = amountScreenComponents6;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i9 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i9 &= -7169;
                }
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                }
                sendTabViewModel5 = sendTabViewModel2;
                list4 = list2;
                amountScreenComponents4 = amountScreenComponents2;
            }
            int i10 = i9;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1396088215, i10, -1, "com.paypal.oslo.feature.p2p.ui.SendTabContent (SendTabScreens.kt:65)");
            }
            boolean isQrcFlowEnabled = sendTabViewModel5.isQrcFlowEnabled();
            startRestartGroup.startReplaceGroup(1610994964);
            java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> list5 = list4;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
            for (com.paypal.oslo.core.navigation.ui.l1.TabDestination tabDestination : list5) {
                androidx.navigation3.runtime.NavKey destination = tabDestination.getDestination();
                if (kotlin.jvm.internal.Intrinsics.areEqual(destination, com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1881458544);
                    label = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_transfer_tab_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(destination, com.paypal.oslo.feature.p2p.api.navigation.SendOtherDestination.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(1881461484);
                    label = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_more_tab_title, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1881463870);
                    startRestartGroup.endReplaceGroup();
                    label = tabDestination.getLabel();
                }
                arrayList.add(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(tabDestination.getDestination(), label, null, 4, null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.p2p.analytics.P2pTransferAnalytics.getUserIntent$default(com.paypal.oslo.feature.p2p.analytics.P2pTransferAnalytics.INSTANCE, null, 1, null)));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (arrayList2.size() > 1) {
                startRestartGroup.startReplaceGroup(670738849);
                boxScopeInstance = boxScopeInstance2;
                z2 = false;
                z = true;
                i5 = i10;
                com.paypal.oslo.core.navigation.ui.l1.L1ContentKt.TabbedL1Content(navKey, appNavigator, arrayList2, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1630064958, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$d697y7cMxqi3IfvC3LyjexmWiZA(com.paypal.oslo.core.navigation.AppNavigator.this, sendTabViewModel5, transferViewModel2, amountScreenComponents4, (androidx.navigation3.runtime.NavKey) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i10 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i10 & 112), 24);
                startRestartGroup.endReplaceGroup();
            } else {
                boxScopeInstance = boxScopeInstance2;
                z = true;
                i5 = i10;
                z2 = false;
                startRestartGroup.startReplaceGroup(671077431);
                SelectTabContent(navKey, appNavigator, sendTabViewModel5, transferViewModel2, amountScreenComponents4, startRestartGroup, i5 & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (isQrcFlowEnabled) {
                startRestartGroup.startReplaceGroup(671437093);
                com.paypal.pds.core.Icon.QrCode qrCode = com.paypal.pds.core.Icon.QrCode.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopEnd()), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 11, null);
                com.paypal.pds.core.Icon.QrCode qrCode2 = qrCode;
                boolean z3 = (i5 & 112) == 32 ? z : z2;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$pPU0qrokvgg2KS4yjeEQwbYycJI(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonSize.Small small2 = small;
                amountScreenComponents5 = amountScreenComponents4;
                transferViewModel3 = transferViewModel2;
                sendTabViewModel6 = sendTabViewModel5;
                composer2 = startRestartGroup;
                com.paypal.pds.components.IconButtonKt.IconButton(qrCode2, (kotlin.jvm.functions.Function0) rememberedValue, m1710paddingqDBjuR0$default, primary, small2, "Scan QR Code", null, false, false, composer2, 224262, 448);
                composer2.endReplaceGroup();
            } else {
                amountScreenComponents5 = amountScreenComponents4;
                transferViewModel3 = transferViewModel2;
                sendTabViewModel6 = sendTabViewModel5;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(671827569);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            transferViewModel2 = transferViewModel3;
            sendTabViewModel3 = sendTabViewModel6;
            amountScreenComponents3 = amountScreenComponents5;
            list3 = list4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            amountScreenComponents3 = amountScreenComponents;
            list3 = list;
            sendTabViewModel3 = sendTabViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel7 = sendTabViewModel3;
            final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel4 = transferViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$iTObqC53wHz_CW2FU2DDgZSv5mU(androidx.navigation3.runtime.NavKey.this, appNavigator, sendTabViewModel7, transferViewModel4, amountScreenComponents3, list3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectTabContent(final androidx.navigation3.runtime.NavKey navKey, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendTabViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(807338545);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navKey) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(sendTabViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(transferViewModel) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            amountScreenComponents2 = amountScreenComponents;
            i3 |= startRestartGroup.changedInstance(amountScreenComponents2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                amountScreenComponents3 = amountScreenComponents2;
            } else {
                amountScreenComponents3 = i5 != 0 ? null : amountScreenComponents2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(807338545, i4, -1, "com.paypal.oslo.feature.p2p.ui.SelectTabContent (SendTabScreens.kt:128)");
                }
                final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(transferViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$1$1(transferViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$SelectTabContent$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m17230invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m17230invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                if (kotlin.jvm.internal.Intrinsics.areEqual(navKey, com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1536708737);
                    int i6 = i4 & 112;
                    boolean z = i6 == 32;
                    boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.m17228$r8$lambda$ZgDHXIVoPVVOUOyrq3mUxXvSus(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    boolean z2 = i6 == 32;
                    boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z2 | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.m17226$r8$lambda$VILn9VA3U50GElQ_p2Lu0cs5U(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    boolean changedInstance2 = startRestartGroup.changedInstance(sendTabViewModel);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$Ig2qnlUqYwYm3XuPW8A99Vr_zig(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel.this, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
                    boolean changedInstance3 = startRestartGroup.changedInstance(transferViewModel);
                    boolean z3 = i6 == 32;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$H8b_iR1td8TkRhntbJRjFXKe0yk(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel.this, appNavigator, (com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue6;
                    boolean z4 = i6 == 32;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$8oXNM38iK1sCOq187QOsM1rLIFg(com.paypal.oslo.core.navigation.AppNavigator.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.TransferScreen(null, transferViewModel, false, null, false, false, function1, function12, null, function13, function14, amountScreenComponents3, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, (i4 >> 6) & 112, (i4 >> 9) & 112, 317);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1536629366);
                    com.paypal.oslo.feature.p2p.ui.PlaceholderTabContentKt.PlaceholderTab("Unknown", composer2, 6);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents4 = amountScreenComponents3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.m17225$r8$lambda$J4PzwwLaCLSYkCGfM_wJrYQnU(androidx.navigation3.runtime.NavKey.this, appNavigator, sendTabViewModel, transferViewModel, amountScreenComponents4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        amountScreenComponents2 = amountScreenComponents;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5Eh90XIpq6yuATItwwRVgowkwdU(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination(str, com.paypal.oslo.feature.p2p.ui.utils.TransferFlowSessionIdGenerator.INSTANCE.generate(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, (java.lang.String) null, false, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8oXNM38iK1sCOq187QOsM1rLIFg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.m17229$r8$lambda$hx5vMl1vgHFMOU3xNkur5qDqB0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H8b_iR1td8TkRhntbJRjFXKe0yk(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyPickerDestination, "");
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState value = transferViewModel.getUiState().getValue();
        final com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success = value instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success ? (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) value : null;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$hKEGvHX7ib7SbnOMl3FOPsU6IwQ(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination.this, success, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ig2qnlUqYwYm3XuPW8A99Vr_zig(com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        sendTabViewModel.trackAmountChange(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J4Pz-wwLaC-LSYkCGfM_wJrYQnU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17225$r8$lambda$J4PzwwLaCLSYkCGfM_wJrYQnU(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectTabContent(navKey, appNavigator, sendTabViewModel, transferViewModel, amountScreenComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VILn9VA3U50GElQ_p2Lu0--cs5U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17226$r8$lambda$VILn9VA3U50GElQ_p2Lu0cs5U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$5Eh90XIpq6yuATItwwRVgowkwdU(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X-XxIkX1La7RfFpvxFPDuHjPU_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17227$r8$lambda$XXxIkX1La7RfFpvxFPDuHjPU_A(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.p2p.api.navigation.ReviewDestination(str, com.paypal.oslo.feature.p2p.ui.utils.TransferFlowSessionIdGenerator.INSTANCE.generate(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, (java.lang.String) null, false, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZNDANHtUuzKmjSn1DkJVMi4iLJA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.qrc.api.navigation.QrcPayFlowDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZgDHXI-VoPVVOUOyrq3mUxXvSus, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17228$r8$lambda$ZgDHXIVoPVVOUOyrq3mUxXvSus(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.navigation.result.ReviewScreenNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.m17227$r8$lambda$XXxIkX1La7RfFpvxFPDuHjPU_A(str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d697y7cMxqi3IfvC3LyjexmWiZA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.navigation3.runtime.NavKey navKey, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1630064958, i, -1, "com.paypal.oslo.feature.p2p.ui.SendTabContent.<anonymous>.<anonymous> (SendTabScreens.kt:85)");
        }
        SelectTabContent(navKey, appNavigator, sendTabViewModel, transferViewModel, amountScreenComponents, composer, i & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hKEGvHX7ib7SbnOMl3FOPsU6IwQ(com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List<java.lang.String> emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String transferAttemptId = currencyPickerDestination.getTransferAttemptId();
        if (success == null || (str = success.getAmount()) == null) {
            str = "0";
        }
        java.lang.String str3 = str;
        if (success == null || (str2 = success.getSendCurrencyCode()) == null) {
            str2 = "USD";
        }
        java.lang.String str4 = str2;
        if (success == null || (emptyList = success.getSupportedIntents()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        navigationScope.push(new com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination(transferAttemptId, str3, str4, (java.util.List) emptyList, false, (java.lang.String) null, false, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hx5vMl1vgHFMOU-3xNkur5qDqB0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17229$r8$lambda$hx5vMl1vgHFMOU3xNkur5qDqB0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iTObqC53wHz_CW2FU2DDgZSv5mU(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.p2p.ui.viewmodel.SendTabViewModel sendTabViewModel, com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SendTabContent(navKey, appNavigator, sendTabViewModel, transferViewModel, amountScreenComponents, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pPU0qrokvgg2KS4yjeEQwbYycJI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.SendTabScreensKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.SendTabScreensKt.$r8$lambda$ZNDANHtUuzKmjSn1DkJVMi4iLJA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
