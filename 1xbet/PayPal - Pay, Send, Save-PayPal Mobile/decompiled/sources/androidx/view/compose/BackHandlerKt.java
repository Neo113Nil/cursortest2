package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackHandlerKt {
    public static final void BackHandler(boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            boolean z4 = i4 != 0 ? true : z2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:107)");
            }
            java.lang.Object current = androidx.view.compose.LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalNavigationEventDispatcherOwner.$stable);
            if (current != null) {
                startRestartGroup.startReplaceGroup(535271790);
            } else {
                startRestartGroup.startReplaceGroup(535274673);
                current = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            if (current == null) {
                throw new java.lang.IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.".toString());
            }
            boolean changed = startRestartGroup.changed(current);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.view.NavigationEventDispatcherOwner navigationEventDispatcherOwner = current instanceof androidx.view.NavigationEventDispatcherOwner ? (androidx.view.NavigationEventDispatcherOwner) current : null;
                androidx.view.NavigationEventDispatcher getHighSpeedVideoFpsRanges = navigationEventDispatcherOwner != null ? navigationEventDispatcherOwner.getGetHighSpeedVideoFpsRanges() : null;
                androidx.view.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = current instanceof androidx.view.OnBackPressedDispatcherOwner ? (androidx.view.OnBackPressedDispatcherOwner) current : null;
                java.lang.Object backHandlerDispatcherCompat = new androidx.view.compose.internal.BackHandlerDispatcherCompat(getHighSpeedVideoFpsRanges, onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null);
                startRestartGroup.updateRememberedValue(backHandlerDispatcherCompat);
                rememberedValue = backHandlerDispatcherCompat;
            }
            final androidx.view.compose.internal.BackHandlerDispatcherCompat backHandlerDispatcherCompat2 = (androidx.view.compose.internal.BackHandlerDispatcherCompat) rememberedValue;
            boolean z5 = z4;
            long currentCompositeKeyHashCode = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(backHandlerDispatcherCompat2);
            boolean changed3 = startRestartGroup.changed(currentCompositeKeyHashCode);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.view.compose.ComposeBackHandler(new androidx.view.compose.BackHandlerInfo(current, currentCompositeKeyHashCode));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.view.compose.ComposeBackHandler composeBackHandler = (androidx.view.compose.ComposeBackHandler) rememberedValue2;
            if (androidx.view.ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                startRestartGroup.startReplaceGroup(-585307852);
                boolean changedInstance = startRestartGroup.changedInstance(composeBackHandler);
                boolean z6 = (i3 & 112) == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.view.compose.BackHandlerKt.$r8$lambda$uh0XynCQ53WgWF1AJSb8Svr1cqM(androidx.view.compose.ComposeBackHandler.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(composeBackHandler);
                int i5 = i3 & 14;
                boolean z7 = i5 == 4;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance2 || z7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    z3 = z5;
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.BackHandlerKt.m14$r8$lambda$kM0UcaP40dPddLQ78INQJofAtI(androidx.view.compose.ComposeBackHandler.this, z3, (androidx.view.compose.LifecycleStartStopEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    z3 = z5;
                }
                androidx.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Boolean.valueOf(z3), composeBackHandler, null, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i5, 4);
                boolean changedInstance3 = startRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean changedInstance4 = startRestartGroup.changedInstance(composeBackHandler);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.BackHandlerKt.$r8$lambda$B1Fin5hf49c20rDAvK1Q7mhIkmo(androidx.view.compose.internal.BackHandlerDispatcherCompat.this, composeBackHandler, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(backHandlerDispatcherCompat2, composeBackHandler, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                z3 = z5;
                startRestartGroup.startReplaceGroup(-584634160);
                boolean changedInstance5 = startRestartGroup.changedInstance(composeBackHandler);
                boolean z8 = (i3 & 14) == 4;
                boolean z9 = (i3 & 112) == 32;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changedInstance5 | z8 | z9) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.view.compose.BackHandlerKt.$r8$lambda$S8UlOnD71n3GOIFiR5ppWOIaAkk(androidx.view.compose.ComposeBackHandler.this, z3, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0);
                boolean changedInstance6 = startRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean changedInstance7 = startRestartGroup.changedInstance(composeBackHandler);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | changedInstance7) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.BackHandlerKt.m15$r8$lambda$lj_TT9Ycs622xDrDAPZnwcLqwA(androidx.view.compose.internal.BackHandlerDispatcherCompat.this, composeBackHandler, (androidx.view.compose.LifecycleStartStopEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                androidx.view.compose.LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat2, composeBackHandler, null, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, 0, 4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.BackHandlerKt.$r8$lambda$2SMSRMsR_o8bttbeiNTrGUUAiWg(z3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2SMSRMsR_o8bttbeiNTrGUUAiWg(boolean z, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BackHandler(z, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$B1Fin5hf49c20rDAvK1Q7mhIkmo(final androidx.view.compose.internal.BackHandlerDispatcherCompat backHandlerDispatcherCompat, final androidx.view.compose.ComposeBackHandler composeBackHandler, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.compose.internal.BackHandlerDispatcherCompat.this.removeHandler(composeBackHandler);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S8UlOnD71n3GOIFiR5ppWOIaAkk(androidx.view.compose.ComposeBackHandler composeBackHandler, boolean z, kotlin.jvm.functions.Function0 function0) {
        composeBackHandler.setBackEnabled(z);
        composeBackHandler.getHighSpeedVideoFpsRangesFor = function0;
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kM0UcaP40dPddLQ78INQJof-AtI, reason: not valid java name */
    public static /* synthetic */ androidx.view.compose.LifecycleStopOrDisposeEffectResult m14$r8$lambda$kM0UcaP40dPddLQ78INQJofAtI(final androidx.view.compose.ComposeBackHandler composeBackHandler, boolean z, final androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composeBackHandler.setBackEnabled(z);
        return new androidx.view.compose.LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.view.compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = androidx.view.compose.LifecycleStartStopEffectScope.this;
                composeBackHandler.setBackEnabled(false);
            }
        };
    }

    /* renamed from: $r8$lambda$lj-_TT9Ycs622xDrDAPZnwcLqwA, reason: not valid java name */
    public static /* synthetic */ androidx.view.compose.LifecycleStopOrDisposeEffectResult m15$r8$lambda$lj_TT9Ycs622xDrDAPZnwcLqwA(final androidx.view.compose.internal.BackHandlerDispatcherCompat backHandlerDispatcherCompat, final androidx.view.compose.ComposeBackHandler composeBackHandler, final androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composeBackHandler);
        return new androidx.view.compose.LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.view.compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = androidx.view.compose.LifecycleStartStopEffectScope.this;
                backHandlerDispatcherCompat.removeHandler(composeBackHandler);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uh0XynCQ53WgWF1AJSb8Svr1cqM(androidx.view.compose.ComposeBackHandler composeBackHandler, kotlin.jvm.functions.Function0 function0) {
        composeBackHandler.getHighSpeedVideoFpsRangesFor = function0;
        return kotlin.Unit.INSTANCE;
    }
}
