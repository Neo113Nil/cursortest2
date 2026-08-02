package org.betup.ui.tour.compose;

import android.graphics.Rect;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.services.user.UserService;
import org.betup.ui.tour.controller.TourFavoriteSportsController;

/* compiled from: TourComposeHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"TourComposeView", "", "tourComposeHelper", "Lorg/betup/ui/tour/compose/TourComposeHelper;", "onTourComplete", "Lkotlin/Function0;", "(Lorg/betup/ui/tour/compose/TourComposeHelper;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TourComposeViewForJava", "Lkotlin/jvm/functions/Function0;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourComposeHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$27(TourComposeHelper tourComposeHelper, Function0 function0, int i, Composer composer, int i2) {
        TourComposeView(tourComposeHelper, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeViewForJava$lambda$30(TourComposeHelper tourComposeHelper, Function0 function0, int i, Composer composer, int i2) {
        TourComposeViewForJava(tourComposeHelper, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TourComposeView(final TourComposeHelper tourComposeHelper, final Function0<Unit> onTourComplete, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(tourComposeHelper, "tourComposeHelper");
        Intrinsics.checkNotNullParameter(onTourComplete, "onTourComplete");
        Composer startRestartGroup = composer.startRestartGroup(371308155);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(tourComposeHelper) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onTourComplete) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(371308155, i2, -1, "org.betup.ui.tour.compose.TourComposeView (TourComposeHelper.kt:253)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = tourComposeHelper.getTourState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final TourState tourState = (TourState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = tourComposeHelper.getTourManager();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            TourManager tourManager = (TourManager) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            tourManager.setGetSportsButtonBounds(tourComposeHelper.getSportsButtonBounds);
            tourManager.setGetSportItemBounds(tourComposeHelper.getSportItemBounds);
            tourManager.setGetLeagueItemBounds(tourComposeHelper.getLeagueItemBounds);
            tourManager.setGetMatchItemBounds(tourComposeHelper.getMatchItemBounds);
            tourManager.setGetBetSectionBounds(tourComposeHelper.getBetSectionBounds);
            tourManager.setGetTabBounds(tourComposeHelper.getTabBounds);
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$3$lambda$2;
                        TourComposeView$lambda$3$lambda$2 = TourComposeHelperKt.TourComposeView$lambda$3$lambda$2(TourState.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.setSportItemId = (Function1) rememberedValue3;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$5$lambda$4;
                        TourComposeView$lambda$5$lambda$4 = TourComposeHelperKt.TourComposeView$lambda$5$lambda$4(TourState.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.setLeagueItemId = (Function1) rememberedValue4;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$7$lambda$6;
                        TourComposeView$lambda$7$lambda$6 = TourComposeHelperKt.TourComposeView$lambda$7$lambda$6(TourState.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.setMatchItemId = (Function1) rememberedValue5;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$9$lambda$8;
                        TourComposeView$lambda$9$lambda$8 = TourComposeHelperKt.TourComposeView$lambda$9$lambda$8(TourState.this, (Rect) obj);
                        return TourComposeView$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.setBetSectionBounds = (Function1) rememberedValue6;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$11$lambda$10;
                        TourComposeView$lambda$11$lambda$10 = TourComposeHelperKt.TourComposeView$lambda$11$lambda$10(TourState.this, (Rect) obj);
                        return TourComposeView$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.setBaseMatchItemBounds = (Function1) rememberedValue7;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourComposeView$lambda$13$lambda$12;
                        TourComposeView$lambda$13$lambda$12 = TourComposeHelperKt.TourComposeView$lambda$13$lambda$12(TourState.this);
                        return TourComposeView$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            tourComposeHelper.onBetSectionReady = (Function0) rememberedValue8;
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changedInstance = startRestartGroup.changedInstance(tourComposeHelper);
            TourComposeHelperKt$TourComposeView$7$1 rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new TourComposeHelperKt$TourComposeView$7$1(tourState, tourComposeHelper, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue9, startRestartGroup, 6);
            TourFavoriteSportsController tourFavoriteSportsController = tourComposeHelper.getTourFavoriteSportsController();
            UserService userService = tourComposeHelper.getUserService();
            Function0<Boolean> function0 = tourComposeHelper.isOnHomePage;
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance2 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourComposeView$lambda$16$lambda$15;
                        TourComposeView$lambda$16$lambda$15 = TourComposeHelperKt.TourComposeView$lambda$16$lambda$15(TourComposeHelper.this);
                        return TourComposeView$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            Function0 function02 = (Function0) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance3 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourComposeView$lambda$18$lambda$17;
                        TourComposeView$lambda$18$lambda$17 = TourComposeHelperKt.TourComposeView$lambda$18$lambda$17(TourComposeHelper.this);
                        return TourComposeView$lambda$18$lambda$17;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            Function0 function03 = (Function0) rememberedValue11;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance4 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourComposeView$lambda$20$lambda$19;
                        TourComposeView$lambda$20$lambda$19 = TourComposeHelperKt.TourComposeView$lambda$20$lambda$19(TourComposeHelper.this);
                        return TourComposeView$lambda$20$lambda$19;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            Function0 function04 = (Function0) rememberedValue12;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance5 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$22$lambda$21;
                        TourComposeView$lambda$22$lambda$21 = TourComposeHelperKt.TourComposeView$lambda$22$lambda$21(TourComposeHelper.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            Function1 function1 = (Function1) rememberedValue13;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance6 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$24$lambda$23;
                        TourComposeView$lambda$24$lambda$23 = TourComposeHelperKt.TourComposeView$lambda$24$lambda$23(TourComposeHelper.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            Function1 function12 = (Function1) rememberedValue14;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance7 = startRestartGroup.changedInstance(tourComposeHelper);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (changedInstance7 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new Function1() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TourComposeView$lambda$26$lambda$25;
                        TourComposeView$lambda$26$lambda$25 = TourComposeHelperKt.TourComposeView$lambda$26$lambda$25(TourComposeHelper.this, ((Long) obj).longValue());
                        return TourComposeView$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TourScreenKt.TourScreen(tourManager, tourState, tourFavoriteSportsController, userService, onTourComplete, function0, function02, function03, function04, function1, function12, (Function1) rememberedValue15, null, composer2, ((i2 << 9) & 57344) | 48, 0, 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourComposeView$lambda$27;
                    TourComposeView$lambda$27 = TourComposeHelperKt.TourComposeView$lambda$27(TourComposeHelper.this, onTourComplete, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourComposeView$lambda$27;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$3$lambda$2(TourState tourState, long j) {
        tourState.setSelectedSportId(Long.valueOf(j));
        Log.d("TourFlow", "TourComposeHelper - Sport item ID set: " + j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$5$lambda$4(TourState tourState, long j) {
        tourState.setSelectedLeagueId(Long.valueOf(j));
        Log.d("TourFlow", "TourComposeHelper - League item ID set: " + j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$7$lambda$6(TourState tourState, long j) {
        tourState.setSelectedMatchId(Long.valueOf(j));
        Log.d("TourFlow", "TourComposeHelper - Match item ID set: " + j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$9$lambda$8(TourState tourState, Rect rect) {
        tourState.setBetSectionBounds(rect);
        Log.d("TourFlow", "TourComposeHelper - Bet section bounds set: " + rect);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$11$lambda$10(TourState tourState, Rect rect) {
        tourState.setBaseMatchItemBounds(rect);
        Log.d("TourFlow", "TourComposeHelper - Base match item bounds set: " + rect + ", bottom=" + (rect != null ? Integer.valueOf(rect.bottom) : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$13$lambda$12(TourState tourState) {
        tourState.setBetSectionReady(true);
        Log.d("TourFlow", "TourComposeHelper - Bet section ready - overlay can be shown");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$16$lambda$15(TourComposeHelper tourComposeHelper) {
        Function0<Unit> function0;
        if (tourComposeHelper.isOnHomePage.invoke().booleanValue() && (function0 = tourComposeHelper.dimMenuTabs) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$18$lambda$17(TourComposeHelper tourComposeHelper) {
        Function0<Unit> function0 = tourComposeHelper.restoreMenuTabs;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$20$lambda$19(TourComposeHelper tourComposeHelper) {
        Function0<Unit> function0 = tourComposeHelper.clickSportsButton;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$22$lambda$21(TourComposeHelper tourComposeHelper, long j) {
        Function1<? super Long, Unit> function1 = tourComposeHelper.clickSportItem;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$24$lambda$23(TourComposeHelper tourComposeHelper, long j) {
        Function1<? super Long, Unit> function1 = tourComposeHelper.clickLeagueItem;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeView$lambda$26$lambda$25(TourComposeHelper tourComposeHelper, long j) {
        Function1<? super Long, Unit> function1 = tourComposeHelper.clickMatchItem;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
        return Unit.INSTANCE;
    }

    public static final void TourComposeViewForJava(final TourComposeHelper tourComposeHelper, final Function0<Unit> onTourComplete, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tourComposeHelper, "tourComposeHelper");
        Intrinsics.checkNotNullParameter(onTourComplete, "onTourComplete");
        Composer startRestartGroup = composer.startRestartGroup(618953778);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(tourComposeHelper) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onTourComplete) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(618953778, i2, -1, "org.betup.ui.tour.compose.TourComposeViewForJava (TourComposeHelper.kt:380)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(onTourComplete);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TourComposeViewForJava$lambda$29$lambda$28;
                        TourComposeViewForJava$lambda$29$lambda$28 = TourComposeHelperKt.TourComposeViewForJava$lambda$29$lambda$28(Function0.this);
                        return TourComposeViewForJava$lambda$29$lambda$28;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            TourComposeView(tourComposeHelper, (Function0) rememberedValue, startRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourComposeHelperKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourComposeViewForJava$lambda$30;
                    TourComposeViewForJava$lambda$30 = TourComposeHelperKt.TourComposeViewForJava$lambda$30(TourComposeHelper.this, onTourComplete, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TourComposeViewForJava$lambda$30;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourComposeViewForJava$lambda$29$lambda$28(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
