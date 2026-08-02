package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

/* loaded from: classes12.dex */
public final class DebitCardWidgetViewModel_HiltModules {
    private DebitCardWidgetViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
