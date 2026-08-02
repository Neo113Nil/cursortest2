package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

/* loaded from: classes15.dex */
public final class BulkUpdateFiViewModel_HiltModules {
    private BulkUpdateFiViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
