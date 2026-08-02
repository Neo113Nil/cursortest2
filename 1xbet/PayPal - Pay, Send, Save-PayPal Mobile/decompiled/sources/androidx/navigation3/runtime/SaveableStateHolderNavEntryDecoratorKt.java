package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberSaveableStateHolderNavEntryDecorator", "Landroidx/navigation3/runtime/SaveableStateHolderNavEntryDecorator;", "T", "", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Landroidx/compose/runtime/Composer;II)Landroidx/navigation3/runtime/SaveableStateHolderNavEntryDecorator;", "navigation3-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaveableStateHolderNavEntryDecoratorKt {
    public static final <T> androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator<T> rememberSaveableStateHolderNavEntryDecorator(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            saveableStateHolder = androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-344159445, i, -1, "androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator (SaveableStateHolderNavEntryDecorator.kt:35)");
        }
        boolean changed = composer.changed(saveableStateHolder);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator(saveableStateHolder);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator<T> saveableStateHolderNavEntryDecorator = (androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return saveableStateHolderNavEntryDecorator;
    }
}
