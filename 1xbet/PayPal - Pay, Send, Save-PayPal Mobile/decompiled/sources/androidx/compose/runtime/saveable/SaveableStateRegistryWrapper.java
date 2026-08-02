package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00160\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryWrapper;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/savedstate/SavedStateRegistryOwner;", "base", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "p0", "Landroidx/savedstate/SavedStateRegistryController;", "getHighSpeedVideoSizes", "(Landroid/os/Bundle;)Landroidx/savedstate/SavedStateRegistryController;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "canBeSaved", "(Ljava/lang/Object;)Z", "", "key", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "performSave", "()Ljava/util/Map;", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/LifecycleRegistry;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/savedstate/SavedStateRegistryController;", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SaveableStateRegistryWrapper implements androidx.compose.runtime.saveable.SaveableStateRegistry, androidx.view.SavedStateRegistryOwner {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.view.LifecycleRegistry Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.view.SavedStateRegistryController getHighSpeedVideoSizes;
    private final /* synthetic */ androidx.compose.runtime.saveable.SaveableStateRegistry getHighSpeedVideoSizes;

    public SaveableStateRegistryWrapper(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry) {
        this.getHighSpeedVideoSizes = saveableStateRegistry;
        java.lang.Object consumeRestored = consumeRestored("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = consumeRestored instanceof android.os.Bundle ? (android.os.Bundle) consumeRestored : null;
        if (bundle != null) {
            getHighSpeedVideoSizes(bundle);
        }
        registerProvider("androidx.savedstate.SavedStateRegistry", new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryWrapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.runtime.saveable.SaveableStateRegistryWrapper.m5468$r8$lambda$O8tBndJpAog_Q_MBg2Az0d6OvY(androidx.compose.runtime.saveable.SaveableStateRegistryWrapper.this);
            }
        });
    }

    private final androidx.view.SavedStateRegistryController getHighSpeedVideoSizes(android.os.Bundle p0) {
        androidx.view.SavedStateRegistryController savedStateRegistryController = this.getHighSpeedVideoSizes;
        if (savedStateRegistryController != null) {
            return savedStateRegistryController;
        }
        androidx.view.SavedStateRegistryController create = androidx.view.SavedStateRegistryController.INSTANCE.create(this);
        this.getHighSpeedVideoSizes = create;
        create.performRestore(p0);
        return create;
    }

    /* renamed from: $r8$lambda$O8tBndJ-pAog_Q_MBg2Az0d6OvY, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m5468$r8$lambda$O8tBndJpAog_Q_MBg2Az0d6OvY(androidx.compose.runtime.saveable.SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        kotlin.Pair[] pairArr;
        androidx.view.SavedStateRegistryController savedStateRegistryController = saveableStateRegistryWrapper.getHighSpeedVideoSizes;
        if (savedStateRegistryController == null) {
            return null;
        }
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        savedStateRegistryController.performSave(bundleOf);
        if (androidx.view.SavedStateReader.m9374isEmptyimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundleOf))) {
            return null;
        }
        return bundleOf;
    }

    @Override // androidx.view.LifecycleOwner
    public final androidx.view.LifecycleRegistry getLifecycle() {
        androidx.view.LifecycleRegistry lifecycleRegistry = this.Camera2StreamConfigurationMap;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        androidx.view.LifecycleRegistry createUnsafe = androidx.view.LifecycleRegistry.INSTANCE.createUnsafe(this);
        this.Camera2StreamConfigurationMap = createUnsafe;
        return createUnsafe;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public final androidx.view.SavedStateRegistry getSavedStateRegistry() {
        return getHighSpeedVideoSizes(null).getSavedStateRegistry();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(java.lang.String key, kotlin.jvm.functions.Function0<? extends java.lang.Object> valueProvider) {
        return this.getHighSpeedVideoSizes.registerProvider(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        return this.getHighSpeedVideoSizes.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.lang.Object consumeRestored(java.lang.String key) {
        return this.getHighSpeedVideoSizes.consumeRestored(key);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(java.lang.Object value) {
        return this.getHighSpeedVideoSizes.canBeSaved(value);
    }
}
