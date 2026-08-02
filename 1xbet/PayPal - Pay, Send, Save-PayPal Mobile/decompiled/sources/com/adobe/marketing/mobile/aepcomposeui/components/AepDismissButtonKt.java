package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"AepDismissButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "dismissIcon", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepIconStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepDismissButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepDismissButton(final androidx.compose.ui.Modifier modifier, final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon aepIcon, com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1628545338);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(aepIcon) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            if (i4 == 4 || (i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i4 == 0) {
                        aepIconStyle2 = new com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle(null, null, null, 7, null);
                        i3 &= -897;
                    } else {
                        aepIconStyle2 = aepIconStyle;
                    }
                    if (i5 != 0) {
                        function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt$AepDismissButton$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    aepIconStyle2 = aepIconStyle;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1628545338, i3, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButton (AepDismissButton.kt:28)");
                }
                if (aepIcon != null) {
                    startRestartGroup.startReplaceableGroup(-597840424);
                    androidx.compose.ui.Modifier.Companion modifier2 = aepIconStyle2.getModifier();
                    if (modifier2 == null) {
                        modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    androidx.compose.ui.Modifier then = modifier2.then(modifier);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(function02);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt$AepDismissButton$2$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                function02.invoke();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    aepIconStyle2.setModifier(androidx.compose.foundation.ClickableKt.m1320clickableXHw0xAI$default(then, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, 7, null));
                    startRestartGroup.endReplaceableGroup();
                    com.adobe.marketing.mobile.aepcomposeui.components.AepIconKt.AepIcon(aepIcon, aepIconStyle2, startRestartGroup, ((i3 >> 3) & 14) | 64, 0);
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                aepIconStyle2 = aepIconStyle;
            }
            final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            final com.adobe.marketing.mobile.aepcomposeui.style.AepIconStyle aepIconStyle3 = aepIconStyle2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt$AepDismissButton$3
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt.AepDismissButton(androidx.compose.ui.Modifier.this, aepIcon, aepIconStyle3, function03, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            });
            return;
        }
        function02 = function0;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        if (aepIcon != null) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        final kotlin.jvm.functions.Function0<kotlin.Unit> function032 = function02;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
