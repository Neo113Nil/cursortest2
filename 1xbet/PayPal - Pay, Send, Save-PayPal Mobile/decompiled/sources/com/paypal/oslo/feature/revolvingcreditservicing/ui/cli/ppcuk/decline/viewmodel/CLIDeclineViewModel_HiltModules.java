package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel;

/* loaded from: classes14.dex */
public final class CLIDeclineViewModel_HiltModules {
    private CLIDeclineViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel cLIDeclineViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
