package com.paypal.oslo.feature.bnplacquisition.ui.address;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"AddressBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "formattedAddressOverviewItems", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "onAddressUpdate", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "onAddressLayoutFail", "Lkotlin/Function0;", "initialScreen", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen;", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen;Landroidx/compose/runtime/Composer;II)V", "bnpl-acquisition_prodRelease", "currentScreen"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1300901773);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            addressBottomSheetScreen2 = addressBottomSheetScreen;
            i3 |= startRestartGroup.changed(addressBottomSheetScreen2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen3 = i5 != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview.INSTANCE : addressBottomSheetScreen2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1300901773, i4, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheet (AddressBottomSheet.kt:60)");
                }
                final com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview.INSTANCE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                boolean visible = bottomSheetController.getVisible();
                boolean z = (57344 & i4) == 16384;
                com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$AddressBottomSheet$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$AddressBottomSheet$1$1(addressBottomSheetScreen3, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), addressBottomSheetScreen3, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i4 >> 9) & 112);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetTestTag.MODAL);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen4 = addressBottomSheetScreen3;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, null, null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1000732882, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt.$r8$lambda$QctNaA291k5i99nHUdgGHbfv8MU(com.paypal.pds.components.BottomSheetController.this, list, function1, rememberDropdownState, function0, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i4 & 14), 510);
                startRestartGroup.endNode();
                composer2 = startRestartGroup;
                com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, composer2, com.paypal.pds.components.DropdownState.$stable);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                addressBottomSheetScreen2 = addressBottomSheetScreen4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt.$r8$lambda$7psWVyIOyr94a5TIkXmIQqc7bqM(com.paypal.pds.components.BottomSheetController.this, list, function1, function0, addressBottomSheetScreen2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        addressBottomSheetScreen2 = addressBottomSheetScreen;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7psWVyIOyr94a5TIkXmIQqc7bqM(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddressBottomSheet(bottomSheetController, list, function1, function0, addressBottomSheetScreen, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MBLTu47-M1k9kqMfcyXiOWktBW0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12298$r8$lambda$MBLTu47M1k9kqMfcyXiOWktBW0(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$QctNaA291k5i99nHUdgGHbfv8MU(final com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1000732882, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheet.<anonymous>.<anonymous> (AddressBottomSheet.kt:81)");
            }
            if (bottomSheetController.getVisible()) {
                composer.startReplaceGroup(1465457279);
                com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen addressBottomSheetScreen = (com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen) mutableState.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(addressBottomSheetScreen, com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview.INSTANCE)) {
                    composer.startReplaceGroup(1465530873);
                    boolean changedInstance = composer.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt.m12298$r8$lambda$MBLTu47M1k9kqMfcyXiOWktBW0(com.paypal.pds.components.BottomSheetController.this);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt.m12299$r8$lambda$Xo7OhjjwoanyKEu4wUJtaMN6Z0(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewScreenKt.AddressOverviewScreen(list, function02, (kotlin.jvm.functions.Function0) rememberedValue2, function1, null, null, composer, 384, 48);
                    composer.endReplaceGroup();
                } else {
                    if (!(addressBottomSheetScreen instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit)) {
                        composer.startReplaceGroup(-368369181);
                        composer.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1466171023);
                    com.paypal.oslo.core.i18n.domain.model.Address prefillAddress = ((com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit) addressBottomSheetScreen).getPrefillAddress();
                    boolean changedInstance2 = composer.changedInstance(bottomSheetController);
                    java.lang.Object rememberedValue3 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetKt.$r8$lambda$ZkA39Kha2Jr1bSVkHUEk5v1iQ4Y(com.paypal.pds.components.BottomSheetController.this);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddScreenKt.AddressAddScreen(dropdownState, (kotlin.jvm.functions.Function0) rememberedValue3, function0, function1, prefillAddress, null, null, composer, com.paypal.pds.components.DropdownState.$stable, 96);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1466594576);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xo-7OhjjwoanyKEu4wUJtaMN6Z0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12299$r8$lambda$Xo7OhjjwoanyKEu4wUJtaMN6Z0(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(new com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit(null, 1, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZkA39Kha2Jr1bSVkHUEk5v1iQ4Y(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }
}
