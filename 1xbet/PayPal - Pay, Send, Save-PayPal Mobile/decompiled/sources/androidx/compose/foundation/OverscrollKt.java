package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "withoutVisualEffect", "(Landroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/foundation/OverscrollEffect;", "withoutEventHandling", "Landroidx/compose/ui/Modifier;", "overscrollEffect", "overscroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/OverscrollEffect;)Landroidx/compose/ui/Modifier;", "rememberOverscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollFactory;", "LocalOverscrollFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollFactory", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverscrollKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.OverscrollFactory> LocalOverscrollFactory = androidx.compose.runtime.CompositionLocalKt.compositionLocalWithComputedDefaultOf(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.OverscrollKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.OverscrollFactory highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.OverscrollKt.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.CompositionLocalAccessorScope) obj);
            return highSpeedVideoFpsRangesFor;
        }
    });

    public static final androidx.compose.foundation.OverscrollEffect withoutVisualEffect(androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        return new androidx.compose.foundation.WrappedOverscrollEffect(false, true, overscrollEffect);
    }

    public static final androidx.compose.foundation.OverscrollEffect withoutEventHandling(androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        return new androidx.compose.foundation.WrappedOverscrollEffect(true, false, overscrollEffect);
    }

    public static final androidx.compose.ui.Modifier overscroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        androidx.compose.ui.Modifier.Companion companion;
        if (overscrollEffect == null || (companion = overscrollEffect.getEffectModifier()) == null) {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        if (companion == androidx.compose.ui.Modifier.INSTANCE) {
            companion = new androidx.compose.foundation.OverscrollModifierElement(overscrollEffect);
        }
        return modifier.then(companion);
    }

    public static final androidx.compose.foundation.OverscrollEffect rememberOverscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(282942128);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(282942128, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        androidx.compose.foundation.OverscrollFactory overscrollFactory = (androidx.compose.foundation.OverscrollFactory) composer.consume(LocalOverscrollFactory);
        if (overscrollFactory == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        boolean changed = composer.changed(overscrollFactory);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = overscrollFactory.createOverscrollEffect();
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect = (androidx.compose.foundation.OverscrollEffect) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return overscrollEffect;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.OverscrollFactory> getLocalOverscrollFactory() {
        return LocalOverscrollFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.OverscrollFactory getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return androidx.compose.foundation.AndroidOverscroll_androidKt.defaultOverscrollFactory(compositionLocalAccessorScope);
    }
}
