package org.betup.ui.tour.compose;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.fragment.home.compose.HomeTourLazyKey;
import org.betup.ui.tour.compose.HomeTourSteps;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeTourScroll.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u000267B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ\u0016\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001aJB\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020$J\u0010\u0010.\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010/\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001aJ\u001c\u00102\u001a\u0004\u0018\u0001032\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u00104\u001a\u0004\u0018\u000105R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0011¨\u00068"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourScroll;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LIST_LAYOUT_TIMEOUT_MS", "", "ITEM_VISIBLE_TIMEOUT_MS", "POST_SCROLL_FRAME_COUNT", "", "SCROLL_SETTLE_MAX_FRAMES", "SCROLL_SETTLE_STABLE_FRAME_COUNT", "VIEWPORT_EDGE_PADDING_FRACTION", "", "BOTTOM_HEAVY_LAZY_KEYS", "", "", "getBOTTOM_HEAVY_LAZY_KEYS", "()Ljava/util/Set;", "viewportEdgePaddingPx", "viewportHeightPx", "TILE_VIEWPORT_BOTTOM_SPACING_MULTIPLIER", "GAME_MODES_NUDGE_MAX_ATTEMPTS", "GAME_MODES_MAX_NUDGE_PX", "GAME_MODES_LABEL_SPACING_MULTIPLIER", "GAME_MODES_TITLE_BLOCK_SPACING_MULTIPLIER", "GAME_MODE_TILE_STEPS", "Lorg/betup/ui/tour/compose/TourStep;", "getGAME_MODE_TILE_STEPS", "gameModeTileViewportBottomPaddingPx", "mainAxisItemSpacingPx", "bottomAlignExtraInsetPx", "lazyKey", "gameModesTitleBlockPx", "gameModesTourMinimalBottomClearancePx", "afterContentPaddingPx", "isGameModeTileStep", "", "step", "shouldShowTourOverlay", "isOverlayVisible", "currentStep", "isSportScrollComplete", "isLeagueScrollComplete", "isMatchScrollComplete", "isHomeScrollComplete", "isDemoWinRewardDialogBlockingHomeTour", "requiresScroll", "isBottomTabStep", "bottomTabSteps", "getBottomTabSteps", "scrollRequestForStep", "Lorg/betup/ui/tour/compose/HomeTourScroll$ScrollRequest;", "context", "Lorg/betup/ui/tour/compose/HomeTourSteps$SkipContext;", "Align", "ScrollRequest", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourScroll {
    private static final int GAME_MODES_LABEL_SPACING_MULTIPLIER = 2;
    public static final int GAME_MODES_MAX_NUDGE_PX = 120;
    public static final int GAME_MODES_NUDGE_MAX_ATTEMPTS = 4;
    private static final int GAME_MODES_TITLE_BLOCK_SPACING_MULTIPLIER = 5;
    public static final long ITEM_VISIBLE_TIMEOUT_MS = 900;
    public static final long LIST_LAYOUT_TIMEOUT_MS = 1200;
    public static final int POST_SCROLL_FRAME_COUNT = 2;
    public static final int SCROLL_SETTLE_MAX_FRAMES = 8;
    public static final int SCROLL_SETTLE_STABLE_FRAME_COUNT = 2;
    private static final int TILE_VIEWPORT_BOTTOM_SPACING_MULTIPLIER = 7;
    public static final float VIEWPORT_EDGE_PADDING_FRACTION = 0.027f;
    public static final HomeTourScroll INSTANCE = new HomeTourScroll();
    private static final Set<String> BOTTOM_HEAVY_LAZY_KEYS = SetsKt.setOf((Object[]) new String[]{HomeTourLazyKey.QUICK_PLAY, HomeTourLazyKey.GAME_MODES});
    private static final Set<TourStep> GAME_MODE_TILE_STEPS = SetsKt.setOf((Object[]) new TourStep[]{TourStep.CLICK_COMPETITIONS, TourStep.CLICK_BATTLES, TourStep.CLICK_RANKING});
    private static final Set<TourStep> bottomTabSteps = SetsKt.setOf((Object[]) new TourStep[]{TourStep.CLICK_BOTTOM_SPORTS, TourStep.CLICK_BOTTOM_MY_BETS, TourStep.CLICK_BOTTOM_SHOP, TourStep.CLICK_BOTTOM_MENU});
    public static final int $stable = 8;

    private HomeTourScroll() {
    }

    public final Set<String> getBOTTOM_HEAVY_LAZY_KEYS() {
        return BOTTOM_HEAVY_LAZY_KEYS;
    }

    public final int viewportEdgePaddingPx(int viewportHeightPx) {
        return RangesKt.coerceIn((int) (viewportHeightPx * 0.027f), 24, 72);
    }

    public final Set<TourStep> getGAME_MODE_TILE_STEPS() {
        return GAME_MODE_TILE_STEPS;
    }

    public final int gameModeTileViewportBottomPaddingPx(int mainAxisItemSpacingPx) {
        return RangesKt.coerceAtLeast((mainAxisItemSpacingPx * 7) / 3, 84);
    }

    public static /* synthetic */ int bottomAlignExtraInsetPx$default(HomeTourScroll homeTourScroll, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return homeTourScroll.bottomAlignExtraInsetPx(i, str);
    }

    public final int bottomAlignExtraInsetPx(int mainAxisItemSpacingPx, String lazyKey) {
        int i = mainAxisItemSpacingPx * 2;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 24);
        return Intrinsics.areEqual(lazyKey, HomeTourLazyKey.GAME_MODES) ? coerceAtLeast + RangesKt.coerceAtLeast(i, 24) : coerceAtLeast;
    }

    public final int gameModesTitleBlockPx(int mainAxisItemSpacingPx) {
        return RangesKt.coerceIn(mainAxisItemSpacingPx * 5, 56, 128);
    }

    public final int gameModesTourMinimalBottomClearancePx(int mainAxisItemSpacingPx, int afterContentPaddingPx) {
        return RangesKt.coerceAtLeast(mainAxisItemSpacingPx, 36) + afterContentPaddingPx;
    }

    public final boolean isGameModeTileStep(TourStep step) {
        return step != null && GAME_MODE_TILE_STEPS.contains(step);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeTourScroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Align {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        public static final Align TOP = new Align("TOP", 0);
        public static final Align CENTER = new Align("CENTER", 1);
        public static final Align BOTTOM = new Align("BOTTOM", 2);

        private static final /* synthetic */ Align[] $values() {
            return new Align[]{TOP, CENTER, BOTTOM};
        }

        public static EnumEntries<Align> getEntries() {
            return $ENTRIES;
        }

        private Align(String str, int i) {
        }

        static {
            Align[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    /* compiled from: HomeTourScroll.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourScroll$ScrollRequest;", "", "key", "", "align", "Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", "scrollListToTop", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/tour/compose/HomeTourScroll$Align;Z)V", "getKey", "()Ljava/lang/String;", "getAlign", "()Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", "getScrollListToTop", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScrollRequest {
        public static final int $stable = 0;
        private final Align align;
        private final String key;
        private final boolean scrollListToTop;

        public static /* synthetic */ ScrollRequest copy$default(ScrollRequest scrollRequest, String str, Align align, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scrollRequest.key;
            }
            if ((i & 2) != 0) {
                align = scrollRequest.align;
            }
            if ((i & 4) != 0) {
                z = scrollRequest.scrollListToTop;
            }
            return scrollRequest.copy(str, align, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final Align getAlign() {
            return this.align;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getScrollListToTop() {
            return this.scrollListToTop;
        }

        public final ScrollRequest copy(String key, Align align, boolean scrollListToTop) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(align, "align");
            return new ScrollRequest(key, align, scrollListToTop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollRequest)) {
                return false;
            }
            ScrollRequest scrollRequest = (ScrollRequest) other;
            return Intrinsics.areEqual(this.key, scrollRequest.key) && this.align == scrollRequest.align && this.scrollListToTop == scrollRequest.scrollListToTop;
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.align.hashCode()) * 31) + Boolean.hashCode(this.scrollListToTop);
        }

        public String toString() {
            return "ScrollRequest(key=" + this.key + ", align=" + this.align + ", scrollListToTop=" + this.scrollListToTop + ")";
        }

        public ScrollRequest(String key, Align align, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(align, "align");
            this.key = key;
            this.align = align;
            this.scrollListToTop = z;
        }

        public /* synthetic */ ScrollRequest(String str, Align align, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, align, (i & 4) != 0 ? false : z);
        }

        public final String getKey() {
            return this.key;
        }

        public final Align getAlign() {
            return this.align;
        }

        public final boolean getScrollListToTop() {
            return this.scrollListToTop;
        }
    }

    public final boolean shouldShowTourOverlay(boolean isOverlayVisible, TourStep currentStep, boolean isSportScrollComplete, boolean isLeagueScrollComplete, boolean isMatchScrollComplete, boolean isHomeScrollComplete, boolean isDemoWinRewardDialogBlockingHomeTour) {
        if (!isOverlayVisible || currentStep == null) {
            return false;
        }
        if ((isDemoWinRewardDialogBlockingHomeTour && HomeTourSteps.INSTANCE.isHomeV2HighlightStep(currentStep)) || currentStep == TourStep.SELECT_BET) {
            return false;
        }
        if (currentStep == TourStep.SELECT_SPORT && !isSportScrollComplete) {
            return false;
        }
        if (currentStep == TourStep.SELECT_LEAGUE && !isLeagueScrollComplete) {
            return false;
        }
        if (currentStep != TourStep.SELECT_MATCH || isMatchScrollComplete) {
            return !requiresScroll(currentStep) || isHomeScrollComplete;
        }
        return false;
    }

    public final boolean requiresScroll(TourStep step) {
        return (step == null || !HomeTourSteps.INSTANCE.isHomeV2HighlightStep(step) || isBottomTabStep(step)) ? false : true;
    }

    public final boolean isBottomTabStep(TourStep step) {
        return CollectionsKt.contains(bottomTabSteps, step);
    }

    public final Set<TourStep> getBottomTabSteps() {
        return bottomTabSteps;
    }

    public final ScrollRequest scrollRequestForStep(TourStep step, HomeTourSteps.SkipContext context) {
        HomeTourSteps.HomeTourTarget targetForStep;
        if (!HomeTourSteps.INSTANCE.isHomeV2HighlightStep(step) || context == null || CollectionsKt.contains(bottomTabSteps, step) || (targetForStep = HomeTourSteps.INSTANCE.targetForStep(step, context)) == null) {
            return null;
        }
        return new ScrollRequest(targetForStep.getLazyKey(), targetForStep.getAlign(), HomeTourSteps.INSTANCE.isFirstVisibleHomeStep(step, context));
    }
}
