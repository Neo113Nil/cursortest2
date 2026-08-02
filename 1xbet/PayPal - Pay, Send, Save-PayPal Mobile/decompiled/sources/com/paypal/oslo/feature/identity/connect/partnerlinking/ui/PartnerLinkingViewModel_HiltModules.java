package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

/* loaded from: classes12.dex */
public final class PartnerLinkingViewModel_HiltModules {
    private PartnerLinkingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
