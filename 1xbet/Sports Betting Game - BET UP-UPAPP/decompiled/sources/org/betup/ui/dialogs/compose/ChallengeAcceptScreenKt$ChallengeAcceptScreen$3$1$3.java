package org.betup.ui.dialogs.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.VideoRewardButtonKt;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.dialogs.events.OpenFollowersDialogForBattleEvent;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengeAcceptScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<Long> $amount$delegate;
    final /* synthetic */ ChallengeAcceptController $controller;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<Boolean> $isUserCreator$delegate;
    final /* synthetic */ State<Long> $userId$delegate;

    ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3(State<Boolean> state, ChallengeAcceptController challengeAcceptController, State<Long> state2, State<Boolean> state3, State<Long> state4) {
        this.$isLoading$delegate = state;
        this.$controller = challengeAcceptController;
        this.$userId$delegate = state2;
        this.$isUserCreator$delegate = state3;
        this.$amount$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$1$lambda$0(ChallengeAcceptController challengeAcceptController, State state) {
        boolean ChallengeAcceptScreen$lambda$1;
        ChallengeAcceptScreen$lambda$1 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state);
        if (!ChallengeAcceptScreen$lambda$1) {
            EventBus.getDefault().post(new OpenFollowersDialogForBattleEvent(challengeAcceptController.getUserServiceP().getShortProfile().getUserModel().getId() != null ? r3.intValue() : 0L));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4(boolean z, ChallengeAcceptController challengeAcceptController, Context context, State state, State state2) {
        boolean ChallengeAcceptScreen$lambda$1;
        long ChallengeAcceptScreen$lambda$3;
        long ChallengeAcceptScreen$lambda$32;
        ChallengeAcceptScreen$lambda$1 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state);
        if (!ChallengeAcceptScreen$lambda$1) {
            if (!z) {
                String string = context.getString(R.string.min_battle_amount);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                challengeAcceptController.showMessage(string);
            } else if (challengeAcceptController.get_challengeId() != null) {
                ChallengeAcceptScreen$lambda$32 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state2);
                challengeAcceptController.acceptChallenge(ChallengeAcceptScreen$lambda$32);
            } else {
                ChallengeAcceptScreen$lambda$3 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state2);
                challengeAcceptController.createChallenge(ChallengeAcceptScreen$lambda$3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6(ChallengeAcceptController challengeAcceptController) {
        challengeAcceptController.onVideoRewardButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        Long ChallengeAcceptScreen$lambda$0;
        State<Long> state;
        String str;
        State<Boolean> state2;
        State<Long> state3;
        ChallengeAcceptController challengeAcceptController;
        State<Boolean> state4;
        float f;
        String str2;
        String str3;
        String str4;
        long ChallengeAcceptScreen$lambda$3;
        long ChallengeAcceptScreen$lambda$32;
        String stringResource;
        boolean z;
        boolean ChallengeAcceptScreen$lambda$1;
        boolean ChallengeAcceptScreen$lambda$12;
        final ChallengeAcceptController challengeAcceptController2;
        boolean changed;
        Object rememberedValue;
        Long ChallengeAcceptScreen$lambda$02;
        Long ChallengeAcceptScreen$lambda$03;
        boolean ChallengeAcceptScreen$lambda$7;
        boolean ChallengeAcceptScreen$lambda$13;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490094385, i, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen.<anonymous>.<anonymous>.<anonymous> (ChallengeAcceptScreen.kt:145)");
        }
        float f2 = 16;
        float f3 = 2;
        float f4 = 12;
        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(6)), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f4));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f4));
        final State<Boolean> state5 = this.$isLoading$delegate;
        final ChallengeAcceptController challengeAcceptController3 = this.$controller;
        State<Long> state6 = this.$userId$delegate;
        State<Boolean> state7 = this.$isUserCreator$delegate;
        State<Long> state8 = this.$amount$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1519paddingqDBjuR0);
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
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceGroup(-1195950062);
        ChallengeAcceptScreen$lambda$0 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$0(state6);
        if (ChallengeAcceptScreen$lambda$0 == null) {
            String stringResource2 = StringResources_androidKt.stringResource(R.string.invite_without_exclamation, composer, 6);
            ChallengeAcceptScreen$lambda$13 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state5);
            boolean z2 = !ChallengeAcceptScreen$lambda$13;
            composer.startReplaceGroup(-1633490746);
            boolean changed2 = composer.changed(state5) | composer.changedInstance(challengeAcceptController3);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$9$lambda$1$lambda$0;
                        invoke$lambda$9$lambda$1$lambda$0 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3.invoke$lambda$9$lambda$1$lambda$0(ChallengeAcceptController.this, state5);
                        return invoke$lambda$9$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            str = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
            state = state8;
            state2 = state7;
            state3 = state6;
            challengeAcceptController = challengeAcceptController3;
            state4 = state5;
            f = f3;
            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str3 = "C101@5232L9:Row.kt#2w3rfo";
            str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource2, false, false, z2, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 3120, 6, 0, 2096017);
        } else {
            state = state8;
            str = "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo";
            state2 = state7;
            state3 = state6;
            challengeAcceptController = challengeAcceptController3;
            state4 = state5;
            f = f3;
            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str3 = "C101@5232L9:Row.kt#2w3rfo";
            str4 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1195908248);
        if (challengeAcceptController.get_challengeId() != null) {
            ChallengeAcceptScreen$lambda$7 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$7(state2);
            if (ChallengeAcceptScreen$lambda$7) {
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
        }
        ChallengeAcceptScreen$lambda$3 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state);
        boolean z3 = ChallengeAcceptScreen$lambda$3 >= 500;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context context = (Context) consume;
        long moneyBalance = challengeAcceptController.getUserServiceP().getShortProfile().getUserProgressModel().getMoneyBalance();
        ChallengeAcceptScreen$lambda$32 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state);
        boolean z4 = moneyBalance >= ChallengeAcceptScreen$lambda$32;
        State collectAsState = SnapshotStateKt.collectAsState(challengeAcceptController.isVideoRewardAvailable(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(challengeAcceptController.getVideoRewardAmount(), null, composer, 0, 1);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, str);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str4);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, str3);
        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        if (challengeAcceptController.get_challengeId() != null) {
            composer.startReplaceGroup(-2021629341);
            stringResource = StringResources_androidKt.stringResource(R.string.accept_battle, composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2021506333);
            stringResource = StringResources_androidKt.stringResource(R.string.create_battle, composer, 6);
            composer.endReplaceGroup();
        }
        if (!z4 && invoke$lambda$9$lambda$2(collectAsState)) {
            ChallengeAcceptScreen$lambda$03 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$0(state3);
            if (ChallengeAcceptScreen$lambda$03 != null) {
                z = true;
                ChallengeAcceptScreen$lambda$1 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state4);
                ChallengeAcceptScreen$lambda$12 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state4);
                boolean z5 = !ChallengeAcceptScreen$lambda$12;
                HapticFeedbackType hapticFeedbackType = HapticFeedbackType.Confirm;
                composer.startReplaceGroup(-1224400529);
                final State<Boolean> state9 = state4;
                challengeAcceptController2 = challengeAcceptController;
                final State<Long> state10 = state;
                changed = composer.changed(state9) | composer.changed(z3) | composer.changedInstance(challengeAcceptController2) | composer.changedInstance(context) | composer.changed(state10);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final boolean z6 = z3;
                    Object obj = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4;
                            invoke$lambda$9$lambda$8$lambda$5$lambda$4 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3.invoke$lambda$9$lambda$8$lambda$5$lambda$4(z6, challengeAcceptController2, context, state9, state10);
                            return invoke$lambda$9$lambda$8$lambda$5$lambda$4;
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                composer.endReplaceGroup();
                CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, z3, stringResource, z, false, z5, (Function0) rememberedValue, false, false, false, ChallengeAcceptScreen$lambda$1, false, null, null, false, false, null, null, null, null, hapticFeedbackType, composer, 0, 0, 6, 1047440);
                composer.startReplaceGroup(766125738);
                if (!z4 && invoke$lambda$9$lambda$2(collectAsState)) {
                    ChallengeAcceptScreen$lambda$02 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$0(state3);
                    if (ChallengeAcceptScreen$lambda$02 != null) {
                        boolean invoke$lambda$9$lambda$2 = invoke$lambda$9$lambda$2(collectAsState);
                        long invoke$lambda$9$lambda$3 = invoke$lambda$9$lambda$3(collectAsState2);
                        composer.startReplaceGroup(5004770);
                        boolean changedInstance = composer.changedInstance(challengeAcceptController2);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6;
                                    invoke$lambda$9$lambda$8$lambda$7$lambda$6 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3.invoke$lambda$9$lambda$8$lambda$7$lambda$6(ChallengeAcceptController.this);
                                    return invoke$lambda$9$lambda$8$lambda$7$lambda$6;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceGroup();
                        VideoRewardButtonKt.VideoRewardButton(invoke$lambda$9$lambda$2, invoke$lambda$9$lambda$3, (Function0) rememberedValue3, null, composer, 0, 8);
                    }
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        z = false;
        ChallengeAcceptScreen$lambda$1 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state4);
        ChallengeAcceptScreen$lambda$12 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state4);
        boolean z52 = !ChallengeAcceptScreen$lambda$12;
        HapticFeedbackType hapticFeedbackType2 = HapticFeedbackType.Confirm;
        composer.startReplaceGroup(-1224400529);
        final State state92 = state4;
        challengeAcceptController2 = challengeAcceptController;
        final State state102 = state;
        changed = composer.changed(state92) | composer.changed(z3) | composer.changedInstance(challengeAcceptController2) | composer.changedInstance(context) | composer.changed(state102);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        final boolean z62 = z3;
        Object obj2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4;
                invoke$lambda$9$lambda$8$lambda$5$lambda$4 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$3.invoke$lambda$9$lambda$8$lambda$5$lambda$4(z62, challengeAcceptController2, context, state92, state102);
                return invoke$lambda$9$lambda$8$lambda$5$lambda$4;
            }
        };
        composer.updateRememberedValue(obj2);
        rememberedValue = obj2;
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(weight$default, z3, stringResource, z, false, z52, (Function0) rememberedValue, false, false, false, ChallengeAcceptScreen$lambda$1, false, null, null, false, false, null, null, null, null, hapticFeedbackType2, composer, 0, 0, 6, 1047440);
        composer.startReplaceGroup(766125738);
        if (!z4) {
            ChallengeAcceptScreen$lambda$02 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$0(state3);
            if (ChallengeAcceptScreen$lambda$02 != null) {
            }
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    private static final boolean invoke$lambda$9$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long invoke$lambda$9$lambda$3(State<Long> state) {
        return state.getValue().longValue();
    }
}
