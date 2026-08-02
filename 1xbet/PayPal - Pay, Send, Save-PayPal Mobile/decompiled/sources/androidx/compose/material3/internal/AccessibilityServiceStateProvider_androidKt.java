package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"rememberAccessibilityServiceState", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "(ZZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "ObserveState", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "handleEvent", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "onDispose", "Lkotlin/Function0;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SwitchAccessActivityName", "", "VoiceAccessActivityName", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    public static final androidx.compose.runtime.State<java.lang.Boolean> rememberAccessibilityServiceState(boolean z, boolean z2, boolean z3, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(432241692, i, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        java.lang.Object systemService = ((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        final android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        boolean z5 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        boolean z6 = (((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(z3)) && (i & 384) != 256) {
            z4 = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z5 | z6 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.internal.Listener(z, z2, z3);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.material3.internal.Listener listener = (androidx.compose.material3.internal.Listener) rememberedValue;
        androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean changed = composer.changed(listener);
        boolean changedInstance = composer.changedInstance(accessibilityManager);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.$r8$lambda$ZTmiyTg6D2vq9WkQPRoDnXh4Au4(androidx.compose.material3.internal.Listener.this, accessibilityManager, (androidx.lifecycle.Lifecycle.Event) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
        boolean changed2 = composer.changed(listener);
        boolean changedInstance2 = composer.changedInstance(accessibilityManager);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed2 | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.m4269$r8$lambda$_a0xIvipbcvnHTvuB8Y6tBUBKk(androidx.compose.material3.internal.Listener.this, accessibilityManager);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        getHighSpeedVideoSizes(lifecycleOwner, function1, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listener;
    }

    private static final void getHighSpeedVideoSizes(final androidx.view.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.Lifecycle.Event, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1868327245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (i5 != 0) {
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1868327245, i3, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean z = (i3 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
            boolean z2 = (i3 & 896) == 256;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.$r8$lambda$UvYyIbHO_HDwxwKKycBU3CAsgxg(androidx.view.LifecycleOwner.this, function1, function0, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, i3 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function1<? super androidx.lifecycle.Lifecycle.Event, kotlin.Unit> function12 = function1;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.$r8$lambda$UajjmJXu5oaeSZ29XuEx8TbGXl0(androidx.view.LifecycleOwner.this, function12, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UajjmJXu5oaeSZ29XuEx8TbGXl0(androidx.view.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(lifecycleOwner, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$UvYyIbHO_HDwxwKKycBU3CAsgxg(final androidx.view.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                kotlin.jvm.functions.Function1.this.invoke(event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                kotlin.jvm.functions.Function0.this.invoke();
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZTmiyTg6D2vq9WkQPRoDnXh4Au4(androidx.compose.material3.internal.Listener listener, android.view.accessibility.AccessibilityManager accessibilityManager, androidx.lifecycle.Lifecycle.Event event) {
        androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            listener.getHighResolutionOutputSizeshNQ4ISI(accessibilityManager.isEnabled());
            accessibilityManager.addAccessibilityStateChangeListener(listener);
            androidx.compose.material3.internal.Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = listener.getHighResolutionOutputSizeshNQ4ISI;
            if (listener$touchExplorationListener$1 != null) {
                listener$touchExplorationListener$1.setEnabled(accessibilityManager.isTouchExplorationEnabled());
                accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
            }
            if (android.os.Build.VERSION.SDK_INT >= 33 && (listener$otherA11yServicesListener$1 = listener.getHighSpeedVideoFpsRanges) != null) {
                listener$otherA11yServicesListener$1.setSwitchAccessEnabled(androidx.compose.material3.internal.Listener.getHighSpeedVideoFpsRangesFor(accessibilityManager));
                listener$otherA11yServicesListener$1.setVoiceAccessEnabled(androidx.compose.material3.internal.Listener.getHighSpeedVideoFpsRanges(accessibilityManager));
                androidx.compose.material3.internal.Listener.Api33Impl.aE_(accessibilityManager, listener$otherA11yServicesListener$1);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_a0xIvipbcv-nHTvuB8Y6tBUBKk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4269$r8$lambda$_a0xIvipbcvnHTvuB8Y6tBUBKk(androidx.compose.material3.internal.Listener listener, android.view.accessibility.AccessibilityManager accessibilityManager) {
        androidx.compose.material3.internal.Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        accessibilityManager.removeAccessibilityStateChangeListener(listener);
        androidx.compose.material3.internal.Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = listener.getHighResolutionOutputSizeshNQ4ISI;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && (listener$otherA11yServicesListener$1 = listener.getHighSpeedVideoFpsRanges) != null) {
            androidx.compose.material3.internal.Listener.Api33Impl.aF_(accessibilityManager, listener$otherA11yServicesListener$1);
        }
        return kotlin.Unit.INSTANCE;
    }
}
