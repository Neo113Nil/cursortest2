package com.paypal.oslo.feature.oneonboarding.inventory.views.address.di;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0017¢\u0006\u0002\u0010\u0012JY\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001dX\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/StepAddressSelectionComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentAttacher;", "<init>", "()V", "AttachBottomSheet", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "selectedIndex", "", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "onIndexChange", "Lkotlin/Function1;", "onAddNewClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;Lcom/paypal/pds/components/BottomSheetController;ILcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AttachComponentContent", "onEditClick", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "errorMessage", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease", "formattedAddresses", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepAddressSelectionComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher();

    private StepAddressSelectionComponentAttacher() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher
    public final void AttachBottomSheet(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        composer.startReplaceGroup(-527281694);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-527281694, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher.AttachBottomSheet (AddressSelectionComponentAttacher.kt:73)");
        }
        if (addressSelectionComponentConfig == null) {
            composer.startReplaceGroup(-1553247594);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1553247593);
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
            java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Address> prefilledValue = addressSelectionComponentConfig.getPrefilledValue();
            if (prefilledValue == null) {
                prefilledValue = kotlin.collections.CollectionsKt.emptyList();
            }
            int i3 = i2 >> 3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.AddressSelectionBottomSheet(bottomSheetController, (java.util.List) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addressSelectionViewModel.formatAddresses(prefilledValue, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE), kotlin.collections.CollectionsKt.emptyList(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer, 48, 14).getValue(), i, function1, function0, intentId, composer, com.paypal.pds.components.BottomSheetController.$stable | (i3 & 14) | (i2 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 6) & 458752));
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher
    public final void AttachComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, final int i, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-408542303);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(addressSelectionComponentConfig) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-408542303, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher.AttachComponentContent (AddressSelectionComponentAttacher.kt:100)");
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionComponentContentKt.AddressSelectionComponentContent(addressSelectionComponentConfig, i, function1, function0, bottomSheetController, modifier, str, (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel) null, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 12) | (i3 & 8190) | (57344 & i3) | ((i3 >> 3) & 458752) | ((i3 << 3) & 3670016), 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher.$r8$lambda$tzypBwnomeyQsAVk767bnSRbjV0(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher.this, addressSelectionComponentConfig, i, function1, function0, bottomSheetController, str, modifier, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tzypBwnomeyQsAVk767bnSRbjV0(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.StepAddressSelectionComponentAttacher stepAddressSelectionComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, androidx.compose.ui.Modifier modifier, int i2, androidx.compose.runtime.Composer composer, int i3) {
        stepAddressSelectionComponentAttacher.AttachComponentContent(addressSelectionComponentConfig, i, function1, function0, bottomSheetController, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
