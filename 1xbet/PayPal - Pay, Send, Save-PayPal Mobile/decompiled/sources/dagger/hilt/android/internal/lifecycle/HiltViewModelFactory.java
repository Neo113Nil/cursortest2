package dagger.hilt.android.internal.lifecycle;

/* loaded from: classes17.dex */
public final class HiltViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<kotlin.jvm.functions.Function1<java.lang.Object, androidx.view.ViewModel>> CREATION_CALLBACK_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<kotlin.jvm.functions.Function1<java.lang.Object, androidx.view.ViewModel>>() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final androidx.lifecycle.ViewModelProvider.Factory Camera2StreamConfigurationMap;
    private final androidx.lifecycle.ViewModelProvider.Factory getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<java.lang.Class<?>, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    interface ActivityCreatorEntryPoint {
        dagger.hilt.android.internal.builders.ViewModelComponentBuilder Camera2StreamConfigurationMap();

        java.util.Map<java.lang.Class<?>, java.lang.Boolean> getHighSpeedVideoFpsRanges();
    }

    public interface ViewModelFactoriesEntryPoint {
        java.util.Map<java.lang.Class<?>, java.lang.Object> getHiltViewModelAssistedMap();

        java.util.Map<java.lang.Class<?>, javax.inject.Provider<androidx.view.ViewModel>> getHiltViewModelMap();
    }

    @dagger.Module
    interface ViewModelModule {
        @dagger.multibindings.Multibinds
        java.util.Map<java.lang.Class<?>, androidx.view.ViewModel> getHighResolutionOutputSizeshNQ4ISI();

        @dagger.multibindings.Multibinds
        java.util.Map<java.lang.Class<?>, java.lang.Object> getHighSpeedVideoFpsRangesFor();
    }

    public HiltViewModelFactory(java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, androidx.lifecycle.ViewModelProvider.Factory factory, final dagger.hilt.android.internal.builders.ViewModelComponentBuilder viewModelComponentBuilder) {
        this.getHighSpeedVideoFpsRangesFor = map;
        this.Camera2StreamConfigurationMap = factory;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls, androidx.view.viewmodel.CreationExtras creationExtras) {
                T t;
                final dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl retainedLifecycleImpl = new dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl();
                dagger.hilt.android.components.ViewModelComponent build = viewModelComponentBuilder.savedStateHandle(androidx.view.SavedStateHandleSupport.createSavedStateHandle(creationExtras)).viewModelLifecycle(retainedLifecycleImpl).build();
                javax.inject.Provider<androidx.view.ViewModel> provider = ((dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint) dagger.hilt.EntryPoints.get(build, dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls);
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) creationExtras.get(dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.CREATION_CALLBACK_KEY);
                java.lang.Object obj = ((dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint) dagger.hilt.EntryPoints.get(build, dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls);
                if (obj == null) {
                    if (function1 != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Found creation callback but class ");
                        sb.append(cls.getName());
                        sb.append(" does not have an assisted factory specified in @HiltViewModel.");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    if (provider == null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected the @HiltViewModel-annotated class ");
                        sb2.append(cls.getName());
                        sb2.append(" to be available in the multi-binding of @HiltViewModelMap but none was found.");
                        throw new java.lang.IllegalStateException(sb2.toString());
                    }
                    t = (T) provider.get();
                } else {
                    if (provider != null) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Found the @HiltViewModel-annotated class ");
                        sb3.append(cls.getName());
                        sb3.append(" in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                        throw new java.lang.AssertionError(sb3.toString());
                    }
                    if (function1 == null) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Found @HiltViewModel-annotated class ");
                        sb4.append(cls.getName());
                        sb4.append(" using @AssistedInject but no creation callback was provided in CreationExtras.");
                        throw new java.lang.IllegalStateException(sb4.toString());
                    }
                    t = (T) function1.invoke(obj);
                }
                t.addCloseable(new java.io.Closeable() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$2$$ExternalSyntheticLambda0
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl.this.dispatchOnCleared();
                    }
                });
                return t;
            }
        };
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls, androidx.view.viewmodel.CreationExtras creationExtras) {
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(cls)) {
            return (T) this.getHighResolutionOutputSizeshNQ4ISI.create(cls, creationExtras);
        }
        return (T) this.Camera2StreamConfigurationMap.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(cls)) {
            return (T) this.getHighResolutionOutputSizeshNQ4ISI.create(cls);
        }
        return (T) this.Camera2StreamConfigurationMap.create(cls);
    }

    public static androidx.lifecycle.ViewModelProvider.Factory createInternal(android.app.Activity activity, androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle, androidx.lifecycle.ViewModelProvider.Factory factory) {
        return createInternal(activity, factory);
    }

    public static androidx.lifecycle.ViewModelProvider.Factory createInternal(android.app.Activity activity, androidx.lifecycle.ViewModelProvider.Factory factory) {
        dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint activityCreatorEntryPoint = (dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint) dagger.hilt.EntryPoints.get(activity, dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint.class);
        return new dagger.hilt.android.internal.lifecycle.HiltViewModelFactory(activityCreatorEntryPoint.getHighSpeedVideoFpsRanges(), factory, activityCreatorEntryPoint.Camera2StreamConfigurationMap());
    }
}
