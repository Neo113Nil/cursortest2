package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

/* loaded from: classes11.dex */
public final class DocumentsHalfSheetViewModel_HiltModules {
    private DocumentsHalfSheetViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel documentsHalfSheetViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
