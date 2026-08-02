package org.betup.ui.common.compose;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ClickAnimationModifier.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aO\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"clickAnimation", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "", "onLongClick", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "animationDuration", "", "pressDuration", "releaseDuration", "scaleFactor", "", "overshootScale", "isAnimation", "animateOnLongClick", "hapticOnClick", "Lorg/betup/ui/common/compose/HapticFeedbackType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Integer;IIFFZZLorg/betup/ui/common/compose/HapticFeedbackType;Landroidx/compose/runtime/Composer;III)Landroidx/compose/ui/Modifier;", "pronouncedClickAnimation", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "subtleClickAnimation", "darkenOnPress", "pressDarkenAlpha", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZIZZFZFLorg/betup/ui/common/compose/HapticFeedbackType;Landroidx/compose/runtime/Composer;III)Landroidx/compose/ui/Modifier;", "app_release", "clickAnimationKey", "isPressed", "pressScale"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClickAnimationModifierKt {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d6, code lost:
    
        if (r43.changed(r12) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        if (r43.changed(r46 == null ? -1 : r46.ordinal()) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03e1, code lost:
    
        if (r43.changed(r46 == null ? -1 : r46.ordinal()) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02bd, code lost:
    
        if (r43.changed(r11) == false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier clickAnimation(Modifier modifier, final Function0<Unit> onClick, Function0<Unit> function0, boolean z, MutableInteractionSource mutableInteractionSource, Integer num, int i, int i2, float f, float f2, boolean z2, boolean z3, HapticFeedbackType hapticFeedbackType, Composer composer, int i3, int i4, int i5) {
        boolean z4;
        int i6;
        int i7;
        int coerceAtLeast;
        HapticFeedbackType hapticFeedbackType2;
        boolean z5;
        int i8;
        boolean z6;
        int intValue;
        View view;
        MutableInteractionSource mutableInteractionSource2;
        float clickAnimation$lambda$7;
        final boolean z7;
        final Function0<Unit> function02;
        boolean z8;
        boolean changedInstance;
        Object rememberedValue;
        Modifier m1057clickableO2vRcR0$default;
        Modifier m1057clickableO2vRcR0$default2;
        Modifier then;
        final boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object rememberedValue2;
        boolean z13;
        boolean changedInstance2;
        Object rememberedValue3;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        composer.startReplaceGroup(775454016);
        Function0<Unit> function03 = (i5 & 2) != 0 ? null : function0;
        boolean z14 = (i5 & 4) != 0 ? true : z;
        MutableInteractionSource mutableInteractionSource3 = (i5 & 8) != 0 ? null : mutableInteractionSource;
        Integer num2 = (i5 & 16) != 0 ? null : num;
        int i9 = (i5 & 32) != 0 ? 40 : i;
        int i10 = (i5 & 64) != 0 ? 120 : i2;
        float f3 = (i5 & 128) != 0 ? 0.95f : f;
        float f4 = (i5 & 256) != 0 ? 1.0f : f2;
        boolean z15 = (i5 & 512) != 0 ? true : z2;
        if ((i5 & 1024) != 0) {
            i6 = i9;
            z4 = true;
        } else {
            z4 = z3;
            i6 = i9;
        }
        HapticFeedbackType hapticFeedbackType3 = (i5 & 2048) != 0 ? null : hapticFeedbackType;
        if (ComposerKt.isTraceInProgress()) {
            i7 = i10;
            ComposerKt.traceEventStart(775454016, i3, i4, "org.betup.ui.common.compose.clickAnimation (ClickAnimationModifier.kt:54)");
        } else {
            i7 = i10;
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view2 = (View) consume;
        boolean z16 = f4 > 1.0f;
        if (z16 && num2 != null) {
            coerceAtLeast = RangesKt.coerceAtLeast((int) (num2.intValue() * 0.4d), 25);
        } else {
            coerceAtLeast = num2 != null ? RangesKt.coerceAtLeast(num2.intValue() / 3, 25) : i6;
        }
        if (!z16 || num2 == null) {
            hapticFeedbackType2 = hapticFeedbackType3;
            z5 = z4;
            i8 = 0;
        } else {
            hapticFeedbackType2 = hapticFeedbackType3;
            z5 = z4;
            i8 = RangesKt.coerceAtLeast((int) (num2.intValue() * 0.2d), 20);
        }
        if (z16 && num2 != null) {
            z6 = z14;
            intValue = RangesKt.coerceAtLeast((int) (num2.intValue() * 0.4d), 25);
        } else {
            z6 = z14;
            intValue = num2 != null ? num2.intValue() : i7;
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            view = view2;
            rememberedValue4 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        } else {
            view = view2;
        }
        Animatable animatable = (Animatable) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue5);
        }
        final MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-2112959428);
        if (mutableInteractionSource3 == null) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue6);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue6;
            composer.endReplaceGroup();
        } else {
            mutableInteractionSource2 = mutableInteractionSource3;
        }
        composer.endReplaceGroup();
        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource2, composer, 0);
        Integer valueOf = Integer.valueOf(clickAnimation$lambda$2(mutableIntState));
        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
        composer.startReplaceGroup(-1224400529);
        Function0<Unit> function04 = function03;
        boolean changed = composer.changed(z16) | composer.changedInstance(animatable) | ((((i3 & 234881024) ^ 100663296) > 67108864 && composer.changed(f3)) || (i3 & 100663296) == 67108864) | composer.changed(coerceAtLeast) | ((((1879048192 & i3) ^ 805306368) > 536870912 && composer.changed(f4)) || (i3 & 805306368) == 536870912) | composer.changed(i8) | composer.changed(intValue);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = (Function2) new ClickAnimationModifierKt$clickAnimation$1$1(z16, animatable, f3, coerceAtLeast, f4, i8, intValue, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, composer, 0);
        if (!z15 || !z6 || !clickAnimation$lambda$5(collectIsPressedAsState) || z16) {
            f3 = 1.0f;
        }
        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f3, AnimationSpecKt.tween$default(clickAnimation$lambda$5(collectIsPressedAsState) ? i6 : i7, 0, null, 6, null), 0.0f, "clickPressScale", null, composer, 3072, 20);
        if (!z15) {
            clickAnimation$lambda$7 = 1.0f;
        } else if (z16) {
            clickAnimation$lambda$7 = ((Number) animatable.getValue()).floatValue();
        } else {
            clickAnimation$lambda$7 = clickAnimation$lambda$7(animateFloatAsState);
        }
        if (function04 != null) {
            composer.startReplaceGroup(-1075863277);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            int i11 = (i3 & 7168) ^ 3072;
            z7 = z6;
            boolean z17 = (i11 > 2048 && composer.changed(z7)) || (i3 & 3072) == 2048;
            if (((i4 & 112) ^ 48) > 32) {
                z9 = z5;
            } else {
                z9 = z5;
            }
            if ((i4 & 48) != 32) {
                z10 = false;
                boolean z18 = z17 | z10;
                if (((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                    function02 = function04;
                } else {
                    function02 = function04;
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                    z11 = false;
                    z12 = z18 | z11;
                    rememberedValue2 = composer.rememberedValue();
                    if (!z12 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit clickAnimation$lambda$10$lambda$9;
                                clickAnimation$lambda$10$lambda$9 = ClickAnimationModifierKt.clickAnimation$lambda$10$lambda$9(z7, z9, function02, mutableIntState);
                                return clickAnimation$lambda$10$lambda$9;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function05 = (Function0) rememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1224400529);
                    boolean z19 = (i11 <= 2048 && composer.changed(z7)) || (i3 & 3072) == 2048;
                    if (((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                    }
                    if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                        z13 = false;
                        boolean z20 = z13 | z19;
                        final View view3 = view;
                        changedInstance2 = z20 | composer.changedInstance(view3) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
                        rememberedValue3 = composer.rememberedValue();
                        if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final HapticFeedbackType hapticFeedbackType4 = hapticFeedbackType2;
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit clickAnimation$lambda$12$lambda$11;
                                    clickAnimation$lambda$12$lambda$11 = ClickAnimationModifierKt.clickAnimation$lambda$12$lambda$11(z7, onClick, hapticFeedbackType4, view3, mutableIntState);
                                    return clickAnimation$lambda$12$lambda$11;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceGroup();
                        m1057clickableO2vRcR0$default = ClickableKt.m1062combinedClickableauXiCPI(companion, mutableInteractionSource4, null, (r25 & 4) != 0 ? true : z7, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : function05, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, (Function0) rememberedValue3);
                        composer.endReplaceGroup();
                    }
                    z13 = true;
                    boolean z202 = z13 | z19;
                    final View view32 = view;
                    changedInstance2 = z202 | composer.changedInstance(view32) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
                    rememberedValue3 = composer.rememberedValue();
                    if (!changedInstance2) {
                    }
                    final HapticFeedbackType hapticFeedbackType42 = hapticFeedbackType2;
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit clickAnimation$lambda$12$lambda$11;
                            clickAnimation$lambda$12$lambda$11 = ClickAnimationModifierKt.clickAnimation$lambda$12$lambda$11(z7, onClick, hapticFeedbackType42, view32, mutableIntState);
                            return clickAnimation$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                    composer.endReplaceGroup();
                    m1057clickableO2vRcR0$default = ClickableKt.m1062combinedClickableauXiCPI(companion, mutableInteractionSource4, null, (r25 & 4) != 0 ? true : z7, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : function05, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, (Function0) rememberedValue3);
                    composer.endReplaceGroup();
                }
                z11 = true;
                z12 = z18 | z11;
                rememberedValue2 = composer.rememberedValue();
                if (!z12) {
                }
                rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit clickAnimation$lambda$10$lambda$9;
                        clickAnimation$lambda$10$lambda$9 = ClickAnimationModifierKt.clickAnimation$lambda$10$lambda$9(z7, z9, function02, mutableIntState);
                        return clickAnimation$lambda$10$lambda$9;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
                Function0 function052 = (Function0) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                if (i11 <= 2048) {
                }
                if (((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                }
                if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                }
                z13 = true;
                boolean z2022 = z13 | z19;
                final View view322 = view;
                changedInstance2 = z2022 | composer.changedInstance(view322) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
                rememberedValue3 = composer.rememberedValue();
                if (!changedInstance2) {
                }
                final HapticFeedbackType hapticFeedbackType422 = hapticFeedbackType2;
                rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit clickAnimation$lambda$12$lambda$11;
                        clickAnimation$lambda$12$lambda$11 = ClickAnimationModifierKt.clickAnimation$lambda$12$lambda$11(z7, onClick, hapticFeedbackType422, view322, mutableIntState);
                        return clickAnimation$lambda$12$lambda$11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
                composer.endReplaceGroup();
                m1057clickableO2vRcR0$default = ClickableKt.m1062combinedClickableauXiCPI(companion, mutableInteractionSource4, null, (r25 & 4) != 0 ? true : z7, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : function052, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, (Function0) rememberedValue3);
                composer.endReplaceGroup();
            }
            z10 = true;
            boolean z182 = z17 | z10;
            if (((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            }
            z11 = true;
            z12 = z182 | z11;
            rememberedValue2 = composer.rememberedValue();
            if (!z12) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit clickAnimation$lambda$10$lambda$9;
                    clickAnimation$lambda$10$lambda$9 = ClickAnimationModifierKt.clickAnimation$lambda$10$lambda$9(z7, z9, function02, mutableIntState);
                    return clickAnimation$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
            Function0 function0522 = (Function0) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            if (i11 <= 2048) {
            }
            if (((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
            }
            if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            }
            z13 = true;
            boolean z20222 = z13 | z19;
            final View view3222 = view;
            changedInstance2 = z20222 | composer.changedInstance(view3222) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
            rememberedValue3 = composer.rememberedValue();
            if (!changedInstance2) {
            }
            final HapticFeedbackType hapticFeedbackType4222 = hapticFeedbackType2;
            rememberedValue3 = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit clickAnimation$lambda$12$lambda$11;
                    clickAnimation$lambda$12$lambda$11 = ClickAnimationModifierKt.clickAnimation$lambda$12$lambda$11(z7, onClick, hapticFeedbackType4222, view3222, mutableIntState);
                    return clickAnimation$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
            composer.endReplaceGroup();
            m1057clickableO2vRcR0$default = ClickableKt.m1062combinedClickableauXiCPI(companion, mutableInteractionSource4, null, (r25 & 4) != 0 ? true : z7, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : function0522, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, (Function0) rememberedValue3);
            composer.endReplaceGroup();
        } else {
            z7 = z6;
            final View view4 = view;
            function02 = function04;
            composer.startReplaceGroup(-1075308935);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            boolean z21 = (((i3 & 7168) ^ 3072) > 2048 && composer.changed(z7)) || (i3 & 3072) == 2048;
            if (((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
            }
            if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                z8 = false;
                changedInstance = z8 | z21 | composer.changedInstance(view4) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
                rememberedValue = composer.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final HapticFeedbackType hapticFeedbackType5 = hapticFeedbackType2;
                    rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit clickAnimation$lambda$14$lambda$13;
                            clickAnimation$lambda$14$lambda$13 = ClickAnimationModifierKt.clickAnimation$lambda$14$lambda$13(z7, onClick, hapticFeedbackType5, view4, mutableIntState);
                            return clickAnimation$lambda$14$lambda$13;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                m1057clickableO2vRcR0$default = ClickableKt.m1057clickableO2vRcR0$default(companion2, mutableInteractionSource4, null, z7, null, null, (Function0) rememberedValue, 24, null);
                composer.endReplaceGroup();
            }
            z8 = true;
            changedInstance = z8 | z21 | composer.changedInstance(view4) | ((((i3 & 112) ^ 48) <= 32 && composer.changed(onClick)) || (i3 & 48) == 32);
            rememberedValue = composer.rememberedValue();
            if (!changedInstance) {
            }
            final HapticFeedbackType hapticFeedbackType52 = hapticFeedbackType2;
            rememberedValue = new Function0() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit clickAnimation$lambda$14$lambda$13;
                    clickAnimation$lambda$14$lambda$13 = ClickAnimationModifierKt.clickAnimation$lambda$14$lambda$13(z7, onClick, hapticFeedbackType52, view4, mutableIntState);
                    return clickAnimation$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            m1057clickableO2vRcR0$default = ClickableKt.m1057clickableO2vRcR0$default(companion2, mutableInteractionSource4, null, z7, null, null, (Function0) rememberedValue, 24, null);
            composer.endReplaceGroup();
        }
        if (z15) {
            then = ScaleKt.scale(Modifier.INSTANCE, clickAnimation$lambda$7).then(modifier).then(m1057clickableO2vRcR0$default);
        } else {
            if (function02 == null) {
                m1057clickableO2vRcR0$default2 = ClickableKt.m1057clickableO2vRcR0$default(Modifier.INSTANCE, mutableInteractionSource4, null, z7, null, null, onClick, 24, null);
            } else {
                m1057clickableO2vRcR0$default2 = ClickableKt.m1062combinedClickableauXiCPI(Modifier.INSTANCE, mutableInteractionSource4, null, (r25 & 4) != 0 ? true : z7, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : function02, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0, onClick);
            }
            then = modifier.then(m1057clickableO2vRcR0$default2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int clickAnimation$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final void clickAnimation$triggerClickHaptic(HapticFeedbackType hapticFeedbackType, View view) {
        if (hapticFeedbackType != null) {
            HapticFeedbackEffect.perform(view, hapticFeedbackType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickAnimation$lambda$12$lambda$11(boolean z, Function0 function0, HapticFeedbackType hapticFeedbackType, View view, MutableIntState mutableIntState) {
        if (z) {
            clickAnimation$triggerClickHaptic(hapticFeedbackType, view);
            mutableIntState.setIntValue(clickAnimation$lambda$2(mutableIntState) + 1);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickAnimation$lambda$10$lambda$9(boolean z, boolean z2, Function0 function0, MutableIntState mutableIntState) {
        if (z) {
            if (z2) {
                mutableIntState.setIntValue(clickAnimation$lambda$2(mutableIntState) + 1);
            }
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickAnimation$lambda$14$lambda$13(boolean z, Function0 function0, HapticFeedbackType hapticFeedbackType, View view, MutableIntState mutableIntState) {
        if (z) {
            clickAnimation$triggerClickHaptic(hapticFeedbackType, view);
            mutableIntState.setIntValue(clickAnimation$lambda$2(mutableIntState) + 1);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Modifier pronouncedClickAnimation(Modifier modifier, Function0<Unit> onClick, Function0<Unit> function0, boolean z, int i, boolean z2, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        composer.startReplaceGroup(-1920889492);
        Function0<Unit> function02 = (i3 & 2) != 0 ? null : function0;
        boolean z3 = (i3 & 4) != 0 ? true : z;
        int i4 = (i3 & 8) != 0 ? 200 : i;
        boolean z4 = (i3 & 16) != 0 ? true : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1920889492, i2, -1, "org.betup.ui.common.compose.pronouncedClickAnimation (ClickAnimationModifier.kt:187)");
        }
        Modifier clickAnimation = clickAnimation(modifier, onClick, function02, z3, null, Integer.valueOf(i4), 0, 0, 0.9f, 0.0f, false, z4, null, composer, (i2 & 14) | 100663296 | (i2 & 112) | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168) | ((i2 << 3) & 458752), (i2 >> 12) & 112, 2920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return clickAnimation;
    }

    public static final Modifier subtleClickAnimation(Modifier modifier, Function0<Unit> onClick, Function0<Unit> function0, boolean z, int i, boolean z2, boolean z3, float f, boolean z4, float f2, HapticFeedbackType hapticFeedbackType, Composer composer, int i2, int i3, int i4) {
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        composer.startReplaceGroup(-178380522);
        Function0<Unit> function02 = (i4 & 2) != 0 ? null : function0;
        boolean z5 = (i4 & 4) != 0 ? true : z;
        int i5 = (i4 & 8) != 0 ? 100 : i;
        boolean z6 = (i4 & 16) != 0 ? true : z2;
        boolean z7 = (i4 & 32) != 0 ? true : z3;
        float f3 = (i4 & 64) != 0 ? 0.98f : f;
        boolean z8 = (i4 & 128) != 0 ? true : z4;
        final float f4 = (i4 & 256) != 0 ? 0.08f : f2;
        HapticFeedbackType hapticFeedbackType2 = (i4 & 512) != 0 ? null : hapticFeedbackType;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-178380522, i2, i3, "org.betup.ui.common.compose.subtleClickAnimation (ClickAnimationModifier.kt:217)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
        composer.endReplaceGroup();
        final State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composer, 6);
        composer.startReplaceGroup(375028737);
        if (z8 && z5) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean changed = ((((1879048192 & i2) ^ 805306368) > 536870912 && composer.changed(f4)) || (i2 & 805306368) == 536870912) | composer.changed(collectIsPressedAsState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.ClickAnimationModifierKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit subtleClickAnimation$lambda$18$lambda$17;
                        subtleClickAnimation$lambda$18$lambda$17 = ClickAnimationModifierKt.subtleClickAnimation$lambda$18$lambda$17(f4, collectIsPressedAsState, (ContentDrawScope) obj);
                        return subtleClickAnimation$lambda$18$lambda$17;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            companion = DrawModifierKt.drawWithContent(companion2, (Function1) rememberedValue2);
        } else {
            companion = Modifier.INSTANCE;
        }
        composer.endReplaceGroup();
        int i6 = i2 << 3;
        Modifier then = clickAnimation(modifier, onClick, function02, z5, mutableInteractionSource, Integer.valueOf(i5), 0, 0, f3, 0.0f, z7, z6, hapticFeedbackType2, composer, (i2 & 14) | 24576 | (i2 & 112) | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i2 & 7168) | (458752 & i6) | (i6 & 234881024), ((i2 >> 12) & 112) | ((i2 >> 18) & 14) | ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 352).then(companion);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subtleClickAnimation$lambda$18$lambda$17(float f, State state, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (subtleClickAnimation$lambda$16(state)) {
            DrawScope.m5724drawRectnJ9OG0$default(drawWithContent, Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), RangesKt.coerceIn(f, 0.0f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return Unit.INSTANCE;
    }

    private static final boolean clickAnimation$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float clickAnimation$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final boolean subtleClickAnimation$lambda$16(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
