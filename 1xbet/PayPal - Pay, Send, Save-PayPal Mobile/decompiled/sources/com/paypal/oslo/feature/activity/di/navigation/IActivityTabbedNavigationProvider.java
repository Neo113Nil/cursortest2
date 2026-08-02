package com.paypal.oslo.feature.activity.di.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/di/navigation/IActivityTabbedNavigationProvider;", "", "Lcom/paypal/oslo/feature/activity/ui/navigation/ActivityTabbedNavigationImpl;", "provider", "Lcom/paypal/oslo/feature/activity/domain/navigation/IActivityNavigationProvider;", "bindActivityNavigationProvider", "(Lcom/paypal/oslo/feature/activity/ui/navigation/ActivityTabbedNavigationImpl;)Lcom/paypal/oslo/feature/activity/domain/navigation/IActivityNavigationProvider;", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "bindTabContentProvider", "(Lcom/paypal/oslo/feature/activity/domain/navigation/IActivityNavigationProvider;)Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface IActivityTabbedNavigationProvider {
    @dagger.Binds
    com.paypal.oslo.feature.activity.domain.navigation.IActivityNavigationProvider bindActivityNavigationProvider(com.paypal.oslo.feature.activity.ui.navigation.ActivityTabbedNavigationImpl provider);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider bindTabContentProvider(com.paypal.oslo.feature.activity.domain.navigation.IActivityNavigationProvider provider);
}
