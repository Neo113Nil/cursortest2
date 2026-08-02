package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/LargeImageUI;", "ui", "Lcom/adobe/marketing/mobile/aepcomposeui/style/LargeImageUIStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;", "observer", "", "LargeImageCard", "(Lcom/adobe/marketing/mobile/aepcomposeui/LargeImageUI;Lcom/adobe/marketing/mobile/aepcomposeui/style/LargeImageUIStyle;Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LargeImageCardKt {
    public static final void LargeImageCard(final com.adobe.marketing.mobile.aepcomposeui.LargeImageUI largeImageUI, final com.adobe.marketing.mobile.aepcomposeui.style.LargeImageUIStyle largeImageUIStyle, final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeImageUI, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(largeImageUIStyle, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-408870877);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-408870877, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCard (LargeImageCard.kt:32)");
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(largeImageUI.getTemplate().getId(), new com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$1(aepUIEventObserver, largeImageUI, null), startRestartGroup, 64);
        com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt.AepCard(largeImageUIStyle.getCardStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver2 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                if (aepUIEventObserver2 != null) {
                    com.adobe.marketing.mobile.aepcomposeui.LargeImageUI largeImageUI2 = largeImageUI;
                    aepUIEventObserver2.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact(largeImageUI2, new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.InteractionID.CARD_CLICKED, largeImageUI2.getTemplate().getActionUrl())));
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1331224482, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$3
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
                if ((intValue & 81) != 16 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1331224482, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCard.<anonymous> (LargeImageCard.kt:54)");
                    }
                    final com.adobe.marketing.mobile.aepcomposeui.style.LargeImageUIStyle largeImageUIStyle2 = com.adobe.marketing.mobile.aepcomposeui.style.LargeImageUIStyle.this;
                    final com.adobe.marketing.mobile.aepcomposeui.LargeImageUI largeImageUI2 = largeImageUI;
                    final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver2 = aepUIEventObserver;
                    composer3.startReplaceableGroup(733328855);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.adobe.marketing.mobile.aepcomposeui.components.AepColumnKt.AepColumn(largeImageUIStyle2.getRootColumnStyle(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 397556150, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$3$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer5 = composer4;
                            int intValue2 = num2.intValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope2, "");
                            if ((intValue2 & 81) != 16 || !composer5.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(397556150, intValue2, -1, "com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCard.<anonymous>.<anonymous>.<anonymous> (LargeImageCard.kt:58)");
                                }
                                com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt.AepAsyncImage(com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this.getTemplate().getImage(), largeImageUIStyle2.getImageStyle(), null, null, composer5, 64, 12);
                                com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle textColumnStyle = largeImageUIStyle2.getTextColumnStyle();
                                final com.adobe.marketing.mobile.aepcomposeui.LargeImageUI largeImageUI3 = com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this;
                                final com.adobe.marketing.mobile.aepcomposeui.style.LargeImageUIStyle largeImageUIStyle3 = largeImageUIStyle2;
                                final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver3 = aepUIEventObserver2;
                                com.adobe.marketing.mobile.aepcomposeui.components.AepColumnKt.AepColumn(textColumnStyle, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -1921145956, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$3$1$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope3, androidx.compose.runtime.Composer composer6, java.lang.Integer num3) {
                                        androidx.compose.runtime.Composer composer7 = composer6;
                                        int intValue3 = num3.intValue();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope3, "");
                                        if ((intValue3 & 81) != 16 || !composer7.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1921145956, intValue3, -1, "com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LargeImageCard.kt:65)");
                                            }
                                            composer7.startReplaceableGroup(-1606263576);
                                            com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this.getTemplate().getTitle(), largeImageUIStyle3.getTitleTextStyle(), composer7, 64, 0);
                                            composer7.endReplaceableGroup();
                                            com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText body = com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this.getTemplate().getBody();
                                            composer7.startReplaceableGroup(-1606263345);
                                            if (body != null) {
                                                com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(body, largeImageUIStyle3.getBodyTextStyle(), composer7, 64, 0);
                                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            }
                                            composer7.endReplaceableGroup();
                                            java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton> buttons = com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this.getTemplate().getButtons();
                                            com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle[] buttonStyle = largeImageUIStyle3.getButtonStyle();
                                            com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle buttonRowStyle = largeImageUIStyle3.getButtonRowStyle();
                                            final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver4 = aepUIEventObserver3;
                                            final com.adobe.marketing.mobile.aepcomposeui.LargeImageUI largeImageUI4 = com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this;
                                            com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt.AepButtonRow(buttons, buttonStyle, buttonRowStyle, new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt.LargeImageCard.3.1.1.1.3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton) {
                                                    com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton2 = aepButton;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepButton2, "");
                                                    com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver5 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                                                    if (aepUIEventObserver5 != null) {
                                                        aepUIEventObserver5.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact(largeImageUI4, new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(aepButton2.getId(), aepButton2.getActionUrl())));
                                                    }
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }
                                            }, composer7, 584, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer7.skipToGroupEnd();
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }
                                }), composer5, 56, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }
                    }), composer3, 56, 0);
                    com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt.AepDismissButton(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, largeImageUIStyle2.getDismissButtonAlignment()), largeImageUI2.getTemplate().getDismissBtn(), largeImageUIStyle2.getDismissButtonStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$3$1$2
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver3 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                            if (aepUIEventObserver3 != null) {
                                aepUIEventObserver3.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss(largeImageUI2));
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, composer3, 512, 0);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        }), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt$LargeImageCard$4
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.LargeImageCardKt.LargeImageCard(com.adobe.marketing.mobile.aepcomposeui.LargeImageUI.this, largeImageUIStyle, aepUIEventObserver, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
