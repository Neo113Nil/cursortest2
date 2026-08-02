package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/savedstate/SavedStateRegistryController;", "getHighSpeedVideoSizes", "Landroidx/savedstate/SavedStateRegistryController;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "getLifecycle", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeViewAdapter$FakeSavedStateRegistryOwner$1 implements androidx.view.SavedStateRegistryOwner {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.SavedStateRegistryController getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.view.LifecycleRegistry lifecycleRegistry;

    ComposeViewAdapter$FakeSavedStateRegistryOwner$1() {
        androidx.view.LifecycleRegistry createUnsafe = androidx.view.LifecycleRegistry.INSTANCE.createUnsafe(this);
        this.lifecycleRegistry = createUnsafe;
        androidx.view.SavedStateRegistryController create = androidx.view.SavedStateRegistryController.INSTANCE.create(this);
        create.performRestore(new android.os.Bundle());
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        createUnsafe.setCurrentState(androidx.lifecycle.Lifecycle.State.RESUMED);
    }

    public final androidx.view.LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public final androidx.view.SavedStateRegistry getSavedStateRegistry() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSavedStateRegistry();
    }

    @Override // androidx.view.LifecycleOwner
    /* renamed from: getLifecycle, reason: from getter */
    public final androidx.view.LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }
}
