package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/Function0;", "", "predicate", "", "ReportDrawnWhen", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ReportDrawn", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "ReportDrawnAfter", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReportDrawnKt {
    public static /* synthetic */ boolean $r8$lambda$XEPgOM60FcttXLEQnmibtGAxavE() {
        return true;
    }

    public static final void ReportDrawnWhen(final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        final androidx.view.FullyDrawnReporter fullyDrawnReporter;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2047119994, i2, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            androidx.view.FullyDrawnReporterOwner current = androidx.view.compose.LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.view.compose.ReportDrawnKt.$r8$lambda$gBlqcTClAvA6iouKKgMD0M84QkM(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            boolean changedInstance = startRestartGroup.changedInstance(fullyDrawnReporter);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.view.compose.ReportDrawnKt.m22$r8$lambda$NSqDQDsxdIf4sa0UaGdo4nx3oM(androidx.view.FullyDrawnReporter.this, function0, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(fullyDrawnReporter, function0, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i2 << 3) & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.ReportDrawnKt.m21$r8$lambda$1usUgKJoh8ndpK1dt_fx0oxihY(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static final void ReportDrawn(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1357012904);
        if (startRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1357012904, i, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.view.compose.ReportDrawnKt.$r8$lambda$XEPgOM60FcttXLEQnmibtGAxavE());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ReportDrawnWhen((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.ReportDrawnKt.$r8$lambda$Qyz8dgmrKKtiaLGKldclwNgJyhc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ReportDrawnAfter(final kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.view.FullyDrawnReporter fullyDrawnReporter;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(945311272);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(945311272, i2, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            androidx.view.FullyDrawnReporterOwner current = androidx.view.compose.LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.view.compose.ReportDrawnKt.$r8$lambda$QpnmnANLdfyoqcjkXgtsE9Px6SQ(kotlin.jvm.functions.Function1.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            boolean changedInstance = startRestartGroup.changedInstance(fullyDrawnReporter);
            boolean changedInstance2 = startRestartGroup.changedInstance(function1);
            androidx.view.compose.ReportDrawnKt$ReportDrawnAfter$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.view.compose.ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(function1, fullyDrawnReporter, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.activity.compose.ReportDrawnKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.ReportDrawnKt.$r8$lambda$r6snnvQsr72sOpSENmJd75dAfOo(kotlin.jvm.functions.Function1.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    /* renamed from: $r8$lambda$1usUgKJoh-8ndpK1dt_fx0oxihY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21$r8$lambda$1usUgKJoh8ndpK1dt_fx0oxihY(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReportDrawnWhen(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NS-qDQDsxdIf4sa0UaGdo4nx3oM, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m22$r8$lambda$NSqDQDsxdIf4sa0UaGdo4nx3oM(androidx.view.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            final androidx.view.compose.ReportDrawnComposition reportDrawnComposition = new androidx.view.compose.ReportDrawnComposition(fullyDrawnReporter, function0);
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    androidx.view.compose.ReportDrawnComposition.this.getHighResolutionOutputSizeshNQ4ISI();
                }
            };
        }
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QpnmnANLdfyoqcjkXgtsE9Px6SQ(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReportDrawnAfter(function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qyz8dgmrKKtiaLGKldclwNgJyhc(int i, androidx.compose.runtime.Composer composer, int i2) {
        ReportDrawn(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gBlqcTClAvA6iouKKgMD0M84QkM(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReportDrawnWhen(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r6snnvQsr72sOpSENmJd75dAfOo(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        ReportDrawnAfter(function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
