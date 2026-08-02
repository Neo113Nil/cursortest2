package com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard;

/* loaded from: classes14.dex */
public final class ProductCardCarouselViewModel_HiltModules {
    private ProductCardCarouselViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel productCardCarouselViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard.ProductCardCarouselViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
