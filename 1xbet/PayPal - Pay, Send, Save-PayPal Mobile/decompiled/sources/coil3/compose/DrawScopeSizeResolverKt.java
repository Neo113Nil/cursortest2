package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil3/compose/DrawScopeSizeResolver;", "rememberDrawScopeSizeResolver", "(Landroidx/compose/runtime/Composer;I)Lcoil3/compose/DrawScopeSizeResolver;", "DrawScopeSizeResolver", "()Lcoil3/compose/DrawScopeSizeResolver;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrawScopeSizeResolverKt {
    public static final coil3.compose.DrawScopeSizeResolver rememberDrawScopeSizeResolver(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2057132148, i, -1, "coil3.compose.rememberDrawScopeSizeResolver (DrawScopeSizeResolver.kt:26)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = DrawScopeSizeResolver();
            composer.updateRememberedValue(rememberedValue);
        }
        coil3.compose.DrawScopeSizeResolver drawScopeSizeResolver = (coil3.compose.DrawScopeSizeResolver) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return drawScopeSizeResolver;
    }

    public static final coil3.compose.DrawScopeSizeResolver DrawScopeSizeResolver() {
        return new coil3.compose.RealDrawScopeSizeResolver();
    }
}
