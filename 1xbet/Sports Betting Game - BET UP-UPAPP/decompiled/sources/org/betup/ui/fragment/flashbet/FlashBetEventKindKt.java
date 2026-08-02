package org.betup.ui.fragment.flashbet;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetEventKind.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\b\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\b\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\b\u001a\n\u0010\u0011\u001a\u00020\u000e*\u00020\b\u001a\u0018\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002\u001a\u0017\u0010\u0013\u001a\u00020\u0014*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0002\u0010\u0016\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"YELLOW_KEYWORDS", "", "", "RED_KEYWORDS", "GOAL_KEYWORDS", "SUB_KEYWORDS", "CORNER_KEYWORDS", "resolveFlashBetEventKind", "Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;", "eventType", "description", "mapServerEventType", "resolveFlashBetEventKindFromDescription", "shouldShowInTicker", "", "isMajorTickerEvent", "shouldShowEventFlash", "shouldPlayEventSound", "isPenaltyGoalEvent", "tickerDotColor", "Landroidx/compose/ui/graphics/Color;", "isHome", "(Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;Z)J", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetEventKindKt {
    private static final List<String> YELLOW_KEYWORDS = CollectionsKt.listOf((Object[]) new String[]{"yellow card", "yellow ·", "yellow -", "gelbe karte", "tarjeta amarilla", "carton jaune", "cartellino giallo", "жёлт", "жовт", "galben", "cartonaș galben", "cartonas galben", "gelb"});
    private static final List<String> RED_KEYWORDS = CollectionsKt.listOf((Object[]) new String[]{"red card", "rote karte", "tarjeta roja", "carton rouge", "cartellino rosso", "красн", "roșu", "rosu", "cartonaș roșu"});
    private static final List<String> GOAL_KEYWORDS = CollectionsKt.listOf((Object[]) new String[]{"goal", " gol ", "gol!", "tor", "but", "гол", "penalty buried", "penalty scored", "scored", "scores", "înscrie", "marche"});
    private static final List<String> SUB_KEYWORDS = CollectionsKt.listOf((Object[]) new String[]{"sub ·", "sub ", "substitution", "înlocuire", "wechsel", "sustituc", "sostituz", "замен", "replacement", "⇄"});
    private static final List<String> CORNER_KEYWORDS = CollectionsKt.listOf((Object[]) new String[]{"corner", "colț", "ecke", "córner", "corner kick"});

    /* compiled from: FlashBetEventKind.kt */
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
                iArr[FlashBetEventKind.PENALTY_MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlashBetEventKind.SUBSTITUTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlashBetEventKind.CORNER.ordinal()] = 6;
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

    public static final boolean shouldShowInTicker(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        return true;
    }

    public static final FlashBetEventKind resolveFlashBetEventKind(String str, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        FlashBetEventKind mapServerEventType = mapServerEventType(str);
        return mapServerEventType != null ? mapServerEventType : resolveFlashBetEventKindFromDescription(description);
    }

    public static final FlashBetEventKind resolveFlashBetEventKind(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return resolveFlashBetEventKindFromDescription(description);
    }

    private static final FlashBetEventKind mapServerEventType(String str) {
        String str2;
        String str3;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        switch (str2.hashCode()) {
            case -1819300634:
                str3 = "SHOT_OFF_TARGET";
                break;
            case -1151538435:
                if (str2.equals("SUBSTITUTION")) {
                    return FlashBetEventKind.SUBSTITUTION;
                }
                return null;
            case -837079828:
                str3 = "SHOT_ON_TARGET";
                break;
            case -830421210:
                str3 = "OFFSIDE";
                break;
            case 0:
                str3 = "";
                break;
            case 2193171:
                if (str2.equals("GOAL")) {
                    return FlashBetEventKind.GOAL;
                }
                return null;
            case 26349086:
                if (str2.equals("RED_CARD")) {
                    return FlashBetEventKind.RED_CARD;
                }
                return null;
            case 75532016:
                str3 = "OTHER";
                break;
            case 1150972761:
                if (str2.equals("HALF_TIME")) {
                    return FlashBetEventKind.HALF_TIME;
                }
                return null;
            case 1666448379:
                if (str2.equals("YELLOW_CARD")) {
                    return FlashBetEventKind.YELLOW_CARD;
                }
                return null;
            case 1940092521:
                str3 = "ASSIST";
                break;
            case 1993631317:
                if (str2.equals("CORNER")) {
                    return FlashBetEventKind.CORNER;
                }
                return null;
            case 2002581297:
                if (str2.equals("PENALTY_MISSED")) {
                    return FlashBetEventKind.PENALTY_MISSED;
                }
                return null;
            default:
                return null;
        }
        str2.equals(str3);
        return null;
    }

    private static final FlashBetEventKind resolveFlashBetEventKindFromDescription(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List<String> list = RED_KEYWORDS;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it.next(), false, 2, (Object) null)) {
                    return FlashBetEventKind.RED_CARD;
                }
            }
        }
        List<String> list2 = YELLOW_KEYWORDS;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it2.next(), false, 2, (Object) null)) {
                    return FlashBetEventKind.YELLOW_CARD;
                }
            }
        }
        List<String> list3 = SUB_KEYWORDS;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it3.next(), false, 2, (Object) null)) {
                    return FlashBetEventKind.SUBSTITUTION;
                }
            }
        }
        List<String> list4 = CORNER_KEYWORDS;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it4.next(), false, 2, (Object) null)) {
                    return FlashBetEventKind.CORNER;
                }
            }
        }
        List<String> list5 = GOAL_KEYWORDS;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) it5.next(), false, 2, (Object) null)) {
                    return FlashBetEventKind.GOAL;
                }
            }
        }
        String str2 = lowerCase;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "missed penalty", false, 2, (Object) null)) {
            return FlashBetEventKind.PENALTY_MISSED;
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "half time", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "score after first half", false, 2, (Object) null)) {
            return FlashBetEventKind.HALF_TIME;
        }
        return FlashBetEventKind.OTHER;
    }

    public static final boolean isMajorTickerEvent(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[flashBetEventKind.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static final boolean shouldShowEventFlash(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[flashBetEventKind.ordinal()];
        return i == 2 || i == 3 || i == 4;
    }

    public static final boolean shouldPlayEventSound(FlashBetEventKind flashBetEventKind) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        return flashBetEventKind != FlashBetEventKind.GOAL;
    }

    public static final boolean isPenaltyGoalEvent(String str, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        String lowerCase = description.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = lowerCase;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "missed penalty", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "penalty missed", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "penalty ratat", false, 2, (Object) null) || resolveFlashBetEventKind(str, description) != FlashBetEventKind.GOAL) {
            return false;
        }
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "penalty", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "rigore", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "pênalti", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "elfmeter", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "penalti", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "пенальт", false, 2, (Object) null);
    }

    public static final long tickerDotColor(FlashBetEventKind flashBetEventKind, boolean z) {
        Intrinsics.checkNotNullParameter(flashBetEventKind, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[flashBetEventKind.ordinal()]) {
            case 1:
                return ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
            case 2:
                return ColorKt.Color(4294953984L);
            case 3:
                return ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
            case 4:
                return Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
            case 5:
                return ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
            case 6:
                return ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
            case 7:
                return ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            case 8:
                if (z) {
                    return ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                }
                return ComposeUtils.AppColorPalette.GoldBackgroundFortune2.INSTANCE.getColor();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
