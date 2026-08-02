package org.betup.ui.common.balance;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import com.ironsource.X2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: BalanceAnimatedAmount.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a:\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001bH\u0082@¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"BalanceAnimatedAmount", "", "balance", "", "previousBalance", "animationMode", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", "BalanceAnimatedAmount-L10cc54", "(JJILandroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "CounterBalance", "CounterBalance-vHmCa5Y", "(JJJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TickerBalance", "TickerBalance-vHmCa5Y", "firstChangedIndex", SentryThread.JsonKeys.CURRENT, "", "previous", "animateBalanceLong", "from", "to", "durationMillis", "onFrame", "Lkotlin/Function1;", "(JJILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release", "animatedValue", "holdHighlight", "", "animatedAccent", "Landroidx/compose/ui/graphics/Color;", "digitColor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceAnimatedAmountKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BalanceAnimatedAmount_L10cc54$lambda$0(long j, long j2, int i, Modifier modifier, long j3, int i2, int i3, Composer composer, int i4) {
        m12877BalanceAnimatedAmountL10cc54(j, j2, i, modifier, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CounterBalance_vHmCa5Y$lambda$15(long j, long j2, long j3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12878CounterBalancevHmCa5Y(j, j2, j3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$24(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerBalance_vHmCa5Y$lambda$32(long j, long j2, long j3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m12879TickerBalancevHmCa5Y(j, j2, j3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* renamed from: BalanceAnimatedAmount-L10cc54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12877BalanceAnimatedAmountL10cc54(final long j, final long j2, final int i, Modifier modifier, long j3, Composer composer, final int i2, final int i3) {
        long j4;
        int i4;
        Modifier modifier2;
        int i5;
        long j5;
        final Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1502990564);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            j4 = j;
        } else {
            j4 = j;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changed(j4) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                j5 = j3;
                i4 |= startRestartGroup.changed(j5) ? 16384 : 8192;
                if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    long sp = i5 != 0 ? TextUnitKt.getSp(34) : j5;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1502990564, i4, -1, "org.betup.ui.common.balance.BalanceAnimatedAmount (BalanceAnimatedAmount.kt:48)");
                    }
                    long j6 = j2 < 0 ? j4 : j2;
                    if (i == 2) {
                        startRestartGroup.startReplaceGroup(-1264909368);
                        m12878CounterBalancevHmCa5Y(j, j6, sp, companion, startRestartGroup, (i4 & 14) | ((i4 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1264903321);
                        m12879TickerBalancevHmCa5Y(j, j6, sp, companion, startRestartGroup, (i4 & 14) | ((i4 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i4 & 7168), 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = sp;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final long j7 = j5;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BalanceAnimatedAmount_L10cc54$lambda$0;
                            BalanceAnimatedAmount_L10cc54$lambda$0 = BalanceAnimatedAmountKt.BalanceAnimatedAmount_L10cc54$lambda$0(j, j2, i, companion, j7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return BalanceAnimatedAmount_L10cc54$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            j5 = j3;
            if ((i4 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (j2 < 0) {
            }
            if (i == 2) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            j5 = sp;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        j5 = j3;
        if ((i4 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (j2 < 0) {
        }
        if (i == 2) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        j5 = sp;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028d  */
    /* renamed from: CounterBalance-vHmCa5Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m12878CounterBalancevHmCa5Y(final long j, final long j2, final long j3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object rememberedValue;
        Long valueOf;
        Long valueOf2;
        int i5;
        boolean z;
        BalanceAnimatedAmountKt$CounterBalance$1$1 rememberedValue2;
        Long l;
        Long l2;
        int i6;
        int i7;
        boolean changed;
        Object rememberedValue3;
        boolean z2;
        Object rememberedValue4;
        boolean changed2;
        Object rememberedValue5;
        boolean z3;
        boolean z4;
        boolean z5;
        Object rememberedValue6;
        MutableState mutableState;
        boolean changed3;
        BalanceAnimatedAmountKt$CounterBalance$2$1 rememberedValue7;
        long j4;
        Composer composer2;
        String str;
        int i8;
        final Modifier modifier3;
        long j5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(507650798);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(507650798, i4, -1, "org.betup.ui.common.balance.CounterBalance (BalanceAnimatedAmount.kt:72)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotLongStateKt.mutableLongStateOf(j);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableLongState mutableLongState = (MutableLongState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                valueOf = Long.valueOf(j);
                valueOf2 = Long.valueOf(j2);
                startRestartGroup.startReplaceGroup(-1746271574);
                i5 = i4 & 112;
                int i10 = i4 & 14;
                z = (i5 != 32) | (i10 != 4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    l = valueOf2;
                    l2 = valueOf;
                    i6 = i4;
                    i7 = i5;
                    rememberedValue2 = new BalanceAnimatedAmountKt$CounterBalance$1$1(j2, j, mutableLongState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    i7 = i5;
                    l = valueOf2;
                    l2 = valueOf;
                    i6 = i4;
                }
                startRestartGroup.endReplaceGroup();
                int i11 = i6 & 126;
                EffectsKt.LaunchedEffect(l2, l, (Function2) rememberedValue2, startRestartGroup, i11);
                long CounterBalance_vHmCa5Y$lambda$2 = CounterBalance_vHmCa5Y$lambda$2(mutableLongState);
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(CounterBalance_vHmCa5Y$lambda$2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = FormatHelper.getDialogBetcoinsFormated(CounterBalance_vHmCa5Y$lambda$2(mutableLongState));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                String str2 = (String) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                z2 = i7 != 32;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = FormatHelper.getDialogBetcoinsFormated(j2);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                String str3 = (String) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changed2 = startRestartGroup.changed(str2) | startRestartGroup.changed(str3);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNull(str2);
                    Intrinsics.checkNotNull(str3);
                    rememberedValue5 = Integer.valueOf(firstChangedIndex(str2, str3));
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                int intValue = ((Number) rememberedValue5).intValue();
                startRestartGroup.endReplaceGroup();
                z3 = j <= j2;
                z4 = j >= j2;
                startRestartGroup.startReplaceGroup(-1633490746);
                z5 = (i10 != 4) | (i7 != 32);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z3 || z4), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                mutableState = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                Long valueOf3 = Long.valueOf(j);
                Long valueOf4 = Long.valueOf(j2);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed3 = startRestartGroup.changed(z3) | startRestartGroup.changed(z4) | startRestartGroup.changed(mutableState);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new BalanceAnimatedAmountKt$CounterBalance$2$1(z3, z4, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3, valueOf4, (Function2) rememberedValue7, startRestartGroup, i11);
                if (CounterBalance_vHmCa5Y$lambda$9(mutableState) || !z3) {
                    j4 = (CounterBalance_vHmCa5Y$lambda$9(mutableState) || !z4) ? ComposeUtils.AppColorPalette.White.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j4 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                }
                composer2 = startRestartGroup;
                State<Color> m902animateColorAsStateeuL9pac = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(j4, AnimationSpecKt.tween$default(Color.m5169equalsimpl0(j4, ComposeUtils.AppColorPalette.White.INSTANCE.getColor()) ? 0 : 900, 0, null, 6, null), "counter_accent", null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                Intrinsics.checkNotNull(str2);
                str = str2;
                i8 = 0;
                int i12 = 0;
                while (i8 < str.length()) {
                    char charAt = str.charAt(i8);
                    int i13 = i12 + 1;
                    boolean z6 = z3 && CounterBalance_vHmCa5Y$lambda$9(mutableState) && intValue >= 0 && i12 >= intValue && Character.isDigit(charAt);
                    boolean z7 = z4 && CounterBalance_vHmCa5Y$lambda$9(mutableState);
                    if (z6) {
                        j5 = CounterBalance_vHmCa5Y$lambda$12(m902animateColorAsStateeuL9pac);
                    } else if (z7) {
                        j5 = CounterBalance_vHmCa5Y$lambda$12(m902animateColorAsStateeuL9pac);
                    } else {
                        j5 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    }
                    builder.pushStyle(new SpanStyle(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null));
                    builder.append(charAt);
                    builder.pop();
                    i8++;
                    i12 = i13;
                }
                TextKt.m2643TextIbK3jfQ(builder.toAnnotatedString(), modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, new TextStyle(0L, j3, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer2, (i6 >> 6) & 112, X2.b.f, 116732);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CounterBalance_vHmCa5Y$lambda$15;
                        CounterBalance_vHmCa5Y$lambda$15 = BalanceAnimatedAmountKt.CounterBalance_vHmCa5Y$lambda$15(j, j2, j3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CounterBalance_vHmCa5Y$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableLongState mutableLongState2 = (MutableLongState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        valueOf = Long.valueOf(j);
        valueOf2 = Long.valueOf(j2);
        startRestartGroup.startReplaceGroup(-1746271574);
        i5 = i4 & 112;
        int i102 = i4 & 14;
        z = (i5 != 32) | (i102 != 4);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (z) {
        }
        l = valueOf2;
        l2 = valueOf;
        i6 = i4;
        i7 = i5;
        rememberedValue2 = new BalanceAnimatedAmountKt$CounterBalance$1$1(j2, j, mutableLongState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        int i112 = i6 & 126;
        EffectsKt.LaunchedEffect(l2, l, (Function2) rememberedValue2, startRestartGroup, i112);
        long CounterBalance_vHmCa5Y$lambda$22 = CounterBalance_vHmCa5Y$lambda$2(mutableLongState2);
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(CounterBalance_vHmCa5Y$lambda$22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = FormatHelper.getDialogBetcoinsFormated(CounterBalance_vHmCa5Y$lambda$2(mutableLongState2));
        startRestartGroup.updateRememberedValue(rememberedValue3);
        String str22 = (String) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i7 != 32) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = FormatHelper.getDialogBetcoinsFormated(j2);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        String str32 = (String) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(str22) | startRestartGroup.changed(str32);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        Intrinsics.checkNotNull(str22);
        Intrinsics.checkNotNull(str32);
        rememberedValue5 = Integer.valueOf(firstChangedIndex(str22, str32));
        startRestartGroup.updateRememberedValue(rememberedValue5);
        int intValue2 = ((Number) rememberedValue5).intValue();
        startRestartGroup.endReplaceGroup();
        if (j <= j2) {
        }
        if (j >= j2) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        z5 = (i102 != 4) | (i7 != 32);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z3 || z4), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        mutableState = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        Long valueOf32 = Long.valueOf(j);
        Long valueOf42 = Long.valueOf(j2);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed3 = startRestartGroup.changed(z3) | startRestartGroup.changed(z4) | startRestartGroup.changed(mutableState);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue7 = new BalanceAnimatedAmountKt$CounterBalance$2$1(z3, z4, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, valueOf42, (Function2) rememberedValue7, startRestartGroup, i112);
        if (CounterBalance_vHmCa5Y$lambda$9(mutableState)) {
        }
        if (CounterBalance_vHmCa5Y$lambda$9(mutableState)) {
        }
        composer2 = startRestartGroup;
        State<Color> m902animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(j4, AnimationSpecKt.tween$default(Color.m5169equalsimpl0(j4, ComposeUtils.AppColorPalette.White.INSTANCE.getColor()) ? 0 : 900, 0, null, 6, null), "counter_accent", null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        Intrinsics.checkNotNull(str22);
        str = str22;
        i8 = 0;
        int i122 = 0;
        while (i8 < str.length()) {
        }
        TextKt.m2643TextIbK3jfQ(builder2.toAnnotatedString(), modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, new TextStyle(0L, j3, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null), composer2, (i6 >> 6) & 112, X2.b.f, 116732);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final long CounterBalance_vHmCa5Y$lambda$2(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CounterBalance_vHmCa5Y$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CounterBalance_vHmCa5Y$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0276  */
    /* renamed from: TickerBalance-vHmCa5Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m12879TickerBalancevHmCa5Y(final long j, final long j2, final long j3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        boolean z3;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        Object rememberedValue4;
        MutableState mutableState;
        boolean changed2;
        BalanceAnimatedAmountKt$TickerBalance$1$1 rememberedValue5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        String str;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        long j4;
        int i7;
        int i8;
        int i9;
        Composer composer3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-669045992);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-669045992, i3, -1, "org.betup.ui.common.balance.TickerBalance (BalanceAnimatedAmount.kt:147)");
                }
                startRestartGroup.startReplaceGroup(5004770);
                i4 = i3 & 14;
                z = i4 != 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = FormatHelper.getDialogBetcoinsFormated(j);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                String str2 = (String) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                int i11 = i3 & 112;
                z2 = i11 != 32;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = FormatHelper.getDialogBetcoinsFormated(j2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                String str3 = (String) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(str2) | startRestartGroup.changed(str3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNull(str2);
                    Intrinsics.checkNotNull(str3);
                    rememberedValue3 = Integer.valueOf(firstChangedIndex(str2, str3));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                int intValue = ((Number) rememberedValue3).intValue();
                startRestartGroup.endReplaceGroup();
                z3 = j <= j2;
                z4 = j >= j2;
                startRestartGroup.startReplaceGroup(-1633490746);
                if (i4 != 4) {
                    i5 = 32;
                    z5 = true;
                } else {
                    i5 = 32;
                    z5 = false;
                }
                z6 = z5 | (i11 != i5);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z3 || z4), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                mutableState = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                Long valueOf = Long.valueOf(j);
                Long valueOf2 = Long.valueOf(j2);
                int i12 = i4;
                startRestartGroup.startReplaceGroup(-1746271574);
                changed2 = startRestartGroup.changed(z3) | startRestartGroup.changed(z4) | startRestartGroup.changed(mutableState);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new BalanceAnimatedAmountKt$TickerBalance$1$1(z3, z4, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue5, startRestartGroup, i3 & 126);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier5 = modifier4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(1784955486);
                Intrinsics.checkNotNull(str2);
                str = str2;
                i6 = 0;
                int i13 = 0;
                while (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    int i14 = i13 + 1;
                    boolean z7 = z3 && TickerBalance_vHmCa5Y$lambda$20(mutableState) && intValue >= 0 && i13 >= intValue && Character.isDigit(charAt);
                    boolean z8 = z4 && TickerBalance_vHmCa5Y$lambda$20(mutableState);
                    if (z7) {
                        j4 = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
                    } else if (z8) {
                        j4 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                    } else {
                        j4 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    }
                    MutableState mutableState2 = mutableState;
                    String str4 = str;
                    boolean z9 = z4;
                    int i15 = i12;
                    Modifier modifier6 = modifier5;
                    boolean z10 = z3;
                    int i16 = intValue;
                    final State<Color> m902animateColorAsStateeuL9pac = SingleValueAnimationKt.m902animateColorAsStateeuL9pac(j4, AnimationSpecKt.tween$default(!Color.m5169equalsimpl0(j4, ComposeUtils.AppColorPalette.White.INSTANCE.getColor()) ? 0 : 900, 0, null, 6, null), "ticker_digit_color_" + i13, null, startRestartGroup, 0, 8);
                    if (Character.isDigit(charAt)) {
                        startRestartGroup.startReplaceGroup(-278124642);
                        Character valueOf3 = Character.valueOf(charAt);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean z11 = (i15 == 4) | (i11 == 32);
                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (z11 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            i8 = i6;
                            rememberedValue6 = new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ContentTransform TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28;
                                    TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28(j, j2, (AnimatedContentTransitionScope) obj);
                                    return TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            i8 = i6;
                        }
                        startRestartGroup.endReplaceGroup();
                        AnimatedContentKt.AnimatedContent(valueOf3, null, (Function1) rememberedValue6, null, "ticker_digit_" + i13, null, ComposableLambdaKt.rememberComposableLambda(1988080457, true, new Function4<AnimatedContentScope, Character, Composer, Integer, Unit>() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$TickerBalance$2$1$2
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Character ch, Composer composer4, Integer num) {
                                invoke(animatedContentScope, ch.charValue(), composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedContentScope AnimatedContent, char c, Composer composer4, int i17) {
                                long TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23;
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1988080457, i17, -1, "org.betup.ui.common.balance.TickerBalance.<anonymous>.<anonymous>.<anonymous> (BalanceAnimatedAmount.kt:204)");
                                }
                                String valueOf4 = String.valueOf(c);
                                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6);
                                FontWeight bold = FontWeight.INSTANCE.getBold();
                                TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23(m902animateColorAsStateeuL9pac);
                                TextKt.m2642Text4IGK_g(valueOf4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23, j3, bold, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, 1572864, 42);
                        startRestartGroup.endReplaceGroup();
                        i9 = i11;
                        composer3 = startRestartGroup;
                        i7 = i15;
                    } else {
                        i7 = i15;
                        i8 = i6;
                        startRestartGroup.startReplaceGroup(-276797377);
                        i9 = i11;
                        composer3 = startRestartGroup;
                        TextKt.m2642Text4IGK_g(String.valueOf(charAt), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(z8 ? TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23(m902animateColorAsStateeuL9pac) : ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), j3, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        composer3.endReplaceGroup();
                    }
                    modifier5 = modifier6;
                    i6 = i8 + 1;
                    i13 = i14;
                    mutableState = mutableState2;
                    str = str4;
                    z4 = z9;
                    z3 = z10;
                    intValue = i16;
                    i12 = i7;
                    i11 = i9;
                    startRestartGroup = composer3;
                }
                composer2 = startRestartGroup;
                Modifier modifier7 = modifier5;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TickerBalance_vHmCa5Y$lambda$32;
                        TickerBalance_vHmCa5Y$lambda$32 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$32(j, j2, j3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TickerBalance_vHmCa5Y$lambda$32;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        i4 = i3 & 14;
        if (i4 != 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = FormatHelper.getDialogBetcoinsFormated(j);
        startRestartGroup.updateRememberedValue(rememberedValue);
        String str22 = (String) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        int i112 = i3 & 112;
        if (i112 != 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue2 = FormatHelper.getDialogBetcoinsFormated(j2);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        String str32 = (String) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(str22) | startRestartGroup.changed(str32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        Intrinsics.checkNotNull(str22);
        Intrinsics.checkNotNull(str32);
        rememberedValue3 = Integer.valueOf(firstChangedIndex(str22, str32));
        startRestartGroup.updateRememberedValue(rememberedValue3);
        int intValue2 = ((Number) rememberedValue3).intValue();
        startRestartGroup.endReplaceGroup();
        if (j <= j2) {
        }
        if (j >= j2) {
        }
        startRestartGroup.startReplaceGroup(-1633490746);
        if (i4 != 4) {
        }
        z6 = z5 | (i112 != i5);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z3 || z4), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        mutableState = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        Long valueOf4 = Long.valueOf(j);
        Long valueOf22 = Long.valueOf(j2);
        int i122 = i4;
        startRestartGroup.startReplaceGroup(-1746271574);
        changed2 = startRestartGroup.changed(z3) | startRestartGroup.changed(z4) | startRestartGroup.changed(mutableState);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue5 = new BalanceAnimatedAmountKt$TickerBalance$1$1(z3, z4, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf4, valueOf22, (Function2) rememberedValue5, startRestartGroup, i3 & 126);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier52 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1784955486);
        Intrinsics.checkNotNull(str22);
        str = str22;
        i6 = 0;
        int i132 = 0;
        while (i6 < str.length()) {
        }
        composer2 = startRestartGroup;
        Modifier modifier72 = modifier52;
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier72;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean TickerBalance_vHmCa5Y$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TickerBalance_vHmCa5Y$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28(long j, long j2, AnimatedContentTransitionScope AnimatedContent) {
        ContentTransform contentTransform;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (Intrinsics.compare((int) ((Character) AnimatedContent.getTargetState()).charValue(), (int) ((Character) AnimatedContent.getInitialState()).charValue()) >= 0 || j > j2) {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(220, 0, null, 6, null), new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$24;
                    TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$24 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$24(((Integer) obj).intValue());
                    return Integer.valueOf(TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$24);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(220, 0, null, 6, null), new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25;
                    TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25(((Integer) obj).intValue());
                    return Integer.valueOf(TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$25);
                }
            }).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        } else {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(220, 0, null, 6, null), new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26;
                    TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26(((Integer) obj).intValue());
                    return Integer.valueOf(TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$26);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(220, 0, null, 6, null), new Function1() { // from class: org.betup.ui.common.balance.BalanceAnimatedAmountKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27;
                    TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27 = BalanceAnimatedAmountKt.TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(((Integer) obj).intValue());
                    return Integer.valueOf(TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27);
                }
            }).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        }
        return AnimatedContent.using(contentTransform, AnimatedContentKt.SizeTransform$default(false, null, 2, null));
    }

    private static final int firstChangedIndex(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        if (str.length() != str2.length()) {
            return min;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateBalanceLong(long j, long j2, int i, Function1<? super Long, Unit> function1, Continuation<? super Unit> continuation) {
        BalanceAnimatedAmountKt$animateBalanceLong$1 balanceAnimatedAmountKt$animateBalanceLong$1;
        Object coroutine_suspended;
        int i2;
        Function1<? super Long, Unit> function12;
        long nanoTime;
        long j3;
        long j4;
        BalanceAnimatedAmountKt$animateBalanceLong$1 balanceAnimatedAmountKt$animateBalanceLong$12;
        long j5;
        double coerceIn;
        if (continuation instanceof BalanceAnimatedAmountKt$animateBalanceLong$1) {
            balanceAnimatedAmountKt$animateBalanceLong$1 = (BalanceAnimatedAmountKt$animateBalanceLong$1) continuation;
            if ((balanceAnimatedAmountKt$animateBalanceLong$1.label & Integer.MIN_VALUE) != 0) {
                balanceAnimatedAmountKt$animateBalanceLong$1.label -= Integer.MIN_VALUE;
                Object obj = balanceAnimatedAmountKt$animateBalanceLong$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = balanceAnimatedAmountKt$animateBalanceLong$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j == j2) {
                        function1.invoke(Boxing.boxLong(j2));
                        return Unit.INSTANCE;
                    }
                    function12 = function1;
                    nanoTime = System.nanoTime();
                    j3 = i * 1000000;
                    j4 = j2;
                    balanceAnimatedAmountKt$animateBalanceLong$12 = balanceAnimatedAmountKt$animateBalanceLong$1;
                    j5 = j;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = balanceAnimatedAmountKt$animateBalanceLong$1.J$3;
                    long j7 = balanceAnimatedAmountKt$animateBalanceLong$1.J$2;
                    long j8 = balanceAnimatedAmountKt$animateBalanceLong$1.J$1;
                    long j9 = balanceAnimatedAmountKt$animateBalanceLong$1.J$0;
                    function12 = (Function1) balanceAnimatedAmountKt$animateBalanceLong$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    balanceAnimatedAmountKt$animateBalanceLong$12 = balanceAnimatedAmountKt$animateBalanceLong$1;
                    j5 = j9;
                    j4 = j8;
                    j3 = j6;
                    nanoTime = j7;
                }
                do {
                    coerceIn = RangesKt.coerceIn((System.nanoTime() - nanoTime) / j3, 0.0d, 1.0d);
                    long j10 = j3;
                    function12.invoke(Boxing.boxLong(MathKt.roundToLong((j4 - j5) * EasingKt.getFastOutSlowInEasing().transform((float) coerceIn)) + j5));
                    if (coerceIn >= 1.0d) {
                        balanceAnimatedAmountKt$animateBalanceLong$12.L$0 = function12;
                        balanceAnimatedAmountKt$animateBalanceLong$12.J$0 = j5;
                        balanceAnimatedAmountKt$animateBalanceLong$12.J$1 = j4;
                        balanceAnimatedAmountKt$animateBalanceLong$12.J$2 = nanoTime;
                        j3 = j10;
                        balanceAnimatedAmountKt$animateBalanceLong$12.J$3 = j3;
                        balanceAnimatedAmountKt$animateBalanceLong$12.label = 1;
                    } else {
                        function12.invoke(Boxing.boxLong(j4));
                        return Unit.INSTANCE;
                    }
                } while (DelayKt.delay(16L, balanceAnimatedAmountKt$animateBalanceLong$12) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        balanceAnimatedAmountKt$animateBalanceLong$1 = new BalanceAnimatedAmountKt$animateBalanceLong$1(continuation);
        Object obj2 = balanceAnimatedAmountKt$animateBalanceLong$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = balanceAnimatedAmountKt$animateBalanceLong$1.label;
        if (i2 != 0) {
        }
        do {
            coerceIn = RangesKt.coerceIn((System.nanoTime() - nanoTime) / j3, 0.0d, 1.0d);
            long j102 = j3;
            function12.invoke(Boxing.boxLong(MathKt.roundToLong((j4 - j5) * EasingKt.getFastOutSlowInEasing().transform((float) coerceIn)) + j5));
            if (coerceIn >= 1.0d) {
            }
        } while (DelayKt.delay(16L, balanceAnimatedAmountKt$animateBalanceLong$12) != coroutine_suspended);
        return coroutine_suspended;
    }

    private static final long CounterBalance_vHmCa5Y$lambda$12(State<Color> state) {
        return state.getValue().m5178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long TickerBalance_vHmCa5Y$lambda$31$lambda$30$lambda$23(State<Color> state) {
        return state.getValue().m5178unboximpl();
    }
}
