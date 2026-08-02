package com.paypal.oslo.app.georestriction;

/* loaded from: classes10.dex */
public final class GeoRestrictionViewModel_HiltModules {
    private GeoRestrictionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel geoRestrictionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
