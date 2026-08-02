package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessIntroViewModel_HiltModules {
    private DataAccessIntroViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel dataAccessIntroViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessIntroViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
