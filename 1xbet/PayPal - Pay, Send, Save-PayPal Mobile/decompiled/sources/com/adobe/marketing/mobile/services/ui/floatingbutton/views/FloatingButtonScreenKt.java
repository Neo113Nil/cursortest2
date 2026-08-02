package com.adobe.marketing.mobile.services.ui.floatingbutton.views;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;", "presentationStateManager", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "floatingButtonSettings", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;", "floatingButtonViewModel", "Lkotlin/Function0;", "", "onTapDetected", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onPanDetected", "FloatingButtonScreen", "(Lcom/adobe/marketing/mobile/services/ui/common/PresentationStateManager;Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatingButtonScreenKt {
    public static final void FloatingButtonScreen(final com.adobe.marketing.mobile.services.ui.common.PresentationStateManager presentationStateManager, final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings floatingButtonSettings, final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel floatingButtonViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationStateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButtonSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(floatingButtonViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(687015214);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(687015214, i, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreen (FloatingButtonScreen.kt:33)");
        }
        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(presentationStateManager.getVisibilityState(), (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -771451050, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                long portraitOffSet;
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-771451050, intValue, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreen.<anonymous> (FloatingButtonScreen.kt:43)");
                }
                final int i2 = ((android.content.res.Configuration) composer3.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation;
                com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings floatingButtonSettings2 = com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.this;
                androidx.compose.runtime.State<androidx.compose.ui.graphics.ImageBitmap> currentGraphic$core_phoneRelease = floatingButtonViewModel.getCurrentGraphic$core_phoneRelease();
                if (i2 == 2) {
                    portraitOffSet = floatingButtonViewModel.getLandscapeOffSet();
                } else {
                    portraitOffSet = floatingButtonViewModel.getPortraitOffSet();
                }
                long j = portraitOffSet;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
                composer3.startReplaceableGroup(1157296644);
                boolean changed = composer3.changed(function02);
                java.lang.Object rememberedValue = composer3.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$1$1$1
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
                    composer3.updateRememberedValue(rememberedValue);
                }
                composer3.endReplaceableGroup();
                final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel floatingButtonViewModel2 = floatingButtonViewModel;
                final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = function1;
                com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt.m9885FloatingButtonSu4bsnU(floatingButtonSettings2, currentGraphic$core_phoneRelease, j, (kotlin.jvm.functions.Function0) rememberedValue, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                        long m5762unboximpl = offset.m5762unboximpl();
                        com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonViewModel.this.m9882onPositionUpdate3MmeM6k$core_phoneRelease(m5762unboximpl, i2);
                        function12.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(m5762unboximpl));
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                }, composer3, 8, 0);
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
        }), startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | 196992, 26);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt$FloatingButtonScreen$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonScreenKt.FloatingButtonScreen(com.adobe.marketing.mobile.services.ui.common.PresentationStateManager.this, floatingButtonSettings, floatingButtonViewModel, function0, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
