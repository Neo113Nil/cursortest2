package org.betup.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.betup.bus.NavigateMessage;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.compose.BattleListDetailsScreenKt;
import org.betup.ui.dialogs.controller.ChallengePreviewController;
import org.betup.utils.BattleShareCaptureAnchor;
import org.betup.utils.NavigationHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengePreviewNewDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengePreviewNewDialogFragment$onCreateView$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Long $selectedChallengeId;
    final /* synthetic */ ChallengePreviewNewDialogFragment this$0;

    ChallengePreviewNewDialogFragment$onCreateView$2$1(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, Long l) {
        this.this$0 = challengePreviewNewDialogFragment;
        this.$selectedChallengeId = l;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().dismissShareChooser();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1190483535, i, -1, "org.betup.ui.dialogs.ChallengePreviewNewDialogFragment.onCreateView.<anonymous>.<anonymous> (ChallengePreviewNewDialogFragment.kt:82)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getShareChooserState(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getChallengeIds(), null, composer, 0, 1);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new BattleShareCaptureAnchor();
            composer.updateRememberedValue(rememberedValue);
        }
        final BattleShareCaptureAnchor battleShareCaptureAnchor = (BattleShareCaptureAnchor) rememberedValue;
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(density);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density.getDensity() * 4.0f), 1));
            composer.updateRememberedValue(rememberedValue2);
        }
        final int intValue = ((Number) rememberedValue2).intValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(density);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(density.getDensity() * 28.0f), intValue));
            composer.updateRememberedValue(rememberedValue3);
        }
        final int intValue2 = ((Number) rememberedValue3).intValue();
        composer.endReplaceGroup();
        ChallengePreviewController.BattleShareChooserState invoke$lambda$0 = invoke$lambda$0(collectAsState);
        composer.startReplaceGroup(-1593354823);
        if (invoke$lambda$0 != null) {
            final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment = this.this$0;
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(challengePreviewNewDialogFragment);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6$lambda$5;
                        invoke$lambda$7$lambda$6$lambda$5 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$7$lambda$6$lambda$5(ChallengePreviewNewDialogFragment.this);
                        return invoke$lambda$7$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            AndroidDialog_androidKt.Dialog((Function0) rememberedValue4, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-692545440, true, new ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2(invoke$lambda$0, challengePreviewNewDialogFragment), composer, 54), composer, 432, 0);
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        List<Long> invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        Long l = this.$selectedChallengeId;
        long longValue = l != null ? l.longValue() : 0L;
        ChallengePreviewController controller = this.this$0.getController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment2 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$9$lambda$8(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function0 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment3 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$11$lambda$10(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function02 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment4 = this.this$0;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$13$lambda$12;
                    invoke$lambda$13$lambda$12 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$13$lambda$12(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$13$lambda$12;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function0 function03 = (Function0) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment5 = this.this$0;
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$15$lambda$14;
                    invoke$lambda$15$lambda$14 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$15$lambda$14(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$15$lambda$14;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function0 function04 = (Function0) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment6 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function2() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$18$lambda$17;
                    invoke$lambda$18$lambda$17 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$18$lambda$17(ChallengePreviewNewDialogFragment.this, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$18$lambda$17;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        Function2 function2 = (Function2) rememberedValue9;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment7 = this.this$0;
        Object rememberedValue10 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new Function2() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$20$lambda$19;
                    invoke$lambda$20$lambda$19 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$20$lambda$19(ChallengePreviewNewDialogFragment.this, ((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$20$lambda$19;
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        Function2 function22 = (Function2) rememberedValue10;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance8 = composer.changedInstance(this.this$0) | composer.changedInstance(battleShareCaptureAnchor) | composer.changed(intValue) | composer.changed(intValue2);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment8 = this.this$0;
        Object rememberedValue11 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$22$lambda$21;
                    invoke$lambda$22$lambda$21 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$22$lambda$21(ChallengePreviewNewDialogFragment.this, battleShareCaptureAnchor, intValue, intValue2);
                    return invoke$lambda$22$lambda$21;
                }
            };
            composer.updateRememberedValue(rememberedValue11);
        }
        Function0 function05 = (Function0) rememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance9 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment9 = this.this$0;
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance9 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            rememberedValue12 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$24$lambda$23;
                    invoke$lambda$24$lambda$23 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$24$lambda$23(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$24$lambda$23;
                }
            };
            composer.updateRememberedValue(rememberedValue12);
        }
        Function0 function06 = (Function0) rememberedValue12;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance10 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment10 = this.this$0;
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance10 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$26$lambda$25;
                    invoke$lambda$26$lambda$25 = ChallengePreviewNewDialogFragment$onCreateView$2$1.invoke$lambda$26$lambda$25(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$26$lambda$25;
                }
            };
            composer.updateRememberedValue(rememberedValue13);
        }
        composer.endReplaceGroup();
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.MainActivity");
        BattleListDetailsScreenKt.BattleListDetailsScreen(invoke$lambda$1, longValue, controller, battleShareCaptureAnchor, function0, function02, function03, function04, function2, function22, function05, function06, (Function0) rememberedValue13, (MainActivity) requireActivity, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 24576, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().navigateToAcceptChallenge();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        ChallengePreviewController controller = challengePreviewNewDialogFragment.getController();
        FragmentManager childFragmentManager = challengePreviewNewDialogFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        controller.showCancelConfirmDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, long j, boolean z) {
        challengePreviewNewDialogFragment.dismiss();
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", (int) j);
        bundle.putBoolean("isLive", z);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$20$lambda$19(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, long j, boolean z) {
        challengePreviewNewDialogFragment.dismiss();
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, j, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment, BattleShareCaptureAnchor battleShareCaptureAnchor, int i, int i2) {
        FragmentActivity requireActivity = challengePreviewNewDialogFragment.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Dialog dialog = challengePreviewNewDialogFragment.getDialog();
        challengePreviewNewDialogFragment.captureAndShareBattle(requireActivity, battleShareCaptureAnchor, i, i2, dialog != null ? dialog.getWindow() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().navigateToRematch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$26$lambda$25(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().openBattleRules();
        return Unit.INSTANCE;
    }

    private static final ChallengePreviewController.BattleShareChooserState invoke$lambda$0(State<ChallengePreviewController.BattleShareChooserState> state) {
        return state.getValue();
    }

    private static final List<Long> invoke$lambda$1(State<? extends List<Long>> state) {
        return state.getValue();
    }
}
