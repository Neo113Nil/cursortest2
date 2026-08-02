package dagger.hilt.android.internal.lifecycle;

/* loaded from: classes17.dex */
public final class DefaultViewModelFactories {

    public interface ActivityEntryPoint {
        dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @dagger.Module
    interface ActivityModule {
        @dagger.multibindings.Multibinds
        java.util.Map<java.lang.Class<?>, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI();
    }

    public interface FragmentEntryPoint {
        dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public static androidx.lifecycle.ViewModelProvider.Factory getActivityFactory(androidx.view.ComponentActivity componentActivity, androidx.lifecycle.ViewModelProvider.Factory factory) {
        dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory hiltInternalFactoryFactory = ((dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint) dagger.hilt.EntryPoints.get(componentActivity, dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint.class)).getHiltInternalFactoryFactory();
        return new dagger.hilt.android.internal.lifecycle.HiltViewModelFactory(hiltInternalFactoryFactory.getHighSpeedVideoFpsRanges, (androidx.lifecycle.ViewModelProvider.Factory) dagger.hilt.internal.Preconditions.checkNotNull(factory), hiltInternalFactoryFactory.getHighSpeedVideoSizes);
    }

    public static androidx.lifecycle.ViewModelProvider.Factory getFragmentFactory(androidx.fragment.app.Fragment fragment, androidx.lifecycle.ViewModelProvider.Factory factory) {
        dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory hiltInternalFactoryFactory = ((dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint) dagger.hilt.EntryPoints.get(fragment, dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint.class)).getHiltInternalFactoryFactory();
        return new dagger.hilt.android.internal.lifecycle.HiltViewModelFactory(hiltInternalFactoryFactory.getHighSpeedVideoFpsRanges, (androidx.lifecycle.ViewModelProvider.Factory) dagger.hilt.internal.Preconditions.checkNotNull(factory), hiltInternalFactoryFactory.getHighSpeedVideoSizes);
    }

    public static final class InternalFactoryFactory {
        final java.util.Map<java.lang.Class<?>, java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final dagger.hilt.android.internal.builders.ViewModelComponentBuilder getHighSpeedVideoSizes;

        @javax.inject.Inject
        InternalFactoryFactory(java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, dagger.hilt.android.internal.builders.ViewModelComponentBuilder viewModelComponentBuilder) {
            this.getHighSpeedVideoFpsRanges = map;
            this.getHighSpeedVideoSizes = viewModelComponentBuilder;
        }
    }

    private DefaultViewModelFactories() {
    }
}
