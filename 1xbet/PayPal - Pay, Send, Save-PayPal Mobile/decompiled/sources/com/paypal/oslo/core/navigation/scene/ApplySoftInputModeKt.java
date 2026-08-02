package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "Landroidx/navigation3/runtime/NavKey;", "backStack", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavEntry;", "entryProvider", "Landroidx/compose/runtime/MutableState;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "softInputModeOverride", "", "ApplySoftInputMode", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "rememberSoftInputModeOverride", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ApplySoftInputModeKt {
    public static final void ApplySoftInputMode(final java.util.List<? extends androidx.navigation3.runtime.NavKey> list, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> function1, final androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.SoftInputMode> mutableState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1851984194);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1851984194, i2, -1, "com.paypal.oslo.core.navigation.scene.ApplySoftInputMode (ApplySoftInputMode.kt:52)");
            }
            final android.app.Activity activity = (android.app.Activity) startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            if (activity != null) {
                androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
                androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey> invoke = navKey != null ? function1.invoke(navKey) : null;
                boolean z = (invoke == null || com.paypal.oslo.core.navigation.NavEntryExtensionsKt.isL0(invoke) || com.paypal.oslo.core.navigation.NavEntryExtensionsKt.isL1(invoke)) ? false : true;
                boolean changed = startRestartGroup.changed(z);
                boolean z2 = (i2 & 896) == 256;
                com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$ApplySoftInputMode$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$ApplySoftInputMode$1$1(z, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                final com.paypal.oslo.core.navigation.SoftInputMode value = z ? null : mutableState.getValue();
                if (value == null) {
                    com.paypal.oslo.core.navigation.SoftInputMode forcedSoftInputMode = invoke != null ? com.paypal.oslo.core.navigation.NavEntryExtensionsKt.getForcedSoftInputMode(invoke) : null;
                    if (forcedSoftInputMode == null) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        } else {
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.m11595$r8$lambda$GBWrdPJgVR8vyhVaoy9CADX3Ps(list, function1, mutableState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                        }
                    } else {
                        value = forcedSoftInputMode;
                    }
                }
                boolean changedInstance = startRestartGroup.changedInstance(activity);
                boolean changed2 = startRestartGroup.changed(value);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.m11597$r8$lambda$lCgzYA20GVOn5SQ53Nx7k3jIB0(activity, value, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(value, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                } else {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.m11596$r8$lambda$GUFN65BdUWCTJrUzLb_5LpgQdc(list, function1, mutableState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                }
            }
            endRestartGroup.updateScope(function2);
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.$r8$lambda$yMJnol0Oq2o0fZI6jG9qRPc2ufc(list, function1, mutableState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static final androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.SoftInputMode> rememberSoftInputModeOverride(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(55011784, i, -1, "com.paypal.oslo.core.navigation.scene.rememberSoftInputModeOverride (ApplySoftInputMode.kt:90)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.SoftInputMode> mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* renamed from: $r8$lambda$GBWrdPJgVR8v-yhVaoy9CADX3Ps, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11595$r8$lambda$GBWrdPJgVR8vyhVaoy9CADX3Ps(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        ApplySoftInputMode(list, function1, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GUFN65BdUWCTJrUzLb_5LpgQd-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11596$r8$lambda$GUFN65BdUWCTJrUzLb_5LpgQdc(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        ApplySoftInputMode(list, function1, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lCgzYA20GVOn5S-Q53Nx7k3jIB0, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m11597$r8$lambda$lCgzYA20GVOn5SQ53Nx7k3jIB0(final android.app.Activity activity, com.paypal.oslo.core.navigation.SoftInputMode softInputMode, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final int i = activity.getWindow().getAttributes().softInputMode;
        activity.getWindow().setSoftInputMode(softInputMode.getWindowFlag());
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt$ApplySoftInputMode$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                activity.getWindow().setSoftInputMode(i);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yMJnol0Oq2o0fZI6jG9qRPc2ufc(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        ApplySoftInputMode(list, function1, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
