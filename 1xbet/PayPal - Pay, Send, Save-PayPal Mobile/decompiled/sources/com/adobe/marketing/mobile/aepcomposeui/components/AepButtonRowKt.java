package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"AepButtonRow", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BUTTONS, "", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepButton;", "buttonsStyle", "", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepButtonStyle;", "rowStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;", "onClick", "Lkotlin/Function1;", "(Ljava/util/List;[Lcom/adobe/marketing/mobile/aepcomposeui/style/AepButtonStyle;Lcom/adobe/marketing/mobile/aepcomposeui/style/AepRowStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepButtonRowKt {
    public static final void AepButtonRow(final java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton> list, final com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle[] aepButtonStyleArr, com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle aepRowStyle, kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle aepRowStyle2;
        final int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepButtonStyleArr, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1005889801);
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            aepRowStyle2 = new com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle(null, null, null, 7, null);
        } else {
            aepRowStyle2 = aepRowStyle;
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt$AepButtonRow$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepButton, "");
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        final kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit> function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1005889801, i3, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRow (AepButtonRow.kt:28)");
        }
        if (list != null) {
            com.adobe.marketing.mobile.aepcomposeui.components.AepRowKt.AepRow(aepRowStyle2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1565427796, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt$AepButtonRow$2$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.foundation.layout.RowScope rowScope2 = rowScope;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope2, "");
                    if ((((intValue & 14) == 0 ? (composer3.changed(rowScope2) ? 4 : 2) | intValue : intValue) & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1565427796, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRow.<anonymous>.<anonymous> (AepButtonRow.kt:37)");
                        }
                        java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton> list2 = list;
                        final kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit> function13 = function12;
                        com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle[] aepButtonStyleArr2 = aepButtonStyleArr;
                        int i4 = 0;
                        for (java.lang.Object obj : list2) {
                            if (i4 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton = (com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton) obj;
                            composer3.startReplaceableGroup(511388516);
                            boolean changed = composer3.changed(function13);
                            boolean changed2 = composer3.changed(aepButton);
                            java.lang.Object rememberedValue = composer3.rememberedValue();
                            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt$AepButtonRow$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                        function13.invoke(aepButton);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(0);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            composer3.endReplaceableGroup();
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                            com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle aepButtonStyle = aepButtonStyleArr2[i4];
                            androidx.compose.ui.Modifier.Companion modifier = aepButtonStyle.getModifier();
                            if (modifier == null) {
                                modifier = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            aepButtonStyle.setModifier(modifier.then(androidx.compose.foundation.layout.RowScope.weight$default(rowScope2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null)));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            com.adobe.marketing.mobile.aepcomposeui.components.AepButtonKt.AepButton(aepButton, function0, aepButtonStyle, composer3, 512, 0);
                            i4++;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }
            }), startRestartGroup, 56, 0);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt$AepButtonRow$3
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt.AepButtonRow(list, aepButtonStyleArr, aepRowStyle2, function12, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }
}
