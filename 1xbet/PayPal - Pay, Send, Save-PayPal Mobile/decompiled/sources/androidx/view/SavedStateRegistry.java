package androidx.view;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002#$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "impl", "<init>", "(Landroidx/savedstate/internal/SavedStateRegistryImpl;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "", "registerSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "getSavedStateProvider", "(Ljava/lang/String;)Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "unregisterSavedStateProvider", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "clazz", "runOnNextRecreation", "(Ljava/lang/Class;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "getHighSpeedVideoSizes", "", "isRestored", "()Z", "Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/Recreator$SavedStateProvider;", "Camera2StreamConfigurationMap", "SavedStateProvider", "AutoRecreated"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.internal.SavedStateRegistryImpl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.savedstate.Recreator.SavedStateProvider Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onRecreated", "(Landroidx/savedstate/SavedStateRegistryOwner;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface AutoRecreated {
        void onRecreated(androidx.view.SavedStateRegistryOwner owner);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "saveState", "()Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface SavedStateProvider {
        android.os.Bundle saveState();
    }

    public SavedStateRegistry(androidx.view.internal.SavedStateRegistryImpl savedStateRegistryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryImpl, "");
        this.getHighSpeedVideoSizes = savedStateRegistryImpl;
    }

    public final boolean isRestored() {
        return this.getHighSpeedVideoSizes.getIsRestored();
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoSizes.consumeRestoredStateForKey(key);
    }

    public final void registerSavedStateProvider(java.lang.String key, androidx.savedstate.SavedStateRegistry.SavedStateProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighSpeedVideoSizes.registerSavedStateProvider(key, provider);
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoSizes.getSavedStateProvider(key);
    }

    public final void unregisterSavedStateProvider(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoSizes.unregisterSavedStateProvider(key);
    }

    public final void runOnNextRecreation(java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "");
        if (!this.getHighSpeedVideoSizes.getIsAllowingSavingState()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        androidx.savedstate.Recreator.SavedStateProvider savedStateProvider = this.Camera2StreamConfigurationMap;
        if (savedStateProvider == null) {
            savedStateProvider = new androidx.savedstate.Recreator.SavedStateProvider(this);
        }
        this.Camera2StreamConfigurationMap = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(new java.lang.Class[0]);
            androidx.savedstate.Recreator.SavedStateProvider savedStateProvider2 = this.Camera2StreamConfigurationMap;
            if (savedStateProvider2 != null) {
                java.lang.String name2 = clazz.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                savedStateProvider2.add(name2);
            }
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
            sb.append(clazz.getSimpleName());
            sb.append(" must have default constructor in order to be automatically recreated");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }
}
