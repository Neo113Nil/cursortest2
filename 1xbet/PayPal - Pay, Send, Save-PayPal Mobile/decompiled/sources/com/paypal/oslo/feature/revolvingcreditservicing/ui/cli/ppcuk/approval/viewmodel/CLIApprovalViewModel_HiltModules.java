package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

/* loaded from: classes14.dex */
public final class CLIApprovalViewModel_HiltModules {
    private CLIApprovalViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
