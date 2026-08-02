package com.paypal.oslo.feature.activity.domain.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/navigation/IActivityNavigationProvider;", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "Landroidx/navigation3/runtime/NavKey;", "getTabDestination", "()Landroidx/navigation3/runtime/NavKey;", "tabDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityNavigationProvider extends com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider {
    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    androidx.navigation3.runtime.NavKey getTabDestination();
}
