package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel;

/* loaded from: classes14.dex */
public final class CLIManageViewModel_HiltModules {
    private CLIManageViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
