package com.paypal.oslo.core.navigation.di;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/di/NavigationOverlayModule;", "", "", "Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayProvider;", "bindNavigationOverlayProviders", "()Ljava/util/Set;", "Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "bindNavigationBadgeProvider", "()Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface NavigationOverlayModule {
    @dagger.BindsOptionalOf
    com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider bindNavigationBadgeProvider();

    @dagger.multibindings.Multibinds
    java.util.Set<com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> bindNavigationOverlayProviders();
}
