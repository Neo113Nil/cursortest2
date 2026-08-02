package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcoil3/compose/ConstraintsSizeResolver;", "rememberConstraintsSizeResolver", "(Landroidx/compose/runtime/Composer;I)Lcoil3/compose/ConstraintsSizeResolver;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConstraintsSizeResolverKt {
    public static final coil3.compose.ConstraintsSizeResolver rememberConstraintsSizeResolver(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-34261202, i, -1, "coil3.compose.rememberConstraintsSizeResolver (ConstraintsSizeResolver.kt:22)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new coil3.compose.ConstraintsSizeResolver();
            composer.updateRememberedValue(rememberedValue);
        }
        coil3.compose.ConstraintsSizeResolver constraintsSizeResolver = (coil3.compose.ConstraintsSizeResolver) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return constraintsSizeResolver;
    }
}
