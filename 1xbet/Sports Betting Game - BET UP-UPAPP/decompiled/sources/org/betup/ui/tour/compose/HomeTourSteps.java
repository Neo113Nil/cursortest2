package org.betup.ui.tour.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.home.compose.HomePromoUiState;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.fragment.home.compose.HomeTourLazyKey;
import org.betup.ui.fragment.home.compose.HomeUiState;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeTourSteps.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nJ\"\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\nJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\nJ\u0018\u0010\u001d\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourSteps;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sequence", "", "Lorg/betup/ui/tour/compose/TourStep;", "getSequence", "()Ljava/util/List;", "fromUiState", "Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;", "uiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "targetForStep", "Lorg/betup/ui/tour/compose/HomeTourSteps$HomeTourTarget;", "step", "context", "resolveScrollKey", "", "requestedKey", "isHomeV2HighlightStep", "", "firstVisibleStep", "shouldSkipStep", "advanceFrom", "anchor", "direction", "", "scrollKeyForStep", "isFirstVisibleHomeStep", "SkipContext", "HomeTourTarget", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourSteps {
    public static final HomeTourSteps INSTANCE = new HomeTourSteps();
    private static final List<TourStep> sequence = CollectionsKt.listOf((Object[]) new TourStep[]{TourStep.CLICK_HOME_WIN_RATE, TourStep.CLICK_HOME_GLOBAL_RANK, TourStep.CLICK_HOME_BEST_STREAK, TourStep.CLICK_SPECIAL_OFFER, TourStep.CLICK_VIDEO_REWARD, TourStep.CLICK_DAILY_QUESTS, TourStep.CLICK_FLASH_BET, TourStep.CLICK_MINIGAMES, TourStep.CLICK_TV_BET, TourStep.CLICK_LIVE_ARENA, TourStep.CLICK_TOP_MATCHES, TourStep.CLICK_COMPETITIONS, TourStep.CLICK_BATTLES, TourStep.CLICK_RANKING, TourStep.CLICK_BOTTOM_SPORTS, TourStep.CLICK_BOTTOM_MY_BETS, TourStep.CLICK_BOTTOM_SHOP, TourStep.CLICK_BOTTOM_MENU});
    public static final int $stable = 8;

    /* compiled from: HomeTourSteps.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
                iArr[TourStep.CLICK_LIVE_ARENA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TourStep.CLICK_TOP_MATCHES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TourStep.CLICK_COMPETITIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TourStep.CLICK_BATTLES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TourStep.CLICK_MINIGAMES.ordinal()] = 11;
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
        }
    }

    private HomeTourSteps() {
    }

    public final List<TourStep> getSequence() {
        return sequence;
    }

    /* compiled from: HomeTourSteps.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;", "", "listKeys", "", "", "stats", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "promo", "Lorg/betup/ui/fragment/home/compose/HomePromoUiState;", "hasActiveSpecialOffer", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;Lorg/betup/ui/fragment/home/compose/HomePromoUiState;Z)V", "getListKeys", "()Ljava/util/List;", "getStats", "()Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "getPromo", "()Lorg/betup/ui/fragment/home/compose/HomePromoUiState;", "getHasActiveSpecialOffer", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SkipContext {
        public static final int $stable = 8;
        private final boolean hasActiveSpecialOffer;
        private final List<String> listKeys;
        private final HomePromoUiState promo;
        private final HomeStatsUiState stats;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkipContext copy$default(SkipContext skipContext, List list, HomeStatsUiState homeStatsUiState, HomePromoUiState homePromoUiState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = skipContext.listKeys;
            }
            if ((i & 2) != 0) {
                homeStatsUiState = skipContext.stats;
            }
            if ((i & 4) != 0) {
                homePromoUiState = skipContext.promo;
            }
            if ((i & 8) != 0) {
                z = skipContext.hasActiveSpecialOffer;
            }
            return skipContext.copy(list, homeStatsUiState, homePromoUiState, z);
        }

        public final List<String> component1() {
            return this.listKeys;
        }

        /* renamed from: component2, reason: from getter */
        public final HomeStatsUiState getStats() {
            return this.stats;
        }

        /* renamed from: component3, reason: from getter */
        public final HomePromoUiState getPromo() {
            return this.promo;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasActiveSpecialOffer() {
            return this.hasActiveSpecialOffer;
        }

        public final SkipContext copy(List<String> listKeys, HomeStatsUiState stats, HomePromoUiState promo, boolean hasActiveSpecialOffer) {
            Intrinsics.checkNotNullParameter(listKeys, "listKeys");
            Intrinsics.checkNotNullParameter(stats, "stats");
            Intrinsics.checkNotNullParameter(promo, "promo");
            return new SkipContext(listKeys, stats, promo, hasActiveSpecialOffer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkipContext)) {
                return false;
            }
            SkipContext skipContext = (SkipContext) other;
            return Intrinsics.areEqual(this.listKeys, skipContext.listKeys) && Intrinsics.areEqual(this.stats, skipContext.stats) && Intrinsics.areEqual(this.promo, skipContext.promo) && this.hasActiveSpecialOffer == skipContext.hasActiveSpecialOffer;
        }

        public int hashCode() {
            return (((((this.listKeys.hashCode() * 31) + this.stats.hashCode()) * 31) + this.promo.hashCode()) * 31) + Boolean.hashCode(this.hasActiveSpecialOffer);
        }

        public String toString() {
            return "SkipContext(listKeys=" + this.listKeys + ", stats=" + this.stats + ", promo=" + this.promo + ", hasActiveSpecialOffer=" + this.hasActiveSpecialOffer + ")";
        }

        public SkipContext(List<String> listKeys, HomeStatsUiState stats, HomePromoUiState promo, boolean z) {
            Intrinsics.checkNotNullParameter(listKeys, "listKeys");
            Intrinsics.checkNotNullParameter(stats, "stats");
            Intrinsics.checkNotNullParameter(promo, "promo");
            this.listKeys = listKeys;
            this.stats = stats;
            this.promo = promo;
            this.hasActiveSpecialOffer = z;
        }

        public /* synthetic */ SkipContext(List list, HomeStatsUiState homeStatsUiState, HomePromoUiState homePromoUiState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, homeStatsUiState, homePromoUiState, (i & 8) != 0 ? false : z);
        }

        public final List<String> getListKeys() {
            return this.listKeys;
        }

        public final HomeStatsUiState getStats() {
            return this.stats;
        }

        public final HomePromoUiState getPromo() {
            return this.promo;
        }

        public final boolean getHasActiveSpecialOffer() {
            return this.hasActiveSpecialOffer;
        }
    }

    public final SkipContext fromUiState(HomeUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        return new SkipContext(HomeTourBoundsKt.buildHomeLazyListKeys(uiState), uiState.getStats(), uiState.getPromo(), uiState.getBonusOfferActive() && uiState.getActiveOffer() != null);
    }

    /* compiled from: HomeTourSteps.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourSteps$HomeTourTarget;", "", "lazyKey", "", "align", "Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/tour/compose/HomeTourScroll$Align;)V", "getLazyKey", "()Ljava/lang/String;", "getAlign", "()Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HomeTourTarget {
        public static final int $stable = 0;
        private final HomeTourScroll.Align align;
        private final String lazyKey;

        public static /* synthetic */ HomeTourTarget copy$default(HomeTourTarget homeTourTarget, String str, HomeTourScroll.Align align, int i, Object obj) {
            if ((i & 1) != 0) {
                str = homeTourTarget.lazyKey;
            }
            if ((i & 2) != 0) {
                align = homeTourTarget.align;
            }
            return homeTourTarget.copy(str, align);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLazyKey() {
            return this.lazyKey;
        }

        /* renamed from: component2, reason: from getter */
        public final HomeTourScroll.Align getAlign() {
            return this.align;
        }

        public final HomeTourTarget copy(String lazyKey, HomeTourScroll.Align align) {
            Intrinsics.checkNotNullParameter(lazyKey, "lazyKey");
            Intrinsics.checkNotNullParameter(align, "align");
            return new HomeTourTarget(lazyKey, align);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomeTourTarget)) {
                return false;
            }
            HomeTourTarget homeTourTarget = (HomeTourTarget) other;
            return Intrinsics.areEqual(this.lazyKey, homeTourTarget.lazyKey) && this.align == homeTourTarget.align;
        }

        public int hashCode() {
            return (this.lazyKey.hashCode() * 31) + this.align.hashCode();
        }

        public String toString() {
            return "HomeTourTarget(lazyKey=" + this.lazyKey + ", align=" + this.align + ")";
        }

        public HomeTourTarget(String lazyKey, HomeTourScroll.Align align) {
            Intrinsics.checkNotNullParameter(lazyKey, "lazyKey");
            Intrinsics.checkNotNullParameter(align, "align");
            this.lazyKey = lazyKey;
            this.align = align;
        }

        public final String getLazyKey() {
            return this.lazyKey;
        }

        public final HomeTourScroll.Align getAlign() {
            return this.align;
        }
    }

    public final HomeTourTarget targetForStep(TourStep step, SkipContext context) {
        HomeTourScroll.Align align;
        Intrinsics.checkNotNullParameter(context, "context");
        String scrollKeyForStep = scrollKeyForStep(step, context);
        if (scrollKeyForStep == null) {
            return null;
        }
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                align = HomeTourScroll.Align.TOP;
                break;
            case 7:
            case 8:
                align = HomeTourScroll.Align.CENTER;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                align = HomeTourScroll.Align.BOTTOM;
                break;
            default:
                return null;
        }
        return new HomeTourTarget(scrollKeyForStep, align);
    }

    public final String resolveScrollKey(String requestedKey, SkipContext context) {
        Intrinsics.checkNotNullParameter(requestedKey, "requestedKey");
        Intrinsics.checkNotNullParameter(context, "context");
        return HomeTourBoundsKt.resolveHomeTourScrollKey(requestedKey, context.getListKeys());
    }

    public final boolean isHomeV2HighlightStep(TourStep step) {
        return step != null && sequence.contains(step);
    }

    public final TourStep firstVisibleStep(SkipContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return advanceFrom(null, 1, context);
    }

    public final boolean shouldSkipStep(TourStep step, SkipContext context) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> listKeys = context.getListKeys();
        HomeStatsUiState stats = context.getStats();
        HomePromoUiState promo = context.getPromo();
        switch (WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 1:
            case 3:
                if (listKeys.contains("stats") && (stats instanceof HomeStatsUiState.Visible)) {
                    return false;
                }
                break;
            case 2:
                if (!listKeys.contains("stats")) {
                    return true;
                }
                HomeStatsUiState.Visible visible = stats instanceof HomeStatsUiState.Visible ? (HomeStatsUiState.Visible) stats : null;
                if (visible == null) {
                    return true;
                }
                if (visible.getGlobalRankLabel() != null) {
                    return false;
                }
                break;
            case 4:
                if (!(promo instanceof HomePromoUiState.Loading) && listKeys.contains("promo") && context.getHasActiveSpecialOffer()) {
                    return false;
                }
                break;
            case 5:
                if (!(promo instanceof HomePromoUiState.Loading) && listKeys.contains("promo")) {
                    return false;
                }
                break;
            case 6:
                if (listKeys.contains(HomeTourLazyKey.DAILY_QUESTS)) {
                    return false;
                }
                break;
            case 7:
                if (listKeys.contains(HomeTourLazyKey.LIVE_ARENA)) {
                    return false;
                }
                break;
            case 8:
                if (listKeys.contains(HomeTourLazyKey.MORE_MATCHES)) {
                    return false;
                }
                break;
            case 9:
            case 10:
            case 12:
                if (listKeys.contains(HomeTourLazyKey.GAME_MODES)) {
                    return false;
                }
                break;
            case 11:
            case 13:
            case 14:
                if (listKeys.contains(HomeTourLazyKey.QUICK_PLAY)) {
                    return false;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                return false;
        }
        return true;
    }

    public final TourStep advanceFrom(TourStep anchor, int direction, SkipContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 0;
        if (anchor == null) {
            if (direction <= 0) {
                i = CollectionsKt.getLastIndex(sequence);
            }
        } else if (anchor != TourStep.DEMO_MATCH_WON || direction <= 0) {
            int indexOf = sequence.indexOf(anchor);
            if (indexOf < 0) {
                return null;
            }
            i = indexOf + direction;
        }
        while (i >= 0) {
            List<TourStep> list = sequence;
            if (i >= list.size()) {
                break;
            }
            TourStep tourStep = list.get(i);
            if (!shouldSkipStep(tourStep, context)) {
                return tourStep;
            }
            i += direction;
        }
        return null;
    }

    public final String scrollKeyForStep(TourStep step, SkipContext context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        switch (step == null ? -1 : WhenMappings.$EnumSwitchMapping$0[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "stats";
            case 4:
            case 5:
                return "promo";
            case 6:
                return HomeTourLazyKey.DAILY_QUESTS;
            case 7:
                List<String> listKeys = context.getListKeys();
                str = HomeTourLazyKey.LIVE_ARENA;
                if (!listKeys.contains(HomeTourLazyKey.LIVE_ARENA)) {
                    return null;
                }
                break;
            case 8:
                List<String> listKeys2 = context.getListKeys();
                str = HomeTourLazyKey.MORE_MATCHES;
                if (!listKeys2.contains(HomeTourLazyKey.MORE_MATCHES)) {
                    return null;
                }
                break;
            case 9:
            case 10:
            case 12:
                return HomeTourLazyKey.GAME_MODES;
            case 11:
            case 13:
            case 14:
                return HomeTourLazyKey.QUICK_PLAY;
            default:
                return null;
        }
        return str;
    }

    public final boolean isFirstVisibleHomeStep(TourStep step, SkipContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TourStep firstVisibleStep = firstVisibleStep(context);
        return firstVisibleStep != null && step == firstVisibleStep;
    }
}
