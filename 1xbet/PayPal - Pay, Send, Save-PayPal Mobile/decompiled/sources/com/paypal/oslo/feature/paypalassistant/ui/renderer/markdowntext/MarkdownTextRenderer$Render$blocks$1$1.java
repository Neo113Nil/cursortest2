package com.paypal.oslo.feature.paypalassistant.ui.renderer.markdowntext;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MarkdownTextRenderer$Render$blocks$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager) this.receiver).onLinkClick(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        Camera2StreamConfigurationMap(str);
        return kotlin.Unit.INSTANCE;
    }

    MarkdownTextRenderer$Render$blocks$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager.class, "onLinkClick", "onLinkClick(Ljava/lang/String;)V", 0);
    }
}
