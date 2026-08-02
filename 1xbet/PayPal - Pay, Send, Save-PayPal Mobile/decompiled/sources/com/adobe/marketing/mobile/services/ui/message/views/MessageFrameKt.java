package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "visibility", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "inAppMessageSettings", "Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;", "gestureTracker", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "MessageFrame", "(Landroidx/compose/animation/core/MutableTransitionState;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageFrameKt {
    public static final void MessageFrame(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, final com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker, final kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        android.app.Activity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableTransitionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gestureTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1004155363);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1004155363, i, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame (MessageFrame.kt:65)");
        }
        android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof android.app.Activity) {
                activity = (android.app.Activity) context;
                break;
            } else {
                context = ((android.content.ContextWrapper) context).getBaseContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            }
        }
        if (activity == null) {
            function0.invoke();
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "MessageFrame", "Unable to get the current activity. Dismissing the message.", new java.lang.Object[0]);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$currentActivity$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt.MessageFrame(mutableTransitionState, inAppMessageSettings, gestureTracker, function1, function0, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                });
                return;
            }
            return;
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        final android.view.View findViewById = activity.findViewById(android.R.id.content);
        float mo1415toDpu2uoSUM = density.mo1415toDpu2uoSUM(findViewById.getHeight());
        float mo1415toDpu2uoSUM2 = density.mo1415toDpu2uoSUM(findViewById.getWidth());
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(inAppMessageSettings.getHeight() * mo1415toDpu2uoSUM) / 100.0f)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m8599boximpl(access$getMessageFrameWidthInDp(density, findViewById.getWidth(), inAppMessageSettings)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
        final float m9886getHorizontalOffsetsI9pFWI$core_phoneRelease = com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper.INSTANCE.m9886getHorizontalOffsetsI9pFWI$core_phoneRelease(inAppMessageSettings.getHorizontalAlignment(), inAppMessageSettings.getHorizontalInset(), mo1415toDpu2uoSUM2);
        final float m9887getVerticalOffsetsI9pFWI$core_phoneRelease = com.adobe.marketing.mobile.services.ui.message.mapping.MessageOffsetMapper.INSTANCE.m9887getVerticalOffsetsI9pFWI$core_phoneRelease(inAppMessageSettings.getVerticalAlignment(), inAppMessageSettings.getVerticalInset(), mo1415toDpu2uoSUM);
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = java.lang.Boolean.valueOf(!inAppMessageSettings.getGestureMap().isEmpty());
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        final boolean booleanValue = ((java.lang.Boolean) rememberedValue3).booleanValue();
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue5;
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(0.0f), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) rememberedValue6;
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = java.lang.Boolean.FALSE;
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        startRestartGroup.endReplaceableGroup();
        final boolean booleanValue2 = ((java.lang.Boolean) rememberedValue7).booleanValue();
        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, (androidx.compose.ui.Modifier) null, com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper.INSTANCE.getEnterTransitionFor(inAppMessageSettings.getDisplayAnimation()), gestureTracker.getGetHighResolutionOutputSizeshNQ4ISI(), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -813844469, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.ui.Modifier draggable;
                androidx.compose.ui.Modifier draggable2;
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-813844469, intValue, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous> (MessageFrame.kt:116)");
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings2 = inAppMessageSettings;
                final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState6 = mutableState;
                final androidx.compose.ui.unit.Density density2 = density;
                final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState7 = mutableState2;
                final android.view.View view = findViewById;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.OffsetKt.m1678offsetVpY3zN4(androidx.compose.ui.layout.OnPlacedModifierKt.onPlaced(fillMaxSize$default, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "");
                        if (!com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.this.getFitToContent()) {
                            mutableState6.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(density2.mo1415toDpu2uoSUM(view.getHeight()) * com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.this.getHeight()) / 100.0f)));
                        }
                        mutableState7.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt.access$getMessageFrameWidthInDp(density2, view.getWidth(), com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.this)));
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }), m9886getHorizontalOffsetsI9pFWI$core_phoneRelease, m9887getVerticalOffsetsI9pFWI$core_phoneRelease), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), null, 2, null), com.adobe.marketing.mobile.services.ui.message.views.MessageTestTags.MESSAGE_FRAME);
                androidx.compose.foundation.layout.Arrangement.Horizontal horizontalArrangement$core_phoneRelease = com.adobe.marketing.mobile.services.ui.message.mapping.MessageArrangementMapper.INSTANCE.getHorizontalArrangement$core_phoneRelease(inAppMessageSettings.getHorizontalAlignment());
                androidx.compose.ui.Alignment.Vertical verticalAlignment$core_phoneRelease = com.adobe.marketing.mobile.services.ui.message.mapping.MessageAlignmentMapper.INSTANCE.getVerticalAlignment$core_phoneRelease(inAppMessageSettings.getVerticalAlignment());
                final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings3 = inAppMessageSettings;
                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState8 = mutableState3;
                boolean z = booleanValue;
                final androidx.compose.runtime.MutableState<java.lang.Float> mutableState9 = mutableState4;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                final int i2 = i;
                boolean z2 = booleanValue2;
                com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker2 = gestureTracker;
                androidx.compose.runtime.MutableState<java.lang.Float> mutableState10 = mutableState5;
                final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState11 = mutableState;
                final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState12 = mutableState2;
                final kotlin.jvm.functions.Function1<android.webkit.WebView, kotlin.Unit> function12 = function1;
                composer3.startReplaceableGroup(693286680);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontalArrangement$core_phoneRelease, verticalAlignment$core_phoneRelease, composer3, 0);
                composer3.startReplaceableGroup(-1323940314);
                androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) composer3.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer3.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composer3.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(testTag);
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composer3.enableReusing();
                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                long m6031getTransparent0d7_KjU = androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
                float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(inAppMessageSettings3.getCornerRadius())));
                if (z2) {
                    clip = androidx.compose.ui.draw.AlphaKt.alpha(clip, 0.99f);
                }
                composer3.startReplaceableGroup(1157296644);
                boolean changed = composer3.changed(mutableState8);
                java.lang.Object rememberedValue8 = composer3.rememberedValue();
                if (changed || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                            float floatValue = f.floatValue();
                            androidx.compose.runtime.MutableState<java.lang.Float> mutableState13 = mutableState8;
                            mutableState13.setValue(java.lang.Float.valueOf(mutableState13.getValue().floatValue() + floatValue));
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue8);
                }
                composer3.endReplaceableGroup();
                draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(clip, androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState((kotlin.jvm.functions.Function1) rememberedValue8, composer3, 0), androidx.compose.foundation.gestures.Orientation.Horizontal, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : new com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3(gestureTracker2, mutableState8, mutableState9, mutableState10, null), (r20 & 128) != 0 ? false : false);
                composer3.startReplaceableGroup(1157296644);
                boolean changed2 = composer3.changed(mutableState9);
                java.lang.Object rememberedValue9 = composer3.rememberedValue();
                if (changed2 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                            float floatValue = f.floatValue();
                            androidx.compose.runtime.MutableState<java.lang.Float> mutableState13 = mutableState9;
                            mutableState13.setValue(java.lang.Float.valueOf(mutableState13.getValue().floatValue() + floatValue));
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue9);
                }
                composer3.endReplaceableGroup();
                draggable2 = androidx.compose.foundation.gestures.DraggableKt.draggable(draggable, androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState((kotlin.jvm.functions.Function1) rememberedValue9, composer3, 0), androidx.compose.foundation.gestures.Orientation.Vertical, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : new com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5(gestureTracker2, mutableState8, mutableState9, mutableState10, null), (r20 & 128) != 0 ? false : false);
                androidx.compose.material.CardKt.m2534CardFjzlyU(draggable2, null, m6031getTransparent0d7_KjU, 0L, null, m8601constructorimpl, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -582408732, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                        androidx.compose.runtime.Composer composer5 = composer4;
                        int intValue2 = num2.intValue();
                        if ((intValue2 & 11) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-582408732, intValue2, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous>.<anonymous>.<anonymous> (MessageFrame.kt:180)");
                            }
                            androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, mutableState11.getValue().m8615unboximpl()), mutableState12.getValue().m8615unboximpl());
                            com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings4 = inAppMessageSettings3;
                            final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings5 = inAppMessageSettings3;
                            final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState13 = mutableState11;
                            com.adobe.marketing.mobile.services.ui.message.views.MessageContentKt.MessageContent(m1745width3ABfNKs, inAppMessageSettings4, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$6.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                                    kotlin.Unit unit;
                                    java.lang.Integer intOrNull;
                                    java.lang.String str2 = str;
                                    if (com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.this.getFitToContent()) {
                                        if (str2 == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str2)) == null) {
                                            unit = null;
                                        } else {
                                            mutableState13.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(intOrNull.intValue())));
                                            unit = kotlin.Unit.INSTANCE;
                                        }
                                        if (unit == null) {
                                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "MessageFrame", "Invalid height value received: ".concat(java.lang.String.valueOf(str2)), new java.lang.Object[0]);
                                        }
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            }, function12, composer5, (i2 & 7168) | 64);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composer3, 1769856, 26);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer3.startReplaceableGroup(1157296644);
                boolean changed3 = composer3.changed(function02);
                java.lang.Object rememberedValue10 = composer3.rememberedValue();
                if (changed3 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$7$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                            return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$7$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    kotlin.jvm.functions.Function0.this.invoke();
                                }
                            };
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue10);
                }
                composer3.endReplaceableGroup();
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue10, composer3, 6);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }
        }), startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i & 14), 18);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt.MessageFrame(mutableTransitionState, inAppMessageSettings, gestureTracker, function1, function0, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }

    public static final /* synthetic */ float access$getMessageFrameWidthInDp(androidx.compose.ui.unit.Density density, int i, com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings) {
        return density.mo1415toDpu2uoSUM(java.lang.Math.min((i * inAppMessageSettings.getWidth()) / 100, inAppMessageSettings.getMaxWidth()));
    }
}
