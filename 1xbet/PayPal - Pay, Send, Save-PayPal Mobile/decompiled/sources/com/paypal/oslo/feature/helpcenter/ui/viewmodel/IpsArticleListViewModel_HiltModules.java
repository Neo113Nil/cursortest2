package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class IpsArticleListViewModel_HiltModules {
    private IpsArticleListViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel ipsArticleListViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.helpcenter.ui.viewmodel.IpsArticleListViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
