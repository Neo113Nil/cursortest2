package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AepImage", "", "content", "Landroidx/compose/ui/graphics/painter/Painter;", "imageStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;", "(Landroidx/compose/ui/graphics/painter/Painter;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepImageStyle;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepImageKt {
    public static final void AepImage(final androidx.compose.ui.graphics.painter.Painter painter, com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(622291675);
        final com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle aepImageStyle2 = (i2 & 2) != 0 ? new com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle(null, null, null, null, null, null, 63, null) : aepImageStyle;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(622291675, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepImage (AepImage.kt:29)");
        }
        java.lang.String contentDescription = aepImageStyle2.getContentDescription();
        if (contentDescription == null) {
            contentDescription = "";
        }
        androidx.compose.ui.Modifier.Companion modifier = aepImageStyle2.getModifier();
        if (modifier == null) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.ui.Alignment alignment = aepImageStyle2.getAlignment();
        if (alignment == null) {
            alignment = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        }
        androidx.compose.ui.Alignment alignment2 = alignment;
        androidx.compose.ui.layout.ContentScale contentScale = aepImageStyle2.getContentScale();
        if (contentScale == null) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        java.lang.Float alpha = aepImageStyle2.getAlpha();
        androidx.compose.foundation.ImageKt.Image(painter, contentDescription, modifier2, alignment2, contentScale2, alpha != null ? alpha.floatValue() : 1.0f, aepImageStyle2.getColorFilter(), startRestartGroup, 8, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepImageKt$AepImage$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepImageKt.AepImage(androidx.compose.ui.graphics.painter.Painter.this, aepImageStyle2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
