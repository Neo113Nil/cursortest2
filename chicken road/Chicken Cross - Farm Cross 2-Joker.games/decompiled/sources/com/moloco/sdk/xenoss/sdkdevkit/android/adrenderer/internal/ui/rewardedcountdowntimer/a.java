package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.internal.C4776d;
import com.moloco.sdk.internal.ortb.model.k;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final Unit a(k kVar, int i, int i2, Function0 function0, int i3, Composer composer, int i4) {
        a(kVar, i, i2, function0, composer, i3 | 1);
        return Unit.INSTANCE;
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final void a(final k countDownTimer, final int i, final int i2, final Function0<Unit> onTimerFinish, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(countDownTimer, "countDownTimer");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(-1599911995);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(countDownTimer) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changed(onTimerFinish) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1599911995, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:18)");
            }
            float m3840constructorimpl = Dp.m3840constructorimpl(countDownTimer.getCircleSize());
            long m3862DpSizeYgX7TsA = DpKt.m3862DpSizeYgX7TsA(m3840constructorimpl, m3840constructorimpl);
            Alignment a2 = C4776d.a(countDownTimer.getHorizontalAlignment(), countDownTimer.getVerticalAlignment());
            long backgroundColor = countDownTimer.getBackgroundColor();
            long foregroundColor = countDownTimer.getForegroundColor();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(a2, false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (countDownTimer.getIsDefaultTimer()) {
                startRestartGroup.startReplaceableGroup(2067666933);
                startRestartGroup.startReplaceableGroup(-210384916);
                final String str = "rewarded_countdown_timer";
                boolean changed = startRestartGroup.changed("rewarded_countdown_timer");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a.a(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                int i5 = 458752 & (i4 << 6);
                int i6 = i4 << 18;
                composer2 = startRestartGroup;
                c.a(backgroundColor, foregroundColor, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), 0.0f, DpSize.m3938getWidthD9Ej5fM(m3862DpSizeYgX7TsA), onTimerFinish, null, i, i2, startRestartGroup, (234881024 & i6) | i5 | (29360128 & i6), 72);
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                String customTimerDesc = countDownTimer.getCustomTimerDesc();
                if (customTimerDesc == null || customTimerDesc.length() <= 0) {
                    composer2.startReplaceableGroup(2069220715);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(2068452876);
                    String customTimerDesc2 = countDownTimer.getCustomTimerDesc();
                    composer2.startReplaceableGroup(-210357300);
                    final String str2 = "rewarded_countdown_timer_custom";
                    boolean changed2 = composer2.changed("rewarded_countdown_timer_custom");
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return a.b(str2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    int i7 = 458752 & (i4 << 6);
                    int i8 = i4 << 21;
                    b.a(backgroundColor, foregroundColor, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null), 0.0f, DpSize.m3938getWidthD9Ej5fM(m3862DpSizeYgX7TsA), onTimerFinish, customTimerDesc2, null, i, i2, composer2, (234881024 & i8) | i7 | (1879048192 & i8), 136);
                    composer2.endReplaceableGroup();
                }
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(k.this, i, i2, onTimerFinish, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final float a(int i, int i2) {
        int compare;
        compare = Integer.compare(i2 ^ Integer.MIN_VALUE, 1 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return i == 0 ? 0.0f : 1.0f;
        }
        return (((float) UnsignedKt.uintToDouble(i)) - 1.0f) / (((float) UnsignedKt.uintToDouble(i2)) - 1.0f);
    }
}
