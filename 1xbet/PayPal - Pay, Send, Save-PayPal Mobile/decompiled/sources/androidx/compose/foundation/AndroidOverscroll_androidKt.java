package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\tH\u0000\u001a\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0013\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0014\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"rememberPlatformOverscrollFactory", "Landroidx/compose/foundation/OverscrollFactory;", "glowColor", "Landroidx/compose/ui/graphics/Color;", "glowDrawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "rememberPlatformOverscrollFactory-3J-VO9M", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/OverscrollFactory;", "defaultOverscrollFactory", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "rememberPlatformOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "destretchMultiplier", "", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "destretchMultiplier-GyEprt8", "(I)F", "FlingDestretchFactor", "DefaultGlowColor", "J", "DefaultGlowPaddingValues", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final long getHighSpeedVideoFpsRanges = androidx.compose.ui.graphics.ColorKt.Color(4284900966L);
    private static final androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);

    /* renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final androidx.compose.foundation.OverscrollFactory m1284rememberPlatformOverscrollFactory3JVO9M(long j, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = getHighSpeedVideoFpsRanges;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            paddingValues = getHighSpeedVideoFpsRangesFor;
        }
        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2017030679, i, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
        }
        androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = new androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()), j2, paddingValues2, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollFactory;
    }

    public static final androidx.compose.foundation.OverscrollFactory defaultOverscrollFactory(androidx.compose.runtime.CompositionLocalAccessorScope compositionLocalAccessorScope) {
        android.content.Context context = (android.content.Context) compositionLocalAccessorScope.getCurrentValue(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) compositionLocalAccessorScope.getCurrentValue(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration = (androidx.compose.foundation.OverscrollConfiguration) compositionLocalAccessorScope.getCurrentValue(androidx.compose.foundation.OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
    }

    public static final androidx.compose.foundation.OverscrollEffect rememberPlatformOverscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1569526143, i, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.foundation.OverscrollConfiguration overscrollConfiguration = (androidx.compose.foundation.OverscrollConfiguration) composer.consume(androidx.compose.foundation.OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            composer.startReplaceGroup(-1555403601);
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = null;
        } else {
            composer.startReplaceGroup(-1555370896);
            boolean changed = composer.changed(context);
            boolean changed2 = composer.changed(density);
            boolean changed3 = composer.changed(overscrollConfiguration);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object androidEdgeEffectOverscrollEffect2 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect(context, density, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
                composer.updateRememberedValue(androidEdgeEffectOverscrollEffect2);
                rememberedValue = androidEdgeEffectOverscrollEffect2;
            }
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(int i) {
        return androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(i, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI()) ? 4.0f : 1.0f;
    }
}
