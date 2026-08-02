package org.betup.ui.fragment.flashbet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.betup.games.flashbet.model.FlashBetGameEventDto;
import org.betup.ui.fragment.flashbet.compose.FlashBetCardFlashOverlayKt;
import org.betup.ui.fragment.flashbet.compose.FlashBetGoalSide;

/* compiled from: FlashBetEventFormatting.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"ORDINAL_GOAL_PREFIX_REGEX", "Lkotlin/text/Regex;", "GOAL_WORD_PREFIX_REGEX", "parseGoalDescriptionLabel", "", "description", "formatFlashBetEventTickerText", "event", "Lorg/betup/games/flashbet/model/FlashBetGameEventDto;", "findGoalEventForScoreChange", "events", "", "minute", "", "scoringSide", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetGoalSide;", "shouldHideFlashBetEventFromTicker", "", "flashBetEventTickerKey", "index", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetEventFormattingKt {
    private static final Regex ORDINAL_GOAL_PREFIX_REGEX = new Regex("(?i)^\\d+(?:st|nd|rd|th)\\s+goal\\s*[-–]\\s*");
    private static final Regex GOAL_WORD_PREFIX_REGEX = new Regex("(?i)^(goal|gol|tor|but)!?\\s*[-–·:]?\\s*");

    /* compiled from: FlashBetEventFormatting.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
                iArr[FlashBetEventKind.PENALTY_MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlashBetEventKind.HALF_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FlashBetGoalSide.values().length];
            try {
                iArr2[FlashBetGoalSide.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FlashBetGoalSide.AWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String parseGoalDescriptionLabel(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        String obj = StringsKt.trim((CharSequence) description).toString();
        String str = obj;
        if (StringsKt.isBlank(str)) {
            return obj;
        }
        String obj2 = StringsKt.trim((CharSequence) GOAL_WORD_PREFIX_REGEX.replace(ORDINAL_GOAL_PREFIX_REGEX.replace(str, ""), "")).toString();
        if (!StringsKt.isBlank(obj2)) {
            obj = obj2;
        }
        return obj;
    }

    public static final String formatFlashBetEventTickerText(FlashBetGameEventDto event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String obj = StringsKt.trim((CharSequence) event.getDescription()).toString();
        if (StringsKt.isBlank(obj)) {
            return obj;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[FlashBetEventKindKt.resolveFlashBetEventKind(event.getEventType(), obj).ordinal()];
        if (i == 1) {
            return parseGoalDescriptionLabel(obj);
        }
        if (i == 2) {
            String parseCardFlashLabel = FlashBetCardFlashOverlayKt.parseCardFlashLabel(obj);
            if (!StringsKt.isBlank(parseCardFlashLabel)) {
                obj = parseCardFlashLabel;
            }
            return obj;
        }
        if (i != 3) {
            return obj;
        }
        String parseCardFlashLabel2 = FlashBetCardFlashOverlayKt.parseCardFlashLabel(obj);
        if (!StringsKt.isBlank(parseCardFlashLabel2)) {
            obj = parseCardFlashLabel2;
        }
        return obj;
    }

    public static final FlashBetGameEventDto findGoalEventForScoreChange(List<FlashBetGameEventDto> events, int i, FlashBetGoalSide scoringSide) {
        String str;
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(scoringSide, "scoringSide");
        int i2 = WhenMappings.$EnumSwitchMapping$1[scoringSide.ordinal()];
        if (i2 == 1) {
            str = "home";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "away";
        }
        int i3 = i + 1;
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(i), Integer.valueOf(i3)}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : events) {
                FlashBetGameEventDto flashBetGameEventDto = (FlashBetGameEventDto) obj;
                if (flashBetGameEventDto.getMinute() == intValue && findGoalEventForScoreChange$isMatchingGoal(str, flashBetGameEventDto)) {
                    arrayList.add(obj);
                }
            }
            FlashBetGameEventDto flashBetGameEventDto2 = (FlashBetGameEventDto) CollectionsKt.lastOrNull((List) arrayList);
            if (flashBetGameEventDto2 != null) {
                return flashBetGameEventDto2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : events) {
            FlashBetGameEventDto flashBetGameEventDto3 = (FlashBetGameEventDto) obj2;
            if (flashBetGameEventDto3.getMinute() <= i3 && findGoalEventForScoreChange$isMatchingGoal(str, flashBetGameEventDto3)) {
                arrayList2.add(obj2);
            }
        }
        return (FlashBetGameEventDto) CollectionsKt.lastOrNull((List) arrayList2);
    }

    private static final boolean findGoalEventForScoreChange$isMatchingGoal(String str, FlashBetGameEventDto flashBetGameEventDto) {
        return StringsKt.equals(flashBetGameEventDto.getSource(), str, true) && FlashBetEventKindKt.resolveFlashBetEventKind(flashBetGameEventDto.getEventType(), flashBetGameEventDto.getDescription()) == FlashBetEventKind.GOAL;
    }

    public static final boolean shouldHideFlashBetEventFromTicker(FlashBetGameEventDto event) {
        String str;
        int hashCode;
        Intrinsics.checkNotNullParameter(event, "event");
        String eventType = event.getEventType();
        if (eventType != null) {
            str = eventType.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        return str != null && ((hashCode = str.hashCode()) == -1819300634 ? str.equals("SHOT_OFF_TARGET") : hashCode == -837079828 ? str.equals("SHOT_ON_TARGET") : hashCode == 1940092521 && str.equals("ASSIST"));
    }

    public static final String flashBetEventTickerKey(int i, FlashBetGameEventDto event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int minute = event.getMinute();
        String eventType = event.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        return i + "_" + minute + "_" + eventType + "_" + event.getDescription() + "_" + event.getSource();
    }
}
