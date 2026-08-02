package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class CategorySelectionScreenKt$CategorySelectionScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel) this.receiver).onConfirmationTermsClick(str, str2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
        getHighResolutionOutputSizeshNQ4ISI(str, str2);
        return kotlin.Unit.INSTANCE;
    }

    CategorySelectionScreenKt$CategorySelectionScreen$7$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel.class, "onConfirmationTermsClick", "onConfirmationTermsClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }
}
