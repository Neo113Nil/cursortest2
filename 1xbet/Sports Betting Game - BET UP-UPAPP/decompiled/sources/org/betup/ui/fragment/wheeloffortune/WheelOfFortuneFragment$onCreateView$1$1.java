package org.betup.ui.fragment.wheeloffortune;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.model.remote.entity.rewards.RewardModel;
import org.betup.services.offer.PromoService;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt;
import org.betup.ui.fragment.wheeloffortune.compose.WinResultDialogKt;
import org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController;
import org.betup.utils.SnackbarHelper;

/* compiled from: WheelOfFortuneFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WheelOfFortuneFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ Integer $winningValue;
    final /* synthetic */ WheelOfFortuneFragment this$0;

    WheelOfFortuneFragment$onCreateView$1$1(WheelOfFortuneFragment wheelOfFortuneFragment, ComposeView composeView, Integer num) {
        this.this$0 = wheelOfFortuneFragment;
        this.$this_apply = composeView;
        this.$winningValue = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(WheelOfFortuneFragment wheelOfFortuneFragment, MutableState mutableState) {
        invoke$lambda$2(mutableState, false);
        wheelOfFortuneFragment.closeWheelOverlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(final WheelOfFortuneFragment wheelOfFortuneFragment, State state, final ComposeView composeView) {
        int i;
        int i2 = invoke$lambda$4(state) ? wheelOfFortuneFragment.currentMultiplier : 1;
        WheelOfFortuneRewardController rewardController = wheelOfFortuneFragment.getRewardController();
        i = wheelOfFortuneFragment.dailyBonusId;
        rewardController.collectReward(i, i2, new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$12$lambda$11$lambda$8;
                invoke$lambda$12$lambda$11$lambda$8 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$12$lambda$11$lambda$8(WheelOfFortuneFragment.this, (RewardModel) obj);
                return invoke$lambda$12$lambda$11$lambda$8;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$12$lambda$11$lambda$10;
                invoke$lambda$12$lambda$11$lambda$10 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$12$lambda$11$lambda$10(ComposeView.this, (String) obj);
                return invoke$lambda$12$lambda$11$lambda$10;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$8(WheelOfFortuneFragment wheelOfFortuneFragment, RewardModel reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        wheelOfFortuneFragment.closeWheelOverlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(ComposeView composeView, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.e("VideoRewardReceivedr", "Error collecting reward: " + error);
        Context context = composeView.getContext();
        if (context != null) {
            SnackbarHelper.showShort(context, "Error: " + error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(WheelOfFortuneFragment wheelOfFortuneFragment) {
        int i;
        i = wheelOfFortuneFragment.dailyBonusId;
        Log.d("VideoRewardReceivedr", "onViewAd clicked - calling redeemReward for DAILY_BONUS with dailyBonusId: " + i);
        wheelOfFortuneFragment.getHomeVideoBonusController().standDownForExternalVideoReward();
        wheelOfFortuneFragment.getVideoRewardService().redeemReward(PromoService.PromoPlacement.DAILY_BONUS, null, null);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        StateFlow stateFlow;
        int i2;
        int i3;
        int i4;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1062495223, i, -1, "org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment.onCreateView.<anonymous>.<anonymous> (WheelOfFortuneFragment.kt:151)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        stateFlow = this.this$0.baseWinAmount;
        State collectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1);
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue2);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.isVideoWatched(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getRewardController().isCollecting(), null, composer, 0, 1);
        if (invoke$lambda$1(mutableState)) {
            composer.startReplaceGroup(-1113260124);
            int invoke$lambda$3 = invoke$lambda$3(collectAsState);
            i3 = this.this$0.currentMultiplier;
            i4 = this.this$0.dailyBonusBoostMultiplier;
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance = composer.changedInstance(this.this$0);
            final WheelOfFortuneFragment wheelOfFortuneFragment = this.this$0;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6;
                        invoke$lambda$7$lambda$6 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(WheelOfFortuneFragment.this, mutableState);
                        return invoke$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean changed = composer.changed(collectAsState2) | composer.changedInstance(this.this$0) | composer.changedInstance(this.$this_apply);
            final WheelOfFortuneFragment wheelOfFortuneFragment2 = this.this$0;
            final ComposeView composeView = this.$this_apply;
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$12$lambda$11;
                        invoke$lambda$12$lambda$11 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$12$lambda$11(WheelOfFortuneFragment.this, collectAsState2, composeView);
                        return invoke$lambda$12$lambda$11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            Function0 function02 = (Function0) rememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(this.this$0);
            final WheelOfFortuneFragment wheelOfFortuneFragment3 = this.this$0;
            Object rememberedValue5 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$13;
                        invoke$lambda$14$lambda$13 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$14$lambda$13(WheelOfFortuneFragment.this);
                        return invoke$lambda$14$lambda$13;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            WinResultDialogKt.WinResultDialog(invoke$lambda$3, i3, i4, function0, function02, (Function0) rememberedValue5, invoke$lambda$4(collectAsState2), invoke$lambda$5(collectAsState3), composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1110328051);
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(5004770);
            boolean changedInstance3 = composer.changedInstance(this.this$0);
            final WheelOfFortuneFragment wheelOfFortuneFragment4 = this.this$0;
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$16$lambda$15;
                        invoke$lambda$16$lambda$15 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$16$lambda$15(WheelOfFortuneFragment.this);
                        return invoke$lambda$16$lambda$15;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1025backgroundbw27NRU$default, false, null, null, (Function0) rememberedValue6, 7, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            final WheelOfFortuneFragment wheelOfFortuneFragment5 = this.this$0;
            Integer num = this.$winningValue;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1059clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.lights_wheel_of_fortune, composer, 6), "Lights wheel of fortune", PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter()), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(90), 7, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(66), Dp.m7774constructorimpl(36), 0.0f, 9, null);
            composer.startReplaceGroup(5004770);
            boolean changedInstance4 = composer.changedInstance(wheelOfFortuneFragment5);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$21$lambda$18$lambda$17;
                        invoke$lambda$21$lambda$18$lambda$17 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$21$lambda$18$lambda$17(WheelOfFortuneFragment.this);
                        return invoke$lambda$21$lambda$18$lambda$17;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            composer.endReplaceGroup();
            TopActionButtonsKt.TopActionButtons(m1520paddingqDBjuR0$default, (Function0) rememberedValue7, null, null, false, false, false, composer, 24576, 108);
            Modifier align = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance5 = composer.changedInstance(coroutineScope);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$onCreateView$1$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$21$lambda$20$lambda$19;
                        invoke$lambda$21$lambda$20$lambda$19 = WheelOfFortuneFragment$onCreateView$1$1.invoke$lambda$21$lambda$20$lambda$19(CoroutineScope.this, mutableState, ((Integer) obj).intValue());
                        return invoke$lambda$21$lambda$20$lambda$19;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            composer.endReplaceGroup();
            i2 = wheelOfFortuneFragment5.dailyBonusBoostMultiplier;
            WheelOfFortuneContentKt.WheelOfFortuneContent(align, (Function1) rememberedValue8, num, i2, composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(WheelOfFortuneFragment wheelOfFortuneFragment) {
        wheelOfFortuneFragment.closeWheelOverlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$18$lambda$17(WheelOfFortuneFragment wheelOfFortuneFragment) {
        wheelOfFortuneFragment.closeWheelOverlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20$lambda$19(CoroutineScope coroutineScope, MutableState mutableState, int i) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WheelOfFortuneFragment$onCreateView$1$1$5$2$1$1(mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final int invoke$lambda$3(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final boolean invoke$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
