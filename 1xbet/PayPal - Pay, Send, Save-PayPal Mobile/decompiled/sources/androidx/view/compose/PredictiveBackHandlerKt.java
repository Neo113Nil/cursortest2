package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032A\u0010\u0004\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PredictiveBackHandlerKt {
    public static final void PredictiveBackHandler(boolean z, final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.Flow<androidx.view.BackEventCompat>, ? super kotlin.coroutines.Continuation<kotlin.Unit>, ? extends java.lang.Object> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        final boolean z3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-642000585);
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
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            z3 = i4 != 0 ? true : z2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-642000585, i3, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:118)");
            }
            java.lang.Object current = androidx.view.compose.LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalNavigationEventDispatcherOwner.$stable);
            if (current != null) {
                startRestartGroup.startReplaceGroup(1512737723);
            } else {
                startRestartGroup.startReplaceGroup(1512740606);
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
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
            long currentCompositeKeyHashCode = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(backHandlerDispatcherCompat2);
            boolean changed3 = startRestartGroup.changed(currentCompositeKeyHashCode);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new androidx.view.compose.ComposePredictiveBackHandler(coroutineScope, new androidx.view.compose.PredictiveBackHandlerInfo(current, currentCompositeKeyHashCode));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler = (androidx.view.compose.ComposePredictiveBackHandler) rememberedValue3;
            if (androidx.view.ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                startRestartGroup.startReplaceGroup(-348514256);
                boolean changedInstance = startRestartGroup.changedInstance(composePredictiveBackHandler);
                boolean changedInstance2 = startRestartGroup.changedInstance(function2);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.view.compose.PredictiveBackHandlerKt.m18$r8$lambda$I2Xi7mOChmMAZ9qZZEwheaxs4(androidx.view.compose.ComposePredictiveBackHandler.this, function2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                boolean changedInstance3 = startRestartGroup.changedInstance(composePredictiveBackHandler);
                int i5 = i3 & 14;
                boolean z4 = i5 == 4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.PredictiveBackHandlerKt.$r8$lambda$D8a2kH5mKpDy4Fdrtpqcav0aLMg(androidx.view.compose.ComposePredictiveBackHandler.this, z3, (androidx.view.compose.LifecycleStartStopEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Boolean.valueOf(z3), composePredictiveBackHandler, null, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, i5, 4);
                boolean changedInstance4 = startRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean changedInstance5 = startRestartGroup.changedInstance(composePredictiveBackHandler);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | changedInstance5) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.PredictiveBackHandlerKt.m20$r8$lambda$Qyg5QBqA91q6Cfl0DPwFa5Xpg(androidx.view.compose.internal.BackHandlerDispatcherCompat.this, composePredictiveBackHandler, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(backHandlerDispatcherCompat2, composePredictiveBackHandler, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-347849492);
                boolean changedInstance6 = startRestartGroup.changedInstance(composePredictiveBackHandler);
                boolean z5 = (i3 & 14) == 4;
                boolean changedInstance7 = startRestartGroup.changedInstance(function2);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | z5 | changedInstance7) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.view.compose.PredictiveBackHandlerKt.$r8$lambda$cQVN4tRfSnIQmf_oO7lMYiB3VMs(androidx.view.compose.ComposePredictiveBackHandler.this, z3, function2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 0);
                boolean changedInstance8 = startRestartGroup.changedInstance(backHandlerDispatcherCompat2);
                boolean changedInstance9 = startRestartGroup.changedInstance(composePredictiveBackHandler);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if ((changedInstance8 | changedInstance9) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.PredictiveBackHandlerKt.$r8$lambda$nQooPx1G5uRDz4nlmkTLRPyb09k(androidx.view.compose.internal.BackHandlerDispatcherCompat.this, composePredictiveBackHandler, (androidx.view.compose.LifecycleStartStopEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                androidx.view.compose.LifecycleEffectKt.LifecycleStartEffect(backHandlerDispatcherCompat2, composePredictiveBackHandler, null, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 0, 4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.PredictiveBackHandlerKt.m19$r8$lambda$1yXwvY8lpzr0ptjGfFZRhfTB5k(z3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-I2Xi7-mOChmMAZ9qZZEwheaxs4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18$r8$lambda$I2Xi7mOChmMAZ9qZZEwheaxs4(androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, kotlin.jvm.functions.Function2 function2) {
        composePredictiveBackHandler.Camera2StreamConfigurationMap = function2;
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1yXwvY8lpzr0pt-jGfFZRhfTB5k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19$r8$lambda$1yXwvY8lpzr0ptjGfFZRhfTB5k(boolean z, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PredictiveBackHandler(z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.view.compose.LifecycleStopOrDisposeEffectResult $r8$lambda$D8a2kH5mKpDy4Fdrtpqcav0aLMg(final androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, final androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        composePredictiveBackHandler.setBackEnabled(z);
        return new androidx.view.compose.LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1
            @Override // androidx.view.compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = androidx.view.compose.LifecycleStartStopEffectScope.this;
                composePredictiveBackHandler.setBackEnabled(false);
            }
        };
    }

    /* renamed from: $r8$lambda$Qyg5QBqA91q-6Cfl0DPwFa5-Xpg, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m20$r8$lambda$Qyg5QBqA91q6Cfl0DPwFa5Xpg(final androidx.view.compose.internal.BackHandlerDispatcherCompat backHandlerDispatcherCompat, final androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.compose.internal.BackHandlerDispatcherCompat.this.removeHandler(composePredictiveBackHandler);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cQVN4tRfSnIQmf_oO7lMYiB3VMs(androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, boolean z, kotlin.jvm.functions.Function2 function2) {
        composePredictiveBackHandler.setBackEnabled(z);
        composePredictiveBackHandler.Camera2StreamConfigurationMap = function2;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.view.compose.LifecycleStopOrDisposeEffectResult $r8$lambda$nQooPx1G5uRDz4nlmkTLRPyb09k(final androidx.view.compose.internal.BackHandlerDispatcherCompat backHandlerDispatcherCompat, final androidx.view.compose.ComposePredictiveBackHandler composePredictiveBackHandler, final androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope) {
        backHandlerDispatcherCompat.addHandler(composePredictiveBackHandler);
        return new androidx.view.compose.LifecycleStopOrDisposeEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$6$0$$inlined$onStopOrDispose$1
            @Override // androidx.view.compose.LifecycleStopOrDisposeEffectResult
            public final void runStopOrDisposeEffect() {
                androidx.view.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope2 = androidx.view.compose.LifecycleStartStopEffectScope.this;
                backHandlerDispatcherCompat.removeHandler(composePredictiveBackHandler);
            }
        };
    }
}
