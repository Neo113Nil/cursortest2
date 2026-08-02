package org.betup.ui.tour.compose;

import android.graphics.Rect;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeTourHighlight.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ2\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u0017\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010$J&\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aJ\u0010\u0010-\u001a\u00020.2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourHighlight;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TILE_CORNER_RADIUS_DP", "", "TILE_WIDTH_FRACTION", "VIEW_ALL_CORNER_RADIUS_DP", "STAT_TILE_CORNER_RADIUS_DP", "PROMO_CARD_CORNER_RADIUS_DP", "MATCH_SECTION_CORNER_RADIUS_DP", "DEFAULT_BUBBLE_GAP_DP", "TILE_BUBBLE_GAP_DP", "quickPlayAndGameModesSteps", "", "Lorg/betup/ui/tour/compose/TourStep;", "usesExpandedBubbleGap", "", "step", "bubbleGapDp", "targetForStep", "Lorg/betup/ui/tour/compose/TourHighlightTarget;", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "usesRoundedCutout", "defaultBubblePlacement", "Lorg/betup/ui/tour/compose/TourBubblePlacement;", "resolveBubbleLayout", "Lorg/betup/ui/tour/compose/TourBubbleLayout;", "bounds", "Landroid/graphics/Rect;", "viewportHeightPx", "estimatedBubbleHeightPx", "bubbleGapPx", "quickPlayColumnIndex", "", "(Lorg/betup/ui/tour/compose/TourStep;)Ljava/lang/Integer;", "gameModesColumnIndex", "constrainBubbleStartPx", "preferredStartPx", "bubbleWidthPx", "containerWidthPx", "paddingPx", "mirrorPlacementForRtl", "placement", "tipPosition", "Lorg/betup/ui/tour/compose/TipPosition;", "HorizontalBias", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourHighlight {
    public static final float DEFAULT_BUBBLE_GAP_DP = 12.0f;
    public static final float MATCH_SECTION_CORNER_RADIUS_DP = 12.0f;
    public static final float PROMO_CARD_CORNER_RADIUS_DP = 12.0f;
    public static final float STAT_TILE_CORNER_RADIUS_DP = 12.0f;
    public static final float TILE_BUBBLE_GAP_DP = 28.0f;
    public static final float TILE_CORNER_RADIUS_DP = 10.0f;
    public static final float TILE_WIDTH_FRACTION = 0.8f;
    public static final float VIEW_ALL_CORNER_RADIUS_DP = 6.0f;
    public static final HomeTourHighlight INSTANCE = new HomeTourHighlight();
    private static final Set<TourStep> quickPlayAndGameModesSteps = SetsKt.setOf((Object[]) new TourStep[]{TourStep.CLICK_COMPETITIONS, TourStep.CLICK_BATTLES, TourStep.CLICK_MINIGAMES, TourStep.CLICK_RANKING, TourStep.CLICK_FLASH_BET, TourStep.CLICK_TV_BET});
    public static final int $stable = 8;

    /* compiled from: HomeTourHighlight.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TourStep.values().length];
            try {
                iArr[TourStep.CLICK_HOME_WIN_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourStep.CLICK_HOME_GLOBAL_RANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourStep.CLICK_HOME_BEST_STREAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TourStep.CLICK_SPECIAL_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TourStep.CLICK_VIDEO_REWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TourStep.CLICK_DAILY_QUESTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TourStep.CLICK_COMPETITIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TourStep.CLICK_BATTLES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TourStep.CLICK_MINIGAMES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TourStep.CLICK_LIVE_ARENA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TourStep.CLICK_TOP_MATCHES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TourStep.CLICK_RANKING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TourStep.CLICK_FLASH_BET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TourStep.CLICK_TV_BET.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SPORTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MY_BETS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SHOP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MENU.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HorizontalBias.values().length];
            try {
                iArr2[HorizontalBias.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[HorizontalBias.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[HorizontalBias.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TourBubblePlacement.values().length];
            try {
                iArr3[TourBubblePlacement.BelowStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[TourBubblePlacement.BelowEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[TourBubblePlacement.BelowCenter.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[TourBubblePlacement.AboveStart.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[TourBubblePlacement.AboveEnd.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[TourBubblePlacement.AboveCenter.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private HomeTourHighlight() {
    }

    public final boolean usesExpandedBubbleGap(TourStep step) {
        return step != null && quickPlayAndGameModesSteps.contains(step);
    }

    public final float bubbleGapDp(TourStep step) {
        return usesExpandedBubbleGap(step) ? 28.0f : 12.0f;
    }

    public final TourHighlightTarget targetForStep(TourStep step, TourState tourState) {
        Intrinsics.checkNotNullParameter(tourState, "tourState");
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 1:
                return new TourHighlightTarget(tourState.getHomeWinRateBounds(), 12.0f);
            case 2:
                return new TourHighlightTarget(tourState.getHomeGlobalRankBounds(), 12.0f);
            case 3:
                return new TourHighlightTarget(tourState.getHomeBestStreakBounds(), 12.0f);
            case 4:
                return new TourHighlightTarget(tourState.getSpecialOfferBounds(), 12.0f);
            case 5:
                return new TourHighlightTarget(tourState.getVideoRewardBounds(), 12.0f);
            case 6:
                return new TourHighlightTarget(tourState.getDailyQuestsBounds(), 12.0f);
            case 7:
                return new TourHighlightTarget(tourState.getCompetitionsButtonBounds(), 10.0f);
            case 8:
                return new TourHighlightTarget(tourState.getBattlesButtonBounds(), 10.0f);
            case 9:
                return new TourHighlightTarget(tourState.getMinigamesButtonBounds(), 10.0f);
            case 10:
                return new TourHighlightTarget(tourState.getLiveArenaSectionBounds(), 12.0f);
            case 11:
                return new TourHighlightTarget(tourState.getMoreMatchesSectionBounds(), 12.0f);
            case 12:
                return new TourHighlightTarget(tourState.getRankingButtonBounds(), 10.0f);
            case 13:
                return new TourHighlightTarget(tourState.getFlashBetButtonBounds(), 10.0f);
            case 14:
                return new TourHighlightTarget(tourState.getTvBetButtonBounds(), 10.0f);
            case 15:
            case 16:
            case 17:
            case 18:
                return new TourHighlightTarget(tourState.getBottomTabBounds(), 0.0f);
            default:
                return null;
        }
    }

    public final boolean usesRoundedCutout(TourStep step) {
        return HomeTourSteps.INSTANCE.isHomeV2HighlightStep(step) && !HomeTourScroll.INSTANCE.isBottomTabStep(step);
    }

    public final TourBubblePlacement defaultBubblePlacement(TourStep step) {
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
        }
        return TourBubblePlacement.AboveCenter;
    }

    public final TourBubbleLayout resolveBubbleLayout(TourStep step, Rect bounds, float viewportHeightPx, float estimatedBubbleHeightPx, float bubbleGapPx) {
        HorizontalBias horizontalBias;
        TourBubblePlacement tourBubblePlacement;
        TipPosition tipPosition;
        if (bounds == null || viewportHeightPx <= 0.0f) {
            return new TourBubbleLayout(defaultBubblePlacement(step), tipPosition(step));
        }
        float f = bounds.top - bubbleGapPx;
        float f2 = (viewportHeightPx - bounds.bottom) - bubbleGapPx;
        float f3 = viewportHeightPx * 0.5f;
        boolean z = false;
        boolean z2 = ((float) bounds.centerY()) > f3;
        if ((!usesExpandedBubbleGap(step) || !z2) && f2 >= estimatedBubbleHeightPx && f2 >= f) {
            z = true;
        }
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 5:
            case 10:
            case 11:
            case 14:
                horizontalBias = HorizontalBias.END;
                break;
            case 6:
            default:
                horizontalBias = HorizontalBias.CENTER;
                break;
            case 7:
            case 12:
            case 13:
                horizontalBias = HorizontalBias.START;
                break;
            case 8:
            case 9:
                horizontalBias = HorizontalBias.CENTER;
                break;
        }
        if (z) {
            int i = WhenMappings.$EnumSwitchMapping$1[horizontalBias.ordinal()];
            if (i == 1) {
                tourBubblePlacement = TourBubblePlacement.BelowStart;
            } else if (i == 2) {
                tourBubblePlacement = TourBubblePlacement.BelowEnd;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                tourBubblePlacement = TourBubblePlacement.BelowCenter;
            }
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$1[horizontalBias.ordinal()];
            if (i2 == 1) {
                tourBubblePlacement = TourBubblePlacement.AboveStart;
            } else if (i2 == 2) {
                tourBubblePlacement = TourBubblePlacement.AboveEnd;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                tourBubblePlacement = TourBubblePlacement.AboveCenter;
            }
        }
        switch (WhenMappings.$EnumSwitchMapping$2[tourBubblePlacement.ordinal()]) {
            case 1:
                tipPosition = TipPosition.TOP_LEFT;
                break;
            case 2:
                tipPosition = TipPosition.TOP_RIGHT;
                break;
            case 3:
                tipPosition = TipPosition.TOP_CENTER;
                break;
            case 4:
                tipPosition = TipPosition.BOTTOM_LEFT;
                break;
            case 5:
                tipPosition = TipPosition.BOTTOM_RIGHT;
                break;
            case 6:
                tipPosition = TipPosition.BOTTOM_CENTER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TourBubbleLayout(tourBubblePlacement, tipPosition);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeTourHighlight.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourHighlight$HorizontalBias;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "START", "END", "CENTER", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class HorizontalBias {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HorizontalBias[] $VALUES;
        public static final HorizontalBias START = new HorizontalBias("START", 0);
        public static final HorizontalBias END = new HorizontalBias("END", 1);
        public static final HorizontalBias CENTER = new HorizontalBias("CENTER", 2);

        private static final /* synthetic */ HorizontalBias[] $values() {
            return new HorizontalBias[]{START, END, CENTER};
        }

        public static EnumEntries<HorizontalBias> getEntries() {
            return $ENTRIES;
        }

        private HorizontalBias(String str, int i) {
        }

        static {
            HorizontalBias[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static HorizontalBias valueOf(String str) {
            return (HorizontalBias) Enum.valueOf(HorizontalBias.class, str);
        }

        public static HorizontalBias[] values() {
            return (HorizontalBias[]) $VALUES.clone();
        }
    }

    public final Integer quickPlayColumnIndex(TourStep step) {
        int i = step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()];
        if (i == 9) {
            return 1;
        }
        if (i != 13) {
            return i != 14 ? null : 2;
        }
        return 0;
    }

    public final Integer gameModesColumnIndex(TourStep step) {
        int i = step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()];
        if (i == 7) {
            return 0;
        }
        if (i != 8) {
            return i != 12 ? null : 2;
        }
        return 1;
    }

    public final float constrainBubbleStartPx(float preferredStartPx, float bubbleWidthPx, float containerWidthPx, float paddingPx) {
        return (containerWidthPx <= 0.0f || bubbleWidthPx <= 0.0f) ? preferredStartPx : RangesKt.coerceIn(preferredStartPx, paddingPx, RangesKt.coerceAtLeast((containerWidthPx - bubbleWidthPx) - paddingPx, paddingPx));
    }

    public final TourBubblePlacement mirrorPlacementForRtl(TourBubblePlacement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        int i = WhenMappings.$EnumSwitchMapping$2[placement.ordinal()];
        if (i == 1) {
            return TourBubblePlacement.BelowEnd;
        }
        if (i == 2) {
            return TourBubblePlacement.BelowStart;
        }
        if (i != 4) {
            return i != 5 ? placement : TourBubblePlacement.AboveStart;
        }
        return TourBubblePlacement.AboveEnd;
    }

    public final TipPosition tipPosition(TourStep step) {
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
        }
        return TipPosition.BOTTOM_CENTER;
    }
}
