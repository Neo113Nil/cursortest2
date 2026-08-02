package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

/* loaded from: classes13.dex */
public final class DocUploadViewModel_HiltModules {
    private DocUploadViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel docUploadViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
