package com.paypal.oslo.feature.debitcard.api.widget;

/* loaded from: classes12.dex */
public final class DebitCardWidgetBridgeViewModel_HiltModules {
    private DebitCardWidgetBridgeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel debitCardWidgetBridgeViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
