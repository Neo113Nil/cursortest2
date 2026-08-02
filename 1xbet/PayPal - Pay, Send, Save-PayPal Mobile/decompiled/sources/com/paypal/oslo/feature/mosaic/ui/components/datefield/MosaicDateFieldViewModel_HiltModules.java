package com.paypal.oslo.feature.mosaic.ui.components.datefield;

/* loaded from: classes13.dex */
public final class MosaicDateFieldViewModel_HiltModules {
    private MosaicDateFieldViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel mosaicDateFieldViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.components.datefield.MosaicDateFieldViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
