package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"rememberAvatarSource", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "imageUrl", "", "fallbackIcon", "Lcom/paypal/pds/core/Icon;", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "subscriptions_prodRelease", "painterState", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AvatarUtilsKt {
    public static final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult rememberAvatarSource(java.lang.String str, com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceGroup(-866720631);
        if ((i2 & 2) != 0) {
            icon = com.paypal.pds.core.Icon.Store.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-866720631, i, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.rememberAvatarSource (AvatarUtils.kt:41)");
        }
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            composer.startReplaceGroup(869207196);
            boolean z = (((i & 112) ^ 48) > 32 && composer.changed(icon)) || (i & 48) == 32;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult = new com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult(new com.paypal.pds.components.AvatarSource.Icon(icon), true);
                composer.updateRememberedValue(avatarResult);
                rememberedValue = avatarResult;
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult2 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult) rememberedValue;
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return avatarResult2;
        }
        composer.startReplaceGroup(869388825);
        composer.endReplaceGroup();
        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, composer, 0, 1);
        boolean changed = composer.changed((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState.getValue());
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState.getValue()) instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult(new com.paypal.pds.components.AvatarSource.Icon(icon), true);
            } else {
                rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult(new com.paypal.pds.components.AvatarSource.Image(rememberAsyncImagePainter, androidx.compose.ui.layout.ContentScale.INSTANCE.getInside()), false);
            }
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult3 = (com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return avatarResult3;
    }
}
