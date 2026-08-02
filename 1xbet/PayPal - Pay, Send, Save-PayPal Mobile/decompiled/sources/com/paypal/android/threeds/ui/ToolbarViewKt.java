package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function0;", "", "navigateUp", "ToolbarView", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/android/threeds/ui/customization/ToolbarCustomization;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/android/threeds/ui/customization/ToolbarCustomization;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToolbarViewKt {
    public static final void ToolbarView(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(216492598);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(216492598, i2, -1, "com.paypal.android.threeds.ui.ToolbarView (ToolbarView.kt:42)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            com.paypal.android.threeds.ui.customization.ToolbarCustomization toolbarCustomization = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getUiCustomization().getToolbarCustomization();
            getHighResolutionOutputSizeshNQ4ISI(toolbarCustomization, startRestartGroup, 0);
            final java.lang.String toolbarHeaderText = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getToolbarHeaderText(toolbarCustomization);
            final java.lang.String toolbarButtonText = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getToolbarButtonText(toolbarCustomization);
            long m11049getToolbarBackgroundColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11049getToolbarBackgroundColorvNxB06k(toolbarCustomization);
            final long m11050getToolbarTextColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11050getToolbarTextColorvNxB06k(toolbarCustomization);
            final long m11051getToolbarTextFontSizekPz2Gy4 = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11051getToolbarTextFontSizekPz2Gy4(toolbarCustomization);
            final androidx.compose.ui.text.font.FontFamily fontFromResource = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.getFontFromResource(context, toolbarCustomization);
            composer2 = startRestartGroup;
            androidx.compose.material.AppBarKt.m2486TopAppBarxWeB9s(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1809031162, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ToolbarViewKt.m10999$r8$lambda$kAJaiUCpH3MUfrsWBFZEdjTwd8(toolbarHeaderText, m11050getToolbarTextColorvNxB06k, m11051getToolbarTextFontSizekPz2Gy4, fontFromResource, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2095434277, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.android.threeds.ui.ToolbarViewKt.m10998$r8$lambda$5yyKLXcD0JJZusgElHQ3Shvd1c(kotlin.jvm.functions.Function0.this, toolbarButtonText, m11050getToolbarTextColorvNxB06k, fontFromResource, (androidx.compose.foundation.layout.RowScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), m11049getToolbarBackgroundColorvNxB06k, 0L, 0.0f, composer2, 3078, 102);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ToolbarViewKt.m10997$r8$lambda$4iq2acjbpsvV9ZtcIXdP11lSPo(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.android.threeds.ui.customization.ToolbarCustomization toolbarCustomization, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1509703890);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(toolbarCustomization) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1509703890, i2, -1, "com.paypal.android.threeds.ui.SetStatusBarColor (ToolbarView.kt:81)");
            }
            final long m11042getStatusBarColorvNxB06k = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.m11042getStatusBarColorvNxB06k(toolbarCustomization);
            final android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            if (view.isInEditMode()) {
                startRestartGroup.startReplaceGroup(1309692628);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1309161195);
                boolean changedInstance = startRestartGroup.changedInstance(view);
                boolean changed = startRestartGroup.changed(m11042getStatusBarColorvNxB06k);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.android.threeds.ui.ToolbarViewKt.$r8$lambda$FMTYCwCexFvOIRJyNL6hb4IlbmQ(view, m11042getStatusBarColorvNxB06k);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ToolbarViewKt.$r8$lambda$m3vHGLGBcFlscrUKJuUM3N8guF4(com.paypal.android.threeds.ui.customization.ToolbarCustomization.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-4iq2acjbpsvV9ZtcIXdP11lSPo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10997$r8$lambda$4iq2acjbpsvV9ZtcIXdP11lSPo(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ToolbarView(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5yyKLXcD0JJZusg-ElHQ3Shvd1c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10998$r8$lambda$5yyKLXcD0JJZusgElHQ3Shvd1c(kotlin.jvm.functions.Function0 function0, final java.lang.String str, final long j, final androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2095434277, i, -1, "com.paypal.android.threeds.ui.ToolbarView.<anonymous> (ToolbarView.kt:64)");
            }
            androidx.compose.material.IconButtonKt.IconButton(function0, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(706563081, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ToolbarViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ui.ToolbarViewKt.$r8$lambda$WDw7UHC1xMTM70bg4UuNpt4qBGM(str, j, fontFamily, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 24576, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FMTYCwCexFvOIRJyNL6hb4IlbmQ(android.view.View view, long j) {
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context, "");
        android.view.Window window = ((android.app.Activity) context).getWindow();
        boolean z = androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(j) > 0.5f;
        androidx.core.view.WindowCompat.getInsetsController(window, view).setAppearanceLightStatusBars(z);
        androidx.core.view.WindowCompat.getInsetsController(window, view).setAppearanceLightNavigationBars(z);
        window.setStatusBarColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        window.setNavigationBarColor(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WDw7UHC1xMTM70bg4UuNpt4qBGM(java.lang.String str, long j, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(706563081, i, -1, "com.paypal.android.threeds.ui.ToolbarView.<anonymous>.<anonymous> (ToolbarView.kt:65)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11012getThree_ds_margin_15D9Ej5fM(), 0.0f, 11, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.cancel, composer, 0)), j, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11033getThree_ds_text_size_14XSAIIZE(), (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500(), fontFamily, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer, 199680, 0, 130960);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kAJa-iUCpH3MUfrsWBFZEdjTwd8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10999$r8$lambda$kAJaiUCpH3MUfrsWBFZEdjTwd8(java.lang.String str, long j, long j2, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1809031162, i, -1, "com.paypal.android.threeds.ui.ToolbarView.<anonymous> (ToolbarView.kt:54)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(str, (androidx.compose.ui.Modifier) null, j, j2, (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500(), fontFamily, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 130962);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m3vHGLGBcFlscrUKJuUM3N8guF4(com.paypal.android.threeds.ui.customization.ToolbarCustomization toolbarCustomization, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(toolbarCustomization, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
