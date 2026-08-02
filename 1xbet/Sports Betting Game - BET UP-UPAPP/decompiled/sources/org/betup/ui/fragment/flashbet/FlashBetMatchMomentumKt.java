package org.betup.ui.fragment.flashbet;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.games.flashbet.model.FlashBetGameEventDto;

/* compiled from: FlashBetMatchMomentum.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0013"}, d2 = {"flashBetMomentumDelta", "", "kind", "Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;", "isHome", "", "normalizeFlashBetTargetHomePercent", "", "possessionHomePercent", "possessionAwayPercent", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "computeSimulatedPossessionHomePercent", "events", "", "Lorg/betup/games/flashbet/model/FlashBetGameEventDto;", "displayedMinute", "(Ljava/util/List;ILjava/lang/Integer;Ljava/lang/Integer;)I", "computeFlashBetLiveEventMomentum", "computeFlashBetMomentum", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchMomentumKt {

    /* compiled from: FlashBetMatchMomentum.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetEventKind.values().length];
            try {
                iArr[FlashBetEventKind.GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetEventKind.YELLOW_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlashBetEventKind.RED_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlashBetEventKind.CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlashBetEventKind.PENALTY_MISSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlashBetEventKind.SUBSTITUTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FlashBetEventKind.HALF_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FlashBetEventKind.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float flashBetMomentumDelta(FlashBetEventKind kind, boolean z) {
        float f;
        Intrinsics.checkNotNullParameter(kind, "kind");
        float f2 = z ? 1.0f : -1.0f;
        switch (WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
            case 1:
                f = 40.0f;
                break;
            case 2:
            case 3:
                f = -4.0f;
                break;
            case 4:
                f = 8.0f;
                break;
            case 5:
                f = -6.0f;
                break;
            case 6:
            case 7:
            case 8:
                return 0.0f;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return f * f2;
    }

    public static final int normalizeFlashBetTargetHomePercent(Integer num, Integer num2) {
        int intValue;
        if (num != null && num2 != null && (intValue = num.intValue() + num2.intValue()) > 0) {
            return RangesKt.coerceIn((num.intValue() * 100) / intValue, 0, 100);
        }
        if (num != null) {
            return RangesKt.coerceIn(num.intValue(), 0, 100);
        }
        return 50;
    }

    public static final int computeSimulatedPossessionHomePercent(List<FlashBetGameEventDto> events, int i, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(events, "events");
        int normalizeFlashBetTargetHomePercent = normalizeFlashBetTargetHomePercent(num, num2);
        if (i <= 0) {
            return 50;
        }
        float f = 0.0f;
        float coerceIn = RangesKt.coerceIn(i / 90.0f, 0.0f, 1.0f);
        float f2 = coerceIn * coerceIn * (3.0f - (coerceIn * 2.0f));
        float f3 = normalizeFlashBetTargetHomePercent;
        float f4 = ((f3 - 50.0f) * f2) + 50.0f;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                f *= 0.91f;
                ArrayList<FlashBetGameEventDto> arrayList = new ArrayList();
                for (Object obj : events) {
                    FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) obj;
                    if (flashBetGameEventDto.getMinute() == i2 && !StringsKt.isBlank(flashBetGameEventDto.getDescription())) {
                        arrayList.add(obj);
                    }
                }
                for (FlashBetGameEventDto flashBetGameEventDto2 : arrayList) {
                    f += flashBetMomentumDelta(FlashBetEventKindKt.resolveFlashBetEventKind(flashBetGameEventDto2.getEventType(), flashBetGameEventDto2.getDescription()), StringsKt.equals(flashBetGameEventDto2.getSource(), "home", true)) * 0.12f;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        float f5 = f4 + f;
        float f6 = f5 + ((f3 - f5) * f2 * 0.42f);
        if (i < 90) {
            f3 = f6;
        }
        return RangesKt.coerceIn(MathKt.roundToInt(f3), 5, 95);
    }

    public static final float computeFlashBetLiveEventMomentum(List<FlashBetGameEventDto> events, int i) {
        Intrinsics.checkNotNullParameter(events, "events");
        float f = 0.0f;
        if (i <= 0) {
            return 0.0f;
        }
        if (1 <= i) {
            float f2 = 0.0f;
            int i2 = 1;
            while (true) {
                f2 *= 0.93f;
                ArrayList<FlashBetGameEventDto> arrayList = new ArrayList();
                for (Object obj : events) {
                    FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) obj;
                    if (flashBetGameEventDto.getMinute() == i2 && !StringsKt.isBlank(flashBetGameEventDto.getDescription())) {
                        arrayList.add(obj);
                    }
                }
                for (FlashBetGameEventDto flashBetGameEventDto2 : arrayList) {
                    boolean equals = StringsKt.equals(flashBetGameEventDto2.getSource(), "home", true);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[FlashBetEventKindKt.resolveFlashBetEventKind(flashBetGameEventDto2.getEventType(), flashBetGameEventDto2.getDescription()).ordinal()];
                    f2 += i3 != 1 ? (i3 == 2 || i3 == 3) ? equals ? -3.0f : 3.0f : i3 != 4 ? i3 != 5 ? 0.0f : equals ? -25.0f : 25.0f : equals ? 5.0f : -5.0f : equals ? 60.0f : -60.0f;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
            f = f2;
        }
        return RangesKt.coerceIn(f, -95.0f, 95.0f);
    }

    public static final float computeFlashBetMomentum(List<FlashBetGameEventDto> events, int i) {
        Intrinsics.checkNotNullParameter(events, "events");
        return RangesKt.coerceIn((computeSimulatedPossessionHomePercent(events, i, null, null) - 50) * 2.0f, -100.0f, 100.0f);
    }
}
