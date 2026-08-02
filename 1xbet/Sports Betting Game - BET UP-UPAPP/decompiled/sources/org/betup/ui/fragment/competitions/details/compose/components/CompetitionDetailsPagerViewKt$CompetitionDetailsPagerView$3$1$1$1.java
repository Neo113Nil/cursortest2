package org.betup.ui.fragment.competitions.details.compose.components;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.ui.fragment.competitions.details.compose.CompetitionMatchPageKt;
import org.betup.utils.NavigationHelper;

/* compiled from: CompetitionDetailsPagerView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ CompetitionDetailsWithParticipantModel $competition;
    final /* synthetic */ Map<Long, Boolean> $expandedStates;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function3<Long, Long, Integer, Unit> $onBetClick;
    final /* synthetic */ Function1<Long, Unit> $onExpandToggle;
    final /* synthetic */ Map<Long, Long> $selectedBetsPerMatch;

    /* JADX WARN: Multi-variable type inference failed */
    CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1(CompetitionDetailsWithParticipantModel competitionDetailsWithParticipantModel, Map<Long, Long> map, Map<Long, Boolean> map2, Function3<? super Long, ? super Long, ? super Integer, Unit> function3, Function1<? super Long, Unit> function1, OddType oddType) {
        this.$competition = competitionDetailsWithParticipantModel;
        this.$selectedBetsPerMatch = map;
        this.$expandedStates = map2;
        this.$onBetClick = function3;
        this.$onExpandToggle = function1;
        this.$oddType = oddType;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(261600831, i2, -1, "org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompetitionDetailsPagerView.kt:136)");
        }
        CompetitionMatchWithBetsModel competitionMatchWithBetsModel = this.$competition.getMatches().get(i);
        Map<Long, Long> map = this.$selectedBetsPerMatch;
        Map<Long, Boolean> map2 = this.$expandedStates;
        Function3<Long, Long, Integer, Unit> function3 = this.$onBetClick;
        Function1<Long, Unit> function1 = this.$onExpandToggle;
        OddType oddType = this.$oddType;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$1$1.invoke$lambda$1$lambda$0(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CompetitionMatchPageKt.CompetitionMatchPage(null, competitionMatchWithBetsModel, map, map2, function3, function1, oddType, (Function2) rememberedValue, composer, 12582912, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(int i, boolean z) {
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }
}
