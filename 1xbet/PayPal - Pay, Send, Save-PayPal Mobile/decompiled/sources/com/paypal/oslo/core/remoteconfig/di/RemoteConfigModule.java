package com.paypal.oslo.core.remoteconfig.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/di/RemoteConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;", "remoteConfigState", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "provideFeatureGates", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;Lcom/paypal/oslo/core/userstore/UserStore;)Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "provideDynamicConfiguration", "()Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "provideExperimentation", "()Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;", "holder", "provideRemoteConfigState", "(Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;)Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class RemoteConfigModule {
    public static final com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule INSTANCE = new com.paypal.oslo.core.remoteconfig.di.RemoteConfigModule();

    private RemoteConfigModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.remoteconfig.contract.FeatureGate provideFeatureGates(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState remoteConfigState, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        return new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate(com.statsig.androidsdk.Statsig.INSTANCE, remoteConfigState, userStore);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration provideDynamicConfiguration() {
        return new com.paypal.oslo.core.remoteconfig.StatsigDynamicConfiguration(com.statsig.androidsdk.Statsig.INSTANCE);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.remoteconfig.contract.Experimentation provideExperimentation() {
        return new com.paypal.oslo.core.remoteconfig.StatsigExperimentation(com.statsig.androidsdk.Statsig.INSTANCE);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState provideRemoteConfigState(com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder holder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "");
        return holder;
    }
}
