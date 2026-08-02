package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;", "rememberSetupFlowCoordinator", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator;", "", "clearSetupFlowCoordinatorViewModelStore", "()V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupFlowCoordinatorViewModelStoreKt {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator rememberSetupFlowCoordinator(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1873019069, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.flow.rememberSetupFlowCoordinator (SetupFlowCoordinatorViewModelStore.kt:78)");
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(971126044, 0, -1, "com.paypal.oslo.feature.taptopay.ui.setup.flow.rememberSetupFlowCoordinatorViewModelStoreOwner (SetupFlowCoordinatorViewModelStore.kt:59)");
        }
        java.lang.Object current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("SetupFlowCoordinator requires a ViewModelStoreOwner in the composition.".toString());
        }
        if (!(current instanceof androidx.view.HasDefaultViewModelProviderFactory)) {
            java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(current.getClass()).getGetHighResolutionOutputSizeshNQ4ISI();
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(current.getClass()).getSimpleName();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupFlowCoordinator requires a ViewModelStoreOwner that implements HasDefaultViewModelProviderFactory. Found owner of type ");
            sb.append(getHighResolutionOutputSizeshNQ4ISI);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry.INSTANCE.getHighSpeedVideoSizes();
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.view.ViewModelStore viewModelStore = (androidx.view.ViewModelStore) rememberedValue;
        boolean changed = composer.changed(current);
        boolean changed2 = composer.changed(viewModelStore);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreOwner(viewModelStore, (androidx.view.HasDefaultViewModelProviderFactory) current);
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreOwner setupFlowCoordinatorViewModelStoreOwner = (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreOwner) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreOwner setupFlowCoordinatorViewModelStoreOwner2 = setupFlowCoordinatorViewModelStoreOwner;
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(setupFlowCoordinatorViewModelStoreOwner2, composer, 0);
        if (setupFlowCoordinatorViewModelStoreOwner2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = setupFlowCoordinatorViewModelStoreOwner2.getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.class), setupFlowCoordinatorViewModelStoreOwner2, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return setupFlowCoordinator;
    }

    public static final void clearSetupFlowCoordinatorViewModelStore() {
        synchronized (com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry.INSTANCE) {
            androidx.view.ViewModelStore viewModelStore = com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry.getHighResolutionOutputSizeshNQ4ISI;
            if (viewModelStore != null) {
                viewModelStore.clear();
            }
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }
}
