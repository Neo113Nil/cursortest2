package androidx.compose.foundation;

/* compiled from: BasicTooltip.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a+\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BasicTooltipState", "Landroidx/compose/foundation/BasicTooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    public static final androidx.compose.foundation.BasicTooltipState rememberBasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1123859613);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberBasicTooltipState)82@3676L237:BasicTooltip.kt#71ulvw");
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = androidx.compose.foundation.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1123859613, i, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:82)");
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
        composer.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf) | composer.changed(mutatorMutex);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.BasicTooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.BasicTooltipStateImpl basicTooltipStateImpl = (androidx.compose.foundation.BasicTooltipStateImpl) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return basicTooltipStateImpl;
    }

    public static /* synthetic */ androidx.compose.foundation.BasicTooltipState BasicTooltipState$default(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = androidx.compose.foundation.BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, mutatorMutex);
    }

    public static final androidx.compose.foundation.BasicTooltipState BasicTooltipState(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex) {
        return new androidx.compose.foundation.BasicTooltipStateImpl(z, z2, mutatorMutex);
    }
}
