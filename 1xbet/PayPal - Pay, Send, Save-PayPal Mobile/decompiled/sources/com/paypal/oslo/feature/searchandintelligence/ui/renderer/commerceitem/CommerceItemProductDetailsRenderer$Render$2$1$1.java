package com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CommerceItemProductDetailsRenderer$Render$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        ((com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel) this.receiver).onAttributeSelect$search_and_intelligence_prodRelease(str3, str4);
        return kotlin.Unit.INSTANCE;
    }

    CommerceItemProductDetailsRenderer$Render$2$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel.class, "onAttributeSelect", "onAttributeSelect$search_and_intelligence_prodRelease(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }
}
