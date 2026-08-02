package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxDefaults;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "positionalThreshold"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.SwipeToDismissBoxDefaults INSTANCE = new androidx.compose.material3.SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getPositionalThreshold(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1545861529, i, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:362)");
        }
        composer.startReplaceGroup(-485754360);
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SwipeToDismissBoxDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    float mo1418toPx0680j_4;
                    androidx.compose.ui.unit.Density density2 = androidx.compose.ui.unit.Density.this;
                    ((java.lang.Float) obj).floatValue();
                    mo1418toPx0680j_4 = density2.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f));
                    return java.lang.Float.valueOf(mo1418toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function1;
    }
}
