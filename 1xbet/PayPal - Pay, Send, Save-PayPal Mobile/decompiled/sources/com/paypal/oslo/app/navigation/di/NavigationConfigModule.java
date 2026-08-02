package com.paypal.oslo.app.navigation.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/navigation/di/NavigationConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/app/navigation/NavigationConfigSectionResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "provideNavigationSection", "(Lcom/paypal/oslo/app/navigation/NavigationConfigSectionResolver;)Lcom/paypal/oslo/core/companion/domain/ConfigSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class NavigationConfigModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.navigation.di.NavigationConfigModule INSTANCE = new com.paypal.oslo.app.navigation.di.NavigationConfigModule();

    private NavigationConfigModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.companion.domain.ConfigSection provideNavigationSection(com.paypal.oslo.app.navigation.NavigationConfigSectionResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return com.paypal.oslo.app.navigation.NavigationSectionFactory.INSTANCE.create(resolver);
    }
}
