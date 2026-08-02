package org.betup.utils;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt;

/* compiled from: BetTicketShareBitmapRenderer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetTicketShareBitmapRenderer$renderOffscreen$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetsListModel $item;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ float $widthDp;

    BetTicketShareBitmapRenderer$renderOffscreen$1(float f, BetsListModel betsListModel, OddType oddType) {
        this.$widthDp = f;
        this.$item = betsListModel;
        this.$oddType = oddType;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$3$lambda$2(int i, MatchState matchState) {
        Intrinsics.checkNotNullParameter(matchState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$5$lambda$4(long j, long j2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$7$lambda$6(long j, long j2, double d) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-431097813, i, -1, "org.betup.utils.BetTicketShareBitmapRenderer.renderOffscreen.<anonymous> (BetTicketShareBitmapRenderer.kt:86)");
        }
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, this.$widthDp), null, false, 3, null);
        BetsListModel betsListModel = this.$item;
        OddType oddType = this.$oddType;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
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
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function2() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$10$lambda$3$lambda$2;
                    invoke$lambda$10$lambda$3$lambda$2 = BetTicketShareBitmapRenderer$renderOffscreen$1.invoke$lambda$10$lambda$3$lambda$2(((Integer) obj).intValue(), (MatchState) obj2);
                    return invoke$lambda$10$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function2 function2 = (Function2) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function2() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$10$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$5$lambda$4 = BetTicketShareBitmapRenderer$renderOffscreen$1.invoke$lambda$10$lambda$5$lambda$4(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return invoke$lambda$10$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function2 function22 = (Function2) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function3() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit invoke$lambda$10$lambda$7$lambda$6;
                    invoke$lambda$10$lambda$7$lambda$6 = BetTicketShareBitmapRenderer$renderOffscreen$1.invoke$lambda$10$lambda$7$lambda$6(((Long) obj).longValue(), ((Long) obj2).longValue(), ((Double) obj3).doubleValue());
                    return invoke$lambda$10$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function3 function3 = (Function3) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.utils.BetTicketShareBitmapRenderer$renderOffscreen$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        BetListDetailPagerItemKt.BetListDetailPagerItem(fillMaxWidth$default, betsListModel, oddType, function0, false, 0L, false, function2, null, null, function22, function3, (Function0) rememberedValue5, true, null, true, null, composer, 920349702, 1797558, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
