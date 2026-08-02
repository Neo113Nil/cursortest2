package com.paypal.oslo.feature.controlcenter.api.provider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R.\u0010\u000e\u001a\u001c\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0002\b\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "", "Landroidx/navigation3/runtime/NavKey;", "getTabDestination", "()Landroidx/navigation3/runtime/NavKey;", "tabDestination", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlin/ParameterName;", "", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContent;", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function3;", "content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface TabContentProvider {
    kotlin.jvm.functions.Function3<com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent();

    androidx.navigation3.runtime.NavKey getTabDestination();
}
