package org.betup.ui.common.compose;

import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.model.local.entity.NotificationType;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.utils.SharedPrefs;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HapticFeedbackEffect.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001KB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\"\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00101\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00103\u001a\u00020!H\u0002J \u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020!H\u0002J \u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u000eH\u0002J\u0010\u00108\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002J\u0018\u0010?\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010@\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0019\u0010C\u001a\u0004\u0018\u00010\u001b2\b\u0010A\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u001b2\u0006\u0010A\u001a\u00020!H\u0007J\u0010\u0010F\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020GH\u0007J\u0014\u0010H\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010J\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lorg/betup/ui/common/compose/HapticFeedbackEffect;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "PLACE_BET_SUCCESS_TIMINGS_MS", "", "CLICK_LIGHT_TIMINGS_MS", "CLICK_MEDIUM_TIMINGS_MS", "CLICK_STRONG_TIMINGS_MS", "REJECT_TIMINGS_MS", "WIN_CELEBRATION_TIMINGS_MS", "WIN_CELEBRATION_AMPLITUDES", "", "LOSS_DROP_TIMINGS_MS", "LOSS_DROP_AMPLITUDES", "isEnabled", "", "context", "Landroid/content/Context;", "isSystemTouchHapticEnabled", "perform", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "type", "Lorg/betup/ui/common/compose/HapticFeedbackType;", "activity", "Landroid/app/Activity;", "performBetSelect", "performBetSelectBurst", "selectionCount", "", "performPlacementAction", "playClickPattern", "strength", "Lorg/betup/ui/common/compose/HapticFeedbackEffect$ClickStrength;", "playClickVibration", "playClickHapticFallback", "playRejectPattern", "playWinPattern", "playLossPattern", "playWinPredefinedSequence", "playLossPredefinedSequence", "playWinHapticFallback", "playLossHapticFallback", "playPlaceBetSuccessPattern", "playPlaceBetSuccessVibration", "playPlaceBetHapticFallback", "playPredefinedEffect", "effectId", "playVibratorWaveform", "timings", "pulseAmplitude", "amplitudes", "appContext", "getVibrator", "Landroid/os/Vibrator;", "vibrateWithAttributes", "vibrator", "effect", "Landroid/os/VibrationEffect;", "performPulse", "forBetState", "state", "Lorg/betup/model/remote/entity/bets/BetState;", "forChallengeEffectiveState", "(Ljava/lang/Integer;)Lorg/betup/ui/common/compose/HapticFeedbackType;", "forQuizParticipationState", "forPushNotification", "Lorg/betup/model/local/entity/NotificationType;", "forFlashBetResult", "result", "resolveConstant", "ClickStrength", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HapticFeedbackEffect {
    private static final String TAG = "HapticFeedbackEffect";
    public static final HapticFeedbackEffect INSTANCE = new HapticFeedbackEffect();
    private static final long[] PLACE_BET_SUCCESS_TIMINGS_MS = {0, 90, 50, 100, 50, 100, 50, 120, 60, 150, 80, 200};
    private static final long[] CLICK_LIGHT_TIMINGS_MS = {0, 42, 32, 48};
    private static final long[] CLICK_MEDIUM_TIMINGS_MS = {0, 52, 36, 62};
    private static final long[] CLICK_STRONG_TIMINGS_MS = {0, 58, 40, 75};
    private static final long[] REJECT_TIMINGS_MS = {0, 58, 36, 62};
    private static final long[] WIN_CELEBRATION_TIMINGS_MS = {0, 38, 48, 42, 58, 52, 82, 68, 105};
    private static final int[] WIN_CELEBRATION_AMPLITUDES = {0, 155, 0, 190, 0, 220, 0, 245, 0, 255};
    private static final long[] LOSS_DROP_TIMINGS_MS = {0, 78, 110, 48, 220, 88};
    private static final int[] LOSS_DROP_AMPLITUDES = {0, 235, 0, LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE, 0, 255, 0, Opcodes.IF_ACMPEQ};
    public static final int $stable = 8;

    /* compiled from: HapticFeedbackEffect.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[HapticFeedbackType.values().length];
            try {
                iArr[HapticFeedbackType.PlaceBetSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HapticFeedbackType.LightTap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HapticFeedbackType.Selection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HapticFeedbackType.BetSelect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HapticFeedbackType.Confirm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HapticFeedbackType.Heavy.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HapticFeedbackType.Win.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HapticFeedbackType.SpinStop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HapticFeedbackType.Reject.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HapticFeedbackType.Loss.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HapticFeedbackType.Notification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClickStrength.values().length];
            try {
                iArr2[ClickStrength.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ClickStrength.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ClickStrength.STRONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BetState.values().length];
            try {
                iArr3[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[NotificationType.values().length];
            try {
                iArr4[NotificationType.BET.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[NotificationType.ACHIEVEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[NotificationType.REWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[NotificationType.CHALLENGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[NotificationType.CHALLENGE_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[NotificationType.CHALLENGE_PRIVATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[NotificationType.CHALLENGE_ACCEPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[NotificationType.COMPETITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[NotificationType.MATCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[NotificationType.MATCH_SCORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[NotificationType.MATCH_FINISHED.ordinal()] = 11;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private HapticFeedbackEffect() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HapticFeedbackEffect.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/common/compose/HapticFeedbackEffect$ClickStrength;", "", "timings", "", "amplitude", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I[JI)V", "getTimings", "()[J", "getAmplitude", "()I", "LIGHT", "MEDIUM", "STRONG", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ClickStrength {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClickStrength[] $VALUES;
        public static final ClickStrength LIGHT = new ClickStrength("LIGHT", 0, HapticFeedbackEffect.CLICK_LIGHT_TIMINGS_MS, Opcodes.DRETURN);
        public static final ClickStrength MEDIUM = new ClickStrength("MEDIUM", 1, HapticFeedbackEffect.CLICK_MEDIUM_TIMINGS_MS, LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE);
        public static final ClickStrength STRONG = new ClickStrength("STRONG", 2, HapticFeedbackEffect.CLICK_STRONG_TIMINGS_MS, 245);
        private final int amplitude;
        private final long[] timings;

        private static final /* synthetic */ ClickStrength[] $values() {
            return new ClickStrength[]{LIGHT, MEDIUM, STRONG};
        }

        public static EnumEntries<ClickStrength> getEntries() {
            return $ENTRIES;
        }

        private ClickStrength(String str, int i, long[] jArr, int i2) {
            this.timings = jArr;
            this.amplitude = i2;
        }

        public final int getAmplitude() {
            return this.amplitude;
        }

        public final long[] getTimings() {
            return this.timings;
        }

        static {
            ClickStrength[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ClickStrength valueOf(String str) {
            return (ClickStrength) Enum.valueOf(ClickStrength.class, str);
        }

        public static ClickStrength[] values() {
            return (ClickStrength[]) $VALUES.clone();
        }
    }

    @JvmStatic
    public static final boolean isEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SharedPrefs.areHapticEffectsEnabled(context);
    }

    @JvmStatic
    public static final boolean isSystemTouchHapticEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 1;
        } catch (Exception unused) {
            return true;
        }
    }

    @JvmStatic
    public static final void perform(View view, HapticFeedbackType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(type, "type");
        HapticFeedbackEffect hapticFeedbackEffect = INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isEnabled(context)) {
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    hapticFeedbackEffect.playPlaceBetSuccessPattern(view);
                    return;
                case 2:
                case 3:
                case 4:
                    hapticFeedbackEffect.playClickPattern(view, ClickStrength.LIGHT);
                    return;
                case 5:
                case 6:
                    hapticFeedbackEffect.playClickPattern(view, ClickStrength.STRONG);
                    return;
                case 7:
                    hapticFeedbackEffect.playWinPattern(view);
                    return;
                case 8:
                    hapticFeedbackEffect.playClickPattern(view, ClickStrength.MEDIUM);
                    return;
                case 9:
                    hapticFeedbackEffect.playRejectPattern(view);
                    return;
                case 10:
                    hapticFeedbackEffect.playLossPattern(view);
                    return;
                case 11:
                    hapticFeedbackEffect.playClickPattern(view, ClickStrength.LIGHT);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @JvmStatic
    public static final void perform(Activity activity, HapticFeedbackType type) {
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(type, "type");
        if (activity == null || !isEnabled(activity) || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        perform(decorView, type);
    }

    @JvmStatic
    public static final void performBetSelect(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        perform(view, HapticFeedbackType.BetSelect);
    }

    @JvmStatic
    public static final void performBetSelectBurst(final View view, int selectionCount) {
        Intrinsics.checkNotNullParameter(view, "view");
        HapticFeedbackEffect hapticFeedbackEffect = INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!isEnabled(context) || selectionCount <= 0) {
            return;
        }
        int coerceAtMost = RangesKt.coerceAtMost(selectionCount, 6);
        hapticFeedbackEffect.playClickPattern(view, ClickStrength.LIGHT);
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        for (int i = 1; i < coerceAtMost; i++) {
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.performBetSelectBurst$lambda$0(view);
                }
            }, i * 48);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performBetSelectBurst$lambda$0(View view) {
        INSTANCE.playClickPattern(view, ClickStrength.LIGHT);
    }

    @JvmStatic
    public static final void performBetSelectBurst(Activity activity, int selectionCount) {
        Window window;
        View decorView;
        if (activity == null || !isEnabled(activity) || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        performBetSelectBurst(decorView, selectionCount);
    }

    @JvmStatic
    public static final void performPlacementAction(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        perform(view, HapticFeedbackType.Confirm);
    }

    @JvmStatic
    public static final void performPlacementAction(Activity activity) {
        perform(activity, HapticFeedbackType.Confirm);
    }

    private final void playClickPattern(View view, ClickStrength strength) {
        if (playClickVibration(appContext(view), strength)) {
            return;
        }
        playClickHapticFallback(view, strength);
    }

    private final boolean playClickVibration(Context context, ClickStrength strength) {
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[strength.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 1;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 5;
            }
            if (playPredefinedEffect(context, i)) {
                return true;
            }
        }
        return playVibratorWaveform(context, strength.getTimings(), strength.getAmplitude());
    }

    private final void playClickHapticFallback(final View view, ClickStrength strength) {
        HapticFeedbackType hapticFeedbackType;
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        int i = WhenMappings.$EnumSwitchMapping$1[strength.ordinal()];
        if (i == 1) {
            hapticFeedbackType = HapticFeedbackType.LightTap;
        } else if (i == 2) {
            hapticFeedbackType = HapticFeedbackType.Confirm;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hapticFeedbackType = HapticFeedbackType.Heavy;
        }
        performPulse(view, hapticFeedbackType);
        if (strength != ClickStrength.LIGHT) {
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playClickHapticFallback$lambda$1(view);
                }
            }, 45L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playClickHapticFallback$lambda$1(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Confirm);
    }

    private final void playRejectPattern(final View view) {
        Context appContext = appContext(view);
        if (playVibratorWaveform(appContext, REJECT_TIMINGS_MS, 220)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !playPredefinedEffect(appContext, 1)) {
            Handler handler = view.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            performPulse(view, HapticFeedbackType.Reject);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playRejectPattern$lambda$2(view);
                }
            }, 55L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playRejectPattern$lambda$2(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Reject);
    }

    private final void playWinPattern(View view) {
        Context appContext = appContext(view);
        if (playVibratorWaveform(appContext, WIN_CELEBRATION_TIMINGS_MS, WIN_CELEBRATION_AMPLITUDES) || playWinPredefinedSequence(appContext)) {
            return;
        }
        playWinHapticFallback(view);
    }

    private final void playLossPattern(View view) {
        Context appContext = appContext(view);
        if (playVibratorWaveform(appContext, LOSS_DROP_TIMINGS_MS, LOSS_DROP_AMPLITUDES) || playLossPredefinedSequence(appContext)) {
            return;
        }
        playLossHapticFallback(view);
    }

    private final boolean playWinPredefinedSequence(final Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        try {
            if (!playPredefinedEffect(context, 0)) {
                return false;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playWinPredefinedSequence$lambda$3(context);
                }
            }, 52L);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playWinPredefinedSequence$lambda$4(context);
                }
            }, 118L);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playWinPredefinedSequence$lambda$5(context);
                }
            }, 205L);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "Win predefined sequence failed", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinPredefinedSequence$lambda$3(Context context) {
        INSTANCE.playPredefinedEffect(context, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinPredefinedSequence$lambda$4(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            INSTANCE.playPredefinedEffect(context, 5);
        } else {
            INSTANCE.playPredefinedEffect(context, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinPredefinedSequence$lambda$5(Context context) {
        INSTANCE.playPredefinedEffect(context, 2);
    }

    private final boolean playLossPredefinedSequence(final Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        try {
            if (!playPredefinedEffect(context, 1)) {
                return false;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playLossPredefinedSequence$lambda$6(context);
                }
            }, 145L);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playLossPredefinedSequence$lambda$7(context);
                }
            }, 390L);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "Loss predefined sequence failed", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLossPredefinedSequence$lambda$6(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            INSTANCE.playPredefinedEffect(context, 5);
        } else {
            INSTANCE.playPredefinedEffect(context, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLossPredefinedSequence$lambda$7(Context context) {
        INSTANCE.playPredefinedEffect(context, 2);
    }

    private final void playWinHapticFallback(final View view) {
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        performPulse(view, HapticFeedbackType.LightTap);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playWinHapticFallback$lambda$8(view);
            }
        }, 48L);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playWinHapticFallback$lambda$9(view);
            }
        }, 108L);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playWinHapticFallback$lambda$10(view);
            }
        }, 168L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinHapticFallback$lambda$8(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinHapticFallback$lambda$9(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWinHapticFallback$lambda$10(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Heavy);
    }

    private final void playLossHapticFallback(final View view) {
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        performPulse(view, HapticFeedbackType.Reject);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playLossHapticFallback$lambda$11(view);
            }
        }, 175L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLossHapticFallback$lambda$11(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Heavy);
    }

    private final void playPlaceBetSuccessPattern(View view) {
        Context appContext = appContext(view);
        boolean playPlaceBetSuccessVibration = playPlaceBetSuccessVibration(appContext);
        if (!playPlaceBetSuccessVibration) {
            playPlaceBetSuccessVibration = playVibratorWaveform(appContext, PLACE_BET_SUCCESS_TIMINGS_MS, 255);
        }
        if (playPlaceBetSuccessVibration) {
            return;
        }
        playPlaceBetHapticFallback(view);
    }

    private final boolean playPlaceBetSuccessVibration(final Context context) {
        Vibrator vibrator;
        if (Build.VERSION.SDK_INT < 29 || (vibrator = getVibrator(context)) == null || !vibrator.hasVibrator()) {
            return false;
        }
        try {
            if (!playPredefinedEffect(context, 5)) {
                return false;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playPlaceBetSuccessVibration$lambda$12(context);
                }
            }, 110L);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playPlaceBetSuccessVibration$lambda$13(context);
                }
            }, 230L);
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    HapticFeedbackEffect.playPlaceBetSuccessVibration$lambda$14(context);
                }
            }, 360L);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "PlaceBetSuccess predefined sequence failed", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetSuccessVibration$lambda$12(Context context) {
        INSTANCE.playPredefinedEffect(context, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetSuccessVibration$lambda$13(Context context) {
        INSTANCE.playPredefinedEffect(context, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetSuccessVibration$lambda$14(Context context) {
        INSTANCE.playPredefinedEffect(context, 2);
    }

    private final void playPlaceBetHapticFallback(final View view) {
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        performPulse(view, HapticFeedbackType.Heavy);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playPlaceBetHapticFallback$lambda$15(view);
            }
        }, 90L);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playPlaceBetHapticFallback$lambda$16(view);
            }
        }, 190L);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playPlaceBetHapticFallback$lambda$17(view);
            }
        }, 300L);
        handler.postDelayed(new Runnable() { // from class: org.betup.ui.common.compose.HapticFeedbackEffect$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                HapticFeedbackEffect.playPlaceBetHapticFallback$lambda$18(view);
            }
        }, 420L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetHapticFallback$lambda$15(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Heavy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetHapticFallback$lambda$16(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetHapticFallback$lambda$17(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Heavy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPlaceBetHapticFallback$lambda$18(View view) {
        INSTANCE.performPulse(view, HapticFeedbackType.Win);
    }

    private final boolean playPredefinedEffect(Context context, int effectId) {
        Vibrator vibrator = getVibrator(context);
        if (vibrator == null || !vibrator.hasVibrator()) {
            return false;
        }
        try {
            vibrator.cancel();
            VibrationEffect createPredefined = VibrationEffect.createPredefined(effectId);
            Intrinsics.checkNotNullExpressionValue(createPredefined, "createPredefined(...)");
            vibrateWithAttributes(vibrator, createPredefined);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "Predefined haptic effect " + effectId + " failed on " + Build.MANUFACTURER, e);
            return false;
        }
    }

    private final boolean playVibratorWaveform(Context context, long[] timings, int pulseAmplitude) {
        if (timings.length == 0) {
            return false;
        }
        int length = timings.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i % 2 == 0 ? 0 : RangesKt.coerceIn(pulseAmplitude, 1, 255);
        }
        return playVibratorWaveform(context, timings, iArr);
    }

    private final boolean playVibratorWaveform(Context context, long[] timings, int[] amplitudes) {
        Vibrator vibrator;
        int[] intArray;
        if (timings.length != amplitudes.length || timings.length == 0 || (vibrator = getVibrator(context)) == null || !vibrator.hasVibrator()) {
            return false;
        }
        try {
            vibrator.cancel();
            if (vibrator.hasAmplitudeControl()) {
                ArrayList arrayList = new ArrayList(amplitudes.length);
                int length = amplitudes.length;
                for (int i = 0; i < length; i++) {
                    int i2 = amplitudes[i];
                    arrayList.add(Integer.valueOf(i2 == 0 ? 0 : RangesKt.coerceIn(i2, 1, 255)));
                }
                intArray = CollectionsKt.toIntArray(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(amplitudes.length);
                for (int i3 : amplitudes) {
                    arrayList2.add(Integer.valueOf(i3 == 0 ? 0 : -1));
                }
                intArray = CollectionsKt.toIntArray(arrayList2);
            }
            VibrationEffect createWaveform = VibrationEffect.createWaveform(timings, intArray, -1);
            Intrinsics.checkNotNull(createWaveform);
            vibrateWithAttributes(vibrator, createWaveform);
            return true;
        } catch (Exception e) {
            Log.w(TAG, "Waveform haptic failed on " + Build.MANUFACTURER, e);
            return false;
        }
    }

    private final Context appContext(View view) {
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    private final Vibrator getVibrator(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager vibratorManager = (VibratorManager) applicationContext.getSystemService(VibratorManager.class);
            if (vibratorManager != null) {
                return vibratorManager.getDefaultVibrator();
            }
            return null;
        }
        Object systemService = applicationContext.getSystemService("vibrator");
        if (systemService instanceof Vibrator) {
            return (Vibrator) systemService;
        }
        return null;
    }

    private final void vibrateWithAttributes(Vibrator vibrator, VibrationEffect effect) {
        if (Build.VERSION.SDK_INT >= 33) {
            VibrationAttributes createForUsage = VibrationAttributes.createForUsage(18);
            Intrinsics.checkNotNullExpressionValue(createForUsage, "createForUsage(...)");
            vibrator.vibrate(effect, createForUsage);
            return;
        }
        vibrator.vibrate(effect, new AudioAttributes.Builder().setUsage(13).setContentType(4).build());
    }

    private final void performPulse(View view, HapticFeedbackType type) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isEnabled(context)) {
            view.performHapticFeedback(resolveConstant(type), 2);
        }
    }

    @JvmStatic
    public static final HapticFeedbackType forBetState(BetState state) {
        int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$2[state.ordinal()];
        if (i == 1) {
            return HapticFeedbackType.Win;
        }
        if (i == 2) {
            return HapticFeedbackType.Loss;
        }
        return HapticFeedbackType.Notification;
    }

    @JvmStatic
    public static final HapticFeedbackType forChallengeEffectiveState(Integer state) {
        if (state != null && state.intValue() == 4) {
            return HapticFeedbackType.Win;
        }
        if (state != null && state.intValue() == 5) {
            return HapticFeedbackType.Loss;
        }
        return null;
    }

    @JvmStatic
    public static final HapticFeedbackType forQuizParticipationState(int state) {
        if (state == 4) {
            return HapticFeedbackType.Win;
        }
        if (state != 8) {
            return null;
        }
        return HapticFeedbackType.Loss;
    }

    @JvmStatic
    public static final HapticFeedbackType forPushNotification(NotificationType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$3[type.ordinal()]) {
        }
        return HapticFeedbackType.Notification;
    }

    @JvmStatic
    public static final HapticFeedbackType forFlashBetResult(String result) {
        if (Intrinsics.areEqual(result, "Won")) {
            return HapticFeedbackType.Win;
        }
        if (Intrinsics.areEqual(result, "Lost")) {
            return HapticFeedbackType.Loss;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 30) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int resolveConstant(HapticFeedbackType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 5:
            case 7:
            case 8:
                break;
            case 2:
            case 4:
                if (Build.VERSION.SDK_INT >= 30) {
                    return 3;
                }
                return 1;
            case 3:
                if (Build.VERSION.SDK_INT >= 27) {
                    return 9;
                }
                return 4;
            case 6:
                if (Build.VERSION.SDK_INT < 30) {
                    return 0;
                }
                return 16;
            case 9:
            case 10:
                return Build.VERSION.SDK_INT >= 30 ? 17 : 0;
            case 11:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
