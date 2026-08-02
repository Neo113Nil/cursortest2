package org.betup.ui.fragment.competitions.details.compose;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;

/* compiled from: BetGroupCardCompetition.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetGroupCardCompetitionKt$BetGroupCardCompetition$1$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $betColumnSize;
    final /* synthetic */ List<MatchVarietyBetOptionModel> $bets;
    final /* synthetic */ boolean $isInBattle;
    final /* synthetic */ boolean $isInCompetition;
    final /* synthetic */ boolean $isLocked;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onBetClick;
    final /* synthetic */ Set<Long> $selectedBetIds;

    /* JADX WARN: Multi-variable type inference failed */
    BetGroupCardCompetitionKt$BetGroupCardCompetition$1$2(boolean z, List<MatchVarietyBetOptionModel> list, boolean z2, int i, Set<Long> set, OddType oddType, boolean z3, Function2<? super Integer, ? super Integer, Unit> function2) {
        this.$isInCompetition = z;
        this.$bets = list;
        this.$isInBattle = z2;
        this.$betColumnSize = i;
        this.$selectedBetIds = set;
        this.$oddType = oddType;
        this.$isLocked = z3;
        this.$onBetClick = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$9$lambda$8$lambda$7(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$13$lambda$12$lambda$11$lambda$10(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$22$lambda$21$lambda$20$lambda$19(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$26$lambda$25$lambda$24$lambda$23(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r72, androidx.compose.runtime.Composer r73, int r74) {
        /*
            Method dump skipped, instructions count: 4231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.ui.fragment.competitions.details.compose.BetGroupCardCompetitionKt$BetGroupCardCompetition$1$2.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28$lambda$27(Function2 function2, MatchVarietyBetOptionModel matchVarietyBetOptionModel, int i) {
        function2.invoke(Integer.valueOf(matchVarietyBetOptionModel.getBetTypeId()), Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
