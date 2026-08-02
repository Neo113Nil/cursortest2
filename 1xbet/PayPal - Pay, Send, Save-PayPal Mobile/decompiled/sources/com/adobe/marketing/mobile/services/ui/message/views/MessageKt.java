package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u000e\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ac\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "isVisible", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "inAppMessageSettings", "Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;", "gestureTracker", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "onBackPressed", "Message", "(Landroidx/compose/animation/core/MutableTransitionState;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;", "presentationStateManager", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;", "onGestureDetected", "MessageScreen", "(Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageKt {
    public static final void MessageScreen(final com.adobe.marketing.mobile.services.ui.common.PresentationStateManager presentationStateManager, final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, final kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationStateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(119985709);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(119985709, i, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageScreen (Message.kt:46)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker = new com.adobe.marketing.mobile.services.ui.message.GestureTracker(com.adobe.marketing.mobile.services.ui.message.mapping.MessageAnimationMapper.INSTANCE.getExitTransitionFor(inAppMessageSettings.getDismissAnimation()), inAppMessageSettings.getGestureMap().keySet(), new kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$MessageScreen$gestureTracker$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture messageGesture) {
                    com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture messageGesture2 = messageGesture;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageGesture2, "");
                    function12.invoke(messageGesture2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
            startRestartGroup.updateRememberedValue(gestureTracker);
            rememberedValue = gestureTracker;
        }
        startRestartGroup.endReplaceableGroup();
        com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker2 = (com.adobe.marketing.mobile.services.ui.message.GestureTracker) rememberedValue;
        boolean z = presentationStateManager.getPresentableState().getValue() == com.adobe.marketing.mobile.services.ui.Presentable.State.VISIBLE;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(function02);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$MessageScreen$1$1
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
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        androidx.view.compose.BackHandlerKt.BackHandler(z, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 0);
        androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> visibilityState = presentationStateManager.getVisibilityState();
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(function1);
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.webkit.WebView, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$MessageScreen$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.webkit.WebView webView) {
                    android.webkit.WebView webView2 = webView;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView2, "");
                    function1.invoke(webView2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed3 = startRestartGroup.changed(function0);
        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$MessageScreen$3$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    function0.invoke();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        Message(visibilityState, inAppMessageSettings, gestureTracker2, function13, (kotlin.jvm.functions.Function0) rememberedValue4, function02, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | 576 | ((i << 3) & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$MessageScreen$4
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.message.views.MessageKt.MessageScreen(com.adobe.marketing.mobile.services.ui.common.PresentationStateManager.this, inAppMessageSettings, function1, function0, function02, function12, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }

    public static final void Message(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, final com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker, final kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableTransitionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gestureTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-509574427);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-509574427, i, -1, "com.adobe.marketing.mobile.services.ui.message.views.Message (Message.kt:92)");
        }
        if (inAppMessageSettings.getShouldTakeOverUi()) {
            startRestartGroup.startReplaceableGroup(1613314286);
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            startRestartGroup.startReplaceableGroup(-492369756);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = null;
                try {
                    android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
                    if (applicationInfo != null) {
                        rememberedValue = java.lang.Integer.valueOf(applicationInfo.targetSdkVersion);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final java.lang.Integer num = (java.lang.Integer) rememberedValue;
            androidx.compose.ui.window.DialogProperties dialogProperties = new androidx.compose.ui.window.DialogProperties(true, false, (androidx.compose.ui.window.SecureFlagPolicy) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(function02);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$Message$1$1
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
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog((kotlin.jvm.functions.Function0) rememberedValue2, dialogProperties, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 264536819, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$Message$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num2.intValue();
                    if ((intValue & 11) != 2 || !composer4.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(264536819, intValue, -1, "com.adobe.marketing.mobile.services.ui.message.views.Message.<anonymous> (Message.kt:123)");
                        }
                        android.view.ViewParent parent = ((android.view.View) composer4.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())).getParent();
                        androidx.compose.ui.window.DialogWindowProvider dialogWindowProvider = parent instanceof androidx.compose.ui.window.DialogWindowProvider ? (androidx.compose.ui.window.DialogWindowProvider) parent : null;
                        android.view.Window getHighSpeedVideoFpsRangesFor = dialogWindowProvider != null ? dialogWindowProvider.getGetHighSpeedVideoFpsRangesFor() : null;
                        if (getHighSpeedVideoFpsRangesFor != null) {
                            java.lang.Integer num3 = num;
                            getHighSpeedVideoFpsRangesFor.setDimAmount(0.0f);
                            getHighSpeedVideoFpsRangesFor.setWindowAnimations(-1);
                            getHighSpeedVideoFpsRangesFor.addFlags(Integer.MIN_VALUE);
                            getHighSpeedVideoFpsRangesFor.setLayout(-1, -1);
                            if (android.os.Build.VERSION.SDK_INT >= 35 && num3 != null && num3.intValue() >= 35) {
                                getHighSpeedVideoFpsRangesFor.getAttributes().setFitInsetsTypes(0);
                                getHighSpeedVideoFpsRangesFor.getAttributes().setFitInsetsSides(0);
                            }
                        }
                        com.adobe.marketing.mobile.services.ui.message.views.MessageBackdropKt.MessageBackdrop(mutableTransitionState, inAppMessageSettings, gestureTracker, composer4, androidx.compose.animation.core.MutableTransitionState.$stable | 576 | (i & 14));
                        androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState2 = mutableTransitionState;
                        com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings2 = inAppMessageSettings;
                        com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker2 = gestureTracker;
                        kotlin.jvm.functions.Function1<android.webkit.WebView, kotlin.Unit> function12 = function1;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function0;
                        int i2 = androidx.compose.animation.core.MutableTransitionState.$stable;
                        int i3 = i;
                        com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt.MessageFrame(mutableTransitionState2, inAppMessageSettings2, gestureTracker2, function12, function03, composer4, i2 | 576 | (i3 & 14) | (i3 & 7168) | (i3 & 57344));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composer2, 432, 0);
            composer2.endReplaceableGroup();
        } else {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(1613317521);
            com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt.MessageFrame(mutableTransitionState, inAppMessageSettings, gestureTracker, function1, function0, composer2, androidx.compose.animation.core.MutableTransitionState.$stable | 576 | (i & 14) | (i & 7168) | (57344 & i));
            composer2.endReplaceableGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageKt$Message$3
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    com.adobe.marketing.mobile.services.ui.message.views.MessageKt.Message(mutableTransitionState, inAppMessageSettings, gestureTracker, function1, function0, function02, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
}
