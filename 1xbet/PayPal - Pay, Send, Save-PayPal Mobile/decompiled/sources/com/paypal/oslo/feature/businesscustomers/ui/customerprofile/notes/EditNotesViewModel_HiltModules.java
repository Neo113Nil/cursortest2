package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

/* loaded from: classes11.dex */
public final class EditNotesViewModel_HiltModules {
    private EditNotesViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
