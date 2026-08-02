package com.paypal.oslo.core.security.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0082\u0010¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"rememberScreenshotPreventionController", "Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "isDebug", "", "(ZLandroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "ScreenshotBlocker", "", "screenshotPreventionController", "(ZLcom/paypal/oslo/core/security/ScreenshotPreventionController;Landroidx/compose/runtime/Composer;II)V", "findActivity", "Landroid/app/Activity;", "Landroid/content/Context;", "security_release", "isPreventionEnabled"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenshotBlockerKt {
    private static final com.paypal.oslo.core.security.ScreenshotPreventionController getHighSpeedVideoSizes(boolean z, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(166579859, i, -1, "com.paypal.oslo.core.security.ui.rememberScreenshotPreventionController (ScreenshotBlocker.kt:38)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (z) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    dagger.hilt.android.EntryPointAccessors entryPointAccessors = dagger.hilt.android.EntryPointAccessors.INSTANCE;
                    android.content.Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(((com.paypal.oslo.core.security.ui.ScreenshotPreventionControllerEntryPoint) dagger.hilt.android.EntryPointAccessors.fromApplication(applicationContext, com.paypal.oslo.core.security.ui.ScreenshotPreventionControllerEntryPoint.class)).screenshotPreventionController());
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                    m23436constructorimpl = new com.paypal.oslo.core.security.ScreenshotPreventionController();
                }
                screenshotPreventionController = (com.paypal.oslo.core.security.ScreenshotPreventionController) m23436constructorimpl;
            } else {
                dagger.hilt.android.EntryPointAccessors entryPointAccessors2 = dagger.hilt.android.EntryPointAccessors.INSTANCE;
                android.content.Context applicationContext2 = context.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                screenshotPreventionController = ((com.paypal.oslo.core.security.ui.ScreenshotPreventionControllerEntryPoint) dagger.hilt.android.EntryPointAccessors.fromApplication(applicationContext2, com.paypal.oslo.core.security.ui.ScreenshotPreventionControllerEntryPoint.class)).screenshotPreventionController();
            }
            rememberedValue = screenshotPreventionController;
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController2 = (com.paypal.oslo.core.security.ScreenshotPreventionController) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return screenshotPreventionController2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if ((r11 & 2) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenshotBlocker(final boolean z, final com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1797860556);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(screenshotPreventionController)) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    screenshotPreventionController = getHighSpeedVideoSizes(z, startRestartGroup, i3 & 14);
                    i3 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1797860556, i3, -1, "com.paypal.oslo.core.security.ui.ScreenshotBlocker (ScreenshotBlocker.kt:63)");
                }
                final android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(screenshotPreventionController.isEnabled(), null, startRestartGroup, 0, 1);
                boolean booleanValue = ((java.lang.Boolean) collectAsState.getValue()).booleanValue();
                boolean changedInstance = startRestartGroup.changedInstance(view);
                boolean changed = startRestartGroup.changed(collectAsState);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.security.ui.ScreenshotBlockerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.core.security.ui.ScreenshotBlockerKt.$r8$lambda$hIdXxRU607DherzCVHqwUjsFc2Y(view, collectAsState, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.security.ui.ScreenshotBlockerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.security.ui.ScreenshotBlockerKt.$r8$lambda$dBbUq0e4Q1NAH7ImVikePEsQyO0(z, screenshotPreventionController, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dBbUq0e4Q1NAH7ImVikePEsQyO0(boolean z, com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ScreenshotBlocker(z, screenshotPreventionController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$hIdXxRU607DherzCVHqwUjsFc2Y(android.view.View view, androidx.compose.runtime.State state, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        android.app.Activity activity;
        final android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        while (true) {
            if (!(context instanceof android.app.Activity)) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            } else {
                activity = (android.app.Activity) context;
                break;
            }
        }
        if (activity == null || (window = activity.getWindow()) == null) {
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.core.security.ui.ScreenshotBlockerKt$ScreenshotBlocker$lambda$1$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                }
            };
        }
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            window.setFlags(8192, 8192);
        } else {
            window.clearFlags(8192);
        }
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.core.security.ui.ScreenshotBlockerKt$ScreenshotBlocker$lambda$1$0$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                window.clearFlags(8192);
            }
        };
    }
}
