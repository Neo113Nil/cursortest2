package androidx.compose.runtime.saveable;

/* compiled from: SaveableStateHolder.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    public static final androidx.compose.runtime.saveable.SaveableStateHolder rememberSaveableStateHolder(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(15454635);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSaveableStateHolder)*59@2369L111,64@2554L7:SaveableStateHolder.kt#r2ddri");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        androidx.compose.runtime.saveable.SaveableStateHolderImpl saveableStateHolderImpl = (androidx.compose.runtime.saveable.SaveableStateHolderImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) androidx.compose.runtime.saveable.SaveableStateHolderImpl.INSTANCE.getSaver(), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.runtime.saveable.SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$rememberSaveableStateHolder$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.runtime.saveable.SaveableStateHolderImpl invoke() {
                return new androidx.compose.runtime.saveable.SaveableStateHolderImpl(null, 1, null);
            }
        }, composer, 3080, 4);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.saveable.SaveableStateRegistry> localSaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localSaveableStateRegistry);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        saveableStateHolderImpl.setParentSaveableStateRegistry((androidx.compose.runtime.saveable.SaveableStateRegistry) consume);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return saveableStateHolderImpl;
    }
}
