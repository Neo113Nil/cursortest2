package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/ImageOnlyUI;", "ui", "Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;", "observer", "", "ImageOnlyCard", "(Lcom/adobe/marketing/mobile/aepcomposeui/ImageOnlyUI;Lcom/adobe/marketing/mobile/aepcomposeui/style/ImageOnlyUIStyle;Lcom/adobe/marketing/mobile/aepcomposeui/observers/AepUIEventObserver;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageOnlyCardKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ImageOnlyCard(final com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI imageOnlyUI, final com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle imageOnlyUIStyle, final com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageOnlyUI, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageOnlyUIStyle, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1221327859);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1221327859, i, -1, "com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCard (ImageOnlyCard.kt:36)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(imageOnlyUI.getTemplate().getId(), new com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$1(aepUIEventObserver, imageOnlyUI, null), startRestartGroup, 64);
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            com.adobe.marketing.mobile.aepcomposeui.components.AepCardKt.AepCard(imageOnlyUIStyle.getCardStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$2
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver2 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                    if (aepUIEventObserver2 != null) {
                        com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI imageOnlyUI2 = imageOnlyUI;
                        aepUIEventObserver2.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Interact(imageOnlyUI2, new com.adobe.marketing.mobile.aepcomposeui.UIAction.Click(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.InteractionID.CARD_CLICKED, imageOnlyUI2.getTemplate().getActionUrl())));
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1677440871, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$3
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
                    if ((intValue & 81) != 16 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1677440871, intValue, -1, "com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCard.<anonymous> (ImageOnlyCard.kt:62)");
                        }
                        final com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI imageOnlyUI2 = com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI.this;
                        com.adobe.marketing.mobile.aepcomposeui.style.ImageOnlyUIStyle imageOnlyUIStyle2 = imageOnlyUIStyle;
                        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = mutableState;
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
                        com.adobe.marketing.mobile.aepcomposeui.uimodels.AepImage image = imageOnlyUI2.getTemplate().getImage();
                        com.adobe.marketing.mobile.aepcomposeui.style.AepImageStyle imageStyle = imageOnlyUIStyle2.getImageStyle();
                        composer3.startReplaceableGroup(1157296644);
                        boolean changed = composer3.changed(mutableState2);
                        java.lang.Object rememberedValue2 = composer3.rememberedValue();
                        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$3$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                    mutableState2.setValue(java.lang.Boolean.valueOf(false));
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        com.adobe.marketing.mobile.aepcomposeui.components.AepAsyncImageKt.AepAsyncImage(image, imageStyle, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer3, 64, 4);
                        com.adobe.marketing.mobile.aepcomposeui.components.AepDismissButtonKt.AepDismissButton(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, imageOnlyUIStyle2.getDismissButtonAlignment()), imageOnlyUI2.getTemplate().getDismissBtn(), imageOnlyUIStyle2.getDismissButtonStyle(), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$3$1$2
                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver3 = com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver.this;
                                if (aepUIEventObserver3 != null) {
                                    aepUIEventObserver3.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Dismiss(imageOnlyUI2));
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
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$4
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt.ImageOnlyCard(com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI.this, imageOnlyUIStyle, aepUIEventObserver, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
