package com.paypal.oslo.feature.packagetracking.ui.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"rememberAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "imageUrl", "", "fallbackSource", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/String;Lcom/paypal/pds/components/AvatarSource;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)Lcom/paypal/pds/components/AvatarSource;", "rememberImagePainter", "Landroidx/compose/ui/graphics/painter/Painter;", "fallbackPainter", "(Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/painter/Painter;", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvatarSourceUtilsKt {
    public static final com.paypal.pds.components.AvatarSource rememberAvatarSource(java.lang.String str, com.paypal.pds.components.AvatarSource avatarSource, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSource, "");
        composer.startReplaceGroup(1133041039);
        if ((i2 & 4) != 0) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1133041039, i, -1, "com.paypal.oslo.feature.packagetracking.ui.utils.rememberAvatarSource (AvatarSourceUtils.kt:51)");
        }
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return avatarSource;
        }
        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, null, null, contentScale2, composer, (i & 14) | ((i << 6) & 57344), 14);
        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, composer, 0, 1);
        boolean changed = composer.changed((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState.getValue());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = java.lang.Boolean.valueOf(collectAsState.getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error);
            composer.updateRememberedValue(rememberedValue);
        }
        if (!((java.lang.Boolean) rememberedValue).booleanValue()) {
            avatarSource = new com.paypal.pds.components.AvatarSource.Image(rememberAsyncImagePainter, null, 2, null);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return avatarSource;
    }

    public static final androidx.compose.ui.graphics.painter.Painter rememberImagePainter(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        composer.startReplaceGroup(2140483219);
        if ((i2 & 4) != 0) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2140483219, i, -1, "com.paypal.oslo.feature.packagetracking.ui.utils.rememberImagePainter (AvatarSourceUtils.kt:103)");
        }
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painter;
        }
        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, null, null, contentScale2, composer, (i & 14) | ((i << 6) & 57344), 14);
        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, composer, 0, 1);
        boolean changed = composer.changed((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) collectAsState.getValue());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = java.lang.Boolean.valueOf(collectAsState.getValue() instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error);
            composer.updateRememberedValue(rememberedValue);
        }
        if (!((java.lang.Boolean) rememberedValue).booleanValue()) {
            painter = rememberAsyncImagePainter;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return painter;
    }
}
