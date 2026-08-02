package org.betup.ui.common.video;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* compiled from: VideoOfferMotion.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"rememberVideoOfferMotion", "Lorg/betup/ui/common/video/VideoOfferMotion;", TypedValues.CycleType.S_WAVE_PHASE, "Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "(Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;Landroidx/compose/runtime/Composer;I)Lorg/betup/ui/common/video/VideoOfferMotion;", "withAnimatedEllipsis", "", "ellipsis", "app_release", "checkingScale", "", "previousPhase", "dots", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoOfferMotionKt {
    public static final VideoOfferMotion rememberVideoOfferMotion(VideoOfferAvailabilityPhase phase, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        composer.startReplaceGroup(210923057);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(210923057, i, -1, "org.betup.ui.common.video.rememberVideoOfferMotion (VideoOfferMotion.kt:24)");
        }
        boolean z = phase == VideoOfferAvailabilityPhase.CHECKING;
        State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("videoOfferChecking", composer, 6, 0), 0.995f, 1.012f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "videoOfferPulse", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(phase, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        int i2 = i & 14;
        boolean changedInstance = (((i2 ^ 6) > 4 && composer.changed(phase.ordinal())) || (i & 6) == 4) | composer.changedInstance(animatable);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function2) new VideoOfferMotionKt$rememberVideoOfferMotion$1$1(phase, animatable, mutableState, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(phase, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, i2);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(1);
            composer.updateRememberedValue(rememberedValue4);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
        composer.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(z);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(z);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = (Function2) new VideoOfferMotionKt$rememberVideoOfferMotion$2$1(z, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer, 0);
        VideoOfferMotion videoOfferMotion = new VideoOfferMotion(z ? rememberVideoOfferMotion$lambda$0(animateFloat) : ((Number) animatable.getValue()).floatValue(), StringsKt.repeat(".", rememberVideoOfferMotion$lambda$7(mutableIntState)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return videoOfferMotion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoOfferAvailabilityPhase rememberVideoOfferMotion$lambda$3(MutableState<VideoOfferAvailabilityPhase> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rememberVideoOfferMotion$lambda$7(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final String withAnimatedEllipsis(String str, String ellipsis) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(ellipsis, "ellipsis");
        return StringsKt.trimEnd(StringsKt.trimEnd((CharSequence) str).toString(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, Typography.ellipsis) + ellipsis;
    }

    private static final float rememberVideoOfferMotion$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
