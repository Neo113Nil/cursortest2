package com.paypal.oslo.feature.activity.ui.navigation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR4\u0010\u000f\u001a\u001c\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\r¢\u0006\u0002\b\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/navigation/ActivityTabbedNavigationImpl;", "Lcom/paypal/oslo/feature/activity/domain/navigation/IActivityNavigationProvider;", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "tabDestination", "Landroidx/navigation3/runtime/NavKey;", "getTabDestination", "()Landroidx/navigation3/runtime/NavKey;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlin/ParameterName;", "", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContent;", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTabbedNavigationImpl implements com.paypal.oslo.feature.activity.domain.navigation.IActivityNavigationProvider {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey tabDestination = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    private final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = com.paypal.oslo.feature.activity.ui.navigation.ComposableSingletons$ActivityTabbedNavigationImplKt.INSTANCE.getLambda$101772719$activity_prodRelease();

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public ActivityTabbedNavigationImpl() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.navigation.IActivityNavigationProvider, com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final androidx.navigation3.runtime.NavKey getTabDestination() {
        return this.tabDestination;
    }

    @Override // com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.content;
    }
}
