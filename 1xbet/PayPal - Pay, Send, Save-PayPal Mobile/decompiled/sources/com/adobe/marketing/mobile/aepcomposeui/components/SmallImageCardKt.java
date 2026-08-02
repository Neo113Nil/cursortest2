package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/SmallImageUI;", "ui", "Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;", "observer", "", "SmallImageCard", "(Lcom/adobe/marketing/mobile/aepcomposeui/SmallImageUI;Lcom/adobe/marketing/mobile/aepcomposeui/style/SmallImageUIStyle;Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SmallImageCardKt {
    public static final void SmallImageCard(final com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI, final com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUIStyle, final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallImageUI, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smallImageUIStyle, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-245622725);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-245622725, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCard (SmallImageCard.kt:32)");
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(smallImageUI.getTemplate().getId(), new com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$1(aepUIEventObserver, smallImageUI, null), startRestartGroup, 64);
        com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt.AepCard(smallImageUIStyle.getCardStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver2 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                if (aepUIEventObserver2 != null) {
                    com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI2 = smallImageUI;
                    aepUIEventObserver2.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact(smallImageUI2, new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.InteractionID.CARD_CLICKED, smallImageUI2.getTemplate().getActionUrl())));
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1494472634, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$3
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
                if ((intValue & 81) != 16 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1494472634, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCard.<anonymous> (SmallImageCard.kt:54)");
                    }
                    final com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUIStyle2 = com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle.this;
                    final com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI2 = smallImageUI;
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
                    com.adobe.marketing.mobile.aepcomposeui.components.AepRowKt.AepRow(smallImageUIStyle2.getRootRowStyle(), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 641533008, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$3$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer5 = composer4;
                            int intValue2 = num2.intValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                            if ((intValue2 & 81) != 16 || !composer5.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(641533008, intValue2, -1, "com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCard.<anonymous>.<anonymous>.<anonymous> (SmallImageCard.kt:58)");
                                }
                                com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt.AepAsyncImage(com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this.getTemplate().getImage(), smallImageUIStyle2.getImageStyle(), null, null, composer5, 64, 12);
                                com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle textColumnStyle = smallImageUIStyle2.getTextColumnStyle();
                                final com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI3 = com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this;
                                final com.adobe.marketing.mobile.aepcomposeui.style.SmallImageUIStyle smallImageUIStyle3 = smallImageUIStyle2;
                                final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver3 = aepUIEventObserver2;
                                com.adobe.marketing.mobile.aepcomposeui.components.AepColumnKt.AepColumn(textColumnStyle, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, 197087926, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$3$1$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer6, java.lang.Integer num3) {
                                        androidx.compose.runtime.Composer composer7 = composer6;
                                        int intValue3 = num3.intValue();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope2, "");
                                        if ((intValue3 & 81) != 16 || !composer7.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(197087926, intValue3, -1, "com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SmallImageCard.kt:66)");
                                            }
                                            composer7.startReplaceableGroup(1834491820);
                                            com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this.getTemplate().getTitle(), smallImageUIStyle3.getTitleTextStyle(), composer7, 64, 0);
                                            composer7.endReplaceableGroup();
                                            com.adobe.marketing.mobile.aepcomposeui.uimodels.AepText body = com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this.getTemplate().getBody();
                                            composer7.startReplaceableGroup(1834492051);
                                            if (body != null) {
                                                com.adobe.marketing.mobile.aepcomposeui.components.AepTextKt.AepText(body, smallImageUIStyle3.getBodyTextStyle(), composer7, 64, 0);
                                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            }
                                            composer7.endReplaceableGroup();
                                            java.util.List<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton> buttons = com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this.getTemplate().getButtons();
                                            com.adobe.marketing.mobile.aepcomposeui.style.AepButtonStyle[] buttonStyle = smallImageUIStyle3.getButtonStyle();
                                            com.adobe.marketing.mobile.aepcomposeui.style.AepRowStyle buttonRowStyle = smallImageUIStyle3.getButtonRowStyle();
                                            final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver4 = aepUIEventObserver3;
                                            final com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI4 = com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this;
                                            com.adobe.marketing.mobile.aepcomposeui.components.AepButtonRowKt.AepButtonRow(buttons, buttonStyle, buttonRowStyle, new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt.SmallImageCard.3.1.1.1.3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton) {
                                                    com.adobe.marketing.mobile.aepcomposeui.uimodels.AepButton aepButton2 = aepButton;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aepButton2, "");
                                                    com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver5 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                                                    if (aepUIEventObserver5 != null) {
                                                        aepUIEventObserver5.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact(smallImageUI4, new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(aepButton2.getId(), aepButton2.getActionUrl())));
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
                    com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt.AepDismissButton(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, smallImageUIStyle2.getDismissButtonAlignment()), smallImageUI2.getTemplate().getDismissBtn(), smallImageUIStyle2.getDismissButtonStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$3$1$2
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver3 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                            if (aepUIEventObserver3 != null) {
                                aepUIEventObserver3.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss(smallImageUI2));
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
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$4
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt.SmallImageCard(com.adobe.marketing.mobile.aepcomposeui.SmallImageUI.this, smallImageUIStyle, aepUIEventObserver, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
