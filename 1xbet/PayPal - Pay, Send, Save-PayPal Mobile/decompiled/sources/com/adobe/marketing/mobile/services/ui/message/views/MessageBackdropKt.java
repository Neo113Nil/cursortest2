package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "visibility", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "inAppMessageSettings", "Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;", "gestureTracker", "", "MessageBackdrop", "(Landroidx/compose/animation/core/MutableTransitionState;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lcom/adobe/marketing/mobile/services/ui/message/GestureTracker;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageBackdropKt {
    public static final void MessageBackdrop(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, final com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableTransitionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gestureTracker, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1950745108);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1950745108, i, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageBackdrop (MessageBackdrop.kt:37)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(inAppMessageSettings.getBackdropColor())));
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final long m6006unboximpl = ((androidx.compose.ui.graphics.Color) rememberedValue).m6006unboximpl();
        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1477579204, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageBackdropKt$MessageBackdrop$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1477579204, intValue, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageBackdrop.<anonymous> (MessageBackdrop.kt:46)");
                }
                androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m6006unboximpl, inAppMessageSettings.getBackdropOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer3.startReplaceableGroup(-492369756);
                java.lang.Object rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                    composer3.updateRememberedValue(rememberedValue2);
                }
                composer3.endReplaceableGroup();
                final com.adobe.marketing.mobile.services.ui.message.GestureTracker gestureTracker2 = gestureTracker;
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.ClickableKt.m1318clickableO2vRcR0$default(m1286backgroundbw27NRU$default, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2, null, true, null, null, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageBackdropKt$MessageBackdrop$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ kotlin.Unit invoke() {
                        com.adobe.marketing.mobile.services.ui.message.GestureTracker.this.onGesture$core_phoneRelease(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings.MessageGesture.TAP_BACKGROUND);
                        return kotlin.Unit.INSTANCE;
                    }

                    {
                        super(0);
                    }
                }, 24, null), com.adobe.marketing.mobile.services.ui.message.views.MessageTestTags.MESSAGE_BACKDROP), composer3, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        }), startRestartGroup, 200064 | androidx.compose.animation.core.MutableTransitionState.$stable | (i & 14), 18);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageBackdropKt$MessageBackdrop$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.message.views.MessageBackdropKt.MessageBackdrop(mutableTransitionState, inAppMessageSettings, gestureTracker, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
