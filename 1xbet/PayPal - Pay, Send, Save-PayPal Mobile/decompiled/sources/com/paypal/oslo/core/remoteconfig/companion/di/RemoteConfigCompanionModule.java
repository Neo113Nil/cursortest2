package com.paypal.oslo.core.remoteconfig.companion.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/companion/di/RemoteConfigCompanionModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionFactory;", "factory", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "provideRemoteConfigSection", "(Lcom/paypal/oslo/core/remoteconfig/companion/RemoteConfigSectionFactory;Landroid/content/Context;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class RemoteConfigCompanionModule {
    public static final com.paypal.oslo.core.remoteconfig.companion.di.RemoteConfigCompanionModule INSTANCE = new com.paypal.oslo.core.remoteconfig.companion.di.RemoteConfigCompanionModule();

    private RemoteConfigCompanionModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.companion.domain.ConfigSection provideRemoteConfigSection(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory factory, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return factory.create(context);
    }
}
