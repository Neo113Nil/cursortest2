package com.paypal.oslo.feature.controlcenter.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ControlCenterScreenKt$ControlCenterScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider invoke(androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        return ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel) this.receiver).getTabsForDestination(navKey);
    }

    ControlCenterScreenKt$ControlCenterScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.class, "getTabsForDestination", "getTabsForDestination(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", 0);
    }
}
