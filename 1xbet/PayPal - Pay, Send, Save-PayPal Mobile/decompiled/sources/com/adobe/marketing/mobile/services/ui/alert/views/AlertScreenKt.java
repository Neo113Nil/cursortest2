package com.adobe.marketing.mobile.services.ui.alert.views;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aI\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;", "presentationStateManager", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "alertSettings", "Lkotlin/Function0;", "", "onPositiveResponse", "onNegativeResponse", "onBackPressed", "AlertScreen", "(Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AlertScreenKt {
    public static final void AlertScreen(final com.adobe.marketing.mobile.services.ui.common.PresentationStateManager presentationStateManager, final com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationStateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-628276247);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(presentationStateManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(alertSettings) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        final int i3 = i2;
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-628276247, i3, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen (AlertScreen.kt:34)");
            }
            composer2 = startRestartGroup;
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(presentationStateManager.getVisibilityState(), (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 238366737, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(238366737, intValue, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous> (AlertScreen.kt:44)");
                    }
                    androidx.compose.ui.window.DialogProperties dialogProperties = new androidx.compose.ui.window.DialogProperties(true, false, (androidx.compose.ui.window.SecureFlagPolicy) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function03;
                    composer4.startReplaceableGroup(1157296644);
                    boolean changed = composer4.changed(function04);
                    java.lang.Object rememberedValue = composer4.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                function04.invoke();
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue);
                    }
                    composer4.endReplaceableGroup();
                    kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                    final com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings2 = alertSettings;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function0;
                    final int i4 = i3;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -577311655, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer6 = composer5;
                            int intValue2 = num2.intValue();
                            if ((intValue2 & 11) != 2 || !composer6.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-577311655, intValue2, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:58)");
                                }
                                final java.lang.String positiveButtonText = com.adobe.marketing.mobile.services.ui.alert.AlertSettings.this.getPositiveButtonText();
                                if (positiveButtonText != null) {
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function06;
                                    composer6.startReplaceableGroup(1157296644);
                                    boolean changed2 = composer6.changed(function07);
                                    java.lang.Object rememberedValue2 = composer6.rememberedValue();
                                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1$2$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                function07.invoke();
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }
                                        };
                                        composer6.updateRememberedValue(rememberedValue2);
                                    }
                                    composer6.endReplaceableGroup();
                                    androidx.compose.material.ButtonKt.TextButton((kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.POSITIVE_BUTTON), false, null, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, -821678530, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1$2$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer7, java.lang.Integer num3) {
                                            androidx.compose.runtime.Composer composer8 = composer7;
                                            int intValue3 = num3.intValue();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                                            if ((intValue3 & 81) == 16 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-821678530, intValue3, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:63)");
                                                }
                                                androidx.compose.material.TextKt.m2830Text4IGK_g(positiveButtonText, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer8, 0, 0, 131070);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }
                                    }), composer6, 805306416, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                    final com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings3 = alertSettings;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function02;
                    final int i5 = i3;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, 1587721179, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer6 = composer5;
                            int intValue2 = num2.intValue();
                            if ((intValue2 & 11) != 2 || !composer6.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1587721179, intValue2, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:68)");
                                }
                                final java.lang.String negativeButtonText = com.adobe.marketing.mobile.services.ui.alert.AlertSettings.this.getNegativeButtonText();
                                if (negativeButtonText != null) {
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function07;
                                    composer6.startReplaceableGroup(1157296644);
                                    boolean changed2 = composer6.changed(function08);
                                    java.lang.Object rememberedValue2 = composer6.rememberedValue();
                                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1$3$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                function08.invoke();
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }
                                        };
                                        composer6.updateRememberedValue(rememberedValue2);
                                    }
                                    composer6.endReplaceableGroup();
                                    androidx.compose.material.ButtonKt.TextButton((kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.NEGATIVE_BUTTON), false, null, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, 1343354304, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1$3$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer7, java.lang.Integer num3) {
                                            androidx.compose.runtime.Composer composer8 = composer7;
                                            int intValue3 = num3.intValue();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
                                            if ((intValue3 & 81) == 16 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(1343354304, intValue3, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertScreen.kt:73)");
                                                }
                                                androidx.compose.material.TextKt.m2830Text4IGK_g(negativeButtonText, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer8, 0, 0, 131070);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }
                                    }), composer6, 805306416, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                    final com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings4 = alertSettings;
                    androidx.compose.runtime.internal.ComposableLambda composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, 522753948, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer6 = composer5;
                            int intValue2 = num2.intValue();
                            if ((intValue2 & 11) != 2 || !composer6.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(522753948, intValue2, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:46)");
                                }
                                androidx.compose.material.TextKt.m2830Text4IGK_g(com.adobe.marketing.mobile.services.ui.alert.AlertSettings.this.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.TITLE_TEXT), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer6, 48, 0, 131068);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(2);
                        }
                    });
                    final com.adobe.marketing.mobile.services.ui.alert.AlertSettings alertSettings5 = alertSettings;
                    androidx.compose.material.AndroidAlertDialog_androidKt.m2471AlertDialog6oU6zVQ(function05, composableLambda, null, composableLambda2, composableLambda3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -542213283, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$1.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer6 = composer5;
                            int intValue2 = num2.intValue();
                            if ((intValue2 & 11) != 2 || !composer6.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-542213283, intValue2, -1, "com.adobe.marketing.mobile.services.ui.alert.views.AlertScreen.<anonymous>.<anonymous> (AlertScreen.kt:52)");
                                }
                                androidx.compose.material.TextKt.m2830Text4IGK_g(com.adobe.marketing.mobile.services.ui.alert.AlertSettings.this.getMessage(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.adobe.marketing.mobile.services.ui.alert.views.AlertTestTags.MESSAGE_TEXT), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer6, 48, 0, 131068);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer6.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(2);
                        }
                    }), null, 0L, 0L, dialogProperties, composer4, 805530672, 452);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }
            }), composer2, androidx.compose.animation.core.MutableTransitionState.$stable | 196992, 26);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt$AlertScreen$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.alert.views.AlertScreenKt.AlertScreen(com.adobe.marketing.mobile.services.ui.common.PresentationStateManager.this, alertSettings, function0, function02, function03, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }
}
