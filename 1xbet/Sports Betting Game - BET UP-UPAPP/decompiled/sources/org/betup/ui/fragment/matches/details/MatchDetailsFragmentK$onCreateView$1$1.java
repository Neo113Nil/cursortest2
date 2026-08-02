package org.betup.ui.fragment.matches.details;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.greenrobot.eventbus.EventBus;

/* compiled from: MatchDetailsFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchDetailsFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBetSectionReady;
    final /* synthetic */ Function1<Rect, Unit> $setBetSectionBounds;
    final /* synthetic */ MatchDetailsFragmentK this$0;

    /* JADX WARN: Multi-variable type inference failed */
    MatchDetailsFragmentK$onCreateView$1$1(MatchDetailsFragmentK matchDetailsFragmentK, Function1<? super Rect, Unit> function1, Function0<Unit> function0) {
        this.this$0 = matchDetailsFragmentK;
        this.$setBetSectionBounds = function1;
        this.$onBetSectionReady = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int i2;
        TourComposeHelper tourComposeHelper;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-79722033, i, -1, "org.betup.ui.fragment.matches.details.MatchDetailsFragmentK.onCreateView.<anonymous>.<anonymous> (MatchDetailsFragmentK.kt:80)");
        }
        FragmentActivity activity = this.this$0.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        TourState tourState = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null) ? null : tourComposeHelper.getTourState();
        boolean isTourActive = tourState != null ? tourState.isTourActive() : false;
        TourStep currentStep = tourState != null ? tourState.getCurrentStep() : null;
        boolean isBetSectionReady = tourState != null ? tourState.isBetSectionReady() : false;
        MatchShortInfoModel invoke$lambda$0 = invoke$lambda$0(SnapshotStateKt.collectAsState(this.this$0.getController().getCurrentMatch(), null, composer, 0, 1));
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        MatchDetailsFragmentK matchDetailsFragmentK = this.this$0;
        MatchDetailsFragmentK$onCreateView$1$1$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new MatchDetailsFragmentK$onCreateView$1$1$1$1(matchDetailsFragmentK, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(invoke$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer, 0);
        Boolean valueOf = Boolean.valueOf(isTourActive);
        Boolean valueOf2 = Boolean.valueOf(isBetSectionReady);
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(isTourActive) | composer.changed(currentStep == null ? -1 : currentStep.ordinal()) | composer.changed(isBetSectionReady);
        MatchDetailsFragmentK$onCreateView$1$1$2$1 rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new MatchDetailsFragmentK$onCreateView$1$1$2$1(isTourActive, currentStep, isBetSectionReady, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, currentStep, valueOf2, (Function2) rememberedValue2, composer, 0);
        Boolean valueOf3 = Boolean.valueOf(isTourActive);
        Boolean valueOf4 = Boolean.valueOf(isBetSectionReady);
        composer.startReplaceGroup(-1224400529);
        boolean changed2 = composer.changed(isTourActive) | composer.changed(currentStep != null ? currentStep.ordinal() : -1) | composer.changed(isBetSectionReady) | composer.changedInstance(this.this$0);
        MatchDetailsFragmentK matchDetailsFragmentK2 = this.this$0;
        MatchDetailsFragmentK$onCreateView$1$1$3$1 rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            i2 = 5004770;
            rememberedValue3 = new MatchDetailsFragmentK$onCreateView$1$1$3$1(isTourActive, currentStep, isBetSectionReady, matchDetailsFragmentK2, null);
            composer.updateRememberedValue(rememberedValue3);
        } else {
            i2 = 5004770;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf3, currentStep, valueOf4, (Function2) rememberedValue3, composer, 0);
        composer.startReplaceGroup(i2);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final MatchDetailsFragmentK matchDetailsFragmentK3 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$5$lambda$4(MatchDetailsFragmentK.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function0 function0 = (Function0) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(i2);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final MatchDetailsFragmentK matchDetailsFragmentK4 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$7$lambda$6(MatchDetailsFragmentK.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function02 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        MatchDetailsController controller = this.this$0.getController();
        composer.startReplaceGroup(i2);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final MatchDetailsFragmentK matchDetailsFragmentK5 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$10$lambda$9(MatchDetailsFragmentK.this);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function03 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(i2);
        boolean changed3 = composer.changed(this.$setBetSectionBounds);
        final Function1<Rect, Unit> function1 = this.$setBetSectionBounds;
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$12$lambda$11;
                    invoke$lambda$12$lambda$11 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$12$lambda$11(Function1.this, (Rect) obj);
                    return invoke$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function1 function12 = (Function1) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(i2);
        boolean changed4 = composer.changed(this.$onBetSectionReady);
        final Function0<Unit> function04 = this.$onBetSectionReady;
        Object rememberedValue8 = composer.rememberedValue();
        if (changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$13;
                    invoke$lambda$14$lambda$13 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$14$lambda$13(Function0.this);
                    return invoke$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function0 function05 = (Function0) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(i2);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final MatchDetailsFragmentK matchDetailsFragmentK6 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$16$lambda$15;
                    invoke$lambda$16$lambda$15 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$16$lambda$15(MatchDetailsFragmentK.this, (Rect) obj);
                    return invoke$lambda$16$lambda$15;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        Function1 function13 = (Function1) rememberedValue9;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$19$lambda$18;
                    invoke$lambda$19$lambda$18 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$19$lambda$18(((Long) obj).longValue());
                    return invoke$lambda$19$lambda$18;
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        composer.endReplaceGroup();
        MatchDetailsScreenKt.MatchDetailsScreen(function0, function02, controller, function03, function12, function05, tourState, function13, (Function1) rememberedValue10, composer, 100663296, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MatchDetailsFragmentK matchDetailsFragmentK) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = matchDetailsFragmentK.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.popBackStack();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(MatchDetailsFragmentK matchDetailsFragmentK) {
        matchDetailsFragmentK.getController().onNavigateToSubscriptionAdd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(final MatchDetailsFragmentK matchDetailsFragmentK) {
        OneClickBetSettingsDialogFragment.INSTANCE.newInstance(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$10$lambda$9$lambda$8;
                invoke$lambda$10$lambda$9$lambda$8 = MatchDetailsFragmentK$onCreateView$1$1.invoke$lambda$10$lambda$9$lambda$8(MatchDetailsFragmentK.this);
                return invoke$lambda$10$lambda$9$lambda$8;
            }
        }).show(matchDetailsFragmentK.getChildFragmentManager(), "OneClickBetSettingsDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8(MatchDetailsFragmentK matchDetailsFragmentK) {
        matchDetailsFragmentK.getController().refreshOneClickBetEnabledFromPrefs();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(Function1 function1, Rect rect) {
        if (function1 != null) {
            function1.invoke(rect);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(MatchDetailsFragmentK matchDetailsFragmentK, Rect rect) {
        TourComposeHelper tourComposeHelper;
        Function1<? super Rect, Unit> function1;
        if (!matchDetailsFragmentK.isAdded()) {
            return Unit.INSTANCE;
        }
        FragmentActivity activity = matchDetailsFragmentK.getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null && (function1 = tourComposeHelper.setBaseMatchItemBounds) != null) {
            function1.invoke(rect);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$19$lambda$18(long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", (int) j);
        bundle.putBoolean("isLive", false);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    private static final MatchShortInfoModel invoke$lambda$0(State<MatchShortInfoModel> state) {
        return state.getValue();
    }
}
