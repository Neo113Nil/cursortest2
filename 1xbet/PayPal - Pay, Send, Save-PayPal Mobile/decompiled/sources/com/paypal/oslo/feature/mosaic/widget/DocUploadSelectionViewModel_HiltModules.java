package com.paypal.oslo.feature.mosaic.widget;

/* loaded from: classes13.dex */
public final class DocUploadSelectionViewModel_HiltModules {
    private DocUploadSelectionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel docUploadSelectionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.mosaic.widget.DocUploadSelectionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
