package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolder;", "rememberSaveableStateHolder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.saveable.SaveableStateHolderImpl getHighSpeedVideoFpsRanges() {
        return new androidx.compose.runtime.saveable.SaveableStateHolderImpl(null, 1, 0 == true ? 1 : 0);
    }

    public static final androidx.compose.runtime.saveable.SaveableStateHolder rememberSaveableStateHolder(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        composer.startReplaceGroup(1967007413);
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.runtime.saveable.SaveableStateHolderImpl, ?> saver = androidx.compose.runtime.saveable.SaveableStateHolderImpl.INSTANCE.getSaver();
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.runtime.saveable.SaveableStateHolderImpl highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.runtime.saveable.SaveableStateHolderKt.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl = (androidx.compose.runtime.saveable.SaveableStateHolderImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 384);
        saveableStateHolderImpl.getHighSpeedVideoSizes((androidx.compose.runtime.saveable.SaveableStateRegistry) composer.consume(androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }
}
