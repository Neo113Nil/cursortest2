package com.paypal.oslo.feature.mosaic.ui.legacy;

/* loaded from: classes13.dex */
public final class MosaicLegacyFlowViewModel_HiltModules {
    private MosaicLegacyFlowViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.ui.legacy.MosaicLegacyFlowViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
