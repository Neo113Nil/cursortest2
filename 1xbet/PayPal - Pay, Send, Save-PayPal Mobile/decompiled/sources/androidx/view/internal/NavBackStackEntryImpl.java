package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010/8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0014R\"\u00107\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001a\u0010:\u001a\u0002098\u0001X\u0081\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020E8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010L\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010'R\u0014\u0010P\u001a\u00020M8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\u00020Q8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR*\u0010W\u001a\u00020(2\u0006\u0010V\u001a\u00020(8\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bW\u0010*\u001a\u0004\bX\u0010,\"\u0004\bY\u0010.R\u0014\u0010]\u001a\u00020Z8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010_\u001a\u00020^8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020^8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bk\u0010G\u001a\u0004\bl\u0010b"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl;", "", "Landroidx/navigation/NavBackStackEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "handleLifecycleEvent$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$Event;)V", "updateState$navigation_common_release", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "outBundle", "saveState$navigation_common_release", "(Landroid/os/Bundle;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation/NavBackStackEntry;", "getEntry", "()Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/internal/NavContext;", "getContext$navigation_common_release", "()Landroidx/navigation/internal/NavContext;", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/navigation/NavDestination;", "getDestination$navigation_common_release", "()Landroidx/navigation/NavDestination;", "setDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "immutableArgs", "Landroid/os/Bundle;", "getImmutableArgs$navigation_common_release", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_common_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_common_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "getViewModelStoreProvider$navigation_common_release", "()Landroidx/navigation/NavViewModelStoreProvider;", "id", "Ljava/lang/String;", "getId$navigation_common_release", "savedState", "getSavedState$navigation_common_release", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistryController;", "", "savedStateRegistryAttached", "Z", "getSavedStateRegistryAttached$navigation_common_release", "()Z", "setSavedStateRegistryAttached$navigation_common_release", "(Z)V", "Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "getDefaultFactory$navigation_common_release", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory", "getArguments$navigation_common_release", "arguments", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle$navigation_common_release", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/LifecycleRegistry;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle$navigation_common_release", "()Landroidx/lifecycle/LifecycleRegistry;", "maxState", "maxLifecycle", "getMaxLifecycle$navigation_common_release", "setMaxLifecycle$navigation_common_release", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore$navigation_common_release", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory$navigation_common_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "getDefaultViewModelCreationExtras$navigation_common_release", "()Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry$navigation_common_release", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "SavedStateViewModel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackEntryImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final androidx.view.internal.NavContext context;

    /* renamed from: defaultFactory$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy defaultFactory;
    private final androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory;
    private androidx.view.NavDestination destination;
    private final androidx.view.NavBackStackEntry entry;
    private androidx.lifecycle.Lifecycle.State hostLifecycleState;
    private final java.lang.String id;
    private final android.os.Bundle immutableArgs;
    private final androidx.view.LifecycleRegistry lifecycle;
    private androidx.lifecycle.Lifecycle.State maxLifecycle;
    private final android.os.Bundle savedState;
    private boolean savedStateRegistryAttached;
    private final androidx.view.SavedStateRegistryController savedStateRegistryController;
    private final androidx.view.NavViewModelStoreProvider viewModelStoreProvider;

    public NavBackStackEntryImpl(androidx.view.NavBackStackEntry navBackStackEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.entry = navBackStackEntry;
        this.context = navBackStackEntry.getContext();
        this.destination = navBackStackEntry.getDestination();
        this.immutableArgs = navBackStackEntry.getImmutableArgs();
        this.hostLifecycleState = navBackStackEntry.getHostLifecycleState();
        this.viewModelStoreProvider = navBackStackEntry.getViewModelStoreProvider();
        this.id = navBackStackEntry.getId();
        this.savedState = navBackStackEntry.getSavedState();
        this.savedStateRegistryController = androidx.view.SavedStateRegistryController.INSTANCE.create(navBackStackEntry);
        this.defaultFactory = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.internal.NavBackStackEntryImpl.$r8$lambda$zWANLNGBP_RNzZUgO7FkZLbA3eI();
            }
        });
        this.lifecycle = new androidx.view.LifecycleRegistry(navBackStackEntry);
        this.maxLifecycle = androidx.lifecycle.Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory$navigation_common_release();
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.internal.NavBackStackEntryImpl.$r8$lambda$b_QZKXGCYSSdxfIzDMN01hKaDXg();
            }
        });
    }

    public final androidx.view.NavBackStackEntry getEntry() {
        return this.entry;
    }

    /* renamed from: getContext$navigation_common_release, reason: from getter */
    public final androidx.view.internal.NavContext getContext() {
        return this.context;
    }

    /* renamed from: getDestination$navigation_common_release, reason: from getter */
    public final androidx.view.NavDestination getDestination() {
        return this.destination;
    }

    public final void setDestination$navigation_common_release(androidx.view.NavDestination navDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        this.destination = navDestination;
    }

    /* renamed from: getImmutableArgs$navigation_common_release, reason: from getter */
    public final android.os.Bundle getImmutableArgs() {
        return this.immutableArgs;
    }

    /* renamed from: getHostLifecycleState$navigation_common_release, reason: from getter */
    public final androidx.lifecycle.Lifecycle.State getHostLifecycleState() {
        return this.hostLifecycleState;
    }

    public final void setHostLifecycleState$navigation_common_release(androidx.lifecycle.Lifecycle.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.hostLifecycleState = state;
    }

    /* renamed from: getViewModelStoreProvider$navigation_common_release, reason: from getter */
    public final androidx.view.NavViewModelStoreProvider getViewModelStoreProvider() {
        return this.viewModelStoreProvider;
    }

    /* renamed from: getId$navigation_common_release, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: getSavedState$navigation_common_release, reason: from getter */
    public final android.os.Bundle getSavedState() {
        return this.savedState;
    }

    /* renamed from: getSavedStateRegistryController$navigation_common_release, reason: from getter */
    public final androidx.view.SavedStateRegistryController getSavedStateRegistryController() {
        return this.savedStateRegistryController;
    }

    /* renamed from: getSavedStateRegistryAttached$navigation_common_release, reason: from getter */
    public final boolean getSavedStateRegistryAttached() {
        return this.savedStateRegistryAttached;
    }

    public final void setSavedStateRegistryAttached$navigation_common_release(boolean z) {
        this.savedStateRegistryAttached = z;
    }

    public final androidx.view.SavedStateViewModelFactory getDefaultFactory$navigation_common_release() {
        return (androidx.view.SavedStateViewModelFactory) this.defaultFactory.getValue();
    }

    public final android.os.Bundle getArguments$navigation_common_release() {
        kotlin.Pair[] pairArr;
        if (this.immutableArgs == null) {
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
        androidx.view.SavedStateWriter.m9386putAllimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf), this.immutableArgs);
        return bundleOf;
    }

    public final androidx.view.SavedStateHandle getSavedStateHandle$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.lifecycle.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        return ((androidx.navigation.internal.NavBackStackEntryImpl.SavedStateViewModel) androidx.view.ViewModelProvider.Companion.create$default(androidx.view.ViewModelProvider.INSTANCE, this.entry, getHighSpeedVideoFpsRangesFor(), (androidx.view.viewmodel.CreationExtras) null, 4, (java.lang.Object) null).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.navigation.internal.NavBackStackEntryImpl.SavedStateViewModel.class))).getCamera2StreamConfigurationMap();
    }

    /* renamed from: getLifecycle$navigation_common_release, reason: from getter */
    public final androidx.view.LifecycleRegistry getLifecycle() {
        return this.lifecycle;
    }

    /* renamed from: getMaxLifecycle$navigation_common_release, reason: from getter */
    public final androidx.lifecycle.Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final void setMaxLifecycle$navigation_common_release(androidx.lifecycle.Lifecycle.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.maxLifecycle = state;
        updateState$navigation_common_release();
    }

    public final void handleLifecycleEvent$navigation_common_release(androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.hostLifecycleState = event.getTargetState();
        updateState$navigation_common_release();
    }

    public final void updateState$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                androidx.view.SavedStateHandleSupport.enableSavedStateHandles(this.entry);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this.lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    public final androidx.view.ViewModelStore getViewModelStore$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.lifecycle.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        androidx.view.NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider == null) {
            throw new java.lang.IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        return navViewModelStoreProvider.getViewModelStore(this.id);
    }

    /* renamed from: getDefaultViewModelProviderFactory$navigation_common_release, reason: from getter */
    public final androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    public final androidx.view.viewmodel.MutableCreationExtras getDefaultViewModelCreationExtras$navigation_common_release() {
        androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras(null, 1, null);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.entry);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this.entry);
        android.os.Bundle arguments$navigation_common_release = getArguments$navigation_common_release();
        if (arguments$navigation_common_release != null) {
            mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments$navigation_common_release);
        }
        return mutableCreationExtras;
    }

    public final androidx.view.SavedStateRegistry getSavedStateRegistry$navigation_common_release() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void saveState$navigation_common_release(android.os.Bundle outBundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outBundle, "");
        this.savedStateRegistryController.performSave(outBundle);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(this.entry.getClass()).getSimpleName());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
        sb2.append(this.id);
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(" destination=");
        sb.append(this.destination);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private final androidx.lifecycle.ViewModelProvider.Factory getHighSpeedVideoFpsRangesFor() {
        return (androidx.lifecycle.ViewModelProvider.Factory) this.getHighSpeedVideoFpsRanges.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryImpl$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/lifecycle/SavedStateHandle;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SavedStateViewModel extends androidx.view.ViewModel {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.view.SavedStateHandle Camera2StreamConfigurationMap;

        public SavedStateViewModel(androidx.view.SavedStateHandle savedStateHandle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
            this.Camera2StreamConfigurationMap = savedStateHandle;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.view.SavedStateHandle getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static /* synthetic */ androidx.navigation.internal.NavBackStackEntryImpl.SavedStateViewModel $r8$lambda$NVRTV8ELcjEm7WewHJxpuoH8YJA(androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        return new androidx.navigation.internal.NavBackStackEntryImpl.SavedStateViewModel(androidx.view.SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    public static /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory $r8$lambda$b_QZKXGCYSSdxfIzDMN01hKaDXg() {
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.navigation.internal.NavBackStackEntryImpl.SavedStateViewModel.class), new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.internal.NavBackStackEntryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.internal.NavBackStackEntryImpl.$r8$lambda$NVRTV8ELcjEm7WewHJxpuoH8YJA((androidx.view.viewmodel.CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static /* synthetic */ androidx.view.SavedStateViewModelFactory $r8$lambda$zWANLNGBP_RNzZUgO7FkZLbA3eI() {
        return new androidx.view.SavedStateViewModelFactory();
    }
}
