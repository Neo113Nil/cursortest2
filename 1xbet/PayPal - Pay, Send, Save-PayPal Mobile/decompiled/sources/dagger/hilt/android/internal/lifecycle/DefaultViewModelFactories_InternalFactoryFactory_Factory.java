package dagger.hilt.android.internal.lifecycle;

/* loaded from: classes17.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements dagger.internal.Factory<dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory> {
    private final dagger.internal.Provider<dagger.hilt.android.internal.builders.ViewModelComponentBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Map<java.lang.Class<?>, java.lang.Boolean>> getHighSpeedVideoSizes;

    private DefaultViewModelFactories_InternalFactoryFactory_Factory(dagger.internal.Provider<java.util.Map<java.lang.Class<?>, java.lang.Boolean>> provider, dagger.internal.Provider<dagger.hilt.android.internal.builders.ViewModelComponentBuilder> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory create(dagger.internal.Provider<java.util.Map<java.lang.Class<?>, java.lang.Boolean>> provider, dagger.internal.Provider<dagger.hilt.android.internal.builders.ViewModelComponentBuilder> provider2) {
        return new dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory(provider, provider2);
    }

    public static dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory newInstance(java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, dagger.hilt.android.internal.builders.ViewModelComponentBuilder viewModelComponentBuilder) {
        return new dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory(map, viewModelComponentBuilder);
    }
}
