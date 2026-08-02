package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

/* loaded from: classes14.dex */
public final class CategoryCardViewModel_HiltModules {
    private CategoryCardViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel categoryCardViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
