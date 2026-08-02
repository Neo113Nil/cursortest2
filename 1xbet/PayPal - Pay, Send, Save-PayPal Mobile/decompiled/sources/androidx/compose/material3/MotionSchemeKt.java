package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"T", "Landroidx/compose/material3/MotionScheme;", "Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "fromToken", "(Landroidx/compose/material3/MotionScheme;Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;)Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/material3/tokens/MotionSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MotionSchemeKt {
    public static final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> fromToken(androidx.compose.material3.MotionScheme motionScheme, androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens) {
        switch (androidx.compose.material3.MotionSchemeKt.WhenMappings.$EnumSwitchMapping$0[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                return motionScheme.defaultSpatialSpec();
            case 2:
                return motionScheme.fastSpatialSpec();
            case 3:
                return motionScheme.slowSpatialSpec();
            case 4:
                return motionScheme.defaultEffectsSpec();
            case 5:
                return motionScheme.fastEffectsSpec();
            case 6:
                return motionScheme.slowEffectsSpec();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final <T> androidx.compose.animation.core.FiniteAnimationSpec<T> value(androidx.compose.material3.tokens.MotionSchemeKeyTokens motionSchemeKeyTokens, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-19828261, i, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        androidx.compose.animation.core.FiniteAnimationSpec<T> fromToken = fromToken(androidx.compose.material3.MaterialTheme.INSTANCE.getMotionScheme(composer, 6), motionSchemeKeyTokens);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.tokens.MotionSchemeKeyTokens.values().length];
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowSpatial.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultEffects.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
