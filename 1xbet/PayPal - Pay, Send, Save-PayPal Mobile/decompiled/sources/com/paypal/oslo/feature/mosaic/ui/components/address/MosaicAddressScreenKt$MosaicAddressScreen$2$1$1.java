package com.paypal.oslo.feature.mosaic.ui.components.address;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MosaicAddressScreenKt$MosaicAddressScreen$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        ((com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel) this.receiver).onFieldValueChanged$mosaic_prodRelease(str3, str4);
        return kotlin.Unit.INSTANCE;
    }

    MosaicAddressScreenKt$MosaicAddressScreen$2$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel.class, "onFieldValueChanged", "onFieldValueChanged$mosaic_prodRelease(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }
}
