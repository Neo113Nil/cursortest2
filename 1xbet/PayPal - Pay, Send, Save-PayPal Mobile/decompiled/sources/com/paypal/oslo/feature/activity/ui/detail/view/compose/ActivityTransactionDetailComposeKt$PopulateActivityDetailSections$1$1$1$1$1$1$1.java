package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityTransactionDetailComposeKt$PopulateActivityDetailSections$1$1$1$1$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.navigation3.runtime.NavKey navKey) {
        ((com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) this.receiver).navigateToNavKey$activity_prodRelease(navKey);
        return kotlin.Unit.INSTANCE;
    }

    ActivityTransactionDetailComposeKt$PopulateActivityDetailSections$1$1$1$1$1$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class, "navigateToNavKey", "navigateToNavKey$activity_prodRelease(Landroidx/navigation3/runtime/NavKey;)V", 0);
    }
}
