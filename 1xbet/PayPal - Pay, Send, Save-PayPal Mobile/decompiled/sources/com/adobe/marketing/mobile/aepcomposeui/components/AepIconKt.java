package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AepIcon", "", "model", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;", "iconStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepIconKt {
    public static final void AepIcon(final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon aepIcon, final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        long m6006unboximpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepIcon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1204372467);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(aepIcon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 != 2 || (i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if (i4 != 0) {
                aepIconStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle(null, null, null, 7, null);
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1204372467, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepIcon (AepIcon.kt:28)");
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(aepIcon.getDrawableId(), startRestartGroup, 0);
            java.lang.String contentDescription = aepIconStyle.getContentDescription();
            androidx.compose.ui.Modifier.Companion modifier = aepIconStyle.getModifier();
            if (modifier == null) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier modifier2 = modifier;
            androidx.compose.ui.graphics.Color tint = aepIconStyle.getTint();
            startRestartGroup.startReplaceableGroup(-858423286);
            if (tint != null) {
                m6006unboximpl = tint.m6006unboximpl();
            } else {
                m6006unboximpl = ((androidx.compose.ui.graphics.Color) startRestartGroup.consume(androidx.compose.material3.ContentColorKt.getLocalContentColor())).m6006unboximpl();
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material3.IconKt.m3374Iconww6aTOc(painterResource, contentDescription, modifier2, m6006unboximpl, startRestartGroup, 8, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepIconKt$AepIcon$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepIconKt.AepIcon(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon.this, aepIconStyle, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
