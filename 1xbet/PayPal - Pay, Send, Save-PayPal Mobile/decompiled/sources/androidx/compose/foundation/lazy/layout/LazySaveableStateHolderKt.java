package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "Landroidx/compose/runtime/Composable;", "content", "LazySaveableStateHolderProvider", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazySaveableStateHolderKt {
    public static final void LazySaveableStateHolderProvider(final kotlin.jvm.functions.Function3<? super androidx.compose.runtime.saveable.SaveableStateHolder, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-709502251);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-709502251, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            final androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = (androidx.compose.runtime.saveable.SaveableStateRegistry) startRestartGroup.consume(androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            final androidx.compose.runtime.saveable.SaveableStateHolder rememberSaveableStateHolder = androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            java.lang.Object[] objArr = {saveableStateRegistry};
            androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.lazy.layout.LazySaveableStateHolder, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> saver = androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.INSTANCE.saver(saveableStateRegistry, rememberSaveableStateHolder);
            boolean changedInstance = startRestartGroup.changedInstance(saveableStateRegistry);
            boolean changedInstance2 = startRestartGroup.changedInstance(rememberSaveableStateHolder);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.foundation.lazy.layout.LazySaveableStateHolder highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.saveable.SaveableStateRegistry.this, rememberSaveableStateHolder);
                        return highSpeedVideoFpsRanges;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder = (androidx.compose.foundation.lazy.layout.LazySaveableStateHolder) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-412824043, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function3.this, lazySaveableStateHolder, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    return highSpeedVideoFpsRanges;
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function3.this, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.layout.LazySaveableStateHolder getHighSpeedVideoFpsRanges(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder) {
        return new androidx.compose.foundation.lazy.layout.LazySaveableStateHolder(saveableStateRegistry, kotlin.collections.MapsKt.emptyMap(), saveableStateHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function3 function3, androidx.compose.foundation.lazy.layout.LazySaveableStateHolder lazySaveableStateHolder, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-412824043, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            function3.invoke(lazySaveableStateHolder, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function3 function3, int i, androidx.compose.runtime.Composer composer) {
        LazySaveableStateHolderProvider(function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
