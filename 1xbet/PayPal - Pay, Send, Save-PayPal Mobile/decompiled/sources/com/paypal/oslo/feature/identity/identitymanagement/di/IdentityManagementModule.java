package com.paypal.oslo.feature.identity.identitymanagement.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/di/IdentityManagementModule;", "", "Lcom/paypal/oslo/feature/identity/identitymanagement/IdentityManagementImpl;", "impl", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "bindIdentityManagement", "(Lcom/paypal/oslo/feature/identity/identitymanagement/IdentityManagementImpl;)Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface IdentityManagementModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.Companion INSTANCE = com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.identity.api.IdentityManagement bindIdentityManagement(com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/di/IdentityManagementModule$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.identitymanagement.di.IdentityManagementModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
            return kotlinx.coroutines.Dispatchers.getIO();
        }
    }
}
