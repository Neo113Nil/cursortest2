package com.paypal.oslo.feature.cashin.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "imageUrl", "Lcom/paypal/pds/components/AvatarSource;", "rememberAvatarSource", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/AvatarSource;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvatarUtilKt {
    public static final com.paypal.pds.components.AvatarSource rememberAvatarSource(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(610822043, i, -1, "com.paypal.oslo.feature.cashin.ui.utils.rememberAvatarSource (AvatarUtil.kt:30)");
        }
        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).placeholder(android.R.drawable.ic_menu_gallery).error(android.R.drawable.ic_menu_gallery).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
        boolean changed = composer.changed(rememberAsyncImagePainter);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.pds.components.AvatarSource.Image(rememberAsyncImagePainter, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit());
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.AvatarSource.Image image = (com.paypal.pds.components.AvatarSource.Image) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return image;
    }
}
