package org.betup.ui.fragment.home.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.Y3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.ComposeLayoutIdleKt;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMoreMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestUiState;

/* compiled from: HomeTourBounds.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a,\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003H\u0002\u001a\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¨\u0006\u0017"}, d2 = {"reportHomeTourBottomScreenPx", "Landroidx/compose/ui/Modifier;", "onBottomReported", "Lkotlin/Function1;", "", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "reportHomeTourBounds", "onBoundsReported", "Landroid/graphics/Rect;", "reportScreenBounds", "hostView", "Landroid/view/View;", Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "buildHomeLazyListKeys", "", "", "uiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "resolveHomeTourScrollKey", "requestedKey", "listKeys", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeTourBoundsKt {
    public static final Modifier reportHomeTourBottomScreenPx(Modifier modifier, final Function1<? super Integer, Unit> function1, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(-623539966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-623539966, i, -1, "org.betup.ui.fragment.home.compose.reportHomeTourBottomScreenPx (HomeTourBounds.kt:14)");
        }
        if (function1 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier;
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) consume;
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32) | composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeTourBoundsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit reportHomeTourBottomScreenPx$lambda$2$lambda$1;
                    reportHomeTourBottomScreenPx$lambda$2$lambda$1 = HomeTourBoundsKt.reportHomeTourBottomScreenPx$lambda$2$lambda$1(view, function1, (LayoutCoordinates) obj);
                    return reportHomeTourBottomScreenPx$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return onGloballyPositioned;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportHomeTourBottomScreenPx$lambda$2$lambda$1(View view, final Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (!coordinates.isAttached()) {
            return Unit.INSTANCE;
        }
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(coordinates);
        view.getLocationOnScreen(new int[2]);
        view.getLocationInWindow(new int[2]);
        final int bottom = (int) (boundsInWindow.getBottom() + (r1[1] - r0[1]));
        ComposeLayoutIdleKt.postWhenComposeLayoutIdle(view, new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeTourBoundsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reportHomeTourBottomScreenPx$lambda$2$lambda$1$lambda$0;
                reportHomeTourBottomScreenPx$lambda$2$lambda$1$lambda$0 = HomeTourBoundsKt.reportHomeTourBottomScreenPx$lambda$2$lambda$1$lambda$0(Function1.this, bottom);
                return reportHomeTourBottomScreenPx$lambda$2$lambda$1$lambda$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportHomeTourBottomScreenPx$lambda$2$lambda$1$lambda$0(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public static final Modifier reportHomeTourBounds(Modifier modifier, final Function1<? super android.graphics.Rect, Unit> function1, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(-780789780);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-780789780, i, -1, "org.betup.ui.fragment.home.compose.reportHomeTourBounds (HomeTourBounds.kt:30)");
        }
        if (function1 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier;
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) consume;
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32) | composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeTourBoundsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit reportHomeTourBounds$lambda$4$lambda$3;
                    reportHomeTourBounds$lambda$4$lambda$3 = HomeTourBoundsKt.reportHomeTourBounds$lambda$4$lambda$3(view, function1, (LayoutCoordinates) obj);
                    return reportHomeTourBounds$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return onGloballyPositioned;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportHomeTourBounds$lambda$4$lambda$3(View view, Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (!coordinates.isAttached()) {
            return Unit.INSTANCE;
        }
        reportScreenBounds(view, coordinates, function1);
        return Unit.INSTANCE;
    }

    private static final void reportScreenBounds(View view, LayoutCoordinates layoutCoordinates, final Function1<? super android.graphics.Rect, Unit> function1) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        float f = iArr[0] - iArr2[0];
        float f2 = iArr[1] - iArr2[1];
        final android.graphics.Rect rect = new android.graphics.Rect((int) (boundsInWindow.getLeft() + f), (int) (boundsInWindow.getTop() + f2), (int) (boundsInWindow.getRight() + f), (int) (boundsInWindow.getBottom() + f2));
        ComposeLayoutIdleKt.postWhenComposeLayoutIdle(view, new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeTourBoundsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit reportScreenBounds$lambda$5;
                reportScreenBounds$lambda$5 = HomeTourBoundsKt.reportScreenBounds$lambda$5(Function1.this, rect);
                return reportScreenBounds$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportScreenBounds$lambda$5(Function1 function1, android.graphics.Rect rect) {
        function1.invoke(rect);
        return Unit.INSTANCE;
    }

    public static final List<String> buildHomeLazyListKeys(HomeUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        List createListBuilder = CollectionsKt.createListBuilder();
        if ((uiState.getStats() instanceof HomeStatsUiState.Loading) || (uiState.getStats() instanceof HomeStatsUiState.Visible)) {
            createListBuilder.add("stats");
        }
        createListBuilder.add("promo");
        if ((uiState.getDailyQuests() instanceof HomeDailyQuestUiState.Loading) || !(uiState.getDailyQuests() instanceof HomeDailyQuestUiState.Hidden)) {
            createListBuilder.add(HomeTourLazyKey.DAILY_QUESTS);
        }
        createListBuilder.add(HomeTourLazyKey.QUICK_PLAY);
        if ((uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) || (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Visible)) {
            createListBuilder.add(HomeTourLazyKey.LIVE_ARENA);
        }
        if ((uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) || (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Visible)) {
            createListBuilder.add(HomeTourLazyKey.MORE_MATCHES);
        }
        createListBuilder.add(HomeTourLazyKey.GAME_MODES);
        createListBuilder.add(HomeTourLazyKey.BOTTOM_SPACER);
        return CollectionsKt.build(createListBuilder);
    }

    public static final String resolveHomeTourScrollKey(String requestedKey, HomeUiState uiState) {
        Intrinsics.checkNotNullParameter(requestedKey, "requestedKey");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        String str = HomeTourLazyKey.LIVE_ARENA;
        if (!Intrinsics.areEqual(requestedKey, HomeTourLazyKey.LIVE_ARENA)) {
            return requestedKey;
        }
        List<String> buildHomeLazyListKeys = buildHomeLazyListKeys(uiState);
        if (!buildHomeLazyListKeys.contains(HomeTourLazyKey.LIVE_ARENA)) {
            str = HomeTourLazyKey.MORE_MATCHES;
            if (!buildHomeLazyListKeys.contains(HomeTourLazyKey.MORE_MATCHES)) {
                return requestedKey;
            }
        }
        return str;
    }

    public static final String resolveHomeTourScrollKey(String requestedKey, List<String> listKeys) {
        Intrinsics.checkNotNullParameter(requestedKey, "requestedKey");
        Intrinsics.checkNotNullParameter(listKeys, "listKeys");
        String str = HomeTourLazyKey.LIVE_ARENA;
        if (!Intrinsics.areEqual(requestedKey, HomeTourLazyKey.LIVE_ARENA)) {
            return requestedKey;
        }
        if (!listKeys.contains(HomeTourLazyKey.LIVE_ARENA)) {
            str = HomeTourLazyKey.MORE_MATCHES;
            if (!listKeys.contains(HomeTourLazyKey.MORE_MATCHES)) {
                return requestedKey;
            }
        }
        return str;
    }
}
