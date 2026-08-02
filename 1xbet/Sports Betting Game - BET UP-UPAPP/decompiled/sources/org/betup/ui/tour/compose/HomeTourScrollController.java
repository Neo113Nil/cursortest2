package org.betup.ui.tour.compose;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.TimeoutKt;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.fragment.home.compose.HomeTourLazyKey;
import org.betup.ui.fragment.home.compose.HomeUiState;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.betup.ui.tour.compose.HomeTourSteps;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeTourScrollController.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ>\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0002J\u001e\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\"J(\u0010#\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\"J \u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u00101J2\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u00105J$\u00106\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0010H\u0002J$\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u0002092\b\u00104\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010:\u001a\u00020\u0019H\u0002J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u0019H\u0002J \u0010=\u001a\u00020(2\u0006\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u0010>J \u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010BJ\u000e\u0010C\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J$\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100E2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010GJ\u0016\u0010H\u001a\u00020(2\u0006\u00103\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010IJ\u000e\u0010J\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lorg/betup/ui/tour/compose/HomeTourScrollController;", "", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/foundation/lazy/LazyListState;)V", "scrollForStep", "", "step", "Lorg/betup/ui/tour/compose/TourStep;", "uiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "(Lorg/betup/ui/tour/compose/TourStep;Lorg/betup/ui/fragment/home/compose/HomeUiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToTourTarget", "scrollToLazyKey", "key", "", "align", "Lorg/betup/ui/tour/compose/HomeTourScroll$Align;", "animate", "lazyKeyForInset", "(Ljava/lang/String;Lorg/betup/ui/fragment/home/compose/HomeUiState;Lorg/betup/ui/tour/compose/HomeTourScroll$Align;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollGameModesForTour", "(Lorg/betup/ui/fragment/home/compose/HomeUiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeGameModesTileRowBottomOffset", "", "itemHeight", "tileRowHeight", "viewportHeight", "titleBlockPx", "bottomClearancePx", "ensureGameModeTileFullyVisible", "tileBottomScreenPx", "listViewportBottomScreenPx", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToLazyKey", "(Ljava/lang/String;Lorg/betup/ui/fragment/home/compose/HomeUiState;Lorg/betup/ui/tour/compose/HomeTourScroll$Align;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToTop", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitScrollPositionSettled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isGameModesTileRowAcceptablyVisible", "restoreScrollPositionIfDrifted", "expectedIndex", "expectedOffset", "scrollToOffset", "pixels", "", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToIndex", "index", "lazyKey", "(ILorg/betup/ui/tour/compose/HomeTourScroll$Align;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeScrollOffsetForAlign", "computeBottomAlignInsetPx", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "itemIndex", "fallbackBottomSpacerPx", "mainAxisItemSpacingPx", "correctScrollIfBottomClipped", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nudgeGameModesTileRowByLayout", "gameModesIndex", "minimalBottomClearance", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitListLaidOut", "awaitSectionKeysContaining", "", "resolvedKey", "(Lorg/betup/ui/fragment/home/compose/HomeUiState;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitItemIndexVisible", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPostScrollFrames", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourScrollController {
    public static final int $stable = 0;
    private final LazyListState listState;

    /* compiled from: HomeTourScrollController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeTourScroll.Align.values().length];
            try {
                iArr[HomeTourScroll.Align.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeTourScroll.Align.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeTourScroll.Align.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HomeTourScrollController(LazyListState listState) {
        Intrinsics.checkNotNullParameter(listState, "listState");
        this.listState = listState;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bc A[PHI: r11
      0x00bc: PHI (r11v15 java.lang.Object) = (r11v13 java.lang.Object), (r11v1 java.lang.Object) binds: [B:18:0x00b9, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollForStep(TourStep tourStep, HomeUiState homeUiState, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$scrollForStep$1 homeTourScrollController$scrollForStep$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        HomeTourScroll.ScrollRequest scrollRequestForStep;
        HomeUiState homeUiState2;
        String str;
        HomeTourScroll.ScrollRequest scrollRequest;
        String str2;
        if (continuation instanceof HomeTourScrollController$scrollForStep$1) {
            homeTourScrollController$scrollForStep$1 = (HomeTourScrollController$scrollForStep$1) continuation;
            if ((homeTourScrollController$scrollForStep$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollForStep$1.label -= Integer.MIN_VALUE;
                HomeTourScrollController$scrollForStep$1 homeTourScrollController$scrollForStep$12 = homeTourScrollController$scrollForStep$1;
                obj = homeTourScrollController$scrollForStep$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$scrollForStep$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (HomeTourScroll.INSTANCE.isBottomTabStep(tourStep) || !HomeTourScroll.INSTANCE.requiresScroll(tourStep)) {
                        return Boxing.boxBoolean(true);
                    }
                    HomeTourSteps.SkipContext fromUiState = HomeTourSteps.INSTANCE.fromUiState(homeUiState);
                    scrollRequestForStep = HomeTourScroll.INSTANCE.scrollRequestForStep(tourStep, fromUiState);
                    if (scrollRequestForStep == null) {
                        return Boxing.boxBoolean(true);
                    }
                    String resolveHomeTourScrollKey = HomeTourBoundsKt.resolveHomeTourScrollKey(scrollRequestForStep.getKey(), homeUiState);
                    if (!fromUiState.getListKeys().contains(resolveHomeTourScrollKey)) {
                        return Boxing.boxBoolean(false);
                    }
                    if (scrollRequestForStep.getScrollListToTop()) {
                        homeTourScrollController$scrollForStep$12.L$0 = homeUiState;
                        homeTourScrollController$scrollForStep$12.L$1 = scrollRequestForStep;
                        homeTourScrollController$scrollForStep$12.L$2 = resolveHomeTourScrollKey;
                        homeTourScrollController$scrollForStep$12.label = 1;
                        if (scrollToTop(false, homeTourScrollController$scrollForStep$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scrollRequest = scrollRequestForStep;
                        str2 = resolveHomeTourScrollKey;
                    } else {
                        homeUiState2 = homeUiState;
                        str = resolveHomeTourScrollKey;
                        HomeTourScroll.Align align = scrollRequestForStep.getAlign();
                        homeTourScrollController$scrollForStep$12.L$0 = null;
                        homeTourScrollController$scrollForStep$12.L$1 = null;
                        homeTourScrollController$scrollForStep$12.L$2 = null;
                        homeTourScrollController$scrollForStep$12.label = 2;
                        obj = scrollToLazyKey(str, homeUiState2, align, false, str, homeTourScrollController$scrollForStep$12);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) homeTourScrollController$scrollForStep$12.L$2;
                    HomeTourScroll.ScrollRequest scrollRequest2 = (HomeTourScroll.ScrollRequest) homeTourScrollController$scrollForStep$12.L$1;
                    HomeUiState homeUiState3 = (HomeUiState) homeTourScrollController$scrollForStep$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    scrollRequest = scrollRequest2;
                    homeUiState = homeUiState3;
                }
                str = str2;
                homeUiState2 = homeUiState;
                scrollRequestForStep = scrollRequest;
                HomeTourScroll.Align align2 = scrollRequestForStep.getAlign();
                homeTourScrollController$scrollForStep$12.L$0 = null;
                homeTourScrollController$scrollForStep$12.L$1 = null;
                homeTourScrollController$scrollForStep$12.L$2 = null;
                homeTourScrollController$scrollForStep$12.label = 2;
                obj = scrollToLazyKey(str, homeUiState2, align2, false, str, homeTourScrollController$scrollForStep$12);
                if (obj == coroutine_suspended) {
                }
            }
        }
        homeTourScrollController$scrollForStep$1 = new HomeTourScrollController$scrollForStep$1(this, continuation);
        HomeTourScrollController$scrollForStep$1 homeTourScrollController$scrollForStep$122 = homeTourScrollController$scrollForStep$1;
        obj = homeTourScrollController$scrollForStep$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$scrollForStep$122.label;
        if (i != 0) {
        }
        str = str2;
        homeUiState2 = homeUiState;
        scrollRequestForStep = scrollRequest;
        HomeTourScroll.Align align22 = scrollRequestForStep.getAlign();
        homeTourScrollController$scrollForStep$122.L$0 = null;
        homeTourScrollController$scrollForStep$122.L$1 = null;
        homeTourScrollController$scrollForStep$122.L$2 = null;
        homeTourScrollController$scrollForStep$122.label = 2;
        obj = scrollToLazyKey(str, homeUiState2, align22, false, str, homeTourScrollController$scrollForStep$122);
        if (obj == coroutine_suspended) {
        }
    }

    public final Object scrollToTourTarget(TourStep tourStep, HomeUiState homeUiState, Continuation<? super Boolean> continuation) {
        return scrollForStep(tourStep, homeUiState, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToLazyKey(String str, HomeUiState homeUiState, HomeTourScroll.Align align, boolean z, String str2, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$scrollToLazyKey$1 homeTourScrollController$scrollToLazyKey$1;
        String resolveHomeTourScrollKey;
        String str3;
        HomeTourScroll.Align align2;
        String str4;
        int indexOf;
        HomeTourScroll.Align align3;
        int i;
        String str5;
        if (continuation instanceof HomeTourScrollController$scrollToLazyKey$1) {
            homeTourScrollController$scrollToLazyKey$1 = (HomeTourScrollController$scrollToLazyKey$1) continuation;
            if ((homeTourScrollController$scrollToLazyKey$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollToLazyKey$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$scrollToLazyKey$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (homeTourScrollController$scrollToLazyKey$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        resolveHomeTourScrollKey = HomeTourBoundsKt.resolveHomeTourScrollKey(str, homeUiState);
                        if (Intrinsics.areEqual(resolveHomeTourScrollKey, HomeTourLazyKey.GAME_MODES) && align == HomeTourScroll.Align.BOTTOM) {
                            homeTourScrollController$scrollToLazyKey$1.label = 1;
                            obj = scrollGameModesForTour(homeUiState, homeTourScrollController$scrollToLazyKey$1);
                            return obj == coroutine_suspended ? coroutine_suspended : obj;
                        }
                        homeTourScrollController$scrollToLazyKey$1.L$0 = homeUiState;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = align;
                        homeTourScrollController$scrollToLazyKey$1.L$2 = str2;
                        homeTourScrollController$scrollToLazyKey$1.L$3 = resolveHomeTourScrollKey;
                        homeTourScrollController$scrollToLazyKey$1.Z$0 = z;
                        homeTourScrollController$scrollToLazyKey$1.label = 2;
                        if (awaitListLaidOut(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str2;
                        homeTourScrollController$scrollToLazyKey$1.L$2 = resolveHomeTourScrollKey;
                        homeTourScrollController$scrollToLazyKey$1.L$3 = null;
                        homeTourScrollController$scrollToLazyKey$1.Z$0 = z;
                        homeTourScrollController$scrollToLazyKey$1.label = 3;
                        obj = awaitSectionKeysContaining(homeUiState, resolveHomeTourScrollKey, homeTourScrollController$scrollToLazyKey$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = resolveHomeTourScrollKey;
                        align2 = align;
                        str4 = str2;
                        indexOf = ((List) obj).indexOf(str3);
                        if (indexOf >= 0) {
                            return Boxing.boxBoolean(false);
                        }
                        String str6 = str4 == null ? str3 : str4;
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align2;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str6;
                        homeTourScrollController$scrollToLazyKey$1.L$2 = null;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = indexOf;
                        homeTourScrollController$scrollToLazyKey$1.label = 4;
                        if (scrollToIndex(indexOf, align2, z, str6, homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        align3 = align2;
                        i = indexOf;
                        str5 = str6;
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align3;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str5;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = i;
                        homeTourScrollController$scrollToLazyKey$1.label = 5;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align3;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str5;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = i;
                        homeTourScrollController$scrollToLazyKey$1.label = 6;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (align3 == HomeTourScroll.Align.BOTTOM) {
                            homeTourScrollController$scrollToLazyKey$1.L$0 = null;
                            homeTourScrollController$scrollToLazyKey$1.L$1 = null;
                            homeTourScrollController$scrollToLazyKey$1.label = 7;
                            if (correctScrollIfBottomClipped(i, str5, homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            homeTourScrollController$scrollToLazyKey$1.label = 8;
                            if (awaitPostScrollFrames(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Boxing.boxBoolean(true);
                    case 1:
                        ResultKt.throwOnFailure(obj);
                    case 2:
                        z = homeTourScrollController$scrollToLazyKey$1.Z$0;
                        resolveHomeTourScrollKey = (String) homeTourScrollController$scrollToLazyKey$1.L$3;
                        str2 = (String) homeTourScrollController$scrollToLazyKey$1.L$2;
                        align = (HomeTourScroll.Align) homeTourScrollController$scrollToLazyKey$1.L$1;
                        homeUiState = (HomeUiState) homeTourScrollController$scrollToLazyKey$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str2;
                        homeTourScrollController$scrollToLazyKey$1.L$2 = resolveHomeTourScrollKey;
                        homeTourScrollController$scrollToLazyKey$1.L$3 = null;
                        homeTourScrollController$scrollToLazyKey$1.Z$0 = z;
                        homeTourScrollController$scrollToLazyKey$1.label = 3;
                        obj = awaitSectionKeysContaining(homeUiState, resolveHomeTourScrollKey, homeTourScrollController$scrollToLazyKey$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        boolean z2 = homeTourScrollController$scrollToLazyKey$1.Z$0;
                        str3 = (String) homeTourScrollController$scrollToLazyKey$1.L$2;
                        str4 = (String) homeTourScrollController$scrollToLazyKey$1.L$1;
                        HomeTourScroll.Align align4 = (HomeTourScroll.Align) homeTourScrollController$scrollToLazyKey$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        align2 = align4;
                        z = z2;
                        indexOf = ((List) obj).indexOf(str3);
                        if (indexOf >= 0) {
                        }
                        break;
                    case 4:
                        i = homeTourScrollController$scrollToLazyKey$1.I$0;
                        str5 = (String) homeTourScrollController$scrollToLazyKey$1.L$1;
                        align3 = (HomeTourScroll.Align) homeTourScrollController$scrollToLazyKey$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align3;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str5;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = i;
                        homeTourScrollController$scrollToLazyKey$1.label = 5;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align3;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str5;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = i;
                        homeTourScrollController$scrollToLazyKey$1.label = 6;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                        }
                        if (align3 == HomeTourScroll.Align.BOTTOM) {
                        }
                        return Boxing.boxBoolean(true);
                    case 5:
                        i = homeTourScrollController$scrollToLazyKey$1.I$0;
                        str5 = (String) homeTourScrollController$scrollToLazyKey$1.L$1;
                        align3 = (HomeTourScroll.Align) homeTourScrollController$scrollToLazyKey$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToLazyKey$1.L$0 = align3;
                        homeTourScrollController$scrollToLazyKey$1.L$1 = str5;
                        homeTourScrollController$scrollToLazyKey$1.I$0 = i;
                        homeTourScrollController$scrollToLazyKey$1.label = 6;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                        }
                        if (align3 == HomeTourScroll.Align.BOTTOM) {
                        }
                        return Boxing.boxBoolean(true);
                    case 6:
                        i = homeTourScrollController$scrollToLazyKey$1.I$0;
                        str5 = (String) homeTourScrollController$scrollToLazyKey$1.L$1;
                        align3 = (HomeTourScroll.Align) homeTourScrollController$scrollToLazyKey$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (align3 == HomeTourScroll.Align.BOTTOM) {
                        }
                        return Boxing.boxBoolean(true);
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToLazyKey$1.label = 8;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToLazyKey$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        homeTourScrollController$scrollToLazyKey$1 = new HomeTourScrollController$scrollToLazyKey$1(this, continuation);
        Object obj2 = homeTourScrollController$scrollToLazyKey$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (homeTourScrollController$scrollToLazyKey$1.label) {
        }
    }

    public static /* synthetic */ Object scrollToLazyKey$default(HomeTourScrollController homeTourScrollController, String str, HomeUiState homeUiState, HomeTourScroll.Align align, boolean z, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            align = HomeTourScroll.Align.TOP;
        }
        HomeTourScroll.Align align2 = align;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = null;
        }
        return homeTourScrollController.scrollToLazyKey(str, homeUiState, align2, z2, str2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollGameModesForTour(HomeUiState homeUiState, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$scrollGameModesForTour$1 homeTourScrollController$scrollGameModesForTour$1;
        HomeTourScrollController$scrollGameModesForTour$1 homeTourScrollController$scrollGameModesForTour$12;
        HomeUiState homeUiState2;
        int indexOf;
        int i;
        int i2;
        int mo1623getViewportSizeYbymL2g;
        int i3;
        if (continuation instanceof HomeTourScrollController$scrollGameModesForTour$1) {
            homeTourScrollController$scrollGameModesForTour$1 = (HomeTourScrollController$scrollGameModesForTour$1) continuation;
            if ((homeTourScrollController$scrollGameModesForTour$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollGameModesForTour$1.label -= Integer.MIN_VALUE;
                homeTourScrollController$scrollGameModesForTour$12 = homeTourScrollController$scrollGameModesForTour$1;
                Object obj = homeTourScrollController$scrollGameModesForTour$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                int i4 = 0;
                switch (homeTourScrollController$scrollGameModesForTour$12.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        homeUiState2 = homeUiState;
                        homeTourScrollController$scrollGameModesForTour$12.L$0 = homeUiState2;
                        homeTourScrollController$scrollGameModesForTour$12.label = 1;
                        if (awaitListLaidOut(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollGameModesForTour$12.L$0 = null;
                        homeTourScrollController$scrollGameModesForTour$12.label = 2;
                        obj = awaitSectionKeysContaining(homeUiState2, HomeTourLazyKey.GAME_MODES, homeTourScrollController$scrollGameModesForTour$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        indexOf = ((List) obj).indexOf(HomeTourLazyKey.GAME_MODES);
                        if (indexOf < 0) {
                            return Boxing.boxBoolean(false);
                        }
                        LazyListState lazyListState = this.listState;
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = indexOf;
                        homeTourScrollController$scrollGameModesForTour$12.label = 3;
                        if (lazyListState.scrollToItem(indexOf, 0, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = indexOf;
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i;
                        homeTourScrollController$scrollGameModesForTour$12.label = 4;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i;
                        homeTourScrollController$scrollGameModesForTour$12.label = 5;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = i;
                        LazyListLayoutInfo layoutInfo = this.listState.getLayoutInfo();
                        mo1623getViewportSizeYbymL2g = (int) (layoutInfo.mo1623getViewportSizeYbymL2g() & 4294967295L);
                        if (mo1623getViewportSizeYbymL2g > 0) {
                            return Boxing.boxBoolean(false);
                        }
                        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((LazyListItemInfo) next).getIndex() == i2) {
                                    obj2 = next;
                                }
                            }
                        }
                        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj2;
                        int size = lazyListItemInfo != null ? lazyListItemInfo.getSize() : 0;
                        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing();
                        int afterContentPadding = layoutInfo.getAfterContentPadding();
                        int gameModesTitleBlockPx = HomeTourScroll.INSTANCE.gameModesTitleBlockPx(mainAxisItemSpacing);
                        int coerceAtLeast = RangesKt.coerceAtLeast(size - gameModesTitleBlockPx, 0);
                        int gameModesTourMinimalBottomClearancePx = HomeTourScroll.INSTANCE.gameModesTourMinimalBottomClearancePx(mainAxisItemSpacing, afterContentPadding);
                        if (size <= 0 || mo1623getViewportSizeYbymL2g < size) {
                            if (coerceAtLeast > 0 && mo1623getViewportSizeYbymL2g >= coerceAtLeast + gameModesTourMinimalBottomClearancePx) {
                                i4 = computeGameModesTileRowBottomOffset(size, coerceAtLeast, mo1623getViewportSizeYbymL2g, gameModesTitleBlockPx, gameModesTourMinimalBottomClearancePx);
                            } else if (size > 0) {
                                i4 = computeGameModesTileRowBottomOffset(size, RangesKt.coerceAtLeast(coerceAtLeast, size / 2), mo1623getViewportSizeYbymL2g, gameModesTitleBlockPx, gameModesTourMinimalBottomClearancePx);
                            }
                        }
                        if (i4 != 0) {
                            LazyListState lazyListState2 = this.listState;
                            homeTourScrollController$scrollGameModesForTour$12.I$0 = i2;
                            homeTourScrollController$scrollGameModesForTour$12.label = 6;
                            if (lazyListState2.scrollToItem(i2, i4, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i3 = i2;
                            homeTourScrollController$scrollGameModesForTour$12.I$0 = i3;
                            homeTourScrollController$scrollGameModesForTour$12.label = 7;
                            if (awaitItemIndexVisible(i3, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            homeTourScrollController$scrollGameModesForTour$12.I$0 = i3;
                            homeTourScrollController$scrollGameModesForTour$12.label = 8;
                            if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i3;
                        }
                        homeTourScrollController$scrollGameModesForTour$12.label = 9;
                        if (nudgeGameModesTileRowByLayout(i2, true, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollGameModesForTour$12.label = 10;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Boxing.boxBoolean(true);
                    case 1:
                        HomeUiState homeUiState3 = (HomeUiState) homeTourScrollController$scrollGameModesForTour$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        homeUiState2 = homeUiState3;
                        homeTourScrollController$scrollGameModesForTour$12.L$0 = null;
                        homeTourScrollController$scrollGameModesForTour$12.label = 2;
                        obj = awaitSectionKeysContaining(homeUiState2, HomeTourLazyKey.GAME_MODES, homeTourScrollController$scrollGameModesForTour$12);
                        if (obj == coroutine_suspended) {
                        }
                        indexOf = ((List) obj).indexOf(HomeTourLazyKey.GAME_MODES);
                        if (indexOf < 0) {
                        }
                        break;
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        indexOf = ((List) obj).indexOf(HomeTourLazyKey.GAME_MODES);
                        if (indexOf < 0) {
                        }
                        break;
                    case 3:
                        i = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i;
                        homeTourScrollController$scrollGameModesForTour$12.label = 4;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i;
                        homeTourScrollController$scrollGameModesForTour$12.label = 5;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        i2 = i;
                        LazyListLayoutInfo layoutInfo2 = this.listState.getLayoutInfo();
                        mo1623getViewportSizeYbymL2g = (int) (layoutInfo2.mo1623getViewportSizeYbymL2g() & 4294967295L);
                        if (mo1623getViewportSizeYbymL2g > 0) {
                        }
                        break;
                    case 4:
                        i = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i;
                        homeTourScrollController$scrollGameModesForTour$12.label = 5;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        i2 = i;
                        LazyListLayoutInfo layoutInfo22 = this.listState.getLayoutInfo();
                        mo1623getViewportSizeYbymL2g = (int) (layoutInfo22.mo1623getViewportSizeYbymL2g() & 4294967295L);
                        if (mo1623getViewportSizeYbymL2g > 0) {
                        }
                        break;
                    case 5:
                        i = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i;
                        LazyListLayoutInfo layoutInfo222 = this.listState.getLayoutInfo();
                        mo1623getViewportSizeYbymL2g = (int) (layoutInfo222.mo1623getViewportSizeYbymL2g() & 4294967295L);
                        if (mo1623getViewportSizeYbymL2g > 0) {
                        }
                        break;
                    case 6:
                        i3 = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 7;
                        if (awaitItemIndexVisible(i3, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 8;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        i2 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 9;
                        if (nudgeGameModesTileRowByLayout(i2, true, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollGameModesForTour$12.label = 10;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    case 7:
                        i3 = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollGameModesForTour$12.I$0 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 8;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        i2 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 9;
                        if (nudgeGameModesTileRowByLayout(i2, true, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollGameModesForTour$12.label = 10;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    case 8:
                        i3 = homeTourScrollController$scrollGameModesForTour$12.I$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        homeTourScrollController$scrollGameModesForTour$12.label = 9;
                        if (nudgeGameModesTileRowByLayout(i2, true, homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        homeTourScrollController$scrollGameModesForTour$12.label = 10;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollGameModesForTour$12.label = 10;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollGameModesForTour$12) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    case 10:
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        homeTourScrollController$scrollGameModesForTour$1 = new HomeTourScrollController$scrollGameModesForTour$1(this, continuation);
        homeTourScrollController$scrollGameModesForTour$12 = homeTourScrollController$scrollGameModesForTour$1;
        Object obj3 = homeTourScrollController$scrollGameModesForTour$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object obj22 = null;
        int i42 = 0;
        switch (homeTourScrollController$scrollGameModesForTour$12.label) {
        }
    }

    private final int computeGameModesTileRowBottomOffset(int itemHeight, int tileRowHeight, int viewportHeight, int titleBlockPx, int bottomClearancePx) {
        if (tileRowHeight <= 0 || viewportHeight <= 0) {
            return 0;
        }
        int i = -RangesKt.coerceAtLeast((viewportHeight - tileRowHeight) - bottomClearancePx, 0);
        int i2 = itemHeight > viewportHeight ? -(itemHeight - viewportHeight) : 0;
        if (itemHeight > viewportHeight && titleBlockPx > 0) {
            i2 = -RangesKt.coerceAtLeast((itemHeight - viewportHeight) - titleBlockPx, i2);
        }
        return RangesKt.coerceIn(i, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureGameModeTileFullyVisible(int i, int i2, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$ensureGameModeTileFullyVisible$1 homeTourScrollController$ensureGameModeTileFullyVisible$1;
        int i3;
        int i4;
        if (continuation instanceof HomeTourScrollController$ensureGameModeTileFullyVisible$1) {
            homeTourScrollController$ensureGameModeTileFullyVisible$1 = (HomeTourScrollController$ensureGameModeTileFullyVisible$1) continuation;
            if ((homeTourScrollController$ensureGameModeTileFullyVisible$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$ensureGameModeTileFullyVisible$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$ensureGameModeTileFullyVisible$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = homeTourScrollController$ensureGameModeTileFullyVisible$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i <= 0) {
                        return Boxing.boxBoolean(true);
                    }
                    if (i2 <= 0) {
                        HomeTourScrollDebug.INSTANCE.log("ensureGameModeTileFullyVisible: skip (viewportBottom=0 tileBottom=" + i + ")");
                        return Boxing.boxBoolean(true);
                    }
                    homeTourScrollController$ensureGameModeTileFullyVisible$1.I$0 = i;
                    homeTourScrollController$ensureGameModeTileFullyVisible$1.I$1 = i2;
                    homeTourScrollController$ensureGameModeTileFullyVisible$1.label = 1;
                    if (awaitListLaidOut(homeTourScrollController$ensureGameModeTileFullyVisible$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(true);
                        }
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$ensureGameModeTileFullyVisible$1.label = 3;
                        if (awaitPostScrollFrames(homeTourScrollController$ensureGameModeTileFullyVisible$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Boxing.boxBoolean(true);
                    }
                    i2 = homeTourScrollController$ensureGameModeTileFullyVisible$1.I$1;
                    i = homeTourScrollController$ensureGameModeTileFullyVisible$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                int gameModeTileViewportBottomPaddingPx = i2 - HomeTourScroll.INSTANCE.gameModeTileViewportBottomPaddingPx(this.listState.getLayoutInfo().getMainAxisItemSpacing());
                i4 = i - gameModeTileViewportBottomPaddingPx;
                HomeTourScrollDebug.INSTANCE.log("ensureGameModeTileFullyVisible: tileBottom=" + i + " viewportBottom=" + i2 + " maxTileBottom=" + gameModeTileViewportBottomPaddingPx + " overflow=" + i4);
                if (i4 > 1) {
                    float coerceAtMost = RangesKt.coerceAtMost(i4, 120);
                    homeTourScrollController$ensureGameModeTileFullyVisible$1.label = 2;
                    if (scrollToOffset(coerceAtMost, false, homeTourScrollController$ensureGameModeTileFullyVisible$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    homeTourScrollController$ensureGameModeTileFullyVisible$1.label = 3;
                    if (awaitPostScrollFrames(homeTourScrollController$ensureGameModeTileFullyVisible$1) == coroutine_suspended) {
                    }
                }
                return Boxing.boxBoolean(true);
            }
        }
        homeTourScrollController$ensureGameModeTileFullyVisible$1 = new HomeTourScrollController$ensureGameModeTileFullyVisible$1(this, continuation);
        Object obj2 = homeTourScrollController$ensureGameModeTileFullyVisible$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = homeTourScrollController$ensureGameModeTileFullyVisible$1.label;
        if (i3 != 0) {
        }
        int gameModeTileViewportBottomPaddingPx2 = i2 - HomeTourScroll.INSTANCE.gameModeTileViewportBottomPaddingPx(this.listState.getLayoutInfo().getMainAxisItemSpacing());
        i4 = i - gameModeTileViewportBottomPaddingPx2;
        HomeTourScrollDebug.INSTANCE.log("ensureGameModeTileFullyVisible: tileBottom=" + i + " viewportBottom=" + i2 + " maxTileBottom=" + gameModeTileViewportBottomPaddingPx2 + " overflow=" + i4);
        if (i4 > 1) {
        }
        return Boxing.boxBoolean(true);
    }

    public static /* synthetic */ Object animateScrollToLazyKey$default(HomeTourScrollController homeTourScrollController, String str, HomeUiState homeUiState, HomeTourScroll.Align align, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            align = HomeTourScroll.Align.CENTER;
        }
        return homeTourScrollController.animateScrollToLazyKey(str, homeUiState, align, continuation);
    }

    public final Object animateScrollToLazyKey(String str, HomeUiState homeUiState, HomeTourScroll.Align align, Continuation<? super Boolean> continuation) {
        return scrollToLazyKey$default(this, str, homeUiState, align, true, null, continuation, 16, null);
    }

    public static /* synthetic */ Object scrollToTop$default(HomeTourScrollController homeTourScrollController, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return homeTourScrollController.scrollToTop(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToTop(boolean z, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$scrollToTop$1 homeTourScrollController$scrollToTop$1;
        int i;
        if (continuation instanceof HomeTourScrollController$scrollToTop$1) {
            homeTourScrollController$scrollToTop$1 = (HomeTourScrollController$scrollToTop$1) continuation;
            if ((homeTourScrollController$scrollToTop$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollToTop$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$scrollToTop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$scrollToTop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    homeTourScrollController$scrollToTop$1.Z$0 = z;
                    homeTourScrollController$scrollToTop$1.label = 1;
                    if (awaitListLaidOut(homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            ResultKt.throwOnFailure(obj);
                            homeTourScrollController$scrollToTop$1.label = 4;
                            if (awaitItemIndexVisible(0, homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            homeTourScrollController$scrollToTop$1.label = 5;
                            if (awaitPostScrollFrames(homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(true);
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(true);
                        }
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToTop$1.label = 5;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    }
                    z = homeTourScrollController$scrollToTop$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (this.listState.getLayoutInfo().getTotalItemsCount() > 0) {
                    return Boxing.boxBoolean(false);
                }
                if (z) {
                    LazyListState lazyListState = this.listState;
                    homeTourScrollController$scrollToTop$1.label = 2;
                    if (lazyListState.animateScrollToItem(0, 0, homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    LazyListState lazyListState2 = this.listState;
                    homeTourScrollController$scrollToTop$1.label = 3;
                    if (lazyListState2.scrollToItem(0, 0, homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                homeTourScrollController$scrollToTop$1.label = 4;
                if (awaitItemIndexVisible(0, homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                }
                homeTourScrollController$scrollToTop$1.label = 5;
                if (awaitPostScrollFrames(homeTourScrollController$scrollToTop$1) == coroutine_suspended) {
                }
                return Boxing.boxBoolean(true);
            }
        }
        homeTourScrollController$scrollToTop$1 = new HomeTourScrollController$scrollToTop$1(this, continuation);
        Object obj2 = homeTourScrollController$scrollToTop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$scrollToTop$1.label;
        if (i != 0) {
        }
        if (this.listState.getLayoutInfo().getTotalItemsCount() > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:10:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitScrollPositionSettled(Continuation<? super Unit> continuation) {
        HomeTourScrollController$awaitScrollPositionSettled$1 homeTourScrollController$awaitScrollPositionSettled$1;
        int i;
        Ref.IntRef intRef;
        int i2;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        int i3;
        if (continuation instanceof HomeTourScrollController$awaitScrollPositionSettled$1) {
            homeTourScrollController$awaitScrollPositionSettled$1 = (HomeTourScrollController$awaitScrollPositionSettled$1) continuation;
            if ((homeTourScrollController$awaitScrollPositionSettled$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$awaitScrollPositionSettled$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$awaitScrollPositionSettled$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$awaitScrollPositionSettled$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    intRef5.element = -1;
                    intRef = new Ref.IntRef();
                    intRef.element = -1;
                    i2 = 8;
                    intRef2 = intRef4;
                    intRef3 = intRef5;
                    i3 = 0;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = homeTourScrollController$awaitScrollPositionSettled$1.I$1;
                    i2 = homeTourScrollController$awaitScrollPositionSettled$1.I$0;
                    intRef = (Ref.IntRef) homeTourScrollController$awaitScrollPositionSettled$1.L$2;
                    intRef3 = (Ref.IntRef) homeTourScrollController$awaitScrollPositionSettled$1.L$1;
                    intRef2 = (Ref.IntRef) homeTourScrollController$awaitScrollPositionSettled$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    int firstVisibleItemIndex = this.listState.getFirstVisibleItemIndex();
                    int firstVisibleItemScrollOffset = this.listState.getFirstVisibleItemScrollOffset();
                    if (firstVisibleItemIndex != intRef3.element && firstVisibleItemScrollOffset == intRef.element) {
                        intRef2.element++;
                        if (intRef2.element >= 2) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        intRef2.element = 0;
                        intRef3.element = firstVisibleItemIndex;
                        intRef.element = firstVisibleItemScrollOffset;
                    }
                    i3++;
                    if (i3 < i2) {
                        Function1 function1 = new Function1() { // from class: org.betup.ui.tour.compose.HomeTourScrollController$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit awaitScrollPositionSettled$lambda$2$lambda$1;
                                awaitScrollPositionSettled$lambda$2$lambda$1 = HomeTourScrollController.awaitScrollPositionSettled$lambda$2$lambda$1(((Long) obj2).longValue());
                                return awaitScrollPositionSettled$lambda$2$lambda$1;
                            }
                        };
                        homeTourScrollController$awaitScrollPositionSettled$1.L$0 = intRef2;
                        homeTourScrollController$awaitScrollPositionSettled$1.L$1 = intRef3;
                        homeTourScrollController$awaitScrollPositionSettled$1.L$2 = intRef;
                        homeTourScrollController$awaitScrollPositionSettled$1.I$0 = i2;
                        homeTourScrollController$awaitScrollPositionSettled$1.I$1 = i3;
                        homeTourScrollController$awaitScrollPositionSettled$1.label = 1;
                        if (MonotonicFrameClockKt.withFrameNanos(function1, homeTourScrollController$awaitScrollPositionSettled$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int firstVisibleItemIndex2 = this.listState.getFirstVisibleItemIndex();
                        int firstVisibleItemScrollOffset2 = this.listState.getFirstVisibleItemScrollOffset();
                        if (firstVisibleItemIndex2 != intRef3.element) {
                        }
                        intRef2.element = 0;
                        intRef3.element = firstVisibleItemIndex2;
                        intRef.element = firstVisibleItemScrollOffset2;
                        i3++;
                        if (i3 < i2) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        homeTourScrollController$awaitScrollPositionSettled$1 = new HomeTourScrollController$awaitScrollPositionSettled$1(this, continuation);
        Object obj2 = homeTourScrollController$awaitScrollPositionSettled$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$awaitScrollPositionSettled$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit awaitScrollPositionSettled$lambda$2$lambda$1(long j) {
        return Unit.INSTANCE;
    }

    public final boolean isGameModesTileRowAcceptablyVisible(HomeUiState uiState) {
        Object obj;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int indexOf = HomeTourBoundsKt.buildHomeLazyListKeys(uiState).indexOf(HomeTourLazyKey.GAME_MODES);
        if (indexOf < 0) {
            return false;
        }
        LazyListLayoutInfo layoutInfo = this.listState.getLayoutInfo();
        if (((int) (layoutInfo.mo1623getViewportSizeYbymL2g() & 4294967295L)) <= 0) {
            return false;
        }
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LazyListItemInfo) obj).getIndex() == indexOf) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
        if (lazyListItemInfo == null) {
            return false;
        }
        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing();
        return RangesKt.coerceAtLeast(((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) - HomeTourScroll.INSTANCE.gameModesTitleBlockPx(mainAxisItemSpacing)) - ((layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - HomeTourScroll.INSTANCE.gameModesTourMinimalBottomClearancePx(mainAxisItemSpacing, layoutInfo.getAfterContentPadding())), 0) <= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreScrollPositionIfDrifted(int i, int i2, Continuation<? super Unit> continuation) {
        HomeTourScrollController$restoreScrollPositionIfDrifted$1 homeTourScrollController$restoreScrollPositionIfDrifted$1;
        Object coroutine_suspended;
        int i3;
        if (continuation instanceof HomeTourScrollController$restoreScrollPositionIfDrifted$1) {
            homeTourScrollController$restoreScrollPositionIfDrifted$1 = (HomeTourScrollController$restoreScrollPositionIfDrifted$1) continuation;
            if ((homeTourScrollController$restoreScrollPositionIfDrifted$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$restoreScrollPositionIfDrifted$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$restoreScrollPositionIfDrifted$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = homeTourScrollController$restoreScrollPositionIfDrifted$1.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    int firstVisibleItemIndex = this.listState.getFirstVisibleItemIndex();
                    int firstVisibleItemScrollOffset = this.listState.getFirstVisibleItemScrollOffset();
                    if (firstVisibleItemIndex == i && firstVisibleItemScrollOffset == i2) {
                        return Unit.INSTANCE;
                    }
                    HomeTourScrollDebug.INSTANCE.log("restoreScroll: expected=" + i + "/" + i2 + " actual=" + firstVisibleItemIndex + "/" + firstVisibleItemScrollOffset + " deltaIndex=" + (firstVisibleItemIndex - i) + " deltaOffset=" + (firstVisibleItemScrollOffset - i2));
                    LazyListState lazyListState = this.listState;
                    homeTourScrollController$restoreScrollPositionIfDrifted$1.I$0 = i;
                    homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 1;
                    if (lazyListState.scrollToItem(i, i2, homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 3;
                        if (awaitPostScrollFrames(homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    i = homeTourScrollController$restoreScrollPositionIfDrifted$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 2;
                if (awaitItemIndexVisible(i, homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 3;
                if (awaitPostScrollFrames(homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        homeTourScrollController$restoreScrollPositionIfDrifted$1 = new HomeTourScrollController$restoreScrollPositionIfDrifted$1(this, continuation);
        Object obj2 = homeTourScrollController$restoreScrollPositionIfDrifted$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = homeTourScrollController$restoreScrollPositionIfDrifted$1.label;
        if (i3 != 0) {
        }
        homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 2;
        if (awaitItemIndexVisible(i, homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
        }
        homeTourScrollController$restoreScrollPositionIfDrifted$1.label = 3;
        if (awaitPostScrollFrames(homeTourScrollController$restoreScrollPositionIfDrifted$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object scrollToOffset$default(HomeTourScrollController homeTourScrollController, float f, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return homeTourScrollController.scrollToOffset(f, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToOffset(float f, boolean z, Continuation<? super Boolean> continuation) {
        HomeTourScrollController$scrollToOffset$1 homeTourScrollController$scrollToOffset$1;
        int i;
        if (continuation instanceof HomeTourScrollController$scrollToOffset$1) {
            homeTourScrollController$scrollToOffset$1 = (HomeTourScrollController$scrollToOffset$1) continuation;
            if ((homeTourScrollController$scrollToOffset$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollToOffset$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$scrollToOffset$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$scrollToOffset$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    homeTourScrollController$scrollToOffset$1.F$0 = f;
                    homeTourScrollController$scrollToOffset$1.Z$0 = z;
                    homeTourScrollController$scrollToOffset$1.label = 1;
                    if (awaitListLaidOut(homeTourScrollController$scrollToOffset$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            homeTourScrollController$scrollToOffset$1.label = 4;
                            if (awaitPostScrollFrames(homeTourScrollController$scrollToOffset$1) == coroutine_suspended) {
                            }
                            return Boxing.boxBoolean(true);
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(true);
                        }
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        homeTourScrollController$scrollToOffset$1.label = 4;
                        if (awaitPostScrollFrames(homeTourScrollController$scrollToOffset$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Boxing.boxBoolean(true);
                    }
                    z = homeTourScrollController$scrollToOffset$1.Z$0;
                    f = homeTourScrollController$scrollToOffset$1.F$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (f != 0.0f) {
                    return Boxing.boxBoolean(true);
                }
                if (z) {
                    LazyListState lazyListState = this.listState;
                    homeTourScrollController$scrollToOffset$1.label = 2;
                    if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, f, null, homeTourScrollController$scrollToOffset$1, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    homeTourScrollController$scrollToOffset$1.label = 4;
                    if (awaitPostScrollFrames(homeTourScrollController$scrollToOffset$1) == coroutine_suspended) {
                    }
                    return Boxing.boxBoolean(true);
                }
                LazyListState lazyListState2 = this.listState;
                HomeTourScrollController$scrollToOffset$2 homeTourScrollController$scrollToOffset$2 = new HomeTourScrollController$scrollToOffset$2(f, null);
                homeTourScrollController$scrollToOffset$1.label = 3;
                if (ScrollableState.scroll$default(lazyListState2, null, homeTourScrollController$scrollToOffset$2, homeTourScrollController$scrollToOffset$1, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Unit unit2 = Unit.INSTANCE;
                homeTourScrollController$scrollToOffset$1.label = 4;
                if (awaitPostScrollFrames(homeTourScrollController$scrollToOffset$1) == coroutine_suspended) {
                }
                return Boxing.boxBoolean(true);
            }
        }
        homeTourScrollController$scrollToOffset$1 = new HomeTourScrollController$scrollToOffset$1(this, continuation);
        Object obj2 = homeTourScrollController$scrollToOffset$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$scrollToOffset$1.label;
        if (i != 0) {
        }
        if (f != 0.0f) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToIndex(int i, HomeTourScroll.Align align, boolean z, String str, Continuation<? super Unit> continuation) {
        HomeTourScrollController$scrollToIndex$1 homeTourScrollController$scrollToIndex$1;
        int computeScrollOffsetForAlign;
        HomeTourScroll.Align align2;
        String str2;
        int computeScrollOffsetForAlign2;
        LazyListState lazyListState;
        String str3;
        HomeTourScroll.Align align3;
        int i2;
        int i3;
        int computeScrollOffsetForAlign3;
        if (continuation instanceof HomeTourScrollController$scrollToIndex$1) {
            homeTourScrollController$scrollToIndex$1 = (HomeTourScrollController$scrollToIndex$1) continuation;
            if ((homeTourScrollController$scrollToIndex$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$scrollToIndex$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$scrollToIndex$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (homeTourScrollController$scrollToIndex$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        computeScrollOffsetForAlign = computeScrollOffsetForAlign(i, align, str);
                        if (z) {
                            LazyListState lazyListState2 = this.listState;
                            homeTourScrollController$scrollToIndex$1.label = 1;
                            if (lazyListState2.animateScrollToItem(i, computeScrollOffsetForAlign, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        int i4 = WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
                        if (i4 == 1) {
                            LazyListState lazyListState3 = this.listState;
                            homeTourScrollController$scrollToIndex$1.L$0 = align;
                            homeTourScrollController$scrollToIndex$1.L$1 = str;
                            homeTourScrollController$scrollToIndex$1.I$0 = i;
                            homeTourScrollController$scrollToIndex$1.label = 2;
                            if (lazyListState3.scrollToItem(i, 0, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            homeTourScrollController$scrollToIndex$1.L$0 = align;
                            homeTourScrollController$scrollToIndex$1.L$1 = str;
                            homeTourScrollController$scrollToIndex$1.I$0 = i;
                            homeTourScrollController$scrollToIndex$1.label = 3;
                            if (awaitItemIndexVisible(i, homeTourScrollController$scrollToIndex$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            align2 = align;
                            str2 = str;
                            computeScrollOffsetForAlign2 = computeScrollOffsetForAlign(i, align2, str2);
                            lazyListState = this.listState;
                            homeTourScrollController$scrollToIndex$1.L$0 = null;
                            homeTourScrollController$scrollToIndex$1.L$1 = null;
                            homeTourScrollController$scrollToIndex$1.label = 4;
                            if (lazyListState.scrollToItem(i, computeScrollOffsetForAlign2, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i4 != 2) {
                            LazyListState lazyListState4 = this.listState;
                            homeTourScrollController$scrollToIndex$1.label = 8;
                            if (lazyListState4.scrollToItem(i, computeScrollOffsetForAlign, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        LazyListState lazyListState5 = this.listState;
                        homeTourScrollController$scrollToIndex$1.L$0 = align;
                        homeTourScrollController$scrollToIndex$1.L$1 = str;
                        homeTourScrollController$scrollToIndex$1.I$0 = i;
                        homeTourScrollController$scrollToIndex$1.I$1 = computeScrollOffsetForAlign;
                        homeTourScrollController$scrollToIndex$1.label = 5;
                        if (lazyListState5.scrollToItem(i, computeScrollOffsetForAlign, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$scrollToIndex$1.L$0 = align;
                        homeTourScrollController$scrollToIndex$1.L$1 = str;
                        homeTourScrollController$scrollToIndex$1.I$0 = i;
                        homeTourScrollController$scrollToIndex$1.I$1 = computeScrollOffsetForAlign;
                        homeTourScrollController$scrollToIndex$1.label = 6;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollToIndex$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str;
                        align3 = align;
                        i2 = i;
                        i3 = computeScrollOffsetForAlign;
                        computeScrollOffsetForAlign3 = computeScrollOffsetForAlign(i2, align3, str3);
                        if (computeScrollOffsetForAlign3 != i3) {
                            return Unit.INSTANCE;
                        }
                        LazyListState lazyListState6 = this.listState;
                        homeTourScrollController$scrollToIndex$1.L$0 = null;
                        homeTourScrollController$scrollToIndex$1.L$1 = null;
                        homeTourScrollController$scrollToIndex$1.label = 7;
                        if (lazyListState6.scrollToItem(i2, computeScrollOffsetForAlign3, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 2:
                        i = homeTourScrollController$scrollToIndex$1.I$0;
                        str = (String) homeTourScrollController$scrollToIndex$1.L$1;
                        align = (HomeTourScroll.Align) homeTourScrollController$scrollToIndex$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        homeTourScrollController$scrollToIndex$1.L$0 = align;
                        homeTourScrollController$scrollToIndex$1.L$1 = str;
                        homeTourScrollController$scrollToIndex$1.I$0 = i;
                        homeTourScrollController$scrollToIndex$1.label = 3;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollToIndex$1) != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        i = homeTourScrollController$scrollToIndex$1.I$0;
                        str2 = (String) homeTourScrollController$scrollToIndex$1.L$1;
                        align2 = (HomeTourScroll.Align) homeTourScrollController$scrollToIndex$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        computeScrollOffsetForAlign2 = computeScrollOffsetForAlign(i, align2, str2);
                        lazyListState = this.listState;
                        homeTourScrollController$scrollToIndex$1.L$0 = null;
                        homeTourScrollController$scrollToIndex$1.L$1 = null;
                        homeTourScrollController$scrollToIndex$1.label = 4;
                        if (lazyListState.scrollToItem(i, computeScrollOffsetForAlign2, homeTourScrollController$scrollToIndex$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        int i5 = homeTourScrollController$scrollToIndex$1.I$1;
                        int i6 = homeTourScrollController$scrollToIndex$1.I$0;
                        str = (String) homeTourScrollController$scrollToIndex$1.L$1;
                        HomeTourScroll.Align align4 = (HomeTourScroll.Align) homeTourScrollController$scrollToIndex$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        computeScrollOffsetForAlign = i5;
                        i = i6;
                        align = align4;
                        homeTourScrollController$scrollToIndex$1.L$0 = align;
                        homeTourScrollController$scrollToIndex$1.L$1 = str;
                        homeTourScrollController$scrollToIndex$1.I$0 = i;
                        homeTourScrollController$scrollToIndex$1.I$1 = computeScrollOffsetForAlign;
                        homeTourScrollController$scrollToIndex$1.label = 6;
                        if (awaitItemIndexVisible(i, homeTourScrollController$scrollToIndex$1) != coroutine_suspended) {
                        }
                        break;
                    case 6:
                        i3 = homeTourScrollController$scrollToIndex$1.I$1;
                        i2 = homeTourScrollController$scrollToIndex$1.I$0;
                        str3 = (String) homeTourScrollController$scrollToIndex$1.L$1;
                        align3 = (HomeTourScroll.Align) homeTourScrollController$scrollToIndex$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        computeScrollOffsetForAlign3 = computeScrollOffsetForAlign(i2, align3, str3);
                        if (computeScrollOffsetForAlign3 != i3) {
                        }
                        break;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        homeTourScrollController$scrollToIndex$1 = new HomeTourScrollController$scrollToIndex$1(this, continuation);
        Object obj2 = homeTourScrollController$scrollToIndex$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (homeTourScrollController$scrollToIndex$1.label) {
        }
    }

    static /* synthetic */ Object scrollToIndex$default(HomeTourScrollController homeTourScrollController, int i, HomeTourScroll.Align align, boolean z, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        return homeTourScrollController.scrollToIndex(i, align, z, str, continuation);
    }

    static /* synthetic */ int computeScrollOffsetForAlign$default(HomeTourScrollController homeTourScrollController, int i, HomeTourScroll.Align align, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        return homeTourScrollController.computeScrollOffsetForAlign(i, align, str);
    }

    private final int computeScrollOffsetForAlign(int index, HomeTourScroll.Align align, String lazyKey) {
        Object obj;
        int coerceAtLeast;
        LazyListLayoutInfo layoutInfo = this.listState.getLayoutInfo();
        int mo1623getViewportSizeYbymL2g = (int) (layoutInfo.mo1623getViewportSizeYbymL2g() & 4294967295L);
        if (mo1623getViewportSizeYbymL2g <= 0) {
            return 0;
        }
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LazyListItemInfo) obj).getIndex() == index) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
        int size = lazyListItemInfo != null ? lazyListItemInfo.getSize() : 0;
        int i = WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
        if (i == 1) {
            int i2 = mo1623getViewportSizeYbymL2g / 8;
            if (size > 0 && mo1623getViewportSizeYbymL2g > size) {
                coerceAtLeast = RangesKt.coerceAtLeast((mo1623getViewportSizeYbymL2g - size) / 2, i2);
            } else {
                return -(mo1623getViewportSizeYbymL2g / 4);
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new NoWhenBranchMatchedException();
            }
            int computeBottomAlignInsetPx = computeBottomAlignInsetPx(layoutInfo, lazyKey, index);
            int coerceAtLeast2 = (!Intrinsics.areEqual(lazyKey, HomeTourLazyKey.GAME_MODES) || size <= 0) ? size : RangesKt.coerceAtLeast(size - HomeTourScroll.INSTANCE.gameModesTitleBlockPx(layoutInfo.getMainAxisItemSpacing()), size / 2);
            if (coerceAtLeast2 > 0 && mo1623getViewportSizeYbymL2g > coerceAtLeast2) {
                coerceAtLeast = RangesKt.coerceAtLeast((mo1623getViewportSizeYbymL2g - coerceAtLeast2) - computeBottomAlignInsetPx, 0);
            } else if (size > 0 && mo1623getViewportSizeYbymL2g > size) {
                coerceAtLeast = RangesKt.coerceAtLeast((mo1623getViewportSizeYbymL2g - size) - computeBottomAlignInsetPx, 0);
            } else {
                coerceAtLeast = RangesKt.coerceAtLeast(mo1623getViewportSizeYbymL2g - computeBottomAlignInsetPx, 0);
            }
        }
        return -coerceAtLeast;
    }

    static /* synthetic */ int computeBottomAlignInsetPx$default(HomeTourScrollController homeTourScrollController, LazyListLayoutInfo lazyListLayoutInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return homeTourScrollController.computeBottomAlignInsetPx(lazyListLayoutInfo, str, i);
    }

    private final int computeBottomAlignInsetPx(LazyListLayoutInfo layoutInfo, String lazyKey, int itemIndex) {
        Object obj;
        int fallbackBottomSpacerPx;
        int bottomAlignExtraInsetPx;
        int mo1623getViewportSizeYbymL2g = (int) (layoutInfo.mo1623getViewportSizeYbymL2g() & 4294967295L);
        int viewportEdgePaddingPx = HomeTourScroll.INSTANCE.viewportEdgePaddingPx(mo1623getViewportSizeYbymL2g);
        int afterContentPadding = layoutInfo.getAfterContentPadding();
        if (!CollectionsKt.contains(HomeTourScroll.INSTANCE.getBOTTOM_HEAVY_LAZY_KEYS(), lazyKey)) {
            return viewportEdgePaddingPx + afterContentPadding;
        }
        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing();
        Object obj2 = null;
        if (Intrinsics.areEqual(lazyKey, HomeTourLazyKey.GAME_MODES)) {
            bottomAlignExtraInsetPx = HomeTourScroll.INSTANCE.gameModeTileViewportBottomPaddingPx(mainAxisItemSpacing);
        } else {
            Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((LazyListItemInfo) obj).getKey(), HomeTourLazyKey.BOTTOM_SPACER)) {
                    break;
                }
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            if (lazyListItemInfo != null) {
                fallbackBottomSpacerPx = lazyListItemInfo.getSize();
            } else {
                fallbackBottomSpacerPx = fallbackBottomSpacerPx(mainAxisItemSpacing);
            }
            bottomAlignExtraInsetPx = HomeTourScroll.INSTANCE.bottomAlignExtraInsetPx(mainAxisItemSpacing, lazyKey) + mainAxisItemSpacing + fallbackBottomSpacerPx;
        }
        int i = afterContentPadding + viewportEdgePaddingPx + bottomAlignExtraInsetPx;
        Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((LazyListItemInfo) next).getIndex() == itemIndex) {
                obj2 = next;
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) obj2;
        int size = lazyListItemInfo2 != null ? lazyListItemInfo2.getSize() : 0;
        if (size <= 0 || mo1623getViewportSizeYbymL2g <= size) {
            return i;
        }
        return RangesKt.coerceAtMost(i, RangesKt.coerceAtLeast((mo1623getViewportSizeYbymL2g - size) - RangesKt.coerceAtLeast(mainAxisItemSpacing * 4, 48), viewportEdgePaddingPx));
    }

    private final int fallbackBottomSpacerPx(int mainAxisItemSpacingPx) {
        return (mainAxisItemSpacingPx * 3) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[EDGE_INSN: B:38:0x00f0->B:26:0x00f0 BREAK  A[LOOP:0: B:20:0x00dc->B:37:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object correctScrollIfBottomClipped(int i, String str, Continuation<? super Unit> continuation) {
        HomeTourScrollController$correctScrollIfBottomClipped$1 homeTourScrollController$correctScrollIfBottomClipped$1;
        int i2;
        Object obj;
        int computeBottomAlignInsetPx;
        int i3;
        int i4;
        Iterator<T> it;
        LazyListItemInfo lazyListItemInfo;
        if (continuation instanceof HomeTourScrollController$correctScrollIfBottomClipped$1) {
            homeTourScrollController$correctScrollIfBottomClipped$1 = (HomeTourScrollController$correctScrollIfBottomClipped$1) continuation;
            if ((homeTourScrollController$correctScrollIfBottomClipped$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$correctScrollIfBottomClipped$1.label -= Integer.MIN_VALUE;
                Object obj2 = homeTourScrollController$correctScrollIfBottomClipped$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = homeTourScrollController$correctScrollIfBottomClipped$1.label;
                Object obj3 = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (Intrinsics.areEqual(str, HomeTourLazyKey.GAME_MODES)) {
                        homeTourScrollController$correctScrollIfBottomClipped$1.label = 1;
                        if (nudgeGameModesTileRowByLayout(i, true, homeTourScrollController$correctScrollIfBottomClipped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    LazyListLayoutInfo layoutInfo = this.listState.getLayoutInfo();
                    Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((LazyListItemInfo) obj).getIndex() == i) {
                            break;
                        }
                    }
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) obj;
                    if (lazyListItemInfo2 == null) {
                        return Unit.INSTANCE;
                    }
                    computeBottomAlignInsetPx = computeBottomAlignInsetPx(layoutInfo, str, i);
                    int offset = (lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize()) - (layoutInfo.getViewportEndOffset() - computeBottomAlignInsetPx);
                    if (offset > 0) {
                        homeTourScrollController$correctScrollIfBottomClipped$1.I$0 = i;
                        homeTourScrollController$correctScrollIfBottomClipped$1.I$1 = computeBottomAlignInsetPx;
                        homeTourScrollController$correctScrollIfBottomClipped$1.label = 2;
                        if (scrollToOffset(offset, false, homeTourScrollController$correctScrollIfBottomClipped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        homeTourScrollController$correctScrollIfBottomClipped$1.I$0 = i;
                        homeTourScrollController$correctScrollIfBottomClipped$1.I$1 = computeBottomAlignInsetPx;
                        homeTourScrollController$correctScrollIfBottomClipped$1.label = 3;
                        if (awaitPostScrollFrames(homeTourScrollController$correctScrollIfBottomClipped$1) != coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                if (i2 == 2) {
                    int i5 = homeTourScrollController$correctScrollIfBottomClipped$1.I$1;
                    int i6 = homeTourScrollController$correctScrollIfBottomClipped$1.I$0;
                    ResultKt.throwOnFailure(obj2);
                    computeBottomAlignInsetPx = i5;
                    i = i6;
                    homeTourScrollController$correctScrollIfBottomClipped$1.I$0 = i;
                    homeTourScrollController$correctScrollIfBottomClipped$1.I$1 = computeBottomAlignInsetPx;
                    homeTourScrollController$correctScrollIfBottomClipped$1.label = 3;
                    if (awaitPostScrollFrames(homeTourScrollController$correctScrollIfBottomClipped$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int i7 = computeBottomAlignInsetPx;
                    i3 = i;
                    i4 = i7;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    i4 = homeTourScrollController$correctScrollIfBottomClipped$1.I$1;
                    i3 = homeTourScrollController$correctScrollIfBottomClipped$1.I$0;
                    ResultKt.throwOnFailure(obj2);
                }
                it = this.listState.getLayoutInfo().getVisibleItemsInfo().iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((LazyListItemInfo) next).getIndex() == i3) {
                        obj3 = next;
                        break;
                    }
                }
                lazyListItemInfo = (LazyListItemInfo) obj3;
                if (lazyListItemInfo != null) {
                    return Unit.INSTANCE;
                }
                int offset2 = (lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) - (this.listState.getLayoutInfo().getViewportEndOffset() - i4);
                if (offset2 > 0) {
                    homeTourScrollController$correctScrollIfBottomClipped$1.label = 4;
                    if (scrollToOffset(offset2, false, homeTourScrollController$correctScrollIfBottomClipped$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        homeTourScrollController$correctScrollIfBottomClipped$1 = new HomeTourScrollController$correctScrollIfBottomClipped$1(this, continuation);
        Object obj22 = homeTourScrollController$correctScrollIfBottomClipped$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = homeTourScrollController$correctScrollIfBottomClipped$1.label;
        Object obj32 = null;
        if (i2 != 0) {
        }
        it = this.listState.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        lazyListItemInfo = (LazyListItemInfo) obj32;
        if (lazyListItemInfo != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01b4 -> B:11:0x01b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nudgeGameModesTileRowByLayout(int i, boolean z, Continuation<? super Unit> continuation) {
        HomeTourScrollController$nudgeGameModesTileRowByLayout$1 homeTourScrollController$nudgeGameModesTileRowByLayout$1;
        int i2;
        int i3;
        HomeTourScrollController$nudgeGameModesTileRowByLayout$1 homeTourScrollController$nudgeGameModesTileRowByLayout$12;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        Object obj;
        int i8;
        char c;
        Object obj2;
        int gameModeTileViewportBottomPaddingPx;
        HomeTourScrollController homeTourScrollController = this;
        if (continuation instanceof HomeTourScrollController$nudgeGameModesTileRowByLayout$1) {
            homeTourScrollController$nudgeGameModesTileRowByLayout$1 = (HomeTourScrollController$nudgeGameModesTileRowByLayout$1) continuation;
            if ((homeTourScrollController$nudgeGameModesTileRowByLayout$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$nudgeGameModesTileRowByLayout$1.label -= Integer.MIN_VALUE;
                Object obj3 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    i3 = 4;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$12 = homeTourScrollController$nudgeGameModesTileRowByLayout$1;
                    i4 = 0;
                    i5 = i;
                    z2 = z;
                    if (i4 < i3) {
                    }
                } else if (i2 == 1) {
                    i8 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$2;
                    i7 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$1;
                    z3 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.Z$0;
                    i6 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$0;
                    ResultKt.throwOnFailure(obj3);
                    obj = coroutine_suspended;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$0 = i6;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$1.Z$0 = z3;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$1 = i7;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$2 = i8;
                    c = 2;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$1.label = 2;
                    if (homeTourScrollController.awaitPostScrollFrames(homeTourScrollController$nudgeGameModesTileRowByLayout$1) != obj) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$2;
                    i7 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$1;
                    boolean z4 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.Z$0;
                    i6 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$0;
                    ResultKt.throwOnFailure(obj3);
                    obj = coroutine_suspended;
                    c = 2;
                    HomeTourScrollController$nudgeGameModesTileRowByLayout$1 homeTourScrollController$nudgeGameModesTileRowByLayout$13 = homeTourScrollController$nudgeGameModesTileRowByLayout$1;
                    z2 = z4;
                    i4 = i8 + 1;
                    i3 = i7;
                    i5 = i6;
                    homeTourScrollController$nudgeGameModesTileRowByLayout$12 = homeTourScrollController$nudgeGameModesTileRowByLayout$13;
                    coroutine_suspended = obj;
                    if (i4 < i3) {
                        LazyListLayoutInfo layoutInfo = homeTourScrollController.listState.getLayoutInfo();
                        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((LazyListItemInfo) obj2).getIndex() == i5) {
                                break;
                            }
                        }
                        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj2;
                        if (lazyListItemInfo == null) {
                            HomeTourScrollDebug.INSTANCE.log("nudgeGameModes: attempt=" + i4 + " game_modes index=" + i5 + " not in visibleItemsInfo");
                            return Unit.INSTANCE;
                        }
                        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing();
                        int gameModesTitleBlockPx = HomeTourScroll.INSTANCE.gameModesTitleBlockPx(mainAxisItemSpacing);
                        int offset = (lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) - gameModesTitleBlockPx;
                        int viewportEndOffset = layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding();
                        if (z2) {
                            gameModeTileViewportBottomPaddingPx = HomeTourScroll.INSTANCE.gameModesTourMinimalBottomClearancePx(mainAxisItemSpacing, layoutInfo.getAfterContentPadding());
                        } else {
                            gameModeTileViewportBottomPaddingPx = HomeTourScroll.INSTANCE.gameModeTileViewportBottomPaddingPx(mainAxisItemSpacing);
                        }
                        int i9 = viewportEndOffset - gameModeTileViewportBottomPaddingPx;
                        Object obj4 = coroutine_suspended;
                        int coerceAtLeast = RangesKt.coerceAtLeast(offset - i9, 0);
                        int coerceAtMost = RangesKt.coerceAtMost(coerceAtLeast, 120);
                        int i10 = i3;
                        boolean z5 = z2;
                        HomeTourScrollDebug.INSTANCE.log("nudgeGameModes: attempt=" + i4 + " itemOffset=" + lazyListItemInfo.getOffset() + " itemSize=" + lazyListItemInfo.getSize() + " titleBlock=" + gameModesTitleBlockPx + " tileRowBottom=" + offset + " viewportEnd=" + viewportEndOffset + " afterContentPadding=" + layoutInfo.getAfterContentPadding() + " clearance=" + gameModeTileViewportBottomPaddingPx + " maxTileRowBottom=" + i9 + " overflow=" + coerceAtLeast + " scrollDelta=" + coerceAtMost);
                        if (coerceAtMost <= 1) {
                            return Unit.INSTANCE;
                        }
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12.I$0 = i5;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12.Z$0 = z5;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12.I$1 = i10;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12.I$2 = i4;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12.label = 1;
                        homeTourScrollController = this;
                        obj = obj4;
                        if (homeTourScrollController.scrollToOffset(coerceAtMost, false, homeTourScrollController$nudgeGameModesTileRowByLayout$12) == obj) {
                            return obj;
                        }
                        i6 = i5;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1 = homeTourScrollController$nudgeGameModesTileRowByLayout$12;
                        i7 = i10;
                        i8 = i4;
                        z3 = z5;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$0 = i6;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1.Z$0 = z3;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$1 = i7;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1.I$2 = i8;
                        c = 2;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$1.label = 2;
                        if (homeTourScrollController.awaitPostScrollFrames(homeTourScrollController$nudgeGameModesTileRowByLayout$1) != obj) {
                            return obj;
                        }
                        homeTourScrollController$nudgeGameModesTileRowByLayout$13 = homeTourScrollController$nudgeGameModesTileRowByLayout$1;
                        z2 = z3;
                        i4 = i8 + 1;
                        i3 = i7;
                        i5 = i6;
                        homeTourScrollController$nudgeGameModesTileRowByLayout$12 = homeTourScrollController$nudgeGameModesTileRowByLayout$13;
                        coroutine_suspended = obj;
                        if (i4 < i3) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        homeTourScrollController$nudgeGameModesTileRowByLayout$1 = new HomeTourScrollController$nudgeGameModesTileRowByLayout$1(homeTourScrollController, continuation);
        Object obj32 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = homeTourScrollController$nudgeGameModesTileRowByLayout$1.label;
        if (i2 != 0) {
        }
    }

    static /* synthetic */ Object nudgeGameModesTileRowByLayout$default(HomeTourScrollController homeTourScrollController, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return homeTourScrollController.nudgeGameModesTileRowByLayout(i, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitListLaidOut(Continuation<? super Unit> continuation) {
        Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(HomeTourScroll.LIST_LAYOUT_TIMEOUT_MS, new HomeTourScrollController$awaitListLaidOut$2(this, null), continuation);
        return withTimeoutOrNull == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withTimeoutOrNull : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitSectionKeysContaining(HomeUiState homeUiState, String str, Continuation<? super List<String>> continuation) {
        HomeTourScrollController$awaitSectionKeysContaining$1 homeTourScrollController$awaitSectionKeysContaining$1;
        int i;
        if (continuation instanceof HomeTourScrollController$awaitSectionKeysContaining$1) {
            homeTourScrollController$awaitSectionKeysContaining$1 = (HomeTourScrollController$awaitSectionKeysContaining$1) continuation;
            if ((homeTourScrollController$awaitSectionKeysContaining$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$awaitSectionKeysContaining$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$awaitSectionKeysContaining$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$awaitSectionKeysContaining$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HomeTourScrollController$awaitSectionKeysContaining$2 homeTourScrollController$awaitSectionKeysContaining$2 = new HomeTourScrollController$awaitSectionKeysContaining$2(homeUiState, str, null);
                    homeTourScrollController$awaitSectionKeysContaining$1.L$0 = homeUiState;
                    homeTourScrollController$awaitSectionKeysContaining$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(HomeTourScroll.LIST_LAYOUT_TIMEOUT_MS, homeTourScrollController$awaitSectionKeysContaining$2, homeTourScrollController$awaitSectionKeysContaining$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    homeUiState = (HomeUiState) homeTourScrollController$awaitSectionKeysContaining$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return list != null ? HomeTourBoundsKt.buildHomeLazyListKeys(homeUiState) : list;
            }
        }
        homeTourScrollController$awaitSectionKeysContaining$1 = new HomeTourScrollController$awaitSectionKeysContaining$1(this, continuation);
        Object obj2 = homeTourScrollController$awaitSectionKeysContaining$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$awaitSectionKeysContaining$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (list2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitItemIndexVisible(int i, Continuation<? super Unit> continuation) {
        Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(900L, new HomeTourScrollController$awaitItemIndexVisible$2(this, i, null), continuation);
        return withTimeoutOrNull == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withTimeoutOrNull : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:10:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitPostScrollFrames(Continuation<? super Unit> continuation) {
        HomeTourScrollController$awaitPostScrollFrames$1 homeTourScrollController$awaitPostScrollFrames$1;
        int i;
        int i2;
        int i3;
        if (continuation instanceof HomeTourScrollController$awaitPostScrollFrames$1) {
            homeTourScrollController$awaitPostScrollFrames$1 = (HomeTourScrollController$awaitPostScrollFrames$1) continuation;
            if ((homeTourScrollController$awaitPostScrollFrames$1.label & Integer.MIN_VALUE) != 0) {
                homeTourScrollController$awaitPostScrollFrames$1.label -= Integer.MIN_VALUE;
                Object obj = homeTourScrollController$awaitPostScrollFrames$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeTourScrollController$awaitPostScrollFrames$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    i3 = 2;
                    if (i2 < i3) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = homeTourScrollController$awaitPostScrollFrames$1.I$1;
                    i3 = homeTourScrollController$awaitPostScrollFrames$1.I$0;
                    ResultKt.throwOnFailure(obj);
                    i2++;
                    if (i2 < i3) {
                        Function1 function1 = new Function1() { // from class: org.betup.ui.tour.compose.HomeTourScrollController$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit awaitPostScrollFrames$lambda$12$lambda$11;
                                awaitPostScrollFrames$lambda$12$lambda$11 = HomeTourScrollController.awaitPostScrollFrames$lambda$12$lambda$11(((Long) obj2).longValue());
                                return awaitPostScrollFrames$lambda$12$lambda$11;
                            }
                        };
                        homeTourScrollController$awaitPostScrollFrames$1.I$0 = i3;
                        homeTourScrollController$awaitPostScrollFrames$1.I$1 = i2;
                        homeTourScrollController$awaitPostScrollFrames$1.label = 1;
                        if (MonotonicFrameClockKt.withFrameNanos(function1, homeTourScrollController$awaitPostScrollFrames$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < i3) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        homeTourScrollController$awaitPostScrollFrames$1 = new HomeTourScrollController$awaitPostScrollFrames$1(this, continuation);
        Object obj2 = homeTourScrollController$awaitPostScrollFrames$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeTourScrollController$awaitPostScrollFrames$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit awaitPostScrollFrames$lambda$12$lambda$11(long j) {
        return Unit.INSTANCE;
    }
}
